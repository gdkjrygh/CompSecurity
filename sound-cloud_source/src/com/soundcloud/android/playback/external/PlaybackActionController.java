// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.external;

import com.soundcloud.android.ServiceInitiator;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayControlEvent;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.rx.eventbus.EventBus;

public class PlaybackActionController
{

    private final EventBus eventBus;
    private final PlaySessionController playSessionController;
    private final PlaySessionStateProvider playSessionStateProvider;
    private final ServiceInitiator serviceInitiator;

    public PlaybackActionController(PlaySessionController playsessioncontroller, ServiceInitiator serviceinitiator, PlaySessionStateProvider playsessionstateprovider, EventBus eventbus)
    {
        playSessionController = playsessioncontroller;
        serviceInitiator = serviceinitiator;
        playSessionStateProvider = playsessionstateprovider;
        eventBus = eventbus;
    }

    public void handleAction(String s, String s1)
    {
        if ("com.soundcloud.android.playback.external.play".equals(s))
        {
            eventBus.publish(EventQueue.TRACKING, PlayControlEvent.play(s1));
            playSessionController.play();
        } else
        {
            if ("com.soundcloud.android.playback.external.pause".equals(s))
            {
                eventBus.publish(EventQueue.TRACKING, PlayControlEvent.pause(s1));
                playSessionController.pause();
                return;
            }
            if ("com.soundcloud.android.playback.external.previous".equals(s))
            {
                eventBus.publish(EventQueue.TRACKING, PlayControlEvent.previous(s1));
                playSessionController.previousTrack();
                return;
            }
            if ("com.soundcloud.android.playback.external.next".equals(s))
            {
                eventBus.publish(EventQueue.TRACKING, PlayControlEvent.skip(s1));
                playSessionController.nextTrack();
                return;
            }
            if ("com.soundcloud.android.playback.external.toggleplayback".equals(s))
            {
                eventBus.publish(EventQueue.TRACKING, PlayControlEvent.toggle(s1, playSessionStateProvider.isPlaying()));
                playSessionController.togglePlayback();
                return;
            }
            if ("com.soundcloud.android.playback.external.close".equals(s))
            {
                eventBus.publish(EventQueue.TRACKING, PlayControlEvent.close(s1));
                serviceInitiator.stopPlaybackService();
                return;
            }
        }
    }
}
