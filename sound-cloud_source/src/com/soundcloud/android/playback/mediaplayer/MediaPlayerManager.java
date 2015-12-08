// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.mediaplayer;

import android.media.MediaPlayer;
import com.soundcloud.android.utils.ErrorUtils;

public class MediaPlayerManager
{

    public MediaPlayerManager()
    {
    }

    public MediaPlayer create()
    {
        return new MediaPlayer();
    }

    public void stopAndRelease(MediaPlayer mediaplayer)
    {
        try
        {
            mediaplayer.reset();
            mediaplayer.release();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediaPlayer mediaplayer)
        {
            ErrorUtils.handleSilentException(mediaplayer);
        }
    }

    public void stopAndReleaseAsync(final MediaPlayer mediaPlayer)
    {
        (new _cls1()).start();
    }

    private class _cls1 extends Thread
    {

        final MediaPlayerManager this$0;
        final MediaPlayer val$mediaPlayer;

        public void run()
        {
            stopAndRelease(mediaPlayer);
        }

        _cls1()
        {
            this$0 = MediaPlayerManager.this;
            mediaPlayer = mediaplayer;
            super();
        }
    }

}
