// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.soundcloud.android.main.MainActivity;
import com.soundcloud.android.settings.OfflineSettingsActivity;
import com.soundcloud.java.collections.Iterables;
import com.soundcloud.java.collections.MoreCollections;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.optional.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadState, DownloadQueue, DownloadRequest, SecureFileStorage

class DownloadNotificationController
{
    private static class ProgressNotificationData
    {

        private final int currentDownload;
        private final int downloadProgress;
        private final int totalDownloads;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof ProgressNotificationData))
                {
                    return false;
                }
                obj = (ProgressNotificationData)obj;
                if (!MoreObjects.equal(Integer.valueOf(currentDownload), Integer.valueOf(((ProgressNotificationData) (obj)).currentDownload)) || !MoreObjects.equal(Integer.valueOf(totalDownloads), Integer.valueOf(((ProgressNotificationData) (obj)).totalDownloads)) || !MoreObjects.equal(Integer.valueOf(downloadProgress), Integer.valueOf(((ProgressNotificationData) (obj)).downloadProgress)))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return MoreObjects.hashCode(new Object[] {
                Integer.valueOf(currentDownload), Integer.valueOf(totalDownloads), Integer.valueOf(downloadProgress)
            });
        }




        private ProgressNotificationData(int i, int j, int k)
        {
            currentDownload = i;
            totalDownloads = j;
            downloadProgress = k;
        }

        ProgressNotificationData(int i, int j, int k, _cls1 _pcls1)
        {
            this(i, j, k);
        }
    }


    static final int PROGRESS_MAX = 1000;
    private long completedBytes;
    private final Context context;
    private DownloadState currentDownload;
    private ProgressNotificationData lastProgressNotificationData;
    private final Provider notificationBuilderProvider;
    private final NotificationManager notificationManager;
    private List previousDownloads;
    private android.support.v4.app.NotificationCompat.Builder progressNotification;
    private final Resources resources;
    private int totalBytesToDownload;
    private int totalDownloads;

    public DownloadNotificationController(Context context1, NotificationManager notificationmanager, Provider provider, Resources resources1)
    {
        previousDownloads = new ArrayList();
        context = context1;
        resources = resources1;
        notificationManager = notificationmanager;
        notificationBuilderProvider = provider;
    }

    private android.support.v4.app.NotificationCompat.Builder buildBaseCompletedNotification()
    {
        android.support.v4.app.NotificationCompat.Builder builder = (android.support.v4.app.NotificationCompat.Builder)notificationBuilderProvider.get();
        builder.setSmallIcon(0x7f02015d);
        builder.setVisibility(1);
        builder.setOngoing(false);
        builder.setAutoCancel(true);
        return builder;
    }

    private int calculateAdjustedProgress(float f, int i)
    {
        return (int)((1000F * f) / (float)i);
    }

    private int calculateCurrentDownload(int i, int j)
    {
        return Math.min(i + 1, j);
    }

    private Notification completedNotification(DownloadRequest downloadrequest)
    {
        android.support.v4.app.NotificationCompat.Builder builder = buildBaseCompletedNotification();
        builder.setContentIntent(getPendingIntent(downloadrequest));
        builder.setContentTitle(resources.getString(0x7f0702e0));
        builder.setContentText(resources.getString(0x7f0702df));
        return builder.build();
    }

    private Notification completedWithStorageErrorsNotification()
    {
        android.support.v4.app.NotificationCompat.Builder builder = buildBaseCompletedNotification();
        builder.setContentIntent(getSettingsIntent());
        builder.setContentTitle(resources.getString(0x7f0702e4));
        builder.setContentText(resources.getString(0x7f0702e3));
        return builder.build();
    }

    private int getErrorCount()
    {
        return MoreCollections.filter(previousDownloads, new _cls1()).size();
    }

    private PendingIntent getPendingIntent(DownloadRequest downloadrequest)
    {
        if (downloadrequest == null)
        {
            downloadrequest = new Intent(context, com/soundcloud/android/main/MainActivity);
        } else
        {
            downloadrequest = new Intent("com.soundcloud.android.action.COLLECTION");
        }
        downloadrequest.setFlags(0x14000000);
        return PendingIntent.getActivity(context, 0, downloadrequest, 0x10000000);
    }

    private PendingIntent getSettingsIntent()
    {
        Intent intent = new Intent(context, com/soundcloud/android/settings/OfflineSettingsActivity);
        return PendingIntent.getActivity(context, 0, intent, 0x10000000);
    }

    private boolean hasStorageErrors()
    {
        return Iterables.tryFind(previousDownloads, new _cls2()).isPresent();
    }

    private Notification updateProgressNotification(DownloadRequest downloadrequest, ProgressNotificationData progressnotificationdata)
    {
        String s = resources.getQuantityString(0x7f09000c, progressnotificationdata.totalDownloads, new Object[] {
            Integer.valueOf(progressnotificationdata.currentDownload), Integer.valueOf(progressnotificationdata.totalDownloads)
        });
        progressNotification.setSmallIcon(0x7f02015d);
        progressNotification.setVisibility(1);
        progressNotification.setOngoing(true);
        progressNotification.setContentIntent(getPendingIntent(downloadrequest));
        progressNotification.setContentTitle(resources.getString(0x7f0702e1));
        progressNotification.setProgress(1000, progressnotificationdata.downloadProgress, false);
        progressNotification.setContentText(s);
        return progressNotification.build();
    }

    private void updateProgressNotificationIfChanged(DownloadState downloadstate)
    {
        ProgressNotificationData progressnotificationdata = new ProgressNotificationData(calculateCurrentDownload(previousDownloads.size(), totalDownloads), totalDownloads, calculateAdjustedProgress((int)(completedBytes + downloadstate.getProgress()), totalBytesToDownload), null);
        if (!progressnotificationdata.equals(lastProgressNotificationData))
        {
            lastProgressNotificationData = progressnotificationdata;
            notificationManager.notify(6, updateProgressNotification(downloadstate.request, progressnotificationdata));
        }
    }

    public void onConnectionError(DownloadState downloadstate)
    {
        android.support.v4.app.NotificationCompat.Builder builder = buildBaseCompletedNotification();
        builder.setContentIntent(getPendingIntent(downloadstate.request));
        builder.setContentTitle(resources.getString(0x7f0702e2));
        Resources resources1 = resources;
        int i;
        if (downloadstate.connectionState == DownloadOperations.ConnectionState.DISCONNECTED)
        {
            i = 0x7f0702d5;
        } else
        {
            i = 0x7f0702d6;
        }
        builder.setContentText(resources1.getString(i));
        notificationManager.notify(6, builder.build());
    }

    public void onDownloadCancel(DownloadState downloadstate)
    {
        if (totalDownloads > 0)
        {
            totalDownloads = totalDownloads - 1;
            updateProgressNotificationIfChanged(downloadstate);
        }
    }

    public void onDownloadError(DownloadState downloadstate)
    {
        completedBytes = completedBytes + downloadstate.getTotalBytes();
        currentDownload = null;
        previousDownloads.add(downloadstate);
        updateProgressNotificationIfChanged(downloadstate);
    }

    public void onDownloadProgress(DownloadState downloadstate)
    {
        currentDownload = downloadstate;
        updateProgressNotificationIfChanged(downloadstate);
    }

    public void onDownloadSuccess(DownloadState downloadstate)
    {
        currentDownload = null;
        previousDownloads.add(downloadstate);
        updateProgressNotificationIfChanged(downloadstate);
        completedBytes = completedBytes + downloadstate.getTotalBytes();
    }

    public void onDownloadsFinished(DownloadState downloadstate)
    {
        if (hasStorageErrors())
        {
            notificationManager.notify(6, completedWithStorageErrorsNotification());
        } else
        if (downloadstate != null && totalDownloads != getErrorCount())
        {
            notificationManager.notify(6, completedNotification(downloadstate.request));
        } else
        {
            notificationManager.cancel(6);
        }
        totalDownloads = 0;
        completedBytes = 0L;
        previousDownloads = new ArrayList();
    }

    public Notification onPendingRequests(DownloadQueue downloadqueue)
    {
        int i = downloadqueue.size() + previousDownloads.size();
        long l;
        if (currentDownload != null)
        {
            i++;
        }
        totalDownloads = i;
        if (currentDownload == null)
        {
            l = completedBytes;
        } else
        {
            l = completedBytes + currentDownload.getTotalBytes();
        }
        totalBytesToDownload = (int)l;
        for (Iterator iterator = downloadqueue.getRequests().iterator(); iterator.hasNext();)
        {
            DownloadRequest downloadrequest = (DownloadRequest)iterator.next();
            totalBytesToDownload = (int)((long)totalBytesToDownload + SecureFileStorage.calculateFileSizeInBytes(downloadrequest.getDuration()));
        }

        progressNotification = (android.support.v4.app.NotificationCompat.Builder)notificationBuilderProvider.get();
        if (currentDownload == null)
        {
            return updateProgressNotification(downloadqueue.getFirst(), new ProgressNotificationData(calculateCurrentDownload(previousDownloads.size(), totalDownloads), totalDownloads, calculateAdjustedProgress((int)completedBytes, totalBytesToDownload), null));
        } else
        {
            return updateProgressNotification(currentDownload.request, new ProgressNotificationData(calculateCurrentDownload(previousDownloads.size(), totalDownloads), totalDownloads, calculateAdjustedProgress((int)(completedBytes + currentDownload.getProgress()), totalBytesToDownload), null));
        }
    }

    private class _cls1
        implements Predicate
    {

        final DownloadNotificationController this$0;

        public boolean apply(DownloadState downloadstate)
        {
            return downloadstate.isConnectionError() || downloadstate.isDownloadFailed() || downloadstate.isUnavailable();
        }

        public volatile boolean apply(Object obj)
        {
            return apply((DownloadState)obj);
        }

        _cls1()
        {
            this$0 = DownloadNotificationController.this;
            super();
        }
    }


    private class _cls2
        implements Predicate
    {

        final DownloadNotificationController this$0;

        public boolean apply(DownloadState downloadstate)
        {
            return downloadstate.isNotEnoughSpace();
        }

        public volatile boolean apply(Object obj)
        {
            return apply((DownloadState)obj);
        }

        _cls2()
        {
            this$0 = DownloadNotificationController.this;
            super();
        }
    }

}
