// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;

abstract class jtb
{

    private static volatile Handler d;
    final jrk a;
    final Runnable b = new jtc(this);
    volatile long c;

    jtb(jrk jrk1)
    {
        b.d(jrk1);
        a = jrk1;
    }

    static long a(jtb jtb1, long l)
    {
        jtb1.c = 0L;
        return 0L;
    }

    static jrk a(jtb jtb1)
    {
        return jtb1.a;
    }

    static boolean b(jtb jtb1)
    {
        return false;
    }

    public abstract void a();

    public final void a(long l)
    {
        c();
        if (l >= 0L)
        {
            c = a.c.a();
            if (!d().postDelayed(b, l))
            {
                a.a().e("Failed to schedule delayed post. time", Long.valueOf(l));
            }
        }
    }

    public final boolean b()
    {
        return c != 0L;
    }

    public final void c()
    {
        c = 0L;
        d().removeCallbacks(b);
    }

    Handler d()
    {
        if (d != null)
        {
            return d;
        }
        jtb;
        JVM INSTR monitorenter ;
        Handler handler;
        if (d == null)
        {
            d = new Handler(a.a.getMainLooper());
        }
        handler = d;
        jtb;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        jtb;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
