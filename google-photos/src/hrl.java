// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public final class hrl extends omp
    implements hww, mso, mti, nug, nwn
{

    private static final msm c;
    private static final msm d;
    private static final ekk e = (new ekm()).a(dnq).a();
    public final hxw a;
    private mmr ag;
    private epb ah;
    public hxo b;
    private final hqv f;
    private nwm g;
    private mtj h;

    public hrl()
    {
        Object obj = new hya();
        ae.a(hya, obj);
        (new fpj(af, (byte)0)).a(ae);
        (new dhj(this, Integer.valueOf(b.xi), p.at)).a(ae);
        (new dhg(this, af, new fnn(fnl.j), p.ao, pwr.k)).a(ae);
        (new dhg(this, af, new egn(s.aC, s.aB, pwr.d), p.ak, null)).a(ae);
        f = (new hqv(this, af)).a(ae);
        obj = new hxw(af, this, f);
        olm olm1 = ae;
        olm1.a(hxw, obj);
        olm1.b(dhc, obj);
        olm1.b(ftx, obj);
        a = ((hxw) (obj));
    }

    static hxw a(hrl hrl1)
    {
        return hrl1.a;
    }

    static nwm b(hrl hrl1)
    {
        return hrl1.g;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.xh, null);
        viewgroup = h();
        b = (hxo)viewgroup.a("photos_search_suggestions_search_explore_summary");
        if (b == null)
        {
            b = hxo.a(hsw.f);
            viewgroup.a().a(p.aq, b, "photos_search_suggestions_search_explore_summary").a(null).b();
            viewgroup.b();
        }
        if (((am) (b)).R != null)
        {
            dfo.a(Boolean.valueOf(true), ((am) (b)).R);
        }
        viewgroup.a(new hrm(this));
        f.d = true;
        return layoutinflater;
    }

    public final void a(hsw hsw1)
    {
        if (b != null && ((am) (b)).R != null)
        {
            dfo.a(Boolean.valueOf(false), ((am) (b)).R);
        }
        bp bp1 = h().a();
        if (android.os.Build.VERSION.SDK_INT > 15)
        {
            bp1.a(c.et, c.eu, c.et, c.eu);
        }
        bp1.b(p.aq, hxo.a(hsw1), "photos_search_suggestions_search_explore_detailed").a(null).b();
    }

    public final void a(String s1, mue mue1, mua mua)
    {
        if (mue1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!s1.equals("search_query_collection_feature_load_task"))
        {
            continue; /* Loop/switch isn't completed */
        }
        mue1 = mue1.a();
        s1 = (hsv)mue1.getParcelable("extra_source_suggestion");
        mua = (ekq)mue1.getParcelable("com.google.android.apps.photos.core.media_collection");
        if (!((dnq)mua.a(dnq)).i) goto _L4; else goto _L3
_L3:
        s1 = hva.a(mua, (hrr)s1);
_L7:
        mue1 = h().a();
        if (android.os.Build.VERSION.SDK_INT > 15)
        {
            mue1.a(c.et, c.eu, c.et, c.eu);
        }
        mue1.b(p.aq, s1, "photos_search_results").a("results_fragment_transaction").b();
        h().b();
        return;
_L4:
        mue1 = new hwa();
        mue1.b = mua;
        if (!(s1 instanceof hsc)) goto _L6; else goto _L5
_L5:
        mue1.c = true;
_L8:
        boolean flag;
        if (((hwa) (mue1)).b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "must set searchQuery");
        s1 = new hvy();
        mua = new Bundle();
        mua.putParcelable("extra_search_query", ((hwa) (mue1)).b);
        mua.putBoolean("extra_enable_caption_view", ((hwa) (mue1)).c);
        mua.putParcelable("extra_suggestion", ((hwa) (mue1)).a);
        s1.f(mua);
        if (true) goto _L7; else goto _L6
_L6:
        if (s1 instanceof hrr)
        {
            mue1.a = (hrr)s1;
        }
          goto _L8
        if (!s1.equals("GetCollFromAlbumIdTask")) goto _L1; else goto _L9
_L9:
        s1 = (ekq)mue1.a().getParcelable("com.google.android.apps.photos.core.media_collection");
        if (mue1.c() || s1 == null)
        {
            Toast.makeText(ad, b.xj, 1).show();
            return;
        } else
        {
            ah.a(ag.d(), s1, false);
            return;
        }
    }

    public final void b_(Object obj)
    {
        hsq hsq1 = (hsq)obj;
        if (h().a("photos_search_results") != null)
        {
            h().a("results_fragment_transaction", 1);
        }
        hsv hsv1 = hsq1.c;
        if (hsv1 != null && hsv1.d() != null)
        {
            obj = new hrg(hsv1.d(), ag.d(), (new ekm()).a(hpe).a());
            h.a(((mtf) (obj)));
            return;
        }
        obj = hsv1;
        if (hsv1 == null)
        {
            obj = new hsy(hsq1.b());
        }
        obj = new hrn(((hsv) (obj)), ((hsv) (obj)).d_(ag.d()), e);
        h.a(((mtf) (obj)));
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        g = (nwm)ae.a(nwm);
        bundle = ae;
        bundle.a(hww, this);
        bundle.a(mso, this);
        bundle = new hsq();
        ((hsq) (bundle)).a.a(this, false);
        ae.a(hsq, bundle);
        h = ((mtj)ae.a(mtj)).a(this);
        ag = (mmr)ae.a(mmr);
        ah = (epb)ae.a(epb);
    }

    public final msm r()
    {
        ay ay1 = h();
        boolean flag;
        if (ay1.e() > 0 && "results_fragment_transaction".equals(ay1.b(ay1.e() - 1).d()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return d;
        } else
        {
            return c;
        }
    }

    public final am u()
    {
        am am1 = h().a(p.aq);
        if (am1 == null)
        {
            return this;
        } else
        {
            return am1;
        }
    }

    static 
    {
        c = new msm(pwy.s);
        d = new msm(pwy.r);
    }
}
