// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.commands.Command;
import com.soundcloud.android.commands.TrackUrnMapper;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.java.collections.MoreCollections;
import com.soundcloud.java.functions.Function;
import com.soundcloud.java.functions.Predicate;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.schema.Table;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentUpdates

class LoadOfflineContentUpdatesCommand extends Command
{

    private static final long PENDING_REMOVAL_DELAY;
    private final Predicate IS_NOT_SYNCABLE = new _cls3();
    private final Predicate IS_SYNCABLE = new _cls2();
    private final Function TO_URN = new _cls1();
    private final DateProvider dateProvider;
    private final PropellerDatabase propellerDatabase;

    public LoadOfflineContentUpdatesCommand(PropellerDatabase propellerdatabase, CurrentDateProvider currentdateprovider)
    {
        propellerDatabase = propellerdatabase;
        dateProvider = currentdateprovider;
    }

    private static transient Collection add(Collection collection, Collection acollection[])
    {
        collection = new ArrayList(collection);
        int j = acollection.length;
        for (int i = 0; i < j; i++)
        {
            collection.addAll(acollection[i]);
        }

        return collection;
    }

    private Collection getAllDownloadRequests(Collection collection, final List downloadedTracks, final Collection tracksToRestore, final List downloadedContent)
    {
        return MoreCollections.filter(collection, new _cls6());
    }

