// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ef;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            ac, w, ab

abstract class l
{

    private static volatile Handler c;
    private final ac a;
    volatile long b;
    private final Runnable d = new Runnable() {

        final l a;

        public final void run()
        {
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                l.a(a).f().a(this);
            } else
            {
                boolean flag;
                if (a.b != 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                l.b(a);
                if (flag && l.c(a))
                {
                    a.a();
                    return;
                }
            }
        }

            
            {
                a = l.this;
                super();
            }
    };
    private boolean e;

    l(ac ac1)
    {
        u.a(ac1);
        a = ac1;
        e = true;
    }

    static ac a(l l1)
    {
        return l1.a;
    }

    static long b(l l1)
    {
        l1.b = 0L;
        return 0L;
    }

    private Handler c()
    {
        if (c != null)
        {
            return c;
        }
        com/google/android/gms/measurement/internal/l;
        JVM INSTR monitorenter ;
        Handler handler;
        if (c == null)
        {
            c = new Handler(a.a.getMainLooper());
        }
        handler = c;
        com/google/android/gms/measurement/internal/l;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        com/google/android/gms/measurement/internal/l;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static boolean c(l l1)
    {
        return l1.e;
    }

    public abstract void a();

    public final void a(long l1)
    {
        b();
        if (l1 >= 0L)
        {
            b = a.d.a();
            if (!c().postDelayed(d, l1))
            {
                a.e().a.a("Failed to schedule delayed post. time", Long.valueOf(l1));
            }
        }
    }

    public final void b()
    {
        b = 0L;
        c().removeCallbacks(d);
    }
}
