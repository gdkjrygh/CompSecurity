// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.likes.TrackLikeOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaySessionSource;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.playlists.PlaylistOperations;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.java.collections.PropertySet;
import rx.R;
import rx.a.b.a;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.offline:
//            TrackDownloadsStorage, OfflineProperty, OfflineState

public class OfflinePlaybackOperations
{

    private final NetworkConnectionHelper connectionHelper;
    private final FeatureOperations featureOperations;
    private final TrackLikeOperations likeOperations;
    private final PlaybackInitiator playbackInitiator;
    private final PlaylistOperations playlistOperations;
    private final R scheduler;
    private final TrackDownloadsStorage trackDownloadsStorage;

    public OfflinePlaybackOperations(FeatureOperations featureoperations, NetworkConnectionHelper networkconnectionhelper, PlaybackInitiator playbackinitiator, TrackLikeOperations tracklikeoperations, PlaylistOperations playlistoperations, TrackDownloadsStorage trackdownloadsstorage, R r)
    {
        featureOperations = featureoperations;
        connectionHelper = networkconnectionhelper;
        playbackInitiator = playbackinitiator;
        likeOperations = tracklikeoperations;
        playlistOperations = playlistoperations;
        trackDownloadsStorage = trackdownloadsstorage;
        scheduler = r;
    }

    private f playIfAvailableOffline(final Urn trackUrn, final int position, final PlaySessionSource sessionSource)
    {
        return new _cls1();
    }

    public b playLikedTracksShuffled(PlaySessionSource playsessionsource)
    {
        b b1;
        if (shouldCreateOfflinePlayQueue())
        {
            b1 = trackDownloadsStorage.likesUrns();
        } else
        {
            b1 = likeOperations.likedTrackUrns();
        }
        return playbackInitiator.playTracksShuffled(b1.subscribeOn(scheduler), playsessionsource);
    }

    public b playLikes(Urn urn, int i, PlaySessionSource playsessionsource)
    {
        if (shouldCreateOfflinePlayQueue())
        {
            return trackDownloadsStorage.likesUrns().subscribeOn(scheduler).observeOn(a.a()).flatMap(playIfAvailableOffline(urn, i, playsessionsource));
        } else
        {
            return playbackInitiator.playTracks(likeOperations.likedTrackUrns(), urn, i, playsessionsource);
        }
    }

    public b playPlaylist(Urn urn, Urn urn1, int i, PlaySessionSource playsessionsource)
    {
        if (shouldCreateOfflinePlayQueue())
        {
            return trackDownloadsStorage.playlistTrackUrns(urn).subscribeOn(scheduler).observeOn(a.a()).flatMap(playIfAvailableOffline(urn1, i, playsessionsource));
        } else
        {
            return playbackInitiator.playTracks(playlistOperations.trackUrnsForPlayback(urn), urn1, i, playsessionsource);
        }
    }

    public b playPlaylistShuffled(Urn urn, PlaySessionSource playsessionsource)
    {
        if (shouldCreateOfflinePlayQueue())
        {
            urn = trackDownloadsStorage.playlistTrackUrns(urn);
        } else
        {
            urn = playlistOperations.trackUrnsForPlayback(urn);
        }
        return playbackInitiator.playTracksShuffled(urn.subscribeOn(scheduler), playsessionsource);
    }

    boolean shouldCreateOfflinePlayQueue()
    {
        return featureOperations.isOfflineContentEnabled() && !connectionHelper.isNetworkConnected();
    }

    public boolean shouldPlayOffline(PropertySet propertyset)
    {
        return featureOperations.isOfflineContentEnabled() && propertyset.getOrElse(OfflineProperty.OFFLINE_STATE, OfflineState.NO_OFFLINE) == OfflineState.DOWNLOADED;
    }


    private class _cls1
        implements f
    {

        final OfflinePlaybackOperations this$0;
        final int val$position;
        final PlaySessionSource val$sessionSource;
        final Urn val$trackUrn;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public b call(List list)
        {
            int i = PlaybackUtils.correctInitialPositionLegacy(list, position, trackUrn);
            if (i < 0)
            {
                return b.just(PlaybackResult.error(com.soundcloud.android.playback.PlaybackResult.ErrorReason.TRACK_UNAVAILABLE_OFFLINE));
            } else
            {
                return playbackInitiator.playTracks(list, trackUrn, i, sessionSource);
            }
        }

        _cls1()
        {
            this$0 = OfflinePlaybackOperations.this;
            position = i;
            trackUrn = urn;
            sessionSource = playsessionsource;
            super();
        }
    }

}
