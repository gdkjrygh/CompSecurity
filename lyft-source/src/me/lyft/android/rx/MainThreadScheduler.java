// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import android.os.Handler;
import android.os.Looper;
import rx.Scheduler;

final class MainThreadScheduler extends Scheduler
{

    private static final MainThreadScheduler INSTANCE = new MainThreadScheduler();
    private final Handler handler = new Handler(Looper.getMainLooper());

    private MainThreadScheduler()
    {
    }

    public static Scheduler mainThread()
    {
        return INSTANCE;
    }

    public rx.Scheduler.Worker createWorker()
    {
        return new InnerHandlerThreadScheduler(handler);
    }


    private class InnerHandlerThreadScheduler extends rx.Scheduler.Worker
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
            scheduledAction = new ScheduledAction(scheduledAction);
            scheduledAction.add(Subscriptions.create(new Action0() {

                final InnerHandlerThreadScheduler this$0;
                final ScheduledAction val$scheduledAction;

                public void call()
                {
                    handler.removeCallbacks(scheduledAction);
                }

                
                {
                    this$0 = InnerHandlerThreadScheduler.this;
                    scheduledAction = scheduledaction;
                    super();
                }
            }));
            scheduledAction.addParent(compositeSubscription);
            compositeSubscription.add(scheduledAction);
            if (Looper.myLooper() == handler.getLooper() && l == 0L)
            {
                scheduledAction.run();
                return scheduledAction;
            } else
            {
                handler.postDelayed(scheduledAction, timeunit.toMillis(l));
                return scheduledAction;
            }
        }

        public void unsubscribe()
        {
            compositeSubscription.unsubscribe();
        }


        public InnerHandlerThreadScheduler(Handler handler1)
        {
            handler = handler1;
        }
    }

}
