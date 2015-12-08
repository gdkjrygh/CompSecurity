// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.subscriptions.BooleanSubscription;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.schedulers:
//            SleepingAction

public final class TrampolineScheduler extends Scheduler
{
    private static class InnerCurrentThreadScheduler extends rx.Scheduler.Worker
        implements Subscription
    {

        private static final AtomicIntegerFieldUpdater COUNTER_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/schedulers/TrampolineScheduler$InnerCurrentThreadScheduler, "counter");
        volatile int counter;
        private final BooleanSubscription innerSubscription;
        private final PriorityBlockingQueue queue;
        private final AtomicInteger wip;

        private Subscription enqueue(Action0 action0, long l)
        {
            if (innerSubscription.isUnsubscribed())
            {
                return Subscriptions.unsubscribed();
            }
            action0 = new TimedAction(action0, Long.valueOf(l), COUNTER_UPDATER.incrementAndGet(this));
            queue.add(action0);
            if (wip.getAndIncrement() == 0)
            {
                do
                {
                    action0 = (TimedAction)queue.poll();
                    if (action0 != null)
                    {
                        ((TimedAction) (action0)).action.call();
                    }
                } while (wip.decrementAndGet() > 0);
                return Subscriptions.unsubscribed();
            } else
            {
                return Subscriptions.create(action0. new Action0() {

                    final InnerCurrentThreadScheduler this$0;
                    final TimedAction val$timedAction;

                    public void call()
                    {
                        queue.remove(timedAction);
                    }

            
            {
                this$0 = final_innercurrentthreadscheduler;
                timedAction = TimedAction.this;
                super();
            }
                });
            }
        }

        public boolean isUnsubscribed()
        {
            return innerSubscription.isUnsubscribed();
        }

        public Subscription schedule(Action0 action0)
        {
            return enqueue(action0, now());
        }

        public Subscription schedule(Action0 action0, long l, TimeUnit timeunit)
        {
            l = now() + timeunit.toMillis(l);
            return enqueue(new SleepingAction(action0, this, l), l);
        }

        public void unsubscribe()
        {
            innerSubscription.unsubscribe();
        }



        private InnerCurrentThreadScheduler()
        {
            queue = new PriorityBlockingQueue();
            innerSubscription = new BooleanSubscription();
            wip = new AtomicInteger();
        }

    }

    private static final class TimedAction
        implements Comparable
    {

        final Action0 action;
        final int count;
        final Long execTime;

        public volatile int compareTo(Object obj)
        {
            return compareTo((TimedAction)obj);
        }

        public int compareTo(TimedAction timedaction)
        {
            int j = execTime.compareTo(timedaction.execTime);
            int i = j;
            if (j == 0)
            {
                i = TrampolineScheduler.compare(count, timedaction.count);
            }
            return i;
        }

        private TimedAction(Action0 action0, Long long1, int i)
        {
            action = action0;
            execTime = long1;
            count = i;
        }

    }


    private static final TrampolineScheduler INSTANCE = new TrampolineScheduler();

    TrampolineScheduler()
    {
    }

    private static int compare(int i, int j)
    {
        if (i < j)
        {
            return -1;
        }
        return i != j ? 1 : 0;
    }

    static TrampolineScheduler instance()
    {
        return INSTANCE;
    }

    public rx.Scheduler.Worker createWorker()
    {
        return new InnerCurrentThreadScheduler();
    }


}
