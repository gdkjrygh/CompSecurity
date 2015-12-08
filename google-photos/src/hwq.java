// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public final class hwq extends afn
{

    static final ayt o;
    private final nug A = new hwr(this);
    private final hya B;
    final Context p;
    final frs q;
    final hxh r;
    final amh s;
    final fli t;
    public final ImageView u;
    public final TextView v;
    public final ImageView w;
    public final ImageView x;
    public final CheckBox y;
    hsv z;

    private hwq(View view)
    {
        super(view);
        p = view.getContext();
        u = (ImageView)view.findViewById(c.eO);
        v = (TextView)view.findViewById(c.eP);
        w = (ImageView)view.findViewById(c.eN);
        x = (ImageView)view.findViewById(c.eL);
        y = (CheckBox)view.findViewById(c.eM);
        q = new frs(u);
        s = (amh)olm.a(p, amh);
        t = (fli)olm.a(p, fli);
        r = (hxh)olm.a(p, hxh);
        B = (hya)olm.a(p, hya);
        view.addOnAttachStateChangeListener(new hws(this));
    }

    static hsv a(hwq hwq1)
    {
        return hwq1.z;
    }

    public static hwq a(ViewGroup viewgroup)
    {
        return new hwq(LayoutInflater.from(viewgroup.getContext()).inflate(b.yj, viewgroup, false));
    }

    static nug b(hwq hwq1)
    {
        return hwq1.A;
    }

    static hxh c(hwq hwq1)
    {
        return hwq1.r;
    }

    final void a(View view, int i)
    {
        msn msn1 = new msn();
        msn1.a(new msm(pwy.d));
        if (r.e())
        {
            msp msp;
            if (z.at_())
            {
                msp = pwy.i;
            } else
            {
                msp = pwy.h;
            }
            msn1.a(new msm(msp));
        }
        msn1.a(hya.a(z.a()));
        msn1.a(view);
        mry.a(p, i, msn1);
    }

    public final void t()
    {
        if (r.d != hxi.a) goto _L2; else goto _L1
_L1:
        if (z != null && !z.at_()) goto _L4; else goto _L3
_L3:
        q.b();
_L6:
        return;
_L4:
        q.a();
        return;
_L2:
        if (!r.e())
        {
            q.b();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void u()
    {
        boolean flag = false;
        if (z == null)
        {
            return;
        }
        if (r.d == hxi.a && z.a() == hsw.a)
        {
            u.setAlpha(1.0F);
            x.setVisibility(8);
            y.setVisibility(0);
            CheckBox checkbox = y;
            if (!z.at_())
            {
                flag = true;
            }
            checkbox.setChecked(flag);
            return;
        }
        if (r.d == hxi.b && !z.at_())
        {
            u.setAlpha(0.3F);
            x.setVisibility(0);
            y.setVisibility(8);
            return;
        } else
        {
            u.setAlpha(1.0F);
            x.setVisibility(8);
            y.setVisibility(8);
            return;
        }
    }

    static 
    {
        o = (ayt)((ayt)(new ayt()).a(p.av)).c();
    }
}
