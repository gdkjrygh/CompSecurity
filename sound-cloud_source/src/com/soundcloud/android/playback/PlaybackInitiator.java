// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.net.Uri;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.stations.Stations;
import com.soundcloud.android.storage.TrackStorage;
import java.util.List;
import rx.a.b.a;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionSource, PlayQueueManager, PlayQueue, PlaybackResult, 
//            PlaySessionController, PlayQueueOperations

public class PlaybackInitiator
{

    public static final boolean WITHOUT_RELATED = false;
    public static final boolean WITH_RELATED = true;
    private final PlayQueueManager playQueueManager;
    private final PlayQueueOperations playQueueOperations;
    private final PlaySessionController playSessionController;
    private final TrackStorage trackStorage;

    public PlaybackInitiator(TrackStorage trackstorage, PlayQueueManager playqueuemanager, PlayQueueOperations playqueueoperations, PlaySessionController playsessioncontroller)
    {
        trackStorage = trackstorage;
        playQueueManager = playqueuemanager;
        playQueueOperations = playqueueoperations;
        playSessionController = playsessioncontroller;
    }

    private boolean isCurrentPlayQueueOrRecommendationState(Urn urn, PlaySessionSource playsessionsource)
    {
        return isCurrentTrack(urn) && isCurrentScreenSource(playsessionsource) && playQueueManager.isCurrentCollectionOrRecommendation(playsessionsource.getCollectionUrn());
    }

    private boolean isCurrentScreenSource(PlaySessionSource playsessionsource)
    {
        return playsessionsource.getOriginScreen().equals(playQueueManager.getScreenTag());
    }

    private boolean isCurrentTrack(Urn urn)
    {
        return playQueueManager.isCurrentTrack(urn);
    }

    private b playNewQueue(PlayQueue playqueue, Urn urn, int i, boolean flag, PlaySessionSource playsessionsource)
    {
        if (playqueue.isEmpty())
        {
            return b.just(PlaybackResult.error(PlaybackResult.ErrorReason.MISSING_PLAYABLE_TRACKS));
        } else
        {
            return playSessionController.playNewQueue(playqueue, urn, i, flag, playsessionsource);
        }
    }

    private b playTracksList(b b1, Urn urn, int i, PlaySessionSource playsessionsource, boolean flag)
    {
        if (!shouldChangePlayQueue(urn, playsessionsource))
        {
            return b.just(PlaybackResult.success());
        } else
        {
            return b1.flatMap(toPlaybackResult(urn, i, playsessionsource, flag)).observeOn(a.a());
        }
    }

    private boolean shouldChangePlayQueue(Urn urn, PlaySessionSource playsessionsource)
    {
        return playQueueManager.isQueueEmpty() || !isCurrentTrack(urn) || !isCurrentScreenSource(playsessionsource) || !playQueueManager.isCurrentCollection(playsessionsource.getCollectionUrn());
    }

    private f toPlaybackResult(final int startPosition, final PlaySessionSource playSessionSource, final boolean loadRelated)
    {
        return new _cls4();
    }

    private f toPlaybackResult(final Urn initialTrack, final int startPosition, final PlaySessionSource playSessionSource, final boolean loadRelated)
    {
        return new _cls5();
    }

    private f toShuffledPlayQueue(final PlaySessionSource playSessionSource)
    {
        return new _cls1();
    }

    private f tracksToPlayQueue(final PlaySessionSource playSessionSource)
    {
        return new _cls3();
    }

    private f urnsToPlayQueue(final PlaySessionSource playSessionSource)
    {
        return new _cls2();
    }

    public b playPosts(b b1, Urn urn, int i, PlaySessionSource playsessionsource)
    {
        return playTracksList(b1.map(tracksToPlayQueue(playsessionsource)), urn, i, playsessionsource, false);
    }

    public b playStation(Urn urn, List list, PlaySessionSource playsessionsource, int i)
    {
        Urn urn1;
        if (i == Stations.NEVER_PLAYED)
        {
            urn1 = Urn.NOT_SET;
            i = 0;
        } else
        {
            urn1 = (Urn)list.get(i);
            i = (i + 1) % list.size();
        }
        if (isCurrentPlayQueueOrRecommendationState(urn1, playsessionsource))
        {
            return b.just(PlaybackResult.success());
        } else
        {
            urn = PlayQueue.fromStation(urn, list);
            return playNewQueue(urn, urn.getUrn(i), i, false, playsessionsource);
        }
    }

    public b playTrackWithRecommendations(Urn urn, PlaySessionSource playsessionsource, int i)
    {
        return playQueueOperations.relatedTracksPlayQueueWithSeedTrack(urn).flatMap(toPlaybackResult(i, playsessionsource, false));
    }

