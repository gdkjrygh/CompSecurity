// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzkk;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zze, zzae

abstract class h
{

    private static volatile Handler b;
    private final zze a;
    private final Runnable c = new Runnable() {

        final h a;

        public void run()
        {
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                h.a(a).zzgJ().zze(this);
            } else
            {
                boolean flag = a.c();
                h.a(a, 0L);
                if (flag && !h.b(a))
                {
                    a.a();
                    return;
                }
            }
        }

            
            {
                a = h.this;
                super();
            }
    };
    private volatile long d;
    private boolean e;

    h(zze zze1)
    {
        zzv.zzr(zze1);
        a = zze1;
    }

    static long a(h h1, long l)
    {
        h1.d = l;
        return l;
    }

    static zze a(h h1)
    {
        return h1.a;
    }

    static boolean b(h h1)
    {
        return h1.e;
    }

    private Handler e()
    {
        if (b != null)
        {
            return b;
        }
        com/google/android/gms/analytics/internal/h;
        JVM INSTR monitorenter ;
        Handler handler;
        if (b == null)
        {
            b = new Handler(a.getContext().getMainLooper());
        }
        handler = b;
        com/google/android/gms/analytics/internal/h;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        com/google/android/gms/analytics/internal/h;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public abstract void a();

    public void a(long l)
    {
        d();
        if (l >= 0L)
        {
            d = a.zzgG().currentTimeMillis();
            if (!e().postDelayed(c, l))
            {
                a.zzgH().zze("Failed to schedule delayed post. time", Long.valueOf(l));
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
            return Math.abs(a.zzgG().currentTimeMillis() - d);
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
            l -= Math.abs(a.zzgG().currentTimeMillis() - d);
            if (l < 0L)
            {
                l = l1;
            }
            e().removeCallbacks(c);
            if (!e().postDelayed(c, l))
            {
                a.zzgH().zze("Failed to adjust delayed post. time", Long.valueOf(l));
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
