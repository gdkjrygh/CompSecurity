// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.widget;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback.widget:
//            PlayerWidgetController, PlayerWidgetPresenter

private class <init> extends DefaultSubscriber
{

    final PlayerWidgetController this$0;

    public void onNext(PropertySet propertyset)
    {
        PlayerWidgetController.access$800(PlayerWidgetController.this).updateTrackInformation(PlayerWidgetController.access$700(PlayerWidgetController.this), propertyset);
    }

    public volatile void onNext(Object obj)
    {
        onNext((PropertySet)obj);
    }

    private ()
    {
        this$0 = PlayerWidgetController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
