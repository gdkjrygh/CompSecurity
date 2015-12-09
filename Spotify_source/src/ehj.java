// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.media.MediaService;

public final class ehj extends ehi
    implements eau
{

    private long b;

    public ehj(MediaService mediaservice, egu egu)
    {
        super(mediaservice, egu);
        b = -1L;
    }

    public static com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackElapsed b(PlayerState playerstate)
    {
        long l = 0L;
        if (playerstate != null)
        {
            long l1 = playerstate.duration();
            if (l1 > 0L)
            {
                l = (100L * playerstate.currentPlaybackPosition()) / l1;
            }
            return new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackElapsed((int)playerstate.currentPlaybackPosition(), (int)l1, (int)l);
        } else
        {
            return com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackElapsed.DEFAULT;
        }
    }

    protected final void a()
    {
        a.a(this);
    }

    public final volatile void a(int i)
    {
        super.a(i);
    }

    public final void a(PlayerState playerstate)
    {
        boolean flag;
        if (b != playerstate.currentPlaybackPosition())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b = playerstate.currentPlaybackPosition();
            a(b(playerstate));
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
