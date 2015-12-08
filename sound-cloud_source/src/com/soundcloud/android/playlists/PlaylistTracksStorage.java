// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.ContentValues;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.storage.Table;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Count;
import com.soundcloud.propeller.query.Exists;
import com.soundcloud.propeller.query.Field;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.rx.RxResultMapper;
import com.soundcloud.propeller.schema.Column;
import java.util.Date;
import rx.b;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistQueries, PlaylistTrackItemMapper, AddTrackToPlaylistItem, PlaylistMapper

class PlaylistTracksStorage
{
    private static final class AddTrackToPlaylistItemMapper extends RxResultMapper
    {

        private boolean readPrivateFlag(CursorReader cursorreader)
        {
            return Sharing.PRIVATE.name().equalsIgnoreCase(cursorreader.getString("sharing"));
        }

        public final AddTrackToPlaylistItem map(CursorReader cursorreader)
        {
            return new AddTrackToPlaylistItem(PlaylistMapper.readSoundUrn(cursorreader), cursorreader.getString("title"), PlaylistMapper.readTrackCount(cursorreader), readPrivateFlag(cursorreader), cursorreader.getBoolean("is_marked_for_offline"), cursorreader.getBoolean("track_exists_in_playlist"));
        }

        public final volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private AddTrackToPlaylistItemMapper()
        {
        }

