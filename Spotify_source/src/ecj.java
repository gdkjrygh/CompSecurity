// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class ecj
{

    public ScheduledExecutorService a;

    public ecj(ScheduledExecutorService scheduledexecutorservice)
    {
        a = scheduledexecutorservice;
    }

    public final ech a(long l)
    {
        return new ech(a, l, new eci() {

            public final long a(ScheduledFuture scheduledfuture)
            {
                return Math.max(0L, scheduledfuture.getDelay(TimeUnit.MILLISECONDS));
            }

        });
    }

    // Unreferenced inner class ecj$2

/* anonymous class */
    public final class _cls2
        implements eci
    {

        private long a;

        public final long a(ScheduledFuture scheduledfuture)
        {
            return a;
        }

            public 
            {
                a = 400L;
                super();
            }
    }

}
