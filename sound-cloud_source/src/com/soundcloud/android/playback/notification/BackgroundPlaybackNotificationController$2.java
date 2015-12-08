// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import android.app.NotificationManager;
import android.graphics.Bitmap;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback.notification:
//            NotificationBuilder, BackgroundPlaybackNotificationController

class val.notificationBuilder extends DefaultSubscriber
{

    final BackgroundPlaybackNotificationController this$0;
    final NotificationBuilder val$notificationBuilder;

    public void onNext(Bitmap bitmap)
    {
        val$notificationBuilder.setIcon(bitmap);
        BackgroundPlaybackNotificationController.access$400(BackgroundPlaybackNotificationController.this).notify(1, val$notificationBuilder.build());
    }

    public volatile void onNext(Object obj)
    {
        onNext((Bitmap)obj);
    }

    ()
    {
        this$0 = final_backgroundplaybacknotificationcontroller;
        val$notificationBuilder = NotificationBuilder.this;
        super();
    }
}
