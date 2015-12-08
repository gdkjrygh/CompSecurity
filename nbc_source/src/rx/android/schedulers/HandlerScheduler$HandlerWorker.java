// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.android.schedulers;

import android.os.Handler;
import java.util.concurrent.TimeUnit;
import rx.Subscription;
import rx.android.plugins.RxAndroidPlugins;
import rx.android.plugins.RxAndroidSchedulersHook;
import rx.functions.Action0;
import rx.internal.schedulers.ScheduledAction;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.android.schedulers:
//            HandlerScheduler

static class handler extends rx.uler.HandlerWorker
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
        scheduledAction = new ScheduledAction(RxAndroidPlugins.getInstance().getSchedulersHook().onSchedule(scheduledAction));
        scheduledAction.add(Subscriptions.create(new Action0() {

            final HandlerScheduler.HandlerWorker this$0;
            final ScheduledAction val$scheduledAction;

            public void call()
            {
                handler.removeCallbacks(scheduledAction);
            }

            
            {
                this$0 = HandlerScheduler.HandlerWorker.this;
                scheduledAction = scheduledaction;
                super();
            }
        }));
        scheduledAction.addParent(compositeSubscription);
        compositeSubscription.add(scheduledAction);
        handler.postDelayed(scheduledAction, timeunit.toMillis(l));
        return scheduledAction;
    }

    public void unsubscribe()
    {
        compositeSubscription.unsubscribe();
    }


    _cls1.val.scheduledAction(Handler handler1)
    {
        handler = handler1;
    }
}
