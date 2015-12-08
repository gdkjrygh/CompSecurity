// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.miniplayer.view.MiniPlayerPageView;

public final class ets extends eql
{

    private final MiniPlayerPageView j;
    private final etl k;

    public ets(MiniPlayerPageView miniplayerpageview, etl etl1)
    {
        super(miniplayerpageview);
        j = (MiniPlayerPageView)ctz.a(miniplayerpageview);
        k = (etl)ctz.a(etl1);
    }

    public final void a(PlayerTrack playertrack)
    {
        MiniPlayerPageView miniplayerpageview = j;
        miniplayerpageview.a = playertrack;
        miniplayerpageview.c.a(playertrack);
        miniplayerpageview.a(miniplayerpageview.b);
    }

    public final volatile void a(Object obj, int i)
    {
        a((PlayerTrack)obj);
    }

    public final void u()
    {
        super.u();
        j.a(k);
    }

    public final void v()
    {
        super.v();
        j.a(null);
    }
}
