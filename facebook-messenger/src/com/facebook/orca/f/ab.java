// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import android.location.Location;

class ab
{

    private final String a;
    private long b;
    private long c;
    private boolean d;
    private Location e;
    private long f;
    private long g;

    ab(String s)
    {
        b = -1L;
        c = -1L;
        a = s;
    }

    public void a(long l)
    {
        b = l;
        if (l > c)
        {
            c = -1L;
        }
    }

    public void a(Location location, long l)
    {
        e = location;
        f = l;
    }

    public boolean a()
    {
        return d;
    }

    public void b()
    {
        d = true;
    }

    public void b(long l)
    {
        if (l <= b)
        {
            c = -1L;
            return;
        } else
        {
            c = l;
            return;
        }
    }

    public void c()
    {
        d = false;
    }

    public void c(long l)
    {
        g = l;
    }

    public long d()
    {
        return b;
    }

    public long e()
    {
        return c;
    }

    public long f()
    {
        if (c > -1L)
        {
            return c;
        } else
        {
            return b;
        }
    }

    public long g()
    {
        return g;
    }
}
