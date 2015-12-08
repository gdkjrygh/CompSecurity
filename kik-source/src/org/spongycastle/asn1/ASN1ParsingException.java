// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;


public class ASN1ParsingException extends IllegalStateException
{

    private Throwable a;

    public ASN1ParsingException(String s)
    {
        super(s);
    }

    public ASN1ParsingException(String s, Throwable throwable)
    {
        super(s);
        a = throwable;
    }

    public Throwable getCause()
    {
        return a;
    }
}
