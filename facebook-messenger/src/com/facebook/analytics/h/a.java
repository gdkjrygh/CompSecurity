// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.h;

import com.facebook.analytics.cb;
import com.facebook.common.w.n;
import java.util.ArrayList;
import java.util.Random;

public class a
{

    private static final Random i = new Random();
    private long a;
    private long b;
    private long c;
    private long d;
    private int e;
    private String f;
    private ArrayList g;
    private boolean h;

    public a(long l)
    {
        h = false;
        g = new ArrayList(10);
        d = 0L;
        e = 0;
        f = e();
        c = l;
        b = l;
        a = l;
    }

    private boolean b(long l)
    {
        if (g.size() < 1)
        {
            g.add(Long.valueOf(c));
            g.add(Long.valueOf(b - c));
        } else
        {
            g.add(Long.valueOf(c - a));
            g.add(Long.valueOf(b - c));
        }
        a = b;
        d = d + (b - c);
        b = l;
        c = l;
        return g.size() >= 10;
    }

    private String e()
    {
        return Integer.toHexString(i.nextInt());
    }

    private void f()
    {
        e = e + 1;
        g.clear();
    }

    public void a()
    {
        d = 0L;
        e = 0;
        f = e();
    }

    public boolean a(long l)
    {
        if (l - b > 10000L)
        {
            return b(l);
        } else
        {
            b = l;
            return false;
        }
    }

    public cb b()
    {
        if (g.size() > 0)
        {
            cb cb1 = (new cb("time_spent")).b("tos_array", n.a(g.toString(), new Object[0])).a("tos_sum", d).a("tos_seq", e).b("tos_id", f);
            if (h)
            {
                cb1.b("trigger", "clock_change");
                h = false;
            }
            f();
            return cb1;
        } else
        {
            h = false;
            return null;
        }
    }

    public void c()
    {
        if (b != a)
        {
            b(b);
        }
    }

    public void d()
    {
        c();
        h = true;
    }

}
