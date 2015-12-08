// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.timemachine;

import am;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ar;
import ay;
import b;
import bp;
import cn;
import com.google.android.apps.photos.list.PhotoTileView;
import dha;
import dhc;
import dhg;
import dhj;
import dhw;
import eev;
import ehr;
import ejz;
import eke;
import ekk;
import ekm;
import ekp;
import ekq;
import ekr;
import elb;
import elt;
import emm;
import ewz;
import exa;
import flj;
import fnl;
import fnn;
import fpj;
import fql;
import frm;
import gaf;
import gai;
import gaj;
import gak;
import gnw;
import gob;
import gog;
import gpg;
import gph;
import gtg;
import gzt;
import hae;
import hao;
import hap;
import hba;
import hbg;
import hbh;
import hbs;
import hgz;
import hqq;
import hqr;
import hqv;
import hyy;
import hzc;
import ivk;
import ivm;
import ivq;
import ivr;
import ivs;
import ivt;
import ivu;
import iwk;
import iwm;
import java.util.List;
import msi;
import mxg;
import mxj;
import noz;
import nud;
import nug;
import nwn;
import olm;
import omp;
import pwr;
import pwt;
import rv;

public final class TimeMachineFragment extends omp
    implements dhc, emm, frm, gak, gph, ivm, iwk, nwn
{

    static final ekk a = (new ekm()).a(elt).a(eev).a(gtg).b(gaf).a();
    private static final ekk b = (new ekm()).a(ivu).a();
    private hgz ag;
    private gog ah;
    private dha ai;
    private ehr aj;
    private gaj ak;
    private final hzc al = new hzc();
    private dhw am;
    private hyy an;
    private ewz ao;
    private long ap;
    private noz aq;
    private ivk ar;
    private final hao as = new ivq(this);
    private final nug at = new ivr(this);
    private final mxg c;
    private final iwm d;
    private final hba e = new hba();
    private gzt f;
    private ekq g;
    private hbg h;

    public TimeMachineFragment()
    {
        c = new mxg(af);
        d = new iwm(this, af, this);
        (new fpj(af, (byte)0)).a(ae);
        (new hqr()).a(ae);
        (new hqv(this, af)).a(ae);
        (new dhj(this, Integer.valueOf(b.Bb), cn.I)).a(ae);
        (new hbs(af)).a(ae);
        (new msi(pwt.P)).a(ae);
        (new dhg(this, af, al, cn.F, pwr.v)).a(ae);
        (new dhg(this, af, new fnn(fnl.b), cn.x, pwr.k)).a(ae);
        (new dhg(this, af, new ivs(this), cn.G, pwr.y)).a(ae);
    }

    private long a(ekq ekq1)
    {
        Object obj = b.b(ad, ekq1);
        try
        {
            obj = (ivu)((ekq)((ekr) (obj)).a(ekq1, b).a()).a(ivu);
        }
        catch (eke eke1)
        {
            if (aq.a())
            {
                b.a(ekq1);
            }
            return 0L;
        }
        return ((ivu) (obj)).a;
    }

    public static ehr a(TimeMachineFragment timemachinefragment)
    {
        return timemachinefragment.aj;
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            c.a(mxj.b);
            return;
        } else
        {
            c.a(mxj.a);
            return;
        }
    }

    public static void b(TimeMachineFragment timemachinefragment)
    {
        timemachinefragment.r();
    }

    public static gaj c(TimeMachineFragment timemachinefragment)
    {
        return timemachinefragment.ak;
    }

    public static dhw d(TimeMachineFragment timemachinefragment)
    {
        return timemachinefragment.am;
    }

    private void r()
    {
        if (ar != null)
        {
            ivk ivk1 = ar;
            boolean flag;
            if (!an.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ivk1.a = flag;
            ivk1.c();
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(layoutinflater, viewgroup, bundle);
        f = new gzt(h.b);
        layoutinflater = layoutinflater.inflate(b.Ba, null);
        a(false);
        return layoutinflater;
    }

    public final void a()
    {
        ar ar1 = O_();
        Intent intent = new Intent();
        List list = ak.a(aj).b();
        if (list.size() > 1)
        {
            intent.putExtra("navigate_to_media", (ekp)list.get(1));
        }
        ar1.setResult(-1, intent);
        ar1.finish();
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle == null)
        {
            h().a().a(cn.y, new hae()).b();
        }
    }

    public final void a(PhotoTileView phototileview, ekp ekp1)
    {
        ah.a(ekp1, phototileview, t());
    }

    public final void a(eke eke1)
    {
        if (Log.isLoggable("TimeMachineFragment", 5))
        {
            Log.w("TimeMachineFragment", "Failed loading photos", eke1);
        }
    }

    public final void a(elb elb1)
    {
    }

    public final void a(gai gai1)
    {
        d.a(f, gai1);
    }

    public final void a(Object obj)
    {
        obj = (List)obj;
        boolean flag;
        if (((List) (obj)).size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        if (flag && ap != 0L)
        {
            ((List) (obj)).add(1, new fql(ap, exa.b));
            String s1 = ao.a(ap, exa.c);
            s1 = a(b.Bc, new Object[] {
                s1
            });
            ar = new ivk(ad, ((List) (obj)).size(), s1);
            r();
            ((List) (obj)).add(ar);
        }
        ag.a(((List) (obj)));
        e.a();
        c.c = true;
        ai.a();
    }

    public final void a(rv rv1)
    {
    }

    public final void a(rv rv1, boolean flag)
    {
        b.a(rv1, true);
        rv1.b(true);
        rv1.c(b.Bd);
        rv1.c(true);
    }

    public final void aj_()
    {
        super.aj_();
        ak.b(aj, this);
        an.a.a(at);
    }

    public final void au_()
    {
        super.au_();
        ak.a(aj, this);
        an.a.a(at, true);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ag = new hgz(ad, true, new ivt(this));
        bundle = hbg.c(ad);
        bundle.b = hap.c;
        h = bundle.a();
        g = ((ejz)ae.a(ejz)).b();
        ap = a(g);
        aj = new ehr(g);
        ah = (gog)ae.a(gog);
        ai = (dha)ae.a(dha);
        ak = (gaj)ae.a(gaj);
        am = (dhw)ae.a(dhw);
        ao = (ewz)olm.a(ad, ewz);
        an = (hyy)ae.a(hyy);
        bundle = (hqv)ae.a(hqv);
        olm olm1 = ae;
        olm1.a(flj, flj.a);
        olm1.a(frm, this);
        olm1.a(hba, e);
        olm1.a(hgz, ag);
        olm1.a(hbg, h);
        olm1.a(hqq, bundle);
        olm1.a(ivm, this);
        olm1.a(hao, as);
        olm1.b(dhc, this);
        (new gpg(this, af, this, ah)).a(ae);
        aq = noz.a(ad, "TimeMachineFragment", new String[0]);
    }

    public final void s()
    {
    }

    public final gob t()
    {
        return gnw.v().m(true).a(g);
    }

    public final am u()
    {
        return h().a(cn.y);
    }

}
