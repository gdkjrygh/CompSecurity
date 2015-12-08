// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.util.RxThreadFactory;
import rx.internal.util.SubscriptionList;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.internal.schedulers:
//            NewThreadWorker

public class EventLoopsScheduler extends Scheduler
{
    private static class EventLoopWorker extends rx.Scheduler.Worker
    {

        private final SubscriptionList both;
        private final PoolWorker poolWorker;
        private final SubscriptionList serial = new SubscriptionList();
        private final CompositeSubscription timed = new CompositeSubscription();

        public boolean isUnsubscribed()
        {
            return both.isUnsubscribed();
        }

        public Subscription schedule(Action0 action0)
        {
            if (isUnsubscribed())
            {
                return Subscriptions.unsubscribed();
            } else
            {
                return poolWorker.scheduleActual(action0, 0L, null, serial);
            }
        }

        public Subscription schedule(Action0 action0, long l, TimeUnit timeunit)
        {
            if (isUnsubscribed())
            {
                return Subscriptions.unsubscribed();
            } else
            {
                return poolWorker.scheduleActual(action0, l, timeunit, timed);
            }
        }

        public void unsubscribe()
        {
            both.unsubscribe();
        }

        EventLoopWorker(PoolWorker poolworker)
        {
            both = new SubscriptionList(new Subscription[] {
                serial, timed
            });
            poolWorker = poolworker;
        }
    }

    static final class FixedSchedulerPool
    {

        final int cores;
        final PoolWorker eventLoops[];
        long n;

        public PoolWorker getEventLoop()
        {
            PoolWorker apoolworker[] = eventLoops;
            long l = n;
            n = 1L + l;
            return apoolworker[(int)(l % (long)cores)];
        }

        FixedSchedulerPool()
        {
            cores = EventLoopsScheduler.MAX_THREADS;
            eventLoops = new PoolWorker[cores];
            for (int i = 0; i < cores; i++)
            {
                eventLoops[i] = new PoolWorker(EventLoopsScheduler.THREAD_FACTORY);
            }

        }
    }

    private static final class PoolWorker extends NewThreadWorker
    {

        PoolWorker(ThreadFactory threadfactory)
        {
            super(threadfactory);
        }
    }


    static final String KEY_MAX_THREADS = "rx.scheduler.max-computation-threads";
    static final int MAX_THREADS;
    private static final RxThreadFactory THREAD_FACTORY = new RxThreadFactory("RxComputationThreadPool-");
    private static final String THREAD_NAME_PREFIX = "RxComputationThreadPool-";
    final FixedSchedulerPool pool = new FixedSchedulerPool();

    public EventLoopsScheduler()
    {
    }

    public rx.Scheduler.Worker createWorker()
    {
        return new EventLoopWorker(pool.getEventLoop());
    }

    public Subscription scheduleDirect(Action0 action0)
    {
        return pool.getEventLoop().scheduleActual(action0, -1L, TimeUnit.NANOSECONDS);
    }

    static 
    {
        int i = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int j = Runtime.getRuntime().availableProcessors();
        if (i <= 0 || i > j)
        {
            i = j;
        }
        MAX_THREADS = i;
    }

}
