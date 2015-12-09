// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate;

final class dqf
    implements PorcelainRenderDelegate
{

    private final dqg a;
    private final com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate b;
    private final dqi c;

    private dqf(dqg dqg, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate porcelainimagedelegate, dqi dqi)
    {
        a = dqg;
        b = porcelainimagedelegate;
        c = dqi;
    }

    dqf(dqg dqg, com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate porcelainimagedelegate, dqi dqi, byte byte0)
    {
        this(dqg, porcelainimagedelegate, dqi);
    }

    public final dqg a()
    {
        return a;
    }

    public final com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate b()
    {
        return b;
    }

    public final dqi c()
    {
        return c;
    }
}
