// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.internal.operators:
//            OperatorTimeoutBase

public class OperatorTimeoutWithSelector extends OperatorTimeoutBase
{

    public OperatorTimeoutWithSelector(final Func0 firstTimeoutSelector, final Func1 timeoutSelector, Observable observable)
    {
        super(new OperatorTimeoutBase.FirstTimeoutStub() {

            final Func0 val$firstTimeoutSelector;

            public volatile Object call(Object obj, Object obj1, Object obj2)
            {
                return call((OperatorTimeoutBase.TimeoutSubscriber)obj, (Long)obj1, (rx.Scheduler.Worker)obj2);
            }

            public Subscription call(final OperatorTimeoutBase.TimeoutSubscriber timeoutSubscriber, Long long1, rx.Scheduler.Worker worker)
            {
                if (firstTimeoutSelector != null)
                {
                    try
                    {
                        worker = (Observable)firstTimeoutSelector.call();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Long long1)
                    {
                        Exceptions.throwIfFatal(long1);
                        timeoutSubscriber.onError(long1);
                        return Subscriptions.unsubscribed();
                    }
                    return worker.unsafeSubscribe(long1. new Subscriber() {

                        final _cls1 this$1;
                        final Long val$seqId;
                        final OperatorTimeoutBase.TimeoutSubscriber val$timeoutSubscriber;

                        public void onCompleted()
                        {
                            timeoutSubscriber.onTimeout(seqId.longValue());
                        }

                        public void onError(Throwable throwable)
                        {
                            timeoutSubscriber.onError(throwable);
                        }

                        public void onNext(Object obj)
                        {
                            timeoutSubscriber.onTimeout(seqId.longValue());
                        }

            
            {
                this$1 = final__pcls1;
                timeoutSubscriber = timeoutsubscriber;
                seqId = Long.this;
                super();
            }
                    });
                } else
                {
                    return Subscriptions.unsubscribed();
                }
            }

            
            {
                firstTimeoutSelector = func0;
                super();
            }
        }, new OperatorTimeoutBase.TimeoutStub() {

            final Func1 val$timeoutSelector;

            public volatile Object call(Object obj, Object obj1, Object obj2, Object obj3)
            {
                return call((OperatorTimeoutBase.TimeoutSubscriber)obj, (Long)obj1, obj2, (rx.Scheduler.Worker)obj3);
            }

            public Subscription call(final OperatorTimeoutBase.TimeoutSubscriber timeoutSubscriber, Long long1, Object obj, rx.Scheduler.Worker worker)
            {
                try
                {
                    obj = (Observable)timeoutSelector.call(obj);
                }
                // Misplaced declaration of an exception variable
                catch (Long long1)
                {
                    Exceptions.throwIfFatal(long1);
                    timeoutSubscriber.onError(long1);
                    return Subscriptions.unsubscribed();
                }
                return ((Observable) (obj)).unsafeSubscribe(long1. new Subscriber() {

                    final _cls2 this$1;
                    final Long val$seqId;
                    final OperatorTimeoutBase.TimeoutSubscriber val$timeoutSubscriber;

                    public void onCompleted()
                    {
                        timeoutSubscriber.onTimeout(seqId.longValue());
                    }

                    public void onError(Throwable throwable)
                    {
                        timeoutSubscriber.onError(throwable);
                    }

                    public void onNext(Object obj)
                    {
                        timeoutSubscriber.onTimeout(seqId.longValue());
                    }

            
            {
                this$1 = final__pcls2;
                timeoutSubscriber = timeoutsubscriber;
                seqId = Long.this;
                super();
            }
                });
            }

            
            {
                timeoutSelector = func1;
                super();
            }
        }, observable, Schedulers.immediate());
    }

    public volatile Subscriber call(Subscriber subscriber)
    {
        return super.call(subscriber);
    }
}
