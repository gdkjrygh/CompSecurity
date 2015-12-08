// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class ibg extends omp
    implements efp, nzu
{

    private oac a;
    private PreferenceScreen b;
    private efd c;
    private nzw d;

    public ibg()
    {
        new nzt(this, af);
    }

    static efd a(ibg ibg1)
    {
        return ibg1.c;
    }

    private void b(eey eey1)
    {
        if (eey1.a == efb.b)
        {
            d.a_(a(p.aV));
        } else
        if (eey1.e != null)
        {
            d.a_(a(p.aT, new Object[] {
                eey1.e
            }));
            return;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.a(layoutinflater, viewgroup, bundle);
        b = ((oau)ae.a(oau)).b();
        return layoutinflater;
    }

    public final void a(eey eey1)
    {
        b(eey1);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        c = (efd)ae.a(efd);
    }

    public final void l()
    {
        super.l();
        c.a(false);
        c.a(this);
    }

    public final void m()
    {
        super.m();
        c.b(this);
    }

    public final void r()
    {
        a = new oac(ad);
        d = a.a(a(p.aW), a(p.aU));
        d.k = new ibh(this);
        d.b(1);
        b.b(d);
        b(c.b);
    }
}
