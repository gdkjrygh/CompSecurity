// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Arrays;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.plugins.RxJavaErrorHandler;
import rx.plugins.RxJavaPlugins;

public final class OperatorOnErrorReturn
    implements rx.Observable.Operator
{

    final Func1 resultFunction;

    public OperatorOnErrorReturn(Func1 func1)
    {
        resultFunction = func1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber child)
    {
        Subscriber subscriber = new Subscriber() {

            private boolean done;
            final OperatorOnErrorReturn this$0;
            final Subscriber val$child;

            public void onCompleted()
            {
                if (done)
                {
                    return;
                } else
                {
                    done = true;
                    child.onCompleted();
                    return;
                }
            }

            public void onError(Throwable throwable)
            {
                if (done)
                {
                    Exceptions.throwIfFatal(throwable);
                    return;
                }
                done = true;
                try
                {
                    RxJavaPlugins.getInstance().getErrorHandler().handleError(throwable);
                    unsubscribe();
                    Object obj = resultFunction.call(throwable);
                    child.onNext(obj);
                }
                catch (Throwable throwable1)
                {
                    child.onError(new CompositeException(Arrays.asList(new Throwable[] {
                        throwable, throwable1
                    })));
                    return;
                }
                child.onCompleted();
            }

            public void onNext(Object obj)
            {
                if (done)
                {
                    return;
                } else
                {
                    child.onNext(obj);
                    return;
                }
            }

            public void setProducer(Producer producer)
            {
                child.setProducer(producer. new Producer() {

                    final _cls1 this$1;
                    final Producer val$producer;

                    public void request(long l)
                    {
                        producer.request(l);
                    }

            
            {
                this$1 = final__pcls1;
                producer = Producer.this;
                super();
            }
                });
            }

            
            {
                this$0 = OperatorOnErrorReturn.this;
                child = subscriber;
                super();
                done = false;
            }
        };
        child.add(subscriber);
        return subscriber;
    }
}
