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
import android.widget.Toast;
import java.util.List;

public final class idq extends omp
    implements fpl, iez, iwk, mti, nus
{

    private static final ekk a = (new ekm()).a(hkf).a(hpe).b(hjl).b(ila).b(iks).a();
    private ekq ag;
    private mmr ah;
    private mtj ai;
    private noz aj;
    private fjf ak;
    private iek al;
    private ifj am;
    private hgz an;
    private RecyclerView ao;
    private View ap;
    private ifc aq;
    private final idt b = new idt(this);
    private final igy c;
    private final ief d;
    private final eml e;
    private final ies f;
    private final iwm g;
    private final hfx h;

    public idq()
    {
        c = new igy(af, b);
        d = new ief(this, af, c);
        e = new eml(this, af, ce.j, b);
        f = new ies(this, af, ce.m, b);
        g = new iwm(this, af, this);
        h = new hfx(this, af, new idr(this));
        new nuu(af, this);
        new fpk(af, this);
    }

    static ekq a(idq idq1, ekq ekq1)
    {
        idq1.ag = ekq1;
        return ekq1;
    }

    static void a(idq idq1)
    {
        idq1.ai.b("GetOrCreateEnvelopeTask");
        idq1.h.c();
    }

    static noz b(idq idq1)
    {
        return idq1.aj;
    }

    static olq c(idq idq1)
    {
        return idq1.ad;
    }

    static ekq d(idq idq1)
    {
        return idq1.ag;
    }

    static RecyclerView e(idq idq1)
    {
        return idq1.ao;
    }

    static olq f(idq idq1)
    {
        return idq1.ad;
    }

    static olq g(idq idq1)
    {
        return idq1.ad;
    }

    static igy h(idq idq1)
    {
        return idq1.c;
    }

    static iwm i(idq idq1)
    {
        return idq1.g;
    }

    private void r()
    {
        if (!b.w(ad))
        {
            ay ay = h();
            nuq nuq1 = new nuq();
            nuq1.a = nup.d;
            nuq1.c = "OfflineRetryTagShareCollectionFragment";
            nuq1.e = true;
            nuo.a(ay, nuq1);
            return;
        }
        Object obj = (iks)ag.b(iks);
        Object obj1;
        esm esm1;
        boolean flag;
        boolean flag1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((iks) (obj)).a;
        }
        obj1 = (ila)ag.b(ila);
        if (obj1 != null && ((ila) (obj1)).a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = ag;
        esm1 = ((hkf)((ekq) (obj1)).a(hkf)).a;
        if (esm1 == esm.c)
        {
            p.b(obj1, "story must be non-null");
            obj1 = new ihi(ihj.c, ((ekq) (obj1)), null);
        } else
        if (esm1 == esm.b)
        {
            p.b(obj1, "album must be non-null");
            obj1 = new ihi(ihj.a, ((ekq) (obj1)), null);
            obj1.d = am.a(ah.d());
        } else
        {
            String s = String.valueOf(esm1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 28)).append("Unexpected collection type: ").append(s).toString());
        }
        obj1.d = am.a(ah.d());
        flag1 = iek.a(aq);
        ai.a(new ihn(ah.d(), ((ihi) (obj1)), ((String) (obj)), flag, flag1));
        h.a(a(b.yQ)).a(true).b();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ap = layoutinflater.inflate(b.yJ, null);
        layoutinflater = (ekq)super.q.getParcelable("com.google.android.apps.photos.core.media_collection");
        int j = g().getInteger(b.yF);
        ao = (RecyclerView)ap.findViewById(ce.a);
        ao.a(new adc(ad, j));
        an = new hgz(ad, false, new ids());
        ao.a(an);
        e.a(layoutinflater, a);
        viewgroup = f;
        bundle = new dhx();
        bundle.a = false;
        j = ah.d();
        Bundle bundle1 = new Bundle();
        bundle1.putInt("account_id", j);
        bundle1.putParcelable("com.google.android.apps.photos.share.mediaCollection", layoutinflater);
        bundle1.putParcelable("com.google.android.apps.photos.share.ShareMethodConstraints", bundle);
        viewgroup.a(bundle1);
        c.a();
        return ap;
    }

    public final String a()
    {
        return "OfflineRetryTagShareCollectionFragment";
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            aq = (ifc)bundle.getParcelable("target_intents");
        }
    }

    public final void a(View view, iei iei1)
    {
        mry.a(view, 4);
        aq = iei1.c;
        r();
    }

    public final void a(fpj fpj, Rect rect)
    {
        ak.a(ao, rect);
    }

    public final void a(Object obj)
    {
        obj = (List)obj;
        int k = Math.min(6, ((List) (obj)).size());
        for (int j = 0; j < k; j++)
        {
            ((iew)((List) (obj)).get(j)).a(ad);
        }

        an.a(((List) (obj)));
        ak.a(ao);
    }

    public final void a(String s, mue mue1, mua mua)
    {
label0:
        {
            if ("GetOrCreateEnvelopeTask".equals(s))
            {
                h.c();
                if (mue1 != null && !mue1.c())
                {
                    break label0;
                }
                if (aj.a())
                {
                    noy.a("result", mue1);
                }
                if (!nuo.a(this, mue1, nup.d))
                {
                    Toast.makeText(ad, a(b.yK), 1).show();
                }
            }
            return;
        }
        s = (ihk)mue1.a().getParcelable("envelope_details");
        d.a(aq, s, super.q.getBoolean("is_time_machine_share", false));
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ae.a(iez, this);
        ah = (mmr)ae.a(mmr);
        ai = ((mtj)ae.a(mtj)).a(this);
        aj = noz.a(ad, "ShareFragment", new String[0]);
        ak = (fjf)ae.a(fjf);
        al = (iek)ae.a(iek);
        am = (ifj)ae.a(ifj);
    }

    public final void c_(Bundle bundle)
    {
        r();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelable("target_intents", aq);
    }

}
