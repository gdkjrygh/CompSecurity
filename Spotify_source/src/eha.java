// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.media.MediaService;

public final class eha extends ehi
    implements eau
{

    private com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed b;

    public eha(MediaService mediaservice, egu egu)
    {
        super(mediaservice, egu);
    }

    public static com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed b(PlayerState playerstate)
    {
        int i = 0;
        if (playerstate == null)
        {
            return new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed(0);
        }
        if (!playerstate.isPaused())
        {
            i = 1;
        }
        return new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed(i);
    }

    public final void a()
    {
        a.a(this);
    }

    public final volatile void a(int i)
    {
        super.a(i);
    }

    public final void a(PlayerState playerstate)
    {
        playerstate = b(playerstate);
        if (!playerstate.equals(b))
        {
            b = playerstate;
            a(playerstate);
        }
    }

    public final void b()
    {
        a(b(a.g));
    }

    public final volatile void c()
    {
        super.c();
    }

    public final volatile void d()
    {
        super.d();
    }

    public final volatile void e()
    {
        super.e();
    }
}
