// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func0;
import rx.functions.Func2;

public final class OperatorScan
    implements rx.Observable.Operator
{

    private static final Object NO_INITIAL_VALUE = new Object();
    private final Func2 accumulator;
    private final Func0 initialValueFactory;

    public OperatorScan(final Object initialValue, Func2 func2)
    {
        this(new Func0() {

            final Object val$initialValue;

            public Object call()
            {
                return initialValue;
            }

            
            {
                initialValue = obj;
                super();
            }
        }, func2);
    }

    public OperatorScan(Func0 func0, Func2 func2)
    {
        initialValueFactory = func0;
        accumulator = func2;
    }

    public OperatorScan(Func2 func2)
    {
        this(NO_INITIAL_VALUE, func2);
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        return new Subscriber(final_subscriber) {

            private final Object initialValue;
            boolean initialized;
            final OperatorScan this$0;
            final Subscriber val$child;
            private Object value;

            private void emitInitialValueIfNeeded(Subscriber subscriber)
            {
                if (!initialized)
                {
                    initialized = true;
                    if (initialValue != OperatorScan.NO_INITIAL_VALUE)
                    {
                        subscriber.onNext(initialValue);
                    }
                }
            }

            public void onCompleted()
            {
                emitInitialValueIfNeeded(child);
                child.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                child.onError(throwable);
            }

            public void onNext(Object obj)
            {
                emitInitialValueIfNeeded(child);
                if (value != OperatorScan.NO_INITIAL_VALUE) goto _L2; else goto _L1
_L1:
                value = obj;
_L4:
                child.onNext(value);
                return;
_L2:
                try
                {
                    value = accumulator.call(value, obj);
                }
                catch (Throwable throwable)
                {
                    Exceptions.throwIfFatal(throwable);
                    child.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                    return;
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            public void setProducer(Producer producer)
            {
                child.setProducer(producer. new Producer() {

                    final AtomicBoolean excessive = new AtomicBoolean();
                    final AtomicBoolean once = new AtomicBoolean();
                    final _cls2 this$1;
                    final Producer val$producer;

                    public void request(long l)
                    {
                        if (once.compareAndSet(false, true))
                        {
                            if (initialValue == OperatorScan.NO_INITIAL_VALUE || l == 0x7fffffffffffffffL)
                            {
                                producer.request(l);
                                return;
                            }
                            if (l == 1L)
                            {
                                excessive.set(true);
                                producer.request(1L);
                                return;
                            } else
                            {
                                producer.request(l - 1L);
                                return;
                            }
                        }
                        if (l > 1L && excessive.compareAndSet(true, false) && l != 0x7fffffffffffffffL)
                        {
                            producer.request(l - 1L);
                            return;
                        } else
                        {
                            producer.request(l);
                            return;
                        }
                    }

            
            {
                this$1 = final__pcls2;
                producer = Producer.this;
                super();
            }
                });
            }


            
            {
                this$0 = OperatorScan.this;
                child = subscriber1;
                super(final_subscriber);
                initialValue = initialValueFactory.call();
                value = initialValue;
                initialized = false;
            }
        };
    }




}
