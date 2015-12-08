// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playback.views.NotificationPlaybackRemoteViews;

// Referenced classes of package com.soundcloud.android.playback.notification:
//            NotificationBuilder

public class RichNotificationBuilder
    implements NotificationBuilder
{

    private final android.support.v4.app.NotificationCompat.Builder builder;
    private final NotificationPlaybackRemoteViews remoteViews;
    private final Resources resources;

    public RichNotificationBuilder(Context context, com.soundcloud.android.playback.views.NotificationPlaybackRemoteViews.Factory factory, ImageOperations imageoperations)
    {
        resources = context.getResources();
        builder = new android.support.v4.app.NotificationCompat.Builder(context);
        builder.setOngoing(true);
        builder.setVisibility(1);
        builder.setSmallIcon(0x7f0201f0);
        builder.setLargeIcon(imageoperations.decodeResource(resources, 0x7f0201f0));
        remoteViews = factory.create(context.getPackageName());
        remoteViews.linkButtonsNotification(context);
    }

    public Notification build()
    {
        Notification notification = builder.build();
        notification.contentView = remoteViews;
        return notification;
    }

    public void clearIcon()
    {
        remoteViews.setIcon(null);
    }

    public ApiImageSize getImageSize()
    {
        return ApiImageSize.LARGE;
    }

    public int getTargetImageSize()
    {
        return resources.getDimensionPixelSize(0x7f0b00cf);
    }

    public boolean hasArtworkSupport()
    {
        return true;
    }

    public boolean hasPlayStateSupport()
    {
        return true;
    }

    public void setContentIntent(PendingIntent pendingintent)
    {
        builder.setContentIntent(pendingintent);
    }

    public void setCreatorName(String s)
    {
        remoteViews.setCurrentCreator(s);
    }

    public void setIcon(Bitmap bitmap)
    {
        remoteViews.setIcon(bitmap);
    }

    public void setPlayingStatus(boolean flag)
    {
        remoteViews.setPlaybackStatus(flag);
    }

    public void setSmallIcon(int i)
    {
        builder.setSmallIcon(i);
    }

    public void setTrackTitle(String s)
    {
        remoteViews.setCurrentTrackTitle(s);
    }
}
