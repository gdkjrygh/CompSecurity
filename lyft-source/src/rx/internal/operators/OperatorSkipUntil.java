// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Subscriber;
import rx.observers.SerializedSubscriber;

public final class OperatorSkipUntil
    implements rx.Observable.Operator
{

    final Observable other;

    public OperatorSkipUntil(Observable observable)
    {
        other = observable;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        final SerializedSubscriber s = new SerializedSubscriber(final_subscriber);
        final AtomicBoolean gate = new AtomicBoolean();
        Subscriber subscriber = new Subscriber() {

            final OperatorSkipUntil this$0;
            final AtomicBoolean val$gate;
            final SerializedSubscriber val$s;

            public void onCompleted()
            {
                unsubscribe();
            }

            public void onError(Throwable throwable)
            {
                s.onError(throwable);
                s.unsubscribe();
            }

            public void onNext(Object obj)
            {
                gate.set(true);
                unsubscribe();
            }

            
            {
                this$0 = OperatorSkipUntil.this;
                gate = atomicboolean;
                s = serializedsubscriber;
                super();
            }
        };
        final_subscriber.add(subscriber);
        other.unsafeSubscribe(subscriber);
        return new Subscriber(s) {

            final OperatorSkipUntil this$0;
            final AtomicBoolean val$gate;
            final SerializedSubscriber val$s;

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
                if (gate.get())
                {
                    s.onNext(obj);
                    return;
                } else
                {
                    request(1L);
                    return;
                }
            }

            
            {
                this$0 = OperatorSkipUntil.this;
                gate = atomicboolean;
                s = serializedsubscriber;
                super(final_subscriber);
            }
        };
    }
}
