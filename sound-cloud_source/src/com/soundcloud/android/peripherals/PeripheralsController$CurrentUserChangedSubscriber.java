// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.peripherals;

import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.peripherals:
//            PeripheralsController

private class <init> extends DefaultSubscriber
{

    final PeripheralsController this$0;

    public void onNext(CurrentUserChangedEvent currentuserchangedevent)
    {
        PeripheralsController.access$300(PeripheralsController.this);
    }

    public volatile void onNext(Object obj)
    {
        onNext((CurrentUserChangedEvent)obj);
    }

    private ()
    {
        this$0 = PeripheralsController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
