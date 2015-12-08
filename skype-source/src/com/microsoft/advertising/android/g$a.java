// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import com.microsoft.advertising.android.a.e;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.microsoft.advertising.android:
//            g, av, af, q, 
//            ah

final class c
{

    final g a;
    private TimerTask b;
    private Timer c;

    private void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        av.a("FETCH_TIMER", (new StringBuilder("startTime(adReloadPeriodMillis=")).append(l).toString());
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag = af.a(flag);
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f();
        b = new TimerTask() {

            final g.a a;

            public final void run()
            {
                a.a.k();
            }

            
            {
                a = g.a.this;
                super();
            }
        };
        av.a("FETCH_TIMER", (new StringBuilder("starting timer interval=")).append(l).toString());
        c.schedule(b, l);
        g.a(a).i().c("AdControl.startTimer", String.valueOf(l / 1000L));
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        g.a(a).i().a(((Exception) (obj)), e.a);
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        throw obj;
    }

    static void a(a a1)
    {
        a1.f();
    }

    static void a(f f1, long l)
    {
        f1.a(l);
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            b.cancel();
            b = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        if (a.a(new a[] {
    b
}))
        {
            f();
        }
    }

    public final void a(int i, Long long1)
    {
        long l1 = i;
        long l = l1;
        if (long1 != null)
        {
            l = l1;
            if (long1.longValue() > 0L)
            {
                l = l1;
                if (long1.longValue() < (long)i)
                {
                    l = (long)i - long1.longValue();
                }
            }
        }
        av.a("FETCH_TIMER", (new StringBuilder("starting Auto Refresh timer for fetching with ")).append(l).toString());
        a(l);
    }

    public final void a(a a1)
    {
        if (b == a1)
        {
            if (!af.b(false, "should never get here"));
        } else
        {
            if (f == a1)
            {
                av.a("FETCH_TIMER", "starting short timer for SHOW_WAIT");
                a(5000L);
                return;
            }
            if (c == a1)
            {
                av.a("FETCH_TIMER", "starting short timer for fetching");
                a(5000L);
                return;
            }
        }
    }

    public final boolean b()
    {
        return b != null && c != null;
    }

    public final boolean c()
    {
        return c != null;
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        c = new Timer();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        Timer timer = c;
        if (timer == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        c.cancel();
        c = null;
        b = null;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        g.a(a).i().c(((Exception) (obj)).getMessage(), e.a);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    _cls1.a(g g1)
    {
        a = g1;
        super();
        b = null;
        c = null;
    }
}
