// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.photos.pager.ClippingImageView;
import com.google.android.apps.photos.pager.viewpager.PhotoViewPager;
import com.google.android.apps.photos.slideshow.SlideshowService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class gnw extends omp
    implements dhc, dsw, fpl, gak, gqe, grc, gsg, np, nug, nwn
{

    public static final ekk a = (new ekm()).b(gax).b(gtg).b(eev).b(jgi).b(gfn).b(elt).b(gej).b(eft).b(gsc).a();
    private static final onh e = new onh("debug.photos.media_info");
    private boolean aA;
    private boolean aB;
    private mmr aC;
    private dfo aD;
    private gxg aE;
    private nwm aF;
    private gqw aG;
    private gog aH;
    private gaj aI;
    private ehr aJ;
    private noz aK;
    private mwx aL;
    private View aM;
    private fuc aN;
    private egp aO;
    private final BroadcastReceiver aP = new gnx(this);
    private final gmu aQ = new gny(this);
    private final grq ag = new grq();
    private final grt ah = new grt();
    private final imd ai = new goe(this);
    private final enw aj = new enw(this);
    private final gsh ak;
    private final gse al;
    private final grg am;
    private final jdq an = new jdq();
    private final gnv ao = null;
    private final iwa ap;
    private final goo aq;
    private final gmx ar;
    private gqp as;
    private PhotoViewPager at;
    private View au;
    private gqb av;
    private fts aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    final jhj b;
    Toolbar c;
    View d;
    private final ggh f;
    private final glw g;
    private final gnf h;

    public gnw()
    {
        f = (new ggh(af)).a(ae);
        g = new glw(this, af);
        h = new gnf(this, af);
        Object obj = new gsh(af);
        ae.a(gpx, obj);
        ak = ((gsh) (obj));
        obj = new gse(af);
        ae.a(gse, obj);
        al = ((gse) (obj));
        obj = new grg(af);
        ae.a(grg, obj);
        am = ((grg) (obj));
        b = (new jhj(af)).a(ae);
        ap = new iwa(af);
        obj = new goo(this, af, af.G);
        olm olm1 = ae;
        olm1.a(goo, obj);
        olm1.b(gyw, obj);
        aq = ((goo) (obj));
        ar = new gmx(this, af, af.p);
        obj = new grd(am);
        ae.a(ekb, obj);
        new ixr(this, af, af.J);
        (new msi(pwt.z)).a(ae);
        if (ao != null)
        {
            new ong(af, ao);
        }
        (new dhg(this, af, new ime(ai), af.C, pwr.z)).a(ae);
        obj = new grr(af);
        ae.a(grr, obj);
        new gqf(this, af);
        new gru(this, af);
        obj = new gqk(this, af);
        ae.a(gqk, obj);
        new gqi(this, af);
        new grx(af, af.L);
        new gyi(this, af, af.E);
        obj = new gpp(this, af.M);
        ae.a(gpp, obj);
        (new fpj(af, (byte)0)).a(ae);
        new fpk(af, this);
        (new dhj(this, Integer.valueOf(b.sS), af.M)).a(ae);
        (new dhg(this, af, new gpo(af), 0x102002c, null)).a(ae);
        (new gqz(this, af)).a(this);
        obj = new gnj(af);
        ae.a(gyh, obj);
        az = true;
    }

    static olm a(gnw gnw1)
    {
        return gnw1.ae;
    }

    private static void a(int i1, View view)
    {
        boolean flag = false;
        p.a(view);
        View view1 = view.findViewById(af.q);
        int j1;
        if (i1 == goc.a)
        {
            j1 = 0;
        } else
        {
            j1 = 8;
        }
        view1.setVisibility(j1);
        view = view.findViewById(af.r);
        if (i1 == goc.b)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
    }

    static void a(gnw gnw1, boolean flag)
    {
        gnw1.b(flag);
    }

    private boolean a(ehr ehr1)
    {
        return ((gll)ae.a(gll)).c(ehr1);
    }

    static gqw b(gnw gnw1)
    {
        return gnw1.aG;
    }

    private void b(am am1)
    {
        if (b.b != am1)
        {
            String s1 = (String)aD.b(au, am.h, false);
            aD.a(s1, au);
        }
        b.a(am1);
        Object obj1 = ag;
        Object obj = new HashSet();
        for (obj1 = ((grq) (obj1)).a.iterator(); ((Iterator) (obj1)).hasNext();)
        {
            grp grp1 = (grp)((Iterator) (obj1)).next();
            if (grp1.d())
            {
                grp1.a(am1);
            } else
            {
                ((Set) (obj)).add(grp1);
            }
        }

        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((grp)((Iterator) (obj)).next()).a(am1)) { }
        aF.c();
    }

    private void b(boolean flag)
    {
        aA = flag;
        w();
    }

    static boolean b(gnw gnw1, boolean flag)
    {
        gnw1.aB = flag;
        return flag;
    }

    static PhotoViewPager c(gnw gnw1)
    {
        return gnw1.at;
    }

    static void c(gnw gnw1, boolean flag)
    {
        if (gnw1.aG.a() != flag)
        {
            Object obj = gnw1.O_();
            if (obj instanceof rz)
            {
                obj = ((rz)obj).e().a();
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                if (flag)
                {
                    ((rv) (obj)).e();
                    obj = gnw1.g().getString(b.sT);
                    gnw1.aD.a(((String) (obj)), ((am) (gnw1)).R);
                } else
                {
                    ((rv) (obj)).d();
                }
            }
            gnw1.aG.b(flag);
        }
    }

    static void d(gnw gnw1)
    {
        gnw1.w();
    }

    static grg e(gnw gnw1)
    {
        return gnw1.am;
    }

    static gqb f(gnw gnw1)
    {
        return gnw1.av;
    }

    static boolean g(gnw gnw1)
    {
        return gnw1.az;
    }

    static boolean h(gnw gnw1)
    {
        return gnw1.aA;
    }

    static olm i(gnw gnw1)
    {
        return gnw1.ae;
    }

    static olq j(gnw gnw1)
    {
        return gnw1.ad;
    }

    static olq k(gnw gnw1)
    {
        return gnw1.ad;
    }

    public static gob v()
    {
        return new gob();
    }

    private void w()
    {
        boolean flag1 = true;
        if (as != null)
        {
            Object obj = as;
            gqn gqn1;
            boolean flag;
            if (!aA)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = ((gqp) (obj)).a;
            if (((gql) (obj)).b.f == flag)
            {
                flag1 = false;
            }
            gqn1 = ((gql) (obj)).b();
            gqn1.f = flag;
            obj.b = gqn1.a();
            ((gql) (obj)).c(flag1);
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        boolean flag = true;
        boolean flag1 = true;
        au = layoutinflater.cloneInContext(new ContextThemeWrapper(ad, b.sV)).inflate(b.sP, null);
        if (bundle != null)
        {
            aG.b(bundle.getBoolean("full_screen"));
            ax = bundle.getBoolean("collection_refreshed");
            ay = bundle.getBoolean("loaded_not_empty");
            b(bundle.getBoolean("slideshow_enabled"));
            aB = bundle.getBoolean("local_slideshow");
        } else
        {
            aG.b(false);
        }
        w();
        at = (PhotoViewPager)au.findViewById(af.H);
        at.u = this;
        aN = (new fuc()).a(this).a(ah).a(al).a(g).a(ap.a).a(at, ae.c(fua));
        at.a(aN);
        if (a(aJ))
        {
            layoutinflater = g;
            viewgroup = aJ;
            if (!((glw) (layoutinflater)).d)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag, "Cannot attach an adapter after onStart");
            if (((glw) (layoutinflater)).c == null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            p.a(flag, "Cannot initialize the mixin twice");
            p.a(((glw) (layoutinflater)).b);
            layoutinflater.e = (ehr)p.a(viewgroup);
            layoutinflater.c = new gqb(((glw) (layoutinflater)).a.h(), new glx(layoutinflater, viewgroup));
            av = ((glw) (layoutinflater)).c;
        } else
        {
            layoutinflater = h;
            viewgroup = aJ;
            if (((gnf) (layoutinflater)).d != null)
            {
                flag = false;
            }
            p.b(flag, "Cannot initialize the mixin twice.");
            layoutinflater.c = (ehr)p.a(viewgroup);
            layoutinflater.d = new gqb(((gnf) (layoutinflater)).a.h(), new gng(layoutinflater, viewgroup));
            if (((gnf) (layoutinflater)).e)
            {
                ((gnf) (layoutinflater)).b.a(viewgroup, layoutinflater);
            }
            av = ((gnf) (layoutinflater)).d;
            a(goc.a, au);
        }
        av.b = this;
        at.a(av);
        aw = new fts(2, new god(av), new ftv((amh)ae.a(amh), (fli)ae.a(fli), new goa()));
        if (aE.n)
        {
            layoutinflater = ak;
            viewgroup = am.f.a;
            bundle = new eml(this, af, af.K, ak);
            layoutinflater.c = false;
            ((gsh) (layoutinflater)).b.b();
            bundle.a(viewgroup, gsh.a);
        }
        if (aE.b)
        {
            enw.a(am.f.a, new eml(this, af, af.I, aj));
        }
        c = (Toolbar)au.findViewById(af.M);
        d = au.findViewById(af.E);
        aM = au.findViewById(af.F);
        return au;
    }

    public final void a(float f1)
    {
        if (super.R == null)
        {
            return;
        }
        byte byte0;
        if (f1 != 1.0F)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        if (c.getLayerType() != byte0)
        {
            c.setLayerType(byte0, null);
            d.setLayerType(byte0, null);
        }
        c.setAlpha(f1);
        d.setAlpha(f1);
    }

    public final void a(int i1, float f1, int j1)
    {
        aw.onScroll(null, Math.max(0, i1 - 1), 3, -1);
    }

    public final void a(am am1)
    {
        boolean flag1;
        flag1 = true;
        b(am1);
        a(goc.c, super.R);
        if (aH == null || !(am1 instanceof gwu)) goto _L2; else goto _L1
_L1:
        boolean flag;
        am1 = (gwu)am1;
        Object obj = aH;
        ekp ekp1 = ((gwu) (am1)).b.b;
        if (((gog) (obj)).b == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        obj = ((gog) (obj)).c;
        if (ekp1.equals(((goq) (obj)).d) && ((goq) (obj)).b.getDrawable() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        flag = true;
_L3:
        if (flag)
        {
            flag1 = false;
        }
        if (((gwu) (am1)).c != flag1)
        {
            am1.c = flag1;
            am1.s();
        }
_L2:
        return;
        flag = false;
          goto _L3
    }

    public final void a(Bundle bundle)
    {
label0:
        {
            boolean flag = true;
            super.a(bundle);
            aK = noz.a(ad, "PhotoPagerFragment", new String[0]);
            grg grg1 = am;
            Object obj = aJ;
            android.content.Context context;
            gll gll1;
            gaj gaj1;
            boolean flag1;
            if (grg1.f == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            p.b(flag1, "Can only call initialize once");
            if (grg1.e.a())
            {
                b.a(((ehr) (obj)).a);
                b.a(((ehr) (obj)).b);
            }
            grg1.f = ((ehr) (obj));
            context = grg1.b;
            gll1 = grg1.c;
            gaj1 = grg1.d;
            if (gll1.c(((ehr) (obj))))
            {
                obj = new gki(context, ((ehr) (obj)), grg1);
            } else
            {
                obj = new grm(context, ((ehr) (obj)), gaj1, grg1);
            }
            grg1.g = ((grh) (obj));
            if (bundle == null)
            {
                bundle = (ekp)super.q.getParcelable("com.google.android.apps.photos.core.media");
                if (Boolean.valueOf(super.q.getBoolean("auto_play_enabled", false)).booleanValue() && bundle != null)
                {
                    obj = an;
                    if (!((jdq) (obj)).b(bundle) || !((jdq) (obj)).c)
                    {
                        flag = false;
                    }
                    if (!flag && !aO.b())
                    {
                        obj = an;
                        obj.b = bundle;
                        obj.c = false;
                        ((jdq) (obj)).a.b();
                    }
                }
                if (bundle == null)
                {
                    break label0;
                }
                am.a(bundle);
            }
            return;
        }
        am.a(0);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        if (aH != null)
        {
            view = aH;
            if (((gog) (view)).a == gon.b || ((gog) (view)).a == gon.c)
            {
                ((gog) (view)).d.a(false);
            }
            if (((gog) (view)).a == gon.g || ((gog) (view)).a == gon.b || ((gog) (view)).a == gon.c)
            {
                bundle = ((gog) (view)).d;
                float f1;
                if (((gog) (view)).a == gon.b || ((gog) (view)).a == gon.c)
                {
                    f1 = 0.0F;
                } else
                {
                    f1 = 1.0F;
                }
                bundle.a(f1);
            }
        }
    }

    public final void a(eke eke)
    {
        Toast.makeText(ad, b.sU, 0).show();
    }

    public final void a(fpj fpj1, Rect rect)
    {
        c.setPadding(rect.left, rect.top, rect.right, 0);
        fpj1 = ar;
        b.a(((gmx) (fpj1)).a.R, "Argument must not be null");
        ((gmx) (fpj1)).a.R.findViewById(((gmx) (fpj1)).b).setPadding(0, 0, 0, rect.bottom);
    }

    public final void a(gai gai1)
    {
        boolean flag = false;
        boolean flag1;
        if (!super.q.getBoolean("disable_slideshow"))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        az = flag1;
        if (gai1.a() <= 0)
        {
            flag = true;
        }
        if (ay && flag)
        {
            aL.a(new gnz(this));
            return;
        }
        if (flag)
        {
            a(goc.b, super.R);
            return;
        } else
        {
            ay = true;
            return;
        }
    }

    public final void a(rv rv1)
    {
    }

    public final void a(rv rv1, boolean flag)
    {
        if (flag)
        {
            b.a(rv1, true);
            rv1.b(true);
            rv1.c(false);
            rv1.e(c.dH);
            rv1.c(0);
            if (aG.a())
            {
                rv1.e();
            }
        }
    }

    public final void a(boolean flag)
    {
        Object obj = aM;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((View) (obj)).setVisibility(i1);
        obj = ar;
        obj.d = flag;
        ((gmx) (obj)).a(((gmx) (obj)).c.h, flag);
    }

    public final void ak_()
    {
        super.ak_();
        at.a(null);
        PhotoViewPager photoviewpager = at;
        fuc fuc1 = aN;
        if (((ViewPager) (photoviewpager)).p != null)
        {
            ((ViewPager) (photoviewpager)).p.remove(fuc1);
        }
        at.u = null;
    }

    public final void b(int i1)
    {
    }

    public final void b_(Object obj)
    {
        if (((grg)obj).h != null && am.j != ((ViewPager) (at)).c)
        {
            at.a(am.j, false);
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ekq ekq1 = (ekq)super.q.getParcelable("com.google.android.apps.photos.core.media_collection");
        ekp ekp1 = (ekp)super.q.getParcelable("com.google.android.apps.photos.core.media");
        ekw ekw1 = (ekw)super.q.getParcelable("com.google.android.apps.photos.core.query_options");
        Object obj = ekw1;
        if (ekw1 == null)
        {
            obj = ekw.a;
        }
        aJ = new ehr(ekq1, ((ekw) (obj)));
        aG = (gqw)ae.a(gqw);
        aH = (gog)ae.b(gog);
        aC = (mmr)ae.a(mmr);
        aD = (dfo)ae.a(dfo);
        aL = (mwx)ae.a(mwx);
        aF = (nwm)ae.a(nwm);
        aO = (egp)ae.a(egp);
        aE = new gxg(super.q);
        obj = ae;
        ((olm) (obj)).a(jdq, an);
        ((olm) (obj)).a(grq, ag);
        ((olm) (obj)).a(grt, ah);
        ((olm) (obj)).a(ekk, a);
        ((olm) (obj)).a(gxg, aE);
        ((olm) (obj)).a(ejz, new eko(ekq1));
        ((olm) (obj)).a(dhr, new ixx(af, (byte)0));
        ((olm) (obj)).a(dhw, new ifr(this, af));
        ((olm) (obj)).a(dhp, new ixv(af, (byte)0));
        ((olm) (obj)).a(dhu, new ixz(af, (byte)0));
        ((olm) (obj)).a(hkv, new hkw(this, af));
        ((olm) (obj)).a(dhz, new hij(this, af));
        ((olm) (obj)).a(gmu, aQ);
        ((olm) (obj)).b(dhc, this);
        if (bundle == null && ekp1 != null)
        {
            ae.a(gro, new gro(ekp1));
        }
        if (!a(aJ))
        {
            aI = (gaj)ae.a(gaj);
            new jav(af, aJ);
        }
        if (aE.d)
        {
            as = new gqp(af);
            (new dhg(this, af, new egn(p.X, p.W, pwr.d), af.w, null)).a(ae);
        }
        if (aE.j)
        {
            (new dhg(this, af, new hfr(this), af.y, pwr.o)).a(ae);
        }
        if (aE.f)
        {
            (new dhg(this, af, new jaw(), af.x, pwr.f)).a(ae);
        }
        if (aE.m)
        {
            (new dhg(this, af, new jay(), af.A, pwr.s)).a(ae);
        }
        if (aE.r)
        {
            (new dhg(this, af, new iam(this), af.B, pwr.x)).a(ae);
        }
        if (aE.q)
        {
            (new dhg(this, af, new gof(this), af.D, pwr.w)).a(ae);
        }
        if (aE.l)
        {
            (new dhg(this, af, new hpa(), af.z, pwr.r)).a(ae);
        }
        (new dhg(this, af, aj, af.v, pwr.a)).a(ae);
    }

    public final void c_(int i1)
    {
        if (as != null)
        {
            gqp gqp1 = as;
            gql gql1;
            gqn gqn1;
            int j1;
            if (i1 > gqp1.d)
            {
                j1 = gqo.b;
            } else
            {
                j1 = gqo.a;
            }
            gql1 = gqp1.a;
            gqn1 = gql1.b();
            gqn1.d = j1;
            gql1.b = gqn1.a();
            gqp1.d = i1;
        }
        am.a(i1);
        b(al.c(i1));
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("full_screen", aG.a());
        bundle.putBoolean("collection_refreshed", ax);
        bundle.putBoolean("loaded_not_empty", ay);
        bundle.putBoolean("slideshow_enabled", aA);
        bundle.putBoolean("local_slideshow", aB);
    }

    public final void l()
    {
        super.l();
        if (aI != null)
        {
            aI.a(aJ, this);
        }
        IntentFilter intentfilter;
        boolean flag;
        if (am.h != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.a.a(this, flag);
        intentfilter = new IntentFilter();
        intentfilter.addAction("com.google.android.apps.photos.SLIDESHOW_STATE");
        em.a(ad).a(aP, intentfilter);
        SlideshowService.b(ad);
        if (aB && aA)
        {
            SlideshowService.a(ad, am.f.a, am.f.b, am.j - 1);
        }
    }

    public final void m()
    {
        super.m();
        if (aI != null)
        {
            aI.b(aJ, this);
        }
        am.a.a(this);
        if (aP == null) goto _L2; else goto _L1
_L1:
        em em1;
        BroadcastReceiver broadcastreceiver;
        em1 = em.a(ad);
        broadcastreceiver = aP;
        HashMap hashmap = em1.a;
        hashmap;
        JVM INSTR monitorenter ;
        ArrayList arraylist = (ArrayList)em1.a.remove(broadcastreceiver);
        if (arraylist != null) goto _L4; else goto _L3
_L3:
        hashmap;
        JVM INSTR monitorexit ;
_L2:
        if (!((nux)ae.a(nux)).a())
        {
            SlideshowService.a(ad);
        }
        return;
_L4:
        int j1 = 0;
_L13:
        if (j1 >= arraylist.size()) goto _L6; else goto _L5
_L5:
        IntentFilter intentfilter = (IntentFilter)arraylist.get(j1);
        int k1 = 0;
_L12:
        String s1;
        ArrayList arraylist1;
        if (k1 >= intentfilter.countActions())
        {
            break MISSING_BLOCK_LABEL_272;
        }
        s1 = intentfilter.getAction(k1);
        arraylist1 = (ArrayList)em1.b.get(s1);
        int i1;
        if (arraylist1 == null)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        i1 = 0;
_L11:
        if (i1 >= arraylist1.size()) goto _L8; else goto _L7
_L7:
        if (((ep)arraylist1.get(i1)).b != broadcastreceiver) goto _L10; else goto _L9
_L9:
        arraylist1.remove(i1);
        i1--;
          goto _L10
_L8:
        if (arraylist1.size() <= 0)
        {
            em1.b.remove(s1);
        }
        break MISSING_BLOCK_LABEL_263;
_L6:
        hashmap;
        JVM INSTR monitorexit ;
          goto _L2
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
_L10:
        i1++;
          goto _L11
        k1++;
          goto _L12
        j1++;
          goto _L13
    }

    public final boolean r()
    {
        ai.a(false);
        Iterator iterator = ag.a.iterator();
        boolean flag;
        for (flag = false; iterator.hasNext(); flag = ((grp)iterator.next()).c() | flag) { }
        return flag;
    }

    public final void s()
    {
    }

    public final List t()
    {
        ArrayList arraylist = new ArrayList();
        if (super.R != null)
        {
            arraylist.add(c);
        }
        return arraylist;
    }

    public final am u()
    {
        boolean flag;
        if (aq.a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return this;
        } else
        {
            return b.b;
        }
    }

}
