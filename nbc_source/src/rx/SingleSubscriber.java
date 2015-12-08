// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.internal.util.SubscriptionList;

// Referenced classes of package rx:
//            Subscription

public abstract class SingleSubscriber
    implements Subscription
{

    private final SubscriptionList cs = new SubscriptionList();

    public SingleSubscriber()
    {
    }

    public final void add(Subscription subscription)
    {
        cs.add(subscription);
    }

    public final boolean isUnsubscribed()
    {
        return cs.isUnsubscribed();
    }

    public abstract void onError(Throwable throwable);

    public abstract void onSuccess(Object obj);

    public final void unsubscribe()
    {
        cs.unsubscribe();
    }
}
