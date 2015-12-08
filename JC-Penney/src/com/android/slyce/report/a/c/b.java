// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.a.c;


public class b extends Exception
{

    private int a;

    public b(int i)
    {
        a = i;
    }

    public b(int i, String s)
    {
        super(s);
        a = i;
    }

    public b(int i, Throwable throwable)
    {
        super(throwable);
        a = i;
    }

    public int a()
    {
        return a;
    }
}
