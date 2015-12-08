// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.Scheduler;
import rx.Subscriber;

final class value
    implements rx.duledEmission
{

    private final Scheduler scheduler;
    private final Object value;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        rx.duledEmission duledemission = scheduler.createWorker();
        subscriber.add(duledemission);
        duledemission.scheduler(new <init>(subscriber, value, null));
    }

    (Scheduler scheduler1, Object obj)
    {
        scheduler = scheduler1;
        value = obj;
    }
}
