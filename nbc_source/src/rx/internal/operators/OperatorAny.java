// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.internal.producers.SingleDelayedProducer;

public final class OperatorAny
    implements rx.Observable.Operator
{

    private final Func1 predicate;
    private final boolean returnOnEmpty;

    public OperatorAny(Func1 func1, boolean flag)
    {
        predicate = func1;
        returnOnEmpty = flag;
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
            boolean hasElements;
            final OperatorAny this$0;
            final Subscriber val$child;
            final SingleDelayedProducer val$producer;

            public void onCompleted()
            {
label0:
                {
                    if (!done)
                    {
                        done = true;
                        if (!hasElements)
                        {
                            break label0;
                        }
                        producer.setValue(Boolean.valueOf(false));
                    }
                    return;
                }
                producer.setValue(Boolean.valueOf(returnOnEmpty));
            }

            public void onError(Throwable throwable)
            {
                child.onError(throwable);
            }

            public void onNext(Object obj)
            {
                hasElements = true;
                boolean flag;
                try
                {
                    flag = ((Boolean)predicate.call(obj)).booleanValue();
                }
                catch (Throwable throwable)
                {
                    Exceptions.throwIfFatal(throwable);
                    onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                    return;
                }
                if (flag && !done)
                {
                    done = true;
                    obj = producer;
                    boolean flag1;
                    if (!returnOnEmpty)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    ((SingleDelayedProducer) (obj)).setValue(Boolean.valueOf(flag1));
                    unsubscribe();
                }
            }

            
            {
                this$0 = OperatorAny.this;
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
