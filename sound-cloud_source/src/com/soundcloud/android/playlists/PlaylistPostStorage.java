// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Count;
import com.soundcloud.propeller.query.Exists;
import com.soundcloud.propeller.query.Field;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.schema.Column;
import rx.b;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistQueries, PostedPlaylistMapper

public class PlaylistPostStorage
{

    private final PropellerRx propellerRx;

    public PlaylistPostStorage(PropellerRx propellerrx)
    {
        propellerRx = propellerrx;
    }

    public static Query likeQuery()
    {
        Where where = Filter.filter().whereEq(Table.SoundView.field("_id"), Table.Likes.field("_id")).whereEq(Table.SoundView.field("_type"), Table.Likes.field("_type"));
        return (Query)Query.from(new String[] {
            Table.Likes.name()
        }).innerJoin(Table.Sounds.name(), where).whereNull("removed_at");
    }

    protected Query buildQuery(int i, long l)
    {
        return ((Query)((Query)((Query)Query.from(new String[] {
            Table.SoundView.name()
        }).select(new Object[] {
            Field.field(Table.SoundView.field("_id")).as("_id"), Field.field(Table.SoundView.field("title")).as("title"), Field.field(Table.SoundView.field("sound_user_username")).as("sound_user_username"), Field.field(Table.SoundView.field("track_count")).as("track_count"), Field.field(Table.SoundView.field("favoritings_count")).as("favoritings_count"), Field.field(Table.SoundView.field("sharing")).as("sharing"), Field.field(Table.Posts.field("created_at")).as("created_at"), ColumnFunctions.count("playlist_id").as("local_track_count"), ColumnFunctions.exists(likeQuery()).as("sound_user_like"), ColumnFunctions.exists(PlaylistQueries.HAS_PENDING_DOWNLOAD_REQUEST_QUERY).as("has_pending_download_request"), 
            ColumnFunctions.exists(PlaylistQueries.HAS_DOWNLOADED_OFFLINE_TRACKS_FILTER).as("has_offline_tracks"), ColumnFunctions.exists(PlaylistQueries.IS_MARKED_FOR_OFFLINE_QUERY).as("is_marked_for_offline")
        }).leftJoin(Table.PlaylistTracks.name(), Table.SoundView.field("_id"), "playlist_id").innerJoin(Table.Posts.name(), Query.on(Table.Posts.field("target_id"), Table.SoundView.field("_id")).whereEq(Table.Posts.field("target_type"), Table.SoundView.field("_type"))).leftJoin(com.soundcloud.android.storage.Tables.TrackDownloads.TABLE.name(), Table.PlaylistTracks.field("track_id"), com.soundcloud.android.storage.Tables.TrackDownloads._ID.qualifiedName()).whereEq(Table.Posts.field("type"), "post")).whereEq(Table.Posts.field("target_type"), Integer.valueOf(1))).whereLt(Table.Posts.field("created_at"), Long.valueOf(l))).groupBy(new String[] {
            Table.SoundView.field("_id")
        }).order("created_at", com.soundcloud.propeller.query.Query.Order.DESC).limit(i);
    }

    public b loadPostedPlaylists(int i, long l)
    {
        return propellerRx.query(buildQuery(i, l)).map(new PostedPlaylistMapper()).toList();
    }
}
