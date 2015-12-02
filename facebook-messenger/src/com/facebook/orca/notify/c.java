// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;


public class c
{

    private boolean a;
    private boolean b;
    private long c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;

    public c()
    {
    }

    public long a()
    {
        return c;
    }

    public void a(long l1)
    {
        c = l1;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public void b(boolean flag)
    {
        a = flag;
    }

    public boolean b()
    {
        return d;
    }

    public void c()
    {
        d = true;
    }

    public boolean d()
    {
        return e;
    }

    public void e()
    {
        e = true;
    }

    public boolean f()
    {
        return g;
    }

    public void g()
    {
        g = true;
    }

    public boolean h()
    {
        return h;
    }

    public void i()
    {
        h = true;
    }

    public boolean j()
    {
        return i;
    }

    public void k()
    {
        i = true;
    }

    public boolean l()
    {
        return f;
    }

    public void m()
    {
        f = true;
    }

    public boolean n()
    {
        return d || e || i || h || g || f;
    }

    public boolean o()
    {
        return b;
    }

    public boolean p()
    {
        return a;
    }
}
