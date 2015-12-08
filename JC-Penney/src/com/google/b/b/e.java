// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import java.util.List;

public final class e
{

    private final byte a[];
    private final String b;
    private final List c;
    private final String d;
    private Integer e;
    private Integer f;
    private Object g;
    private final int h;
    private final int i;

    public e(byte abyte0[], String s, List list, String s1)
    {
        this(abyte0, s, list, s1, -1, -1);
    }

    public e(byte abyte0[], String s, List list, String s1, int j, int k)
    {
        a = abyte0;
        b = s;
        c = list;
        d = s1;
        h = k;
        i = j;
    }

    public void a(Integer integer)
    {
        e = integer;
    }

    public void a(Object obj)
    {
        g = obj;
    }

    public byte[] a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public void b(Integer integer)
    {
        f = integer;
    }

    public List c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public Object e()
    {
        return g;
    }

    public boolean f()
    {
        return h >= 0 && i >= 0;
    }

    public int g()
    {
        return h;
    }

    public int h()
    {
        return i;
    }
}
