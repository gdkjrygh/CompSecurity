// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import com.google.android.m4b.maps.y.j;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            k

public final class d
{

    final ScheduledExecutorService a;
    final Runnable b;
    boolean c;
    long d;
    private final k e;
    private final long f = 5000L;
    private Runnable g;

    public d(ScheduledExecutorService scheduledexecutorservice, Runnable runnable, k k1)
    {
        boolean flag = false;
        super();
        c = false;
        g = new Runnable() {

            private d a;

            public final void run()
            {
                boolean flag1 = false;
                d d1 = a;
                d1;
                JVM INSTR monitorenter ;
                long l = a.d - k.b();
                if (l <= 0L)
                {
                    flag1 = true;
                }
                if (!flag1)
                {
                    break MISSING_BLOCK_LABEL_62;
                }
                a.c = false;
_L1:
                d1;
                JVM INSTR monitorexit ;
                if (flag1)
                {
                    a.b.run();
                }
                return;
                a.a.schedule(this, l, TimeUnit.MILLISECONDS);
                  goto _L1
                Exception exception;
                exception;
                d1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = d.this;
                super();
            }
        };
        if (5000L >= 0L)
        {
            flag = true;
        }
        j.a(flag);
        a = scheduledexecutorservice;
        b = runnable;
        e = k1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        d = k.b() + f;
        if (!c)
        {
            a.schedule(g, f, TimeUnit.MILLISECONDS);
            c = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
