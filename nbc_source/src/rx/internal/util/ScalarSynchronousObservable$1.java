// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.Subscriber;

// Referenced classes of package rx.internal.util:
//            ScalarSynchronousObservable

class val.t
    implements rx.sObservable._cls1
{

    final Object val$t;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        subscriber.onNext(val$t);
        subscriber.onCompleted();
    }

    ()
    {
        val$t = obj;
        super();
    }
}
