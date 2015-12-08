// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public class l extends RuntimeException
{

    public l()
    {
    }

    public l(String s)
    {
        super(s);
    }

    public l(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public transient l(String s, Object aobj[])
    {
        this(String.format(s, aobj));
    }

    public l(Throwable throwable)
    {
        super(throwable);
    }

    public String toString()
    {
        return getMessage();
    }
}
