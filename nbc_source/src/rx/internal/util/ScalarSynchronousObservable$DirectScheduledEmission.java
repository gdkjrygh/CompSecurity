// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.Subscriber;
import rx.internal.schedulers.EventLoopsScheduler;

// Referenced classes of package rx.internal.util:
//            ScalarSynchronousObservable

static final class value
    implements rx.duledEmission
{

    private final EventLoopsScheduler es;
    private final Object value;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        subscriber.add(es.scheduleDirect(new <init>(subscriber, value, null)));
    }

    (EventLoopsScheduler eventloopsscheduler, Object obj)
    {
        es = eventloopsscheduler;
        value = obj;
    }
}
