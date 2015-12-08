// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import rx.internal.schedulers.NewThreadWorker;
import rx.internal.util.RxThreadFactory;

final class GenericScheduledExecutorService
{

    private static final GenericScheduledExecutorService INSTANCE = new GenericScheduledExecutorService();
    private static final RxThreadFactory THREAD_FACTORY = new RxThreadFactory("RxScheduledExecutorPool-");
    private static final String THREAD_NAME_PREFIX = "RxScheduledExecutorPool-";
    private final ScheduledExecutorService executor;

    private GenericScheduledExecutorService()
    {
        int j = Runtime.getRuntime().availableProcessors();
        int i = j;
        if (j > 4)
        {
            i = j / 2;
        }
        j = i;
        if (i > 8)
        {
            j = 8;
        }
        ScheduledExecutorService scheduledexecutorservice = Executors.newScheduledThreadPool(j, THREAD_FACTORY);
        if (!NewThreadWorker.tryEnableCancelPolicy(scheduledexecutorservice) && (scheduledexecutorservice instanceof ScheduledThreadPoolExecutor))
        {
            NewThreadWorker.registerExecutor((ScheduledThreadPoolExecutor)scheduledexecutorservice);
        }
        executor = scheduledexecutorservice;
    }

    public static ScheduledExecutorService getInstance()
    {
        return INSTANCE.executor;
    }

}
