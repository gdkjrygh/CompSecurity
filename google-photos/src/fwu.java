// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.photos.list.PhotoTileView;
import com.google.android.apps.photos.localmedia.ui.LocalFoldersHeaderView;
import java.util.List;

public final class fwu extends omp
    implements dhc, frm, fwt, fwy, fxx, gph, iwk, nwn
{

    private static final ekk a = (new ekm()).a(elj).a();
    private hbg ag;
    private mmr ah;
    private fxh ai;
    private hgz aj;
    private dha ak;
    private gog al;
    private int am;
    private final iwm b;
    private final fws c;
    private final mxg d;
    private final flc e;
    private final fwm f;
    private final hba g = new hba();
    private final fuu h = new fuu();

    public fwu()
    {
        b = new iwm(this, af, this);
        c = new fws(this, af, this);
        d = new mxg(af);
        e = new flc(af);
        f = new fwm(af, new fwv(this));
        (new msi(pwt.C)).a(ae);
        (new hqr()).a(ae);
        (new hbs(af)).a(ae);
    }

    static flc a(fwu fwu1)
    {
        return fwu1.e;
    }

    public static fwu a(boolean flag)
    {
        fwu fwu1 = new fwu();
        Bundle bundle = new Bundle();
        bundle.putBoolean("provide_toolbar", flag);
        fwu1.f(bundle);
        return fwu1;
    }

    private void c(fux fux1)
    {
        int i = ah.d();
        fxj fxj1 = new fxj(ad);
        fxj1.a = i;
        fxj1.b = fux1;
        a(fxj1.a());
    }

    private void r()
    {
        if (aj.a() == 0)
        {
            d.c();
        } else
        {
            d.a(mxj.b);
        }
        g.a();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.qz, null);
        if (!super.q.getBoolean("provide_toolbar", true))
        {
            ((ViewGroup)layoutinflater).removeView(layoutinflater.findViewById(aa.E));
        }
        viewgroup = layoutinflater.findViewById(aa.r);
        d.e = new fgo(viewgroup);
        return layoutinflater;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle == null)
        {
            am = ag.b * 2;
        } else
        {
            am = bundle.getInt("LocalFoldersFragment.photo_load_max");
        }
        ai = new fxh(am);
        if (bundle == null)
        {
            h().a().a(aa.q, new hae()).b();
        }
        c.a(a, am + 1);
    }

    public final void a(PhotoTileView phototileview, ekp ekp)
    {
        al.a(ekp, phototileview, t());
    }

    public final void a(LocalFoldersHeaderView localfoldersheaderview, fux fux1)
    {
        boolean flag = false;
        if (fux1.b())
        {
            if (!h.b)
            {
                flag = true;
            }
            fwf.h(flag).a(super.B, "auto_backup_dialog");
            return;
        }
        fux1 = String.valueOf(fux1.b.get(0));
        if (h.b(fux1))
        {
            localfoldersheaderview.a(fxf.b, fux1);
        } else
        {
            localfoldersheaderview.a(fxf.a, fux1);
        }
        f.a(fux1);
    }

    public final void a(elb elb1)
    {
        try
        {
            b.a(ai, elb1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1)
        {
            elb1 = g().getString(b.qR);
        }
        Toast.makeText(O_(), elb1, 0).show();
        r();
    }

    public final void a(fux fux1)
    {
        c(fux1);
    }

    public final void a(Object obj)
    {
        obj = (List)obj;
        aj.a(((List) (obj)));
        ak.a();
        d.c = true;
        r();
    }

    public final void a(rv rv1)
    {
    }

    public final void a(rv rv1, boolean flag)
    {
        rv1.b(true);
        rv1.c(b.qK);
    }

    public final void b(fux fux1)
    {
        c(fux1);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ag = hbg.c(ad).a();
        aj = new hgz(ad, true, new fxi());
        bundle = ae;
        bundle.a(frm, this);
        bundle.a(hba, g);
        bundle.a(hbg, ag);
        bundle.a(fxx, this);
        bundle.a(fwy, this);
        bundle.a(fuu, h);
        bundle.a(hgz, aj);
        if (super.q.getBoolean("provide_toolbar", true))
        {
            (new fpj(af, (byte)0)).a(ae);
            (new hqv(this, af)).a(ae);
            (new dhj(this, Integer.valueOf(b.qD), aa.D)).a(ae);
            (new dhg(this, af, new fww(this), 0x102002c, null)).a(ae);
            (new dhg(this, af, new hzc(), aa.k, pwr.v)).a(ae);
            (new dhg(this, af, new fnn(fnl.e), aa.j, pwr.k)).a(ae);
            (new dhg(this, af, new egn(c.dG, c.dF, pwr.d), aa.i, null)).a(ae);
            ae.b(dhc, this);
        }
        ah = (mmr)ae.a(mmr);
        al = (gog)ae.a(gog);
        ak = (dha)ae.a(dha);
        (new gpg(this, af, this, al)).a(ae);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("LocalFoldersFragment.photo_load_max", am);
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
