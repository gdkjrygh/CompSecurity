// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.reflection;


public class Error
{

    private int code;
    private String explaination;
    private String message;

    public Error()
    {
    }

    public int getCode()
    {
        return code;
    }

    public String getExplaination()
    {
        return explaination;
    }

    public String getMessage()
    {
        return message;
    }

    public void setCode(int i)
    {
        code = i;
    }

    public void setCode(String s)
    {
        setCode(Integer.parseInt(s));
    }

    public void setExplaination(String s)
    {
        explaination = s;
    }

    public void setMessage(String s)
    {
        message = s;
    }
}
