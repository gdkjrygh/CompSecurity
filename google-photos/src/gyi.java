// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public final class gyi
    implements gpz, gqx, nug, omb, opt, opu, opv
{

    gye a;
    private final ar b = null;
    private final am c;
    private final int d;
    private nwm e;
    private gqw f;
    private grg g;
    private gpu h;
    private egp i;
    private final nug j = new gyj(this);
    private final nug k = new gyk(this);

    public gyi(am am1, opd opd1, int l)
    {
        c = am1;
        d = l;
        opd1.a(this);
    }

    public final void V_()
    {
        e.a().a(this);
        f.b(this);
        if (g != null)
        {
            g.a.a(j);
        }
        if (h != null)
        {
            h.b(this);
        }
        i.a().a(k);
    }

    public final void X_()
    {
        if (a == null)
        {
            a = (gye)c.h().a("com.google.android.apps.photos.photofragment.components.photobar.PhotoBarMixin.FRAGMENT_TAG");
        }
        if (a == null)
        {
            a = new gye();
            c.h().a().a(d, a, "com.google.android.apps.photos.photofragment.components.photobar.PhotoBarMixin.FRAGMENT_TAG").b();
        }
        e.a().a(this, true);
        f.a(this);
        a(f.a());
        if (g != null)
        {
            g.a.a(j, true);
        }
        if (h != null)
        {
            h.a(this);
        }
        i.a().a(k, false);
    }

    public final void a()
    {
        a.r();
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = (nwm)olm1.a(nwm);
        f = (gqw)olm1.a(gqw);
        i = (egp)olm1.a(egp);
    }

    public final void a(boolean flag)
    {
        View view;
        if (c.R != null)
        {
            view = c.R.findViewById(d);
        } else
        {
            view = null;
        }
        if (view != null)
        {
            byte byte0;
            if (flag)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            view.setVisibility(byte0);
        }
    }

    public final void b_(Object obj)
    {
        obj = ((nwm)obj).ai_();
        Object obj1 = a;
        obj1.f = (gyh)((olm) (obj)).b(gyh);
        ((gye) (obj1)).r();
        obj1 = (grg)((olm) (obj)).b(grg);
        if (g != obj1)
        {
            if (g != null)
            {
                g.a.a(j);
            }
            g = ((grg) (obj1));
            if (g != null)
            {
                g.a.a(j, true);
            }
        }
        obj = (gpu)((olm) (obj)).b(gpu);
        if (h != obj)
        {
            if (h != null)
            {
                h.b(this);
            }
            h = ((gpu) (obj));
            a.a(((gpu) (obj)));
            if (h != null)
            {
                h.a(this);
            }
        }
    }
}
