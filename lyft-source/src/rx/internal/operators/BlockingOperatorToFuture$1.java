// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            BlockingOperatorToFuture

final class val.value extends Subscriber
{

    final AtomicReference val$error;
    final CountDownLatch val$finished;
    final AtomicReference val$value;

    public void onCompleted()
    {
        val$finished.countDown();
    }

    public void onError(Throwable throwable)
    {
        val$error.compareAndSet(null, throwable);
        val$finished.countDown();
    }

    public void onNext(Object obj)
    {
        val$value.set(obj);
    }

    ()
    {
        val$finished = countdownlatch;
        val$error = atomicreference;
        val$value = atomicreference1;
        super();
    }
}
