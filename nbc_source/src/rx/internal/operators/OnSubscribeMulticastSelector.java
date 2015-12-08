// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.observables.ConnectableObservable;
import rx.observers.SafeSubscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorMulticast

public final class OnSubscribeMulticastSelector
    implements rx.Observable.OnSubscribe
{

    final Func1 resultSelector;
    final Observable source;
    final Func0 subjectFactory;

    public OnSubscribeMulticastSelector(Observable observable, Func0 func0, Func1 func1)
    {
        source = observable;
        subjectFactory = func0;
        resultSelector = func1;
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber s)
    {
        OperatorMulticast operatormulticast;
        Observable observable;
        try
        {
            operatormulticast = new OperatorMulticast(source, subjectFactory);
            observable = (Observable)resultSelector.call(operatormulticast);
        }
        catch (Throwable throwable)
        {
            s.onError(throwable);
            return;
        }
        s = new SafeSubscriber(s);
        observable.unsafeSubscribe(s);
        operatormulticast.connect(new Action1() {

            final OnSubscribeMulticastSelector this$0;
            final SafeSubscriber val$s;

            public volatile void call(Object obj)
            {
                call((Subscription)obj);
            }

            public void call(Subscription subscription)
            {
                s.add(subscription);
            }

            
            {
                this$0 = OnSubscribeMulticastSelector.this;
                s = safesubscriber;
                super();
            }
        });
    }
}
