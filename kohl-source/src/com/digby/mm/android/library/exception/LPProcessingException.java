// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.exception;


public class LPProcessingException extends RuntimeException
{

    private static final long serialVersionUID = 0x630609edbb697d8aL;

    public LPProcessingException()
    {
    }

    public LPProcessingException(String s)
    {
        super(s);
    }

    public LPProcessingException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public LPProcessingException(Throwable throwable)
    {
        super(throwable);
    }
}
