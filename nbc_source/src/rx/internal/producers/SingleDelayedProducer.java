// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.producers;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;

public final class SingleDelayedProducer extends AtomicInteger
    implements Producer
{

    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = 0xd81f64205ae9a74eL;
    final Subscriber child;
    Object value;

    public SingleDelayedProducer(Subscriber subscriber)
    {
        child = subscriber;
    }

    private static void emit(Subscriber subscriber, Object obj)
    {
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

    public void request(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("n >= 0 required");
        }
        int i;
        if (l != 0L)
        {
            do
            {
                i = get();
                if (i != 0)
                {
                    continue;
                }
            } while (!compareAndSet(0, 2));
        }
        do
        {
            return;
        } while (i != 1 || !compareAndSet(1, 3));
        emit(child, value);
    }

    public void setValue(Object obj)
    {
_L4:
        int i = get();
        if (i != 0) goto _L2; else goto _L1
_L1:
        value = obj;
        if (!compareAndSet(0, 1)) goto _L4; else goto _L3
_L3:
        return;
_L2:
        if (i == 2 && compareAndSet(2, 3))
        {
            emit(child, obj);
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }
}
