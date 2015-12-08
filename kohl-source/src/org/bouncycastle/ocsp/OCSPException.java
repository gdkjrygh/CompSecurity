// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;


public class OCSPException extends Exception
{

    Exception e;

    public OCSPException(String s)
    {
        super(s);
    }

    public OCSPException(String s, Exception exception)
    {
        super(s);
        e = exception;
    }

    public Throwable getCause()
    {
        return e;
    }

    public Exception getUnderlyingException()
    {
        return e;
    }
}
