// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumerImpl;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.soundcloud.android.ads.AdFunctions;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlaybackProgressEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueue;
import com.soundcloud.android.playback.PlayQueueItem;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionSource;
import com.soundcloud.android.playback.PlaybackProgress;
import com.soundcloud.android.playback.PlaybackResult;
import com.soundcloud.android.playback.PlaybackUtils;
import com.soundcloud.android.playback.ProgressReporter;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.List;
import rx.Y;
import rx.a.b.a;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.cast:
//            CastOperations, LocalPlayQueue

public class CastPlayer extends VideoCastConsumerImpl
    implements com.soundcloud.android.playback.ProgressReporter.ProgressPuller
{
    private class PlayCurrentLocalQueueOnRemote extends DefaultSubscriber
    {

        private final Urn currentTrackUrn;
        private final long position;
        final CastPlayer this$0;

        public void onError(Throwable throwable)
        {
            reportStateChange(new StateTransition(com.soundcloud.android.playback.Player.PlayerState.IDLE, com.soundcloud.android.playback.Player.Reason.ERROR_FAILED, currentTrackUrn));
        }

        public void onNext(LocalPlayQueue localplayqueue)
        {
            playLocalQueueOnRemote(localplayqueue, position);
        }

        public volatile void onNext(Object obj)
        {
            onNext((LocalPlayQueue)obj);
        }

        private PlayCurrentLocalQueueOnRemote(Urn urn, long l)
        {
            this$0 = CastPlayer.this;
            super();
            currentTrackUrn = urn;
            position = l;
        }

        PlayCurrentLocalQueueOnRemote(Urn urn, long l, _cls1 _pcls1)
        {
            this(urn, l);
        }
    }


    private final VideoCastManager castManager;
    private final CastOperations castOperations;
    private final EventBus eventBus;
    private Y playCurrentSubscription;
    private final PlayQueueManager playQueueManager;
    private final ProgressReporter progressReporter;

    public CastPlayer(CastOperations castoperations, VideoCastManager videocastmanager, ProgressReporter progressreporter, PlayQueueManager playqueuemanager, EventBus eventbus)
    {
        playCurrentSubscription = RxUtils.invalidSubscription();
        castOperations = castoperations;
        castManager = videocastmanager;
        progressReporter = progressreporter;
        playQueueManager = playqueuemanager;
        eventBus = eventbus;
        videocastmanager.addVideoCastConsumer(this);
        progressreporter.setProgressPuller(this);
    }

    private List getCurrentQueueUrnsWithoutAds()
    {
        return (new PlayQueue(playQueueManager.filterQueueItemsWithMetadata(AdFunctions.HAS_AD_URN))).getTrackItemUrns();
    }

    private long getDuration()
    {
        long l = castManager.getMediaDuration();
        return l;
        Object obj;
        obj;
_L2:
        return 0L;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private com.soundcloud.android.playback.Player.StateTransition getStateTransition(com.soundcloud.android.playback.Player.PlayerState playerstate, com.soundcloud.android.playback.Player.Reason reason)
    {
        return new com.soundcloud.android.playback.Player.StateTransition(playerstate, reason, castOperations.getRemoteCurrentTrackUrn(), getProgress(), getDuration());
    }

    private com.soundcloud.android.playback.Player.Reason getTranslatedIdleReason(int i)
    {
        switch (i)
        {
        case 3: // '\003'
        default:
            return null;

        case 4: // '\004'
            return com.soundcloud.android.playback.Player.Reason.ERROR_FAILED;

        case 1: // '\001'
            return com.soundcloud.android.playback.Player.Reason.TRACK_COMPLETE;

        case 2: // '\002'
            return com.soundcloud.android.playback.Player.Reason.NONE;
        }
    }

    private boolean isCurrentlyLoadedOnRemotePlayer(Urn urn)
    {
        Urn urn1 = castOperations.getRemoteCurrentTrackUrn();
        return urn1 != Urn.NOT_SET && urn1.equals(urn);
    }

    private void playLocalQueueOnRemote(LocalPlayQueue localplayqueue, long l)
    {
        try
        {
            castManager.loadMedia(localplayqueue.mediaInfo, true, (int)l, localplayqueue.playQueueTracksJSON);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LocalPlayQueue localplayqueue)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LocalPlayQueue localplayqueue)
        {
            return;
        }
    }

    private f playNewLocalQueueOnRemote(final Urn initialTrackUrnCandidate, final PlaySessionSource playSessionSource)
    {
        return new _cls1();
    }

    private void reconnectToExistingSession()
    {
        onMediaPlayerStatusUpdatedListener(castManager.getPlaybackStatus(), castManager.getIdleReason());
    }

    private rx.b.b reportPlaybackError(final Urn initialTrackUrnCandidate)
    {
        return new _cls2();
    }

    private void reportStateChange(com.soundcloud.android.playback.Player.StateTransition statetransition)
    {
        eventBus.publish(EventQueue.PLAYBACK_STATE_CHANGED, statetransition);
        if (statetransition.isPlayerPlaying())
        {
            progressReporter.start();
            return;
        } else
        {
            progressReporter.stop();
            return;
        }
    }

    private void setNewPlayQueue(LocalPlayQueue localplayqueue, PlaySessionSource playsessionsource)
    {
        playQueueManager.setNewPlayQueue(PlayQueue.fromTrackUrnList(localplayqueue.playQueueTrackUrns, playsessionsource), playsessionsource, PlaybackUtils.correctInitialPositionLegacy(localplayqueue.playQueueTrackUrns, 0, localplayqueue.currentTrackUrn));
    }

    public void destroy()
    {
        castManager.onDeviceSelected(null);
        castManager.removeVideoCastConsumer(this);
    }

    public long getProgress()
    {
        long l = castManager.getCurrentMediaPosition();
        return l;
        Object obj;
        obj;
_L2:
        return 0L;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onDisconnected()
    {
        reportStateChange(getStateTransition(com.soundcloud.android.playback.Player.PlayerState.IDLE, com.soundcloud.android.playback.Player.Reason.NONE));
    }

    void onMediaPlayerStatusUpdatedListener(int i, int j)
    {
        i;
        JVM INSTR tableswitch 0 4: default 36
    //                   0 75
    //                   1 106
    //                   2 61
    //                   3 76
    //                   4 91;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown Media State code returned ")).append(i).toString());
_L4:
        reportStateChange(getStateTransition(com.soundcloud.android.playback.Player.PlayerState.PLAYING, com.soundcloud.android.playback.Player.Reason.NONE));
_L8:
        return;
_L5:
        reportStateChange(getStateTransition(com.soundcloud.android.playback.Player.PlayerState.IDLE, com.soundcloud.android.playback.Player.Reason.NONE));
        return;
_L6:
        reportStateChange(getStateTransition(com.soundcloud.android.playback.Player.PlayerState.BUFFERING, com.soundcloud.android.playback.Player.Reason.NONE));
        return;
_L3:
        com.soundcloud.android.playback.Player.Reason reason = getTranslatedIdleReason(j);
        if (reason != null)
        {
            reportStateChange(getStateTransition(com.soundcloud.android.playback.Player.PlayerState.IDLE, reason));
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void onRemoteMediaPlayerStatusUpdated()
    {
        onMediaPlayerStatusUpdatedListener(castManager.getPlaybackStatus(), castManager.getIdleReason());
    }

    public void pause()
    {
        try
        {
            castManager.pause();
            return;
        }
        catch (CastException castexception)
        {
            return;
        }
        catch (TransientNetworkDisconnectionException transientnetworkdisconnectionexception)
        {
            return;
        }
        catch (NoConnectionException noconnectionexception)
        {
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            return;
        }
    }

    public void playCurrent()
    {
        playCurrent(0L);
    }

    public void playCurrent(long l)
    {
        Urn urn = playQueueManager.getCurrentPlayQueueItem().getUrn();
        if (isCurrentlyLoadedOnRemotePlayer(urn))
        {
            reconnectToExistingSession();
            return;
        } else
        {
            reportStateChange(new com.soundcloud.android.playback.Player.StateTransition(com.soundcloud.android.playback.Player.PlayerState.BUFFERING, com.soundcloud.android.playback.Player.Reason.NONE, urn));
            playCurrentSubscription.unsubscribe();
            playCurrentSubscription = castOperations.loadLocalPlayQueue(urn, playQueueManager.getCurrentQueueTrackUrns()).subscribe(new PlayCurrentLocalQueueOnRemote(urn, l, null));
            return;
        }
    }

    public void pullProgress()
    {
        try
        {
            PlaybackProgress playbackprogress = new PlaybackProgress(castManager.getCurrentMediaPosition(), castManager.getMediaDuration());
            eventBus.publish(EventQueue.PLAYBACK_PROGRESS, new PlaybackProgressEvent(playbackprogress, castOperations.getRemoteCurrentTrackUrn()));
            return;
        }
        catch (TransientNetworkDisconnectionException transientnetworkdisconnectionexception)
        {
            return;
        }
        catch (NoConnectionException noconnectionexception)
        {
            return;
        }
    }

    b reloadCurrentQueue()
    {
        PlayQueueItem playqueueitem = playQueueManager.getCurrentPlayQueueItem();
        if (playqueueitem.isTrack())
        {
            return setNewQueue(getCurrentQueueUrnsWithoutAds(), playqueueitem.getUrn(), playQueueManager.getCurrentPlaySessionSource());
        } else
        {
            return b.just(PlaybackResult.error(com.soundcloud.android.playback.PlaybackResult.ErrorReason.TRACK_UNAVAILABLE_CAST));
        }
    }

    public boolean resume()
    {
        castManager.play();
        return true;
        Object obj;
        obj;
_L2:
        return false;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public long seek(long l)
    {
        try
        {
            castManager.seek((int)l);
            progressReporter.stop();
        }
        catch (TransientNetworkDisconnectionException transientnetworkdisconnectionexception)
        {
            return l;
        }
        catch (NoConnectionException noconnectionexception)
        {
            return l;
        }
        catch (IllegalStateException illegalstateexception)
        {
            return l;
        }
        return l;
    }

    public b setNewQueue(List list, Urn urn, PlaySessionSource playsessionsource)
    {
        return castOperations.loadLocalPlayQueueWithoutMonetizableAndPrivateTracks(urn, list).observeOn(a.a()).flatMap(playNewLocalQueueOnRemote(urn, playsessionsource)).doOnError(reportPlaybackError(urn));
    }

    public void stop()
    {
        pause();
    }

    public void togglePlayback()
    {
        try
        {
            castManager.togglePlayback();
            return;
        }
        catch (CastException castexception)
        {
            return;
        }
        catch (TransientNetworkDisconnectionException transientnetworkdisconnectionexception)
        {
            return;
        }
        catch (NoConnectionException noconnectionexception)
        {
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            return;
        }
    }




    private class _cls1
        implements f
    {

        final CastPlayer this$0;
        final Urn val$initialTrackUrnCandidate;
        final PlaySessionSource val$playSessionSource;

        private boolean isInitialTrackDifferent(LocalPlayQueue localplayqueue)
        {
            return initialTrackUrnCandidate != Urn.NOT_SET && !initialTrackUrnCandidate.equals(localplayqueue.currentTrackUrn);
        }

        public volatile Object call(Object obj)
        {
            return call((LocalPlayQueue)obj);
        }

        public b call(LocalPlayQueue localplayqueue)
        {
            if (localplayqueue.isEmpty() || isInitialTrackDifferent(localplayqueue))
            {
                return b.just(PlaybackResult.error(com.soundcloud.android.playback.PlaybackResult.ErrorReason.TRACK_UNAVAILABLE_CAST));
            } else
            {
                reportStateChange(new StateTransition(com.soundcloud.android.playback.Player.PlayerState.BUFFERING, com.soundcloud.android.playback.Player.Reason.NONE, localplayqueue.currentTrackUrn));
                setNewPlayQueue(localplayqueue, playSessionSource);
                return b.just(PlaybackResult.success());
            }
        }

        _cls1()
        {
            this$0 = CastPlayer.this;
            playSessionSource = playsessionsource;
            initialTrackUrnCandidate = urn;
            super();
        }
    }


    private class _cls2
        implements rx.b.b
    {

        final CastPlayer this$0;
        final Urn val$initialTrackUrnCandidate;

        public volatile void call(Object obj)
        {
            call((Throwable)obj);
        }

        public void call(Throwable throwable)
        {
            reportStateChange(new StateTransition(com.soundcloud.android.playback.Player.PlayerState.IDLE, com.soundcloud.android.playback.Player.Reason.ERROR_FAILED, initialTrackUrnCandidate));
        }

        _cls2()
        {
            this$0 = CastPlayer.this;
            initialTrackUrnCandidate = urn;
            super();
        }
    }

}
