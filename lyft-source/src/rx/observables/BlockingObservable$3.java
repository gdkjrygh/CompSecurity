// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observables;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import rx.Subscriber;

// Referenced classes of package rx.observables:
//            BlockingObservable

class ference extends Subscriber
{

    final BlockingObservable this$0;
    final CountDownLatch val$latch;
    final AtomicReference val$returnException;
    final AtomicReference val$returnItem;

    public void onCompleted()
    {
        val$latch.countDown();
    }

    public void onError(Throwable throwable)
    {
        val$returnException.set(throwable);
        val$latch.countDown();
    }

    public void onNext(Object obj)
    {
        val$returnItem.set(obj);
    }

    ference()
    {
        this$0 = final_blockingobservable;
        val$latch = countdownlatch;
        val$returnException = atomicreference;
        val$returnItem = AtomicReference.this;
        super();
    }
}
