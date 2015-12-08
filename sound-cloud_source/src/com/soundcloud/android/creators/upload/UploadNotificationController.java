// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.utils.images.ImageUtils;
import javax.inject.Provider;

public class UploadNotificationController
{

    private final AccountOperations accountOperations;
    private final Context context;
    private final android.support.v4.app.NotificationCompat.Builder finishedNotification;
    private final Navigator navigator;
    private final NotificationManager notificationManager;
    private final android.support.v4.app.NotificationCompat.Builder progressNotification;
    private final Resources resources;

    public UploadNotificationController(Context context1, Resources resources1, NotificationManager notificationmanager, Provider provider, Navigator navigator1, AccountOperations accountoperations)
    {
        context = context1;
        resources = resources1;
        notificationManager = notificationmanager;
        navigator = navigator1;
        accountOperations = accountoperations;
        progressNotification = (android.support.v4.app.NotificationCompat.Builder)provider.get();
        finishedNotification = (android.support.v4.app.NotificationCompat.Builder)provider.get();
    }

    private void configureIcon(android.support.v4.app.NotificationCompat.Builder builder, Recording recording)
    {
        if (recording.hasArtwork())
        {
            recording = ImageUtils.getConfiguredBitmap(recording.getArtwork(), (int)resources.getDimension(0x7f0b00d0), (int)resources.getDimension(0x7f0b00cd));
            if (recording != null)
            {
                builder.setLargeIcon(recording);
            }
        }
    }

    private Notification createProcessingNotification(Recording recording)
    {
        setProgressOptions(progressNotification, recording);
        progressNotification.setContentIntent(getPendingProcessingIntent(recording));
        progressNotification.setContentText(resources.getString(0x7f07021b));
        progressNotification.setProgress(100, 0, true);
        return progressNotification.build();
    }

    private Notification createTransferringNotification(Recording recording, int i)
    {
        setProgressOptions(progressNotification, recording);
        progressNotification.setContentIntent(getTransferringPendingIntent(recording, i));
        progressNotification.setContentText(resources.getString(0x7f07021d, new Object[] {
            Integer.valueOf(i)
        }));
        progressNotification.setProgress(100, i, false);
        return progressNotification.build();
    }

    private Notification createUploadErrorNotification(Recording recording)
    {
        setDoneOptions(recording);
        finishedNotification.setContentTitle(resources.getString(0x7f0700df));
        finishedNotification.setContentText(resources.getString(0x7f0700dd, new Object[] {
            recording.title
        }));
        finishedNotification.setTicker(resources.getString(0x7f0700de));
        finishedNotification.setContentIntent(PendingIntent.getActivity(context, 0, getMonitorIntent(recording), 0x8000000));
        return finishedNotification.build();
    }

    private Notification createUploadFinishedNotification(Recording recording)
    {
        Intent intent = navigator.createProfileIntent(context, accountOperations.getLoggedInUserUrn());
        setDoneOptions(recording);
        finishedNotification.setContentTitle(resources.getString(0x7f0700e1));
        finishedNotification.setContentText(resources.getString(0x7f0700e2, new Object[] {
            recording.title
        }));
        finishedNotification.setTicker(resources.getString(0x7f0700e0));
        finishedNotification.setContentIntent(PendingIntent.getActivity(context, 0, intent, 0x8000000));
        return finishedNotification.build();
    }

    private PendingIntent getPendingProcessingIntent(Recording recording)
    {
        recording = getMonitorIntent(recording).putExtra("stage", 1);
        return PendingIntent.getActivity(context, 0, recording, 0x8000000);
    }

    private PendingIntent getTransferringPendingIntent(Recording recording, int i)
    {
        recording = getMonitorIntent(recording).putExtra("stage", 2).putExtra("progress", i);
        return PendingIntent.getActivity(context, 0, recording, 0x8000000);
    }

    private void sendNotification(Notification notification)
    {
        notificationManager.notify(2, notification);
    }

    private void setDefaultOptions(android.support.v4.app.NotificationCompat.Builder builder, Recording recording)
    {
        String s;
        if (TextUtils.isEmpty(recording.title))
        {
            s = recording.sharingNote(resources);
        } else
        {
            s = recording.title;
        }
        builder.setContentTitle(s);
        builder.setSmallIcon(0x7f02015d);
        builder.setVisibility(1);
        configureIcon(builder, recording);
    }

    private void setDoneOptions(Recording recording)
    {
        setDefaultOptions(finishedNotification, recording);
        finishedNotification.setOngoing(false);
        finishedNotification.setAutoCancel(true);
    }

    private void setProgressOptions(android.support.v4.app.NotificationCompat.Builder builder, Recording recording)
    {
        setDefaultOptions(builder, recording);
        builder.setAutoCancel(false);
        builder.setOngoing(true);
    }

    public Intent getMonitorIntent(Recording recording)
    {
        return (new Intent("com.soundcloud.android.actions.upload.monitor")).putExtra("recording", recording);
    }

    public void onUploadCancelled()
    {
        notificationManager.cancel(2);
    }

    public void showProcessingNotification(Recording recording)
    {
        sendNotification(createProcessingNotification(recording));
    }

    public void showTransferringNotification(Recording recording, int i)
    {
        sendNotification(createTransferringNotification(recording, i));
    }

    public void showUploadError(Recording recording)
    {
        sendNotification(createUploadErrorNotification(recording));
    }

    public void showUploadFinished(Recording recording)
    {
        sendNotification(createUploadFinishedNotification(recording));
    }
}
