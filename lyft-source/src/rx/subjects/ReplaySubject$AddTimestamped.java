// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import rx.Scheduler;
import rx.functions.Func1;
import rx.schedulers.Timestamped;

final class scheduler
    implements Func1
{

    final Scheduler scheduler;

    public Object call(Object obj)
    {
        return new Timestamped(scheduler.now(), obj);
    }

    public (Scheduler scheduler1)
    {
        scheduler = scheduler1;
    }
}
