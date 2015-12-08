// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.observers.SerializedSubscriber;

public final class OperatorTakeUntil
    implements rx.Observable.Operator
{

    private final Observable other;

    public OperatorTakeUntil(Observable observable)
    {
        other = observable;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        final SerializedSubscriber final_subscriber = new SerializedSubscriber(subscriber, false);
        final Subscriber main = new Subscriber(false, final_subscriber) {

            final OperatorTakeUntil this$0;
            final Subscriber val$serial;

            public void onCompleted()
            {
                serial.onCompleted();
                serial.unsubscribe();
                return;
                Exception exception;
                exception;
                serial.unsubscribe();
                throw exception;
            }

            public void onError(Throwable throwable)
            {
                serial.onError(throwable);
                serial.unsubscribe();
                return;
                throwable;
                serial.unsubscribe();
                throw throwable;
            }

            public void onNext(Object obj)
            {
                serial.onNext(obj);
            }

            
            {
                this$0 = OperatorTakeUntil.this;
                serial = subscriber1;
                super(final_subscriber, flag);
            }
        };
        Subscriber subscriber1 = new Subscriber() {

            final OperatorTakeUntil this$0;
            final Subscriber val$main;

            public void onCompleted()
            {
                main.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                main.onError(throwable);
            }

            public void onNext(Object obj)
            {
                onCompleted();
            }

            public void onStart()
            {
                request(0x7fffffffffffffffL);
            }

            
            {
                this$0 = OperatorTakeUntil.this;
                main = subscriber;
                super();
            }
        };
        final_subscriber.add(main);
        final_subscriber.add(subscriber1);
        subscriber.add(final_subscriber);
        other.unsafeSubscribe(subscriber1);
        return main;
    }
}
