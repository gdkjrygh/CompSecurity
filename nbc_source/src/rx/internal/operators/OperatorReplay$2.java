// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorReplay

static final class val.target
    implements rx.cribe
{

    final Observable val$target;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        val$target.unsafeSubscribe(subscriber);
    }

    (Observable observable)
    {
        val$target = observable;
        super();
    }
}
