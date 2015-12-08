// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.schedulers;

import java.util.concurrent.Future;
import rx.Subscription;

// Referenced classes of package rx.internal.schedulers:
//            ScheduledAction

private final class <init>
    implements Subscription
{

    private final Future f;
    final ScheduledAction this$0;

    public boolean isUnsubscribed()
    {
        return f.isCancelled();
    }

    public void unsubscribe()
    {
        if (get() != Thread.currentThread())
        {
            f.cancel(true);
            return;
        } else
        {
            f.cancel(false);
            return;
        }
    }

    private (Future future)
    {
        this$0 = ScheduledAction.this;
        super();
        f = future;
    }

    f(Future future, f f1)
    {
        this(future);
    }
}
