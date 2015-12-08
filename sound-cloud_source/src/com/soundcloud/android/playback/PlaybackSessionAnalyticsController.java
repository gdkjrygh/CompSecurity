// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.webkit.URLUtil;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlaybackSessionEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;
import rx.b;
import rx.b.f;
import rx.g.e;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueManager, TrackSourceInfo

class PlaybackSessionAnalyticsController
{

    private final AccountOperations accountOperations;
    private final AdsOperations adsOperations;
    private TrackSourceInfo currentTrackSourceInfo;
    private final EventBus eventBus;
    private final f lastEventWasNotPlayEvent = new _cls1();
    private PropertySet lastPlayAudioAd;
    private PlaybackSessionEvent lastSessionEventData;
    private Player.StateTransition lastStateTransition;
    private final PlayQueueManager playQueueManager;
    private e trackObservable;
    private final TrackRepository trackRepository;

    public PlaybackSessionAnalyticsController(EventBus eventbus, TrackRepository trackrepository, AccountOperations accountoperations, PlayQueueManager playqueuemanager, AdsOperations adsoperations)
    {
        lastStateTransition = Player.StateTransition.DEFAULT;
        eventBus = eventbus;
        trackRepository = trackrepository;
        accountOperations = accountoperations;
        playQueueManager = playqueuemanager;
        adsOperations = adsoperations;
    }

    private String getConnectionType(Player.StateTransition statetransition)
    {
        return statetransition.getExtraAttribute(2);
    }

    private String getPlayerType(Player.StateTransition statetransition)
    {
        return statetransition.getExtraAttribute(1);
    }

    private String getProtocol(Player.StateTransition statetransition)
    {
        return statetransition.getExtraAttribute(0);
    }

    private boolean isLocalStoragePlayback(Player.StateTransition statetransition)
    {
        return URLUtil.isFileUrl(statetransition.getExtraAttribute(4));
    }

    private void publishPlayEvent(Player.StateTransition statetransition)
    {
        currentTrackSourceInfo = playQueueManager.getCurrentTrackSourceInfo();
        if (currentTrackSourceInfo != null)
        {
            trackObservable.filter(lastEventWasNotPlayEvent).map(stateTransitionToSessionPlayEvent(statetransition)).subscribe(eventBus.queue(EventQueue.TRACKING));
        }
    }

    private void publishStopEvent(Player.StateTransition statetransition, int i)
    {
        if (lastSessionEventData != null && currentTrackSourceInfo != null)
        {
            trackObservable.map(stateTransitionToSessionStopEvent(i, statetransition, lastSessionEventData)).subscribe(eventBus.queue(EventQueue.TRACKING));
            lastSessionEventData = null;
            lastPlayAudioAd = null;
        }
    }

    private f stateTransitionToSessionPlayEvent(final Player.StateTransition stateTransition)
    {
        return new _cls2();
    }

    private f stateTransitionToSessionStopEvent(final int stopReason, final Player.StateTransition stateTransition, final PlaybackSessionEvent lastPlayEventData)
    {
        return new _cls3();
    }

    private int stopReasonFromTransition(Player.StateTransition statetransition)
    {
        if (statetransition.isBuffering())
        {
            return 1;
        }
        if (statetransition.getReason() == Player.Reason.TRACK_COMPLETE)
        {
            return !playQueueManager.hasNextItem() ? 4 : 3;
        }
        return !statetransition.wasError() ? 0 : 6;
    }

    public void onStateTransition(Player.StateTransition statetransition)
    {
        Urn urn = statetransition.getTrackUrn();
        if (!urn.equals(lastStateTransition.getTrackUrn()))
        {
            if (lastStateTransition.isPlayerPlaying())
            {
                publishStopEvent(lastStateTransition, 2);
            }
            trackObservable = e.b();
            trackRepository.track(urn).subscribe(trackObservable);
        }
        if (statetransition.isPlayerPlaying())
        {
            publishPlayEvent(statetransition);
        } else
        {
            publishStopEvent(statetransition, stopReasonFromTransition(statetransition));
        }
        lastStateTransition = statetransition;
    }



/*
    static PlaybackSessionEvent access$002(PlaybackSessionAnalyticsController playbacksessionanalyticscontroller, PlaybackSessionEvent playbacksessionevent)
    {
        playbacksessionanalyticscontroller.lastSessionEventData = playbacksessionevent;
        return playbacksessionevent;
    }

*/










/*
    static PropertySet access$802(PlaybackSessionAnalyticsController playbacksessionanalyticscontroller, PropertySet propertyset)
    {
        playbacksessionanalyticscontroller.lastPlayAudioAd = propertyset;
        return propertyset;
    }

*/


