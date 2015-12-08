// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;


// Referenced classes of package com.soundcloud.android.playback.notification:
//            PlaybackNotificationController

class rategy
    implements Runnable
{

    final PlaybackNotificationController this$0;
    final rategy val$nextStrategy;

    public void run()
    {
        PlaybackNotificationController.access$000(PlaybackNotificationController.this, val$nextStrategy);
    }

    rategy()
    {
        this$0 = final_playbacknotificationcontroller;
        val$nextStrategy = rategy.this;
        super();
    }
}
