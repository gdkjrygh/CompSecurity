// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.schedulers;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package rx.internal.schedulers:
//            ScheduledAction

private static final class parent extends AtomicBoolean
    implements Subscription
{

    private static final long serialVersionUID = 0x36e5888d681586eL;
    final CompositeSubscription parent;
    final ScheduledAction s;

    public boolean isUnsubscribed()
    {
        return s.isUnsubscribed();
    }

    public void unsubscribe()
    {
        if (compareAndSet(false, true))
        {
            parent.remove(s);
        }
    }

    public (ScheduledAction scheduledaction, CompositeSubscription compositesubscription)
    {
        s = scheduledaction;
        parent = compositesubscription;
    }
}
