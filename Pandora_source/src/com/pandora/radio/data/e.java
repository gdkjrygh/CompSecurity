// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;


public class e
{

    private String a;
    private String b;
    private String c;
    private long d;
    private boolean e;

    public e()
    {
        a = null;
        b = null;
        c = null;
        d = 0L;
        e = false;
    }

    public e(String s, String s1, String s2, long l, boolean flag)
    {
        a = null;
        b = null;
        c = null;
        d = 0L;
        e = false;
        c = s;
        b = s1;
        a = s2;
        d = l;
        e = flag;
    }

    private boolean d(String s)
    {
        if (b == null)
        {
            return s == null;
        } else
        {
            return b.equals(s);
        }
    }

    private boolean e(String s)
    {
        if (a == null)
        {
            return s == null;
        } else
        {
            return a.equals(s);
        }
    }

    private boolean f(String s)
    {
        if (c == null)
        {
            return s == null;
        } else
        {
            return c.equals(s);
        }
    }

    public String a()
    {
        return a;
    }

    public void a(long l)
    {
        d = l;
    }

    public void a(String s)
    {
        a = s;
    }

    public void a(boolean flag)
    {
        e = flag;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        b = s;
    }

    public String c()
    {
        return c;
    }

    public void c(String s)
    {
        c = s;
    }

    public long d()
    {
        return d;
    }

    public boolean e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof e))
        {
            obj = (e)obj;
            if (f(((e) (obj)).c()) && e(((e) (obj)).a()) && d(((e) (obj)).b()))
            {
                return true;
            }
        }
        return false;
    }
}
