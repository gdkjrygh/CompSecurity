// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class akh extends ThreadPoolExecutor
{

    private volatile int a;

    public akh(TimeUnit timeunit, BlockingQueue blockingqueue)
    {
        super(1, 1, 20000L, timeunit, blockingqueue);
    }

    protected final void afterExecute(Runnable runnable, Throwable throwable)
    {
        super.afterExecute(runnable, throwable);
        a = a - 1;
    }

    protected final void beforeExecute(Thread thread, Runnable runnable)
    {
        super.beforeExecute(thread, runnable);
    }

    public final void execute(Runnable runnable)
    {
        super.execute(runnable);
        a = a + 1;
    }
}
