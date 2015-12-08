// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.photos.list.PhotoTileView;
import java.util.ArrayList;
import java.util.List;

public final class jbr extends omp
    implements dhc, frm, gak, gph, iwk, nwn
{

    public static final ekk a = (new ekm()).a(elt).a();
    private gzt ag;
    private hbg ah;
    private mmr ai;
    private dha aj;
    private gog ak;
    private jbp al;
    private ehr am;
    private gaj an;
    private noz ao;
    private int ap;
    private final mxg b;
    private final iwm c;
    private final hzc d = new hzc();
    private final hba e = new hba();
    private final List f = new ArrayList();
    private jbh g;
    private hgz h;

    public jbr()
    {
        b = new mxg(af);
        c = new iwm(this, af, this);
        (new fpj(af, (byte)0)).a(ae);
        (new hqv(this, af)).a(ae);
        (new hqr()).a(ae);
        (new msi(pwt.Q)).a(ae);
        (new dhj(this, Integer.valueOf(b.BE), co.h)).a(ae);
        (new dhg(this, af, new jbu(this), 0x102002c, null)).a(ae);
        (new dhg(this, af, new jbt(this), co.b, pwr.j)).a(ae);
        (new dhg(this, af, d, co.g, pwr.v)).a(ae);
        (new dhg(this, af, new fnn(fnl.h), co.a, pwr.k)).a(ae);
        (new hbs(af)).a(ae);
    }

    static hgz a(jbr jbr1)
    {
        return jbr1.h;
    }

    static void b(jbr jbr1)
    {
        if (jbr1.i())
        {
            jbr1.g.a(jbr1.ap);
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.BD, null);
        viewgroup = layoutinflater.findViewById(co.j);
        b.e = new fgo(viewgroup);
        return layoutinflater;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ao = noz.a(ad, "TrashPhotosFragment", new String[0]);
        d.a = false;
        ag = new gzt(ah.b);
        al = new jbp(0L);
        am = new ehr(iyw.a(ai.d()), ekw.a);
        if (bundle == null)
        {
            h().a().a(co.c, new hae()).b();
        }
    }

    public final void a(PhotoTileView phototileview, ekp ekp)
    {
        ak.a(ekp, phototileview, t());
    }

    public final void a(eke eke)
    {
    }

    public final void a(gai gai1)
    {
        f.clear();
        for (int i = 0; i < gai1.a(); i++)
        {
            f.add(gai1.a(i));
        }

        ap = gai1.a();
        c.a(ag, gai1);
    }

    public final void a(Object obj)
    {
        boolean flag = false;
        obj = (List)obj;
        if (!((List) (obj)).isEmpty())
        {
            ((List) (obj)).add(0, al);
        }
        h.a(((List) (obj)));
        hzc hzc1 = d;
        if (!((List) (obj)).isEmpty())
        {
            flag = true;
        }
        hzc1.a = flag;
        aj.a();
        if (super.R != null)
        {
            if (h.a() == 0)
            {
                b.a(mxj.c);
            } else
            {
                b.a(mxj.b);
            }
            e.a();
        }
    }

    public final void a(rv rv1)
    {
    }

    public final void a(rv rv1, boolean flag)
    {
        rv1.b(true);
        rv1.c(b.BO);
    }

    public final void aj_()
    {
        an.b(am, this);
        super.aj_();
    }

    public final void au_()
    {
        super.au_();
        an.a(am, this);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ah = hbg.c(ad).a();
        h = new hgz(ad, true, new hbi(ad, new hbl[] {
            new hbm(ad, ah.b), new jbs(this, co.f, 0)
        }));
        g = (new jbh(this, af)).a(ae);
        g.a = true;
        ak = (gog)ae.a(gog);
        aj = (dha)ae.a(dha);
        ai = (mmr)ae.a(mmr);
        an = (gaj)ae.a(gaj);
        bundle = ae;
        bundle.a(hgz, h);
        bundle.a(hba, e);
        bundle.a(hbg, ah);
        bundle.a(frm, this);
        bundle.b(dhc, this);
        (new gpg(this, af, this, ak)).a(ae);
    }

    public final void s()
    {
    }

    public final gob t()
    {
        return gnw.v().a(iyw.a(ai.d())).c(true).d(true).k(false).p(true).m(true).l(true).n(true).o(true).j(true).i(true).h(true).q(true);
    }

    public final am u()
    {
        return h().a(co.c);
    }

}