    private class _cls1
        implements f
    {

        final PlaybackSessionAnalyticsController this$0;

        public Boolean call(PropertySet propertyset)
        {
            boolean flag;
            if (lastSessionEventData == null || !lastSessionEventData.isPlayEvent())
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
            return call((PropertySet)obj);
        }

        _cls1()
        {
            this$0 = PlaybackSessionAnalyticsController.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final PlaybackSessionAnalyticsController this$0;
        final Player.StateTransition val$stateTransition;

        public PlaybackSessionEvent call(PropertySet propertyset)
        {
            Urn urn = accountOperations.getLoggedInUserUrn();
            long l = stateTransition.getProgress().getPosition();
            String s = getProtocol(stateTransition);
            String s1 = getPlayerType(stateTransition);
            String s2 = getConnectionType(stateTransition);
            boolean flag = isLocalStoragePlayback(stateTransition);
            lastSessionEventData = PlaybackSessionEvent.forPlay(propertyset, urn, currentTrackSourceInfo, l, s, s1, s2, flag);
            if (adsOperations.isCurrentItemAudioAd())
            {
                lastPlayAudioAd = playQueueManager.getCurrentPlayQueueItem().getMetaData();
                lastSessionEventData = lastSessionEventData.withAudioAd(lastPlayAudioAd);
            } else
            {
                PlayQueueItem playqueueitem = playQueueManager.getCurrentPlayQueueItem();
                propertyset = playQueueManager.getCurrentPlaySessionSource();
                if (playqueueitem.isTrack() && playQueueManager.isTrackFromCurrentPromotedItem(playqueueitem.getUrn()) && propertyset.getPromotedSourceInfo().isFirstPlay())
                {
                    PromotedSourceInfo promotedsourceinfo = propertyset.getPromotedSourceInfo();
                    lastSessionEventData = lastSessionEventData.withPromotedTrack(promotedsourceinfo);
                    if (!propertyset.getCollectionUrn().isPlaylist())
                    {
                        promotedsourceinfo.setAsPlayed();
                    }
                }
                lastPlayAudioAd = null;
            }
            return lastSessionEventData;
        }

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls2()
        {
            this$0 = PlaybackSessionAnalyticsController.this;
            stateTransition = statetransition;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final PlaybackSessionAnalyticsController this$0;
        final PlaybackSessionEvent val$lastPlayEventData;
        final Player.StateTransition val$stateTransition;
        final int val$stopReason;

        public PlaybackSessionEvent call(PropertySet propertyset)
        {
            long l = stateTransition.getProgress().getPosition();
            Object obj = getProtocol(stateTransition);
            String s = getPlayerType(stateTransition);
            String s1 = getConnectionType(stateTransition);
            boolean flag = isLocalStoragePlayback(stateTransition);
            obj = PlaybackSessionEvent.forStop(propertyset, accountOperations.getLoggedInUserUrn(), currentTrackSourceInfo, lastPlayEventData, l, ((String) (obj)), s, s1, stopReason, flag);
            propertyset = ((PropertySet) (obj));
            if (lastPlayAudioAd != null)
            {
                propertyset = ((PlaybackSessionEvent) (obj)).withAudioAd(lastPlayAudioAd);
            }
            return propertyset;
        }

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls3()
        {
            this$0 = PlaybackSessionAnalyticsController.this;
            stateTransition = statetransition;
            lastPlayEventData = playbacksessionevent;
            stopReason = i;
            super();
        }
    }

}
