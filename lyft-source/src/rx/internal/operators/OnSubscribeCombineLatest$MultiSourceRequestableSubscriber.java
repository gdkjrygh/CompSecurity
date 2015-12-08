// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Subscriber;

final class request extends Subscriber
{

    final AtomicLong emitted = new AtomicLong();
    boolean hasValue;
    final int index;
    final request producer;

    public void onCompleted()
    {
        producer.producer(index, hasValue);
    }

    public void onError(Throwable throwable)
    {
        producer.producer(throwable);
    }

    public void onNext(Object obj)
    {
        hasValue = true;
        emitted.incrementAndGet();
        if (!producer.producer(index, obj))
        {
            request(1L);
        }
    }

    public void requestUpTo(long l)
    {
        long l1;
        long l2;
        do
        {
            l1 = emitted.get();
            l2 = Math.min(l1, l);
        } while (!emitted.compareAndSet(l1, l1 - l2));
        request(l2);
    }

    public (int i, int j, Subscriber subscriber,  )
    {
        super(subscriber);
        hasValue = false;
        index = i;
        producer = ;
        request(j);
    }
}
