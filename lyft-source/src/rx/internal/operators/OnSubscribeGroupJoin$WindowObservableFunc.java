// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.subscriptions.RefCountSubscription;

final class underlying
    implements rx.ndowObservableFunc
{

    final RefCountSubscription refCount;
    final Observable underlying;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        Subscription subscription = refCount.get();
        class WindowSubscriber extends Subscriber
        {

            private final Subscription ref;
            final Subscriber subscriber;
            final OnSubscribeGroupJoin.WindowObservableFunc this$0;

            public void onCompleted()
            {
                subscriber.onCompleted();
                ref.unsubscribe();
            }

            public void onError(Throwable throwable)
            {
                subscriber.onError(throwable);
                ref.unsubscribe();
            }

            public void onNext(Object obj)
            {
                subscriber.onNext(obj);
            }

            public WindowSubscriber(Subscriber subscriber1, Subscription subscription)
            {
                this$0 = OnSubscribeGroupJoin.WindowObservableFunc.this;
                super(subscriber1);
                subscriber = subscriber1;
                ref = subscription;
            }
        }

        subscriber = new WindowSubscriber(subscriber, subscription);
        subscriber.add(subscription);
        underlying.unsafeSubscribe(subscriber);
    }

    public WindowSubscriber(Observable observable, RefCountSubscription refcountsubscription)
    {
        refCount = refcountsubscription;
        underlying = observable;
    }
}
