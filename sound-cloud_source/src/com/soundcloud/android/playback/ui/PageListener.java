// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayControlEvent;
import com.soundcloud.android.events.PlayerUICommand;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.rx.eventbus.EventBus;

public class PageListener
{

    protected final EventBus eventBus;
    protected final PlaySessionController playSessionController;
    private final PlaySessionStateProvider playSessionStateProvider;

    public PageListener(PlaySessionController playsessioncontroller, PlaySessionStateProvider playsessionstateprovider, EventBus eventbus)
    {
        playSessionController = playsessioncontroller;
        playSessionStateProvider = playsessionstateprovider;
        eventBus = eventbus;
    }

    private void trackTogglePlay(String s)
    {
        if (playSessionStateProvider.isPlaying())
        {
            eventBus.publish(EventQueue.TRACKING, PlayControlEvent.pause(s));
            return;
        } else
        {
            eventBus.publish(EventQueue.TRACKING, PlayControlEvent.play(s));
            return;
        }
    }

    public void onFooterTap()
    {
        eventBus.publish(EventQueue.PLAYER_COMMAND, PlayerUICommand.expandPlayer());
        eventBus.publish(EventQueue.TRACKING, UIEvent.fromPlayerOpen("tap_footer"));
    }

    public void onFooterTogglePlay()
    {
        playSessionController.togglePlayback();
        trackTogglePlay("footer_player");
    }

    public void onPlayerClose()
    {
        requestPlayerCollapse();
        eventBus.publish(EventQueue.TRACKING, UIEvent.fromPlayerClose("hide_button"));
    }

    public void onTogglePlay()
    {
        playSessionController.togglePlayback();
        trackTogglePlay("full_player");
    }

    protected void requestPlayerCollapse()
    {
        eventBus.publish(EventQueue.PLAYER_COMMAND, PlayerUICommand.collapsePlayer());
    }
}
