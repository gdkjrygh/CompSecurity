// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.rx;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import rx.R;
import rx.f.i;

public final class ScSchedulers
{

    public static final R HIGH_PRIO_SCHEDULER = i.a(createExecutor("HighPriorityPool", 6));
    public static final R LOW_PRIO_SCHEDULER = i.a(createExecutor("LowPriorityPool", 1));

    public ScSchedulers()
    {
    }

    private static Executor createExecutor(final String threadIdentifier, int j)
    {
        return Executors.newFixedThreadPool(j, new _cls1());
    }


    private class _cls1
        implements ThreadFactory
    {

        final AtomicLong counter = new AtomicLong();
        final String val$threadIdentifier;

        public final Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, (new StringBuilder()).append(threadIdentifier).append("-").append(counter.incrementAndGet()).toString());
        }

        _cls1()
        {
            threadIdentifier = s;
            super();
        }
    }

}
