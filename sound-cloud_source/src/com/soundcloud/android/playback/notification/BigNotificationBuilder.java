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

public class BigNotificationBuilder
    implements NotificationBuilder
{

    private final NotificationPlaybackRemoteViews bigRemoteViews;
    private final android.support.v4.app.NotificationCompat.Builder builder;
    private final Resources resources;
    private final NotificationPlaybackRemoteViews smallRemoteViews;

    public BigNotificationBuilder(Context context, com.soundcloud.android.playback.views.NotificationPlaybackRemoteViews.Factory factory, ImageOperations imageoperations)
    {
        resources = context.getResources();
        builder = new android.support.v4.app.NotificationCompat.Builder(context);
        builder.setOngoing(true);
        builder.setVisibility(1);
        builder.setSmallIcon(0x7f0201f0);
        builder.setLargeIcon(imageoperations.decodeResource(resources, 0x7f0201f0));
        smallRemoteViews = factory.create(context.getPackageName());
        smallRemoteViews.linkButtonsNotification(context);
        bigRemoteViews = factory.create(context.getPackageName(), 0x7f03008e);
        bigRemoteViews.linkButtonsNotification(context);
    }

    public Notification build()
    {
        Notification notification = builder.build();
        notification.contentView = smallRemoteViews;
        notification.bigContentView = bigRemoteViews;
        return notification;
    }

    public void clearIcon()
    {
        smallRemoteViews.setIcon(null);
        bigRemoteViews.setIcon(null);
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
        smallRemoteViews.setCurrentCreator(s);
        bigRemoteViews.setCurrentCreator(s);
    }

    public void setIcon(Bitmap bitmap)
    {
        smallRemoteViews.setIcon(bitmap);
        bigRemoteViews.setIcon(bitmap);
    }

    public void setPlayingStatus(boolean flag)
    {
        smallRemoteViews.setPlaybackStatus(flag);
        bigRemoteViews.setPlaybackStatus(flag);
    }

    public void setSmallIcon(int i)
    {
        builder.setSmallIcon(i);
    }

    public void setTrackTitle(String s)
    {
        smallRemoteViews.setCurrentTrackTitle(s);
        bigRemoteViews.setCurrentTrackTitle(s);
    }
}
