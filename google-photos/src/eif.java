// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class eif extends omp
    implements ehw, emj, hhk, iwk
{

    private static final ekk a = (new ekm()).a(hjt).a(hjr).a(hkd).a(hkf).a(elj).a(hpe).a(hjp).a(hkj).a();
    private final aff ag = new eig(this);
    private nfw ah;
    private amh ai;
    private hgz aj;
    private ehz ak;
    private eia al;
    private View am;
    private final iwm b;
    private final emi c;
    private final mxg d;
    private final gfv e;
    private final hhi f;
    private final fqi g = new fqi();
    private final hba h = new hba();

    public eif()
    {
        b = new iwm(this, af, this);
        c = new emi(this, af, p.v, this);
        d = new mxg(af);
        e = new gfv(this, af);
        Object obj = new hhj(af);
        obj.a = this;
        f = ((hhj) (obj)).a();
        (new msi(pwt.k)).a(ae);
        (new hqr()).a(ae);
        obj = new eib(af, new eih(this));
        ae.b(dhc, obj);
    }

    static amh a(eif eif1)
    {
        return eif1.ai;
    }

    private void a(int i, int j, int k)
    {
        TextView textview = (TextView)am.findViewById(p.q);
        TextView textview1 = (TextView)am.findViewById(p.n);
        ImageView imageview = (ImageView)am.findViewById(p.o);
        Resources resources = g();
        textview.setText(resources.getString(i));
        textview1.setText(resources.getString(j));
        imageview.setImageResource(k);
    }

    static void a(eif eif1, Set set)
    {
        int i = set.size();
        if (i <= 1 || set != esm.e) goto _L2; else goto _L1
_L1:
        eif1.a(b.lF, b.lE, c.cu);
_L4:
        emi emi1 = eif1.c;
        eif1 = eif1.ah;
        b.u();
        emi1.a(b.a(((nfw) (eif1)).b, set), a);
        return;
_L2:
        if (i == 1)
        {
            esm esm1 = (esm)set.iterator().next();
            switch (eii.a[esm1.ordinal()])
            {
            default:
                eif1 = String.valueOf(esm1);
                throw new IllegalStateException((new StringBuilder(String.valueOf(eif1).length() + 18)).append("Unsupported type! ").append(eif1).toString());

            case 1: // '\001'
                eif1.a(b.lD, b.lC, c.ct);
                break;

            case 2: // '\002'
                eif1.a(b.lI, b.lH, c.cv);
                break;

            case 3: // '\003'
                eif1.a(b.lL, b.lK, c.cw);
                break;
            }
        } else
        {
            throw new IllegalStateException("Unknown state");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void t()
    {
        int j;
label0:
        {
            if (aj.a() == 0)
            {
                d.c();
            } else
            {
                d.a(mxj.b);
            }
            if (al != null)
            {
                int i = ((adi)h.b()).c();
                j = al.b;
                if (j == -1 || Math.abs(i - j) > 25)
                {
                    break label0;
                }
                hba hba1 = h;
                hba1.a(new hbe(hba1, j));
            }
            return;
        }
        hba hba2 = h;
        hba2.a(new hbc(hba2, j));
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.lv, null);
        am = layoutinflater.findViewById(p.p);
        d.e = new fgo(am);
        return layoutinflater;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle == null)
        {
            h().a().a(p.u, new hae()).b();
        }
    }

    public final void a(ekq ekq, hkf hkf1)
    {
        eii.a[hkf1.a.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 82
    //                   2 118
    //                   3 150;
           goto _L1 _L2 _L3 _L4
_L1:
        ekq = String.valueOf(hkf1.a);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 19)).append("Unrecognized type: ").append(ekq).toString());
_L2:
        hkf1 = ad;
        nfw nfw1 = ah;
        b.u();
        ekq = (new hom(hkf1, ekq, nfw1.b)).a();
_L8:
        a(((android.content.Intent) (ekq)));
_L6:
        return;
_L3:
        hkf1 = e;
        if (((gfv) (hkf1)).a.a("GetMovieMediaTask")) goto _L6; else goto _L5
_L5:
        ekq = gfu.a(ekq);
        ((gfv) (hkf1)).a.a(ekq);
        return;
_L4:
        hkf1 = ad;
        nfw nfw2 = ah;
        b.u();
        ekq = (new iup(hkf1, ekq, nfw2.b)).a();
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(elb elb1)
    {
        elb1 = (List)elb1.a();
        b.a(ak, elb1);
_L1:
        return;
        elb1;
        if (Log.isLoggable("CollectionsFragment", 5))
        {
            Log.w("CollectionsFragment", "Failed loading photos", elb1);
            t();
            return;
        }
          goto _L1
    }

    public final void a(Object obj)
    {
        obj = (eia)obj;
        al = ((eia) (obj));
        aj.a(((eia) (obj)).a);
        g.a(((eia) (obj)).c);
        h.a();
        if (!ah.f() || gcp.a(f.a))
        {
            d.c = true;
        }
        t();
    }

    public final void ad_()
    {
        t();
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ah = (nfw)ae.a(nfw);
        ai = (amh)ae.a(amh);
        aj = new hgz(ad, true, new eij());
        bundle = ad;
        Object obj = ah;
        b.u();
        ak = new ehz(bundle, ((nfw) (obj)).b);
        bundle = hbg.c(ad);
        bundle.c = Math.max((int)((float)g().getDisplayMetrics().widthPixels / (float)g().getDimensionPixelSize(b.lt)), 1);
        bundle.g = true;
        bundle.h = true;
        bundle = bundle.a();
        obj = ae;
        ((olm) (obj)).a(ehw, this);
        ((olm) (obj)).a(hba, h);
        ((olm) (obj)).a(hgz, aj);
        ((olm) (obj)).a(hbg, bundle);
        ((olm) (obj)).a(fqi, g);
        ((olm) (obj)).a(fsq, new ftl(aj, ehx.a(ad), bundle.a(), ((hbg) (bundle)).b));
        ((olm) (obj)).a(aff, ag);
    }

}
