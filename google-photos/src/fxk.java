// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.photos.list.PhotoTileView;
import java.util.List;

public final class fxk extends omp
    implements dhc, frm, fxr, gak, gph, iwk, mso, nwn
{

    public static final ekk a = (new ekm()).a(elt).a(gtg).b(eev).b(hdv).b(jdv).a();
    private boolean ag;
    private ekq ah;
    private ehr ai;
    private noz aj;
    private final mxg ak;
    private final hba al = new hba();
    private final flc am;
    private final fwm an;
    private fuu ao;
    private final nug ap = new fxm(this);
    private iwm b;
    private iwj c;
    private hgz d;
    private dha e;
    private gog f;
    private gaj g;
    private mmr h;

    public fxk()
    {
        b = new iwm(this, af, this);
        mxg mxg1 = new mxg(af);
        int i = b.qM;
        mxg1.b = null;
        mxg1.a = i;
        mxg1.d();
        ak = mxg1;
        am = new flc(af);
        an = new fwm(af, new fxl(this));
        ao = new fuu();
        (new fpj(af, (byte)0)).a(ae);
        (new hqv(this, af)).a(ae);
        (new hqr()).a(ae);
        (new dhj(this, Integer.valueOf(b.qD), aa.D)).a(ae);
        (new dhg(this, af, new fxo(this), 0x102002c, null)).a(ae);
        (new dhg(this, af, new hzc(), aa.k, pwr.v)).a(ae);
        (new dhg(this, af, new fnn(fnl.e), aa.j, null)).a(ae);
        (new hbs(af)).a(ae);
    }

    static flc a(fxk fxk1)
    {
        return fxk1.am;
    }

    static void b(fxk fxk1)
    {
        fxk1.v();
    }

    private void v()
    {
        if (d.a() != 0) goto _L2; else goto _L1
_L1:
        ak.c();
_L4:
        al.a();
        return;
_L2:
        fux fux1 = (fux)ah;
        String s1 = String.valueOf(fux1.b.get(0));
        boolean flag;
        if (h.e() && !ag && (fux1.b() || ao.b && ao.a(s1)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (d.f(0).a() != aa.z)
        {
            d.a(0, new fxp((fux)ah));
        }
_L6:
        ak.a(mxj.b);
        if (true) goto _L4; else goto _L3
_L3:
        if (d.f(0).a() != aa.z) goto _L6; else goto _L5
_L5:
        d.g(0);
          goto _L6
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(b.qB, null);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        aj = noz.a(ad, "LocalPhotosFragment", new String[0]);
        if (bundle == null)
        {
            h().a().a(aa.q, new hae()).b();
        }
    }

    public final void a(PhotoTileView phototileview, ekp ekp)
    {
        f.a(ekp, phototileview, t());
    }

    public final void a(eke eke)
    {
        Toast.makeText(ad, b.qR, 0).show();
    }

    public final void a(gai gai)
    {
        b.a(c, gai);
    }

    public final void a(Object obj)
    {
        obj = (List)obj;
        d.a(((List) (obj)));
        e.a();
        ak.c = true;
        v();
    }

    public final void a(rv rv1)
    {
    }

    public final void a(rv rv1, boolean flag)
    {
        rv1.b(true);
        rv1.a(((elj)ah.a(elj)).a);
    }

    public final void a(boolean flag)
    {
        Object obj = (fux)ah;
        if (((fux) (obj)).b())
        {
            if (ao.b != flag)
            {
                if (!ao.b)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                fwf.h(flag).a(super.B, "auto_backup_dialog");
            }
        } else
        {
            obj = String.valueOf(((fux) (obj)).b.get(0));
            if (ao.b(((String) (obj))) != flag)
            {
                an.a(((String) (obj)));
                return;
            }
        }
    }

    public final void aj_()
    {
        super.aj_();
        g.b(ai, this);
        ao.c.a(ap);
    }

    public final void au_()
    {
        super.au_();
        g.a(ai, this);
        ao.c.a(ap, true);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        d = new hgz(ad, true, new fxi());
        bundle = hbg.c(ad).a();
        olm olm1 = ae;
        olm1.a(hgz, d);
        olm1.a(hba, al);
        olm1.a(hbg, bundle);
        olm1.a(frm, this);
        olm1.a(fxr, this);
        olm1.a(fuu, ao);
        olm1.a(mso, this);
        olm1.b(dhc, this);
        c = new gzt(((hbg) (bundle)).b);
        ah = (ekq)super.q.getParcelable("com.google.android.apps.photos.core.media_collection");
        bundle = (ekw)super.q.getParcelable("com.google.android.apps.photos.core.query_options");
        ai = new ehr(ah, bundle);
        f = (gog)ae.a(gog);
        e = (dha)ae.a(dha);
        g = (gaj)ae.a(gaj);
        h = (mmr)ae.a(mmr);
        ag = super.q.getBoolean("is_picker", false);
        (new gpg(this, af, this, f)).a(ae);
    }

    public final msm r()
    {
        if (ag)
        {
            return new msm(pwx.c);
        } else
        {
            return new msm(pwt.B);
        }
    }

    public final void s()
    {
    }

    public final gob t()
    {
        return gnw.v().b(true).a(true).h(true);
    }

    public final am u()
    {
        return h().a(aa.q);
    }

}
