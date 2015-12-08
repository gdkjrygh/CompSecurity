// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class akh
{

    private static Executor a = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);

    public static void a(Runnable runnable, int i)
    {
        if (i > 0)
        {
            if (!(a instanceof ScheduledExecutorService))
            {
                throw new IllegalArgumentException("The executor set does not support scheduling");
            } else
            {
                ((ScheduledExecutorService)a).schedule(runnable, i, TimeUnit.MILLISECONDS);
                return;
            }
        }
        if (a instanceof ExecutorService)
        {
            ((ExecutorService)a).submit(runnable);
            return;
        } else
        {
            a.execute(runnable);
            return;
        }
    }

    static 
    {
        new ArrayList();
    }
}
