// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.e;

import com.facebook.common.h.a;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class g
{

    private String a;
    private String b;
    private String c;
    private long d;
    private long e;
    private long f;
    private double g;
    private boolean h;
    private Set i;
    private Map j;

    public g(String s)
    {
        d = 0L;
        e = -1L;
        f = -1L;
        g = 1.0D;
        b = s;
        a = com.facebook.common.h.a.a().toString();
    }

    public g a(Map map)
    {
        j = map;
        return this;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public double c()
    {
        return g;
    }

    public long d()
    {
        return e;
    }

    public long e()
    {
        return f;
    }

    public String f()
    {
        return a;
    }

    public long g()
    {
        return d;
    }

    public boolean h()
    {
        return h;
    }

    public Set i()
    {
        return i;
    }

    public Map j()
    {
        return j;
    }
}
