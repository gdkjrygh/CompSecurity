// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func0;
import rx.observers.Subscribers;

public final class OnSubscribeDefer
    implements rx.Observable.OnSubscribe
{

    final Func0 observableFactory;

    public OnSubscribeDefer(Func0 func0)
    {
        observableFactory = func0;
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        Observable observable;
        try
        {
            observable = (Observable)observableFactory.call();
        }
        catch (Throwable throwable)
        {
            subscriber.onError(throwable);
            return;
        }
        observable.unsafeSubscribe(Subscribers.wrap(subscriber));
    }
}
