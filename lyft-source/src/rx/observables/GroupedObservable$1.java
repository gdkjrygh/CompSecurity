// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observables;

import rx.Observable;
import rx.Subscriber;

// Referenced classes of package rx.observables:
//            GroupedObservable

final class val.o
    implements rx.be
{

    final Observable val$o;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        val$o.unsafeSubscribe(subscriber);
    }

    ()
    {
        val$o = observable;
        super();
    }
}
