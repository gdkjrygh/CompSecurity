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

    private static final int DUCK = 3;
    private static final float DUCK_VOLUME = 0.1F;
    private static final float FADE_CHANGE = 0.02F;
    private static final int FADE_IN = 1;
    private static final int FADE_OUT = 2;
    private float currentVolume;
    private final WeakReference serviceRef;

    public final void handleMessage(Message message)
    {
        PlaybackService playbackservice = (PlaybackService)serviceRef.get();
        if (playbackservice == null)
        {
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            removeMessages(2);
            if (!playbackservice.streamPlayer.isPlaying())
            {
                currentVolume = 0.0F;
                playbackservice.streamPlayer.setVolume(0.0F);
                playbackservice.play();
                sendEmptyMessageDelayed(1, 10L);
                return;
            }
            currentVolume = currentVolume + 0.02F;
            (new StringBuilder("Fading volume in at : ")).append(currentVolume);
            if (currentVolume < 1.0F)
            {
                sendEmptyMessageDelayed(1, 10L);
            } else
            {
                currentVolume = 1.0F;
            }
            playbackservice.streamPlayer.setVolume(currentVolume);
            return;

        case 2: // '\002'
            removeMessages(1);
            if (playbackservice.streamPlayer.isPlaying())
            {
                currentVolume = currentVolume - 0.02F;
                (new StringBuilder("Fading out at ")).append(currentVolume);
                if (currentVolume > 0.0F)
                {
                    sendEmptyMessageDelayed(2, 10L);
                } else
                {
                    playbackservice.pause();
                    currentVolume = 0.0F;
                }
                playbackservice.streamPlayer.setVolume(currentVolume);
                return;
            } else
            {
                playbackservice.streamPlayer.setVolume(0.0F);
                return;
            }

        case 3: // '\003'
            removeMessages(1);
            removeMessages(2);
            playbackservice.streamPlayer.setVolume(0.1F);
            return;
        }
    }

    private A(PlaybackService playbackservice)
    {
        serviceRef = new WeakReference(playbackservice);
    }

    serviceRef(PlaybackService playbackservice, serviceRef serviceref)
    {
        this(playbackservice);
    }
}
