// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.events.ActivityLifeCycleEvent;
import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueItem;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import rx.R;
import rx.Y;
import rx.a.b.a;
import rx.b;
import rx.b.f;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.ads:
//            ApiAdsForTrack, AdsOperations, ApiAudioAd, VisualAdImpressionOperations, 
//            AdOverlayImpressionOperations, LeaveBehindProperty

public class AdsController
{
    private class ActivityStateSubscriber extends DefaultSubscriber
    {

        final AdsController this$0;

        public void onNext(ActivityLifeCycleEvent activitylifecycleevent)
        {
            currentLifeCycleEvent = activitylifecycleevent;
        }

        public volatile void onNext(Object obj)
        {
            onNext((ActivityLifeCycleEvent)obj);
        }

        private ActivityStateSubscriber()
        {
            this$0 = AdsController.this;
            super();
        }

        ActivityStateSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class AdsFetchOperation
    {

        private final long createdAtMillis;
        private final Y subscription;
        final AdsController this$0;

        public boolean hasExpired()
        {
            return System.currentTimeMillis() - createdAtMillis > fetchOperationStaleTime;
        }


        private AdsFetchOperation(Y y)
        {
            this$0 = AdsController.this;
            super();
            subscription = y;
            createdAtMillis = System.currentTimeMillis();
        }

        AdsFetchOperation(Y y, _cls1 _pcls1)
        {
            this(y);
        }
    }

    private final class FetchAdForCurrentTrackSubscriber extends DefaultSubscriber
    {

        final AdsController this$0;

        public final void onNext(Object obj)
        {
            obj = playQueueManager.getCurrentPlayQueueItem().getUrn();
            InterstitialSubscriber interstitialsubscriber = new InterstitialSubscriber(playQueueManager.getCurrentPosition(), ((Urn) (obj)));
            createAdsFetchObservable(((Urn) (obj)), interstitialsubscriber);
        }

        private FetchAdForCurrentTrackSubscriber()
        {
            this$0 = AdsController.this;
            super();
        }

        FetchAdForCurrentTrackSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class FetchAdForNextTrackSubscriber extends DefaultSubscriber
    {

        final AdsController this$0;

        public final void onNext(Object obj)
        {
            obj = playQueueManager.getNextPlayQueueItem().getUrn();
            NextTrackSubscriber nexttracksubscriber = new NextTrackSubscriber(playQueueManager.getCurrentPosition(), ((Urn) (obj)));
            createAdsFetchObservable(((Urn) (obj)), nexttracksubscriber);
        }

        private FetchAdForNextTrackSubscriber()
        {
            this$0 = AdsController.this;
            super();
        }

        FetchAdForNextTrackSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class InterstitialSubscriber extends DefaultSubscriber
    {

        private final int intendedPosition;
        private final Urn monetizableTrack;
        final AdsController this$0;

        public final void onNext(ApiAdsForTrack apiadsfortrack)
        {
            if (playQueueManager.getCurrentPosition() == intendedPosition)
            {
                adsOperations.applyInterstitialToTrack(monetizableTrack, apiadsfortrack);
            }
        }

        public final volatile void onNext(Object obj)
        {
            onNext((ApiAdsForTrack)obj);
        }

        InterstitialSubscriber(int i, Urn urn)
        {
            this$0 = AdsController.this;
            super();
            intendedPosition = i;
            monetizableTrack = urn;
        }
    }

    private class LeaveBehindSubscriber extends DefaultSubscriber
    {

        final AdsController this$0;

        public void onNext(com.soundcloud.android.playback.Player.StateTransition statetransition)
        {
            if (adsOperations.isCurrentItemAudioAd() && statetransition.trackEnded())
            {
                adsOperations.getMonetizableTrackMetaData().put(LeaveBehindProperty.META_AD_COMPLETED, Boolean.valueOf(true));
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((com.soundcloud.android.playback.Player.StateTransition)obj);
        }

        private LeaveBehindSubscriber()
        {
            this$0 = AdsController.this;
            super();
        }

        LeaveBehindSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class NextTrackSubscriber extends DefaultSubscriber
    {

        private final int intendedPosition;
        private final Urn monetizableTrack;
        final AdsController this$0;

        public final void onNext(ApiAdsForTrack apiadsfortrack)
        {
            if (playQueueManager.getCurrentPosition() == intendedPosition)
            {
                adsForNextTrack = Optional.of(apiadsfortrack);
                adsOperations.applyAdToTrack(monetizableTrack, apiadsfortrack);
            }
        }

        public final volatile void onNext(Object obj)
        {
            onNext((ApiAdsForTrack)obj);
        }

        NextTrackSubscriber(int i, Urn urn)
        {
            this$0 = AdsController.this;
            super();
            intendedPosition = i;
            monetizableTrack = urn;
        }
    }

    private class ResetAdsOnTrackChange extends DefaultSubscriber
    {

        final AdsController this$0;

        private boolean isNotNextTrack(Urn urn)
        {
            return !playQueueManager.isTrackAt(urn, playQueueManager.getCurrentPosition() + 1);
        }

        public void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            adsForNextTrack = Optional.absent();
            currentplayqueueitemevent = currentAdsFetches.entrySet().iterator();
            do
            {
                if (!currentplayqueueitemevent.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)currentplayqueueitemevent.next();
                Urn urn = (Urn)entry.getKey();
                if (!playQueueManager.isCurrentTrack(urn) && isNotNextTrack(urn) || ((AdsFetchOperation)entry.getValue()).hasExpired())
                {
                    ((AdsFetchOperation)entry.getValue()).subscription.unsubscribe();
                    currentplayqueueitemevent.remove();
                }
            } while (true);
            skipFailedAdSubscription.unsubscribe();
            if (!adsOperations.isCurrentItemAd())
            {
                adsOperations.clearAllAdsFromQueue();
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((CurrentPlayQueueItemEvent)obj);
        }

        private ResetAdsOnTrackChange()
        {
            this$0 = AdsController.this;
            super();
        }

        ResetAdsOnTrackChange(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class SkipFailedAdSubscriber extends DefaultSubscriber
    {

        final AdsController this$0;

        public final void onNext(final com.soundcloud.android.playback.Player.StateTransition state)
        {
            skipFailedAdSubscription.unsubscribe();
            class _cls1 extends DefaultSubscriber
            {

                final SkipFailedAdSubscriber this$1;
                final com.soundcloud.android.playback.Player.StateTransition val$state;

                public void onNext(Long long1)
                {
                    long1 = new AudioAdFailedToBufferEvent(state.getTrackUrn(), state.getProgress(), 6);
                    eventBus.publish(EventQueue.TRACKING, long1);
                    playQueueManager.autoNextItem();
                }

                public volatile void onNext(Object obj)
                {
                    onNext((Long)obj);
                }

                _cls1()
                {
                    this$1 = SkipFailedAdSubscriber.this;
                    state = statetransition;
                    super();
                }
            }

            skipFailedAdSubscription = b.timer(6L, TimeUnit.SECONDS, scheduler).subscribe(new _cls1());
        }

        public final volatile void onNext(Object obj)
        {
            onNext((com.soundcloud.android.playback.Player.StateTransition)obj);
        }

        private SkipFailedAdSubscriber()
        {
            this$0 = AdsController.this;
            super();
        }

        SkipFailedAdSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final long DEFAULT_OPERATION_STALE_TIME;
    public static final int FAILED_AD_WAIT_SECS = 6;
    private static final f IS_MONETIZABLE = new _cls2();
    private static final f IS_QUEUE_UPDATE = new _cls1();
    private static final int MAX_CONCURRENT_AD_FETCHES = 2;
    private final AdOverlayImpressionOperations adOverlayImpressionOperations;
    private Optional adsForNextTrack;
    private final AdsOperations adsOperations;
    private Map currentAdsFetches;
    private ActivityLifeCycleEvent currentLifeCycleEvent;
    private final EventBus eventBus;
    private final f fetchAds;
    private final long fetchOperationStaleTime;
    private final f isBufferingAudioAd;
    private final PlayQueueManager playQueueManager;
    private final R scheduler;
    private final f shouldFetchAudioAdForNextTrack;
    private final f shouldFetchInterstitialForCurrentTrack;
    private Y skipFailedAdSubscription;
    private final TrackRepository trackRepository;
    private final rx.b.b unsubscribeFailedAdSkip;
    private final VisualAdImpressionOperations visualAdImpressionOperations;

    public AdsController(EventBus eventbus, AdsOperations adsoperations, VisualAdImpressionOperations visualadimpressionoperations, AdOverlayImpressionOperations adoverlayimpressionoperations, PlayQueueManager playqueuemanager, TrackRepository trackrepository)
    {
        this(eventbus, adsoperations, visualadimpressionoperations, adoverlayimpressionoperations, playqueuemanager, trackrepository, a.a());
    }

    public AdsController(EventBus eventbus, AdsOperations adsoperations, VisualAdImpressionOperations visualadimpressionoperations, AdOverlayImpressionOperations adoverlayimpressionoperations, PlayQueueManager playqueuemanager, TrackRepository trackrepository, R r)
    {
        this(eventbus, adsoperations, visualadimpressionoperations, adoverlayimpressionoperations, playqueuemanager, trackrepository, r, DEFAULT_OPERATION_STALE_TIME);
    }

    public AdsController(EventBus eventbus, AdsOperations adsoperations, VisualAdImpressionOperations visualadimpressionoperations, AdOverlayImpressionOperations adoverlayimpressionoperations, PlayQueueManager playqueuemanager, TrackRepository trackrepository, R r, 
            long l)
    {
        skipFailedAdSubscription = RxUtils.invalidSubscription();
        currentAdsFetches = new HashMap(2);
        adsForNextTrack = Optional.absent();
        shouldFetchAudioAdForNextTrack = new _cls3();
        shouldFetchInterstitialForCurrentTrack = new _cls4();
        isBufferingAudioAd = new _cls5();
        fetchAds = new _cls6();
        unsubscribeFailedAdSkip = new _cls7();
        eventBus = eventbus;
        adsOperations = adsoperations;
        visualAdImpressionOperations = visualadimpressionoperations;
        adOverlayImpressionOperations = adoverlayimpressionoperations;
        playQueueManager = playqueuemanager;
        trackRepository = trackrepository;
        scheduler = r;
        fetchOperationStaleTime = l;
    }

    private boolean alreadyFetchedAdForTrack(PlayQueueItem playqueueitem)
    {
        return currentAdsFetches.containsKey(playqueueitem.getUrn());
    }

    private void createAdsFetchObservable(Urn urn, DefaultSubscriber defaultsubscriber)
    {
        b b1 = trackRepository.track(urn).filter(IS_MONETIZABLE).flatMap(fetchAds).observeOn(a.a());
        currentAdsFetches.put(urn, new AdsFetchOperation(b1.subscribe(defaultsubscriber), null));
    }

    private Optional getAudioAdForNextTrack()
    {
        if (adsForNextTrack.isPresent())
        {
            ApiAdsForTrack apiadsfortrack = (ApiAdsForTrack)adsForNextTrack.get();
            if (apiadsfortrack.audioAd().isPresent())
            {
                return apiadsfortrack.audioAd();
            }
        }
        return Optional.absent();
    }

    public void reconfigureAdForNextTrack()
    {
        Optional optional = getAudioAdForNextTrack();
        if (playQueueManager.hasNextItem() && !adsOperations.isNextItemAd() && optional.isPresent() && currentLifeCycleEvent.isNotForeground())
        {
            int i = playQueueManager.getCurrentPosition();
            Urn urn = playQueueManager.getNextPlayQueueItem().getUrn();
            adsOperations.insertAudioAd(urn, (ApiAudioAd)optional.get(), i + 1);
        }
    }

    public void subscribe()
    {
        eventBus.queue(EventQueue.CURRENT_PLAY_QUEUE_ITEM).subscribe(new ResetAdsOnTrackChange(null));
        b b1 = b.merge(eventBus.queue(EventQueue.CURRENT_PLAY_QUEUE_ITEM), eventBus.queue(EventQueue.PLAY_QUEUE).filter(IS_QUEUE_UPDATE));
        b1.filter(shouldFetchInterstitialForCurrentTrack).subscribe(new FetchAdForCurrentTrackSubscriber(null));
        b1.filter(shouldFetchAudioAdForNextTrack).subscribe(new FetchAdForNextTrackSubscriber(null));
        eventBus.queue(EventQueue.PLAYBACK_STATE_CHANGED).doOnNext(unsubscribeFailedAdSkip).filter(isBufferingAudioAd).subscribe(new SkipFailedAdSubscriber(null));
        eventBus.queue(EventQueue.PLAYBACK_STATE_CHANGED).subscribe(new LeaveBehindSubscriber(null));
        visualAdImpressionOperations.trackImpression().subscribe(eventBus.queue(EventQueue.TRACKING));
        adOverlayImpressionOperations.trackImpression().subscribe(eventBus.queue(EventQueue.TRACKING));
        eventBus.queue(EventQueue.ACTIVITY_LIFE_CYCLE).subscribe(new ActivityStateSubscriber(null));
    }

    static 
    {
        DEFAULT_OPERATION_STALE_TIME = TimeUnit.MINUTES.toMillis(10L);
    }





/*
    static Optional access$1202(AdsController adscontroller, Optional optional)
    {
        adscontroller.adsForNextTrack = optional;
        return optional;
    }

*/






/*
    static ActivityLifeCycleEvent access$1802(AdsController adscontroller, ActivityLifeCycleEvent activitylifecycleevent)
    {
        adscontroller.currentLifeCycleEvent = activitylifecycleevent;
        return activitylifecycleevent;
    }

*/




/*
    static Y access$302(AdsController adscontroller, Y y)
    {
        adscontroller.skipFailedAdSubscription = y;
        return y;
    }

*/

    private class _cls3
        implements f
    {

        final AdsController this$0;

        public Boolean call(Object obj)
        {
            boolean flag;
            if (playQueueManager.hasNextItem() && !adsOperations.isNextItemAd() && !adsOperations.isCurrentItemAd() && !alreadyFetchedAdForTrack(playQueueManager.getNextPlayQueueItem()))
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
            return call(obj);
        }

        _cls3()
        {
            this$0 = AdsController.this;
            super();
        }
    }


    private class _cls4
        implements f
    {

        final AdsController this$0;

        public Boolean call(Object obj)
        {
            boolean flag;
            if (!adsOperations.isCurrentItemAd() && !alreadyFetchedAdForTrack(playQueueManager.getCurrentPlayQueueItem()))
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
            return call(obj);
        }

        _cls4()
        {
            this$0 = AdsController.this;
            super();
        }
    }


    private class _cls5
        implements f
    {

        final AdsController this$0;

        public Boolean call(com.soundcloud.android.playback.Player.StateTransition statetransition)
        {
            boolean flag;
            if (statetransition.isBuffering() && adsOperations.isCurrentItemAudioAd())
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
            return call((com.soundcloud.android.playback.Player.StateTransition)obj);
        }

        _cls5()
        {
            this$0 = AdsController.this;
            super();
        }
    }


    private class _cls6
        implements f
    {

        final AdsController this$0;

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        public b call(PropertySet propertyset)
        {
            return adsOperations.ads((Urn)propertyset.get(TrackProperty.URN));
        }

        _cls6()
        {
            this$0 = AdsController.this;
            super();
        }
    }


    private class _cls7
        implements rx.b.b
    {

        final AdsController this$0;

        public void call(com.soundcloud.android.playback.Player.StateTransition statetransition)
        {
            if (statetransition.isPlayerPlaying() || statetransition.isPaused())
            {
                skipFailedAdSubscription.unsubscribe();
            } else
            if (statetransition.wasError() && adsOperations.isCurrentItemAudioAd())
            {
                skipFailedAdSubscription.unsubscribe();
                playQueueManager.autoNextItem();
                return;
            }
        }

        public volatile void call(Object obj)
        {
            call((com.soundcloud.android.playback.Player.StateTransition)obj);
        }

        _cls7()
        {
            this$0 = AdsController.this;
            super();
        }
    }


    private class _cls1
        implements f
    {

        public final Boolean call(PlayQueueEvent playqueueevent)
        {
            return Boolean.valueOf(playqueueevent.isQueueUpdate());
        }

        public final volatile Object call(Object obj)
        {
            return call((PlayQueueEvent)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements f
    {

        public final Boolean call(PropertySet propertyset)
        {
            return (Boolean)propertyset.get(TrackProperty.MONETIZABLE);
        }

        public final volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls2()
        {
        }
    }

}
