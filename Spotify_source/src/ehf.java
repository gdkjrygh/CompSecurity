// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.media.MediaService;

public final class ehf extends ehi
    implements eau
{

    private Optional b;

    public ehf(MediaService mediaservice, egu egu)
    {
        super(mediaservice, egu);
        b = Optional.c(null);
    }

    public static com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Shuffle b(PlayerState playerstate)
    {
        if (playerstate != null)
        {
            return new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Shuffle(playerstate.options().shufflingContext());
        } else
        {
            return com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Shuffle.DEFAULT;
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
        playerstate = b(playerstate);
        Boolean boolean1 = Boolean.valueOf(((com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Shuffle) (playerstate)).shuffle);
        if (!boolean1.equals(b.d()))
        {
            b = Optional.c(boolean1);
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
