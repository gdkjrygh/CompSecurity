// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.producers;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;

public final class SingleProducer extends AtomicBoolean
    implements Producer
{

    private static final long serialVersionUID = 0xd175ac47992501d4L;
    final Subscriber child;
    final Object value;

    public SingleProducer(Subscriber subscriber, Object obj)
    {
        child = subscriber;
        value = obj;
    }

    public void request(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("n >= 0 required");
        }
        break MISSING_BLOCK_LABEL_16;
        if (l != 0L && compareAndSet(false, true))
        {
            Subscriber subscriber = child;
            Object obj = value;
            if (!subscriber.isUnsubscribed())
            {
                try
                {
                    subscriber.onNext(obj);
                }
                catch (Throwable throwable)
                {
                    Exceptions.throwIfFatal(throwable);
                    subscriber.onError(OnErrorThrowable.addValueAsLastCause(throwable, obj));
                    return;
                }
                if (!subscriber.isUnsubscribed())
                {
                    subscriber.onCompleted();
                    return;
                }
            }
        }
        return;
    }
}
