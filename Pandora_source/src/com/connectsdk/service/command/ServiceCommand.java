// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service.command;

import com.connectsdk.service.DeviceService;
import com.connectsdk.service.capability.listeners.ResponseListener;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.json.JSONObject;

public class ServiceCommand
{

    public static final String TYPE_DEL = "DELETE";
    public static final String TYPE_GET = "GET";
    public static final String TYPE_POST = "POST";
    public static final String TYPE_REQ = "request";
    public static final String TYPE_SUB = "subscribe";
    String httpMethod;
    Object payload;
    int requestId;
    ResponseListener responseListener;
    DeviceService service;
    String target;

    public ServiceCommand(DeviceService deviceservice, String s, Object obj, ResponseListener responselistener)
    {
        service = deviceservice;
        target = s;
        payload = obj;
        responseListener = responselistener;
        httpMethod = "POST";
    }

    public ServiceCommand(DeviceService deviceservice, String s, JSONObject jsonobject, boolean flag, ResponseListener responselistener)
    {
        service = deviceservice;
        target = s;
        payload = jsonobject;
        requestId = -1;
        httpMethod = "request";
        responseListener = responselistener;
    }

    public DeviceService getDeviceService()
    {
        return service;
    }

    public String getHttpMethod()
    {
        return httpMethod;
    }

    public Object getPayload()
    {
        return payload;
    }

    public HttpRequestBase getRequest()
    {
        if (httpMethod.equalsIgnoreCase("GET"))
        {
            return new HttpGet(target);
        }
        if (httpMethod.equalsIgnoreCase("POST"))
        {
            return new HttpPost(target);
        }
        if (httpMethod.equalsIgnoreCase("DELETE"))
        {
            return new HttpDelete(target);
        } else
        {
            return null;
        }
    }

    public int getRequestId()
    {
        return requestId;
    }

    public ResponseListener getResponseListener()
    {
        return responseListener;
    }

    public String getTarget()
    {
        return target;
    }

    public void send()
    {
        service.sendCommand(this);
    }

    public void setDeviceService(DeviceService deviceservice)
    {
        service = deviceservice;
    }

    public void setHttpMethod(String s)
    {
        httpMethod = s;
    }

    public void setPayload(Object obj)
    {
        payload = obj;
    }

    public void setRequestId(int i)
    {
        requestId = i;
    }

    public void setTarget(String s)
    {
        target = s;
    }
}
