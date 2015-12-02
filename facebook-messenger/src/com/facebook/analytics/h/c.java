// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.h;

import com.facebook.analytics.cb;
import java.util.Arrays;
import java.util.Random;

// Referenced classes of package com.facebook.analytics.h:
//            e, d

public class c
{

    private static final Random a = new Random();
    private long b;
    private long c;
    private String d;
    private int e[];
    private int f;
    private int g;
    private int h;

    public c()
    {
        h = 1;
        h = (int)Math.ceil(2D);
        d = a();
        f = -1;
        g = 0;
        e = null;
    }

    private String a()
    {
        return Integer.toString(Math.abs(a.nextInt()), 36);
    }

    private void a(long l)
    {
        int i = 1;
        c = l;
        b = l;
        e = new int[h];
        e[0] = 1;
        for (; i < h; i++)
        {
            e[i] = 0;
        }

        f = f + 1;
        g = g + 1;
    }

    private cb b(long l)
    {
        long l1 = l - b;
        cb cb1 = null;
        if (l1 < 0L || l1 >= 64L)
        {
            cb1 = c(l, e.USER_ACTION);
        }
        if (e == null)
        {
            a(l);
            return cb1;
        } else
        {
            int ai[] = e;
            int i = (int)l1 >> 5;
            int j = ai[i];
            ai[i] = 1 << ((int)l1 & 0x1f) | j;
            c = l;
            g = g + 1;
            return cb1;
        }
    }

    private cb b(long l, e e1)
    {
        cb cb1;
        if (e == null)
        {
            cb1 = null;
        } else
        {
            cb cb2;
            int i;
            if (l > c)
            {
                i = (int)Math.min(64L, (l - b) + 1L);
            } else
            {
                i = (int)((c - b) + 1L);
            }
            cb2 = (new cb("time_spent_bit_array")).b("tos_id", d).a("start_time", b).b("tos_array", Arrays.toString(e)).a("tos_len", i).a("tos_seq", f).a("tos_cum", g);
            cb1 = cb2;
            if (e1 == e.CLOCK_CHANGE)
            {
                cb2.b("trigger", "clock_change");
                return cb2;
            }
        }
        return cb1;
    }

    private void b()
    {
        e = null;
        c = 0L;
    }

    private cb c(long l, e e1)
    {
        e1 = b(l, e1);
        b();
        return e1;
    }

    public cb a(long l, e e1)
    {
        d.a[e1.ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 42
    //                   2 63
    //                   3 63
    //                   4 63;
           goto _L1 _L2 _L3 _L3 _L3
_L1:
        return null;
_L2:
        if ((l /= 1000L) > c)
        {
            return b(l);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (e != null)
        {
            return c(l / 1000L, e1);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

}
