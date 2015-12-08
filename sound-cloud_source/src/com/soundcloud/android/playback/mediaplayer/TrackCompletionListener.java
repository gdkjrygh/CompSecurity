// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.mediaplayer;

import android.media.MediaPlayer;

// Referenced classes of package com.soundcloud.android.playback.mediaplayer:
//            MediaPlayerAdapter

class TrackCompletionListener
    implements android.media.MediaPlayer.OnCompletionListener
{

    static final int COMPLETION_TOLERANCE_MS = 3000;
    private final MediaPlayerAdapter mediaPlayerAdapter;

    TrackCompletionListener(MediaPlayerAdapter mediaplayeradapter)
    {
        mediaPlayerAdapter = mediaplayeradapter;
    }

    private long getTargetStopPosition(MediaPlayer mediaplayer)
    {
        if (mediaPlayerAdapter.hasValidSeekPosition())
        {
            return mediaPlayerAdapter.getSeekPosition();
        }
        if (mediaPlayerAdapter.isTryingToResumeTrack())
        {
            return mediaPlayerAdapter.getResumeTime();
        }
        if (mediaPlayerHasReset(mediaplayer))
        {
            return (long)mediaplayer.getDuration();
        } else
        {
            return (long)mediaplayer.getCurrentPosition();
        }
    }

    private boolean mediaPlayerHasReset(MediaPlayer mediaplayer)
    {
        return mediaplayer.getCurrentPosition() <= 0 && mediaPlayerAdapter.isPlayerPlaying();
    }

    private boolean shouldAutoRetry(long l, long l1)
    {
        return mediaPlayerAdapter.isSeekable() && l1 - l > 3000L;
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        long l = getTargetStopPosition(mediaplayer);
        int i = mediaplayer.getDuration();
        if (shouldAutoRetry(l, i))
        {
            mediaPlayerAdapter.setResumeTimeAndInvokeErrorListener(mediaplayer, l);
            (new StringBuilder("premature end of track [lastPosition = ")).append(l).append(", duration = ").append(i).append(", diff = ").append((long)i - l).append("]");
            return;
        }
        if (mediaPlayerAdapter.isInErrorState())
        {
            mediaPlayerAdapter.stop(mediaplayer);
            return;
        } else
        {
            mediaPlayerAdapter.onTrackEnded();
            return;
        }
    }
}
