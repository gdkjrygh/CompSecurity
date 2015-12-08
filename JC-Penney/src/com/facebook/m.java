// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public class m extends RuntimeException
{

    public m()
    {
    }

    public m(String s)
    {
        super(s);
    }

    public m(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public m(Throwable throwable)
    {
        super(throwable);
    }

    public String toString()
    {
        return getMessage();
    }
}
