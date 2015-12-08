// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public final class RxThreadFactory
    implements ThreadFactory
{

    static final AtomicLongFieldUpdater COUNTER_UPDATER = AtomicLongFieldUpdater.newUpdater(rx/internal/util/RxThreadFactory, "counter");
    volatile long counter;
    final String prefix;

    public RxThreadFactory(String s)
    {
        prefix = s;
    }

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable, (new StringBuilder()).append(prefix).append(COUNTER_UPDATER.incrementAndGet(this)).toString());
        runnable.setDaemon(true);
        return runnable;
    }

}
