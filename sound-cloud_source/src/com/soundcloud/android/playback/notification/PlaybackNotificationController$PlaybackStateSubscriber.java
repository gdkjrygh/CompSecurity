// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import com.soundcloud.android.playback.PlaybackService;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback.notification:
//            PlaybackNotificationController

private static class strategy extends DefaultSubscriber
{

    private final PlaybackService playbackService;
    private final onNext strategy;

    public void onNext(com.soundcloud.android.playback.teSubscriber tesubscriber)
    {
        if (tesubscriber.teSubscriber())
        {
            strategy.strategy(playbackService);
            return;
        } else
        {
            strategy.(playbackService);
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((com.soundcloud.android.playback.teSubscriber.onNext)obj);
    }

    public i(PlaybackService playbackservice, i i)
    {
        playbackService = playbackservice;
        strategy = i;
    }
}
