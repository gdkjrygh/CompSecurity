// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class idu extends omp
    implements fpl, iez, ifh, iwk, nus
{

    private static final ekk a = (new ekm()).b(gfn).b(hdv).b(elt).b(jdy).a(fzu).a();
    private final ejo ag;
    private final gfy ah;
    private ArrayList ai;
    private ArrayList aj;
    private mmr ak;
    private igf al;
    private iee am;
    private noz an;
    private fjf ao;
    private iek ap;
    private ifj aq;
    private hgz ar;
    private RecyclerView as;
    private ifc at;
    private View au;
    private dhx av;
    private jcq aw;
    private ign ax;
    private final iea b = new iea(this);
    private final hfx c;
    private final iwm d;
    private final igy e;
    private final emo f;
    private final ies g;
    private final ief h;

    public idu()
    {
        c = new hfx(this, af, new ieb(this));
        d = new iwm(this, af, this);
        e = new igy(af, b);
        f = new emo(this, af, ce.k, b);
        g = new ies(this, af, ce.m, b);
        h = new ief(this, af, e);
        ah = new gfy(af);
        new nuu(af, this);
        new fpk(af, this);
        aw = new idw(this);
        ax = new idx(this);
        ag = new ejo(af, new idv(this), ah);
    }

    static hfx a(idu idu1)
    {
        return idu1.c;
    }

    static ArrayList a(idu idu1, ArrayList arraylist)
    {
        idu1.aj = arraylist;
        return arraylist;
    }

    static void a(idu idu1, int i1, int j1, String s1)
    {
        double d1 = (double)i1 / (double)j1;
        idu1.c.a(s1).a(false).a(d1);
    }

    static ifc b(idu idu1)
    {
        return idu1.at;
    }

    static boolean c(idu idu1)
    {
        return ((am) (idu1)).q.getBoolean("is_time_machine_share", false);
    }

    static ief d(idu idu1)
    {
        return idu1.h;
    }

    static olq e(idu idu1)
    {
        return idu1.ad;
    }

    static olq f(idu idu1)
    {
        return idu1.ad;
    }

    static olq g(idu idu1)
    {
        return idu1.ad;
    }

    static ArrayList h(idu idu1)
    {
        return idu1.ai;
    }

    static iee i(idu idu1)
    {
        return idu1.am;
    }

    static igf j(idu idu1)
    {
        return idu1.al;
    }

    static ArrayList k(idu idu1)
    {
        return idu1.aj;
    }

    static ejo l(idu idu1)
    {
        return idu1.ag;
    }

    static olq m(idu idu1)
    {
        return idu1.ad;
    }

    static void n(idu idu1)
    {
        idu1.r();
    }

    static dhx o(idu idu1)
    {
        return idu1.av;
    }

    static mmr p(idu idu1)
    {
        return idu1.ak;
    }

    static ies q(idu idu1)
    {
        return idu1.g;
    }

    static noz r(idu idu1)
    {
        return idu1.an;
    }

    private void r()
    {
        if (!b.w(ad))
        {
            ay ay1 = h();
            nuq nuq1 = new nuq();
            nuq1.a = nup.d;
            nuq1.c = "OfflineRetryTagShareFragment";
            nuq1.e = true;
            nuo.a(ay1, nuq1);
        } else
        {
            ay ay2 = h();
            if ((jcm)ay2.a("upload_fragment") == null)
            {
                boolean flag = iek.a(at);
                boolean flag1 = iek.a(at, aj);
                Object obj = aj;
                ihx ihx1 = new ihx();
                ihx1.a = aj;
                ihx1.b = flag;
                ihx1.d = aq.a(ak.d());
                ihx1.c = flag1;
                obj = jcm.a(((List) (obj)), ihx1.a());
                ay2.a().a(((am) (obj)), "upload_fragment").b();
                ay2.b();
                return;
            }
        }
    }

    static olq s(idu idu1)
    {
        return idu1.ad;
    }

    static olq t(idu idu1)
    {
        return idu1.ad;
    }

    static igy u(idu idu1)
    {
        return idu1.e;
    }

    static iwm v(idu idu1)
    {
        return idu1.d;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        au = layoutinflater.inflate(b.yJ, null);
        int i1 = g().getInteger(b.yF);
        as = (RecyclerView)au.findViewById(ce.a);
        ar = new hgz(ad, false, new idz());
        layoutinflater = new adc(ad, i1);
        layoutinflater.a = ar.e(i1);
        as.a(layoutinflater);
        as.a(ar);
        layoutinflater = super.q;
        ai = layoutinflater.getParcelableArrayList("com.google.android.apps.photos.core.media_list");
        av = (dhx)layoutinflater.getParcelable("share_method_constraints");
        b.a(as, new gam(ad, pwt.H, ai));
        f.a(ai, a);
        e.a();
        return au;
    }

    public final String a()
    {
        return "OfflineRetryTagShareFragment";
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            at = (ifc)bundle.getParcelable("target_intents");
        }
    }

    public final void a(View view, iei iei1)
    {
        mry.a(view, 4);
        at = iei1.c;
        iei1 = new igs(aj, at.b(), at.a());
        view = (new igp(ad, iei1)).a();
        if (iek.a(at, aj))
        {
            view = Collections.singletonList(igj.d);
        } else
        if (iek.b(at, aj))
        {
            view = Collections.singletonList(igj.e);
            if (aj.size() == 1)
            {
                at.c.setType("video/mpeg");
            } else
            if (ejv.a(at.c.getType()))
            {
                at.c.setType("*/*");
            } else
            {
                at.c.setType("video/*");
            }
        }
        if (view.size() == 1)
        {
            ax.a((igj)view.get(0));
            return;
        } else
        {
            igl.a(iei1).a(h(), "method_dialog");
            return;
        }
    }

    public final void a(fpj fpj, Rect rect)
    {
        ao.a(as, rect);
    }

    public final void a(Object obj)
    {
        obj = (List)obj;
        int j1 = Math.min(6, ((List) (obj)).size());
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((iew)((List) (obj)).get(i1)).a(ad);
        }

        ArrayList arraylist = new ArrayList();
        ak.d();
        if (ifj.a())
        {
            arraylist.addAll(Arrays.asList(new hgo[] {
                new iff()
            }));
        }
        arraylist.addAll(((java.util.Collection) (obj)));
        ar.a(arraylist);
        ao.a(as);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        bundle = ae;
        bundle.a(ign, ax);
        bundle.a(jcq, aw);
        bundle.a(iez, this);
        bundle.a(ifh, this);
        ak = (mmr)ae.a(mmr);
        al = (igf)ae.a(igf);
        am = (iee)ae.a(iee);
        an = noz.a(ad, "ShareFragment", new String[0]);
        ao = (fjf)ae.a(fjf);
        ap = (iek)ae.a(iek);
        aq = (ifj)ae.a(ifj);
    }

    public final void c_(Bundle bundle)
    {
        r();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelable("target_intents", at);
    }

}
