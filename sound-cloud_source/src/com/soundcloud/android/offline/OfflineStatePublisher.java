// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.events.CurrentDownloadEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.MoreCollections;
import com.soundcloud.java.functions.Predicate;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadQueue, OfflineContentUpdates, DownloadState, DownloadRequest

class OfflineStatePublisher
{

    private final String TAG = com/soundcloud/android/offline/OfflineStatePublisher.getSimpleName();
    private final EventBus eventBus;
    private OfflineContentUpdates updates;

    public OfflineStatePublisher(EventBus eventbus)
    {
        eventBus = eventbus;
    }

    private boolean hasChanges(List list, boolean flag)
    {
        return !list.isEmpty() || flag;
    }

    private Predicate notCurrentDownload(final Urn currentDownload)
    {
        return new _cls1();
    }

    private void publishCollectionsDownloadedForCancelledTrack(DownloadQueue downloadqueue, DownloadState downloadstate)
    {
        List list = downloadqueue.getDownloadedPlaylists(downloadstate);
        boolean flag = downloadqueue.isAllLikedTracksDownloaded(downloadstate);
        if (hasChanges(list, flag))
        {
            eventBus.publish(EventQueue.CURRENT_DOWNLOAD, CurrentDownloadEvent.downloaded(flag, list));
        }
    }

    private void publishCreatorOptOut()
    {
        if (!updates.creatorOptOutRequests.isEmpty())
        {
            eventBus.publish(EventQueue.CURRENT_DOWNLOAD, CurrentDownloadEvent.unavailable(updates.creatorOptOutRequests));
        }
    }

    private void publishDownloadedTracksRemoved(Urn urn)
    {
        if (!updates.newRemovedTracks.isEmpty())
        {
            urn = MoreCollections.filter(updates.newRemovedTracks, notCurrentDownload(urn));
            if (!urn.isEmpty())
            {
                eventBus.publish(EventQueue.CURRENT_DOWNLOAD, CurrentDownloadEvent.downloadRemoved(new ArrayList(urn)));
            }
        }
    }

    private void publishRelatedQueuedCollectionsAsRequested(DownloadQueue downloadqueue, DownloadState downloadstate)
    {
        downloadstate = downloadqueue.getRequested(downloadstate);
        boolean flag = downloadqueue.isLikedTrackRequested();
        if (hasChanges(downloadstate, flag))
        {
            eventBus.publish(EventQueue.CURRENT_DOWNLOAD, CurrentDownloadEvent.downloadRequested(flag, downloadstate));
        }
    }

    private void publishTrackDownloadCanceled(DownloadState downloadstate)
    {
        eventBus.publish(EventQueue.CURRENT_DOWNLOAD, CurrentDownloadEvent.downloadRemoved(Collections.singletonList(downloadstate.getTrack())));
    }

    private void publishTrackDownloaded(DownloadQueue downloadqueue, DownloadState downloadstate)
    {
        List list = downloadqueue.getDownloaded(downloadstate);
        boolean flag = downloadqueue.isAllLikedTracksDownloaded(downloadstate);
        if (hasChanges(list, flag))
        {
            eventBus.publish(EventQueue.CURRENT_DOWNLOAD, CurrentDownloadEvent.downloaded(flag, list));
        }
    }

    private void publishTrackUnavailable(DownloadState downloadstate)
    {
        eventBus.publish(EventQueue.CURRENT_DOWNLOAD, CurrentDownloadEvent.unavailable(downloadstate.request.isLiked(), Collections.singletonList(downloadstate.getTrack())));
    }

    private void publishTracksAlreadyDownloaded()
    {
        if (!updates.newRestoredRequests.isEmpty())
        {
            eventBus.publish(EventQueue.CURRENT_DOWNLOAD, CurrentDownloadEvent.downloaded(updates.newRestoredRequests));
        }
    }

    void publishDone()
    {
        eventBus.publish(EventQueue.CURRENT_DOWNLOAD, CurrentDownloadEvent.idle());
    }

    void publishDownloadCancelEvents(DownloadQueue downloadqueue, DownloadState downloadstate)
    {
        publishTrackDownloadCanceled(downloadstate);
        publishCollectionsDownloadedForCancelledTrack(downloadqueue, downloadstate);
    }

    void publishDownloadErrorEvents(DownloadQueue downloadqueue, DownloadState downloadstate)
    {
        downloadqueue = downloadqueue.getRequestedWithOwningPlaylists(downloadstate);
        eventBus.publish(EventQueue.CURRENT_DOWNLOAD, CurrentDownloadEvent.downloadRequested(downloadstate.request.isLiked(), downloadqueue));
    }

    void publishDownloadSuccessfulEvents(DownloadQueue downloadqueue, DownloadState downloadstate)
    {
        publishTrackDownloaded(downloadqueue, downloadstate);
        publishRelatedQueuedCollectionsAsRequested(downloadqueue, downloadstate);
    }

    void publishDownloading(DownloadRequest downloadrequest)
    {
        eventBus.publish(EventQueue.CURRENT_DOWNLOAD, CurrentDownloadEvent.downloading(downloadrequest));
    }

    void publishDownloadsRequested(DownloadRequest downloadrequest)
    {
        publishDownloadsRequested(Collections.singletonList(downloadrequest));
    }

    void publishDownloadsRequested(List list)
    {
        if (!list.isEmpty())
        {
            eventBus.publish(EventQueue.CURRENT_DOWNLOAD, CurrentDownloadEvent.downloadRequested(list));
        }
    }

    void publishNotDownloadableStateChanges(DownloadQueue downloadqueue, Urn urn)
    {
        publishDownloadedTracksRemoved(urn);
        publishTracksAlreadyDownloaded();
        publishCreatorOptOut();
        if (!downloadqueue.getRequests().isEmpty())
        {
            eventBus.publish(EventQueue.CURRENT_DOWNLOAD, CurrentDownloadEvent.downloadRequestRemoved(downloadqueue.getRequests()));
        }
    }

    public void setUpdates(OfflineContentUpdates offlinecontentupdates)
    {
        updates = offlinecontentupdates;
    }

    private class _cls1
        implements Predicate
    {

        final OfflineStatePublisher this$0;
        final Urn val$currentDownload;

        public boolean apply(Urn urn)
        {
            return urn != null && !urn.equals(currentDownload);
        }

        public volatile boolean apply(Object obj)
        {
            return apply((Urn)obj);
        }

        _cls1()
        {
            this$0 = OfflineStatePublisher.this;
            currentDownload = urn;
            super();
        }
    }

}
