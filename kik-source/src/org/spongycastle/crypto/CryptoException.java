// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto;


public class CryptoException extends Exception
{

    private Throwable a;

    public CryptoException()
    {
    }

    public CryptoException(String s)
    {
        super(s);
    }

    public Throwable getCause()
    {
        return a;
    }
}
