// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.core.internal;

import android.media.MediaPlayer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class LocalFilePlayer
{

    private static ArrayList sLocalFilePlayerListeners = new ArrayList();
    MediaPlayer mMediaPlayer;
    private int nThis;

    public LocalFilePlayer()
    {
    }

    public static void addListener(LocalFilePlayerListener localfileplayerlistener)
    {
        sLocalFilePlayerListeners.add(localfileplayerlistener);
    }

    private native void onPlaybackComplete();

    public static void removeListener(LocalFilePlayerListener localfileplayerlistener)
    {
        sLocalFilePlayerListeners.remove(localfileplayerlistener);
    }

    public void close()
    {
        if (mMediaPlayer != null)
        {
            for (Iterator iterator = sLocalFilePlayerListeners.iterator(); iterator.hasNext(); ((LocalFilePlayerListener)iterator.next()).onMediaPlayerDestroyed(mMediaPlayer.getAudioSessionId())) { }
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    public int getDuration()
    {
        if (mMediaPlayer != null)
        {
            return mMediaPlayer.getDuration();
        } else
        {
            return 0;
        }
    }

    public int getPosition()
    {
        if (mMediaPlayer != null)
        {
            return mMediaPlayer.getCurrentPosition();
        } else
        {
            return 0;
        }
    }

    public boolean open(String s)
    {
        mMediaPlayer = new MediaPlayer();
        try
        {
            mMediaPlayer.setDataSource(s);
            mMediaPlayer.prepare();
            mMediaPlayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

                final LocalFilePlayer this$0;

                public void onCompletion(MediaPlayer mediaplayer)
                {
                    onPlaybackComplete();
                }

            
            {
                this$0 = LocalFilePlayer.this;
                super();
            }
            });
            for (s = sLocalFilePlayerListeners.iterator(); s.hasNext(); ((LocalFilePlayerListener)s.next()).onMediaPlayerCreated(mMediaPlayer.getAudioSessionId())) { }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            close();
            return false;
        }
        return true;
    }

    public void pause()
    {
        if (mMediaPlayer != null)
        {
            mMediaPlayer.pause();
        }
    }

    public void play()
    {
        if (mMediaPlayer != null)
        {
            mMediaPlayer.start();
        }
    }

    public void seek(int i)
    {
        if (mMediaPlayer != null)
        {
            mMediaPlayer.seekTo(i);
        }
    }



    private class LocalFilePlayerListener
    {

        public abstract void onMediaPlayerCreated(int i);

        public abstract void onMediaPlayerDestroyed(int i);
    }

}
