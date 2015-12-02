// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.e;

import android.content.Context;
import com.facebook.common.w.m;
import com.facebook.e.a.b;
import com.facebook.e.a.e;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.debug.e:
//            b

public class a
{

    private static long a = -1L;
    private final com.facebook.common.time.a b;
    private final e c;
    private long d;
    private b e;
    private double f;
    private String g;

    public a(Context context, com.facebook.common.time.a a1)
    {
        f = 0.0D;
        b = a1;
        c = (e)t.a(context).a(com/facebook/e/a/e);
        d = a1.a();
        e = c.c();
        if (a == -1L)
        {
            a = e.e();
        }
        c();
    }

    private static int a(double d1)
    {
        if (d1 < 10D)
        {
            return 0xff00ff00;
        }
        return d1 >= 30D ? 0xffff0000 : -256;
    }

    private static String a(long l, double d1)
    {
        return m.a("net: %d kb, %.2f kb/s", new Object[] {
            Long.valueOf(l), Double.valueOf(d1)
        });
    }

    private String b()
    {
        if (b.a() - d > 1000L)
        {
            c();
        }
        return g;
    }

    private void c()
    {
        long l = b.a();
        b b1 = c.c();
        double d1 = (double)(l - d) * 0.001D;
        if (d1 > 0.0D)
        {
            f = (int)((double)(b1.e() - e.e()) / d1 / 1024D);
        }
        g = a((b1.e() - a) / 1024L, f);
        d = l;
        e = b1;
    }

    public com.facebook.debug.e.b a()
    {
        return new com.facebook.debug.e.b(b(), a(f));
    }

}
