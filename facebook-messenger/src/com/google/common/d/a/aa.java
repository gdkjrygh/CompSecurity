// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import com.google.common.base.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.d.a:
//            y, v

class aa extends y
    implements v
{

    final ScheduledExecutorService b;

    aa(ScheduledExecutorService scheduledexecutorservice)
    {
        super(scheduledexecutorservice);
        b = (ScheduledExecutorService)Preconditions.checkNotNull(scheduledexecutorservice);
    }

    public ScheduledFuture schedule(Runnable runnable, long l, TimeUnit timeunit)
    {
        return b.schedule(runnable, l, timeunit);
    }

    public ScheduledFuture schedule(Callable callable, long l, TimeUnit timeunit)
    {
        return b.schedule(callable, l, timeunit);
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l, long l1, TimeUnit timeunit)
    {
        return b.scheduleAtFixedRate(runnable, l, l1, timeunit);
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l, long l1, TimeUnit timeunit)
    {
        return b.scheduleWithFixedDelay(runnable, l, l1, timeunit);
    }
}
