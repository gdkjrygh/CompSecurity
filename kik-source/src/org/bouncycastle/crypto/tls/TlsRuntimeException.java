// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;


public class TlsRuntimeException extends RuntimeException
{

    Throwable a;

    public TlsRuntimeException(String s)
    {
        super(s);
    }

    public TlsRuntimeException(String s, Throwable throwable)
    {
        super(s);
        a = throwable;
    }

    public Throwable getCause()
    {
        return a;
    }
}
