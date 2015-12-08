// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.photos.list.PhotoTileView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class fmo extends omp
    implements frm, gmm, gph, hhk, jia, mso, nwn
{

    static final ekk a = (new ekm()).a(fml).a();
    private mmr ag;
    private hgz ah;
    private mxg ai;
    private exj aj;
    private gmk ak;
    private gml al;
    private gml am;
    private boolean an;
    private ekw ao;
    private hbg ap;
    private fnh aq;
    private gll ar;
    private gog as;
    private fnj at;
    private eyz au;
    private ekq av;
    private ehr aw;
    private fna ax;
    private final exk b = new fmp(this);
    private final hao c = new fmq(this);
    private final fqi d = new fqi();
    private final hzg e;
    private final hba f = new hba();
    private final gmn g;
    private final hhi h;

    public fmo()
    {
        e = (new hzg(af)).a(ae);
        g = new gmn(af, new fmr(this));
        Object obj = new hhj(af);
        obj.a = this;
        h = ((hhj) (obj)).a();
        (new dhg(this, af, new hzc(), u.j, pwr.v)).a(ae);
        (new hqr()).a(ae);
        (new hrd(af)).a(ae);
        (new hbs(af)).a(ae);
        obj = new fnd(af);
        ae.a(epv, obj);
    }

    static eyz a(fmo fmo1)
    {
        return fmo1.au;
    }

    private void a(View view)
    {
        if (view == null)
        {
            return;
        }
        boolean flag;
        if (ah == null || ah.a() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (!an || !h.b || !gcp.a(h.a) && ag.e())
            {
                ai.a(mxj.a);
                return;
            } else
            {
                ai.a(mxj.c);
                return;
            }
        } else
        {
            ai.a(mxj.b);
            return;
        }
    }

    static ekq b(fmo fmo1)
    {
        return fmo1.av;
    }

    static ehr c(fmo fmo1)
    {
        return fmo1.aw;
    }

    static hzg d(fmo fmo1)
    {
        return fmo1.e;
    }

    static olq e(fmo fmo1)
    {
        return fmo1.ad;
    }

    static olm f(fmo fmo1)
    {
        return fmo1.ae;
    }

    static gml g(fmo fmo1)
    {
        return fmo1.al;
    }

    static gmk h(fmo fmo1)
    {
        return fmo1.ak;
    }

    static gll i(fmo fmo1)
    {
        return fmo1.ar;
    }

    static gml j(fmo fmo1)
    {
        return fmo1.am;
    }

    static exj k(fmo fmo1)
    {
        return fmo1.aj;
    }

    static fnj l(fmo fmo1)
    {
        return fmo1.at;
    }

    static fnh m(fmo fmo1)
    {
        return fmo1.aq;
    }

    public static fmx v()
    {
        return new fmx();
    }

    private hap w()
    {
        if (super.q.containsKey("layout_type"))
        {
            return (hap)super.q.getSerializable("layout_type");
        } else
        {
            return hap.b;
        }
    }

    private flj x()
    {
        if (w() == hap.c)
        {
            return flj.a;
        } else
        {
            return flj.b;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(b.pG, null);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        al = new gmq(ar, aw, g, ((gkt) (ar)).a.a * 4, 4);
        am = aj.a(aw.a, aw.b, al, ap.b, b);
        gml gml = am;
        if (ax != null)
        {
            gml = ax.a(ah, am);
        }
        ak = new gmk(gml, this);
        g.a(aw, ar, ak, al);
        ah.a(ak);
        if (bundle == null)
        {
            h().a().a(u.k, new hae()).b();
        }
    }

    public final void a(PhotoTileView phototileview, ekp ekp)
    {
        as.a(ekp, phototileview, t());
    }

    public final void ac_()
    {
        dtf dtf1;
label0:
        {
            an = true;
            a(super.R);
            dtf1 = (dtf)ae.b(dtf);
            if (dtf1 != null)
            {
                if (!dtf1.a.e())
                {
                    break label0;
                }
                dtf1.b.a(dtf1.a.g().b("account_name"));
            }
            return;
        }
        dtf1.b.a("logged_out");
    }

    public final void ad_()
    {
        a(super.R);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ag = (mmr)ae.a(mmr);
        ai = (mxg)ae.a(mxg);
        aq = (fnh)ae.a(fnh);
        ar = (gll)ae.a(gll);
        as = (gog)ae.b(gog);
        ax = (fna)ae.b(fna);
        ao = (ekw)super.q.getParcelable("com.google.android.apps.photos.core.query_options");
        av = (ekq)super.q.getParcelable("com.google.android.apps.photos.core.media_collection");
        aw = new ehr(av, ao);
        int j1 = super.q.getInt("grid_portrait_column_count");
        bundle = w();
        Object obj = hbg.c(ad);
        Object obj1;
        olm olm1;
        int i1;
        boolean flag;
        if (j1 == -1)
        {
            i1 = j1;
        } else
        {
            i1 = hbg.a(ad, j1);
        }
        obj.c = i1;
        obj.b = bundle;
        obj.i = false;
        obj.h = true;
        ap = ((hbh) (obj)).a();
        obj = x();
        obj1 = ad;
        i1 = ap.b;
        if (bundle != hap.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = new hbm(((android.content.Context) (obj1)), i1, ((flj) (obj)), flag);
        obj1 = new ArrayList();
        if (ax != null)
        {
            ((List) (obj1)).addAll(ax.r());
        }
        ((List) (obj1)).addAll(Arrays.asList(new hbl[] {
            obj, new hbj(ad), new fms(this, u.m, 0, j1)
        }));
        obj = new hbi(ad, ((List) (obj1)));
        ah = new hgz(ad, false, ((hhg) (obj)));
        obj1 = new fmy(this);
        at = (fnj)super.q.getSerializable("view_type");
        au = (eyz)super.q.getSerializable("date_header_type");
        aj = new exj(af, au, new fmt(this));
        olm1 = ae;
        olm1.a("com.google.android.apps.photos.recycleradapter.LABEL_KEY", at.toString());
        olm1.a(flj, x());
        olm1.a(frm, this);
        olm1.a(hgz, ah);
        olm1.a(hba, f);
        olm1.a(hbg, ap);
        olm1.a(fqi, d);
        olm1.a(haz, obj);
        olm1.b(hbu, obj1);
        olm1.b(ftd, obj1);
        olm1.a(mso, this);
        olm1.a(gph, this);
        olm1.a(hao, c);
        olm1.a(ejz, new eko(av));
        olm1.a(ekq, av);
        olm1.a(han, new fmv(this));
        olm1.a(haq, new fmu(this));
        if (bundle != hap.c)
        {
            if (ax != null)
            {
                bundle = ax;
            } else
            {
                bundle = new fmz(this);
            }
            ae.a(fsq, new gzw(ah, d, new haa(((had) (obj)), ap.b), ((had) (obj)), bundle, u.l));
        }
        if (super.q.getBoolean("handle_scale_transitions", false))
        {
            (new gpg(this, af, this, as)).a(ae);
        }
    }

    public final void l()
    {
        super.l();
        f.a();
    }

    public final msm r()
    {
        switch (fmw.a[at.ordinal()])
        {
        default:
            String s1 = String.valueOf(at);
            throw new IllegalStateException((new StringBuilder(String.valueOf(s1).length() + 21)).append("Unexpected viewType: ").append(s1).toString());

        case 1: // '\001'
            return new msm(pwt.c);

        case 2: // '\002'
            return new msm(pwt.d);

        case 3: // '\003'
            return new msm(pwt.b);
        }
    }

    public final jhz s()
    {
        return new haw((hae)h().a(u.k));
    }

    public final gob t()
    {
        return gnw.v().a(av).a(ao).a(true).b(true);
    }

    public final am u()
    {
        return h().a(u.k);
    }

}
