// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import com.google.common.base.Preconditions;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.d.a:
//            c

class y extends c
{

    final ExecutorService a;

    y(ExecutorService executorservice)
    {
        a = (ExecutorService)Preconditions.checkNotNull(executorservice);
    }

    public boolean awaitTermination(long l, TimeUnit timeunit)
    {
        return a.awaitTermination(l, timeunit);
    }

    public void execute(Runnable runnable)
    {
        a.execute(runnable);
    }

    public boolean isShutdown()
    {
        return a.isShutdown();
    }

    public boolean isTerminated()
    {
        return a.isTerminated();
    }

    public void shutdown()
    {
        a.shutdown();
    }

    public List shutdownNow()
    {
        return a.shutdownNow();
    }
}
