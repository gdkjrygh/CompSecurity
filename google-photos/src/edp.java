// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.photos.assistant.cardui.CardPhotoView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class edp extends omp
    implements duo, eeq, fpl, hyo, iwk, nwn, owm
{

    private final Map a = new HashMap();
    private final eep ag;
    private final eef ah;
    private final iwm ai;
    private final eej aj;
    private final hqr ak;
    private Map al;
    private dxz am;
    private boolean an;
    private owh ao;
    private final mwx ap;
    private fqc aq;
    private dgk ar;
    private final ca as = new edq(this);
    private final ca at = new edr(this);
    private hgz b;
    private RecyclerView c;
    private ftz d;
    private mmr e;
    private mmv f;
    private mtj g;
    private iwc h;

    public edp()
    {
        Object obj = new eep(af);
        ae.a(dyb, obj);
        ag = ((eep) (obj));
        ah = new eef(af);
        ai = new iwm(this, af, this);
        aj = new eej(af, b.kS);
        ak = (new hqr()).a(ae);
        ap = new mwx(af);
        (new icf(af, new iau(af))).a(ae);
        new edo(af);
        (new msi(pws.b)).a(ae);
        (new hzg(af)).a(ae);
        new fpk(af, this);
        obj = new gfv(this, af);
        ae.a(gfv, obj);
        new ghb(af, new edx(this), null);
        (new jbh(this, af)).a(ae);
        (new egf(af, (byte)0)).a(ae);
        (new hrd(af)).a(ae);
    }

    static olq a(edp edp1)
    {
        return edp1.ad;
    }

    static void a(edp edp1, List list)
    {
        edp1.ai.a(iwg.a(new eec()).b(new edz(edp1.a)).b(new eeh(Collections.unmodifiableList(edp1.ag.d), edp1.ag.a)), list);
    }

    static void a(edp edp1, mue mue1)
    {
        if (mue1 != null && !mue1.c())
        {
            int l = mue1.a().getInt("account_id");
            edp1.f.b(l).c("enabled_photos_notification_bucket", true).d();
        }
    }

    static boolean a(edp edp1, boolean flag)
    {
        edp1.an = true;
        return true;
    }

    static olq b(edp edp1)
    {
        return edp1.ad;
    }

    static void b(edp edp1, mue mue1)
    {
label0:
        {
            if (mue1 != null)
            {
                if (!mue1.c())
                {
                    break label0;
                }
                if (mue1 == null)
                {
                    mue1 = null;
                } else
                {
                    mue1 = mue1.d;
                }
                if (mue1 == null)
                {
                    mue1 = nup.p;
                } else
                {
                    mue1 = nup.valueOf(mue1);
                }
                nuo.a(edp1, mue1);
            }
            return;
        }
        mue1 = edp1.ar.a().a((int)dgh.b.c);
        mue1.d = edp1.ad.getString(b.kW);
        mue1.a().c();
    }

    static ca c(edp edp1)
    {
        return edp1.at;
    }

    static olq d(edp edp1)
    {
        return edp1.ad;
    }

    static olq e(edp edp1)
    {
        return edp1.ad;
    }

    static olq f(edp edp1)
    {
        return edp1.ad;
    }

    static hgz g(edp edp1)
    {
        return edp1.b;
    }

    static RecyclerView h(edp edp1)
    {
        return edp1.c;
    }

    static owh i(edp edp1)
    {
        return edp1.ao;
    }

    static iwc j(edp edp1)
    {
        return edp1.h;
    }

    static ftz k(edp edp1)
    {
        return edp1.d;
    }

    private hhg r()
    {
        ArrayList arraylist = new ArrayList(a.size());
        String s;
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext(); arraylist.add(((dup)a.get(s)).b()))
        {
            s = (String)iterator.next();
        }

        return new edv(this, arraylist);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.kV, null);
        int l;
        if (!an)
        {
            k().a(b.kU, null, as);
        } else
        {
            k().a(b.kT, null, at);
        }
        c = (RecyclerView)layoutinflater.findViewById(b.kS);
        c.q.m = false;
        c.a(new adi(ad));
        c.h = true;
        viewgroup = c;
        if (aq.a())
        {
            l = own.b;
        } else
        {
            l = own.c;
        }
        ao = new owh(viewgroup, this, l);
        viewgroup = (new ftz()).a(new eel(aj));
        ftx ftx1;
        for (bundle = ae.c(ftx).iterator(); bundle.hasNext(); ((ftz) (viewgroup)).a.add(new fty(ftx1)))
        {
            ftx1 = (ftx)bundle.next();
        }

        d = viewgroup;
        c.a(d);
        c.a(new edu(this));
        b = new hgz(ad, true, r());
        ak.a(c);
        return layoutinflater;
    }

    public final void a(int l, hgo hgo1)
    {
        b.a(l, hgo1);
    }

    public final void a(long l)
    {
        ap.a(new edw(this, l), 0L);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            an = bundle.getBoolean("full_load_completed", false);
        }
        if (e.e() && !e.g().a("enabled_photos_notification_bucket") && !g.a("EnablePhotosNotificationsSwitchTask"))
        {
            bundle = new eee(e.d());
            g.a(bundle);
        }
    }

    public final void a(RecyclerView recyclerview, int l)
    {
        recyclerview = recyclerview.a(l, false).a;
        mry.a(recyclerview.getContext(), 4, (new msn()).a(new msm(pws.i)).a(recyclerview));
        long l1 = b.b(l);
        recyclerview = (dui)al.get(Long.valueOf(l1));
        ag.a(l1, recyclerview);
    }

    public final void a(ekp ekp1, int l, hyk hyk1)
    {
        l = 0;
_L10:
        if (l >= b.a()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = b.f(l);
        if (!(obj instanceof dzg))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (dzl)((dzg)obj).a.a(dzl);
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = ((dzl) (obj)).h.iterator();
_L7:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L5
_L5:
        if (!((ekp)((Iterator) (obj)).next()).equals(ekp1)) goto _L7; else goto _L6
_L6:
        int i1 = 1;
_L8:
        CardPhotoView acardphotoview[];
        int j1;
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        afn afn1 = c.a(l, false);
        if (afn1 == null || !(afn1 instanceof dwk))
        {
            continue; /* Loop/switch isn't completed */
        }
        acardphotoview = ((dwk)afn1).z.d;
        j1 = acardphotoview.length;
        i1 = 0;
_L9:
        if (i1 >= j1)
        {
            continue; /* Loop/switch isn't completed */
        }
        CardPhotoView cardphotoview = acardphotoview[i1];
        if (cardphotoview != null && ekp1.equals(cardphotoview.d))
        {
            hyk1.a(cardphotoview);
            return;
        }
        break MISSING_BLOCK_LABEL_197;
_L4:
        i1 = 0;
          goto _L8
        i1++;
          goto _L9
        l++;
          goto _L10
_L2:
        hyk1.a(null);
        return;
    }

    public final void a(fpj fpj1, Rect rect)
    {
        int l = g().getDimensionPixelOffset(b.kR);
        int i1 = fpj1.b();
        c.setPadding(l, rect.top + l, l, (i1 - l) + rect.bottom);
    }

    public final void a(hgo hgo1)
    {
        hgz hgz1 = b;
        long l1 = hgo1.b();
        int l = hgz1.c.a(l1);
        if (l != -1)
        {
            hgz1.c(l);
        }
    }

    public final void a(Object obj)
    {
        obj = (eei)obj;
        eef eef1 = ah;
        ArrayList arraylist = new ArrayList(((eei) (obj)).b.values());
        if (!b.a(eef1.a, arraylist))
        {
            eef1.a = arraylist;
            eef1.a();
        }
        al = ((eei) (obj)).b;
        b.a(((eei) (obj)).a);
        if (c != null && c.d == null)
        {
            c.a(b);
            eej eej1 = aj;
            if (!eej1.b)
            {
                aen aen1 = eej1.a.d;
                p.b(aen1, "RecyclerView should have an adapter");
                aen1.a(eej1.c);
                eej1.b = true;
            }
        }
        if (((eei) (obj)).d != -1 && ((eei) (obj)).c != null)
        {
            eep eep1 = ag;
            hgo hgo1 = ((eei) (obj)).c;
            int l = ((eei) (obj)).d;
            eep1.b = hgo1;
            eep1.c = l;
        }
    }

    public final void ak_()
    {
        super.ak_();
        c.a(null);
    }

    public final int b(long l)
    {
        return b.a(l);
    }

    public final boolean b(int l)
    {
        long l1 = b.b(l);
        dui dui1 = (dui)al.get(Long.valueOf(l1));
        return am.a(dui1);
    }

    public final hgo c(long l)
    {
        return b.f(b(l));
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        bundle = ae;
        bundle.a(eeq, this);
        bundle.a(duo, this);
        bundle = bundle.a("com.google.android.apps.photos.ScrollingToolbarManager.NEEDS_SHADOW", true);
        bundle.a(hyo, this);
        bundle.a(nwn, this);
        f = (mmv)ae.a(mmv);
        e = (mmr)ae.a(mmr);
        h = (iwc)ae.a(iwc);
        g = (mtj)ae.a(mtj);
        g.a("AddPendingMedia", new edt(this)).a("EnablePhotosNotificationsSwitchTask", new eds(this));
        am = (dxz)ae.a(dxz);
        aq = (fqc)ae.a(fqc);
        ar = (dgk)ae.a(dgk);
        a.clear();
        dup dup1;
        for (bundle = ae.c(duq).iterator(); bundle.hasNext(); dup1.a(ae))
        {
            duq duq1 = (duq)bundle.next();
            dup1 = duq1.a(this);
            a.put(duq1.a(), dup1);
            af.a(dup1);
        }

    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (an && O_().isChangingConfigurations())
        {
            bundle.putBoolean("full_load_completed", an);
        }
    }

    public final am u()
    {
        return this;
    }
}
