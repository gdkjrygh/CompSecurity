// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import km;
import tr;
import ts;
import ug;
import yz;
import zb;

public class MediaRouteActionProvider extends km
{

    public final zb d;
    public final tr e = new tr(this);
    public yz f;
    public ts g;
    private ug h;

    public MediaRouteActionProvider(Context context)
    {
        super(context);
        f = yz.c;
        h = ug.a();
        d = zb.a(context);
    }

    public static void a(MediaRouteActionProvider mediarouteactionprovider)
    {
        mediarouteactionprovider.d();
    }

    public final View a()
    {
        if (g != null)
        {
            Log.e("MediaRouteActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        g = g();
        g.b = true;
        g.a(f);
        ts ts1 = g;
        ug ug1 = h;
        if (ug1 == null)
        {
            throw new IllegalArgumentException("factory must not be null");
        } else
        {
            ts1.a = ug1;
            g.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -1));
            return g;
        }
    }

    public final boolean b()
    {
        return true;
    }

    public final boolean c()
    {
        return zb.a(f, 1);
    }

    public final boolean e()
    {
        if (g != null)
        {
            return g.a();
        } else
        {
            return false;
        }
    }

    public ts g()
    {
        return new ts(super.a);
    }
}
