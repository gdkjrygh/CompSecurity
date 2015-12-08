// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.Subscription;
import rx.functions.Func1;

// Referenced classes of package rx.internal.util:
//            SubscriptionIndexedRingBuffer

final class 
    implements Func1
{

    public Boolean call(Subscription subscription)
    {
        subscription.unsubscribe();
        return Boolean.TRUE;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscription)obj);
    }

    ()
    {
    }
}
