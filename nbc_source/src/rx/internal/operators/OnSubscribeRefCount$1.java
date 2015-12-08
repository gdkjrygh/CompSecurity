// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action1;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeRefCount

class val.writeLocked
    implements Action1
{

    final OnSubscribeRefCount this$0;
    final Subscriber val$subscriber;
    final AtomicBoolean val$writeLocked;

    public volatile void call(Object obj)
    {
        call((Subscription)obj);
    }

    public void call(Subscription subscription)
    {
        OnSubscribeRefCount.access$000(OnSubscribeRefCount.this).add(subscription);
        doSubscribe(val$subscriber, OnSubscribeRefCount.access$000(OnSubscribeRefCount.this));
        OnSubscribeRefCount.access$100(OnSubscribeRefCount.this).unlock();
        val$writeLocked.set(false);
        return;
        subscription;
        OnSubscribeRefCount.access$100(OnSubscribeRefCount.this).unlock();
        val$writeLocked.set(false);
        throw subscription;
    }

    ()
    {
        this$0 = final_onsubscriberefcount;
        val$subscriber = subscriber1;
        val$writeLocked = AtomicBoolean.this;
        super();
    }
}
