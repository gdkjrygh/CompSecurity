// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import java.util.concurrent.TimeUnit;
import rx.functions.Action0;
import rx.subscriptions.MultipleAssignmentSubscription;

// Referenced classes of package rx:
//            Subscription

public abstract class Scheduler
{
    public static abstract class Worker
        implements Subscription
    {

        public long now()
        {
            return System.currentTimeMillis();
        }

        public abstract Subscription schedule(Action0 action0);

        public abstract Subscription schedule(Action0 action0, long l, TimeUnit timeunit);

        public Subscription schedulePeriodically(final Action0 action, long l, long l1, TimeUnit timeunit)
        {
            l1 = timeunit.toNanos(l1);
            long l2 = TimeUnit.MILLISECONDS.toNanos(now());
            long l3 = timeunit.toNanos(l);
            final MultipleAssignmentSubscription mas = new MultipleAssignmentSubscription();
            action = l1. new Action0() {

                long count;
                final Worker this$0;
                final Action0 val$action;
                final MultipleAssignmentSubscription val$mas;
                final long val$periodInNanos;
                final long val$startInNanos;

                public void call()
                {
                    if (!mas.isUnsubscribed())
                    {
                        action.call();
                        long l = startInNanos;
                        long l1 = count + 1L;
                        count = l1;
                        long l2 = periodInNanos;
                        mas.set(schedule(this, (l + l1 * l2) - TimeUnit.MILLISECONDS.toNanos(now()), TimeUnit.NANOSECONDS));
                    }
                }

            
            {
                this$0 = final_worker;
                mas = multipleassignmentsubscription;
                action = action0;
                startInNanos = l;
                periodInNanos = J.this;
                super();
                count = 0L;
            }
            };
            MultipleAssignmentSubscription multipleassignmentsubscription = new MultipleAssignmentSubscription();
            mas.set(multipleassignmentsubscription);
            multipleassignmentsubscription.set(schedule(action, l, timeunit));
            return mas;
        }

        public Worker()
        {
        }
    }


    public Scheduler()
    {
    }

    public abstract Worker createWorker();

    public long now()
    {
        return System.currentTimeMillis();
    }
}
