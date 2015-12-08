// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func2;
import rx.observers.SerializedSubscriber;

public final class OperatorWithLatestFrom
    implements rx.Observable.Operator
{

    static final Object EMPTY = new Object();
    final Observable other;
    final Func2 resultSelector;

    public OperatorWithLatestFrom(Observable observable, Func2 func2)
    {
        other = observable;
        resultSelector = func2;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        final SerializedSubscriber final_subscriber = new SerializedSubscriber(subscriber, false);
        subscriber.add(final_subscriber);
        final AtomicReference current = new AtomicReference(EMPTY);
        subscriber = new Subscriber(current, final_subscriber) {

            final OperatorWithLatestFrom this$0;
            final AtomicReference val$current;
            final SerializedSubscriber val$s;

            public void onCompleted()
            {
                s.onCompleted();
                s.unsubscribe();
            }

            public void onError(Throwable throwable)
            {
                s.onError(throwable);
                s.unsubscribe();
            }

            public void onNext(Object obj)
            {
                Object obj1;
                obj1 = current.get();
                if (obj1 == OperatorWithLatestFrom.EMPTY)
                {
                    break MISSING_BLOCK_LABEL_38;
                }
                obj = resultSelector.call(obj, obj1);
                s.onNext(obj);
                return;
                obj;
                onError(((Throwable) (obj)));
                return;
            }

            
            {
                this$0 = OperatorWithLatestFrom.this;
                current = atomicreference;
                s = serializedsubscriber;
                super(final_subscriber, final_flag);
            }
        };
        current = new Subscriber() {

            final OperatorWithLatestFrom this$0;
            final AtomicReference val$current;
            final SerializedSubscriber val$s;

            public void onCompleted()
            {
                if (current.get() == OperatorWithLatestFrom.EMPTY)
                {
                    s.onCompleted();
                    s.unsubscribe();
                }
            }

            public void onError(Throwable throwable)
            {
                s.onError(throwable);
                s.unsubscribe();
            }

            public void onNext(Object obj)
            {
                current.set(obj);
            }

            
            {
                this$0 = OperatorWithLatestFrom.this;
                current = atomicreference;
                s = serializedsubscriber;
                super();
            }
        };
        final_subscriber.add(subscriber);
        final_subscriber.add(current);
        other.unsafeSubscribe(current);
        return subscriber;
    }

}
