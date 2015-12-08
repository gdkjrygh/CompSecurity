// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.internal.producers.ProducerArbiter;
import rx.plugins.RxJavaErrorHandler;
import rx.plugins.RxJavaPlugins;
import rx.subscriptions.SerialSubscription;

public final class OperatorOnErrorResumeNextViaFunction
    implements rx.Observable.Operator
{

    private final Func1 resumeFunction;

    public OperatorOnErrorResumeNextViaFunction(Func1 func1)
    {
        resumeFunction = func1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber child)
    {
        final ProducerArbiter pa = new ProducerArbiter();
        final SerialSubscription ssub = new SerialSubscription();
        Subscriber subscriber = new Subscriber() {

            private boolean done;
            final OperatorOnErrorResumeNextViaFunction this$0;
            final Subscriber val$child;
            final ProducerArbiter val$pa;
            final SerialSubscription val$ssub;

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
                    Subscriber subscriber1 = new Subscriber() {

                        final _cls1 this$1;

                        public void onCompleted()
                        {
                            child.onCompleted();
                        }

                        public void onError(Throwable throwable)
                        {
                            child.onError(throwable);
                        }

                        public void onNext(Object obj)
                        {
                            child.onNext(obj);
                        }

                        public void setProducer(Producer producer)
                        {
                            pa.setProducer(producer);
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    };
                    ssub.set(subscriber1);
                    ((Observable)resumeFunction.call(throwable)).unsafeSubscribe(subscriber1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Throwable throwable)
                {
                    child.onError(throwable);
                }
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
                pa.setProducer(producer);
            }

            
            {
                this$0 = OperatorOnErrorResumeNextViaFunction.this;
                child = subscriber;
                pa = producerarbiter;
                ssub = serialsubscription;
                super();
                done = false;
            }
        };
        child.add(ssub);
        ssub.set(subscriber);
        child.setProducer(pa);
        return subscriber;
    }

}
