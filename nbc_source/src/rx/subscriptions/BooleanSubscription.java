// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subscriptions;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.Subscription;
import rx.functions.Action0;

public final class BooleanSubscription
    implements Subscription
{

    static final AtomicIntegerFieldUpdater UNSUBSCRIBED_UPDATER = AtomicIntegerFieldUpdater.newUpdater(rx/subscriptions/BooleanSubscription, "unsubscribed");
    private final Action0 action;
    volatile int unsubscribed;

    public BooleanSubscription()
    {
        action = null;
    }

    private BooleanSubscription(Action0 action0)
    {
        action = action0;
    }

    public static BooleanSubscription create()
    {
        return new BooleanSubscription();
    }

    public static BooleanSubscription create(Action0 action0)
    {
        return new BooleanSubscription(action0);
    }

    public boolean isUnsubscribed()
    {
        return unsubscribed != 0;
    }

    public final void unsubscribe()
    {
        if (UNSUBSCRIBED_UPDATER.compareAndSet(this, 0, 1) && action != null)
        {
            action.call();
        }
    }

}
