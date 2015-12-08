// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import rx.Subscriber;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.rx:
//            ReactiveProperty

final class val.subject
    implements rx.ibe
{

    final BehaviorSubject val$subject;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        val$subject.subscribe(subscriber);
    }

    ()
    {
        val$subject = behaviorsubject;
        super();
    }
}
