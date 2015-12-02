// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e.a;

import com.facebook.common.w.m;
import java.text.DecimalFormat;

public class b
{

    private static DecimalFormat a = new DecimalFormat("##0.0");
    private long b;
    private long c;
    private long d;
    private long e;

    public b(long l, long l1, long l2, long l3)
    {
        b = l;
        c = l1;
        d = l2;
        e = l3;
    }

    public b(b b1)
    {
        b = b1.a();
        c = b1.b();
        d = b1.c();
        e = b1.d();
    }

    public long a()
    {
        return b;
    }

    void a(long l)
    {
        b = b + l;
    }

    public long b()
    {
        return c;
    }

    void b(long l)
    {
        c = c + l;
    }

    public long c()
    {
        return d;
    }

    void c(long l)
    {
        d = d + l;
    }

    public long d()
    {
        return e;
    }

    void d(long l)
    {
        e = e + l;
    }

    public long e()
    {
        return b + c + d + e;
    }

    String e(long l)
    {
        if (l < 1024L)
        {
            return (new StringBuilder()).append(l).append("B").toString();
        }
        if (l < 0x100000L)
        {
            return m.a("%sKB", new Object[] {
                a.format((double)l / 1024D)
            });
        } else
        {
            return m.a("%sMB", new Object[] {
                a.format((double)l / 1048576D)
            });
        }
    }

    public String toString()
    {
        return m.a("Wifi received: %s, Wifi sent: %s, Cell received: %s, Cell sent: %s, Total: %s", new Object[] {
            e(b), e(c), e(d), e(e), e(e())
        });
    }

}
