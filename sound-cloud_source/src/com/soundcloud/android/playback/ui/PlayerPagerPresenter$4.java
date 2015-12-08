// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayControlEvent;
import com.soundcloud.android.playback.ui.view.PlayerTrackPager;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            SkipListener, PlayerPagerPresenter

class val.trackPager
    implements SkipListener
{

    final PlayerPagerPresenter this$0;
    final PlayerTrackPager val$trackPager;

    public void onNext()
    {
        val$trackPager.setCurrentItem(val$trackPager.getCurrentItem() + 1);
        PlayerPagerPresenter.access$900(PlayerPagerPresenter.this).publish(EventQueue.TRACKING, PlayControlEvent.skip("full_player"));
    }

    public void onPrevious()
    {
        val$trackPager.setCurrentItem(val$trackPager.getCurrentItem() - 1);
        PlayerPagerPresenter.access$900(PlayerPagerPresenter.this).publish(EventQueue.TRACKING, PlayControlEvent.previous("full_player"));
    }

    ()
    {
        this$0 = final_playerpagerpresenter;
        val$trackPager = PlayerTrackPager.this;
        super();
    }
}
