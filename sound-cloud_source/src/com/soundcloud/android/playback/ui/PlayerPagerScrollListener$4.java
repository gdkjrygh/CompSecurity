// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayControlEvent;
import com.soundcloud.android.events.PlayerUIEvent;
import com.soundcloud.rx.eventbus.EventBus;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPagerScrollListener

class this._cls0
    implements b
{

    final PlayerPagerScrollListener this$0;

    public void call(PlayerUIEvent playeruievent)
    {
        boolean flag;
        if (playeruievent.getKind() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (PlayerPagerScrollListener.access$500(PlayerPagerScrollListener.this))
        {
            playeruievent = PlayControlEvent.swipeSkip(flag);
        } else
        {
            playeruievent = PlayControlEvent.swipePrevious(flag);
        }
        PlayerPagerScrollListener.access$200(PlayerPagerScrollListener.this).publish(EventQueue.TRACKING, playeruievent);
    }

    public volatile void call(Object obj)
    {
        call((PlayerUIEvent)obj);
    }

    ()
    {
        this$0 = PlayerPagerScrollListener.this;
        super();
    }
}
