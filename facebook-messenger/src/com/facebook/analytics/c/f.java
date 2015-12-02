// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.c;


public class f
{

    private final String a;
    private final String b;
    private long c;
    private long d;
    private boolean e;
    private long f;
    private long g;

    public f(String s, String s1, long l, long l1, long l2)
    {
        e = false;
        f = 0L;
        g = 0L;
        a = s;
        b = s1;
        d = l;
        c = l1;
        f = l2;
    }

    public String a()
    {
        return a;
    }

    public void a(long l)
    {
        c = l;
    }

    void a(boolean flag)
    {
        e = flag;
    }

    public long b()
    {
        return f;
    }

    public void b(long l)
    {
        d = l;
    }

    void c(long l)
    {
        g = l;
    }

    public boolean c()
    {
        return e;
    }

    public boolean d()
    {
        return a != null;
    }

    public String e()
    {
        return b;
    }

    public long f()
    {
        return c;
    }

    public long g()
    {
        return d;
    }

    public long h()
    {
        return g;
    }

    public void i()
    {
        g = g + 1L;
    }

    public String j()
    {
        return (new StringBuilder()).append(a()).append("_").append(Long.toString(b())).toString();
    }

    void k()
    {
        f = f + 1L;
    }
}
