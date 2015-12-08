// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import me.lyft.android.rx.SimpleSubscriber;
import rx.subjects.BehaviorSubject;

class this._cls0 extends SimpleSubscriber
{

    final onNext this$0;

    public void onNext(Long long1)
    {
        super.onNext(long1);
        merResult.onNext(long1);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Long)obj);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
