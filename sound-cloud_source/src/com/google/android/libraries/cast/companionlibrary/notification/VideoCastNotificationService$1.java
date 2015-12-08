// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.notification;

import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumerImpl;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.notification:
//            VideoCastNotificationService

class this._cls0 extends VideoCastConsumerImpl
{

    final VideoCastNotificationService this$0;

    public void onApplicationDisconnected(int i)
    {
        LogUtils.LOGD(VideoCastNotificationService.access$000(), "onApplicationDisconnected() was reached, stopping the notification service");
        stopSelf();
    }

    public void onRemoteMediaPlayerStatusUpdated()
    {
        int i = VideoCastNotificationService.access$100(VideoCastNotificationService.this).getPlaybackStatus();
        VideoCastNotificationService.access$200(VideoCastNotificationService.this, i);
    }

    public void onUiVisibilityChanged(boolean flag)
    {
        VideoCastNotificationService videocastnotificationservice = VideoCastNotificationService.this;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        VideoCastNotificationService.access$302(videocastnotificationservice, flag);
        if (VideoCastNotificationService.access$300(VideoCastNotificationService.this) && VideoCastNotificationService.access$400(VideoCastNotificationService.this) != null)
        {
            startForeground(1, VideoCastNotificationService.access$400(VideoCastNotificationService.this));
            return;
        } else
        {
            stopForeground(true);
            return;
        }
    }

    ()
    {
        this$0 = VideoCastNotificationService.this;
        super();
    }
}
