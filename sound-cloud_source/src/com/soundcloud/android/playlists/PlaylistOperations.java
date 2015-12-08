// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.rx.eventbus.EventBus;
import rx.R;
import rx.b;
import rx.b.f;
import rx.b.g;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistStorage, PlaylistTracksStorage, AddTrackToPlaylistCommand, RemoveTrackFromPlaylistCommand, 
//            LoadPlaylistTrackUrnsCommand

public class PlaylistOperations
{
    public static class PlaylistMissingException extends Exception
    {

        public PlaylistMissingException()
        {
        }
    }


    private final AddTrackToPlaylistCommand addTrackToPlaylistCommand;
    private final EventBus eventBus;
    private final LoadPlaylistTrackUrnsCommand loadPlaylistTrackUrns;
    private final g mergePlaylistWithTracks = new _cls4();
    private final OfflineContentOperations offlineOperations;
    private final PlaylistStorage playlistStorage;
    private final PlaylistTracksStorage playlistTracksStorage;
    private final rx.b.b publishPlaylistCreatedEvent = new _cls3();
    private final rx.b.b publishTrackAddedToPlaylistEvent = new _cls1();
    private final rx.b.b publishTrackRemovedFromPlaylistEvent = new _cls2();
    private final RemoveTrackFromPlaylistCommand removeTrackFromPlaylistCommand;
    private final R scheduler;
    private final SyncInitiator syncInitiator;
    private final f validateLoadedPlaylist = new _cls5();

    PlaylistOperations(R r, SyncInitiator syncinitiator, PlaylistTracksStorage playlisttracksstorage, PlaylistStorage playliststorage, LoadPlaylistTrackUrnsCommand loadplaylisttrackurnscommand, OfflineContentOperations offlinecontentoperations, AddTrackToPlaylistCommand addtracktoplaylistcommand, 
            RemoveTrackFromPlaylistCommand removetrackfromplaylistcommand, EventBus eventbus)
    {
        scheduler = r;
        syncInitiator = syncinitiator;
        playlistTracksStorage = playlisttracksstorage;
        playlistStorage = playliststorage;
        loadPlaylistTrackUrns = loadplaylisttrackurnscommand;
        addTrackToPlaylistCommand = addtracktoplaylistcommand;
        removeTrackFromPlaylistCommand = removetrackfromplaylistcommand;
        eventBus = eventbus;
        offlineOperations = offlinecontentoperations;
    }

    private b createPlaylistInfoLoadObservable(Urn urn)
    {
        return b.zip(playlistStorage.loadPlaylist(urn), playlistTracksStorage.playlistTracks(urn).map(TrackItem.fromPropertySets()), mergePlaylistWithTracks).subscribeOn(scheduler);
    }

    private f syncIfNecessary(final Urn playlistUrn)
    {
        return new _cls9();
    }

    private f toChangeSet(final Urn targetUrn)
    {
        return new _cls7();
    }

    b addTrackToPlaylist(Urn urn, Urn urn1)
    {
        urn1 = new AddTrackToPlaylistCommand.AddTrackToPlaylistParams(urn, urn1);
        return addTrackToPlaylistCommand.toObservable(urn1).map(toChangeSet(urn)).doOnNext(publishTrackAddedToPlaylistEvent).doOnCompleted(syncInitiator.requestSystemSyncAction()).subscribeOn(scheduler);
    }

    b createNewOfflinePlaylist(String s, boolean flag, Urn urn)
    {
        return createNewPlaylist(s, flag, urn).flatMap(new _cls6());
    }

    b createNewPlaylist(String s, boolean flag, Urn urn)
    {
        return playlistTracksStorage.createNewPlaylist(s, flag, urn).doOnNext(publishPlaylistCreatedEvent).subscribeOn(scheduler).doOnCompleted(syncInitiator.requestSystemSyncAction());
    }

    b loadPlaylistForAddingTrack(Urn urn)
    {
        return playlistTracksStorage.loadAddTrackToPlaylistItems(urn).subscribeOn(scheduler);
    }

    public b playlist(Urn urn)
    {
        return createPlaylistInfoLoadObservable(urn).flatMap(syncIfNecessary(urn));
    }

    public b removeTrackFromPlaylist(Urn urn, Urn urn1)
    {
        urn1 = new RemoveTrackFromPlaylistCommand.RemoveTrackFromPlaylistParams(urn, urn1);
        return removeTrackFromPlaylistCommand.toObservable(urn1).map(toChangeSet(urn)).doOnNext(publishTrackRemovedFromPlaylistEvent).doOnCompleted(syncInitiator.requestSystemSyncAction()).subscribeOn(scheduler);
    }

    public b trackUrnsForPlayback(Urn urn)
    {
        return ((LoadPlaylistTrackUrnsCommand)loadPlaylistTrackUrns.with(urn)).toObservable().subscribeOn(scheduler);
    }

