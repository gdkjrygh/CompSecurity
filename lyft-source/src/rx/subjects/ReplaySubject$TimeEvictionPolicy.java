// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import rx.Scheduler;
import rx.schedulers.Timestamped;

final class scheduler
    implements scheduler
{

    final long maxAgeMillis;
    final Scheduler scheduler;

    public void evict(scheduler scheduler1)
    {
        for (long l = scheduler.now(); !scheduler1.scheduler() && test(scheduler1.test.test., l); scheduler1.t()) { }
    }

    public void evictFinal(t t)
    {
        for (long l = scheduler.now(); t.scheduler > 1 && test(t.test.test., l); t.t()) { }
    }

    public boolean test(Object obj, long l)
    {
        return ((Timestamped)obj).getTimestampMillis() <= l - maxAgeMillis;
    }

    public (long l, Scheduler scheduler1)
    {
        maxAgeMillis = l;
        scheduler = scheduler1;
    }
}
