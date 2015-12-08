// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import rx.Scheduler;
import rx.internal.schedulers.NewThreadWorker;
import rx.internal.util.RxThreadFactory;

public final class NewThreadScheduler extends Scheduler
{

    private static final NewThreadScheduler INSTANCE = new NewThreadScheduler();
    private static final RxThreadFactory THREAD_FACTORY = new RxThreadFactory("RxNewThreadScheduler-");
    private static final String THREAD_NAME_PREFIX = "RxNewThreadScheduler-";

    private NewThreadScheduler()
    {
    }

    static NewThreadScheduler instance()
    {
        return INSTANCE;
    }

    public rx.Scheduler.Worker createWorker()
    {
        return new NewThreadWorker(THREAD_FACTORY);
    }

}
