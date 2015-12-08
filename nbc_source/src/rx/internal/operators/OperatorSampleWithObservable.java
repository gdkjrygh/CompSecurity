// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Subscriber;
import rx.observers.SerializedSubscriber;

public final class OperatorSampleWithObservable
    implements rx.Observable.Operator
{

    static final Object EMPTY_TOKEN = new Object();
    final Observable sampler;

    public OperatorSampleWithObservable(Observable observable)
    {
        sampler = observable;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        SerializedSubscriber serializedsubscriber = new SerializedSubscriber(final_subscriber);
        final AtomicReference value = new AtomicReference(EMPTY_TOKEN);
        Subscriber subscriber = new Subscriber(serializedsubscriber) {

            final OperatorSampleWithObservable this$0;
            final SerializedSubscriber val$s;
            final AtomicReference val$value;

            public void onCompleted()
            {
                s.onCompleted();
                unsubscribe();
            }

            public void onError(Throwable throwable)
            {
                s.onError(throwable);
                unsubscribe();
            }

            public void onNext(Object obj)
            {
                obj = value.getAndSet(OperatorSampleWithObservable.EMPTY_TOKEN);
                if (obj != OperatorSampleWithObservable.EMPTY_TOKEN)
                {
                    s.onNext(obj);
                }
            }

            
            {
                this$0 = OperatorSampleWithObservable.this;
                value = atomicreference;
                s = serializedsubscriber;
                super(final_subscriber);
            }
        };
        final_subscriber = new Subscriber(serializedsubscriber) {

            final OperatorSampleWithObservable this$0;
            final SerializedSubscriber val$s;
            final AtomicReference val$value;

            public void onCompleted()
            {
                s.onCompleted();
                unsubscribe();
            }

            public void onError(Throwable throwable)
            {
                s.onError(throwable);
                unsubscribe();
            }

            public void onNext(Object obj)
            {
                value.set(obj);
            }

            
            {
                this$0 = OperatorSampleWithObservable.this;
                value = atomicreference;
                s = serializedsubscriber;
                super(final_subscriber);
            }
        };
        sampler.unsafeSubscribe(subscriber);
        return final_subscriber;
    }

}
