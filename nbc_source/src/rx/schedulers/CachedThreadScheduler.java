// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.schedulers.NewThreadWorker;
import rx.internal.schedulers.ScheduledAction;
import rx.internal.util.RxThreadFactory;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

final class CachedThreadScheduler extends Scheduler
{
    private static final class CachedWorkerPool
    {

        private static CachedWorkerPool INSTANCE;
        private final ScheduledExecutorService evictExpiredWorkerExecutor = Executors.newScheduledThreadPool(1, CachedThreadScheduler.EVICTOR_THREAD_FACTORY);
        private final ConcurrentLinkedQueue expiringWorkerQueue = new ConcurrentLinkedQueue();
        private final long keepAliveTime;

        void evictExpiredWorkers()
        {
            if (!expiringWorkerQueue.isEmpty())
            {
                long l = now();
                Iterator iterator = expiringWorkerQueue.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    ThreadWorker threadworker = (ThreadWorker)iterator.next();
                    if (threadworker.getExpirationTime() > l)
                    {
                        break;
                    }
                    if (expiringWorkerQueue.remove(threadworker))
                    {
                        threadworker.unsubscribe();
                    }
                } while (true);
            }
        }

        ThreadWorker get()
        {
            while (!expiringWorkerQueue.isEmpty()) 
            {
                ThreadWorker threadworker = (ThreadWorker)expiringWorkerQueue.poll();
                if (threadworker != null)
                {
                    return threadworker;
                }
            }
            return new ThreadWorker(CachedThreadScheduler.WORKER_THREAD_FACTORY);
        }

        long now()
        {
            return System.nanoTime();
        }

        void release(ThreadWorker threadworker)
        {
            threadworker.setExpirationTime(now() + keepAliveTime);
            expiringWorkerQueue.offer(threadworker);
        }

        static 
        {
            INSTANCE = new CachedWorkerPool(60L, TimeUnit.SECONDS);
        }


        CachedWorkerPool(long l, TimeUnit timeunit)
        {
            keepAliveTime = timeunit.toNanos(l);
            evictExpiredWorkerExecutor.scheduleWithFixedDelay(new _cls1(), keepAliveTime, keepAliveTime, TimeUnit.NANOSECONDS);
        }
    }

    private static final class EventLoopWorker extends rx.Scheduler.Worker
    {

        static final AtomicIntegerFieldUpdater ONCE_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/schedulers/CachedThreadScheduler$EventLoopWorker, "once");
        private final CompositeSubscription innerSubscription = new CompositeSubscription();
        volatile int once;
        private final ThreadWorker threadWorker;

        public boolean isUnsubscribed()
        {
            return innerSubscription.isUnsubscribed();
        }

        public Subscription schedule(Action0 action0)
        {
            return schedule(action0, 0L, null);
        }

        public Subscription schedule(Action0 action0, long l, TimeUnit timeunit)
        {
            if (innerSubscription.isUnsubscribed())
            {
                return Subscriptions.unsubscribed();
            } else
            {
                action0 = threadWorker.scheduleActual(action0, l, timeunit);
                innerSubscription.add(action0);
                action0.addParent(innerSubscription);
                return action0;
            }
        }

        public void unsubscribe()
        {
            if (ONCE_UPDATER.compareAndSet(this, 0, 1))
            {
                CachedWorkerPool.INSTANCE.release(threadWorker);
            }
            innerSubscription.unsubscribe();
        }


        EventLoopWorker(ThreadWorker threadworker)
        {
            threadWorker = threadworker;
        }
    }

    private static final class ThreadWorker extends NewThreadWorker
    {

        private long expirationTime;

        public long getExpirationTime()
        {
            return expirationTime;
        }

        public void setExpirationTime(long l)
        {
            expirationTime = l;
        }

        ThreadWorker(ThreadFactory threadfactory)
        {
            super(threadfactory);
            expirationTime = 0L;
        }
    }


    private static final RxThreadFactory EVICTOR_THREAD_FACTORY = new RxThreadFactory("RxCachedWorkerPoolEvictor-");
    private static final String EVICTOR_THREAD_NAME_PREFIX = "RxCachedWorkerPoolEvictor-";
    private static final RxThreadFactory WORKER_THREAD_FACTORY = new RxThreadFactory("RxCachedThreadScheduler-");
    private static final String WORKER_THREAD_NAME_PREFIX = "RxCachedThreadScheduler-";

    CachedThreadScheduler()
    {
    }

    public rx.Scheduler.Worker createWorker()
    {
        return new EventLoopWorker(CachedWorkerPool.INSTANCE.get());
    }




    // Unreferenced inner class rx/schedulers/CachedThreadScheduler$CachedWorkerPool$1

/* anonymous class */
    class CachedWorkerPool._cls1
        implements Runnable
    {

        final CachedWorkerPool this$0;

        public void run()
        {
            evictExpiredWorkers();
        }

            
            {
                this$0 = CachedWorkerPool.this;
                super();
            }
    }

}
