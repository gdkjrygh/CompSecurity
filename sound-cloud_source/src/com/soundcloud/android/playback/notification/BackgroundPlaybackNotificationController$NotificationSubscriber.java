// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import android.app.NotificationManager;
import android.app.Service;
import com.soundcloud.android.playback.PlaybackStateProvider;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback.notification:
//            BackgroundPlaybackNotificationController, NotificationBuilder

private class <init> extends DefaultSubscriber
{

    private final Service playbackService;
    final BackgroundPlaybackNotificationController this$0;

    public void onNext(NotificationBuilder notificationbuilder)
    {
        BackgroundPlaybackNotificationController.access$002(BackgroundPlaybackNotificationController.this, notificationbuilder);
        if (BackgroundPlaybackNotificationController.access$500(BackgroundPlaybackNotificationController.this).isSupposedToBePlaying())
        {
            playbackService.startForeground(1, BackgroundPlaybackNotificationController.access$000(BackgroundPlaybackNotificationController.this).build());
            return;
        } else
        {
            BackgroundPlaybackNotificationController.access$400(BackgroundPlaybackNotificationController.this).notify(1, BackgroundPlaybackNotificationController.access$000(BackgroundPlaybackNotificationController.this).build());
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((NotificationBuilder)obj);
    }

    private (Service service)
    {
        this$0 = BackgroundPlaybackNotificationController.this;
        super();
        playbackService = service;
    }

    playbackService(Service service, playbackService playbackservice)
    {
        this(service);
    }
}
