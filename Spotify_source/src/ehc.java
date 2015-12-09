// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.media.MediaService;

public final class ehc extends ehi
    implements eau
{

    private Optional b;

    public ehc(MediaService mediaservice, egu egu)
    {
        super(mediaservice, egu);
        b = Optional.c(null);
    }

    public static com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Repeat b(PlayerState playerstate)
    {
        if (playerstate != null)
        {
            return new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Repeat(c(playerstate).intValue());
        } else
        {
            return com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Repeat.DEFAULT;
        }
    }

    private static Integer c(PlayerState playerstate)
    {
        if (playerstate.options().repeatingContext())
        {
            return Integer.valueOf(2);
        }
        if (playerstate.options().repeatingTrack())
        {
            return Integer.valueOf(1);
        } else
        {
            return Integer.valueOf(0);
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
        playerstate = c(playerstate);
        if (!playerstate.equals(b.d()))
        {
            b = Optional.c(playerstate);
            a(new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Repeat(playerstate.intValue()));
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
