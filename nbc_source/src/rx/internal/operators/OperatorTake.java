// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;
import rx.Subscriber;

public final class OperatorTake
    implements rx.Observable.Operator
{

    final int limit;

    public OperatorTake(int i)
    {
        limit = i;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber child)
    {
        Subscriber subscriber = new Subscriber() {

            boolean completed;
            int count;
            final OperatorTake this$0;
            final Subscriber val$child;

            public void onCompleted()
            {
                if (!completed)
                {
                    child.onCompleted();
                }
            }

            public void onError(Throwable throwable)
            {
                if (!completed)
                {
                    child.onError(throwable);
                }
            }

            public void onNext(Object obj)
            {
                if (!isUnsubscribed())
                {
                    int i = count + 1;
                    count = i;
                    if (i >= limit)
                    {
                        completed = true;
                    }
                    child.onNext(obj);
                    if (completed)
                    {
                        child.onCompleted();
                        unsubscribe();
                    }
                }
            }

            public void setProducer(Producer producer)
            {
                child.setProducer(producer. new Producer() {

                    final AtomicLong requested = new AtomicLong(0L);
                    final _cls1 this$1;
                    final Producer val$producer;

                    public void request(long l)
                    {
                        if (l <= 0L || completed) goto _L2; else goto _L1
_L1:
                        long l1;
                        long l2;
                        l1 = requested.get();
                        l2 = Math.min(l, (long)limit - l1);
                        if (l2 != 0L)
                        {
                            continue; /* Loop/switch isn't completed */
                        }
_L2:
                        return;
                        if (!requested.compareAndSet(l1, l1 + l2)) goto _L1; else goto _L3
_L3:
                        producer.request(l2);
                        return;
                    }

            
            {
                this$1 = final__pcls1;
                producer = Producer.this;
                super();
            }
                });
            }

            
            {
                this$0 = OperatorTake.this;
                child = subscriber;
                super();
                count = 0;
                completed = false;
            }
        };
        if (limit == 0)
        {
            child.onCompleted();
            subscriber.unsubscribe();
        }
        child.add(subscriber);
        return subscriber;
    }
}
