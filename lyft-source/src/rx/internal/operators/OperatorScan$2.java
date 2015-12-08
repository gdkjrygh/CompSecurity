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

// Referenced classes of package rx.internal.operators:
//            OperatorScan

class initialized extends Subscriber
{

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
            if (initialValue != OperatorScan.access$100())
            {
                subscriber.onNext(initialValue);
            }
        }
    }

    public void onCompleted()
    {
        emitInitialValueIfNeeded(val$child);
        val$child.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        emitInitialValueIfNeeded(val$child);
        if (value != OperatorScan.access$100()) goto _L2; else goto _L1
_L1:
        value = obj;
_L4:
        val$child.onNext(value);
        return;
_L2:
        try
        {
            value = OperatorScan.access$200(OperatorScan.this).call(value, obj);
        }
        catch (Throwable throwable)
        {
            Exceptions.throwIfFatal(throwable);
            val$child.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setProducer(final Producer producer)
    {
        val$child.setProducer(new Producer() {

            final AtomicBoolean excessive = new AtomicBoolean();
            final AtomicBoolean once = new AtomicBoolean();
            final OperatorScan._cls2 this$1;
            final Producer val$producer;

            public void request(long l)
            {
                if (once.compareAndSet(false, true))
                {
                    if (initialValue == OperatorScan.access$100() || l == 0x7fffffffffffffffL)
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
                this$1 = OperatorScan._cls2.this;
                producer = producer1;
                super();
            }
        });
    }


    _cls1.val.producer(Subscriber subscriber1)
    {
        this$0 = final_operatorscan;
        val$child = subscriber1;
        super(Subscriber.this);
        initialValue = OperatorScan.access$000(OperatorScan.this).call();
        value = initialValue;
        initialized = false;
    }
}
