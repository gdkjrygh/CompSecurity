// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.charts.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.a.a.a.a;
import com.fitbit.FitBitApplication;
import com.fitbit.util.al;
import com.fitbit.util.ap;
import com.fitbit.util.be;
import com.fitbit.util.format.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class HeartRateZonesChartView extends FrameLayout
    implements Callable
{
    public static class a
    {

        private String a;
        private long b;
        private int c;

        public String a()
        {
            return a;
        }

        public long b()
        {
            return b;
        }

        public int c()
        {
            return c;
        }

        public a(String s, long l, int i)
        {
            a = s;
            b = l;
            c = i;
        }
    }


    private static final String b = "HeartRateZonesChartView";
    private static final double c = 0.59999999999999998D;
    private static final int d = (int)ap.b(1.5F);
    protected LinearLayout a;
    private boolean e;
    private int f;
    private List g;

    public HeartRateZonesChartView(Context context)
    {
        super(context);
    }

    public HeartRateZonesChartView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public HeartRateZonesChartView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void b()
    {
        int i;
        int j;
        j = getContext().getResources().getColor(0x7f0f00c1);
        a.removeAllViews();
        f = 0;
        for (Iterator iterator = g.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            f = (int)((long)f + a1.b());
        }

        i = 0;
_L7:
        if (i >= g.size()) goto _L2; else goto _L1
_L1:
        a a2;
        View view1;
        StringBuilder stringbuilder;
        long l;
        a2 = (a)g.get(i);
        l = a2.b();
        view1 = LayoutInflater.from(getContext()).inflate(0x7f040176, a, false);
        View view = view1.findViewById(0x7f110423);
        view.setBackgroundResource(a2.c());
        view.getLayoutParams().width = d + (int)((double)l * ((0.59999999999999998D * (double)getMeasuredWidth()) / (double)f));
        stringbuilder = new StringBuilder();
        if (l >= 60L) goto _L4; else goto _L3
_L3:
        Object obj = null;
        com.a.a.a.a a3 = FitBitApplication.a().e();
        if (a3 != null)
        {
            try
            {
                obj = a3.a(0x7f0b000e, (int)l, al.j());
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                notfoundexception = getContext().getString(0x7f0803d8);
            }
        }
        stringbuilder.append(l);
        stringbuilder.append(" ");
        stringbuilder.append(((String) (obj)));
_L5:
        obj = new be();
        ((be) (obj)).a(new StyleSpan(1), stringbuilder.toString());
        ((be) (obj)).setSpan(new ForegroundColorSpan(j), 0, stringbuilder.length(), 33);
        ((be) (obj)).append(" ");
        ((be) (obj)).append(a2.a());
        ((TextView)view1.findViewById(0x7f110319)).setText(((CharSequence) (obj)));
        a.addView(view1);
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append(com.fitbit.util.format.e.a(getContext(), l));
        if (true) goto _L5; else goto _L2
_L2:
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public Boolean a()
        throws Exception
    {
        b();
        invalidate();
        return Boolean.valueOf(true);
    }

    public void a(List list)
    {
        g = list;
        if (!e)
        {
            com.fitbit.util.f.a.a(this, this);
            return;
        } else
        {
            b();
            postInvalidate();
            return;
        }
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        e = true;
    }

}
