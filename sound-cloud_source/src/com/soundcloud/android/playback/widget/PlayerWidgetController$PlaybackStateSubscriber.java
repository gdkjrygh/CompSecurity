// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.widget;

import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback.widget:
//            PlayerWidgetController, PlayerWidgetPresenter

private class <init> extends DefaultSubscriber
{

    final PlayerWidgetController this$0;

    public void onNext(com.soundcloud.android.playback.criber criber)
    {
        PlayerWidgetController.access$800(PlayerWidgetController.this).updatePlayState(PlayerWidgetController.access$700(PlayerWidgetController.this), criber._mth0());
    }

    public volatile void onNext(Object obj)
    {
        onNext((com.soundcloud.android.playback.criber.onNext)obj);
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
