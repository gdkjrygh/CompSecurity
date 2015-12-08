// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.commands.DefaultWriteStorageCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadRequest, OfflineContentUpdates

class StoreDownloadUpdatesCommand extends DefaultWriteStorageCommand
{

    private final DateProvider dateProvider;

    protected StoreDownloadUpdatesCommand(PropellerDatabase propellerdatabase, CurrentDateProvider currentdateprovider)
    {
        super(propellerdatabase);
        dateProvider = currentdateprovider;
    }

    private List buildContentValuesForDownloaded(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        DownloadRequest downloadrequest;
        for (list = list.iterator(); list.hasNext(); arraylist.add(ContentValuesBuilder.values(4).put("_id", downloadrequest.getTrack().getNumericId()).put(com.soundcloud.android.storage.Tables.TrackDownloads.UNAVAILABLE_AT, null).put(com.soundcloud.android.storage.Tables.TrackDownloads.REMOVED_AT, null).put(com.soundcloud.android.storage.Tables.TrackDownloads.DOWNLOADED_AT, dateProvider.getCurrentTime()).get()))
        {
            downloadrequest = (DownloadRequest)list.next();
        }

        return arraylist;
    }

    private List buildContentValuesForPendingDownload(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        DownloadRequest downloadrequest;
        for (list = list.iterator(); list.hasNext(); arraylist.add(ContentValuesBuilder.values().put("_id", downloadrequest.getTrack().getNumericId()).put(com.soundcloud.android.storage.Tables.TrackDownloads.REQUESTED_AT, dateProvider.getCurrentTime()).put(com.soundcloud.android.storage.Tables.TrackDownloads.REMOVED_AT, null).put(com.soundcloud.android.storage.Tables.TrackDownloads.DOWNLOADED_AT, null).put(com.soundcloud.android.storage.Tables.TrackDownloads.UNAVAILABLE_AT, null).get()))
        {
            downloadrequest = (DownloadRequest)list.next();
        }

        return arraylist;
    }

    private List buildContentValuesForRemoval(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        Urn urn;
        for (list = list.iterator(); list.hasNext(); arraylist.add(ContentValuesBuilder.values(2).put(com.soundcloud.android.storage.Tables.TrackDownloads._ID, urn.getNumericId()).put(com.soundcloud.android.storage.Tables.TrackDownloads.REMOVED_AT, dateProvider.getCurrentTime()).get()))
        {
            urn = (Urn)list.next();
        }

        return arraylist;
    }

    private List buildOptOutContentValues(Collection collection)
    {
        ArrayList arraylist = new ArrayList(collection.size());
        DownloadRequest downloadrequest;
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(ContentValuesBuilder.values(3).put(com.soundcloud.android.storage.Tables.TrackDownloads.UNAVAILABLE_AT, dateProvider.getCurrentTime()).put(com.soundcloud.android.storage.Tables.TrackDownloads.REQUESTED_AT, null).put(com.soundcloud.android.storage.Tables.TrackDownloads._ID, downloadrequest.getTrack().getNumericId()).get()))
        {
            downloadrequest = (DownloadRequest)collection.next();
        }

        return arraylist;
    }

    protected WriteResult write(PropellerDatabase propellerdatabase, final OfflineContentUpdates requests)
    {
        return propellerdatabase.runTransaction(new _cls1());
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (OfflineContentUpdates)obj);
    }





    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final StoreDownloadUpdatesCommand this$0;
        final OfflineContentUpdates val$requests;

        public void steps(PropellerDatabase propellerdatabase)
        {
            step(propellerdatabase.bulkUpsert(com.soundcloud.android.storage.Tables.TrackDownloads.TABLE, buildContentValuesForRemoval(requests.newRemovedTracks)));
            step(propellerdatabase.bulkUpsert(com.soundcloud.android.storage.Tables.TrackDownloads.TABLE, buildContentValuesForDownloaded(requests.newRestoredRequests)));
            step(propellerdatabase.bulkUpsert(com.soundcloud.android.storage.Tables.TrackDownloads.TABLE, buildContentValuesForPendingDownload(requests.newDownloadRequests)));
            step(propellerdatabase.bulkUpsert(com.soundcloud.android.storage.Tables.TrackDownloads.TABLE, buildOptOutContentValues(requests.creatorOptOutRequests)));
        }

        _cls1()
        {
            this$0 = StoreDownloadUpdatesCommand.this;
            requests = offlinecontentupdates;
            super();
        }
    }

}
