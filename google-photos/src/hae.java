// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.apps.photos.list.PhotoTileView;
import com.google.android.apps.photos.list.fastscroll.FastScrollRecyclerView;
import com.google.android.apps.photos.touchcapture.TouchCaptureView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.lucasr.twowayview.TwoWayLayoutManager;

public final class hae extends omp
    implements fpl, fqv, frn, mpg
{

    public FastScrollRecyclerView a;
    private hap ag;
    private aff ah;
    private haz ai;
    private hzh aj;
    private iwc ak;
    private hcd al;
    private hcb am;
    private han an;
    private fpj ao;
    private mwx ap;
    private aer aq;
    private boolean ar;
    private boolean as;
    private fts at;
    private ftw au;
    private hbx av;
    private hao aw;
    private final enh ax = new haf(this);
    private enk ay;
    private final List az = new ArrayList();
    hgz b;
    hqr c;
    private final ggh d;
    private final hzg e;
    private final iwt f = new hbr(this);
    private hyy g;
    private hbg h;

    public hae()
    {
        d = (new ggh(af)).a(ae);
        e = (new hzg(af)).a(ae);
        new mpe(af, this);
        new fpk(af, this);
    }

    static hgz a(hae hae1)
    {
        return hae1.b;
    }

    static boolean a(hae hae1, boolean flag)
    {
        hae1.as = true;
        return true;
    }

    static fts b(hae hae1)
    {
        return hae1.at;
    }

    static boolean c(hae hae1)
    {
        return hae1.ar;
    }

    static boolean d(hae hae1)
    {
        return hae1.as;
    }

    static hbg e(hae hae1)
    {
        return hae1.h;
    }

    static olm f(hae hae1)
    {
        return hae1.ae;
    }

    static FastScrollRecyclerView g(hae hae1)
    {
        return hae1.a;
    }

    static olm h(hae hae1)
    {
        return hae1.ae;
    }

    static olm i(hae hae1)
    {
        return hae1.ae;
    }

    static mwx j(hae hae1)
    {
        return hae1.ap;
    }

    static olm k(hae hae1)
    {
        return hae1.ae;
    }

    static han l(hae hae1)
    {
        return hae1.an;
    }

    static iwt m(hae hae1)
    {
        return hae1.f;
    }

    static int n(hae hae1)
    {
        hae1 = ((RecyclerView) (hae1.a)).e;
        if (hae1 instanceof adi)
        {
            return ((adi)hae1).c();
        }
        if (hae1 instanceof TwoWayLayoutManager)
        {
            return ((TwoWayLayoutManager)hae1).getFirstVisiblePosition();
        } else
        {
            hae1 = String.valueOf(hae1);
            throw new IllegalStateException((new StringBuilder(String.valueOf(hae1).length() + 42)).append("Cannot find position using layout manager ").append(hae1).toString());
        }
    }

    static fpj o(hae hae1)
    {
        return hae1.ao;
    }

    static List p(hae hae1)
    {
        return hae1.az;
    }

    private boolean t()
    {
        while (g.b() || !g.a(3)) 
        {
            return false;
        }
        return true;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = layoutinflater.inflate(b.vg, null);
        a = (FastScrollRecyclerView)bundle.findViewById(c.dQ);
        a.h = true;
        a.setClipChildren(h.e);
        if (!h.h)
        {
            a.a(new has());
        }
        if (ah != null)
        {
            a.f = ah;
        }
        if (c != null)
        {
            c.a(a);
        }
        for (layoutinflater = ae.c(hbu).iterator(); layoutinflater.hasNext(); a.b(new hbw(viewgroup)))
        {
            viewgroup = (hbu)layoutinflater.next();
        }

        for (layoutinflater = ae.c(ftx).iterator(); layoutinflater.hasNext(); a.b(new fty(viewgroup)))
        {
            viewgroup = (ftx)layoutinflater.next();
        }

        hal.a[ag.ordinal()];
        JVM INSTR tableswitch 1 4: default 252
    //                   1 263
    //                   2 448
    //                   3 537
    //                   4 605;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException("LayoutType must be set.");
_L2:
        a.a(new hah(this, ad));
        if (h.c)
        {
            a.a(new hgw(h.a()));
        }
        layoutinflater = a;
_L7:
        if (ai != null)
        {
            layoutinflater = ai.a();
            int j2 = layoutinflater.length;
            for (int i1 = 0; i1 < j2; i1++)
            {
                int l2 = layoutinflater[i1];
                ((RecyclerView) (a)).a.c().a(l2, ai.b(l2));
                if (l2 == c.dO)
                {
                    az.add((new hay(this, l2)).execute(new Integer[] {
                        Integer.valueOf((int)((float)ai.b(l2) * 0.75F))
                    }));
                }
            }

        }
        break; /* Loop/switch isn't completed */
_L3:
        int j1 = h.b;
        layoutinflater = new hai(this, ad, j1);
        viewgroup = b.e(j1);
        layoutinflater.a = viewgroup;
        a.a(layoutinflater);
        if (h.c)
        {
            a.a(new hgv(h.a(), j1, viewgroup));
        }
        layoutinflater = a;
        continue; /* Loop/switch isn't completed */
_L4:
        layoutinflater = new haj(this, new enj(ad, b, ax));
        int k1 = h.a();
        layoutinflater.b = k1;
        ((eni) (layoutinflater)).a.c = k1;
        a.a(layoutinflater);
        layoutinflater = a;
        continue; /* Loop/switch isn't completed */
_L5:
        layoutinflater = (eno)ae.a(eno);
        viewgroup = a;
        viewgroup.z = ((eno) (layoutinflater)).c;
        viewgroup.b(((eno) (layoutinflater)).d);
        viewgroup.b(((eno) (layoutinflater)).c);
        Object obj = new hak(this, ad, ay, layoutinflater);
        viewgroup = new hce(a);
        a.a(viewgroup);
        layoutinflater.b = new enr(a);
        layoutinflater.f = viewgroup;
        int l1 = h.a();
        obj.b = l1;
        ((enn) (obj)).a.f = l1;
        a.a(((aex) (obj)));
        obj = (enu)ae.a(enu);
        av = new hbx(ad, af, a, b, viewgroup, layoutinflater, ((enu) (obj)));
        layoutinflater = new agd(av);
        viewgroup = a;
        if (((agd) (layoutinflater)).n != viewgroup)
        {
            if (((agd) (layoutinflater)).n != null)
            {
                Object obj1 = ((agd) (layoutinflater)).n;
                if (((RecyclerView) (obj1)).e != null)
                {
                    ((RecyclerView) (obj1)).e.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
                }
                ((RecyclerView) (obj1)).g.remove(layoutinflater);
                if (((RecyclerView) (obj1)).g.isEmpty())
                {
                    int i2;
                    boolean flag;
                    if (mk.a(((View) (obj1))) == 2)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    ((RecyclerView) (obj1)).setWillNotDraw(flag);
                }
                ((RecyclerView) (obj1)).j();
                ((RecyclerView) (obj1)).requestLayout();
                ((agd) (layoutinflater)).n.b(((agd) (layoutinflater)).t);
                obj1 = ((agd) (layoutinflater)).n;
                if (((RecyclerView) (obj1)).k != null)
                {
                    ((RecyclerView) (obj1)).k.remove(layoutinflater);
                }
                for (i2 = ((agd) (layoutinflater)).l.size() - 1; i2 >= 0; i2--)
                {
                    obj1 = (agn)((agd) (layoutinflater)).l.get(0);
                    ((agd) (layoutinflater)).j.b(((agd) (layoutinflater)).n, ((agn) (obj1)).e);
                }

                ((agd) (layoutinflater)).l.clear();
                layoutinflater.q = null;
                layoutinflater.r = -1;
                layoutinflater.a();
            }
            layoutinflater.n = viewgroup;
            if (((agd) (layoutinflater)).n != null)
            {
                layoutinflater.m = ViewConfiguration.get(((agd) (layoutinflater)).n.getContext()).getScaledTouchSlop();
                ((agd) (layoutinflater)).n.a(layoutinflater);
                ((agd) (layoutinflater)).n.a(((agd) (layoutinflater)).t);
                viewgroup = ((agd) (layoutinflater)).n;
                if (((RecyclerView) (viewgroup)).k == null)
                {
                    viewgroup.k = new ArrayList();
                }
                ((RecyclerView) (viewgroup)).k.add(layoutinflater);
                if (((agd) (layoutinflater)).s == null)
                {
                    layoutinflater.s = new kp(((agd) (layoutinflater)).n.getContext(), new agm(layoutinflater));
                }
            }
        }
        layoutinflater = a;
        if (true) goto _L7; else goto _L6
_L6:
        al = new hcd(f, e, aj, mk.h(a));
        am = new hcb(a, al);
        al.a(am);
        if (au != null)
        {
            viewgroup = (flj)ae.b(flj);
            layoutinflater = viewgroup;
            if (viewgroup == null)
            {
                layoutinflater = flj.b;
            }
            int k2 = h.b;
            byte byte0;
            if (layoutinflater == flj.b)
            {
                byte0 = 6;
            } else
            {
                byte0 = 2;
            }
            layoutinflater = new ftv((amh)ae.a(amh), (fli)ae.a(fli), au);
            at = new fts(k2 * byte0, new ham(b), layoutinflater);
            a.b(new hbw(new hag(this)));
        }
        return bundle;
    }

    public final void a(int i1, int j1)
    {
        Object obj = ((RecyclerView) (a)).e;
        if (obj instanceof adi)
        {
            ((adi)obj).a(i1, j1);
            return;
        }
        if (obj instanceof TwoWayLayoutManager)
        {
            ((TwoWayLayoutManager)obj).scrollToPositionWithOffset(i1, j1);
            return;
        } else
        {
            obj = String.valueOf(obj);
            throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 47)).append("Cannot scroll to position using layout manager ").append(((String) (obj))).toString());
        }
    }

    public final void a(aer aer)
    {
        if (aer != null)
        {
            if (aq == null)
            {
                aq = ((RecyclerView) (a)).q;
            }
            a.a(aer);
        } else
        if (aq != null)
        {
            a.a(aq);
            aq = null;
            return;
        }
    }

    public final void a(fpj fpj1, Rect rect)
    {
        a.setPadding(0, rect.top, 0, rect.bottom);
    }

    public final void a(boolean flag)
    {
        ar = flag;
        if (!ar && as)
        {
            as = false;
            a.requestLayout();
        }
    }

    public final boolean a(long l1)
    {
        hzd hzd1;
        Object obj;
        if (aw == null)
        {
            return false;
        }
        obj = aw.a(l1);
        hzd1 = e.b;
        List list = (List)hzd1.f.a(obj);
        if (list == null)
        {
            hzd1.a(((ehr) (obj)));
            return false;
        }
        if (hzd1.e.contains(obj))
        {
            hzd1.a(((ehr) (obj)));
        }
        obj = list.iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        ekp ekp1 = (ekp)((Iterator) (obj)).next();
        if (hzd1.h.a(ekp1)) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L6:
        return flag;
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean a(PhotoTileView phototileview)
    {
label0:
        {
            boolean flag2 = false;
            boolean flag1 = flag2;
            if (phototileview == null)
            {
                break label0;
            }
            if (av != null)
            {
                eno eno1 = av.a;
                boolean flag;
                if (eno1.a.b && !eno1.d.a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag1 = flag2;
                if (flag)
                {
                    break label0;
                }
            }
            flag1 = flag2;
            if (phototileview.k)
            {
                flag1 = flag2;
                if (g.e)
                {
                    flag1 = t();
                    al.a(phototileview.m);
                    e.b(phototileview.m);
                }
            }
        }
        return flag1;
    }

    public final boolean a(boolean flag, long l1)
    {
        if (aw == null)
        {
            return false;
        }
        ehr ehr1 = aw.a(l1);
        if (flag)
        {
            e.a(ehr1);
        } else
        {
            hzd hzd1 = e.b;
            hzd1.g.b(hzd.a);
            hzd1.g.b(hzd.b);
            hzd1.g.a(new ele(ehr1.a, ehr1.b, ekk.a, hzd.b));
        }
        return t();
    }

    public final void ak_()
    {
        for (int i1 = 0; i1 < az.size(); i1++)
        {
            ((AsyncTask)az.get(i1)).cancel(true);
        }

        az.clear();
        super.ak_();
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        bundle = ae;
        bundle.a(frn, this);
        bundle.a(fqv, this);
        bundle.a(hyo, new hat(this));
        bundle.a(iwt, f);
        g = (hyy)ae.a(hyy);
        bundle = (hba)ae.a(hba);
        bundle.b = this;
        for (Iterator iterator = ((hba) (bundle)).a.iterator(); iterator.hasNext(); ((hbf)iterator.next()).a(this)) { }
        ((hba) (bundle)).a.clear();
        h = (hbg)ae.a(hbg);
        ag = h.a;
        ah = (aff)ae.b(aff);
        b = (hgz)ae.a(hgz);
        ai = (haz)ae.b(haz);
        ak = (iwc)ae.b(iwc);
        aj = (hzh)ae.a(hzh);
        c = (hqr)ae.b(hqr);
        an = (han)ae.b(han);
        ao = (fpj)ae.b(fpj);
        ap = (mwx)ae.a(mwx);
        au = (ftw)ae.b(ftw);
        aw = (hao)ae.b(hao);
        if (h.g)
        {
            new gzo(af, c.dQ);
        }
        if (ag == hap.d)
        {
            ay = new enk(ad, b, ax);
            ae.a(fso, ay);
        }
    }

    public final void l()
    {
        super.l();
        if (ak != null)
        {
            ak.a().a(al);
            if (av != null)
            {
                ak.a().a(av);
            }
        }
    }

    public final void m()
    {
        super.m();
        am.c();
        if (ak != null)
        {
            ak.a().b(al);
            if (av != null)
            {
                ak.a().b(av);
            }
        }
        if (at != null)
        {
            at.a();
        }
    }

    public final aex r()
    {
        return ((RecyclerView) (a)).e;
    }

    public final boolean s()
    {
        if (g.c)
        {
            O_().onBackPressed();
            return true;
        } else
        {
            return false;
        }
    }
}
