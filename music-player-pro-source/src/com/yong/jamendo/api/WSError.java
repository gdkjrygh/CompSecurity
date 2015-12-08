// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.jamendo.api;


public class WSError extends Throwable
{

    private static final long serialVersionUID = 1L;
    private String message;

    public WSError()
    {
    }

    public WSError(String s)
    {
        message = s;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String s)
    {
        message = s;
    }
}
