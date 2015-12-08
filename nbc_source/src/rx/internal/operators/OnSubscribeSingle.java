// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.Observable;
import rx.SingleSubscriber;
import rx.Subscriber;

public class OnSubscribeSingle
    implements rx.Single.OnSubscribe
{

    private final Observable observable;

    public OnSubscribeSingle(Observable observable1)
    {
        observable = observable1;
    }

    public static OnSubscribeSingle create(Observable observable1)
    {
        return new OnSubscribeSingle(observable1);
    }

    public volatile void call(Object obj)
    {
        call((SingleSubscriber)obj);
    }

    public void call(final SingleSubscriber child)
    {
        Subscriber subscriber = new Subscriber() {

            private Object emission;
            private boolean emittedTooMany;
            private boolean itemEmitted;
            final OnSubscribeSingle this$0;
            final SingleSubscriber val$child;

            public void onCompleted()
            {
                if (emittedTooMany)
                {
                    return;
                }
                if (itemEmitted)
                {
                    child.onSuccess(emission);
                    return;
                } else
                {
                    child.onError(new NoSuchElementException("Observable emitted no items"));
                    return;
                }
            }

            public void onError(Throwable throwable)
            {
                child.onError(throwable);
                unsubscribe();
            }

            public void onNext(Object obj)
            {
                if (itemEmitted)
                {
                    emittedTooMany = true;
                    child.onError(new IllegalArgumentException("Observable emitted too many elements"));
                    unsubscribe();
                    return;
                } else
                {
                    itemEmitted = true;
                    emission = obj;
                    return;
                }
            }

            public void onStart()
            {
                request(2L);
            }

            
            {
                this$0 = OnSubscribeSingle.this;
                child = singlesubscriber;
                super();
                emittedTooMany = false;
                itemEmitted = false;
                emission = null;
            }
        };
        child.add(subscriber);
        observable.unsafeSubscribe(subscriber);
    }
}
