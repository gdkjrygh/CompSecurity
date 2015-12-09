// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public abstract class gn
{

    private long a;
    private boolean b;
    private int c;
    private String d;
    private String e;

    protected gn()
    {
    }

    public void a(int j)
    {
        c = j;
    }

    public void a(long l)
    {
        a = l;
    }

    public void a(String s)
    {
        d = s;
        e = s;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public void b(String s)
    {
        d = s;
    }

    public void c(String s)
    {
        e = s;
    }

    public long d()
    {
        return a;
    }

    public boolean e()
    {
        return b;
    }

    public int f()
    {
        return c;
    }

    public String g()
    {
        return d;
    }

    public String h()
    {
        return e;
    }

    public void i()
    {
        c = c + 1;
    }
}
