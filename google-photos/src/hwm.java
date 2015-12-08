// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Map;

public final class hwm extends hgu
{

    final hsv a;
    private final int b;
    private final int c;

    public hwm(int i, hsv hsv1, int j)
    {
        boolean flag;
        if ((hsv1 instanceof hsc) || (hsv1 instanceof hsi))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        b = i;
        a = hsv1;
        c = j;
    }

    static void a(hwm hwm1, View view, String s)
    {
        view.announceForAccessibility(s);
    }

    public final int a()
    {
        return c.eZ;
    }

    public final void a(afn afn1)
    {
        Context context;
        hwp hwp1;
        hwq hwq1;
        context = afn1.a.getContext();
        hwp1 = (hwp)olm.a(context, hwp);
        hwq1 = (hwq)afn1;
        hwq1.v.setContentDescription(null);
        if (a.a() != hsw.d) goto _L2; else goto _L1
_L1:
        afn1 = a;
        hwq1.z = afn1;
        afn1 = (hsc)afn1;
        hwq1.a.setBackgroundColor(hwq1.p.getResources().getColor(hsb.d(((hsc) (afn1)).a)));
        String s = hwq1.p.getResources().getString(hsb.b(((hsc) (afn1)).a));
        hwq1.v.setText(s);
        hwq1.v.setBackgroundResource(0);
        hwq1.w.setVisibility(0);
        hwq1.w.setImageResource(hsb.c(((hsc) (afn1)).a));
        hwq1.s.a(hwq1.u);
        hwq1.u.setVisibility(4);
        hwq1.x.setVisibility(8);
        hwq1.y.setVisibility(8);
_L7:
        hwq1.a.setOnClickListener(new hwn(this, hwq1, hwp1, context));
        hwq1.a.setOnLongClickListener(new hwo(this, hwq1, context, hwp1));
        return;
_L2:
        hsv hsv1;
        int j;
        hsv1 = a;
        j = b;
        hwq1.z = hsv1;
        afn1 = (hsi)hsv1;
        if (!hwq1.r.e()) goto _L4; else goto _L3
_L3:
        if (!hwq1.r.b.containsKey(Integer.valueOf(afn1.b()))) goto _L6; else goto _L5
_L5:
        hsv1.h_(false);
_L4:
        hwq1.a.setBackgroundColor(hwq1.p.getResources().getColor(p.av));
        Object obj = hsv1.c();
        boolean flag = TextUtils.isEmpty(((CharSequence) (obj)));
        hwq1.v.setText(((CharSequence) (obj)));
        if (flag && hsv1.a().equals(hsw.a))
        {
            hwq1.v.setContentDescription(hwq1.p.getString(c.fh));
        }
        obj = hwq1.v;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = b.xZ;
        }
        ((TextView) (obj)).setBackgroundResource(i);
        hwq1.w.setVisibility(8);
        if (!TextUtils.isEmpty(((hsi) (afn1)).a.c))
        {
            afn1 = new gat(((hsi) (afn1)).a.c, j);
        } else
        {
            afn1 = null;
        }
        hwq1.u.setVisibility(0);
        hwq1.s.a(afn1).a(((ayt)hwq.o.a(hwq1.p)).a(hwq1.t.a(), hsp.a)).a(hwq1.u);
        hwq1.u();
        if (hwq1.r.d == hxi.a && hsv1.a() == hsw.a && !hsv1.at_())
        {
            afn1 = hwq1.q;
            ((frs) (afn1)).a.setScaleX(afn1.c());
            ((frs) (afn1)).a.setScaleY(afn1.c());
        } else
        {
            hwq1.q.a(false);
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (hwq1.r.c.containsKey(Integer.valueOf(afn1.b())))
        {
            hsv1.h_(true);
        }
          goto _L4
    }

    public final int b(int i)
    {
        return c % i;
    }
}
