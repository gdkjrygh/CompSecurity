// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observables;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import rx.Subscriber;
import rx.functions.Action1;

// Referenced classes of package rx.observables:
//            BlockingObservable

class val.onNext extends Subscriber
{

    final BlockingObservable this$0;
    final AtomicReference val$exceptionFromOnError;
    final CountDownLatch val$latch;
    final Action1 val$onNext;

    public void onCompleted()
    {
        val$latch.countDown();
    }

    public void onError(Throwable throwable)
    {
        val$exceptionFromOnError.set(throwable);
        val$latch.countDown();
    }

    public void onNext(Object obj)
    {
        val$onNext.call(obj);
    }

    ference()
    {
        this$0 = final_blockingobservable;
        val$latch = countdownlatch;
        val$exceptionFromOnError = atomicreference;
        val$onNext = Action1.this;
        super();
    }
}
