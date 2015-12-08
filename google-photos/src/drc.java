// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class drc extends omp
    implements drl, gmm, jia
{

    private static int a;
    private static final ekw b;
    private final exi ag;
    private hbg ah;
    private glr ai;
    private jhm aj;
    private hgz ak;
    private gmk al;
    private fnh am;
    private ekq an;
    private final exl c = new drd(this);
    private final doy d;
    private final fqi e = new fqi();
    private final hba f = new hba();
    private final gmn g;
    private final exj h;

    public drc()
    {
        d = new doy(af);
        g = new gmn(this, af);
        h = new exj(af, eyz.d, c);
        ag = new exi(af, eyz.c);
        (new msi(pwt.e)).a(ae);
        (new hqr()).a(ae);
    }

    public static drc a(ekq ekq1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.photos.core.media_collection", ekq1);
        ekq1 = new drc();
        ekq1.f(bundle);
        return ekq1;
    }

    static olm a(drc drc1)
    {
        return drc1.ae;
    }

    static exi b(drc drc1)
    {
        return drc1.ag;
    }

    static exj c(drc drc1)
    {
        return drc1.h;
    }

    static gmk d(drc drc1)
    {
        return drc1.al;
    }

    static olm e(drc drc1)
    {
        return drc1.ae;
    }

    static hgz f(drc drc1)
    {
        return drc1.ak;
    }

    static doy g(drc drc1)
    {
        return drc1.d;
    }

    static fnh h(drc drc1)
    {
        return drc1.am;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(b.iX, null);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        an = (ekq)super.q.getParcelable("com.google.android.apps.photos.core.media_collection");
        Object obj = ag;
        Object obj1 = an;
        Object obj2 = b;
        obj.a = ((ekq) (obj1));
        obj.b = ((ekw) (obj2));
        obj = new ehr(an, b);
        obj1 = new dqz(((ehr) (obj)), ai, d, 1);
        al = new gmk(h.a(an, b, ((gml) (obj1)), 1, new drk()), this);
        obj2 = d;
        ekq ekq1 = an;
        obj2.c = new drg(this);
        if (!ekq1.equals(((doy) (obj2)).b))
        {
            obj2.b = ekq1;
            obj2.d = false;
        }
        g.a(((ehr) (obj)), ai, al, ((gml) (obj1)));
        ak.a(al);
        if (bundle == null)
        {
            h().a().a(c.ca, new hae()).b();
        }
    }

    public final void a(MotionEvent motionevent)
    {
        jhm jhm1 = aj;
        motionevent = new Point((int)motionevent.getRawX(), (int)motionevent.getRawY());
        if (jhm1.a.size() > jhm1.a.indexOf(jhm1.c) + 1)
        {
            jhm1.a((Enum)jhm1.a.get(jhm1.a.indexOf(jhm1.c) + 1), motionevent);
        }
    }

    public final void ac_()
    {
        f.a();
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        am = (fnh)ae.a(fnh);
        aj = (jhm)ae.a(jhm);
        bundle = new drh(this);
        hbi hbi1 = new hbi(ad, new hbl[] {
            new dre(this, c.cd, 0), new drf(this, c.ce, drt.a(ad))
        });
        int i = ad.getResources().getDimensionPixelSize(a);
        int j = ad.getResources().getDimensionPixelSize(b.iT);
        ak = new hgz(ad, false, hbi1);
        Object obj = hbg.c(ad);
        obj.b = hap.a;
        obj.d = false;
        obj.e = i;
        obj.f = false;
        obj.h = true;
        ah = ((hbh) (obj)).a();
        obj = ae;
        ((olm) (obj)).a("com.google.android.apps.photos.recycleradapter.LABEL_KEY", fnj.a.toString());
        ((olm) (obj)).a(hgz, ak);
        ((olm) (obj)).a(hbg, ah);
        ((olm) (obj)).a(hba, f);
        ((olm) (obj)).a(haz, hbi1);
        ((olm) (obj)).a(fqi, e);
        ((olm) (obj)).a(fsq, new gzw(ak, e, new drj(this, i, j), hbi1, c.ce));
        ((olm) (obj)).b(hbu, bundle);
        ((olm) (obj)).b(ftd, bundle);
        ai = (glr)ae.a(glr);
    }

    public final jhz s()
    {
        return new drp(ad, an, f, ah, new dri(this));
    }

    static 
    {
        a = b.iU;
        b = ekw.a;
    }
}
