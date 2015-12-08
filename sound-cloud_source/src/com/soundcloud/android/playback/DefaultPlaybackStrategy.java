// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.ServiceInitiator;
import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.offline.OfflinePlaybackOperations;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.rx.eventbus.EventBus;
import rx.a.b.a;
import rx.b;
import rx.b.f;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackStrategy, PlaySessionStateProvider, PlaybackProgress, PlayQueueManager, 
//            PlayQueueItem, PlayQueue, PlaySessionSource

public class DefaultPlaybackStrategy
    implements PlaybackStrategy
{

    private final AdsOperations adsOperations;
    private final EventBus eventBus;
    private final OfflinePlaybackOperations offlinePlaybackOperations;
    private final PlayQueueManager playQueueManager;
    private final PlaySessionStateProvider playSessionStateProvider;
    private final f resume = new _cls2();
    private final ServiceInitiator serviceInitiator;
    private final f togglePlayback = new _cls1();
    private final TrackRepository trackRepository;

    public DefaultPlaybackStrategy(PlayQueueManager playqueuemanager, ServiceInitiator serviceinitiator, TrackRepository trackrepository, AdsOperations adsoperations, OfflinePlaybackOperations offlineplaybackoperations, PlaySessionStateProvider playsessionstateprovider, EventBus eventbus)
    {
        playQueueManager = playqueuemanager;
        serviceInitiator = serviceinitiator;
        trackRepository = trackrepository;
        adsOperations = adsoperations;
        offlinePlaybackOperations = offlineplaybackoperations;
        playSessionStateProvider = playsessionstateprovider;
        eventBus = eventbus;
    }

    private long getPosition(Urn urn)
    {
        return playSessionStateProvider.getLastProgressForTrack(urn).getPosition();
    }

    private rx.b.b play(final Urn urn)
    {
        return new _cls3();
    }

    public void pause()
    {
        serviceInitiator.pause();
    }

    public b playCurrent()
    {
        Object obj = playQueueManager.getCurrentPlayQueueItem();
        if (((PlayQueueItem) (obj)).isTrack())
        {
            obj = ((PlayQueueItem) (obj)).getUrn();
            return trackRepository.track(((Urn) (obj))).doOnNext(play(((Urn) (obj)))).map(RxUtils.TO_VOID);
        } else
        {
            return b.just(null);
        }
    }

    public void resume()
    {
        eventBus.queue(EventQueue.PLAYER_LIFE_CYCLE).first().flatMap(resume).subscribe(new DefaultSubscriber());
    }

    public void seek(long l)
    {
        serviceInitiator.seek(l);
    }

    public b setNewQueue(final PlayQueue playQueue, final Urn initialTrackUrn, final int initialTrackPosition, boolean flag, final PlaySessionSource playSessionSource)
    {
        return b.create(new _cls4()).subscribeOn(a.a());
    }

    public void togglePlayback()
    {
        eventBus.queue(EventQueue.PLAYER_LIFE_CYCLE).first().flatMap(togglePlayback).subscribe(new DefaultSubscriber());
    }






    private class _cls1
        implements f
    {

        final DefaultPlaybackStrategy this$0;

        public volatile Object call(Object obj)
        {
            return call((PlayerLifeCycleEvent)obj);
        }

        public b call(PlayerLifeCycleEvent playerlifecycleevent)
        {
            if (playerlifecycleevent.isServiceRunning())
            {
                serviceInitiator.togglePlayback();
                return b.empty();
            } else
            {
                return playCurrent();
            }
        }

        _cls1()
        {
            this$0 = DefaultPlaybackStrategy.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final DefaultPlaybackStrategy this$0;

        public volatile Object call(Object obj)
        {
            return call((PlayerLifeCycleEvent)obj);
        }

        public b call(PlayerLifeCycleEvent playerlifecycleevent)
        {
            if (playerlifecycleevent.isServiceRunning())
            {
                serviceInitiator.resume();
                return b.empty();
            } else
            {
                return playCurrent();
            }
        }

        _cls2()
        {
            this$0 = DefaultPlaybackStrategy.this;
            super();
        }
    }


    private class _cls3
        implements rx.b.b
    {

        final DefaultPlaybackStrategy this$0;
        final Urn val$urn;

        public void call(PropertySet propertyset)
        {
            if (adsOperations.isCurrentItemAudioAd())
            {
                serviceInitiator.play(AudioPlaybackItem.forAudioAd(propertyset));
                return;
            }
            if (offlinePlaybackOperations.shouldPlayOffline(propertyset))
            {
                serviceInitiator.play(AudioPlaybackItem.forOffline(propertyset, getPosition(urn)));
                return;
            } else
            {
                serviceInitiator.play(AudioPlaybackItem.create(propertyset, getPosition(urn)));
                return;
            }
        }

        public volatile void call(Object obj)
        {
            call((PropertySet)obj);
        }

        _cls3()
        {
            this$0 = DefaultPlaybackStrategy.this;
            urn = urn1;
            super();
        }
    }


    private class _cls4
        implements rx.b.f
    {

        final DefaultPlaybackStrategy this$0;
        final int val$initialTrackPosition;
        final Urn val$initialTrackUrn;
        final PlayQueue val$playQueue;
        final PlaySessionSource val$playSessionSource;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            int i = PlaybackUtils.correctStartPositionAndDeduplicateList(playQueue, initialTrackPosition, initialTrackUrn, playSessionSource);
            playQueueManager.setNewPlayQueue(playQueue, playSessionSource, i);
            x.onNext(PlaybackResult.success());
            x.onCompleted();
        }

        _cls4()
        {
            this$0 = DefaultPlaybackStrategy.this;
            playQueue = playqueue;
            initialTrackPosition = i;
            initialTrackUrn = urn;
            playSessionSource = playsessionsource;
            super();
        }
    }

}
