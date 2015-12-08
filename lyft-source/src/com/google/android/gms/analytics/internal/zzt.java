// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzns;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzf, zzaf

abstract class zzt
{

    private static volatile Handler b;
    private final zzf a;
    private final Runnable c = new Runnable() {

        final zzt a;

        public void run()
        {
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                zzt.a(a).h().a(this);
            } else
            {
                boolean flag = a.c();
                zzt.a(a, 0L);
                if (flag && !zzt.b(a))
                {
                    a.a();
                    return;
                }
            }
        }

            
            {
                a = zzt.this;
                super();
            }
    };
    private volatile long d;
    private boolean e;

    zzt(zzf zzf1)
    {
        zzu.a(zzf1);
        a = zzf1;
    }

    static long a(zzt zzt1, long l)
    {
        zzt1.d = l;
        return l;
    }

    static zzf a(zzt zzt1)
    {
        return zzt1.a;
    }

    static boolean b(zzt zzt1)
    {
        return zzt1.e;
    }

    private Handler e()
    {
        if (b != null)
        {
            return b;
        }
        com/google/android/gms/analytics/internal/zzt;
        JVM INSTR monitorenter ;
        Handler handler;
        if (b == null)
        {
            b = new Handler(a.b().getMainLooper());
        }
        handler = b;
        com/google/android/gms/analytics/internal/zzt;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        com/google/android/gms/analytics/internal/zzt;
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
