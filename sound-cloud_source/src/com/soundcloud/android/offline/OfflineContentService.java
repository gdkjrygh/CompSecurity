// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.MoreCollections;
import com.soundcloud.java.functions.Predicate;
import dagger.b;
import java.util.List;
import rx.Y;
import rx.a.b.a;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadHandler, OfflineStatePublisher, DownloadQueue, OfflineContentUpdates, 
//            DownloadNotificationController, OfflineContentScheduler, DownloadState, OfflineContentOperations, 
//            OfflineSettingsOperations, DownloadOperations, DownloadRequest

public class OfflineContentService extends Service
    implements DownloadHandler.Listener
{
    private class OfflineContentRequestsSubscriber extends DefaultSubscriber
    {

        final OfflineContentService this$0;

        public void onNext(OfflineContentUpdates offlinecontentupdates)
        {
            (new StringBuilder("Received OfflineContentRequests: ")).append(offlinecontentupdates);
            publisher.setUpdates(offlinecontentupdates);
            publisher.publishNotDownloadableStateChanges(queue, downloadHandler.getCurrentTrack());
            queue.set(MoreCollections.filter(offlinecontentupdates.allDownloadRequests, isNotCurrentDownloadFilter));
            publisher.publishDownloadsRequested(queue.getRequests());
            updateNotification();
            if (isRemovedTrackCurrentlyBeingDownloaded(offlinecontentupdates))
            {
                downloadHandler.cancel();
                return;
            } else
            {
                startDownloadIfNecessary();
                return;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((OfflineContentUpdates)obj);
        }

        private OfflineContentRequestsSubscriber()
        {
            this$0 = OfflineContentService.this;
            super();
        }

        OfflineContentRequestsSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    static final String ACTION_START = "action_start_download";
    static final String ACTION_STOP = "action_stop_download";
    public static final String TAG = "OfflineContent";
    DownloadHandler.Builder builder;
    private DownloadHandler downloadHandler;
    DownloadOperations downloadOperations;
    private final Predicate isNotCurrentDownloadFilter;
    private boolean isStopping;
    DownloadNotificationController notificationController;
    OfflineContentOperations offlineContentOperations;
    OfflineContentScheduler offlineContentScheduler;
    OfflineSettingsOperations offlineSettingsOperations;
    OfflineStatePublisher publisher;
    DownloadQueue queue;
    private final f removeTracks;
    private Y subscription;

    public OfflineContentService()
    {
        subscription = RxUtils.invalidSubscription();
        removeTracks = new _cls1();
        isNotCurrentDownloadFilter = new _cls2();
        SoundCloudApplication.getObjectGraph().a(this);
    }

    OfflineContentService(DownloadOperations downloadoperations, OfflineContentOperations offlinecontentoperations, OfflineSettingsOperations offlinesettingsoperations, DownloadNotificationController downloadnotificationcontroller, OfflineContentScheduler offlinecontentscheduler, DownloadHandler.Builder builder1, OfflineStatePublisher offlinestatepublisher, 
            DownloadQueue downloadqueue)
    {
        subscription = RxUtils.invalidSubscription();
        removeTracks = new _cls1();
        isNotCurrentDownloadFilter = new _cls2();
        downloadOperations = downloadoperations;
        offlineContentOperations = offlinecontentoperations;
        offlineSettingsOperations = offlinesettingsoperations;
        notificationController = downloadnotificationcontroller;
        offlineContentScheduler = offlinecontentscheduler;
        publisher = offlinestatepublisher;
        builder = builder1;
        queue = downloadqueue;
    }

    private static Intent createIntent(Context context, String s)
    {
        context = new Intent(context, com/soundcloud/android/offline/OfflineContentService);
        context.setAction(s);
        return context;
    }

    private void download(DownloadRequest downloadrequest)
    {
        (new StringBuilder("Download started ")).append(downloadrequest);
        android.os.Message message = downloadHandler.obtainMessage(0, downloadrequest);
        downloadHandler.sendMessage(message);
        publisher.publishDownloading(downloadrequest);
    }

    private void downloadNextOrFinish(DownloadState downloadstate)
    {
        if (queue.isEmpty())
        {
            stopAndFinish(downloadstate);
            return;
        } else
        {
            download(queue.poll());
            return;
        }
    }

    private boolean isRemovedTrackCurrentlyBeingDownloaded(OfflineContentUpdates offlinecontentupdates)
    {
        return offlinecontentupdates.newRemovedTracks.contains(downloadHandler.getCurrentTrack());
    }

    public static void start(Context context)
    {
        context.startService(createIntent(context, "action_start_download"));
    }

    private void startDownloadIfNecessary()
    {
        if (!downloadHandler.isDownloading())
        {
            downloadNextOrFinish(null);
            return;
        } else
        {
            publisher.publishDownloading(downloadHandler.getCurrentRequest());
            return;
        }
    }

    private void stop()
    {
        publisher.publishDone();
        subscription.unsubscribe();
        downloadHandler.quit();
        stopForeground(false);
        stopSelf();
    }

    public static void stop(Context context)
    {
        context.startService(createIntent(context, "action_stop_download"));
    }

    private void stopAndFinish(DownloadState downloadstate)
    {
        stop();
        notificationController.onDownloadsFinished(downloadstate);
    }

    private void stopAndRetryLater()
    {
        offlineContentScheduler.scheduleRetry();
        stop();
    }

    private void updateNotification()
    {
        if (!queue.isEmpty())
        {
            startForeground(6, notificationController.onPendingRequests(queue));
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCancel(DownloadState downloadstate)
    {
        (new StringBuilder("Download cancelled ")).append(downloadstate);
        notificationController.onDownloadCancel(downloadstate);
        publisher.publishDownloadCancelEvents(queue, downloadstate);
        if (isStopping)
        {
            stop();
            return;
        } else
        {
            downloadNextOrFinish(downloadstate);
            return;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        downloadHandler = builder.create(this);
    }

    public void onDestroy()
    {
        subscription.unsubscribe();
        super.onDestroy();
    }

    public void onError(DownloadState downloadstate)
    {
        (new StringBuilder("Download failed ")).append(downloadstate);
        notificationController.onDownloadError(downloadstate);
        publisher.publishDownloadErrorEvents(queue, downloadstate);
        if (downloadstate.isConnectionError())
        {
            stopAndRetryLater();
            notificationController.onConnectionError(downloadstate);
            return;
        } else
        {
            downloadNextOrFinish(downloadstate);
            return;
        }
    }

    public void onProgress(DownloadState downloadstate)
    {
        notificationController.onDownloadProgress(downloadstate);
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        String s;
        s = intent.getAction();
        isStopping = "action_stop_download".equals(intent.getAction());
        offlineContentScheduler.cancelPendingRetries();
        if (!"action_start_download".equalsIgnoreCase(s)) goto _L2; else goto _L1
_L1:
        DefaultSubscriber.fireAndForget(offlineContentOperations.loadContentToDelete().flatMap(removeTracks));
        subscription.unsubscribe();
        subscription = offlineContentOperations.loadOfflineContentUpdates().observeOn(a.a()).subscribe(new OfflineContentRequestsSubscriber(null));
_L4:
        return 2;
_L2:
        if ("action_stop_download".equalsIgnoreCase(s))
        {
            if (downloadHandler.isDownloading())
            {
                downloadHandler.cancel();
            } else
            {
                stop();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onSuccess(DownloadState downloadstate)
    {
        (new StringBuilder("Download finished ")).append(downloadstate);
        notificationController.onDownloadSuccess(downloadstate);
        publisher.publishDownloadSuccessfulEvents(queue, downloadstate);
        offlineSettingsOperations.setHasOfflineContent(true);
        downloadNextOrFinish(downloadstate);
    }






    private class _cls1
        implements f
    {

        final OfflineContentService this$0;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public rx.b call(List list)
        {
            return downloadOperations.removeOfflineTracks(list);
        }

        _cls1()
        {
            this$0 = OfflineContentService.this;
            super();
        }
    }


    private class _cls2
        implements Predicate
    {

        final OfflineContentService this$0;

        public boolean apply(DownloadRequest downloadrequest)
        {
            return !downloadHandler.isCurrentRequest(downloadrequest);
        }

        public volatile boolean apply(Object obj)
        {
            return apply((DownloadRequest)obj);
        }

        _cls2()
        {
            this$0 = OfflineContentService.this;
            super();
        }
    }

}
