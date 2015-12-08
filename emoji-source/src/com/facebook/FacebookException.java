// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public class FacebookException extends RuntimeException
{

    static final long serialVersionUID = 1L;

    public FacebookException()
    {
    }

    public FacebookException(String s)
    {
        super(s);
    }

    public FacebookException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public FacebookException(Throwable throwable)
    {
        super(throwable);
    }
}
