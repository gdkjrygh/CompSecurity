// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import com.soundcloud.android.image.ApiImageSize;

public interface NotificationBuilder
{

    public static final int NOT_SET = -1;

    public abstract Notification build();

    public abstract void clearIcon();

    public abstract ApiImageSize getImageSize();

    public abstract int getTargetImageSize();

    public abstract boolean hasArtworkSupport();

    public abstract boolean hasPlayStateSupport();

    public abstract void setContentIntent(PendingIntent pendingintent);

    public abstract void setCreatorName(String s);

    public abstract void setIcon(Bitmap bitmap);

    public abstract void setPlayingStatus(boolean flag);

    public abstract void setSmallIcon(int i);

    public abstract void setTrackTitle(String s);
}
