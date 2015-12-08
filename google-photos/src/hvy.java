// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.photos.list.PhotoTileView;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class hvy extends omp
    implements fna, frm, gkj, gph, hvs, hvw, nwn
{

    public dnq a;
    private gog ag;
    private dha ah;
    private ehr ai;
    private View aj;
    private boolean ak;
    private gll al;
    private mmr am;
    private myf an;
    private final mxg b;
    private final hba c = new hba();
    private final hzg d;
    private final hvt e;
    private hvq f;
    private boolean g;
    private ekq h;

    public hvy()
    {
        b = new mxg(af);
        d = (new hzg(af)).a(ae);
        e = (new hvt(this, af, d, this)).a(ae).b(ae);
        (new hqr()).a(ae);
        (new hbs(af)).a(ae);
        Object obj = new fqx(af);
        ae.a(fqx, obj);
        obj = new fra(af);
        olm olm1 = ae;
        olm1.a(fra, obj);
        olm1.a(fqy, obj);
        new hvl(this, af, "extra_search_query");
        obj = ae;
        new hux(this, af);
    }

    private void a(boolean flag, boolean flag1)
    {
        if (g)
        {
            aj.setVisibility(8);
        } else
        {
            aj.setVisibility(0);
        }
        if (flag)
        {
            b.a(mxj.a);
            return;
        }
        if (flag1)
        {
            b.a(mxj.c);
            return;
        } else
        {
            b.a(mxj.b);
            return;
        }
    }

    private hrr v()
    {
        return (hrr)super.q.getParcelable("extra_suggestion");
    }

    private void w()
    {
        if (!ak)
        {
            ak = true;
            (new oce(150)).b(ad);
        }
    }

    private void x()
    {
        (new oce(149)).b(ad);
        if (a.i)
        {
            hvq hvq1 = f;
            hvq1.a = true;
            hvq1.b = 0L;
        } else
        {
            f.a();
        }
        e.a(false);
    }

    private void y()
    {
        Integer integer1 = al.b(ai);
        Integer integer = integer1;
        if (integer1 == null)
        {
            integer = Integer.valueOf(0);
        }
        if (integer.intValue() == 0)
        {
            hvq hvq1 = f;
            boolean flag;
            if (hvq1.a && hvq1.b == 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                a(false, true);
                w();
                return;
            }
        }
        if (integer.intValue() != 0)
        {
            a(false, false);
            return;
        } else
        {
            a(true, true);
            return;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.xY, null);
        viewgroup = layoutinflater.findViewById(bu.m);
        aj = viewgroup.findViewById(bu.h);
        b.e = new fgo(viewgroup);
        y();
        return layoutinflater;
    }

    public final gml a(aen aen, gml gml)
    {
        gml = new huz(aen, al, gml, ai, f);
        aen = v();
        int i = am.d();
        boolean flag;
        if (an.a(hul.a, i) && aen != null && aen.a() == hsw.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aen = gml;
        if (flag)
        {
            aen = new hvg(gml, new hgo[] {
                new hup(ad, v(), am.d())
            });
        }
        return aen;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Bundle bundle1 = super.q;
        h = (ekq)bundle1.getParcelable("extra_search_query");
        if (bundle == null)
        {
            bundle = new fmi();
            bundle.d = h;
            bundle.b = true;
            bundle = bundle.a();
            h().a().a(bu.e, bundle).b();
        } else
        {
            ak = bundle.getBoolean("extra_is_search_first_page_displayed", false);
        }
        bundle = v();
        g = bundle1.getBoolean("extra_enable_caption_view");
        a = (dnq)h.a(dnq);
        f = (new hvq(af, h)).a(this);
        ai = new ehr(h, ekw.a);
        e.a(a, bundle, f);
    }

    public final void a(PhotoTileView phototileview, ekp ekp)
    {
        ag.a(ekp, phototileview, t());
    }

    public final void a(mue mue1)
    {
        if (mue1 != null && !mue1.c())
        {
            x();
        }
    }

    public final void aj_()
    {
        al.b(ai, this);
        super.aj_();
    }

    public final void au_()
    {
        super.au_();
        al.a(ai, this);
        x();
    }

    public final int av_()
    {
        return 0;
    }

    public final gki b(int i, int j)
    {
        Object obj = al.b(ai);
        boolean flag;
        if (obj != null && ((Integer) (obj)).intValue() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            w();
        }
        e.a(flag);
        ah.a();
        obj = d.b;
        ((hzd) (obj)).g.b(hzd.c);
        ((hzd) (obj)).d.clear();
        ((hzd) (obj)).e.addAll(((hzd) (obj)).f.g().keySet());
        ((hzd) (obj)).h.a.b();
        y();
        return null;
    }

    public final void b()
    {
        if (!f.a)
        {
            f.a();
        }
    }

    public final void c()
    {
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        bundle = hbg.c(ad);
        bundle.h = true;
        bundle = bundle.a();
        hbi hbi1 = new hbi(ad, new hbl[] {
            new hbm(ad, ((hbg) (bundle)).b), new hbj(ad), new hbk(ad), new huv(ad)
        });
        olm olm1 = ae;
        olm1.a(frm, this);
        olm1.a(haz, hbi1);
        olm1.a(hba, c);
        olm1.a(hbg, bundle);
        olm1.a(fna, this);
        olm1.a("com.google.android.apps.photos.ScrollingToolbarManager.NEEDS_SHADOW", true);
        ag = (gog)ae.a(gog);
        ah = (dha)ae.a(dha);
        al = (gll)ae.a(gll);
        am = (mmr)ae.a(mmr);
        an = (myf)ae.a(myf);
    }

    public final int d()
    {
        return -1;
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("extra_is_search_first_page_displayed", ak);
    }

    public final List r()
    {
        return Collections.unmodifiableList(Arrays.asList(new hbl[] {
            new hvz(this, bu.g, frf.a(O_())), new huv(ad)
        }));
    }

    public final boolean s()
    {
        return false;
    }

    public final gob t()
    {
        return gnw.v().a(h).a(true);
    }

    public final am u()
    {
        return h().a(bu.e);
    }
}
