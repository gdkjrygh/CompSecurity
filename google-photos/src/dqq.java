// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;

public final class dqq extends omp
    implements fmk, fna, mxe, nwn
{

    private final dqv a;
    private hbl b;
    private mmr c;
    private am d;
    private nwm e;
    private View f;

    public dqq()
    {
        a = new dqv(af);
        new ege(af);
        new gcg(af);
        Object obj = new dsf(af);
        ae.a(fqg, obj);
        obj = new hhl(af);
        olm olm1 = ae;
        olm1.b(ftx, obj);
        olm1.b(ftd, ((hhl) (obj)).a);
    }

    public static dqq b(int i)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("account_id", i);
        dqq dqq1 = new dqq();
        dqq1.f(bundle);
        return dqq1;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.iQ, viewgroup, false);
        f = layoutinflater.findViewById(b.iM);
        return layoutinflater;
    }

    public final gml a(aen aen, gml gml)
    {
        dqv dqv1 = a;
        dqv1.e = aen;
        return new dqu(dqv1, gml);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        b = new dqr(this, b.iP, frf.a(O_()));
    }

    public final void ak_()
    {
        super.ak_();
        f = null;
    }

    public final void au_()
    {
        super.au_();
        d = h().a("grid_layers");
        if (d == null)
        {
            int i = c.d();
            fmi fmi1 = new fmi();
            fmi1.d = b.a(i, null);
            fmi1.b = true;
            fmi1.e = "com.google.android.apps.photos.allphotos.zoom_level";
            d = fmi1.a();
            h().a().a(b.iN, d, "grid_layers").b();
            h().b();
        }
        e.c();
    }

    public final int av_()
    {
        return b.b;
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        c = (mmr)ae.a(mmr);
        e = (nwm)ae.a(nwm);
        bundle = ae;
        bundle.a(fna, this);
        bundle.a(fmk, this);
    }

    public final List r()
    {
        return Collections.singletonList(b);
    }

    public final boolean s()
    {
        return a.W_();
    }

    public final am u()
    {
        return d;
    }

    public final void v()
    {
        if (f != null)
        {
            f.setVisibility(0);
        }
    }

    public final void w()
    {
        if (f != null)
        {
            f.setVisibility(8);
        }
    }

    public final void x()
    {
        if (f != null)
        {
            f.setVisibility(8);
        }
    }

    public final am y()
    {
        return drc.a(new dmh(c.d()));
    }
}
