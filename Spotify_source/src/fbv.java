// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.ads.FeaturedAction;

public final class fbv extends fbc
    implements fbq
{

    private final eqf c;
    private FeaturedAction d;
    private PlayerState e;

    public fbv(eqe eqe, fbb fbb, eqf eqf1)
    {
        super(eqe, fbb);
        c = (eqf)ctz.a(eqf1);
    }

    public final void a()
    {
        if (d == null || !d.g())
        {
            super.a();
        }
    }

    protected final void a(PlayerState playerstate)
    {
        e = playerstate;
        if (d != null && d.g())
        {
            c.d(false);
        }
    }

    public final void a(FeaturedAction featuredaction)
    {
        d = featuredaction;
        a(e);
    }

    protected final void b()
    {
    }

    public final void c()
    {
    }

    public final void d()
    {
    }
}