    private List getDownloadRequests()
    {
        Where where = Filter.filter().whereNull(com.soundcloud.android.storage.Tables.TrackDownloads.REMOVED_AT).whereNull(com.soundcloud.android.storage.Tables.TrackDownloads.DOWNLOADED_AT).whereNotNull(com.soundcloud.android.storage.Tables.TrackDownloads.REQUESTED_AT);
        return propellerDatabase.query(Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.TrackDownloads.TABLE
        }).where(where)).toList(new TrackUrnMapper());
    }

    private List getDownloaded()
    {
        Query query = (Query)((Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.TrackDownloads.TABLE
        }).whereNotNull(com.soundcloud.android.storage.Tables.TrackDownloads.DOWNLOADED_AT)).whereNull(com.soundcloud.android.storage.Tables.TrackDownloads.REMOVED_AT);
        return propellerDatabase.query(query).toList(new TrackUrnMapper());
    }

    private List getMarkedAsUnavailable()
    {
        Query query = (Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.TrackDownloads.TABLE
        }).whereNotNull(com.soundcloud.android.storage.Tables.TrackDownloads.UNAVAILABLE_AT);
        return propellerDatabase.query(query).toList(new TrackUrnMapper());
    }

    private Collection getNewPendingDownloads(Collection collection, final List pendingDownloads, final List downloadedTracks, final Collection tracksToRestore)
    {
        return MoreCollections.filter(collection, new _cls5());
    }

    private List getNewPendingRemovals(Collection collection, List list, Collection collection1, Collection collection2)
    {
        collection = MoreCollections.transform(collection, TO_URN);
        return Lists.newArrayList(subtract(add(list, new Collection[] {
            collection2, collection1
        }), new Collection[] {
            collection
        }));
    }

    private List getPendingRemovals()
    {
        long l = dateProvider.getCurrentDate().getTime();
        long l1 = PENDING_REMOVAL_DELAY;
        Query query = (Query)((Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.TrackDownloads.TABLE
        }).whereNotNull(com.soundcloud.android.storage.Tables.TrackDownloads.DOWNLOADED_AT)).whereGt(com.soundcloud.android.storage.Tables.TrackDownloads.REMOVED_AT, Long.valueOf(l - l1));
        return propellerDatabase.query(query).toList(new TrackUrnMapper());
    }

    private Collection getTracksToRestore(Collection collection, final List pendingRemovals)
    {
        return MoreCollections.filter(collection, new _cls4());
    }

    private static transient Collection subtract(Collection collection, Collection acollection[])
    {
        collection = new ArrayList(collection);
        int j = acollection.length;
        for (int i = 0; i < j; i++)
        {
            collection.removeAll(acollection[i]);
        }

        return collection;
    }

    public OfflineContentUpdates call(Collection collection)
    {
        Object obj = Lists.newArrayList(MoreCollections.filter(collection, IS_SYNCABLE));
        Collection collection1 = MoreCollections.filter(collection, IS_NOT_SYNCABLE);
        MoreCollections.transform(((Collection) (obj)), TO_URN);
        List list = getDownloadRequests();
        List list1 = getDownloaded();
        List list3 = getPendingRemovals();
        List list2 = getMarkedAsUnavailable();
        Collection collection2 = getTracksToRestore(((Collection) (obj)), list3);
        Collection collection3 = getNewPendingDownloads(((Collection) (obj)), list, list1, collection2);
        obj = getAllDownloadRequests(((Collection) (obj)), list3, collection2, list1);
        collection = getNewPendingRemovals(collection, list1, list2, list);
        return new OfflineContentUpdates(Lists.newArrayList(((Iterable) (obj))), Lists.newArrayList(collection3), Lists.newArrayList(collection2), Lists.newArrayList(collection1), collection);
    }

    public volatile Object call(Object obj)
    {
        return call((Collection)obj);
    }

    static 
    {
        PENDING_REMOVAL_DELAY = TimeUnit.MINUTES.toMillis(3L);
    }

    private class _cls1
        implements Function
    {

        final LoadOfflineContentUpdatesCommand this$0;

        public Urn apply(DownloadRequest downloadrequest)
        {
            return downloadrequest.getTrack();
        }

        public volatile Object apply(Object obj)
        {
            return apply((DownloadRequest)obj);
        }

        _cls1()
        {
            this$0 = LoadOfflineContentUpdatesCommand.this;
            super();
        }
    }


    private class _cls2
        implements Predicate
    {

        final LoadOfflineContentUpdatesCommand this$0;

        public boolean apply(DownloadRequest downloadrequest)
        {
            return downloadrequest.isSyncable();
        }

        public volatile boolean apply(Object obj)
        {
            return apply((DownloadRequest)obj);
        }

        _cls2()
        {
            this$0 = LoadOfflineContentUpdatesCommand.this;
            super();
        }
    }


    private class _cls3
        implements Predicate
    {

        final LoadOfflineContentUpdatesCommand this$0;

        public boolean apply(DownloadRequest downloadrequest)
        {
            return !downloadrequest.isSyncable();
        }

        public volatile boolean apply(Object obj)
        {
            return apply((DownloadRequest)obj);
        }

        _cls3()
        {
            this$0 = LoadOfflineContentUpdatesCommand.this;
            super();
        }
    }


    private class _cls6
        implements Predicate
    {

        final LoadOfflineContentUpdatesCommand this$0;
        final List val$downloadedContent;
        final List val$downloadedTracks;
        final Collection val$tracksToRestore;

        public boolean apply(DownloadRequest downloadrequest)
        {
            return !downloadedTracks.contains(downloadrequest.getTrack()) && !tracksToRestore.contains(downloadrequest) && !downloadedContent.contains(downloadrequest.getTrack());
        }

        public volatile boolean apply(Object obj)
        {
            return apply((DownloadRequest)obj);
        }

        _cls6()
        {
            this$0 = LoadOfflineContentUpdatesCommand.this;
            downloadedTracks = list;
            tracksToRestore = collection;
            downloadedContent = list1;
            super();
        }
    }


    private class _cls5
        implements Predicate
    {

        final LoadOfflineContentUpdatesCommand this$0;
        final List val$downloadedTracks;
        final List val$pendingDownloads;
        final Collection val$tracksToRestore;

        public boolean apply(DownloadRequest downloadrequest)
        {
            return !pendingDownloads.contains(downloadrequest.getTrack()) && !downloadedTracks.contains(downloadrequest.getTrack()) && !tracksToRestore.contains(downloadrequest);
        }

        public volatile boolean apply(Object obj)
        {
            return apply((DownloadRequest)obj);
        }

        _cls5()
        {
            this$0 = LoadOfflineContentUpdatesCommand.this;
            pendingDownloads = list;
            downloadedTracks = list1;
            tracksToRestore = collection;
            super();
        }
    }


    private class _cls4
        implements Predicate
    {

        final LoadOfflineContentUpdatesCommand this$0;
        final List val$pendingRemovals;

        public boolean apply(DownloadRequest downloadrequest)
        {
            return pendingRemovals.contains(downloadrequest.getTrack());
        }

        public volatile boolean apply(Object obj)
        {
            return apply((DownloadRequest)obj);
        }

        _cls4()
        {
            this$0 = LoadOfflineContentUpdatesCommand.this;
            pendingRemovals = list;
            super();
        }
    }

}
