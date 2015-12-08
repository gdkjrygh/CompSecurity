// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class gwu extends omp
    implements emr, fpl, grc, mus
{

    private static final long d;
    private static final ekk e = (new ekm()).a(hpg).b(feu).b(ilc).b(hkh).a();
    public gxi a;
    private long aA;
    private boolean aB;
    private gse aC;
    private dgk aD;
    private dgz aE;
    private final gxq aF;
    private gyl aG;
    private egp aH;
    private jem aI;
    private final nug aJ = new gxa(this);
    private jev ag;
    private gzf ah;
    private gxx ai;
    private gxg aj;
    private jfz ak;
    private grk al;
    private dha am;
    private noz an;
    private noz ao;
    private final gzl ap;
    private final emo aq;
    private gqw ar;
    private final gqz as;
    private final gxd at;
    private final gxf au;
    private final gxh av;
    private mmr aw;
    private View ax;
    private View ay;
    private View az;
    public grn b;
    public boolean c;
    private final mwx f;
    private final gpu g;
    private List h;

    public gwu()
    {
        f = new mwx(af);
        g = new gpu(af);
        h = new ArrayList();
        ap = new gzl(af);
        aq = new emo(this, af, b.ut, this);
        Object obj = new gqz(this, af);
        ae.a(gqz, obj);
        as = ((gqz) (obj));
        at = new gxd(this, af);
        au = new gxf(this, af);
        obj = new gxh();
        ae.a(jes, obj);
        av = ((gxh) (obj));
        obj = new gxq(af);
        ae.a(gzb, obj);
        aF = ((gxq) (obj));
        obj = new gxc(this);
        ae.a(mso, obj);
        new gpq(af, gxi.a, new gwv(this));
        new gpq(af, gye.b, new gww(this));
        new gpq(af, gye.a, new gwx(this));
        new gpq(af, gye.d, new gwy(this));
        new ghb(af, new gwz(this), (short)0);
        obj = new fex(this);
        new nuu(af, ((nus) (obj)));
        (new dhg(this, af, ((dhf) (obj)), b.uw, pwr.g)).a(ae);
        (new dhg(this, af, new jef(), b.uy, pwr.l)).a(ae);
        (new dhg(this, af, new imh(), b.ux, pwr.h)).a(ae);
        new fpk(af, this);
    }

    private am a(bp bp1, Bundle bundle, int i1, Class class1)
    {
        am am1;
        try
        {
            am1 = (am)class1.newInstance();
            am1.f(bundle);
        }
        // Misplaced declaration of an exception variable
        catch (bp bp1)
        {
            if (an.a())
            {
                bundle = String.valueOf(class1);
                (new StringBuilder(String.valueOf(bundle).length() + 31)).append("Couldn't instantiate fragment: ").append(bundle);
            }
            throw new RuntimeException(bp1);
        }
        // Misplaced declaration of an exception variable
        catch (bp bp1)
        {
            if (an.a())
            {
                bundle = String.valueOf(class1);
                (new StringBuilder(String.valueOf(bundle).length() + 31)).append("Couldn't instantiate fragment: ").append(bundle);
            }
            throw new RuntimeException(bp1);
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        bp1.a(i1, am1, class1.getName());
        return am1;
        bp1.a(am1, class1.getName());
        return am1;
    }

    private am a(Class class1)
    {
        return h().a(class1.getName());
    }

    static gqw a(gwu gwu1)
    {
        return gwu1.ar;
    }

    public static gwu a(ekp ekp1, int i1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.photos.core.media", ekp1);
        bundle.putInt("position", i1);
        ekp1 = new gwu();
        ekp1.f(bundle);
        return ekp1;
    }

    private boolean a(am am1, Class class1)
    {
        return am1 == null && a(class1) == null;
    }

    static boolean a(gwu gwu1, boolean flag)
    {
        gwu1.aB = true;
        return true;
    }

    private am b(bp bp1, Bundle bundle, int i1, Class class1)
    {
        return a(bp1, bundle, i1, class1);
    }

    static gqz b(gwu gwu1)
    {
        return gwu1.as;
    }

    static void b(gwu gwu1, boolean flag)
    {
        if (gwu1.b.b.c() == euv.c)
        {
            if (!flag && ((am) (gwu1.aI)).J)
            {
                gwu1.h().a().e(gwu1.aI).b();
            } else
            if (flag && !((am) (gwu1.aI)).J)
            {
                gwu1.h().a().d(gwu1.aI).b();
                return;
            }
        }
    }

    static olm c(gwu gwu1)
    {
        return gwu1.ae;
    }

    static olm d(gwu gwu1)
    {
        return gwu1.ae;
    }

    static grn e(gwu gwu1)
    {
        return gwu1.b;
    }

    static mmr f(gwu gwu1)
    {
        return gwu1.aw;
    }

    static olq g(gwu gwu1)
    {
        return gwu1.ad;
    }

    static long h(gwu gwu1)
    {
        return gwu1.aA;
    }

    static void i(gwu gwu1)
    {
        gwu1.s();
    }

    static dha j(gwu gwu1)
    {
        return gwu1.am;
    }

    static olq k(gwu gwu1)
    {
        return gwu1.ad;
    }

    static List l(gwu gwu1)
    {
        return gwu1.h;
    }

    static gxd m(gwu gwu1)
    {
        return gwu1.at;
    }

    static gxf n(gwu gwu1)
    {
        return gwu1.au;
    }

    static grk o(gwu gwu1)
    {
        return gwu1.al;
    }

    static olm p(gwu gwu1)
    {
        return gwu1.ae;
    }

    static olm q(gwu gwu1)
    {
        return gwu1.ae;
    }

    static olm r(gwu gwu1)
    {
        return gwu1.ae;
    }

    static olm s(gwu gwu1)
    {
        return gwu1.ae;
    }

    private void u()
    {
        bp bp1 = h().a();
        Object obj = new ArrayList();
        Object obj1 = new ArrayList();
        Bundle bundle = super.q;
        ekp ekp1 = b.b;
        if (aj.c)
        {
            gxq gxq1;
            gxi gxi1;
            if (a(a, gxi))
            {
                a = new gxi();
                a.f(bundle);
                bp1.b(b.uA, a, gxi.getName());
                ((List) (obj1)).add(a);
            } else
            {
                a = (gxi)a(gxi);
            }
            gxq1 = aF;
            gxi1 = a;
            gxq1.b = gxi1;
            if (gxi1.b != null)
            {
                gxq1.a.b();
            } else
            {
                gxi1.d.a(gxq1, false);
            }
        }
        if (!aj.i)
        {
            if (ekp1.c() == euv.c)
            {
                if (a(ag, jev))
                {
                    ag = (jev)b(bp1, bundle, b.uE, jev);
                    ((List) (obj1)).add(ag);
                    aI = (jem)a(bp1, bundle, b.uD, jem);
                } else
                {
                    ag = (jev)a(jev);
                    aI = (jem)a(jem);
                }
                av.a(ag);
            } else
            if (a(ah, gzf))
            {
                ah = (gzf)b(bp1, bundle, b.uC, gzf);
                ((List) (obj1)).add(ah);
            } else
            {
                ah = (gzf)a(gzf);
            }
            if (aj.a && a(aG, gyl))
            {
                aG = (gyl)a(bp1, bundle, 0, gyl);
            }
            if (aj.h)
            {
                if (a(ai, gxx))
                {
                    ai = (gxx)b(bp1, bundle, 0, gxx);
                    ((List) (obj1)).add(ai);
                } else
                {
                    ai = (gxx)a(gxx);
                }
            }
        }
        ((List) (obj)).addAll(((java.util.Collection) (obj1)));
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ap.a(((gzk) (obj1)).t()))
        {
            obj1 = (gzk)((Iterator) (obj)).next();
        }

        bp1.b();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.uF, null);
        if (layoutinflater == null)
        {
            throw new IllegalArgumentException("Couldn't inflate view.");
        }
        ax = layoutinflater.findViewById(b.uu);
        ay = layoutinflater.findViewById(b.us);
        az = layoutinflater.findViewById(b.uq);
        ap.a(e);
        viewgroup = (ekk)ae.b(ekk);
        if (viewgroup != null)
        {
            ap.a(viewgroup);
        }
        u();
        aq.a(b.b, ap.a);
        aE = new dgz(az);
        return layoutinflater;
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        if (aC != null)
        {
            aC.a(super.q.getInt("position"), this);
        }
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        s();
        aA = AnimationUtils.currentAnimationTimeMillis();
        f.a(new gxb(this), d);
    }

    public final void a(fpj fpj, Rect rect)
    {
        az.setPadding(0, 0, 0, rect.bottom);
    }

    public final void aj_()
    {
        super.aj_();
        aD.b(aE);
        aH.a().a(aJ);
    }

    public final void au_()
    {
        super.au_();
        aD.a(aE);
        aH.a().a(aJ, true);
    }

    public final void b(elb elb1)
    {
        try
        {
            grn grn1 = b;
            grn1.b = (ekp)((List)elb1.a()).get(0);
            grn1.a.b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1)
        {
            return;
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        an = noz.a(ad, "PhotoFragment", new String[0]);
        ao = noz.a(ad, 5, "PhotoFragment", new String[0]);
        ekp ekp1 = (ekp)super.q.getParcelable("com.google.android.apps.photos.core.media");
        am = (dha)ae.a(dha);
        aj = (gxg)ae.a(gxg);
        if (aj.e)
        {
            (new dhg(this, af, new jax(), b.uv, pwr.f)).a(ae);
        }
        aw = (mmr)ae.a(mmr);
        as.a(this);
        ar = (gqw)ae.a(gqw);
        ae.a(gxr, new gxe(this));
        ae.a(gpu, g);
        g.a(gye.b, aj.t);
        g.a(gye.a, aj.s);
        g.a(gye.d, aj.g);
        Object obj = g;
        gpr gpr = gye.c;
        boolean flag;
        if (aj.h && ekp1.b(gtg) != null && ((gtg)ekp1.b(gtg)).j())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((gpu) (obj)).a(gpr, flag);
        b = new grn(ekp1, f);
        al = new grk();
        obj = ae;
        ((olm) (obj)).a(grn, b);
        ((olm) (obj)).a(grl, new grl());
        ((olm) (obj)).a(grk, al);
        if (euv.c.equals(ekp1.c()))
        {
            jgc jgc1 = new jgc();
            ae.a(jgc, jgc1);
            if (bundle != null)
            {
                ak = new jfz((jga)bundle.getParcelable("slomo_transition_data"));
            } else
            {
                ak = new jfz();
            }
            ak.d = aj.o;
            ae.a(jfz, ak);
        }
        if (aj.p)
        {
            (new dhg(this, af, new fhw(), b.uB, pwz.g)).a(ae);
        }
        if (aj.k)
        {
            (new dhg(this, af, new hku(), b.uz, pwr.p)).a(ae);
        }
        aC = (gse)ae.b(gse);
        if (aC != null)
        {
            aC.a(super.q.getInt("position"), this);
        }
        aD = (dgk)ae.a(dgk);
        aH = (egp)ae.a(egp);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("loader_delay_exceeded", aB);
        if (ak != null)
        {
            bundle.putParcelable("slomo_transition_data", ak.b);
        }
    }

    public final void n()
    {
        as.b(this);
        super.n();
    }

    public final boolean r()
    {
        for (Iterator iterator = h.iterator(); iterator.hasNext(); iterator.next()) { }
        return false;
    }

    public void s()
    {
        boolean flag = false;
        if (super.R == null)
        {
            return;
        }
        int i1;
        if (a == null)
        {
            i1 = gxn.d;
        } else
        {
            i1 = a.e;
        }
        if (b.b.c() != euv.c)
        {
            View view = ax;
            int j1;
            if (c && (i1 == gxn.a || i1 == gxn.b && aB))
            {
                j1 = 0;
            } else
            {
                j1 = 8;
            }
            view.setVisibility(j1);
        }
        view = ay;
        if (i1 == gxn.c)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
    }

    public final void s_()
    {
        super.s_();
        if (aC != null)
        {
            gse gse1 = aC;
            int i1 = super.q.getInt("position");
            gse1.a.remove(i1);
        }
    }

    public final List t()
    {
        ArrayList arraylist = new ArrayList();
        if (super.R != null)
        {
            View view = super.R.findViewById(b.ur);
            if (view != null)
            {
                arraylist.add(view);
            }
        }
        return arraylist;
    }

    static 
    {
        d = TimeUnit.SECONDS.toMillis(2L);
    }
}
