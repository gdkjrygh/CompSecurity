// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subscriptions;

import java.util.concurrent.Future;
import rx.Subscription;
import rx.functions.Action0;

// Referenced classes of package rx.subscriptions:
//            BooleanSubscription, CompositeSubscription

public final class Subscriptions
{
    private static final class FutureSubscription
        implements Subscription
    {

        final Future f;

        public boolean isUnsubscribed()
        {
            return f.isCancelled();
        }

        public void unsubscribe()
        {
            f.cancel(true);
        }

        public FutureSubscription(Future future)
        {
            f = future;
        }
    }

    private static final class Unsubscribed
        implements Subscription
    {

        public boolean isUnsubscribed()
        {
            return true;
        }

        public void unsubscribe()
        {
        }

        private Unsubscribed()
        {
        }

    }


    private static final Unsubscribed UNSUBSCRIBED = new Unsubscribed();

    private Subscriptions()
    {
        throw new IllegalStateException("No instances!");
    }

    public static Subscription create(Action0 action0)
    {
        return BooleanSubscription.create(action0);
    }

    public static Subscription empty()
    {
        return BooleanSubscription.create();
    }

    public static Subscription from(Future future)
    {
        return new FutureSubscription(future);
    }

    public static transient CompositeSubscription from(Subscription asubscription[])
    {
        return new CompositeSubscription(asubscription);
    }

    public static Subscription unsubscribed()
    {
        return UNSUBSCRIBED;
    }

}
