// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public class p extends RuntimeException
{

    public p()
    {
    }

    public p(String s)
    {
        super(s);
    }

    public p(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public transient p(String s, Object aobj[])
    {
        this(String.format(s, aobj));
    }

    public p(Throwable throwable)
    {
        super(throwable);
    }

    public String toString()
    {
        return getMessage();
    }
}
