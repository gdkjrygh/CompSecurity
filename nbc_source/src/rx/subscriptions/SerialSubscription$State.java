// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subscriptions;

import rx.Subscription;

// Referenced classes of package rx.subscriptions:
//            SerialSubscription

private static final class subscription
{

    final boolean isUnsubscribed;
    final Subscription subscription;

    subscription set(Subscription subscription1)
    {
        return new <init>(isUnsubscribed, subscription1);
    }

    isUnsubscribed unsubscribe()
    {
        return new <init>(true, subscription);
    }

    (boolean flag, Subscription subscription1)
    {
        isUnsubscribed = flag;
        subscription = subscription1;
    }
}
