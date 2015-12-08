// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func0;
import rx.observers.Subscribers;

public final class OnSubscribeDelaySubscriptionWithSelector
    implements rx.Observable.OnSubscribe
{

    final Observable source;
    final Func0 subscriptionDelay;

    public OnSubscribeDelaySubscriptionWithSelector(Observable observable, Func0 func0)
    {
        source = observable;
        subscriptionDelay = func0;
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber child)
    {
        try
        {
            ((Observable)subscriptionDelay.call()).take(1).unsafeSubscribe(new Subscriber() {

                final OnSubscribeDelaySubscriptionWithSelector this$0;
                final Subscriber val$child;

                public void onCompleted()
                {
                    source.unsafeSubscribe(Subscribers.wrap(child));
                }

                public void onError(Throwable throwable1)
                {
                    child.onError(throwable1);
                }

                public void onNext(Object obj)
                {
                }

            
            {
                this$0 = OnSubscribeDelaySubscriptionWithSelector.this;
                child = subscriber;
                super();
            }
            });
            return;
        }
        catch (Throwable throwable)
        {
            child.onError(throwable);
        }
    }
}
