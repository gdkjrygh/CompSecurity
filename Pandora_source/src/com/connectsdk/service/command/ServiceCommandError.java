// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service.command;


public class ServiceCommandError extends Error
{

    private static final long serialVersionUID = 0x3abb93b590df52ecL;
    int code;
    Object payload;

    public ServiceCommandError(int i, String s, Object obj)
    {
        super(s);
        code = i;
        payload = obj;
    }

    public static ServiceCommandError getError(int i)
    {
        String s;
        if (i == 400)
        {
            s = "Bad Request";
        } else
        if (i == 401)
        {
            s = "Unauthorized";
        } else
        if (i == 500)
        {
            s = "Internal Server Error";
        } else
        if (i == 503)
        {
            s = "Service Unavailable";
        } else
        {
            s = "Unknown Error";
        }
        return new ServiceCommandError(i, s, null);
    }

    public static ServiceCommandError notSupported()
    {
        return new ServiceCommandError(503, "not supported", null);
    }

    public int getCode()
    {
        return code;
    }

    public Object getPayload()
    {
        return payload;
    }
}
