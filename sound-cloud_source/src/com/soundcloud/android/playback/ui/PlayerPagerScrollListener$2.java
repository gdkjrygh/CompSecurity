// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerScrollListener

class this._cls0 extends DefaultSubscriber
{

    final PlayerPagerScrollListener this$0;

    public void onNext(Integer integer)
    {
        PlayerPagerScrollListener.access$300(PlayerPagerScrollListener.this).showUnskippableAdToast();
    }

    public volatile void onNext(Object obj)
    {
        onNext((Integer)obj);
    }

    ()
    {
        this$0 = PlayerPagerScrollListener.this;
        super();
    }
}
