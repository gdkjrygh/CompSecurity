// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.runtime.detour;

import com.facebook.loom.core.TraceEvents;
import com.facebook.loom.logger.Logger;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

// Referenced classes of package com.facebook.tools.dextr.runtime.detour:
//            RunnableWrapper, CallableWrapper

public class ExecutorDetour
{

    public ExecutorDetour()
    {
    }

    private static Runnable a(Runnable runnable, int i)
    {
        if (!TraceEvents.a(1))
        {
            return runnable;
        } else
        {
            return new RunnableWrapper(runnable, Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.ASYNC_CALL, i), i);
        }
    }

    private static Callable a(Callable callable, int i)
    {
        if (!TraceEvents.a(1))
        {
            return callable;
        } else
        {
            return new CallableWrapper(callable, Logger.a(1, com.facebook.loom.logger.LogEntry.EntryType.ASYNC_CALL, i), i);
        }
    }

    public static Future a(ExecutorCompletionService executorcompletionservice, Callable callable, int i)
    {
        return executorcompletionservice.submit(a(callable, i));
    }

    public static Future a(ExecutorService executorservice, Runnable runnable, int i)
    {
        return executorservice.submit(a(runnable, i));
    }

    public static Future a(ExecutorService executorservice, Runnable runnable, Object obj, int i)
    {
        return executorservice.submit(a(runnable, i), obj);
    }

    public static Future a(ExecutorService executorservice, Callable callable, int i)
    {
        return executorservice.submit(a(callable, i));
    }

    public static void a(Executor executor, Runnable runnable, int i)
    {
        executor.execute(a(runnable, i));
    }
}
