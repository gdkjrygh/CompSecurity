// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

abstract class bnu
{

    private static volatile Handler d;
    final bnf a;
    final Runnable b = new Runnable() {

        private bnu a;

        public final void run()
        {
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                bnu.a(a).b().a(this);
            } else
            {
                boolean flag = a.b();
                bnu.b(a);
                if (flag)
                {
                    a.a();
                    return;
                }
            }
        }

            
            {
                a = bnu.this;
                super();
            }
    };
    volatile long c;

    bnu(bnf bnf1)
    {
        btl.a(bnf1);
        a = bnf1;
    }

    static bnf a(bnu bnu1)
    {
        return bnu1.a;
    }

    static long b(bnu bnu1)
    {
        bnu1.c = 0L;
        return 0L;
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

    final Handler d()
    {
        if (d != null)
        {
            return d;
        }
        bnu;
        JVM INSTR monitorenter ;
        Handler handler;
        if (d == null)
        {
            d = new Handler(a.a.getMainLooper());
        }
        handler = d;
        bnu;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        bnu;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
