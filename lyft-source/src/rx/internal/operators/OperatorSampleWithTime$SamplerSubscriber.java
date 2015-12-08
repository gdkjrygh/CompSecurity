// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rx.Subscriber;
import rx.functions.Action0;

final class subscriber extends Subscriber
    implements Action0
{

    private static final Object EMPTY_TOKEN = new Object();
    static final AtomicReferenceFieldUpdater VALUE_UPDATER = AtomicReferenceFieldUpdater.newUpdater(rx/internal/operators/OperatorSampleWithTime$SamplerSubscriber, java/lang/Object, "value");
    private final Subscriber subscriber;
    volatile Object value;

    public void call()
    {
        Object obj;
        obj = VALUE_UPDATER.getAndSet(this, EMPTY_TOKEN);
        if (obj == EMPTY_TOKEN)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        subscriber.onNext(obj);
        return;
        Throwable throwable;
        throwable;
        onError(throwable);
        return;
    }

    public void onCompleted()
    {
        subscriber.onCompleted();
        unsubscribe();
    }

    public void onError(Throwable throwable)
    {
        subscriber.onError(throwable);
        unsubscribe();
    }

    public void onNext(Object obj)
    {
        value = obj;
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }


    public (Subscriber subscriber1)
    {
        value = EMPTY_TOKEN;
        subscriber = subscriber1;
    }
}
