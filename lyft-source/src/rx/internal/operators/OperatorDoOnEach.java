// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;

public class OperatorDoOnEach
    implements rx.Observable.Operator
{

    private final Observer doOnEachObserver;

    public OperatorDoOnEach(Observer observer)
    {
        doOnEachObserver = observer;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        return new Subscriber(final_subscriber) {

            private boolean done;
            final OperatorDoOnEach this$0;
            final Subscriber val$observer;

            public void onCompleted()
            {
                if (done)
                {
                    return;
                }
                try
                {
                    doOnEachObserver.onCompleted();
                }
                catch (Throwable throwable)
                {
                    onError(throwable);
                    return;
                }
                done = true;
                observer.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                Exceptions.throwIfFatal(throwable);
                if (done)
                {
                    return;
                }
                done = true;
                try
                {
                    doOnEachObserver.onError(throwable);
                }
                // Misplaced declaration of an exception variable
                catch (Throwable throwable)
                {
                    observer.onError(throwable);
                    return;
                }
                observer.onError(throwable);
            }

            public void onNext(Object obj)
            {
                if (done)
                {
                    return;
                }
                try
                {
                    doOnEachObserver.onNext(obj);
                }
                catch (Throwable throwable)
                {
                    onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                    return;
                }
                observer.onNext(obj);
            }

            
            {
                this$0 = OperatorDoOnEach.this;
                observer = subscriber1;
                super(final_subscriber);
                done = false;
            }
        };
    }

}
