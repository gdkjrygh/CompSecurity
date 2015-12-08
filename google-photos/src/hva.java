// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;

public final class hva extends omp
    implements fna, gkj, hvw
{

    public dnq a;
    private int ag;
    private gll ah;
    private ehr ai;
    private final mxg b;
    private final fnh c;
    private final hzg d;
    private final hvt e;
    private hrr f;
    private erj g;
    private huv h;

    public hva()
    {
        b = new mxg(af);
        c = new fnh(af);
        d = (new hzg(af)).a(ae);
        e = (new hvt(this, af, d, this)).a(ae).b(ae);
    }

    public static hva a(ekq ekq1, hrr hrr1)
    {
        hva hva1 = new hva();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.photos.core.media_collection", ekq1);
        bundle.putParcelable("extra_suggestion", hrr1);
        hva1.f(bundle);
        return hva1;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.xX, null);
        viewgroup = layoutinflater.findViewById(bu.f);
        boolean flag;
        if (bundle == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            (new oce(151)).b(ad);
        }
        b.e = new hvb(ad, viewgroup, flag);
        return layoutinflater;
    }

    public final gml a(aen aen, gml gml)
    {
        return new hvg(gml, new hgo[] {
            new hup(ad, f, ag)
        });
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        h = new huv(ad);
        Object obj = (ekq)super.q.getParcelable("com.google.android.apps.photos.core.media_collection");
        a = (dnq)((ekq) (obj)).a(dnq);
        e.a(a, f, null);
        g = (erj)ae.a(erj);
        ai = new ehr(((ekq) (obj)));
        fmi fmi1 = new fmi();
        fmi1.d = ((ekq) (obj));
        fmi1.a = ekw.a;
        fmi1.b = true;
        obj = fmi1.a();
        if (bundle == null)
        {
            h().a().a(bu.e, ((am) (obj))).b();
        }
        e.a(true);
        ah.a(ai, this);
    }

    public final void a(mue mue1)
    {
        if (mue1 != null && !mue1.c())
        {
            g.a(a.a, "OnDeviceSearchResultsFragment", null);
        }
    }

    public final int av_()
    {
        return ((hbl) (h)).b;
    }

    public final gki b(int i, int j)
    {
        Integer integer = ah.b(ai);
        if (integer == null || integer.intValue() == 0)
        {
            b.a(mxj.c);
        } else
        if (integer.intValue() > 0)
        {
            b.a(mxj.b);
        } else
        {
            b.a(mxj.a);
        }
        return null;
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        f = (hrr)super.q.getParcelable("extra_suggestion");
        ah = (gll)ae.a(gll);
        ag = ((mmr)ae.a(mmr)).d();
        bundle = ae;
        bundle.a(fna, this);
        bundle.a(mxg, b);
        bundle.a(fnh, c);
    }

    public final int d()
    {
        return -1;
    }

    public final void n()
    {
        ah.b(ai, this);
        super.n();
    }

    public final List r()
    {
        return Collections.singletonList(h);
    }

    public final boolean s()
    {
        return true;
    }
}
