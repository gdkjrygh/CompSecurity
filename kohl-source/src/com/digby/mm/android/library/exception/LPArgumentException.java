// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.exception;


public class LPArgumentException extends RuntimeException
{

    private static final long serialVersionUID = 0x77234cce471780b1L;

    public LPArgumentException()
    {
    }

    public LPArgumentException(String s)
    {
        super(s);
    }

    public LPArgumentException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public LPArgumentException(Throwable throwable)
    {
        super(throwable);
    }
}
