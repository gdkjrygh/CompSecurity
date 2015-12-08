// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.videoplayer;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import eqe;
import flp;

// Referenced classes of package com.spotify.mobile.android.spotlets.videoplayer:
//            VideoPresenter

final class a
    implements com.spotify.mobile.android.cosmos.player.v2.eObserver
{

    private VideoPresenter a;

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        PlayerTrack playertrack = playerstate.track();
        if (!PlayerTrackUtil.isVideo(playertrack))
        {
            a.b.f();
            return;
        }
        a.b.a(VideoPresenter.a(playertrack, "artist_name"), VideoPresenter.a(playertrack, "title"));
        if (PlayerTrackUtil.isEpisode(playertrack.uri()))
        {
            a.b.l();
        } else
        {
            a.b.m();
        }
        if (playerstate.isPaused())
        {
            a.b.j();
            a.b.k();
        }
        a.d.onPlayerStateReceived(playerstate);
    }

    erver(VideoPresenter videopresenter)
    {
        a = videopresenter;
        super();
    }
}
