// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.android.schedulers;

import android.os.Handler;
import rx.Scheduler;

public final class HandlerScheduler extends Scheduler
{

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

    private class HandlerWorker extends rx.Scheduler.Worker
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

        public Subscription schedule(final Action0 scheduledAction, long l, TimeUnit timeunit)
        {
            if (compositeSubscription.isUnsubscribed())
            {
                return Subscriptions.unsubscribed();
            } else
            {
                scheduledAction = new ScheduledAction(RxAndroidPlugins.getInstance().getSchedulersHook().onSchedule(scheduledAction));
                scheduledAction.addParent(compositeSubscription);
                compositeSubscription.add(scheduledAction);
                handler.postDelayed(scheduledAction, timeunit.toMillis(l));
                scheduledAction.add(Subscriptions.create(new Action0() {

                    final HandlerWorker this$0;
                    final ScheduledAction val$scheduledAction;

                    public void call()
                    {
                        handler.removeCallbacks(scheduledAction);
                    }

                
                {
                    this$0 = HandlerWorker.this;
                    scheduledAction = scheduledaction;
                    super();
                }
                }));
                return scheduledAction;
            }
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

}
