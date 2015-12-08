// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.je;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            s, g

abstract class ag
{

    private static volatile Handler b;
    private final s a;
    private final Runnable c = new Runnable() {

        final ag a;

        public final void run()
        {
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                ag.a(a).g().a(this);
            } else
            {
                boolean flag = a.c();
                ag.b(a);
                if (flag && !ag.c(a))
                {
                    a.a();
                    return;
                }
            }
        }

            
            {
                a = ag.this;
                super();
            }
    };
    private volatile long d;
    private boolean e;

    ag(s s1)
    {
        y.a(s1);
        a = s1;
    }

    static s a(ag ag1)
    {
        return ag1.a;
    }

    static long b(ag ag1)
    {
        ag1.d = 0L;
        return 0L;
    }

    static boolean c(ag ag1)
    {
        return ag1.e;
    }

    private Handler e()
    {
        if (b != null)
        {
            return b;
        }
        com/google/android/gms/analytics/internal/ag;
        JVM INSTR monitorenter ;
        Handler handler;
        if (b == null)
        {
            b = new Handler(a.a().getMainLooper());
        }
        handler = b;
        com/google/android/gms/analytics/internal/ag;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        com/google/android/gms/analytics/internal/ag;
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
