// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.spotlets.player.RepeatState;

public final class fby extends fba
    implements fca
{

    private final Player d;
    private final eqi e;
    private final fbb f;
    private boolean g;
    private RepeatState h;

    public fby(Player player, fbb fbb1, eqi eqi1)
    {
        d = (Player)ctz.a(player);
        f = (fbb)ctz.a(fbb1);
        e = (eqi)ctz.a(eqi1);
    }

    public final void a(RepeatState repeatstate)
    {
        h = repeatstate;
        d();
    }

    public final Drawable e()
    {
        if (g)
        {
            Context context = super.c.getContext();
            return fyd.a(context, SpotifyIcon.Q, fye.a(context), 0x7f0f0092, 0x7f0f0087);
        } else
        {
            Context context1 = super.c.getContext();
            return fyd.a(context1, SpotifyIcon.Q, fye.a(context1), 0x7f0f00bf, 0x7f0f00b9);
        }
    }

    public final Drawable f()
    {
        if (h == null)
        {
            Context context = super.c.getContext();
            return fyd.a(context, SpotifyIcon.L, dft.b(22F, context.getResources()), 0x7f0f00bf);
        }
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[RepeatState.values().length];
                try
                {
                    a[RepeatState.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[RepeatState.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[RepeatState.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        Context context3;
        switch (_cls1.a[h.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            Context context1 = super.c.getContext();
            return fyd.a(context1, SpotifyIcon.L, fye.a(context1), 0x7f0f00bf, 0x7f0f00b9);

        case 2: // '\002'
            Context context2 = super.c.getContext();
            return fyd.a(context2, SpotifyIcon.aJ, fye.a(context2), 0x7f0f0092, 0x7f0f0087);

        case 3: // '\003'
            context3 = super.c.getContext();
            break;
        }
        return fyd.a(context3, SpotifyIcon.L, fye.a(context3), 0x7f0f0092, 0x7f0f0087);
    }

    public final void g()
    {
    }

    public final void g(boolean flag)
    {
        g = flag;
        c();
    }

    protected final fbc h()
    {
        return new fbz(eqe.a(d, this, e), f, d, this, e);
    }
}
