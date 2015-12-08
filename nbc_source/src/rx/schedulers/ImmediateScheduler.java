// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.subscriptions.BooleanSubscription;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.schedulers:
//            SleepingAction

public final class ImmediateScheduler extends Scheduler
{
    private class InnerImmediateScheduler extends rx.Scheduler.Worker
        implements Subscription
    {

        final BooleanSubscription innerSubscription;
        final ImmediateScheduler this$0;

        public boolean isUnsubscribed()
        {
            return innerSubscription.isUnsubscribed();
        }

        public Subscription schedule(Action0 action0)
        {
            action0.call();
            return Subscriptions.unsubscribed();
        }

        public Subscription schedule(Action0 action0, long l, TimeUnit timeunit)
        {
            return schedule(((Action0) (new SleepingAction(action0, this, now() + timeunit.toMillis(l)))));
        }

        public void unsubscribe()
        {
            innerSubscription.unsubscribe();
        }

        private InnerImmediateScheduler()
        {
            this$0 = ImmediateScheduler.this;
            super();
            innerSubscription = new BooleanSubscription();
        }

    }


    private static final ImmediateScheduler INSTANCE = new ImmediateScheduler();

    ImmediateScheduler()
    {
    }

    static ImmediateScheduler instance()
    {
        return INSTANCE;
    }

    public rx.Scheduler.Worker createWorker()
    {
        return new InnerImmediateScheduler();
    }

}
