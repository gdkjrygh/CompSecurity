// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subscriptions;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Subscription;

// Referenced classes of package rx.subscriptions:
//            RefCountSubscription

final class parent
    implements Subscription
{

    static final AtomicIntegerFieldUpdater INNER_DONE_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/subscriptions/RefCountSubscription$InnerSubscription, "innerDone");
    volatile int innerDone;
    final RefCountSubscription parent;

    public boolean isUnsubscribed()
    {
        return innerDone != 0;
    }

    public void unsubscribe()
    {
        if (INNER_DONE_UPDATER.compareAndSet(this, 0, 1))
        {
            parent.unsubscribeAChild();
        }
    }


    public (RefCountSubscription refcountsubscription)
    {
        parent = refcountsubscription;
    }
}
