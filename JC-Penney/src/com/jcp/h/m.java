// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.h;


public final class m
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    private m()
    {
    }

    public static m a(String s, int i, String s1)
    {
        m m1 = new m();
        double d1 = i / 1000;
        m1.f(s1);
        m1.e(String.valueOf(d1));
        m1.c("Video");
        m1.d(s);
        return m1;
    }

    private void e(String s)
    {
        b = s;
    }

    private void f(String s)
    {
        d = s;
    }

    public String a()
    {
        return b;
    }

    public void a(String s)
    {
        a = s;
    }

    public String b()
    {
        return c;
    }

    public void b(String s)
    {
        c = s;
    }

    public String c()
    {
        return a;
    }

    public void c(String s)
    {
        e = s;
    }

    public String d()
    {
        return d;
    }

    public void d(String s)
    {
        f = s;
    }

    public String e()
    {
        return e;
    }

    public String f()
    {
        return f;
    }
}
