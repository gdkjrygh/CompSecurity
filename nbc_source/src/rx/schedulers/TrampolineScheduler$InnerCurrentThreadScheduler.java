// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Subscription;
import rx.functions.Action0;
import rx.subscriptions.BooleanSubscription;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.schedulers:
//            TrampolineScheduler, SleepingAction

private static class <init> extends rx.dScheduler
    implements Subscription
{

    private static final AtomicIntegerFieldUpdater COUNTER_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/schedulers/TrampolineScheduler$InnerCurrentThreadScheduler, "counter");
    volatile int counter;
    private final BooleanSubscription innerSubscription;
    private final PriorityBlockingQueue queue;
    private final AtomicInteger wip;

    private Subscription enqueue(final Action0 timedAction, long l)
    {
        if (innerSubscription.isUnsubscribed())
        {
            return Subscriptions.unsubscribed();
        }
        timedAction = new innerSubscription(timedAction, Long.valueOf(l), COUNTER_UPDATER.incrementAndGet(this), null);
        queue.add(timedAction);
        if (wip.getAndIncrement() == 0)
        {
            do
            {
                timedAction = (wip)queue.poll();
                if (timedAction != null)
                {
                    ((queue) (timedAction)).queue.call();
                }
            } while (wip.decrementAndGet() > 0);
            return Subscriptions.unsubscribed();
        } else
        {
            return Subscriptions.create(new Action0() {

                final TrampolineScheduler.InnerCurrentThreadScheduler this$0;
                final TrampolineScheduler.TimedAction val$timedAction;

                public void call()
                {
                    queue.remove(timedAction);
                }

            
            {
                this$0 = TrampolineScheduler.InnerCurrentThreadScheduler.this;
                timedAction = timedaction;
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



    private _cls1.val.timedAction()
    {
        queue = new PriorityBlockingQueue();
        innerSubscription = new BooleanSubscription();
        wip = new AtomicInteger();
    }

    wip(wip wip1)
    {
        this();
    }
}
