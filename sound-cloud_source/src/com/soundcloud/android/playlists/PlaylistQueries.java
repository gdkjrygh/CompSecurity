// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.offline.OfflineFilters;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.schema.Column;
import com.soundcloud.propeller.schema.Table;

public final class PlaylistQueries
{

    public static final Query HAS_DOWNLOADED_OFFLINE_TRACKS_FILTER;
    public static final Query HAS_PENDING_DOWNLOAD_REQUEST_QUERY;
    public static final Query IS_MARKED_FOR_OFFLINE_QUERY;

    public PlaylistQueries()
    {
    }

    static 
    {
        HAS_PENDING_DOWNLOAD_REQUEST_QUERY = Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.TrackDownloads.TABLE
        }).select(new Object[] {
            com.soundcloud.android.storage.Tables.TrackDownloads._ID.qualifiedName()
        }).innerJoin(com.soundcloud.android.storage.Table.PlaylistTracks.name(), com.soundcloud.android.storage.Table.PlaylistTracks.field("track_id"), com.soundcloud.android.storage.Tables.TrackDownloads._ID.qualifiedName()).joinOn(com.soundcloud.android.storage.Table.SoundView.field("_id"), com.soundcloud.android.storage.Table.PlaylistTracks.field("playlist_id")).where(OfflineFilters.REQUESTED_DOWNLOAD_FILTER);
        HAS_DOWNLOADED_OFFLINE_TRACKS_FILTER = Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.TrackDownloads.TABLE
        }).select(new Object[] {
            com.soundcloud.android.storage.Tables.TrackDownloads._ID.qualifiedName()
        }).innerJoin(com.soundcloud.android.storage.Table.PlaylistTracks.name(), com.soundcloud.android.storage.Table.PlaylistTracks.field("track_id"), com.soundcloud.android.storage.Tables.TrackDownloads._ID.qualifiedName()).joinOn(com.soundcloud.android.storage.Table.SoundView.field("_id"), com.soundcloud.android.storage.Table.PlaylistTracks.field("playlist_id")).where(OfflineFilters.OFFLINE_TRACK_FILTER);
        IS_MARKED_FOR_OFFLINE_QUERY = (Query)Query.from(new String[] {
            com.soundcloud.android.storage.Tables.OfflineContent.TABLE.name(), com.soundcloud.android.storage.Table.Sounds.name()
        }).joinOn(com.soundcloud.android.storage.Table.SoundView.field("_id"), com.soundcloud.android.storage.Tables.OfflineContent._ID.qualifiedName()).whereEq(com.soundcloud.android.storage.Tables.OfflineContent._TYPE.qualifiedName(), Integer.valueOf(1));
    }
}
