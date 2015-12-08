// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;
import rx.observers.SerializedSubscriber;
import rx.observers.Subscribers;
import rx.subjects.PublishSubject;

public final class OperatorDelayWithSelector
    implements rx.Observable.Operator
{

    final Func1 itemDelay;
    final Observable source;

    public OperatorDelayWithSelector(Observable observable, Func1 func1)
    {
        source = observable;
        itemDelay = func1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        SerializedSubscriber serializedsubscriber = new SerializedSubscriber(final_subscriber);
        final PublishSubject delayedEmissions = PublishSubject.create();
        final_subscriber.add(Observable.merge(delayedEmissions).unsafeSubscribe(Subscribers.from(serializedsubscriber)));
        return new Subscriber(serializedsubscriber) {

            final OperatorDelayWithSelector this$0;
            final SerializedSubscriber val$child;
            final PublishSubject val$delayedEmissions;

            public void onCompleted()
            {
                delayedEmissions.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                child.onError(throwable);
            }

            public void onNext(Object obj)
            {
                try
                {
                    delayedEmissions.onNext(((Observable)itemDelay.call(obj)).take(1).defaultIfEmpty(null).map(((_cls1) (obj)). new Func1() {

                        final _cls1 this$1;
                        final Object val$t;

                        public Object call(Object obj)
                        {
                            return t;
                        }

            
            {
                this$1 = final__pcls1;
                t = Object.this;
                super();
            }
                    }));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    onError(((Throwable) (obj)));
                }
            }

            
            {
                this$0 = OperatorDelayWithSelector.this;
                delayedEmissions = publishsubject;
                child = serializedsubscriber;
                super(final_subscriber);
            }
        };
    }
}
