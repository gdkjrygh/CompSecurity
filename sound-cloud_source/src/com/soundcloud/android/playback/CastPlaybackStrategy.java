// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.cast.CastPlayer;
import com.soundcloud.android.model.Urn;
import rx.b;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackStrategy, PlayQueue, PlaySessionSource

public class CastPlaybackStrategy
    implements PlaybackStrategy
{

    private final CastPlayer castPlayer;

    public CastPlaybackStrategy(CastPlayer castplayer)
    {
        castPlayer = castplayer;
    }

    public void pause()
    {
        castPlayer.pause();
    }

    public b playCurrent()
    {
        castPlayer.playCurrent();
        return b.just(null);
    }

    public void resume()
    {
        castPlayer.resume();
    }

    public void seek(long l)
    {
        castPlayer.seek(l);
    }

    public b setNewQueue(PlayQueue playqueue, Urn urn, int i, boolean flag, PlaySessionSource playsessionsource)
    {
        return castPlayer.setNewQueue(playqueue.getTrackItemUrns(), urn, playsessionsource);
    }

    public void togglePlayback()
    {
        castPlayer.togglePlayback();
    }
}
