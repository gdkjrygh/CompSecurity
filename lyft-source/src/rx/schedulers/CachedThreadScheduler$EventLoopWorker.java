// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.schedulers.ScheduledAction;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

final class threadWorker extends rx.LoopWorker
{

    static final AtomicIntegerFieldUpdater ONCE_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/schedulers/CachedThreadScheduler$EventLoopWorker, "once");
    private final CompositeSubscription innerSubscription = new CompositeSubscription();
    volatile int once;
    private final r.newUpdater threadWorker;

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
            action0 = threadWorker.eduleActual(action0, l, timeunit);
            innerSubscription.add(action0);
            action0.addParent(innerSubscription);
            return action0;
        }
    }

    public void unsubscribe()
    {
        if (ONCE_UPDATER.compareAndSet(this, 0, 1))
        {
            .access._mth200().release(threadWorker);
        }
        innerSubscription.unsubscribe();
    }


    r(r r)
    {
        threadWorker = r;
    }
}
