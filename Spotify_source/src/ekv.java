// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

public final class ekv
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver, dma
{

    public String a;
    private PlayerTrack b;
    private String c;
    private boolean d;

    public ekv()
    {
        a = "";
        c = "";
    }

    public final String a()
    {
        return c;
    }

    public final String b()
    {
        return a;
    }

    public final boolean c()
    {
        return d;
    }

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        Object obj = playerstate.track();
        if (PlayerTrackUtil.areUidsEqual(((PlayerTrack) (obj)), b))
        {
            return;
        }
        b = ((PlayerTrack) (obj));
        boolean flag;
        if (obj != null)
        {
            obj = ((PlayerTrack) (obj)).uri();
        } else
        {
            obj = "";
        }
        if (playerstate.isPlaying() && !playerstate.isPaused())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        playerstate = playerstate.entityUri();
        a = ((String) (obj));
        c = playerstate;
        d = flag;
    }
}
