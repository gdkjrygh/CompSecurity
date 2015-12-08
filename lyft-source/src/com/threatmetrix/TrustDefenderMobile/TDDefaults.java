// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;


class TDDefaults
{

    private long a;
    private long b;
    private String c;

    TDDefaults()
    {
        a = 0L;
        b = 0L;
        c = "";
    }

    public long a()
    {
        return a;
    }

    public void a(long l)
    {
        a = l;
    }

    public void a(String s)
    {
        c = s;
    }

    public boolean a(long l, long l1, String s)
    {
        return l != a || l1 != b || !s.equals(c);
    }

    public long b()
    {
        return b;
    }

    public void b(long l)
    {
        b = l;
    }

    public String c()
    {
        return c;
    }
}
