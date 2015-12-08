// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.List;

public final class hxo extends omp
    implements fpl, hwp, hye, iwk
{

    private RecyclerView a;
    private iwm ag;
    private hyf ah;
    private hgz ai;
    private hsw aj;
    private hsq ak;
    private View al;
    private hxh am;
    private hxw an;
    private final hqr b;
    private final hxg c = new hxg();
    private hxb d;
    private mmr e;
    private hsr f;
    private final mxg g;
    private final nug h = new hxq(this);

    public hxo()
    {
        b = (new hqr()).a(ae);
        (new hzg(af)).a(ae);
        new fpk(af, this);
        new hwk(this, af);
        new hxj(af);
        (new dhg(this, af, c, c.eV, pwy.l)).a(ae);
        mxg mxg1 = new mxg(af);
        mxg1.e = new hxp(this);
        g = mxg1;
        ag = new iwm(this, af, this);
    }

    static View a(hxo hxo1)
    {
        return hxo1.al;
    }

    public static hxo a(hsw hsw1)
    {
        hxo hxo1 = new hxo();
        Bundle bundle = new Bundle();
        bundle.putString("extra_search_category", hsw1.name());
        hxo1.f(bundle);
        return hxo1;
    }

    private void a(boolean flag, boolean flag1)
    {
        if (flag)
        {
            g.a(mxj.a);
            return;
        }
        if (flag1)
        {
            g.a(mxj.c);
            return;
        } else
        {
            g.a(mxj.b);
            return;
        }
    }

    static hyf b(hxo hxo1)
    {
        return hxo1.ah;
    }

    static hsr c(hxo hxo1)
    {
        return hxo1.f;
    }

    static iwm d(hxo hxo1)
    {
        return hxo1.ag;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.yi, null);
        al = layoutinflater.findViewById(c.eJ);
        a = (RecyclerView)layoutinflater.findViewById(0x102000a);
        int i = (new nvq(ad)).a;
        ai = new hgz(ad, false, new hwt());
        viewgroup = new adc(ad, i);
        bundle = ai.e(i);
        viewgroup.a = bundle;
        a.a(viewgroup);
        a.a(new hgv((new nvq(ad)).b, i, bundle));
        a.a(ai);
        a.setOnTouchListener(new hxr(this));
        b.a(a);
        a(true, false);
        return layoutinflater;
    }

    public final void a(Bundle bundle)
    {
label0:
        {
            boolean flag1 = false;
            super.a(bundle);
            if (super.q != null)
            {
                aj = hsw.valueOf(super.q.getString("extra_search_category"));
            }
            byte byte0;
            int i;
            boolean flag;
            boolean flag2;
            if (aj == hsw.f)
            {
                byte0 = 2;
            } else
            {
                byte0 = 100;
            }
            bundle = ad;
            i = ((mmr)ae.a(mmr)).d();
            if (aj == hsw.f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ah = new hyf(bundle, i, byte0, flag);
            (new hyd(this, af, this)).a(e.d(), aj);
            d = new hxb(ad);
            flag2 = d.a(e.d());
            bundle = c;
            if (aj != hsw.f)
            {
                flag = flag1;
                if (aj != hsw.a)
                {
                    break label0;
                }
            }
            flag = flag1;
            if (flag2)
            {
                flag = true;
            }
        }
        bundle.a = flag;
    }

    public final void a(fpj fpj, Rect rect)
    {
        a.setPadding(0, rect.top, 0, rect.bottom);
    }

    public final void a(hsr hsr)
    {
        f = hsr;
        ag.a(ah, hsr);
    }

    public final void a(hsv hsv1)
    {
label0:
        {
label1:
            {
                if (!am.e())
                {
                    break label0;
                }
                if (hsv1.a() == hsw.a)
                {
                    hsv1 = (hsi)hsv1;
                    if (!hsv1.at_())
                    {
                        break label1;
                    }
                    am.a(hsv1);
                }
                return;
            }
            am.b(hsv1);
            return;
        }
        ak.a(hsv1);
    }

    public final void a(Object obj)
    {
        obj = (List)obj;
        a(false, ((List) (obj)).isEmpty());
        ai.a(((List) (obj)));
    }

    public final void aj_()
    {
        super.aj_();
        am.a.a(h);
        an.d();
    }

    public final void au_()
    {
        super.au_();
        am.a.a(h, true);
        if (aj != hsw.f && aj.b())
        {
            hxw hxw1 = an;
            String s = a(aj.j);
            if (hxw1.a != null)
            {
                hxw1.b.setText(s);
                hxw1.b.setVisibility(0);
                hxw1.a.setVisibility(8);
                hxw1.c.setVisibility(8);
            }
            return;
        } else
        {
            an.d();
            return;
        }
    }

    public final boolean b(hsv hsv1)
    {
        if (hsv1.a() == hsw.a && !am.e() && d.a(e.d()))
        {
            am.a((hsi)hsv1);
            am.a(hxi.a);
            return true;
        } else
        {
            return false;
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ak = (hsq)ae.a(hsq);
        e = (mmr)ae.a(mmr);
        am = (hxh)ae.a(hxh);
        an = (hxw)ae.a(hxw);
        bundle = ae;
        bundle.a(hwp, this);
        bundle.a("com.google.android.apps.photos.ScrollingToolbarManager.NEEDS_SHADOW", true);
    }
}
