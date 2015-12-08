// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.subscriptions.BooleanSubscription;
import rx.subscriptions.Subscriptions;

public class TestScheduler extends Scheduler
{
    private static class CompareActionsByTime
        implements Comparator
    {

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((TimedAction)obj, (TimedAction)obj1);
        }

        public int compare(TimedAction timedaction, TimedAction timedaction1)
        {
            if (timedaction.time == timedaction1.time)
            {
                return Long.valueOf(timedaction.count).compareTo(Long.valueOf(timedaction1.count));
            } else
            {
                return Long.valueOf(timedaction.time).compareTo(Long.valueOf(timedaction1.time));
            }
        }

        private CompareActionsByTime()
        {
        }

    }

    private final class InnerTestScheduler extends rx.Scheduler.Worker
    {

        private final BooleanSubscription s;
        final TestScheduler this$0;

        public boolean isUnsubscribed()
        {
            return s.isUnsubscribed();
        }

        public long now()
        {
            return TestScheduler.this.now();
        }

        public Subscription schedule(Action0 action0)
        {
            action0 = new TimedAction(this, 0L, action0);
            queue.add(action0);
            return Subscriptions.create(action0. new Action0() {

                final InnerTestScheduler this$1;
                final TimedAction val$timedAction;

                public void call()
                {
                    queue.remove(timedAction);
                }

            
            {
                this$1 = final_innertestscheduler;
                timedAction = TimedAction.this;
                super();
            }
            });
        }

        public Subscription schedule(Action0 action0, long l, TimeUnit timeunit)
        {
            action0 = new TimedAction(this, time + timeunit.toNanos(l), action0);
            queue.add(action0);
            return Subscriptions.create(action0. new Action0() {

                final InnerTestScheduler this$1;
                final TimedAction val$timedAction;

                public void call()
                {
                    queue.remove(timedAction);
                }

            
            {
                this$1 = final_innertestscheduler;
                timedAction = TimedAction.this;
                super();
            }
            });
        }

        public void unsubscribe()
        {
            s.unsubscribe();
        }

        private InnerTestScheduler()
        {
            this$0 = TestScheduler.this;
            super();
            s = new BooleanSubscription();
        }

    }

    private static final class TimedAction
    {

        private final Action0 action;
        private final long count;
        private final rx.Scheduler.Worker scheduler;
        private final long time;

        public String toString()
        {
            return String.format("TimedAction(time = %d, action = %s)", new Object[] {
                Long.valueOf(time), action.toString()
            });
        }





        private TimedAction(rx.Scheduler.Worker worker, long l, Action0 action0)
        {
            count = long l = action;
            time = l;
            action = action0;
            scheduler = worker;
        }

        TimedAction(rx.Scheduler.Worker worker, long l, Action0 action0, _cls1 _pcls1)
        {
            this(worker, l, action0);
        }
    }


    private static long counter = 0L;
    private final Queue queue = new PriorityQueue(11, new CompareActionsByTime());
    private long time;

    public TestScheduler()
    {
    }

    private void triggerActions(long l)
    {
        do
        {
            TimedAction timedaction;
label0:
            {
                if (!queue.isEmpty())
                {
                    timedaction = (TimedAction)queue.peek();
                    if (timedaction.time <= l)
                    {
                        break label0;
                    }
                }
                time = l;
                return;
            }
            long l1;
            if (timedaction.time == 0L)
            {
                l1 = time;
            } else
            {
                l1 = timedaction.time;
            }
            time = l1;
            queue.remove();
            if (!timedaction.scheduler.isUnsubscribed())
            {
                timedaction.action.call();
            }
        } while (true);
    }

    public void advanceTimeBy(long l, TimeUnit timeunit)
    {
        advanceTimeTo(time + timeunit.toNanos(l), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long l, TimeUnit timeunit)
    {
        triggerActions(timeunit.toNanos(l));
    }

    public rx.Scheduler.Worker createWorker()
    {
        return new InnerTestScheduler();
    }

    public long now()
    {
        return TimeUnit.NANOSECONDS.toMillis(time);
    }

    public void triggerActions()
    {
        triggerActions(time);
    }



/*
    static long access$108()
    {
        long l = counter;
        counter = 1L + l;
        return l;
    }

*/


}
