// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.wg;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            bc, aa, j

abstract class bb
{

    private static volatile Handler b;
    private final aa a;
    private final Runnable c = new bc(this);
    private volatile long d;
    private boolean e;

    bb(aa aa1)
    {
        bl.a(aa1);
        a = aa1;
    }

    static aa a(bb bb1)
    {
        return bb1.a;
    }

    static long b(bb bb1)
    {
        bb1.d = 0L;
        return 0L;
    }

    static boolean c(bb bb1)
    {
        return bb1.e;
    }

    private Handler e()
    {
        if (b != null)
        {
            return b;
        }
        com/google/android/gms/analytics/internal/bb;
        JVM INSTR monitorenter ;
        Handler handler;
        if (b == null)
        {
            b = new Handler(a.a().getMainLooper());
        }
        handler = b;
        com/google/android/gms/analytics/internal/bb;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        com/google/android/gms/analytics/internal/bb;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public abstract void a();

    public final void a(long l)
    {
        d();
        if (l >= 0L)
        {
            d = a.c().a();
            if (!e().postDelayed(c, l))
            {
                a.e().e("Failed to schedule delayed post. time", Long.valueOf(l));
            }
        }
    }

    public final long b()
    {
        if (d == 0L)
        {
            return 0L;
        } else
        {
            return Math.abs(a.c().a() - d);
        }
    }

    public final void b(long l)
    {
        long l1 = 0L;
        if (c())
        {
            if (l < 0L)
            {
                d();
                return;
            }
            l -= Math.abs(a.c().a() - d);
            if (l < 0L)
            {
                l = l1;
            }
            e().removeCallbacks(c);
            if (!e().postDelayed(c, l))
            {
                a.e().e("Failed to adjust delayed post. time", Long.valueOf(l));
                return;
            }
        }
    }

    public final boolean c()
    {
        return d != 0L;
    }

    public final void d()
    {
        d = 0L;
        e().removeCallbacks(c);
    }
}
