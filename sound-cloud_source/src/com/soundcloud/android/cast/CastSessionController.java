// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.p;
import com.google.android.gms.cast.r;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumerImpl;
import com.soundcloud.android.ServiceInitiator;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayerUICommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueue;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionSource;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.android.playback.PlaybackProgress;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.Arrays;
import java.util.List;
import javax.inject.Provider;
import rx.X;
import rx.b;

// Referenced classes of package com.soundcloud.android.cast:
//            CastPlayer, RemotePlayQueue, CastOperations

public class CastSessionController extends VideoCastConsumerImpl
    implements com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager.MediaRouteDialogListener
{

    private final CastOperations castOperations;
    private final CastPlayer castPlayer;
    private final EventBus eventBus;
    private final Provider expandPlayerSubscriber;
    private final PlayQueueManager playQueueManager;
    private final PlaySessionStateProvider playSessionStateProvider;
    private final ServiceInitiator serviceInitiator;
    private final VideoCastManager videoCastManager;

    public CastSessionController(CastOperations castoperations, ServiceInitiator serviceinitiator, CastPlayer castplayer, PlayQueueManager playqueuemanager, VideoCastManager videocastmanager, EventBus eventbus, PlaySessionStateProvider playsessionstateprovider, 
            Provider provider)
    {
        castOperations = castoperations;
        serviceInitiator = serviceinitiator;
        castPlayer = castplayer;
        playQueueManager = playqueuemanager;
        videoCastManager = videocastmanager;
        eventBus = eventbus;
        playSessionStateProvider = playsessionstateprovider;
        expandPlayerSubscriber = provider;
    }

    private void openStreamAndExpandPlayer(Context context)
    {
        context.startActivity((new Intent("com.soundcloud.android.action.STREAM")).putExtra("expand_player", true).setFlags(0x14000000));
    }

    private rx.b.b playCurrent(final PlaybackProgress lastProgressForTrack)
    {
        return new _cls1();
    }

    private void playLocalPlayQueueOnRemote()
    {
        PlaybackProgress playbackprogress = playSessionStateProvider.getLastProgressEventForCurrentPlayQueueTrack();
        castPlayer.reloadCurrentQueue().doOnNext(playCurrent(playbackprogress)).subscribe((X)expandPlayerSubscriber.get());
    }

    private void updateLocalPlayQueueAndPlayState(RemotePlayQueue remoteplayqueue)
    {
        List list = remoteplayqueue.getTrackList();
        Urn urn = remoteplayqueue.getCurrentTrackUrn();
        int i = remoteplayqueue.getCurrentPosition();
        String.format("Loading Remote Queue, CurrentUrn: %s, RemoteTrackListSize: %d", new Object[] {
            urn, Integer.valueOf(list.size())
        });
        if (playQueueManager.hasSameTrackList(list))
        {
            playQueueManager.setPosition(i);
            if (videoCastManager.getPlaybackStatus() == 2)
            {
                castPlayer.playCurrent();
            }
        } else
        {
            remoteplayqueue = list;
            if (list.isEmpty())
            {
                remoteplayqueue = Arrays.asList(new Urn[] {
                    urn
                });
            }
            remoteplayqueue = PlayQueue.fromTrackUrnList(remoteplayqueue, PlaySessionSource.EMPTY);
            playQueueManager.setNewPlayQueue(remoteplayqueue, PlaySessionSource.EMPTY, i);
            castPlayer.playCurrent();
        }
        eventBus.publish(EventQueue.PLAYER_COMMAND, PlayerUICommand.showPlayer());
    }

    public void onApplicationConnected(ApplicationMetadata applicationmetadata, String s, boolean flag)
    {
        serviceInitiator.stopPlaybackService();
        if (flag && !playQueueManager.isQueueEmpty())
        {
            playLocalPlayQueueOnRemote();
        }
    }

    public void onMediaRouteDialogCellClick(Context context)
    {
        openStreamAndExpandPlayer(context);
    }

    public void onRemoteMediaPlayerMetadataUpdated()
    {
        RemotePlayQueue remoteplayqueue = castOperations.loadRemotePlayQueue();
        if (!remoteplayqueue.getTrackList().isEmpty())
        {
            updateLocalPlayQueueAndPlayState(remoteplayqueue);
        }
    }

    public void onRemoteMediaPlayerStatusUpdated()
    {
        (new StringBuilder("On Status updated, status: ")).append(videoCastManager.getRemoteMediaPlayer().c().e);
        super.onRemoteMediaPlayerStatusUpdated();
    }

    public void startListening()
    {
        videoCastManager.addVideoCastConsumer(this);
        videoCastManager.setMediaRouteDialogListener(this);
    }


    private class _cls1
        implements rx.b.b
    {

        final CastSessionController this$0;
        final PlaybackProgress val$lastProgressForTrack;

        public void call(PlaybackResult playbackresult)
        {
            castPlayer.playCurrent(lastProgressForTrack.getPosition());
        }

        public volatile void call(Object obj)
        {
            call((PlaybackResult)obj);
        }

        _cls1()
        {
            this$0 = CastSessionController.this;
            lastProgressForTrack = playbackprogress;
            super();
        }
    }

}
