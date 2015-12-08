// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.f.a;


final class d
{

    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private int e;

    d(int i, int j, int k, int l)
    {
        e = -1;
        a = i;
        b = j;
        c = k;
        d = l;
    }

    boolean a()
    {
        return a(e);
    }

    boolean a(int i)
    {
        return i != -1 && c == (i % 3) * 3;
    }

    void b()
    {
        e = (d / 30) * 3 + c / 3;
    }

    void b(int i)
    {
        e = i;
    }

    int c()
    {
        return b - a;
    }

    int d()
    {
        return a;
    }

    int e()
    {
        return b;
    }

    int f()
    {
        return c;
    }

    int g()
    {
        return d;
    }

    int h()
    {
        return e;
    }

    public String toString()
    {
        return (new StringBuilder()).append(e).append("|").append(d).toString();
    }
}
