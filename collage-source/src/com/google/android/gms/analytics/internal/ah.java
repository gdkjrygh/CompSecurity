// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ix;
import com.google.android.gms.internal.zzof;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            t, g

abstract class ah
{

    private static volatile Handler b;
    private final t a;
    private final Runnable c = new zzt._cls1();
    private volatile long d;
    private boolean e;

    ah(t t1)
    {
        z.a(t1);
        a = t1;
    }

    static long a(ah ah1, long l)
    {
        ah1.d = l;
        return l;
    }

    static t a(ah ah1)
    {
        return ah1.a;
    }

    static boolean b(ah ah1)
    {
        return ah1.e;
    }

    private Handler e()
    {
        if (b != null)
        {
            return b;
        }
        com/google/android/gms/analytics/internal/ah;
        JVM INSTR monitorenter ;
        Handler handler;
        if (b == null)
        {
            b = new Handler(a.b().getMainLooper());
        }
        handler = b;
        com/google/android/gms/analytics/internal/ah;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        com/google/android/gms/analytics/internal/ah;
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

    // Unreferenced inner class com/google/android/gms/analytics/internal/zzt$1

/* anonymous class */
    class zzt._cls1
        implements Runnable
    {

        final ah a;

        public void run()
        {
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                ah.a(a).h().a(this);
            } else
            {
                boolean flag = a.c();
                ah.a(a, 0L);
                if (flag && !ah.b(a))
                {
                    a.a();
                    return;
                }
            }
        }

            
            {
                a = ah.this;
                super();
            }
    }

}
