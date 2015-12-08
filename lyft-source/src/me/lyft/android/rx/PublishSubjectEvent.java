// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import rx.Observable;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.rx:
//            BusEvent

public class PublishSubjectEvent
    implements BusEvent
{

    PublishSubject subject;

    public PublishSubjectEvent()
    {
        subject = PublishSubject.create();
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
