// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.internal.producers.SingleDelayedProducer;

public final class OperatorAll
    implements rx.Observable.Operator
{

    private final Func1 predicate;

    public OperatorAll(Func1 func1)
    {
        predicate = func1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber child)
    {
        final SingleDelayedProducer producer = new SingleDelayedProducer(child);
        Subscriber subscriber = new Subscriber() {

            boolean done;
            final OperatorAll this$0;
            final Subscriber val$child;
            final SingleDelayedProducer val$producer;

            public void onCompleted()
            {
                if (!done)
                {
                    done = true;
                    producer.setValue(Boolean.valueOf(true));
                }
            }

            public void onError(Throwable throwable)
            {
                child.onError(throwable);
            }

            public void onNext(Object obj)
            {
                Boolean boolean1;
                try
                {
                    boolean1 = (Boolean)predicate.call(obj);
                }
                catch (Throwable throwable)
                {
                    Exceptions.throwIfFatal(throwable);
                    onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                    return;
                }
                if (!boolean1.booleanValue() && !done)
                {
                    done = true;
                    producer.setValue(Boolean.valueOf(false));
                    unsubscribe();
                }
            }

            
            {
                this$0 = OperatorAll.this;
                producer = singledelayedproducer;
                child = subscriber;
                super();
            }
        };
        child.add(subscriber);
        child.setProducer(producer);
        return subscriber;
    }

}
