// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.commands.TrackUrnMapper;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.rx.RxResultMapper;
import com.soundcloud.propeller.schema.Column;
import com.soundcloud.propeller.schema.Table;
import java.util.concurrent.TimeUnit;
import rx.b;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineFilters, DownloadState

class TrackDownloadsStorage
{

    private static final long DELAY_BEFORE_REMOVAL;
    private final DateProvider dateProvider;
    private final PropellerDatabase propeller;
    private final PropellerRx propellerRx;

    TrackDownloadsStorage(PropellerDatabase propellerdatabase, PropellerRx propellerrx, CurrentDateProvider currentdateprovider)
    {
        propeller = propellerdatabase;
        propellerRx = propellerrx;
        dateProvider = currentdateprovider;
    }

    private b hasDownloadedTracks()
    {
        Query query = Query.apply(ColumnFunctions.exists(Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.TrackDownloads.TABLE
        }).innerJoin(com.soundcloud.android.storage.Table.Likes.name(), likedTrackFilter()).where(OfflineFilters.OFFLINE_TRACK_FILTER)));
        return propellerRx.query(query).map(RxResultMapper.scalar(java/lang/Boolean));
    }

    private b hasPendingLikedTrackDownloads()
    {
        Query query = Query.apply(ColumnFunctions.exists(Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.TrackDownloads.TABLE
        }).innerJoin(com.soundcloud.android.storage.Table.Likes.name(), likedTrackFilter()).where(OfflineFilters.REQUESTED_DOWNLOAD_FILTER)));
        return propellerRx.query(query).map(RxResultMapper.scalar(java/lang/Boolean));
    }

    private Where likedTrackFilter()
    {
        return Filter.filter().whereEq(com.soundcloud.android.storage.Tables.TrackDownloads._ID.qualifiedName(), com.soundcloud.android.storage.Table.Likes.field("_id")).whereEq("_type", Integer.valueOf(0));
    }

    public b getLikesOfflineState()
    {
        return b.zip(hasPendingLikedTrackDownloads(), hasDownloadedTracks(), new _cls1());
    }

    b getTracksToRemove()
    {
        long l = dateProvider.getCurrentTime();
        long l1 = DELAY_BEFORE_REMOVAL;
        return propellerRx.query((Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.TrackDownloads.TABLE
        }).select(new Object[] {
            "_id"
        }).whereLe(com.soundcloud.android.storage.Tables.TrackDownloads.REMOVED_AT, Long.valueOf(l - l1))).map(new TrackUrnMapper()).toList();
    }

    b likesUrns()
    {
        Query query = Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.TrackDownloads.TABLE
        }).select(new Object[] {
            com.soundcloud.android.storage.Tables.TrackDownloads._ID.qualifiedName()
        }).innerJoin(com.soundcloud.android.storage.Table.Likes.name(), com.soundcloud.android.storage.Tables.TrackDownloads._ID.qualifiedName(), com.soundcloud.android.storage.Table.Likes.field("_id")).where(OfflineFilters.OFFLINE_TRACK_FILTER).order(com.soundcloud.android.storage.Table.Likes.field("created_at"), com.soundcloud.propeller.query.Query.Order.DESC);
        return propellerRx.query(query).map(new TrackUrnMapper()).toList();
    }

    public WriteResult markTrackAsUnavailable(Urn urn)
    {
        android.content.ContentValues contentvalues = ContentValuesBuilder.values(1).put(com.soundcloud.android.storage.Tables.TrackDownloads.UNAVAILABLE_AT, dateProvider.getCurrentTime()).get();
        return propeller.update(com.soundcloud.android.storage.Tables.TrackDownloads.TABLE, contentvalues, Filter.filter().whereEq("_id", Long.valueOf(urn.getNumericId())));
    }

    b playlistTrackUrns(Urn urn)
    {
        urn = ((Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.TrackDownloads.TABLE
        }).select(new Object[] {
            com.soundcloud.android.storage.Tables.TrackDownloads._ID.name()
        }).innerJoin(com.soundcloud.android.storage.Table.PlaylistTracks.name(), com.soundcloud.android.storage.Table.PlaylistTracks.field("track_id"), com.soundcloud.android.storage.Tables.TrackDownloads._ID.name()).whereEq(com.soundcloud.android.storage.Table.PlaylistTracks.field("playlist_id"), Long.valueOf(urn.getNumericId()))).where(OfflineFilters.OFFLINE_TRACK_FILTER).order(com.soundcloud.android.storage.Table.PlaylistTracks.field("position"), com.soundcloud.propeller.query.Query.Order.ASC);
        return propellerRx.query(urn).map(new TrackUrnMapper()).toList();
    }

    WriteResult storeCompletedDownload(DownloadState downloadstate)
    {
        downloadstate = ContentValuesBuilder.values(3).put("_id", downloadstate.getTrack().getNumericId()).put(com.soundcloud.android.storage.Tables.TrackDownloads.UNAVAILABLE_AT, null).put(com.soundcloud.android.storage.Tables.TrackDownloads.DOWNLOADED_AT, downloadstate.timestamp).get();
        return propeller.upsert(com.soundcloud.android.storage.Tables.TrackDownloads.TABLE, downloadstate);
    }

    static 
    {
        DELAY_BEFORE_REMOVAL = TimeUnit.MINUTES.toMillis(3L);
    }

    private class _cls1
        implements g
    {

        final TrackDownloadsStorage this$0;

        public OfflineState call(Boolean boolean1, Boolean boolean2)
        {
            if (boolean1.booleanValue())
            {
                return OfflineState.REQUESTED;
            }
            if (boolean2.booleanValue())
            {
                return OfflineState.DOWNLOADED;
            } else
            {
                return OfflineState.UNAVAILABLE;
            }
        }

        public volatile Object call(Object obj, Object obj1)
        {
            return call((Boolean)obj, (Boolean)obj1);
        }

        _cls1()
        {
            this$0 = TrackDownloadsStorage.this;
            super();
        }
    }

}
