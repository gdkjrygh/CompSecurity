// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import rx.Observable;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.rx:
//            BusEvent

public class BehaviorSubjectEvent
    implements BusEvent
{

    BehaviorSubject subject;

    public BehaviorSubjectEvent()
    {
        subject = BehaviorSubject.create();
    }

    public Observable observe()
    {
        return subject.asObservable();
    }

    public void post(Object obj)
    {
        subject.onNext(obj);
    }
}
