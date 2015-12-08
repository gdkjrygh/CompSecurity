// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.content.ContentValues;
import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Exists;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.rx.RxResultMapper;
import com.soundcloud.propeller.schema.Table;
import rx.b;

class OfflineContentStorage
{

    private static final String IS_OFFLINE_LIKES = "if_offline_likes";
    private static final String IS_OFFLINE_PLAYLIST = "is_offline_playlist";
    private final PropellerRx propellerRx;

    public OfflineContentStorage(PropellerRx propellerrx)
    {
        propellerRx = propellerrx;
    }

    private ContentValues buildContentValuesForOfflineLikes()
    {
        return ContentValuesBuilder.values(2).put(com.soundcloud.android.storage.Tables.OfflineContent._ID, 0).put(com.soundcloud.android.storage.Tables.OfflineContent._TYPE, 2).get();
    }

    private ContentValues buildContentValuesForPlaylist(Urn urn)
    {
        return ContentValuesBuilder.values(2).put(com.soundcloud.android.storage.Tables.OfflineContent._ID, urn.getNumericId()).put(com.soundcloud.android.storage.Tables.OfflineContent._TYPE, 1).get();
    }

    private Query isMarkedForOfflineQuery(Urn urn)
    {
        return Query.apply(ColumnFunctions.exists(Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.OfflineContent.TABLE
        }).where(playlistFilter(urn))).as("is_offline_playlist"));
    }

    public static Query isOfflineLikesEnabledQuery()
    {
        return Query.apply(ColumnFunctions.exists(Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.OfflineContent.TABLE
        }).where(offlineLikesFilter())).as("if_offline_likes"));
    }

    static Where offlineLikesFilter()
    {
        return Filter.filter().whereEq(com.soundcloud.android.storage.Tables.OfflineContent._ID, Integer.valueOf(0)).whereEq(com.soundcloud.android.storage.Tables.OfflineContent._TYPE, Integer.valueOf(2));
    }

    private Where playlistFilter(Urn urn)
    {
        return Filter.filter().whereEq(com.soundcloud.android.storage.Tables.OfflineContent._ID, Long.valueOf(urn.getNumericId())).whereEq(com.soundcloud.android.storage.Tables.OfflineContent._TYPE, Integer.valueOf(1));
    }

    public b isOfflineLikesEnabled()
    {
        return propellerRx.query(isOfflineLikesEnabledQuery()).map(RxResultMapper.scalar(java/lang/Boolean));
    }

    public b isOfflinePlaylist(Urn urn)
    {
        return propellerRx.query(isMarkedForOfflineQuery(urn)).map(RxResultMapper.scalar(java/lang/Boolean));
    }

    public b removeFromOfflinePlaylists(Urn urn)
    {
        return propellerRx.delete(com.soundcloud.android.storage.Tables.OfflineContent.TABLE, playlistFilter(urn));
    }

    public b storeAsOfflinePlaylist(Urn urn)
    {
        return propellerRx.upsert(com.soundcloud.android.storage.Tables.OfflineContent.TABLE, buildContentValuesForPlaylist(urn));
    }

    public b storeOfflineLikesDisabled()
    {
        return propellerRx.delete(com.soundcloud.android.storage.Tables.OfflineContent.TABLE, offlineLikesFilter());
    }

    public b storeOfflineLikesEnabled()
    {
        return propellerRx.upsert(com.soundcloud.android.storage.Tables.OfflineContent.TABLE, buildContentValuesForOfflineLikes());
    }
}
