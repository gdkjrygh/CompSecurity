// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public abstract class kn
{

    private long a;
    private boolean b;
    private int c;
    private String d;
    private String e;
    private int f;

    protected kn()
    {
    }

    public void a(long l)
    {
        a = l;
    }

    public void a(String s1)
    {
        d = s1;
        e = s1;
    }

    public void a_()
    {
        c = c + 1;
    }

    public void b(int i)
    {
        c = i;
    }

    public void b(String s1)
    {
        d = s1;
    }

    public void b(boolean flag)
    {
        b = flag;
    }

    public void c(int i)
    {
        f = i;
    }

    public void c(String s1)
    {
        e = s1;
    }

    public int d()
    {
        return f;
    }

    public long p()
    {
        return a;
    }

    public boolean q()
    {
        return b;
    }

    public int r()
    {
        return c;
    }

    public String s()
    {
        return d;
    }

    public String t()
    {
        return e;
    }
}
