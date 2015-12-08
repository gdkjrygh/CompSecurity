// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec;


public class DecoderException extends Exception
{

    private static final long serialVersionUID = 1L;

    public DecoderException()
    {
    }

    public DecoderException(String s)
    {
        super(s);
    }

    public DecoderException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public DecoderException(Throwable throwable)
    {
        super(throwable);
    }
}
