// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http;


public class HttpException extends Exception
{

    private static final long serialVersionUID = 0xb48ad5067ed58164L;

    public HttpException()
    {
    }

    public HttpException(String s)
    {
        super(s);
    }

    public HttpException(String s, Throwable throwable)
    {
        super(s);
        initCause(throwable);
    }
}