    public b playTrackWithRecommendationsLegacy(Urn urn, PlaySessionSource playsessionsource)
    {
        return playTracksList(b.just(urn).toList().map(urnsToPlayQueue(playsessionsource)), urn, 0, playsessionsource, true);
    }

    public b playTracks(List list, int i, PlaySessionSource playsessionsource)
    {
        return playTracks(list, (Urn)list.get(i), i, playsessionsource);
    }

    public b playTracks(List list, Urn urn, int i, PlaySessionSource playsessionsource)
    {
        return playTracksList(b.from(list).toList().map(urnsToPlayQueue(playsessionsource)), urn, i, playsessionsource, false);
    }

    public b playTracks(b b1, Urn urn, int i, PlaySessionSource playsessionsource)
    {
        return playTracksList(b1.map(urnsToPlayQueue(playsessionsource)), urn, i, playsessionsource, false);
    }

    public b playTracksFromUri(Uri uri, int i, Urn urn, PlaySessionSource playsessionsource)
    {
        return playTracksList(trackStorage.getTracksForUriAsync(uri).map(urnsToPlayQueue(playsessionsource)), urn, i, playsessionsource, false);
    }

    public b playTracksShuffled(b b1, PlaySessionSource playsessionsource)
    {
        return b1.map(toShuffledPlayQueue(playsessionsource)).flatMap(toPlaybackResult(Urn.NOT_SET, 0, playsessionsource, false)).observeOn(a.a());
    }

    public b startPlayback(PublicApiTrack publicapitrack, Screen screen, boolean flag)
    {
        playQueueManager.clearAll();
        screen = new PlaySessionSource(screen);
        return playTracksList(b.just(publicapitrack.getUrn()).toList().map(urnsToPlayQueue(screen)), publicapitrack.getUrn(), 0, screen, flag);
    }

    public b startPlaybackWithRecommendations(Urn urn, Screen screen, SearchQuerySourceInfo searchquerysourceinfo)
    {
        screen = new PlaySessionSource(screen);
        screen.setSearchQuerySourceInfo(searchquerysourceinfo);
        return playTracksList(b.just(urn).toList().map(urnsToPlayQueue(screen)), urn, 0, screen, true);
    }


    private class _cls4
        implements f
    {

        final PlaybackInitiator this$0;
        final boolean val$loadRelated;
        final PlaySessionSource val$playSessionSource;
        final int val$startPosition;

        public volatile Object call(Object obj)
        {
            return call((PlayQueue)obj);
        }

        public b call(PlayQueue playqueue)
        {
            return playNewQueue(playqueue, playqueue.getUrn(startPosition), startPosition, loadRelated, playSessionSource);
        }

        _cls4()
        {
            this$0 = PlaybackInitiator.this;
            startPosition = i;
            loadRelated = flag;
            playSessionSource = playsessionsource;
            super();
        }
    }


    private class _cls5
        implements f
    {

        final PlaybackInitiator this$0;
        final Urn val$initialTrack;
        final boolean val$loadRelated;
        final PlaySessionSource val$playSessionSource;
        final int val$startPosition;

        public volatile Object call(Object obj)
        {
            return call((PlayQueue)obj);
        }

        public b call(PlayQueue playqueue)
        {
            return playNewQueue(playqueue, initialTrack, startPosition, loadRelated, playSessionSource);
        }

        _cls5()
        {
            this$0 = PlaybackInitiator.this;
            initialTrack = urn;
            startPosition = i;
            loadRelated = flag;
            playSessionSource = playsessionsource;
            super();
        }
    }


    private class _cls1
        implements f
    {

        final PlaybackInitiator this$0;
        final PlaySessionSource val$playSessionSource;

        public PlayQueue call(List list)
        {
            return PlayQueue.shuffled(list, playSessionSource);
        }

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        _cls1()
        {
            this$0 = PlaybackInitiator.this;
            playSessionSource = playsessionsource;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final PlaybackInitiator this$0;
        final PlaySessionSource val$playSessionSource;

        public PlayQueue call(List list)
        {
            if (list.isEmpty())
            {
                return PlayQueue.empty();
            } else
            {
                return PlayQueue.fromTrackList(list, playSessionSource);
            }
        }

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        _cls3()
        {
            this$0 = PlaybackInitiator.this;
            playSessionSource = playsessionsource;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final PlaybackInitiator this$0;
        final PlaySessionSource val$playSessionSource;

        public PlayQueue call(List list)
        {
            if (list.isEmpty())
            {
                return PlayQueue.empty();
            } else
            {
                return PlayQueue.fromTrackUrnList(list, playSessionSource);
            }
        }

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        _cls2()
        {
            this$0 = PlaybackInitiator.this;
            playSessionSource = playsessionsource;
            super();
        }
    }

}
