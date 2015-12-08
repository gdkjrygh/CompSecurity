// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.functions.Func1;

// Referenced classes of package rx:
//            Observable, Scheduler

class <init>
    implements Func1
{

    final Observable this$0;
    final Scheduler val$scheduler;
    final Func1 val$selector;

    public volatile Object call(Object obj)
    {
        return call((Observable)obj);
    }

    public Observable call(Observable observable)
    {
        return ((Observable)val$selector.call(observable)).observeOn(val$scheduler);
    }

    _cls1()
    {
        this$0 = final_observable;
        val$selector = func1;
        val$scheduler = Scheduler.this;
        super();
    }
}
