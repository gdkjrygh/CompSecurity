// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.sharedlinks;

import adi;
import al;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import b;
import ce;
import dhc;
import dhj;
import eke;
import ekk;
import ekm;
import ekq;
import elb;
import elj;
import emi;
import emj;
import esm;
import fgo;
import fhm;
import fpj;
import fpk;
import fpl;
import hgz;
import hjt;
import hjv;
import hjz;
import hkd;
import hkf;
import hpc;
import hpe;
import hqr;
import hqv;
import ifj;
import ihh;
import ihs;
import ihu;
import ihz;
import iia;
import iim;
import iin;
import iio;
import iip;
import iir;
import iiw;
import iks;
import iky;
import iup;
import iwk;
import iwm;
import java.util.List;
import mmr;
import mtj;
import mue;
import mxg;
import mxj;
import noz;
import olm;
import olq;
import omp;
import p;
import rv;

public final class SharedLinksFragment extends omp
    implements dhc, emj, fpl, iia, iim, iwk
{

    private static final String a;
    private static final ekk b = (new ekm()).a(hpe).a(iks).a(elj).a(hjt).a(hkf).a(hkd).a(hjv).a(hjz).b(iky).a();
    private RecyclerView ag;
    private mtj ah;
    private mmr ai;
    private ifj aj;
    private noz ak;
    private final iwm c;
    private final hqr d;
    private final iip e;
    private final emi f;
    private mxg g;
    private hgz h;

    public SharedLinksFragment()
    {
        c = new iwm(this, af, this);
        d = (new hqr()).a(ae);
        e = new iip(af);
        f = new emi(this, af, ce.s, this);
        (new dhj(this, Integer.valueOf(b.zz), ce.E)).a(ae);
        (new fpj(af, (byte)0)).a(ae);
        (new hqv(this, af)).a(ae);
        new fpk(af, this);
    }

    public static void a(SharedLinksFragment sharedlinksfragment, mue mue1)
    {
        if (mue1 != null && !mue1.c())
        {
            mue1 = mue1.a().getString("url");
            ((ClipboardManager)sharedlinksfragment.ad.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", mue1));
            Toast.makeText(sharedlinksfragment.ad, b.zG, 1).show();
            return;
        } else
        {
            Toast.makeText(sharedlinksfragment.ad, b.zH, 0).show();
            return;
        }
    }

    private void r()
    {
        boolean flag;
        if (h != null && h.a() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (!e.e)
            {
                g.a(mxj.a);
                return;
            } else
            {
                g.a(mxj.c);
                return;
            }
        } else
        {
            g.a(mxj.b);
            return;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        boolean flag1 = false;
        layoutinflater = layoutinflater.inflate(b.zy, null);
        viewgroup = layoutinflater.findViewById(ce.y);
        mxg mxg1 = new mxg(af);
        mxg1.e = new fgo(viewgroup);
        g = mxg1;
        ag = (RecyclerView)layoutinflater.findViewById(ce.x);
        ag.a(new adi(ad));
        d.a(ag);
        int i = ai.d();
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "must provide valid accountId");
        viewgroup = new iiw(i);
        f.a(viewgroup, b);
        if (bundle == null)
        {
            viewgroup = e;
            flag = flag1;
            if (!((iip) (viewgroup)).d)
            {
                flag = flag1;
                if (!((iip) (viewgroup)).e)
                {
                    flag = true;
                }
            }
            p.b(flag, "Mixin can only be started once");
            viewgroup.d = true;
            ((iip) (viewgroup)).a.a(new ihu(((iip) (viewgroup)).b.d(), null));
        }
        r();
        return layoutinflater;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ak = noz.a(ad, "SharedLinksFragment", new String[0]);
    }

    public final void a(ekq ekq1)
    {
        ekq1 = new ihh(ai.d(), ((hpe)ekq1.a(hpe)).a.a);
        ah.b(ekq1);
    }

    public final void a(elb elb1)
    {
        try
        {
            boolean flag = aj.a(ai.d());
            c.a(new iin(flag), elb1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1)
        {
            Toast.makeText(ad, b.zO, 1).show();
        }
        r();
    }

    public final void a(fpj fpj1, Rect rect)
    {
        ag.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void a(Object obj)
    {
        obj = (List)obj;
        if (h == null)
        {
            h = new hgz(ad, false, new iio());
            ag.a(h);
        }
        h.a(((List) (obj)));
        d.b();
        r();
    }

    public final void a(rv rv1)
    {
    }

    public final void a(rv rv1, boolean flag)
    {
        rv1.b(true);
    }

    public final void b(ekq ekq1)
    {
        int i = ai.d();
        if (((hkf)ekq1.a(hkf)).a == esm.c)
        {
            iup iup1 = new iup(ad, ((iky)ekq1.a(iky)).a, i);
            iup1.a = ((iks)ekq1.a(iks)).a;
            ekq1 = iup1.a();
        } else
        {
            fhm fhm1 = new fhm(ad);
            fhm1.a = i;
            fhm1.b = ((hpe)ekq1.a(hpe)).a.a;
            fhm1.c = ((iks)ekq1.a(iks)).a;
            ekq1 = fhm1.a();
        }
        a(ekq1);
    }

    public final void c(Bundle bundle)
    {
        super.c(bundle);
        ah = ((mtj)ae.a(mtj)).a(a, new iir(this));
        ai = (mmr)ae.a(mmr);
        aj = (ifj)ae.a(ifj);
        bundle = ae;
        bundle.a(iia, this);
        bundle.a(iim, this);
        bundle.a("com.google.android.apps.photos.ScrollingToolbarManager.NEEDS_SHADOW", true).b(dhc, this);
    }

    public final void c(ekq ekq1)
    {
        ihz.a(ekq1).a(h(), "RemoveSharedLinkFragment");
    }

    public final void d(ekq ekq1)
    {
        ekq1 = new ihs(ai.d(), ((hpe)ekq1.a(hpe)).a.a, ce.t);
        ah.b(ekq1);
    }

    static 
    {
        a = ihs.a(ce.t);
    }
}
