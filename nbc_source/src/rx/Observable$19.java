// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.functions.Func0;
import rx.internal.operators.OperatorReplay;
import rx.subjects.ReplaySubject;
import rx.subjects.Subject;

// Referenced classes of package rx:
//            Observable, Scheduler

class <init>
    implements Func0
{

    final Observable this$0;
    final int val$bufferSize;
    final Scheduler val$scheduler;

    public volatile Object call()
    {
        return call();
    }

    public final Subject call()
    {
        return OperatorReplay.createScheduledSubject(ReplaySubject.createWithSize(val$bufferSize), val$scheduler);
    }

    ct()
    {
        this$0 = final_observable;
        val$bufferSize = i;
        val$scheduler = Scheduler.this;
        super();
    }
}
