// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import java.util.concurrent.TimeUnit;
import rx.functions.Func0;
import rx.subjects.ReplaySubject;
import rx.subjects.Subject;

// Referenced classes of package rx:
//            Observable, Scheduler

class <init>
    implements Func0
{

    final Observable this$0;
    final Scheduler val$scheduler;
    final long val$time;
    final TimeUnit val$unit;

    public volatile Object call()
    {
        return call();
    }

    public final Subject call()
    {
        return ReplaySubject.createWithTime(val$time, val$unit, val$scheduler);
    }

    ent.TimeUnit()
    {
        this$0 = final_observable;
        val$time = l;
        val$unit = timeunit;
        val$scheduler = Scheduler.this;
        super();
    }
}
