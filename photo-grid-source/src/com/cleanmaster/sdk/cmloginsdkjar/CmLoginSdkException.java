// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;


public class CmLoginSdkException extends RuntimeException
{

    static final long serialVersionUID = 1L;
    private int ExceptionRet;

    public CmLoginSdkException()
    {
    }

    public CmLoginSdkException(String s)
    {
        super(s);
    }

    public CmLoginSdkException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public CmLoginSdkException(Throwable throwable)
    {
        super(throwable);
    }

    public int getExceptionRet()
    {
        return ExceptionRet;
    }

    public void setExceptionRet(int i)
    {
        ExceptionRet = i;
    }
}
