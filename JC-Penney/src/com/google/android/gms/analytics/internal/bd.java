// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.d.q;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            be, ab, j

abstract class bd
{

    private static volatile Handler b;
    private final ab a;
    private final Runnable c = new be(this);
    private volatile long d;
    private boolean e;

    bd(ab ab1)
    {
        u.a(ab1);
        a = ab1;
    }

    static long a(bd bd1, long l)
    {
        bd1.d = l;
        return l;
    }

    static ab a(bd bd1)
    {
        return bd1.a;
    }

    static boolean b(bd bd1)
    {
        return bd1.e;
    }

    private Handler e()
    {
        if (b != null)
        {
            return b;
        }
        com/google/android/gms/analytics/internal/bd;
        JVM INSTR monitorenter ;
        Handler handler;
        if (b == null)
        {
            b = new Handler(a.b().getMainLooper());
        }
        handler = b;
        com/google/android/gms/analytics/internal/bd;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        com/google/android/gms/analytics/internal/bd;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public abstract void a();

    public void a(long l)
    {
        d();
        if (l >= 0L)
        {
            d = a.d().a();
            if (!e().postDelayed(c, l))
            {
                a.f().e("Failed to schedule delayed post. time", Long.valueOf(l));
            }
        }
    }

    public long b()
    {
        if (d == 0L)
        {
            return 0L;
        } else
        {
            return Math.abs(a.d().a() - d);
        }
    }

    public void b(long l)
    {
        long l1 = 0L;
        if (c())
        {
            if (l < 0L)
            {
                d();
                return;
            }
            l -= Math.abs(a.d().a() - d);
            if (l < 0L)
            {
                l = l1;
            }
            e().removeCallbacks(c);
            if (!e().postDelayed(c, l))
            {
                a.f().e("Failed to adjust delayed post. time", Long.valueOf(l));
                return;
            }
        }
    }

    public boolean c()
    {
        return d != 0L;
    }

    public void d()
    {
        d = 0L;
        e().removeCallbacks(c);
    }
}
