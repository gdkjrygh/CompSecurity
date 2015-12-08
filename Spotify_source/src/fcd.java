// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.music.spotlets.radio.model.ThumbState;

public final class fcd extends fba
    implements fcf
{

    private final Player d;
    private final eqi e;
    private final fbb f;
    private final fcg g;
    private final fcs h;

    public fcd(Player player, fbb fbb1, eqi eqi1, fcg fcg1, fcs fcs1)
    {
        ThumbState thumbstate = ThumbState.a;
        d = (Player)ctz.a(player);
        f = (fbb)ctz.a(fbb1);
        e = (eqi)ctz.a(eqi1);
        g = (fcg)ctz.a(fcg1);
        h = (fcs)ctz.a(fcs1);
    }

    public final void a(ThumbState thumbstate, boolean flag)
    {
        boolean flag1 = true;
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ThumbState.values().length];
                try
                {
                    a[ThumbState.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ThumbState.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[thumbstate.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 81
    //                   2 100;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_100;
_L1:
        a.setActivated(false);
        b.setActivated(false);
_L4:
        if (thumbstate.equals(ThumbState.a) && !flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a.setEnabled(flag);
        b.setEnabled(flag);
        return;
_L2:
        a.setActivated(false);
        b.setActivated(true);
          goto _L4
        a.setActivated(true);
        b.setActivated(false);
          goto _L4
    }

    public final Drawable e()
    {
        Context context = super.c.getContext();
        return fyd.a(context, SpotifyIcon.aw, context.getResources().getDimensionPixelSize(0x7f0c0124), gcg.c(context, 0x7f0f0158));
    }

    public final Drawable f()
    {
        Context context = super.c.getContext();
        return fyd.a(context, SpotifyIcon.ax, context.getResources().getDimensionPixelSize(0x7f0c0124), gcg.c(context, 0x7f0f0159));
    }

    public final void g()
    {
    }

    protected final fbc h()
    {
        return new fce(eqe.a(d, this, e), f, this, g, h);
    }
}
