// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.analytics:
//            ScreenProvider

private class <init> extends DefaultSubscriber
{

    final ScreenProvider this$0;

    public void onNext(ScreenEvent screenevent)
    {
        ScreenProvider.access$102(ScreenProvider.this, screenevent.getScreenTag());
    }

    public volatile void onNext(Object obj)
    {
        onNext((ScreenEvent)obj);
    }

    private ()
    {
        this$0 = ScreenProvider.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
