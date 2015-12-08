// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.MediaRouteActionProvider;
import android.view.MenuItem;

public final class egn
    implements dhf, omb, opv
{

    final msp a;
    dhk b;
    private final int c;
    private final int d;
    private Context e;
    private lxn f;

    public egn(int i, int j, msp msp)
    {
        c = i;
        d = j;
        a = msp;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = context;
        f = (lxn)olm1.a(lxn);
        b = (dhk)olm1.a(dhk);
    }

    public final void a(MenuItem menuitem)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            menuitem.setVisible(true);
            yz yz1 = (new za()).a(f.a("96084372")).a();
            egl egl1 = new egl(e, ed.b(e, c), ed.b(e, d));
            ln.a(menuitem, 2);
            ln.a(menuitem, egl1);
            if (yz1 == null)
            {
                throw new IllegalArgumentException("selector must not be null");
            }
            if (!((MediaRouteActionProvider) (egl1)).f.equals(yz1))
            {
                if (!((MediaRouteActionProvider) (egl1)).f.c())
                {
                    ((MediaRouteActionProvider) (egl1)).d.a(((MediaRouteActionProvider) (egl1)).e);
                }
                if (!yz1.c())
                {
                    ((MediaRouteActionProvider) (egl1)).d.a(yz1, ((MediaRouteActionProvider) (egl1)).e, 0);
                }
                egl1.f = yz1;
                egl1.d();
                if (((MediaRouteActionProvider) (egl1)).g != null)
                {
                    ((MediaRouteActionProvider) (egl1)).g.a(yz1);
                }
            }
            if (a != null)
            {
                egl1.h = new ego(this);
            }
            return;
        } else
        {
            menuitem.setVisible(false);
            return;
        }
    }

    public final void b(MenuItem menuitem)
    {
    }
}
