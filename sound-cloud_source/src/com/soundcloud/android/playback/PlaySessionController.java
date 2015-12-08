// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.ads.AdConstants;
import com.soundcloud.android.ads.AdsController;
import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayQueueEvent;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.stations.StationsOperations;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.PropertySetFunctions;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.Lazy;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import rx.Y;
import rx.b;
import rx.b.a;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            IRemoteAudioManager, PlayQueueManager, PlaySessionSource, PlaybackProgress, 
//            TrackQueueItem, TrackSourceInfo, PlaybackStrategy, PlaybackResult, 
//            PlaySessionStateProvider, PlayQueueOperations, PlayQueue, PlayQueueItem

public class PlaySessionController
{
    private final class ArtworkSubscriber extends DefaultSubscriber
    {

        final PlaySessionController this$0;

        private void logArtworkException(Bitmap bitmap, IllegalArgumentException illegalargumentexception)
        {
            if (bitmap == null)
            {
                bitmap = "null";
            } else
            {
                bitmap = (new StringBuilder()).append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).toString();
            }
            ErrorUtils.handleSilentException(illegalargumentexception, Collections.singletonMap("bitmap_size", bitmap));
        }

        public final void onNext(Bitmap bitmap)
        {
            try
            {
                audioManager.onTrackChanged(currentPlayQueueTrack, bitmap);
                return;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                logArtworkException(bitmap, illegalargumentexception);
            }
        }

        public final volatile void onNext(Object obj)
        {
            onNext((Bitmap)obj);
        }

        private ArtworkSubscriber()
        {
            this$0 = PlaySessionController.this;
            super();
        }

        ArtworkSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class CurrentTrackSubscriber extends DefaultSubscriber
    {

        final PlaySessionController this$0;

        private void playIfTrackChanged(PropertySet propertyset)
        {
            propertyset = (Urn)propertyset.get(TrackProperty.URN);
            Urn urn = getCurrentPlayQueueTrackUrn();
            if (playSessionStateProvider.isPlaying() && !propertyset.equals(urn))
            {
                playCurrent();
            }
        }

        public final void onNext(PropertySet propertyset)
        {
            if (!castConnectionHelper.isCasting()) goto _L2; else goto _L1
_L1:
            playIfTrackChanged(propertyset);
_L4:
            currentPlayQueueTrack = propertyset;
            updateRemoteAudioManager();
            return;
_L2:
            if (playSessionStateProvider.isPlaying())
            {
                playCurrent();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final volatile void onNext(Object obj)
        {
            onNext((PropertySet)obj);
        }

        private CurrentTrackSubscriber()
        {
            this$0 = PlaySessionController.this;
            super();
        }

        CurrentTrackSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class PlayQueueSubscriber extends DefaultSubscriber
    {

        final PlaySessionController this$0;

        public void onNext(PlayQueueEvent playqueueevent)
        {
            if (playqueueevent.isNewQueue())
            {
                loadRecommendedSubscription.unsubscribe();
                stopContinuousPlayback = false;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((PlayQueueEvent)obj);
        }

        private PlayQueueSubscriber()
        {
            this$0 = PlaySessionController.this;
            super();
        }

        PlayQueueSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class PlayQueueTrackSubscriber extends DefaultSubscriber
    {

        final PlaySessionController this$0;

        public void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            if (!withinRecommendedFetchTolerance() || !isNotAlreadyLoadingRecommendations()) goto _L2; else goto _L1
_L1:
            PlayQueueItem playqueueitem = playQueueManager.getLastPlayQueueItem();
            if (!currentQueueAllowsRecommendations() || !playqueueitem.isTrack()) goto _L4; else goto _L3
_L3:
            loadRecommendedSubscription = playQueueOperations.relatedTracksPlayQueue(playqueueitem.getUrn(), fromContinuousPlay()).observeOn(rx.a.b.a.a()).doOnNext(appendUniquePlayQueueItems).subscribe(new UpcomingTracksSubscriber(null));
_L2:
            currentTrackSubscription.unsubscribe();
            currentplayqueueitemevent = currentplayqueueitemevent.getCurrentPlayQueueItem();
            if (currentplayqueueitemevent.isTrack())
            {
                currentTrackSubscription = trackRepository.track(currentplayqueueitemevent.getUrn()).map(PropertySetFunctions.mergeInto(currentplayqueueitemevent.getMetaData())).subscribe(new CurrentTrackSubscriber(null));
            }
            return;
_L4:
            if (currentplayqueueitemevent.getCollectionUrn().isStation())
            {
                loadRecommendedSubscription = stationsOperations.fetchUpcomingTracks(currentplayqueueitemevent.getCollectionUrn(), playQueueManager.getQueueSize()).observeOn(rx.a.b.a.a()).doOnNext(appendPlayQueueItems).subscribe(new UpcomingTracksSubscriber(null));
            }
            if (true) goto _L2; else goto _L5
_L5:
        }

        public volatile void onNext(Object obj)
        {
            onNext((CurrentPlayQueueItemEvent)obj);
        }

        private PlayQueueTrackSubscriber()
        {
            this$0 = PlaySessionController.this;
            super();
        }

        PlayQueueTrackSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class PlayStateSubscriber extends DefaultSubscriber
    {

        final PlaySessionController this$0;

        public void onNext(Player.StateTransition statetransition)
        {
            if (!Player.StateTransition.DEFAULT.equals(statetransition))
            {
                audioManager.setPlaybackState(statetransition.playSessionIsActive());
                skipOnTrackFinishOrUnplayable(statetransition);
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((Player.StateTransition)obj);
        }

        private PlayStateSubscriber()
        {
            this$0 = PlaySessionController.this;
            super();
        }

        PlayStateSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class UpcomingTracksSubscriber extends DefaultSubscriber
    {

        final PlaySessionController this$0;

        public void onError(Throwable throwable)
        {
            if (throwable instanceof UnsupportedOperationException)
            {
                HashMap hashmap = new HashMap(2);
                hashmap.put("Queue Size", String.valueOf(playQueueManager.getQueueSize()));
                hashmap.put("PlaySessionSource", playQueueManager.getCurrentPlaySessionSource().toString());
                ErrorUtils.handleSilentException(throwable, hashmap);
                return;
            } else
            {
                super.onError(throwable);
                return;
            }
        }

        public void onNext(PlayQueue playqueue)
        {
            stopContinuousPlayback = playqueue.isEmpty();
        }

        public volatile void onNext(Object obj)
        {
            onNext((PlayQueue)obj);
        }

        private UpcomingTracksSubscriber()
        {
            this$0 = PlaySessionController.this;
            super();
        }

        UpcomingTracksSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final long PROGRESS_THRESHOLD_FOR_TRACK_CHANGE;
    static final int RECOMMENDED_LOAD_TOLERANCE = 5;
    private static final long SEEK_POSITION_RESET = 0L;
    public static final int SKIP_REPORT_TOLERANCE = 1000;
    private final AccountOperations accountOperations;
    private final AdsController adsController;
    private final AdsOperations adsOperations;
    private final rx.b.b appendPlayQueueItems = new _cls3();
    private final rx.b.b appendUniquePlayQueueItems = new _cls2();
    private final IRemoteAudioManager audioManager;
    private final CastConnectionHelper castConnectionHelper;
    private final NetworkConnectionHelper connectionHelper;
    private final f copyBitmap = new _cls1();
    private PropertySet currentPlayQueueTrack;
    private Y currentTrackSubscription;
    private final EventBus eventBus;
    private final ImageOperations imageOperations;
    private Y loadRecommendedSubscription;
    private final rx.b.b playCurrentTrack = new _cls5();
    private final PlayQueueManager playQueueManager;
    private final PlayQueueOperations playQueueOperations;
    private final PlaySessionStateProvider playSessionStateProvider;
    private final Provider playbackStrategyProvider;
    private final PlaybackToastHelper playbackToastHelper;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;
    private final rx.b.b showPlayer = new _cls7();
    private final StationsOperations stationsOperations;
    private boolean stopContinuousPlayback;
    private final a stopLoadingPreviousTrack = new _cls4();
    private Y subscription;
    private final f toPlayCurrent = new _cls6();
    private final TrackRepository trackRepository;

    public PlaySessionController(Resources resources1, EventBus eventbus, AdsOperations adsoperations, AdsController adscontroller, PlayQueueManager playqueuemanager, TrackRepository trackrepository, Lazy lazy, 
            PlayQueueOperations playqueueoperations, ImageOperations imageoperations, PlaySessionStateProvider playsessionstateprovider, CastConnectionHelper castconnectionhelper, SharedPreferences sharedpreferences, NetworkConnectionHelper networkconnectionhelper, Provider provider, 
            PlaybackToastHelper playbacktoasthelper, AccountOperations accountoperations, StationsOperations stationsoperations)
    {
        currentTrackSubscription = RxUtils.invalidSubscription();
        loadRecommendedSubscription = RxUtils.invalidSubscription();
        subscription = RxUtils.invalidSubscription();
        resources = resources1;
        eventBus = eventbus;
        adsOperations = adsoperations;
        adsController = adscontroller;
        playQueueManager = playqueuemanager;
        trackRepository = trackrepository;
        playQueueOperations = playqueueoperations;
        sharedPreferences = sharedpreferences;
        connectionHelper = networkconnectionhelper;
        playbackStrategyProvider = provider;
        playbackToastHelper = playbacktoasthelper;
        accountOperations = accountoperations;
        stationsOperations = stationsoperations;
        audioManager = (IRemoteAudioManager)lazy.a();
        imageOperations = imageoperations;
        playSessionStateProvider = playsessionstateprovider;
        castConnectionHelper = castconnectionhelper;
    }

    private Player.StateTransition createPlayQueueCompleteEvent(Urn urn)
    {
        return new Player.StateTransition(Player.PlayerState.IDLE, Player.Reason.PLAY_QUEUE_COMPLETE, urn);
    }

    private boolean currentQueueAllowsRecommendations()
    {
        if (!stopContinuousPlayback)
        {
            PlaySessionSource playsessionsource = playQueueManager.getCurrentPlaySessionSource();
            if (!playQueueManager.getCollectionUrn().isStation() && (sharedPreferences.getBoolean("autoplay_related_enabled", true) || playsessionsource.originatedInExplore() || Screen.DEEPLINK.get().equals(playsessionsource.getOriginScreen())))
            {
                return true;
            }
        }
        return false;
    }

    private boolean fromContinuousPlay()
    {
        PlaySessionSource playsessionsource = playQueueManager.getCurrentPlaySessionSource();
        return !playsessionsource.originatedInExplore() && !playsessionsource.originatedFromDeeplink() && !playsessionsource.originatedInSearchSuggestions();
    }

    private Urn getCurrentPlayQueueTrackUrn()
    {
        if (currentPlayQueueTrack == null)
        {
            return Urn.NOT_SET;
        } else
        {
            return (Urn)currentPlayQueueTrack.get(TrackProperty.URN);
        }
    }

    private boolean isNotAlreadyLoadingRecommendations()
    {
        return loadRecommendedSubscription.isUnsubscribed();
    }

    private void logInvalidSkipping(Player.StateTransition statetransition)
    {
        PlaybackProgress playbackprogress = statetransition.getProgress();
        if (statetransition.trackEnded())
        {
            if (Math.abs(playbackprogress.getDuration() - playbackprogress.getPosition()) > 1000L)
            {
                ErrorUtils.handleSilentException(statetransition.toString(), new IllegalStateException("Track ended prematurely"));
            }
        } else
        if (playbackprogress.getPosition() > 0L)
        {
            ErrorUtils.handleSilentException(statetransition.toString(), new IllegalStateException("Skipping on track error too late"));
            return;
        }
    }

    private void publishSkipEventIfAudioAd()
    {
        if (adsOperations.isCurrentItemAudioAd())
        {
            Object obj = (TrackQueueItem)playQueueManager.getCurrentPlayQueueItem();
            obj = UIEvent.fromSkipAudioAdClick(((TrackQueueItem) (obj)).getMetaData(), ((TrackQueueItem) (obj)).getTrackUrn(), accountOperations.getLoggedInUserUrn(), playQueueManager.getCurrentTrackSourceInfo());
            eventBus.publish(EventQueue.TRACKING, obj);
        }
    }

    private void skipOnTrackFinishOrUnplayable(Player.StateTransition statetransition)
    {
        if (statetransition.isPlayerIdle() && !statetransition.isPlayQueueComplete() && (statetransition.trackEnded() || unrecoverableErrorDuringAutoplay(statetransition)))
        {
            logInvalidSkipping(statetransition);
            adsController.reconfigureAdForNextTrack();
            tryToSkipTrack(statetransition);
            if (!statetransition.playSessionIsActive())
            {
                playCurrent();
            }
        }
    }

    private void tryToSkipTrack(Player.StateTransition statetransition)
    {
        if (!playQueueManager.autoNextItem())
        {
            eventBus.publish(EventQueue.PLAYBACK_STATE_CHANGED, createPlayQueueCompleteEvent(statetransition.getTrackUrn()));
        }
    }

    private boolean unrecoverableErrorDuringAutoplay(Player.StateTransition statetransition)
    {
        TrackSourceInfo tracksourceinfo = playQueueManager.getCurrentTrackSourceInfo();
        return statetransition.wasError() && !statetransition.wasGeneralFailure() && tracksourceinfo != null && !tracksourceinfo.getIsUserTriggered() && connectionHelper.isNetworkConnected();
    }

    private void updateRemoteAudioManager()
    {
        if (audioManager.isTrackChangeSupported())
        {
            audioManager.onTrackChanged(currentPlayQueueTrack, null);
            Urn urn = (Urn)currentPlayQueueTrack.get(TrackProperty.URN);
            currentTrackSubscription = imageOperations.artwork(urn, ApiImageSize.getFullImageSize(resources)).filter(validateBitmap(urn)).map(copyBitmap).subscribe(new ArtworkSubscriber(null));
        }
    }

    private f validateBitmap(final Urn resourceUrn)
    {
        return new _cls8();
    }

    private boolean withinRecommendedFetchTolerance()
    {
        return !playQueueManager.isQueueEmpty() && playQueueManager.getQueueSize() - playQueueManager.getCurrentPosition() <= 5;
    }

    public void nextTrack()
    {
        if (shouldDisableSkipping())
        {
            playbackToastHelper.showUnskippableAdToast();
            return;
        } else
        {
            publishSkipEventIfAudioAd();
            playQueueManager.nextItem();
            return;
        }
    }

    public void pause()
    {
        ((PlaybackStrategy)playbackStrategyProvider.get()).pause();
    }

    public void play()
    {
        ((PlaybackStrategy)playbackStrategyProvider.get()).resume();
    }

    void playCurrent()
    {
        subscription.unsubscribe();
        b b1;
        if (playQueueManager.isQueueEmpty())
        {
            b1 = playQueueManager.loadPlayQueueAsync().flatMap(toPlayCurrent);
        } else
        {
            b1 = ((PlaybackStrategy)playbackStrategyProvider.get()).playCurrent();
        }
        subscription = b1.subscribe(new DefaultSubscriber());
    }

    public b playNewQueue(PlayQueue playqueue, Urn urn, int i, boolean flag, PlaySessionSource playsessionsource)
    {
        if (shouldDisableSkipping())
        {
            return b.just(PlaybackResult.error(PlaybackResult.ErrorReason.UNSKIPPABLE));
        } else
        {
            return ((PlaybackStrategy)playbackStrategyProvider.get()).setNewQueue(playqueue, urn, i, flag, playsessionsource).doOnSubscribe(stopLoadingPreviousTrack).doOnNext(playCurrentTrack);
        }
    }

    public void previousTrack()
    {
        if (shouldDisableSkipping())
        {
            playbackToastHelper.showUnskippableAdToast();
            return;
        }
        if (playSessionStateProvider.getLastProgressEvent().getPosition() >= PROGRESS_THRESHOLD_FOR_TRACK_CHANGE && !adsOperations.isCurrentItemAudioAd())
        {
            seek(0L);
            return;
        } else
        {
            publishSkipEventIfAudioAd();
            playQueueManager.moveToPreviousItem();
            return;
        }
    }

    public void reloadQueueAndShowPlayerIfEmpty()
    {
        if (playQueueManager.isQueueEmpty())
        {
            subscription.unsubscribe();
            subscription = playQueueManager.loadPlayQueueAsync().doOnNext(showPlayer).subscribe(new DefaultSubscriber());
        }
    }

    public void seek(long l)
    {
label0:
        {
            if (!shouldDisableSkipping())
            {
                if (!playSessionStateProvider.isPlayingCurrentPlayQueueTrack())
                {
                    break label0;
                }
                ((PlaybackStrategy)playbackStrategyProvider.get()).seek(l);
            }
            return;
        }
        playQueueManager.saveCurrentProgress(l);
    }

    public void setPlayQueuePosition(int i)
    {
        if (i != playQueueManager.getCurrentPosition())
        {
            publishSkipEventIfAudioAd();
            playQueueManager.setPosition(i);
        }
    }

    public boolean shouldDisableSkipping()
    {
        return adsOperations.isCurrentItemAudioAd() && playSessionStateProvider.getLastProgressEventForCurrentPlayQueueTrack().getPosition() < AdConstants.UNSKIPPABLE_TIME_MS;
    }

    public void subscribe()
    {
        eventBus.subscribe(EventQueue.PLAYBACK_STATE_CHANGED, new PlayStateSubscriber(null));
        eventBus.subscribe(EventQueue.CURRENT_PLAY_QUEUE_ITEM, new PlayQueueTrackSubscriber(null));
        eventBus.subscribe(EventQueue.PLAY_QUEUE, new PlayQueueSubscriber(null));
    }

    public void togglePlayback()
    {
        if (playSessionStateProvider.isPlayingCurrentPlayQueueTrack())
        {
            ((PlaybackStrategy)playbackStrategyProvider.get()).togglePlayback();
            return;
        } else
        {
            playCurrent();
            return;
        }
    }

    static 
    {
        PROGRESS_THRESHOLD_FOR_TRACK_CHANGE = TimeUnit.SECONDS.toMillis(3L);
    }




/*
    static boolean access$1002(PlaySessionController playsessioncontroller, boolean flag)
    {
        playsessioncontroller.stopContinuousPlayback = flag;
        return flag;
    }

*/












/*
    static Y access$2002(PlaySessionController playsessioncontroller, Y y)
    {
        playsessioncontroller.currentTrackSubscription = y;
        return y;
    }

*/






/*
    static PropertySet access$2502(PlaySessionController playsessioncontroller, PropertySet propertyset)
    {
        playsessioncontroller.currentPlayQueueTrack = propertyset;
        return propertyset;
    }

*/








/*
    static Y access$902(PlaySessionController playsessioncontroller, Y y)
    {
        playsessioncontroller.loadRecommendedSubscription = y;
        return y;
    }

*/

    private class _cls1
        implements f
    {

        final PlaySessionController this$0;

        public Bitmap call(Bitmap bitmap)
        {
            return bitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, false);
        }

        public volatile Object call(Object obj)
        {
            return call((Bitmap)obj);
        }

        _cls1()
        {
            this$0 = PlaySessionController.this;
            super();
        }
    }


    private class _cls2
        implements rx.b.b
    {

        final PlaySessionController this$0;

        public void call(PlayQueue playqueue)
        {
            playQueueManager.appendUniquePlayQueueItems(playqueue);
        }

        public volatile void call(Object obj)
        {
            call((PlayQueue)obj);
        }

        _cls2()
        {
            this$0 = PlaySessionController.this;
            super();
        }
    }


    private class _cls3
        implements rx.b.b
    {

        final PlaySessionController this$0;

        public void call(PlayQueue playqueue)
        {
            playQueueManager.appendPlayQueueItems(playqueue);
        }

        public volatile void call(Object obj)
        {
            call((PlayQueue)obj);
        }

        _cls3()
        {
            this$0 = PlaySessionController.this;
            super();
        }
    }


    private class _cls4
        implements a
    {

        final PlaySessionController this$0;

        public void call()
        {
            subscription.unsubscribe();
        }

        _cls4()
        {
            this$0 = PlaySessionController.this;
            super();
        }
    }


    private class _cls5
        implements rx.b.b
    {

        final PlaySessionController this$0;

        public void call(PlaybackResult playbackresult)
        {
            playCurrent();
        }

        public volatile void call(Object obj)
        {
            call((PlaybackResult)obj);
        }

        _cls5()
        {
            this$0 = PlaySessionController.this;
            super();
        }
    }


    private class _cls6
        implements f
    {

        final PlaySessionController this$0;

        public volatile Object call(Object obj)
        {
            return call((PlayQueue)obj);
        }

        public b call(PlayQueue playqueue)
        {
            return ((PlaybackStrategy)playbackStrategyProvider.get()).playCurrent();
        }

        _cls6()
        {
            this$0 = PlaySessionController.this;
            super();
        }
    }


    private class _cls7
        implements rx.b.b
    {

        final PlaySessionController this$0;

        public void call(PlayQueue playqueue)
        {
            eventBus.publish(EventQueue.PLAYER_COMMAND, PlayerUICommand.showPlayer());
        }

        public volatile void call(Object obj)
        {
            call((PlayQueue)obj);
        }

        _cls7()
        {
            this$0 = PlaySessionController.this;
            super();
        }
    }


    private class _cls8
        implements f
    {

        final PlaySessionController this$0;
        final Urn val$resourceUrn;

        public Boolean call(Bitmap bitmap)
        {
            if (bitmap == null)
            {
                ErrorUtils.handleSilentException(new IllegalArgumentException((new StringBuilder("Artwork bitmap is null ")).append(resourceUrn).toString()));
                return Boolean.valueOf(false);
            }
            if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0)
            {
                ErrorUtils.handleSilentException(new IllegalArgumentException((new StringBuilder("Artwork bitmap has no size ")).append(resourceUrn).toString()));
                return Boolean.valueOf(false);
            } else
            {
                return Boolean.valueOf(true);
            }
        }

        public volatile Object call(Object obj)
        {
            return call((Bitmap)obj);
        }

        _cls8()
        {
            this$0 = PlaySessionController.this;
            resourceUrn = urn;
            super();
        }
    }

}
