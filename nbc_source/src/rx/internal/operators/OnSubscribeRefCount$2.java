// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import rx.Subscriber;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeRefCount

class val.currentBase extends Subscriber
{

    final OnSubscribeRefCount this$0;
    final CompositeSubscription val$currentBase;
    final Subscriber val$subscriber;

    void cleanup()
    {
        OnSubscribeRefCount.access$100(OnSubscribeRefCount.this).lock();
        if (OnSubscribeRefCount.access$000(OnSubscribeRefCount.this) == val$currentBase)
        {
            OnSubscribeRefCount.access$000(OnSubscribeRefCount.this).unsubscribe();
            OnSubscribeRefCount.access$002(OnSubscribeRefCount.this, new CompositeSubscription());
            OnSubscribeRefCount.access$200(OnSubscribeRefCount.this).set(0);
        }
        OnSubscribeRefCount.access$100(OnSubscribeRefCount.this).unlock();
        return;
        Exception exception;
        exception;
        OnSubscribeRefCount.access$100(OnSubscribeRefCount.this).unlock();
        throw exception;
    }

    public void onCompleted()
    {
        cleanup();
        val$subscriber.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        cleanup();
        val$subscriber.onError(throwable);
    }

    public void onNext(Object obj)
    {
        val$subscriber.onNext(obj);
    }

    (CompositeSubscription compositesubscription)
    {
        this$0 = final_onsubscriberefcount;
        val$subscriber = Subscriber.this;
        val$currentBase = compositesubscription;
        super(final_subscriber1);
    }
}
