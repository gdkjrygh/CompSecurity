// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;


// Referenced classes of package com.soundcloud.android.playback:
//            BufferUnderrunListener, PlaybackProgress

static class isStartingPlaybackAfterSeek
{

    private boolean isStartingPlaybackAfterSeek;

    private boolean isStartingPlayback(isStartingPlaybackAfterSeek isstartingplaybackafterseek)
    {
        return isStartingPlaybackAfterSeek || isstartingplaybackafterseek.ss().getPosition() == 0L;
    }

    public void onSeek()
    {
        isStartingPlaybackAfterSeek = true;
    }

    public boolean onStateTransitionEvent(isStartingPlaybackAfterSeek isstartingplaybackafterseek)
    {
        if (isStartingPlaybackAfterSeek)
        {
            isStartingPlaybackAfterSeek = isstartingplaybackafterseek.ng();
        }
        return !isStartingPlayback(isstartingplaybackafterseek) && isstartingplaybackafterseek.ng();
    }

    public ()
    {
        isStartingPlaybackAfterSeek = false;
    }
}
