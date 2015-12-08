// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.LikedPlaylistMapper;
import com.soundcloud.android.playlists.PlaylistQueries;
import com.soundcloud.android.storage.Table;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Count;
import com.soundcloud.propeller.query.Exists;
import com.soundcloud.propeller.query.Field;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.rx.PropellerRx;
import rx.b;

public class PlaylistLikesStorage
{

    private static final LikedPlaylistMapper PLAYLIST_MAPPER = new LikedPlaylistMapper();
    private final PropellerRx propellerRx;

    public PlaylistLikesStorage(PropellerRx propellerrx)
    {
        propellerRx = propellerrx;
    }

    b loadLikedPlaylist(Urn urn)
    {
        urn = (Query)playlistLikeQuery().whereEq(Table.Likes.field("_id"), Long.valueOf(urn.getNumericId()));
        return propellerRx.query(urn).map(PLAYLIST_MAPPER).defaultIfEmpty(PropertySet.create());
    }

    public b loadLikedPlaylists(int i, long l)
    {
        Query query = ((Query)playlistLikeQuery().whereLt(Table.Likes.field("created_at"), Long.valueOf(l))).order(Table.Likes.field("created_at"), com.soundcloud.propeller.query.Query.Order.DESC).limit(i);
        return propellerRx.query(query).map(PLAYLIST_MAPPER).toList();
    }

    Query playlistLikeQuery()
    {
        Where where = Filter.filter().whereEq(Table.Likes.field("_type"), Table.SoundView.field("_type")).whereEq(Table.Likes.field("_id"), Table.SoundView.field("_id"));
        return ((Query)((Query)Query.from(new String[] {
            Table.Likes.name()
        }).select(new Object[] {
            Field.field(Table.SoundView.field("_id")).as("_id"), "title", "sound_user_username", "track_count", "favoritings_count", "sharing", ColumnFunctions.count("playlist_id").as("local_track_count"), Field.field(Table.Likes.field("created_at")).as("created_at"), ColumnFunctions.exists(PlaylistQueries.HAS_PENDING_DOWNLOAD_REQUEST_QUERY).as("has_pending_download_request"), ColumnFunctions.exists(PlaylistQueries.HAS_DOWNLOADED_OFFLINE_TRACKS_FILTER).as("has_offline_tracks"), 
            ColumnFunctions.exists(PlaylistQueries.IS_MARKED_FOR_OFFLINE_QUERY).as("is_marked_for_offline")
        }).innerJoin(Table.SoundView.name(), where).leftJoin(Table.PlaylistTracks.name(), Table.SoundView.field("_id"), "playlist_id").whereEq(Table.Likes.field("_type"), Integer.valueOf(1))).whereNull(Table.Likes.field("removed_at"))).groupBy(new String[] {
            Table.SoundView.field("_id")
        });
    }

}
