// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.events.ActivityLifeCycleEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.ads:
//            AdsController

private class <init> extends DefaultSubscriber
{

    final AdsController this$0;

    public void onNext(ActivityLifeCycleEvent activitylifecycleevent)
    {
        AdsController.access$1802(AdsController.this, activitylifecycleevent);
    }

    public volatile void onNext(Object obj)
    {
        onNext((ActivityLifeCycleEvent)obj);
    }

    private ()
    {
        this$0 = AdsController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
