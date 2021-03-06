package com.xiaohao.dubbodemo.consumer.webServiceClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.15
 * 2014-09-04T11:28:03.136+08:00
 * Generated source version: 2.6.15
 * 
 */
@WebService(targetNamespace = "http://service.dubbodemo.xiaohao.com/", name = "IDubboWebServiceDemoServicePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface IDubboWebServiceDemoServicePortType {

    @WebResult(name = "return", targetNamespace = "http://service.dubbodemo.xiaohao.com/")
    @RequestWrapper(localName = "webServiceSayHello", targetNamespace = "http://service.dubbodemo.xiaohao.com/", className = "com.xiaohao.dubbodemo.consumer.webServiceClient.WebServiceSayHello")
    @WebMethod
    @ResponseWrapper(localName = "webServiceSayHelloResponse", targetNamespace = "http://service.dubbodemo.xiaohao.com/", className = "com.xiaohao.dubbodemo.consumer.webServiceClient.WebServiceSayHelloResponse")
    public java.lang.String webServiceSayHello(
        @WebParam(name = "arg0", targetNamespace = "http://service.dubbodemo.xiaohao.com/")
        java.lang.String arg0
    );
}