        AddTrackToPlaylistItemMapper(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final String IS_TRACK_ALREADY_ADDED = "track_exists_in_playlist";
    private final AccountOperations accountOperations;
    private final DateProvider dateProvider;
    private final PropellerRx propellerRx;

    PlaylistTracksStorage(PropellerRx propellerrx, CurrentDateProvider currentdateprovider, AccountOperations accountoperations)
    {
        propellerRx = propellerrx;
        dateProvider = currentdateprovider;
        accountOperations = accountoperations;
    }

    private ContentValues getContentValuesForPlaylistTrack(long l, Urn urn)
    {
        return getContentValuesForPlaylistTrack(l, urn, 0);
    }

    private ContentValues getContentValuesForPlaylistTrack(long l, Urn urn, int i)
    {
        return ContentValuesBuilder.values().put("playlist_id", l).put("track_id", urn.getNumericId()).put("position", i).put("added_at", dateProvider.getCurrentDate().getTime()).get();
    }

    private ContentValues getContentValuesForPlaylistsTable(long l, long l1, String s, boolean flag)
    {
        ContentValuesBuilder contentvaluesbuilder = ContentValuesBuilder.values().put("_id", l).put("_type", 1).put("title", s);
        if (flag)
        {
            s = Sharing.PRIVATE.value();
        } else
        {
            s = Sharing.PUBLIC.value();
        }
        return contentvaluesbuilder.put("sharing", s).put("created_at", l1).put("user_id", accountOperations.getLoggedInUserUrn().getNumericId()).get();
    }

    private ContentValues getContentValuesForPostsTable(long l, long l1)
    {
        return ContentValuesBuilder.values().put("target_id", l).put("target_type", 1).put("created_at", l1).put("type", "post").get();
    }

    private Query getPlaylistTracksQuery(Urn urn)
    {
        String s = Table.Sounds.field("_id");
        return (Query)((Query)((Query)Query.from(new String[] {
            Table.PlaylistTracks.name()
        }).select(new Object[] {
            Field.field(s).as("_id"), "title", "user_id", "username", "duration", "playback_count", "favoritings_count", "sharing", com.soundcloud.android.storage.Tables.TrackDownloads.REQUESTED_AT, com.soundcloud.android.storage.Tables.TrackDownloads.DOWNLOADED_AT, 
            com.soundcloud.android.storage.Tables.TrackDownloads.UNAVAILABLE_AT, "sub_mid_tier", com.soundcloud.android.storage.Tables.TrackDownloads.REMOVED_AT, com.soundcloud.android.storage.Tables.OfflineContent._ID
        }).innerJoin(Table.Sounds.name(), Table.PlaylistTracks.field("track_id"), s).innerJoin(Table.Users.name(), Table.Sounds.field("user_id"), Table.Users.field("_id")).leftJoin(com.soundcloud.android.storage.Tables.TrackDownloads.TABLE.name(), s, com.soundcloud.android.storage.Tables.TrackDownloads._ID.qualifiedName()).leftJoin(Table.TrackPolicies.name(), s, Table.TrackPolicies.field("track_id")).leftJoin(com.soundcloud.android.storage.Tables.OfflineContent.TABLE, offlinePlaylistFilter()).whereEq(Table.Sounds.field("_type"), Integer.valueOf(0))).whereEq(Table.PlaylistTracks.field("playlist_id"), Long.valueOf(urn.getNumericId()))).order(Table.PlaylistTracks.field("position"), com.soundcloud.propeller.query.Query.Order.ASC).whereNull(Table.PlaylistTracks.field("removed_at"));
    }

    private Query isTrackInPlaylist(Urn urn)
    {
        return (Query)Query.from(new String[] {
            Table.PlaylistTracks.name()
        }).innerJoin(Table.Sounds.name(), Filter.filter().whereEq("playlist_id", Table.SoundView.field("_id")).whereEq("track_id", Long.valueOf(urn.getNumericId())).whereEq("_type", Integer.valueOf(1))).whereNull("removed_at");
    }

    private Where offlinePlaylistFilter()
    {
        return Filter.filter().whereEq(com.soundcloud.android.storage.Tables.OfflineContent._ID, "playlist_id").whereEq(com.soundcloud.android.storage.Tables.OfflineContent._TYPE, Integer.valueOf(1));
    }

    private Query queryPlaylistsWithTrackExistStatus(Urn urn)
    {
        return ((Query)((Query)Query.from(new String[] {
            Table.SoundView.name()
        }).select(new Object[] {
            Field.field(Table.SoundView.field("_id")).as("_id"), Field.field(Table.SoundView.field("title")).as("title"), Field.field(Table.SoundView.field("sharing")).as("sharing"), Field.field(Table.SoundView.field("track_count")).as("track_count"), ColumnFunctions.count("playlist_id").as("local_track_count"), ColumnFunctions.exists(isTrackInPlaylist(urn)).as("track_exists_in_playlist"), ColumnFunctions.exists(PlaylistQueries.IS_MARKED_FOR_OFFLINE_QUERY).as("is_marked_for_offline")
        }).leftJoin(Table.PlaylistTracks.name(), Table.SoundView.field("_id"), "playlist_id").innerJoin(Table.Posts.name(), Query.on(Table.Posts.field("target_id"), Table.SoundView.field("_id")).whereEq(Table.Posts.field("target_type"), Table.SoundView.field("_type"))).whereEq(Table.Posts.field("type"), "post")).whereEq(Table.SoundView.field("_type"), Integer.valueOf(1))).groupBy(new String[] {
            Table.SoundView.field("_id")
        }).order(Table.SoundView.field("created_at"), com.soundcloud.propeller.query.Query.Order.DESC);
    }

    b createNewPlaylist(final String title, final boolean isPrivate, final Urn firstTrackUrn)
    {
        final long createdAt = System.currentTimeMillis();
        final long localId = -createdAt;
        return propellerRx.runTransaction(new _cls1()).map(RxUtils.returning(Urn.forLocalPlaylist(localId)));
    }

    b loadAddTrackToPlaylistItems(Urn urn)
    {
        return propellerRx.query(queryPlaylistsWithTrackExistStatus(urn)).map(new AddTrackToPlaylistItemMapper(null)).toList();
    }

    b playlistTracks(Urn urn)
    {
        return propellerRx.query(getPlaylistTracksQuery(urn)).map(new PlaylistTrackItemMapper()).toList();
    }




    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final PlaylistTracksStorage this$0;
        final long val$createdAt;
        final Urn val$firstTrackUrn;
        final boolean val$isPrivate;
        final long val$localId;
        final String val$title;

        public void steps(PropellerDatabase propellerdatabase)
        {
            step(propellerdatabase.insert(Table.Sounds, getContentValuesForPlaylistsTable(localId, createdAt, title, isPrivate)));
            step(propellerdatabase.insert(Table.Posts, getContentValuesForPostsTable(localId, createdAt)));
            step(propellerdatabase.insert(Table.PlaylistTracks, getContentValuesForPlaylistTrack(localId, firstTrackUrn)));
        }

        _cls1()
        {
            this$0 = PlaylistTracksStorage.this;
            localId = l;
            createdAt = l1;
            title = s;
            isPrivate = flag;
            firstTrackUrn = urn;
            super();
        }
    }

}
