// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.commands.Command;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.java.collections.MoreCollections;
import com.soundcloud.java.functions.Function;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.ResultMapper;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.rx.RxResultMapper;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentStorage

class LoadExpectedContentCommand extends Command
{
    private static class LikedTrackMapper
        implements ResultMapper
    {

        private final boolean hasSyncableTracks;

        public OfflineRequestData map(CursorReader cursorreader)
        {
            long l = cursorreader.getLong("_id");
            long l1 = cursorreader.getLong("user_id");
            long l2 = cursorreader.getLong("duration");
            String s = cursorreader.getString("waveform_url");
            boolean flag1 = cursorreader.getBoolean("syncable");
            boolean flag;
            if (cursorreader.getBoolean("syncable") || !hasSyncableTracks)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return new OfflineRequestData(l, l1, l2, s, flag1, flag);
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private LikedTrackMapper(boolean flag)
        {
            hasSyncableTracks = flag;
        }

        LikedTrackMapper(boolean flag, _cls1 _pcls1)
        {
            this(flag);
        }
    }

    private static class OfflineRequestData
    {

        private final Urn creator;
        private final long duration;
        private final boolean isInLikes;
        private final Urn playlist;
        private final boolean syncable;
        private final Urn track;
        private final String waveformUrl;








        public OfflineRequestData(long l, long l1, long l2, String s, 
                boolean flag, Urn urn)
        {
            this(l, l1, l2, s, flag, false, urn);
        }

        public OfflineRequestData(long l, long l1, long l2, String s, 
                boolean flag, boolean flag1)
        {
            this(l, l1, l2, s, flag, flag1, Urn.NOT_SET);
        }

        public OfflineRequestData(long l, long l1, long l2, String s, 
                boolean flag, boolean flag1, Urn urn)
        {
            track = Urn.forTrack(l);
            creator = Urn.forUser(l1);
            duration = l2;
            waveformUrl = s;
            syncable = flag;
            isInLikes = flag1;
            playlist = urn;
        }
    }

    private static class PlaylistTrackMapper
        implements ResultMapper
    {

        private final List syncablePlaylists;

        public OfflineRequestData map(CursorReader cursorreader)
        {
            Urn urn;
            if (cursorreader.getBoolean("syncable") || !syncablePlaylists.contains(Long.valueOf(cursorreader.getLong("playlist_id"))))
            {
                urn = Urn.forPlaylist(cursorreader.getLong("playlist_id"));
            } else
            {
                urn = Urn.NOT_SET;
            }
            return new OfflineRequestData(cursorreader.getLong("_id"), cursorreader.getLong("user_id"), cursorreader.getLong("duration"), cursorreader.getString("waveform_url"), cursorreader.getBoolean("syncable"), urn);
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private PlaylistTrackMapper(List list)
        {
            syncablePlaylists = list;
        }

        PlaylistTrackMapper(List list, _cls1 _pcls1)
        {
            this(list);
        }
    }


    private static final String DISTINCT_KEYWORD = "DISTINCT ";
    private static final Where LIKES_SOUNDS_FILTER;
    private final PropellerDatabase database;
    private final Function toDownloadRequest = new _cls1();

    LoadExpectedContentCommand(PropellerDatabase propellerdatabase)
    {
        database = propellerdatabase;
    }

    private Collection getAggregatedRequestData(List list)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        OfflineRequestData offlinerequestdata;
        for (list = list.iterator(); list.hasNext(); ((DownloadRequest.Builder)linkedhashmap.get(offlinerequestdata.track)).addToPlaylist(offlinerequestdata.playlist).addToLikes(offlinerequestdata.isInLikes))
        {
            offlinerequestdata = (OfflineRequestData)list.next();
            if (!linkedhashmap.containsKey(offlinerequestdata.track))
            {
                linkedhashmap.put(offlinerequestdata.track, new DownloadRequest.Builder(offlinerequestdata.track, offlinerequestdata.creator, offlinerequestdata.duration, offlinerequestdata.waveformUrl, offlinerequestdata.syncable));
            }
        }

        return linkedhashmap.values();
    }

    private Where isDownloadable()
    {
        long l = System.currentTimeMillis();
        long l1 = TimeUnit.DAYS.toMillis(30L);
        return Filter.filter().whereGt(Table.TrackPolicies.field("last_updated"), Long.valueOf(l - l1));
    }

    private boolean isOfflineLikedTracksEnabled()
    {
        return ((Boolean)database.query(OfflineContentStorage.isOfflineLikesEnabledQuery()).first(java/lang/Boolean)).booleanValue();
    }

    private Query orderedPlaylistQuery()
    {
        return ((Query)Query.from(new com.soundcloud.propeller.schema.Table[] {
            com.soundcloud.android.storage.Tables.OfflineContent.TABLE
        }).select(new Object[] {
            com.soundcloud.android.storage.Tables.OfflineContent._ID
        }).innerJoin(Table.Sounds.name(), Filter.filter().whereEq(Table.Sounds.field("_id"), com.soundcloud.android.storage.Tables.OfflineContent._ID).whereEq(Table.Sounds.field("_type"), com.soundcloud.android.storage.Tables.OfflineContent._TYPE)).whereEq(Table.Sounds.field("_type"), Integer.valueOf(1))).order(Table.Sounds.field("created_at"), com.soundcloud.propeller.query.Query.Order.DESC);
    }

    private Where playlistTracksSoundsFilter(List list)
    {
        return Filter.filter().whereEq(Table.Sounds.field("_id"), Table.PlaylistTracks.field("track_id")).whereEq(Table.Sounds.field("_type"), Integer.valueOf(0)).whereIn("playlist_id", list);
    }

    private Query playlistsWithSyncableTracks(List list)
    {
        return (Query)((Query)Query.from(new String[] {
            Table.PlaylistTracks.name()
        }).select(new Object[] {
            (new StringBuilder("DISTINCT ")).append(Table.PlaylistTracks.field("playlist_id")).toString()
        }).innerJoin(Table.Sounds.name(), playlistTracksSoundsFilter(list)).innerJoin(Table.TrackPolicies.name(), Table.PlaylistTracks.field("track_id"), Table.TrackPolicies.field("track_id")).where(isDownloadable()).whereEq("syncable", Integer.valueOf(1))).whereNull(Table.PlaylistTracks.field("removed_at"));
    }

    private List queryRequestedTracks()
    {
        List list = tracksFromOfflinePlaylists();
        if (isOfflineLikedTracksEnabled())
        {
            list.addAll(tracksFromLikes());
        }
        return list;
    }

    private boolean querySyncableLikedTracks()
    {
        Query query = Query.apply(ColumnFunctions.exists((Query)((Query)Query.from(new String[] {
            Table.Sounds.name()
        }).innerJoin(Table.Likes.name(), LIKES_SOUNDS_FILTER).innerJoin(Table.TrackPolicies.name(), Table.Likes.field("_id"), "track_id").where(isDownloadable()).whereEq("syncable", Integer.valueOf(1))).whereNull(Table.Likes.field("removed_at"))));
        return ((Boolean)database.query(query).first(RxResultMapper.scalar(java/lang/Boolean))).booleanValue();
    }

    private List tracksFromLikes()
    {
        boolean flag = querySyncableLikedTracks();
        Query query = ((Query)((Query)Query.from(new String[] {
            Table.Sounds.name()
        }).select(new Object[] {
            Table.Sounds.field("_id"), Table.Sounds.field("duration"), Table.Sounds.field("waveform_url"), Table.Sounds.field("user_id"), Table.TrackPolicies.field("syncable")
        }).innerJoin(Table.Likes.name(), LIKES_SOUNDS_FILTER).innerJoin(Table.TrackPolicies.name(), Table.Likes.field("_id"), "track_id").where(isDownloadable()).whereEq(Table.Sounds.field("_type"), Integer.valueOf(0))).whereNull(Table.Likes.field("removed_at"))).order(Table.Likes.field("created_at"), com.soundcloud.propeller.query.Query.Order.DESC);
        return database.query(query).toList(new LikedTrackMapper(flag, null));
    }

    private List tracksFromOfflinePlaylists()
    {
        Object obj = database.query(orderedPlaylistQuery()).toList(RxResultMapper.scalar(java/lang/Long));
        List list = database.query(playlistsWithSyncableTracks(((List) (obj)))).toList(RxResultMapper.scalar(java/lang/Long));
        obj = ((Query)Query.from(new String[] {
            Table.PlaylistTracks.name()
        }).select(new Object[] {
            Table.Sounds.field("_id"), Table.Sounds.field("duration"), Table.Sounds.field("waveform_url"), Table.Sounds.field("user_id"), Table.TrackPolicies.field("syncable"), Table.PlaylistTracks.field("playlist_id")
        }).innerJoin(Table.Sounds.name(), playlistTracksSoundsFilter(((List) (obj)))).innerJoin(Table.TrackPolicies.name(), Table.PlaylistTracks.field("track_id"), Table.TrackPolicies.field("track_id")).where(isDownloadable()).whereNull(Table.PlaylistTracks.field("removed_at"))).order(Table.PlaylistTracks.field("playlist_id"), com.soundcloud.propeller.query.Query.Order.DESC).order(Table.PlaylistTracks.field("position"), com.soundcloud.propeller.query.Query.Order.ASC);
        return database.query(((Query) (obj))).toList(new PlaylistTrackMapper(list, null));
    }

    public volatile Object call(Object obj)
    {
        return call((Void)obj);
    }

    public Collection call(Void void1)
    {
        return MoreCollections.transform(getAggregatedRequestData(queryRequestedTracks()), toDownloadRequest);
    }

    static 
    {
        LIKES_SOUNDS_FILTER = Filter.filter().whereEq(Table.Likes.field("_id"), Table.Sounds.field("_id")).whereEq(Table.Likes.field("_type"), Integer.valueOf(0));
    }

    private class _cls1
        implements Function
    {

        final LoadExpectedContentCommand this$0;

        public DownloadRequest apply(DownloadRequest.Builder builder)
        {
            return builder.build();
        }

        public volatile Object apply(Object obj)
        {
            return apply((DownloadRequest.Builder)obj);
        }

        _cls1()
        {
            this$0 = LoadExpectedContentCommand.this;
            super();
        }
    }

}
