// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import rx.functions.Action0;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeRefCount

class val.current
    implements Action0
{

    final OnSubscribeRefCount this$0;
    final CompositeSubscription val$current;

    public void call()
    {
        OnSubscribeRefCount.access$100(OnSubscribeRefCount.this).lock();
        if (OnSubscribeRefCount.access$000(OnSubscribeRefCount.this) == val$current && OnSubscribeRefCount.access$200(OnSubscribeRefCount.this).decrementAndGet() == 0)
        {
            OnSubscribeRefCount.access$000(OnSubscribeRefCount.this).unsubscribe();
            OnSubscribeRefCount.access$002(OnSubscribeRefCount.this, new CompositeSubscription());
        }
        OnSubscribeRefCount.access$100(OnSubscribeRefCount.this).unlock();
        return;
        Exception exception;
        exception;
        OnSubscribeRefCount.access$100(OnSubscribeRefCount.this).unlock();
        throw exception;
    }

    ()
    {
        this$0 = final_onsubscriberefcount;
        val$current = CompositeSubscription.this;
        super();
    }
}
