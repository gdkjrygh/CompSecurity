// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subscriptions;

import java.util.concurrent.Future;
import rx.Subscription;

// Referenced classes of package rx.subscriptions:
//            Subscriptions

private static final class f
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

    public (Future future)
    {
        f = future;
    }
}
