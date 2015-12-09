// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartCollection;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.a;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.ChartView;
import com.artfulbits.aiCharts.Enums.Alignment;
import com.artfulbits.aiCharts.Types.x;
import com.artfulbits.aiCharts.a.b;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.util.ap;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExerciseGraphFragment extends Fragment
{

    private static final int a = 30;
    private static final String b = "type";
    private static final double c = 0.20000000000000001D;
    private ChartView d;
    private TextView e;
    private ImageView f;
    private Type g;
    private b h;
    private List i;
    private a j;

    public ExerciseGraphFragment()
    {
    }

    public static ExerciseGraphFragment a(Type type)
    {
        ExerciseGraphFragment exercisegraphfragment = new ExerciseGraphFragment();
        Bundle bundle = new Bundle();
    /* block-local class not found */
    class Type {}

        bundle.putInt("type", type.ordinal());
        exercisegraphfragment.setArguments(bundle);
        return exercisegraphfragment;
    }

    private void a()
    {
        d.k().clear();
        d.h().clear();
        if (i == null)
        {
            i = new ArrayList();
        }
        double ad[] = b(i);
        Object obj = ((a)d.g().get(0)).e();
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        com.fitbit.heartrate.charts.a.b(fragmentactivity, ((ChartAxis) (obj)).s());
        com.fitbit.heartrate.charts.a.a(fragmentactivity, ((ChartAxis) (obj)).r());
        ((ChartAxis) (obj)).d((int)ap.b(10F));
        ((ChartAxis) (obj)).a(j);
        ((ChartAxis) (obj)).a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.a);
        ((ChartAxis) (obj)).a(Alignment.b);
        obj = ((ChartAxis) (obj)).k();
        ((Paint) (obj)).setColor(-1);
        ((Paint) (obj)).setTextSize(getResources().getDimension(0x7f0a00e2));
        a(ad);
        b();
    }

    private void a(double ad[])
    {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable1;
        android.graphics.drawable.Drawable drawable2;
        ChartSeries chartseries;
        ChartSeries chartseries1;
        ChartSeries chartseries2;
        chartseries = new ChartSeries(x.F);
        chartseries1 = new ChartSeries(x.F);
        chartseries2 = new ChartSeries(x.F);
        drawable2 = null;
        drawable1 = null;
        drawable = null;
    /* anonymous class not found */
    class _anm1 {}

        com.fitbit.runtrack.ui._cls1.a[g.ordinal()];
        JVM INSTR tableswitch 1 3: default 84
    //                   1 193
    //                   2 229
    //                   3 265;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_265;
_L5:
        double d1;
        d1 = 0.0D;
        int k1 = ad.length;
        int i1 = 0;
        int k = 0;
        while (i1 < k1) 
        {
            double d2 = ad[i1];
            if (d2 == 0.0D)
            {
                j j1 = new j(k, new double[] {
                    0.0D
                });
                j1.a(null);
                j1.a(Integer.valueOf(0));
                j1.c(drawable2);
                chartseries2.F().b(j1);
            } else
            {
                j j2 = chartseries.F().a(k, new double[] {
                    d2
                });
                j2.a(null);
                j2.a(Integer.valueOf(0));
                j2.a(drawable);
                j2 = chartseries.F().a(k, new double[] {
                    -d2 * 0.20000000000000001D
                });
                j2.a(Integer.valueOf(0));
                j2.a(drawable1);
            }
            if (d2 > d1)
            {
                d1 = d2;
            }
            i1++;
            k++;
        }
        break MISSING_BLOCK_LABEL_392;
_L2:
        drawable2 = getResources().getDrawable(0x7f0201b0);
        drawable1 = getResources().getDrawable(0x7f0201b1);
        drawable = getResources().getDrawable(0x7f0201af);
          goto _L5
_L3:
        drawable2 = getResources().getDrawable(0x7f02019e);
        drawable1 = getResources().getDrawable(0x7f02019f);
        drawable = getResources().getDrawable(0x7f02019d);
          goto _L5
        drawable2 = getResources().getDrawable(0x7f020104);
        drawable1 = getResources().getDrawable(0x7f020105);
        drawable = getResources().getDrawable(0x7f020103);
          goto _L5
    /* block-local class not found */
    class a {}

        j.a(d1);
        ((a)d.g().get(0)).d().a().a(-0.5D, (double)29 + 0.5D);
        ((a)d.g().get(0)).e().a().a(-0.20000000000000001D * j.a(), j.a());
        ((a)d.g().get(0)).a((int)getResources().getDimension(0x7f0a00b0), (int)getResources().getDimension(0x7f0a00b2), (int)getResources().getDimension(0x7f0a00b1), 0);
        d.h().add(chartseries);
        d.h().add(chartseries1);
        d.h().add(chartseries2);
        ad = new ChartSeries("annotationSeries", x.F);
        ad.F().a(29, new double[] {
            0.0D
        });
        d.h().add(ad);
        h = com.artfulbits.aiCharts.a.b.a("annotationSeries", 0);
        return;
    }

    private void b()
    {
        ChartCollection chartcollection = d.k();
        chartcollection.clear();
        if (h != null)
        {
            com.fitbit.heartrate.charts.a.a(getActivity(), chartcollection, h);
        }
    }

    private double[] b(List list)
    {
        Profile profile;
        java.util.Date date;
        double ad[];
        profile = an.a().b();
        date = o.b();
        ad = new double[30];
        list = list.iterator();
_L9:
        if (!list.hasNext()) goto _L2; else goto _L1
_L1:
        double d1;
        Object obj;
        int k;
        obj = (ActivityLogEntry)list.next();
        k = (int)o.f(((ActivityLogEntry) (obj)).getLogDate(), date);
        d1 = 0.0D;
        com.fitbit.runtrack.ui._cls1.a[g.ordinal()];
        JVM INSTR tableswitch 1 3: default 100
    //                   1 111
    //                   2 124
    //                   3 153;
           goto _L3 _L4 _L5 _L6
_L3:
        if (29 - k >= 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        return ad;
_L4:
        d1 = ((ActivityLogEntry) (obj)).a(TimeUnit.MINUTES);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = ((ActivityLogEntry) (obj)).b();
        if (obj != null)
        {
            d1 = ((Length) (obj)).a(profile.t()).b();
        }
        continue; /* Loop/switch isn't completed */
_L6:
        double d2 = ((ActivityLogEntry) (obj)).n();
        d1 = d2;
        if (d2 == -1D)
        {
            d1 = ((ActivityLogEntry) (obj)).i();
        }
        if (true) goto _L3; else goto _L7
_L7:
        k = 29 - k;
        ad[k] = d1 + ad[k];
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void a(List list)
    {
        i = list;
        if (isResumed())
        {
            a();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400f4, viewgroup, false);
        d = (ChartView)layoutinflater.findViewById(0x7f11035f);
        e = (TextView)layoutinflater.findViewById(0x7f11035e);
        f = (ImageView)layoutinflater.findViewById(0x7f11035d);
        g = Type.values()[getArguments().getInt("type")];
        j = new a(g);
        switch (com.fitbit.runtrack.ui._cls1.a[g.ordinal()])
        {
        default:
            return layoutinflater;

        case 1: // '\001'
            e.setText(0x7f08019a);
            f.setImageResource(0x7f020263);
            return layoutinflater;

        case 2: // '\002'
            viewgroup = an.a().b();
            e.setText(getString(0x7f080199, new Object[] {
                viewgroup.t().name().toLowerCase()
            }));
            f.setImageResource(0x7f020262);
            return layoutinflater;

        case 3: // '\003'
            e.setText(0x7f080198);
            break;
        }
        f.setImageResource(0x7f020257);
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        a();
    }
}
