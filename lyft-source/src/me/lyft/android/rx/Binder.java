// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import android.view.View;
import me.lyft.android.logging.L;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package me.lyft.android.rx:
//            MainThreadScheduler, AsyncCall

public class Binder
{

    private boolean detached;
    private android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = new android.view.View.OnAttachStateChangeListener() {

        final Binder this$0;

        public void onViewAttachedToWindow(View view)
        {
        }

        public void onViewDetachedFromWindow(View view)
        {
            detach();
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }

            
            {
                this$0 = Binder.this;
                super();
            }
    };
    final CompositeSubscription subscriptions;

    public Binder()
    {
        subscriptions = new CompositeSubscription();
        detached = false;
    }

    private Binder(View view)
    {
        subscriptions = new CompositeSubscription();
        view.addOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    public static Binder attach(View view)
    {
        if (view.getParent() == null)
        {
            throw new IllegalStateException("You should attach inside view onAttachedToWindow");
        } else
        {
            return new Binder(view);
        }
    }

    public Subscription bind(Observable observable, AsyncCall asynccall)
    {
        if (subscriptions.isUnsubscribed())
        {
            L.e(new IllegalStateException("Cannot bind with detached binder"), observable.getClass().getSimpleName(), new Object[0]);
        }
        observable = observable.observeOn(MainThreadScheduler.mainThread()).subscribe(asynccall);
        subscriptions.add(observable);
        return observable;
    }

    public Subscription bind(Observable observable, Action1 action1)
    {
        if (detached)
        {
            L.e(new IllegalStateException("Cannot bind with detached binder"), observable.getClass().getSimpleName(), new Object[0]);
        }
        observable = observable.observeOn(MainThreadScheduler.mainThread()).subscribe(action1);
        subscriptions.add(observable);
        return observable;
    }

    public void detach()
    {
        detached = true;
        subscriptions.clear();
    }

    public void remove(Subscription subscription)
    {
        subscriptions.remove(subscription);
    }

}
