// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobile.android.cosmos.player.v2.Player;

public final class fbu extends fba
{

    private final Player d;
    private final eqi e;
    private final fbp f;
    private final fbb g;
    private fbv h;

    public fbu(Player player, fbb fbb1, eqi eqi1, fbp fbp1)
    {
        d = (Player)ctz.a(player);
        e = (eqi)ctz.a(eqi1);
        f = (fbp)ctz.a(fbp1);
        g = (fbb)ctz.a(fbb1);
    }

    public final void a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        super.a(layoutinflater, viewgroup);
        if (h != null)
        {
            f.a(h);
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        super.a(viewgroup);
        if (h != null)
        {
            f.b(h);
        }
    }

    public final Drawable e()
    {
        return null;
    }

    public final Drawable f()
    {
        return null;
    }

    public final void g()
    {
    }

    protected final fbc h()
    {
        h = new fbv(eqe.a(d, this, e), g, this);
        return h;
    }
}
