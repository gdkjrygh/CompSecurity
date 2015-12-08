// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.android.schedulers;

import android.os.Handler;
import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscription;
import rx.android.plugins.RxAndroidPlugins;
import rx.android.plugins.RxAndroidSchedulersHook;
import rx.functions.Action0;
import rx.internal.schedulers.ScheduledAction;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

public final class HandlerScheduler extends Scheduler
{
    static class HandlerWorker extends rx.Scheduler.Worker
    {

        private final CompositeSubscription compositeSubscription = new CompositeSubscription();
        private final Handler handler;

        public boolean isUnsubscribed()
        {
            return compositeSubscription.isUnsubscribed();
        }

        public Subscription schedule(Action0 action0)
        {
            return schedule(action0, 0L, TimeUnit.MILLISECONDS);
        }

        public Subscription schedule(Action0 action0, long l, TimeUnit timeunit)
        {
            action0 = new ScheduledAction(RxAndroidPlugins.getInstance().getSchedulersHook().onSchedule(action0));
            action0.add(Subscriptions.create(action0. new Action0() {

                final HandlerWorker this$0;
                final ScheduledAction val$scheduledAction;

                public void call()
                {
                    handler.removeCallbacks(scheduledAction);
                }

            
            {
                this$0 = final_handlerworker;
                scheduledAction = ScheduledAction.this;
                super();
            }
            }));
            action0.addParent(compositeSubscription);
            compositeSubscription.add(action0);
            handler.postDelayed(action0, timeunit.toMillis(l));
            return action0;
        }

        public void unsubscribe()
        {
            compositeSubscription.unsubscribe();
        }


        HandlerWorker(Handler handler1)
        {
            handler = handler1;
        }
    }


    private final Handler handler;

    HandlerScheduler(Handler handler1)
    {
        handler = handler1;
    }

    public static HandlerScheduler from(Handler handler1)
    {
        if (handler1 == null)
        {
            throw new NullPointerException("handler == null");
        } else
        {
            return new HandlerScheduler(handler1);
        }
    }

    public rx.Scheduler.Worker createWorker()
    {
        return new HandlerWorker(handler);
    }
}