    b updatedPlaylistInfo(final Urn playlistUrn)
    {
        return syncInitiator.syncPlaylist(playlistUrn).observeOn(scheduler).flatMap(new _cls8());
    }






    private class _cls1
        implements rx.b.b
    {

        final PlaylistOperations this$0;

        public void call(PropertySet propertyset)
        {
            eventBus.publish(EventQueue.ENTITY_STATE_CHANGED, EntityStateChangedEvent.fromTrackAddedToPlaylist(propertyset));
        }

        public volatile void call(Object obj)
        {
            call((PropertySet)obj);
        }

        _cls1()
        {
            this$0 = PlaylistOperations.this;
            super();
        }
    }


    private class _cls2
        implements rx.b.b
    {

        final PlaylistOperations this$0;

        public void call(PropertySet propertyset)
        {
            eventBus.publish(EventQueue.ENTITY_STATE_CHANGED, EntityStateChangedEvent.fromTrackRemovedFromPlaylist(propertyset));
        }

        public volatile void call(Object obj)
        {
            call((PropertySet)obj);
        }

        _cls2()
        {
            this$0 = PlaylistOperations.this;
            super();
        }
    }


    private class _cls3
        implements rx.b.b
    {

        final PlaylistOperations this$0;

        public void call(Urn urn)
        {
            eventBus.publish(EventQueue.ENTITY_STATE_CHANGED, EntityStateChangedEvent.fromPlaylistCreated(urn));
        }

        public volatile void call(Object obj)
        {
            call((Urn)obj);
        }

        _cls3()
        {
            this$0 = PlaylistOperations.this;
            super();
        }
    }


    private class _cls4
        implements g
    {

        final PlaylistOperations this$0;

        public PlaylistWithTracks call(PropertySet propertyset, List list)
        {
            return new PlaylistWithTracks(propertyset, list);
        }

        public volatile Object call(Object obj, Object obj1)
        {
            return call((PropertySet)obj, (List)obj1);
        }

        _cls4()
        {
            this$0 = PlaylistOperations.this;
            super();
        }
    }


    private class _cls5
        implements f
    {

        final PlaylistOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((PlaylistWithTracks)obj);
        }

        public b call(PlaylistWithTracks playlistwithtracks)
        {
            if (playlistwithtracks.isMissingMetaData())
            {
                return b.error(new PlaylistMissingException());
            } else
            {
                return b.just(playlistwithtracks);
            }
        }

        _cls5()
        {
            this$0 = PlaylistOperations.this;
            super();
        }
    }


    private class _cls9
        implements f
    {

        final PlaylistOperations this$0;
        final Urn val$playlistUrn;

        public volatile Object call(Object obj)
        {
            return call((PlaylistWithTracks)obj);
        }

        public b call(PlaylistWithTracks playlistwithtracks)
        {
            if (playlistwithtracks.isLocalPlaylist())
            {
                syncInitiator.syncLocalPlaylists();
                return b.just(playlistwithtracks);
            }
            if (playlistwithtracks.isMissingMetaData())
            {
                return updatedPlaylistInfo(playlistUrn);
            }
            if (playlistwithtracks.needsTracks())
            {
                return b.concat(b.just(playlistwithtracks), updatedPlaylistInfo(playlistUrn));
            } else
            {
                return b.just(playlistwithtracks);
            }
        }

        _cls9()
        {
            this$0 = PlaylistOperations.this;
            playlistUrn = urn;
            super();
        }
    }


    private class _cls7
        implements f
    {

        final PlaylistOperations this$0;
        final Urn val$targetUrn;

        public PropertySet call(Integer integer)
        {
            return PropertySet.from(new PropertyBinding[] {
                PlaylistProperty.URN.bind(targetUrn), PlaylistProperty.TRACK_COUNT.bind(integer)
            });
        }

        public volatile Object call(Object obj)
        {
            return call((Integer)obj);
        }

        _cls7()
        {
            this$0 = PlaylistOperations.this;
            targetUrn = urn;
            super();
        }
    }


    private class _cls6
        implements f
    {

        final PlaylistOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Urn)obj);
        }

        public b call(Urn urn)
        {
            return offlineOperations.makePlaylistAvailableOffline(urn);
        }

        _cls6()
        {
            this$0 = PlaylistOperations.this;
            super();
        }
    }


    private class _cls8
        implements f
    {

        final PlaylistOperations this$0;
        final Urn val$playlistUrn;

        public volatile Object call(Object obj)
        {
            return call((SyncResult)obj);
        }

        public b call(SyncResult syncresult)
        {
            return createPlaylistInfoLoadObservable(playlistUrn).flatMap(validateLoadedPlaylist);
        }

        _cls8()
        {
            this$0 = PlaylistOperations.this;
            playlistUrn = urn;
            super();
        }
    }

}
