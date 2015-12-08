// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

// Referenced classes of package org.chromium.media:
//            MediaPlayerBridge

class MediaPlayerListener
    implements android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnSeekCompleteListener, android.media.MediaPlayer.OnVideoSizeChangedListener, android.media.MediaPlayer.OnErrorListener, android.media.AudioManager.OnAudioFocusChangeListener
{

    private static final int MEDIA_ERROR_DECODE = 1;
    private static final int MEDIA_ERROR_FORMAT = 0;
    private static final int MEDIA_ERROR_INVALID_CODE = 3;
    public static final int MEDIA_ERROR_MALFORMED = -1007;
    private static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 2;
    public static final int MEDIA_ERROR_TIMED_OUT = -110;
    private final Context mContext;
    private long mNativeMediaPlayerListener;

    private MediaPlayerListener(long l, Context context)
    {
        mNativeMediaPlayerListener = 0L;
        mNativeMediaPlayerListener = l;
        mContext = context;
    }

    private static MediaPlayerListener create(long l, Context context, MediaPlayerBridge mediaplayerbridge)
    {
        MediaPlayerListener mediaplayerlistener = new MediaPlayerListener(l, context);
        if (mediaplayerbridge != null)
        {
            mediaplayerbridge.setOnBufferingUpdateListener(mediaplayerlistener);
            mediaplayerbridge.setOnCompletionListener(mediaplayerlistener);
            mediaplayerbridge.setOnErrorListener(mediaplayerlistener);
            mediaplayerbridge.setOnPreparedListener(mediaplayerlistener);
            mediaplayerbridge.setOnSeekCompleteListener(mediaplayerlistener);
            mediaplayerbridge.setOnVideoSizeChangedListener(mediaplayerlistener);
        }
        ((AudioManager)context.getSystemService("audio")).requestAudioFocus(mediaplayerlistener, 3, 3);
        return mediaplayerlistener;
    }

    private native void nativeOnBufferingUpdate(long l, int i);

    private native void nativeOnMediaError(long l, int i);

    private native void nativeOnMediaInterrupted(long l);

    private native void nativeOnMediaPrepared(long l);

    private native void nativeOnPlaybackComplete(long l);

    private native void nativeOnSeekComplete(long l);

    private native void nativeOnVideoSizeChanged(long l, int i, int j);

    public void onAudioFocusChange(int i)
    {
        if (i == -1 || i == -2)
        {
            nativeOnMediaInterrupted(mNativeMediaPlayerListener);
        }
    }

    public void onBufferingUpdate(MediaPlayer mediaplayer, int i)
    {
        nativeOnBufferingUpdate(mNativeMediaPlayerListener, i);
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        nativeOnPlaybackComplete(mNativeMediaPlayerListener);
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        i;
        JVM INSTR lookupswitch 3: default 36
    //                   1: 49
    //                   100: 91
    //                   200: 96;
           goto _L1 _L2 _L3 _L4
_L1:
        i = 3;
_L6:
        nativeOnMediaError(mNativeMediaPlayerListener, i);
        return true;
_L2:
        switch (j)
        {
        default:
            i = 0;
            break;

        case -1007: 
            i = 1;
            break;

        case -110: 
            i = 3;
            break;
        }
        if (false)
        {
        }
        continue; /* Loop/switch isn't completed */
_L3:
        i = 1;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        nativeOnMediaPrepared(mNativeMediaPlayerListener);
    }

    public void onSeekComplete(MediaPlayer mediaplayer)
    {
        nativeOnSeekComplete(mNativeMediaPlayerListener);
    }

    public void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        nativeOnVideoSizeChanged(mNativeMediaPlayerListener, i, j);
    }

    public void releaseResources()
    {
        if (mContext != null)
        {
            AudioManager audiomanager = (AudioManager)mContext.getSystemService("audio");
            if (audiomanager != null)
            {
                audiomanager.abandonAudioFocus(this);
            }
        }
    }
}
