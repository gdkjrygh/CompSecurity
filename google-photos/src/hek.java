// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class hek extends omp
    implements emj, heh, het
{

    private static final ekk a = (new ekm()).a(elj).a();
    private mmr ag;
    private noz ah;
    private ekq ai;
    private hex aj;
    private hzh ak;
    private hev al;
    private hgz am;
    private final emi b;
    private final iwm c;
    private final heg d;
    private final gfy e;
    private final ejo f;
    private final hfx g;
    private mpk h;

    public hek()
    {
        b = new emi(this, af, aw.d, this);
        c = new iwm(this, af, new hel(this));
        d = new heg(af, this);
        e = new gfy(af);
        f = new ejo(af, new hen(this), e);
        g = new hfx(this, af, new hep(this));
        new hey(af);
        new dsu(af);
    }

    static hzh a(hek hek1)
    {
        return hek1.ak;
    }

    static void a(hek hek1, List list)
    {
        hgz hgz2;
        int i;
        int k;
        if (hek1.ag.e())
        {
            i = 3;
        } else
        {
            i = 1;
        }
        if (hek1.am.a() > i)
        {
            hgz hgz1 = hek1.am;
            int j = hek1.am.a() - i;
            hgz1.b().d(i, j);
            ((aen) (hgz1)).a.b(i, j);
        }
        hgz2 = hek1.am;
        i = hek1.am.a();
        hgz2.b().a(i, list);
        k = list.size();
        ((aen) (hgz2)).a.a(i, k);
    }

    static hfx b(hek hek1)
    {
        return hek1.g;
    }

    static void b(hek hek1, List list)
    {
        if (hek1.f.a(ejm.c, list))
        {
            hek1.g.b().a(hek1.a(b.vE)).a(true);
        }
    }

    static olq c(hek hek1)
    {
        return hek1.ad;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (RecyclerView)layoutinflater.inflate(b.vq, null);
        layoutinflater.a(new adi(ad));
        am = new hgz(ad, true, new heo());
        layoutinflater.a(am);
        if (ag.e())
        {
            viewgroup = a(b.vA);
            am.a(am.a(), new heq(-1L, viewgroup, ai, pwx.a));
            am.a(am.a(), new hei(-2L));
            viewgroup = new ehr(b.a(ag.d(), null), aj.a);
            bundle = d;
            bundle.a = viewgroup;
            bundle.a();
        }
        viewgroup = a(b.vz);
        am.a(am.a(), new hez(-3L, viewgroup));
        return layoutinflater;
    }

    public final void a(int i, ekp ekp)
    {
        heq heq1 = (heq)am.f(0);
        heq1.c = ekp;
        heq1.b = al.a(i);
        am.c(0);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (ag.e())
        {
            ai = b.a(ag.d(), ad);
        }
        b.a(fux.a(ag.d()), a);
    }

    public final void a(elb elb1)
    {
        try
        {
            iwg iwg1 = iwg.a(new hew()).b(new heu(ad, aj.a, al));
            c.a(iwg1, elb1.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1)
        {
            return;
        }
    }

    public final void a(heq heq1)
    {
        Object obj = heq1.a;
        heq1 = ((rz)O_()).e().a().b().toString();
        String s = a(b.vB);
        if (((ekq) (obj)).equals(ai))
        {
            obj = new hee(ad);
            obj.a = ag.d();
            obj.h = aj.a;
            obj = ((hee) (obj)).a(aj.b);
            obj.f = heq1;
            obj.g = s;
            heq1 = ((hee) (obj)).a();
        } else
        {
            fxj fxj1 = new fxj(ad);
            fxj1.a = ag.d();
            fxj1.b = ((ekq) (obj));
            fxj1.c = aj.a;
            int i;
            if (aj.b)
            {
                i = 1;
            } else
            {
                i = 2;
            }
            fxj1.d = i;
            fxj1.e = heq1;
            fxj1.f = s;
            heq1 = fxj1.a();
        }
        h.a(aw.e, heq1);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        aj = (hex)ae.a(hex);
        ag = (mmr)ae.a(mmr);
        ak = (hzh)ae.a(hzh);
        ah = noz.a(ad, "ExternalPicker", new String[0]);
        h = (mpk)ae.a(mpk);
        h.a(aw.e, new hem(this));
        al = new hev(ad, aj.a);
        ae.a(het, this);
    }

}
