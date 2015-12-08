// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import rx.b;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerScrollListener

class this._cls0 extends DefaultSubscriber
{

    final PlayerPagerScrollListener this$0;

    public void onNext(Integer integer)
    {
        if (PlayerPagerScrollListener.access$000(PlayerPagerScrollListener.this))
        {
            PlayerPagerScrollListener.access$200(PlayerPagerScrollListener.this).queue(EventQueue.PLAYER_UI).first().subscribe(PlayerPagerScrollListener.access$100(PlayerPagerScrollListener.this));
        }
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
