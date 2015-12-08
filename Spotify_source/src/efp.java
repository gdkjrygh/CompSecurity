// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class efp
{

    public fll a;
    public gkd b;
    Future c;
    boolean d;
    private ScheduledExecutorService e;
    private Runnable f;

    public efp(ScheduledExecutorService scheduledexecutorservice, gkd gkd1)
    {
        f = new Runnable() {

            private efp a;

            public final void run()
            {
                if (a.c != null && !a.c.isCancelled())
                {
                    efp efp1 = a;
                    if (efp1.a != null)
                    {
                        efp1.a.a(efp1.b.d());
                    }
                }
            }

            
            {
                a = efp.this;
                super();
            }
        };
        e = scheduledexecutorservice;
        b = gkd1;
        d = false;
        a = null;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            if (d)
            {
                c.cancel(false);
            }
            e.shutdown();
            d = false;
            e = null;
            a = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(fll fll1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            b.e();
            a = fll1;
            a.b(b.e());
        }
        if (!d)
        {
            d = true;
            c = e.scheduleAtFixedRate(f, 500L, 500L, TimeUnit.MILLISECONDS);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        fll1;
        throw fll1;
    }
}
