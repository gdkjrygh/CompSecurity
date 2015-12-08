// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.Widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.arist.MusicPlayer.MyApplication;
import com.arist.MusicPlayer.WelcomeActivity;
import com.arist.util.AlbumPicUtil;

public class Widget2x2Transparent extends AppWidgetProvider
{

    private Intent intentSend;
    private PendingIntent pendingIntent;
    private RemoteViews views;

    public Widget2x2Transparent()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        AppWidgetManager appwidgetmanager = AppWidgetManager.getInstance(context);
        if (views == null)
        {
            views = new RemoteViews(context.getPackageName(), 0x7f030027);
        }
        if ("com.MediaPlayer.action.MEDIAPLAYER_INFO".equals(intent.getAction()))
        {
            int i = intent.getIntExtra("musicProgress", 0);
            views.setProgressBar(0x7f0d00b6, 1000, (i * 1000) / MyApplication.getMusicDuration(), false);
            appwidgetmanager.updateAppWidget(new ComponentName(context, com/arist/Widget/Widget2x2Transparent), views);
            return;
        }
        if ("com.MediaPlayer.action.MUSIC_CHANGED".equals(intent.getAction()))
        {
            views.setTextViewText(0x7f0d00b5, (new StringBuilder(String.valueOf(MyApplication.getMusicTitle()))).append(" - ").append(MyApplication.getMusicArtist()).toString());
            appwidgetmanager.updateAppWidget(new ComponentName(context, com/arist/Widget/Widget2x2Transparent), views);
            return;
        }
        if ("com.MediaPlayer.action.STATUS_CHANGED".equals(intent.getAction()))
        {
            if (MyApplication.status == 2)
            {
                views.setImageViewResource(0x7f0d002c, 0x7f02009a);
            } else
            {
                views.setImageViewResource(0x7f0d002c, 0x7f02009b);
            }
            appwidgetmanager.updateAppWidget(new ComponentName(context, com/arist/Widget/Widget2x2Transparent), views);
            return;
        }
        if ("com.MediaPlayer.action.ALBUM_PIC_CHANGED".equals(intent.getAction()))
        {
            intent = AlbumPicUtil.getAlbumBitmap(MyApplication.getCurrentMusic());
            if (intent != null)
            {
                views.setImageViewBitmap(0x7f0d00b4, intent);
            } else
            {
                views.setImageViewResource(0x7f0d00b4, 0x7f020056);
            }
            appwidgetmanager.updateAppWidget(new ComponentName(context, com/arist/Widget/Widget2x2Transparent), views);
            return;
        } else
        {
            super.onReceive(context, intent);
            return;
        }
    }

    public void onUpdate(Context context, AppWidgetManager appwidgetmanager, int ai[])
    {
        if (views == null)
        {
            views = new RemoteViews(context.getPackageName(), 0x7f030027);
        }
        intentSend = new Intent();
        intentSend.setAction("com.MediaPlayer.action.PLAY");
        pendingIntent = PendingIntent.getBroadcast(context, 0, intentSend, 0x8000000);
        views.setOnClickPendingIntent(0x7f0d002c, pendingIntent);
        appwidgetmanager.updateAppWidget(ai, views);
        intentSend = new Intent();
        intentSend.setAction("com.MediaPlayer.action.PREVIOUS");
        pendingIntent = PendingIntent.getBroadcast(context, 0, intentSend, 0x8000000);
        views.setOnClickPendingIntent(0x7f0d002b, pendingIntent);
        appwidgetmanager.updateAppWidget(ai, views);
        intentSend = new Intent();
        intentSend.setAction("com.MediaPlayer.action.NEXT");
        pendingIntent = PendingIntent.getBroadcast(context, 0, intentSend, 0x8000000);
        views.setOnClickPendingIntent(0x7f0d002d, pendingIntent);
        appwidgetmanager.updateAppWidget(ai, views);
        intentSend = new Intent(context, com/arist/MusicPlayer/WelcomeActivity);
        pendingIntent = PendingIntent.getActivity(context, 0, intentSend, 0x8000000);
        views.setOnClickPendingIntent(0x7f0d00b4, pendingIntent);
        appwidgetmanager.updateAppWidget(ai, views);
    }
}
