// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.os.Handler;
import android.os.Message;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayerUICommand;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackResult

public class ExpandPlayerSubscriber extends DefaultSubscriber
{
    private static class ExpandDelayHandler extends Handler
    {

        private EventBus eventBus;

        public void handleMessage(Message message)
        {
            eventBus.publish(EventQueue.PLAYER_COMMAND, PlayerUICommand.expandPlayer());
            eventBus.publish(EventQueue.TRACKING, UIEvent.fromPlayerOpen("track_play"));
        }

        private ExpandDelayHandler(EventBus eventbus)
        {
            eventBus = eventbus;
        }

        ExpandDelayHandler(EventBus eventbus, _cls1 _pcls1)
        {
            this(eventbus);
        }
    }


    public static final int EXPAND_DELAY_MILLIS = 100;
    private final Handler expandDelayHandler;
    private final PlaybackToastHelper playbackToastHelper;

    public ExpandPlayerSubscriber(EventBus eventbus, PlaybackToastHelper playbacktoasthelper)
    {
        expandDelayHandler = new ExpandDelayHandler(eventbus, null);
        playbackToastHelper = playbacktoasthelper;
    }

    public boolean expandPlayer()
    {
        return expandDelayHandler.sendEmptyMessageDelayed(0, 100L);
    }

    public void onNext(PlaybackResult playbackresult)
    {
        if (playbackresult.isSuccess())
        {
            expandPlayer();
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
