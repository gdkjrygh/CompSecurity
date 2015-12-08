// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.offline.OfflineFilters;
import com.soundcloud.android.storage.Table;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Count;
import com.soundcloud.propeller.query.Exists;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.schema.Column;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import rx.b;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistQueries, PlaylistInfoMapper

public class PlaylistStorage
{

    private final AccountOperations accountOperations;
    private final PropellerDatabase propeller;
    private final PropellerRx propellerRx;

    public PlaylistStorage(PropellerDatabase propellerdatabase, PropellerRx propellerrx, AccountOperations accountoperations)
    {
        propeller = propellerdatabase;
        propellerRx = propellerrx;
        accountOperations = accountoperations;
    }

    private Query buildSinglePlaylistQuery(Urn urn)
    {
        return ((Query)((Query)Query.from(new String[] {
            Table.SoundView.name()
        }).select(new Object[] {
            "_id", "title", "sound_user_username", "sound_user_id", "duration", "track_count", "favoritings_count", "reposts_count", "permalink_url", "sharing", 
            "created_at", ColumnFunctions.count("playlist_id").as("local_track_count"), ColumnFunctions.exists(likeQuery(urn)).as("sound_user_like"), ColumnFunctions.exists(repostQuery(urn)).as("sound_user_repost"), ColumnFunctions.exists(pendingPlaylistTracksUrns(urn)).as("has_pending_download_request"), ColumnFunctions.exists(hasOfflineTracks(urn)).as("has_offline_tracks"), ColumnFunctions.exists(PlaylistQueries.IS_MARKED_FOR_OFFLINE_QUERY).as("is_marked_for_offline")
        }).whereEq("_id", Long.valueOf(urn.getNumericId()))).whereEq("_type", Integer.valueOf(1))).leftJoin(Table.PlaylistTracks.name(), Table.SoundView.field("_id"), "playlist_id").groupBy(new String[] {
            Table.SoundView.field("_id")
        });
    }

    private Where hasLocalTracks()
    {
        return Filter.filter().whereNotNull("added_at").orWhereNotNull("removed_at");
    }

    private Query hasOfflineTracks(Urn urn)
    {
        Where where = Filter.filter().whereEq(Table.SoundView.field("_id"), Table.PlaylistTracks.field("playlist_id")).whereEq(Table.SoundView.field("_type"), Integer.valueOf(1));
        return ((Query)Query.from(new com.soundcloud.propeller.schema.Table[] {
            com.soundcloud.android.storage.Tables.TrackDownloads.TABLE
        }).select(new Object[] {
            com.soundcloud.android.storage.Tables.TrackDownloads._ID.qualifiedName()
        }).innerJoin(Table.PlaylistTracks.name(), Table.PlaylistTracks.field("track_id"), com.soundcloud.android.storage.Tables.TrackDownloads._ID.qualifiedName()).innerJoin(Table.SoundView.name(), where).whereEq(Table.SoundView.field("_id"), Long.valueOf(urn.getNumericId()))).where(OfflineFilters.OFFLINE_TRACK_FILTER);
    }

    private Where isNotLocal()
    {
        return Filter.filter().whereGt("playlist_id", Integer.valueOf(0));
    }

    private Query likeQuery(Urn urn)
    {
        Where where = Filter.filter().whereEq(Table.Sounds.field("_id"), Table.Likes.field("_id")).whereEq(Table.Sounds.field("_type"), Table.Likes.field("_type"));
        return (Query)((Query)((Query)Query.from(new String[] {
            Table.Likes.name()
        }).innerJoin(Table.Sounds.name(), where).whereEq(Table.Sounds.field("_id"), Long.valueOf(urn.getNumericId()))).whereEq(Table.Sounds.field("_type"), Integer.valueOf(1))).whereNull("removed_at");
    }

    private Query pendingPlaylistTracksUrns(Urn urn)
    {
        Where where = Filter.filter().whereEq(Table.SoundView.field("_id"), Table.PlaylistTracks.field("playlist_id")).whereEq(Table.SoundView.field("_type"), Integer.valueOf(1));
        return ((Query)Query.from(new com.soundcloud.propeller.schema.Table[] {
            com.soundcloud.android.storage.Tables.TrackDownloads.TABLE
        }).select(new Object[] {
            com.soundcloud.android.storage.Tables.TrackDownloads._ID.qualifiedName()
        }).innerJoin(Table.PlaylistTracks.name(), Table.PlaylistTracks.field("track_id"), com.soundcloud.android.storage.Tables.TrackDownloads._ID.qualifiedName()).innerJoin(Table.SoundView.name(), where).whereEq(Table.SoundView.field("_id"), Long.valueOf(urn.getNumericId()))).where(OfflineFilters.REQUESTED_DOWNLOAD_FILTER);
    }

    private Query repostQuery(Urn urn)
    {
        Where where = Filter.filter().whereEq("_id", "target_id").whereEq("_type", "target_type");
        return (Query)((Query)((Query)Query.from(new String[] {
            Table.Posts.name()
        }).innerJoin(Table.Sounds.name(), where).whereEq("_id", Long.valueOf(urn.getNumericId()))).whereEq(Table.Sounds.field("_type"), Integer.valueOf(1))).whereEq("type", "repost");
    }

    public Set getPlaylistsDueForSync()
    {
        Object obj = propeller.query(Query.from(new String[] {
            Table.PlaylistTracks.name()
        }).select(new Object[] {
            "playlist_id"
        }).where(hasLocalTracks()).where(isNotLocal()));
        HashSet hashset = new HashSet();
        for (obj = ((QueryResult) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hashset.add(Urn.forPlaylist(((CursorReader)((Iterator) (obj)).next()).getLong("playlist_id")))) { }
        return hashset;
    }

    public boolean hasLocalPlaylists()
    {
        return ((Boolean)propeller.query(Query.apply(ColumnFunctions.exists((Query)((Query)Query.from(new String[] {
            Table.Sounds.name()
        }).select(new Object[] {
            "_id"
        }).whereEq("_type", Integer.valueOf(1))).whereLt("_id", Integer.valueOf(0))).as("has_local_playlists"))).first(java/lang/Boolean)).booleanValue();
    }

    public b loadPlaylist(Urn urn)
    {
        return propellerRx.query(buildSinglePlaylistQuery(urn)).map(new PlaylistInfoMapper(accountOperations.getLoggedInUserUrn())).defaultIfEmpty(PropertySet.create());
    }
}
