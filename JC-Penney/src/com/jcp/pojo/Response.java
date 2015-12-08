// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.pojo;


public class Response
{

    private String errorMsg;
    private String optionalMsg;
    private int reJcpRequestTypes;
    private String responseBody;
    private int statusCode;

    public Response()
    {
    }

    public String getErrorMsg()
    {
        return errorMsg;
    }

    public String getOptionalMsg()
    {
        return optionalMsg;
    }

    public int getReJcpRequestTypes()
    {
        return reJcpRequestTypes;
    }

    public String getResponseBody()
    {
        return responseBody;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public void setErrorMsg(String s)
    {
        errorMsg = s;
    }

    public void setOptionalMsg(String s)
    {
        optionalMsg = s;
    }

    public void setReJcpRequestTypes(int i)
    {
        reJcpRequestTypes = i;
    }

    public void setResponseBoday(String s)
    {
        responseBody = s;
    }

    public void setStatusCode(int i)
    {
        statusCode = i;
    }
}
