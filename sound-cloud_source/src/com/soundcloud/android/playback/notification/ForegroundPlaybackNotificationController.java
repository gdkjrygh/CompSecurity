// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import android.app.NotificationManager;
import com.soundcloud.android.playback.PlaybackService;
import com.soundcloud.java.collections.PropertySet;

class ForegroundPlaybackNotificationController
    implements PlaybackNotificationController.Strategy
{

    private final NotificationManager notificationManager;

    public ForegroundPlaybackNotificationController(NotificationManager notificationmanager)
    {
        notificationManager = notificationmanager;
    }

    public void clear(PlaybackService playbackservice)
    {
        playbackservice.stopForeground(true);
        notificationManager.cancel(1);
    }

    public void notifyIdleState(PlaybackService playbackservice)
    {
    }

    public void notifyPlaying(PlaybackService playbackservice)
    {
    }

    public void setTrack(PlaybackService playbackservice, PropertySet propertyset)
    {
    }
}
