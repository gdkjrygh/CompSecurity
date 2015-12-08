// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class ech
{

    private final ScheduledExecutorService a;
    private final eci b;
    private final long c;
    private ScheduledFuture d;

    public ech(ScheduledExecutorService scheduledexecutorservice, long l, eci eci1)
    {
        b = (eci)ctz.a(eci1);
        a = (ScheduledExecutorService)ctz.a(scheduledexecutorservice);
        c = l;
    }

    public final void a(Runnable runnable)
    {
        long l1 = c;
        long l = l1;
        if (d != null)
        {
            l = l1;
            if (!d.isDone())
            {
                l = b.a(d);
                d.cancel(false);
            }
        }
        d = a.schedule(runnable, l, TimeUnit.MILLISECONDS);
    }
}
