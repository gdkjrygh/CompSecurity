// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageButton;
import com.google.android.apps.photos.home.LockableViewPager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class fok extends omp
    implements dhc, dsw, fpl, nug, nwn
{

    private final hhi a;
    private mmr ag;
    private AccessibilityManager ah;
    private ImageButton ai;
    private dgz aj;
    private LockableViewPager ak;
    private fba al;
    private dhk am;
    private hyy an;
    private dgk ao;
    private nwm ap;
    private foq aq;
    private gog ar;
    private fpn as;
    private eem at;
    private fos au;
    private final np av = new fol(this);
    private final nug aw = new fom(this);
    private final nug ax = new fon(this);
    private nug ay;
    private final fpb b;
    private final hry c;
    private final jhj d;
    private final foa e = new foa();
    private final fpj f;
    private final iwa g;
    private final fou h = new fou(this);

    public fok()
    {
        a = (new hhj(af)).a();
        b = new fpb(this, af);
        c = new hry(af);
        d = (new jhj(af)).a(ae);
        f = (new fpj(af, (byte)0)).a(ae);
        g = new iwa(af);
        new flc(af);
        new fpk(af, this);
        (new hqv(this, af)).a(ae);
        (new dhj(this, Integer.valueOf(b.pT), c.cV)).a(ae);
        dqs dqs1 = new dqs(this, af);
        ae.a(dqs, dqs1);
        (new dhg(this, af, new eok(this), c.cM, pwr.e)).a(ae);
        (new dhg(this, af, new egn(b.pK, b.pJ, pwr.d), c.cL, null)).a(ae);
        (new dhg(this, af, new for(this), 0x102002c, pwr.m)).a(ae);
        ay = new fop(this);
    }

    static fpn a(fok fok1)
    {
        return fok1.as;
    }

    static fpb b(fok fok1)
    {
        return fok1.b;
    }

    static fba c(fok fok1)
    {
        return fok1.al;
    }

    static jhj d(fok fok1)
    {
        return fok1.d;
    }

    static void e(fok fok1)
    {
        if (fok1.ah.isEnabled())
        {
            AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(16384);
            accessibilityevent.setSource(fok1.ak);
            accessibilityevent.setClassName(fok1.getClass().getName());
            accessibilityevent.setPackageName(fok1.O_().getApplicationContext().getPackageName());
            accessibilityevent.getText().add(fok1.a(fok1.b.b.e(((ViewPager) (fok1.ak)).c)));
            fok1.ak.requestSendAccessibilityEvent(fok1.ak, accessibilityevent);
        }
    }

    static nwm f(fok fok1)
    {
        return fok1.ap;
    }

    static LockableViewPager g(fok fok1)
    {
        return fok1.ak;
    }

    static dhk h(fok fok1)
    {
        return fok1.am;
    }

    static mmr i(fok fok1)
    {
        return fok1.ag;
    }

    static gog j(fok fok1)
    {
        return fok1.ar;
    }

    static foq k(fok fok1)
    {
        return fok1.aq;
    }

    static eem l(fok fok1)
    {
        return fok1.at;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(b.pS, null);
        ak = (LockableViewPager)viewgroup.findViewById(c.cR);
        layoutinflater = ak;
        int i1 = g().getDimensionPixelOffset(b.pO);
        int k1 = ((ViewPager) (layoutinflater)).d;
        layoutinflater.d = i1;
        int i2 = layoutinflater.getWidth();
        layoutinflater.a(i2, i2, i1, k1);
        layoutinflater.requestLayout();
        bundle = b;
        if (((fpb) (bundle)).b == null)
        {
            Object obj = new fpa();
            obj.b = ((fpb) (bundle)).a.h();
            obj.c = ((fpb) (bundle)).c.d();
            obj.d = ((fpb) (bundle)).d.a();
            foo foo1;
            int j1;
            int l1;
            if (((fpb) (bundle)).f)
            {
                layoutinflater = Collections.emptyList();
            } else
            {
                layoutinflater = new ArrayList();
                faz faz = ((fpb) (bundle)).e.b();
                boolean flag;
                if (((fpb) (bundle)).c.d() != -1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                layoutinflater.addAll(fox.a(flag, ((fpb) (bundle)).d.a(), faz));
            }
            ((fpa) (obj)).a.addAll(layoutinflater);
            p.a(((fpa) (obj)).b);
            bundle.b = new foz(((fpa) (obj)));
        }
        b.b.b.a(ax, false);
        ak.a(b.b);
        layoutinflater = ak;
        if (2 != ((ViewPager) (layoutinflater)).h)
        {
            layoutinflater.h = 2;
            layoutinflater.d();
        }
        ak.a((new fuc()).a(av).a(g.a).a(ak, ae.c(fua)));
        ah = (AccessibilityManager)O_().getApplicationContext().getSystemService("accessibility");
        ai = (ImageButton)viewgroup.findViewById(c.cQ);
        layoutinflater = e;
        bundle = ai;
        obj = ad;
        foo1 = new foo(this);
        layoutinflater.a = bundle;
        ((foa) (layoutinflater)).a.setOnClickListener(foo1);
        mk.d(bundle, ((Context) (obj)).getResources().getDimensionPixelSize(b.pM));
        layoutinflater = e;
        if (ag.d() == -1)
        {
            ((foa) (layoutinflater)).a.setVisibility(8);
        } else
        {
            ((foa) (layoutinflater)).a.setVisibility(0);
        }
        aj = new dgz(e.a);
        j1 = g().getDimensionPixelOffset(b.pL);
        l1 = g().getDimensionPixelOffset(b.pN);
        f.c = j1 + (l1 << 1);
        return viewgroup;
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        mk.u(view);
    }

    public final void a(fpj fpj1, Rect rect)
    {
        ai.setTranslationY(-rect.bottom);
        aj.a(-rect.bottom);
    }

    public final void a(rv rv1)
    {
        rv1.e(b.pQ);
        rv1 = h;
        rv1.a = null;
        rv1.a();
    }

    public final void a(rv rv1, boolean flag)
    {
        rv1.c(b.b.e(((ViewPager) (ak)).c));
        if (flag)
        {
            rv1.b(true);
            aq.a().a();
        }
        fou fou1 = h;
        fou1.a = rv1;
        fou1.a();
    }

    public final void aj_()
    {
        super.aj_();
        al.a.a(this);
        al.a.a(b);
        an.a.a(ay);
        an.a.a(au);
        d.a.a(aw);
        ao.b(aj);
        at.a.a(h);
    }

    public final void ak_()
    {
        super.ak_();
        ak.b();
        ak.a(null);
        b.b.b.a();
    }

    public final void au_()
    {
        super.au_();
        al.a.a(this, true);
        al.a.a(b, true);
        an.a.a(ay, true);
        an.a.a(au, true);
        d.a.a(aw, true);
        ao.a(aj);
        a.a();
        hry hry1 = c;
        if (hry1.b.e())
        {
            long l1 = hry1.b.g().a("last_suggestions_sync_time", 0L);
            TimeUnit timeunit = TimeUnit.MINUTES;
            hso hso1 = hry1.d;
            int i1 = hry1.b.d();
            boolean flag;
            if (l1 + timeunit.toMillis(Long.valueOf(hso1.b.b(hso.a, i1).longValue()).longValue()) > hry1.c.a())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && hry1.b.e())
            {
                hry1.a.a(new hsl(hry1.b.d(), hrz.a));
            }
        }
        at.a.a(h, true);
    }

    public final void b_(Object obj)
    {
        obj = ((fba)obj).b();
        if (b.b.c.contains(obj))
        {
            int i1 = b.b.a(((faz) (obj)));
            ak.a(i1, true);
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        au = new fos(this, (mwx)ae.a(mwx), e);
        bundle = ae;
        bundle.b(dhc, this);
        bundle.a(iwc, new iwd(this, c.cW));
        bundle.b(ftd, au);
        ag = (mmr)ae.a(mmr);
        al = (fba)ae.a(fba);
        am = (dhk)ae.a(dhk);
        an = (hyy)ae.a(hyy);
        ao = (dgk)ae.a(dgk);
        ap = (nwm)ae.a(nwm);
        aq = (foq)ae.a(foq);
        ar = (gog)ae.a(gog);
        as = (fpn)ae.a(fpn);
        at = (eem)ae.a(eem);
    }

    public final am u()
    {
        return d.b;
    }
}
