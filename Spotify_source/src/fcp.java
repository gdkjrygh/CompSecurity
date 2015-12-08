// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.cosmos.player.v2.Player;

public final class fcp extends fba
{

    private final Player d;
    private final eqi e;
    private final fbb f;

    public fcp(Player player, fbb fbb1, eqi eqi1)
    {
        d = (Player)ctz.a(player);
        f = (fbb)ctz.a(fbb1);
        e = (eqi)ctz.a(eqi1);
    }

    public final Drawable e()
    {
        Context context = super.c.getContext();
        return fyd.a(context, SpotifyIcon.bn, context.getResources().getDimensionPixelSize(0x7f0c0124), 0x7f0f00bf, 0x7f0f00b9);
    }

    public final Drawable f()
    {
        Context context = super.c.getContext();
        return fyd.a(context, SpotifyIcon.bo, context.getResources().getDimensionPixelSize(0x7f0c0124), 0x7f0f00bf, 0x7f0f00b9);
    }

    public final void g()
    {
    }

    protected final fbc h()
    {
        return new fcq(eqe.a(d, this, e), f);
    }
}
