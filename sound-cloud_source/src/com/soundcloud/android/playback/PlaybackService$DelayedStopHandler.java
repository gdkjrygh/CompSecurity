// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackService, StreamPlayer

private static final class <init> extends Handler
{

    private final WeakReference serviceRef;

    public final void handleMessage(Message message)
    {
        message = (PlaybackService)serviceRef.get();
        if (message != null && !((PlaybackService) (message)).streamPlayer.isPlaying() && PlaybackService.access$200(message) == )
        {
            message.stopSelf();
        }
    }

    private (PlaybackService playbackservice)
    {
        serviceRef = new WeakReference(playbackservice);
    }

    serviceRef(PlaybackService playbackservice, serviceRef serviceref)
    {
        this(playbackservice);
    }
}
