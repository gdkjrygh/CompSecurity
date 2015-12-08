// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayerUICommand;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackResult

public class ShowPlayerSubscriber extends DefaultSubscriber
{

    private final EventBus eventBus;
    private final PlaybackToastHelper playbackToastHelper;

    public ShowPlayerSubscriber(EventBus eventbus, PlaybackToastHelper playbacktoasthelper)
    {
        eventBus = eventbus;
        playbackToastHelper = playbacktoasthelper;
    }

    public void onNext(PlaybackResult playbackresult)
    {
        if (playbackresult.isSuccess())
        {
            eventBus.publish(EventQueue.PLAYER_COMMAND, PlayerUICommand.showPlayer());
            return;
        } else
        {
            playbackToastHelper.showToastOnPlaybackError(playbackresult.getErrorReason());
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((PlaybackResult)obj);
    }
}
