// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json.rpc2;

import com.google.api.client.util.GenericData;

public class JsonRpcRequest extends GenericData
{

    private Object id;
    private final String jsonrpc = "2.0";
    private String method;
    private Object params;

    public JsonRpcRequest()
    {
    }

    public JsonRpcRequest clone()
    {
        return (JsonRpcRequest)super.clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public Object getId()
    {
        return id;
    }

    public String getMethod()
    {
        return method;
    }

    public Object getParameters()
    {
        return params;
    }

    public String getVersion()
    {
        return "2.0";
    }

    public JsonRpcRequest set(String s, Object obj)
    {
        return (JsonRpcRequest)super.set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public void setId(Object obj)
    {
        id = obj;
    }

    public void setMethod(String s)
    {
        method = s;
    }

    public void setParameters(Object obj)
    {
        params = obj;
    }
}
