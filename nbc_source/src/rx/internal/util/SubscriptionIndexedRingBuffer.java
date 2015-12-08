// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Subscription;
import rx.functions.Func1;

// Referenced classes of package rx.internal.util:
//            IndexedRingBuffer

public final class SubscriptionIndexedRingBuffer
    implements Subscription
{

    private static final Func1 UNSUBSCRIBE = new Func1() {

        public Boolean call(Subscription subscription)
        {
            subscription.unsubscribe();
            return Boolean.TRUE;
        }

        public volatile Object call(Object obj)
        {
            return call((Subscription)obj);
        }

    };
    private static final AtomicIntegerFieldUpdater UNSUBSCRIBED = AtomicIntegerFieldUpdater.newUpdater(rx/internal/util/SubscriptionIndexedRingBuffer, "unsubscribed");
    private volatile IndexedRingBuffer subscriptions;
    private volatile int unsubscribed;

    public SubscriptionIndexedRingBuffer()
    {
        subscriptions = IndexedRingBuffer.getInstance();
        unsubscribed = 0;
    }

    private static void unsubscribeFromAll(IndexedRingBuffer indexedringbuffer)
    {
        if (indexedringbuffer == null)
        {
            return;
        } else
        {
            indexedringbuffer.forEach(UNSUBSCRIBE);
            return;
        }
    }

    public int add(Subscription subscription)
    {
        this;
        JVM INSTR monitorenter ;
        if (unsubscribed != 1 && subscriptions != null) goto _L2; else goto _L1
_L1:
        subscription.unsubscribe();
        int i = -1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        int j = subscriptions.add(subscription);
        i = j;
        if (unsubscribed != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        subscription.unsubscribe();
        i = j;
        if (true) goto _L4; else goto _L3
_L3:
        subscription;
        throw subscription;
    }

    public int forEach(Func1 func1)
    {
        return forEach(func1, 0);
    }

    public int forEach(Func1 func1, int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (unsubscribed == 1) goto _L2; else goto _L1
_L1:
        IndexedRingBuffer indexedringbuffer = subscriptions;
        if (indexedringbuffer != null) goto _L3; else goto _L2
_L2:
        i = 0;
_L5:
        this;
        JVM INSTR monitorexit ;
        return i;
_L3:
        i = subscriptions.forEach(func1, i);
        if (true) goto _L5; else goto _L4
_L4:
        func1;
        throw func1;
    }

    public boolean isUnsubscribed()
    {
        return unsubscribed == 1;
    }

    public void remove(int i)
    {
        Subscription subscription;
        if (unsubscribed != 1 && subscriptions != null && i >= 0)
        {
            if ((subscription = (Subscription)subscriptions.remove(i)) != null && subscription != null)
            {
                subscription.unsubscribe();
                return;
            }
        }
    }

    public void removeSilently(int i)
    {
        if (unsubscribed == 1 || subscriptions == null || i < 0)
        {
            return;
        } else
        {
            subscriptions.remove(i);
            return;
        }
    }

    public void unsubscribe()
    {
        if (UNSUBSCRIBED.compareAndSet(this, 0, 1) && subscriptions != null)
        {
            unsubscribeFromAll(subscriptions);
            IndexedRingBuffer indexedringbuffer = subscriptions;
            subscriptions = null;
            indexedringbuffer.unsubscribe();
        }
    }

}
