// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlaybackProgressEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.HashMap;
import java.util.Map;
import rx.b;
import rx.b.f;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueManager, PlayQueueItem, PlaybackProgress

public class PlaySessionStateProvider
{
    private class PlayQueueTrackSubscriber extends DefaultSubscriber
    {

        final PlaySessionStateProvider this$0;

        public void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            if (lastStateTransition.playSessionIsActive())
            {
                progressMap.clear();
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((CurrentPlayQueueItemEvent)obj);
        }

        private PlayQueueTrackSubscriber()
        {
            this$0 = PlaySessionStateProvider.this;
            super();
        }

        PlayQueueTrackSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class PlayStateSubscriber extends DefaultSubscriber
    {

        final PlaySessionStateProvider this$0;

        public void onNext(Player.StateTransition statetransition)
        {
            boolean flag;
            if (currentPlayingUrn != null && !statetransition.isForTrack(currentPlayingUrn))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && statetransition.playSessionIsActive())
            {
                progressMap.clear();
            }
            lastStateTransition = statetransition;
            currentPlayingUrn = statetransition.getTrackUrn();
            if (statetransition.getProgress().isDurationValid())
            {
                progressMap.put(currentPlayingUrn, statetransition.getProgress());
            }
            if (playingNewTrackFromBeginning(statetransition, flag) || playbackStoppedMidSession(statetransition))
            {
                long l = getLastProgressForTrack(currentPlayingUrn).getPosition();
                PlayQueueManager playqueuemanager = playQueueManager;
                if (statetransition.trackEnded())
                {
                    l = 0L;
                }
                playqueuemanager.saveCurrentProgress(l);
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((Player.StateTransition)obj);
        }

        private PlayStateSubscriber()
        {
            this$0 = PlaySessionStateProvider.this;
            super();
        }

        PlayStateSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class PlaybackProgressSubscriber extends DefaultSubscriber
    {

        final PlaySessionStateProvider this$0;

        public final void onNext(PlaybackProgressEvent playbackprogressevent)
        {
            progressMap.put(playbackprogressevent.getTrackUrn(), playbackprogressevent.getPlaybackProgress());
        }

        public final volatile void onNext(Object obj)
        {
            onNext((PlaybackProgressEvent)obj);
        }

        private PlaybackProgressSubscriber()
        {
            this$0 = PlaySessionStateProvider.this;
            super();
        }

        PlaybackProgressSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private Urn currentPlayingUrn;
    private final EventBus eventBus;
    private final f ignoreDefaultStateFilter = new _cls1();
    private Player.StateTransition lastStateTransition;
    private final PlayQueueManager playQueueManager;
    private final Map progressMap = new HashMap();

    public PlaySessionStateProvider(EventBus eventbus, PlayQueueManager playqueuemanager)
    {
        lastStateTransition = Player.StateTransition.DEFAULT;
        eventBus = eventbus;
        playQueueManager = playqueuemanager;
    }

    private boolean playbackStoppedMidSession(Player.StateTransition statetransition)
    {
        return statetransition.isPlayerIdle() && !statetransition.isPlayQueueComplete();
    }

    private boolean playingNewTrackFromBeginning(Player.StateTransition statetransition, boolean flag)
    {
        return flag && !playQueueManager.wasLastSavedTrack(statetransition.getTrackUrn());
    }

    public PlaybackProgress getLastProgressEvent()
    {
        return getLastProgressForTrack(currentPlayingUrn);
    }

    public PlaybackProgress getLastProgressEventForCurrentPlayQueueTrack()
    {
        PlayQueueItem playqueueitem = playQueueManager.getCurrentPlayQueueItem();
        if (playqueueitem.isTrack())
        {
            return getLastProgressForTrack(playqueueitem.getUrn());
        } else
        {
            return PlaybackProgress.empty();
        }
    }

    public PlaybackProgress getLastProgressForTrack(Urn urn)
    {
        if (hasLastKnownProgress(urn))
        {
            return (PlaybackProgress)progressMap.get(urn);
        }
        if (playQueueManager.wasLastSavedTrack(urn))
        {
            return new PlaybackProgress(playQueueManager.getLastSavedPosition(), -1L);
        } else
        {
            return PlaybackProgress.empty();
        }
    }

    public boolean hasLastKnownProgress(Urn urn)
    {
        return progressMap.containsKey(urn);
    }

    public boolean isPlaying()
    {
        return lastStateTransition.playSessionIsActive();
    }

    public boolean isPlayingCurrentPlayQueueTrack()
    {
        PlayQueueItem playqueueitem = playQueueManager.getCurrentPlayQueueItem();
        return playqueueitem.isTrack() && isPlayingTrack(playqueueitem.getUrn());
    }

    public boolean isPlayingTrack(PublicApiTrack publicapitrack)
    {
        return isPlayingTrack(publicapitrack.getUrn());
    }

    public boolean isPlayingTrack(Urn urn)
    {
        return currentPlayingUrn != null && currentPlayingUrn.equals(urn);
    }

    public void subscribe()
    {
        eventBus.subscribe(EventQueue.PLAYBACK_PROGRESS, new PlaybackProgressSubscriber(null));
        eventBus.subscribe(EventQueue.CURRENT_PLAY_QUEUE_ITEM, new PlayQueueTrackSubscriber(null));
        eventBus.queue(EventQueue.PLAYBACK_STATE_CHANGED).filter(ignoreDefaultStateFilter).subscribe(new PlayStateSubscriber(null));
    }



/*
    static Urn access$302(PlaySessionStateProvider playsessionstateprovider, Urn urn)
    {
        playsessionstateprovider.currentPlayingUrn = urn;
        return urn;
    }

*/




/*
    static Player.StateTransition access$502(PlaySessionStateProvider playsessionstateprovider, Player.StateTransition statetransition)
    {
        playsessionstateprovider.lastStateTransition = statetransition;
        return statetransition;
    }

*/




    private class _cls1
        implements f
    {

        final PlaySessionStateProvider this$0;

        public Boolean call(Player.StateTransition statetransition)
        {
            boolean flag;
            if (!Player.StateTransition.DEFAULT.equals(statetransition))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public volatile Object call(Object obj)
        {
            return call((Player.StateTransition)obj);
        }

        _cls1()
        {
            this$0 = PlaySessionStateProvider.this;
            super();
        }
    }

}
