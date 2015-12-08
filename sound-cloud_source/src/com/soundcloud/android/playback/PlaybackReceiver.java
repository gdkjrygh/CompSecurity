// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayControlEvent;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackItem, PlaybackService, PlayQueueManager

class PlaybackReceiver extends BroadcastReceiver
{
    static class Factory
    {

        private final PlayQueueManager playQueueManager;

        PlaybackReceiver create(PlaybackService playbackservice, AccountOperations accountoperations, EventBus eventbus)
        {
            return new PlaybackReceiver(playbackservice, accountoperations, playQueueManager, eventbus, null);
        }

        Factory(PlayQueueManager playqueuemanager)
        {
            playQueueManager = playqueuemanager;
        }
    }


    private static final long DEFAULT_DURATION = -1L;
    private static final long DEFAULT_SEEK_POSITION = 0L;
    private final AccountOperations accountOperations;
    private final EventBus eventBus;
    private final PlayQueueManager playQueueManager;
    private final PlaybackService playbackService;

    private PlaybackReceiver(PlaybackService playbackservice, AccountOperations accountoperations, PlayQueueManager playqueuemanager, EventBus eventbus)
    {
        playbackService = playbackservice;
        accountOperations = accountoperations;
        playQueueManager = playqueuemanager;
        eventBus = eventbus;
    }

    PlaybackReceiver(PlaybackService playbackservice, AccountOperations accountoperations, PlayQueueManager playqueuemanager, EventBus eventbus, _cls1 _pcls1)
    {
        this(playbackservice, accountoperations, playqueuemanager, eventbus);
    }

    private PlaybackItem getPlaybackItem(Intent intent)
    {
        return (PlaybackItem)intent.getParcelableExtra("playback_item");
    }

    private long getPositionFromIntent(Intent intent)
    {
        return intent.getLongExtra("seek_position", 0L);
    }

    private void trackPlayControlEvent(Intent intent)
    {
        String s = intent.getStringExtra("play_event_source");
        if ("com.soundcloud.android.playback.playcurrent".equals(intent.getAction()))
        {
            eventBus.publish(EventQueue.TRACKING, PlayControlEvent.play(s));
        } else
        if ("com.soundcloud.android.playback.pause".equals(intent.getAction()))
        {
            eventBus.publish(EventQueue.TRACKING, PlayControlEvent.pause(s));
            return;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        (new StringBuilder("BroadcastReceiver#onReceive(")).append(context).append(")");
        if (intent.hasExtra("play_event_source"))
        {
            trackPlayControlEvent(intent);
        }
        if ("com.soundcloud.android.playback.reset".equals(context))
        {
            playbackService.resetAll();
            playQueueManager.clearAll();
        } else
        if (accountOperations.isUserLoggedIn())
        {
            if ("com.soundcloud.android.playback.play".equals(context))
            {
                playbackService.play(getPlaybackItem(intent));
                return;
            }
            if ("com.soundcloud.android.playback.toggleplayback".equals(context))
            {
                playbackService.togglePlayback();
                return;
            }
            if ("com.soundcloud.android.playback.playcurrent".equals(context))
            {
                playbackService.play();
                return;
            }
            if ("com.soundcloud.android.playback.pause".equals(context))
            {
                playbackService.pause();
                return;
            }
            if ("com.soundcloud.android.playback.seek".equals(context))
            {
                long l = getPositionFromIntent(intent);
                playbackService.seek(l, true);
                return;
            }
            if ("android.media.AUDIO_BECOMING_NOISY".equals(context))
            {
                playbackService.pause();
                return;
            }
            if ("com.soundcloud.android.playback.stop".equals(context))
            {
                playbackService.stop();
                return;
            }
        }
    }
}
