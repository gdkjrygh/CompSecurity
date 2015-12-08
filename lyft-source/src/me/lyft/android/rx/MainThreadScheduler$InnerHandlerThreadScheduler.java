// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.schedulers.ScheduledAction;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

class handler extends rx.ThreadScheduler
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

            final MainThreadScheduler.InnerHandlerThreadScheduler this$0;
            final ScheduledAction val$scheduledAction;

            public void call()
            {
                handler.removeCallbacks(scheduledAction);
            }

            
            {
                this$0 = MainThreadScheduler.InnerHandlerThreadScheduler.this;
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


    public _cls1.val.scheduledAction(Handler handler1)
    {
        handler = handler1;
    }
}
