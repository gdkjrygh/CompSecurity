// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.View;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerControlBar

class ListenerStub extends AdPlaybackEventListenerStub
{

    final PlayerControlBar this$0;

    public void onAdBreakComplete(AdBreak adbreak)
    {
        PlayerControlBar.access$102(PlayerControlBar.this, false);
        boolean _tmp = PlayerControlBar.access$300(PlayerControlBar.this);
    }

    public void onAdBreakSkipped(AdBreak adbreak)
    {
        PlayerControlBar.access$102(PlayerControlBar.this, false);
    }

    public void onAdBreakStart(AdBreak adbreak)
    {
        PlayerControlBar.access$102(PlayerControlBar.this, true);
        if (playBar != null)
        {
            playBar.setVisibility(8);
        }
    }

    public void onAdStart(AdBreak adbreak, Ad ad)
    {
        PlayerControlBar.access$102(PlayerControlBar.this, true);
        if (playBar != null)
        {
            playBar.setVisibility(8);
        }
    }

    ListenerStub()
    {
        this$0 = PlayerControlBar.this;
        super();
    }
}
