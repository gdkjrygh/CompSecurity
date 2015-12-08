// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.notify;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.arist.MusicPlayer.MusicPlayActivity;
import com.arist.MusicPlayer.MyApplication;
import com.arist.entity.Music;
import com.arist.util.AlbumPicUtil;

public class MyNotiofation
{

    public static final int NOTIFICATION_ID = 0x759bc70;

    public MyNotiofation()
    {
    }

    public static void api16BigContentView(Notification notification, RemoteViews remoteviews)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            notification.bigContentView = remoteviews;
        }
    }

    public static void clearNotification()
    {
        ((NotificationManager)MyApplication.context.getSystemService("notification")).cancel(0x759bc70);
    }

    private static PendingIntent getinten(Context context, RemoteViews remoteviews, NotificationManager notificationmanager, Music music)
    {
        context = PendingIntent.getBroadcast(context, 1, new Intent("com.MediaPlayer.action.WIDGET_PLAY"), 0x8000000);
        int i;
        if (MyApplication.status == 3)
        {
            i = 0x7f02009b;
        } else
        {
            i = 0x7f02009a;
        }
        remoteviews.setImageViewResource(0x7f0d008e, i);
        return context;
    }

    public static void sendNotify(Context context, NotificationManager notificationmanager)
    {
        if (MyApplication.getCurrentMusic() == null)
        {
            return;
        }
        Notification notification = new Notification(0x1080024, MyApplication.getCurrentMusic().getTitle(), System.currentTimeMillis());
        RemoteViews remoteviews = new RemoteViews(context.getPackageName(), 0x7f03001f);
        android.graphics.Bitmap bitmap = AlbumPicUtil.getAlbumBitmap(MyApplication.getCurrentMusic());
        if (bitmap != null)
        {
            remoteviews.setImageViewBitmap(0x7f0d0041, bitmap);
        } else
        {
            remoteviews.setImageViewResource(0x7f0d0041, 0x7f020056);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            remoteviews.setOnClickPendingIntent(0x7f0d0092, PendingIntent.getBroadcast(context, 0x759bc70, new Intent("com.MediaPlayer.action.WIDGET_PREVIOUS"), 0x40000000));
            remoteviews.setOnClickPendingIntent(0x7f0d008e, getinten(context, remoteviews, notificationmanager, MyApplication.getCurrentMusic()));
            remoteviews.setOnClickPendingIntent(0x7f0d008f, PendingIntent.getBroadcast(context, 0x759bc70, new Intent("com.MediaPlayer.action.WIDGET_NEXT"), 0x40000000));
            remoteviews.setOnClickPendingIntent(0x7f0d0090, PendingIntent.getBroadcast(context, 0x759bc70, new Intent("com.MediaPlayer.action.WIDGET_EXIT"), 0x40000000));
        }
        remoteviews.setTextViewText(0x7f0d008c, MyApplication.getCurrentMusic().getTitle());
        remoteviews.setTextViewText(0x7f0d008d, MyApplication.getCurrentMusic().getArtist());
        notification.contentView = remoteviews;
        api16BigContentView(notification, remoteviews);
        notification.contentIntent = PendingIntent.getActivity(context, 0, new Intent(context, com/arist/MusicPlayer/MusicPlayActivity), 0x8000000);
        notification.flags = notification.flags | 0x20;
        notification.flags = notification.flags | 1;
        notificationmanager.notify(0x759bc70, notification);
    }
}
