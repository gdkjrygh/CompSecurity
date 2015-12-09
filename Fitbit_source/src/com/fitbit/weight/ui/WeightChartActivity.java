// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight.ui;

import android.widget.ArrayAdapter;
import com.fitbit.data.bl.bv;
import com.fitbit.home.ui.DetailActivity;
import com.fitbit.savedstate.v;
import com.fitbit.ui.AbsChartActivity;
import java.util.UUID;

// Referenced classes of package com.fitbit.weight.ui:
//            WeightChartFragment, LeanVsFatChartFragment, BmiChartFragment

public class WeightChartActivity extends AbsChartActivity
    implements com.fitbit.util.ar.a
{

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private static final String d = "com.fitbit.weight.ui.ChartFragment.FRAGMENT_WEIGHT";
    private static final String e = "com.fitbit.weight.ui.ChartFragment.FRAGMENT_LEAN_VS_FAT";
    private static final String f = "com.fitbit.weight.ui.ChartFragment.FRAGMENT_BMI";

    public WeightChartActivity()
    {
    }

    protected int a(int i, com.fitbit.util.chart.Filter.Type type)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown item '").append(i).append("'").toString());

        case 0: // '\0'
            return 0x7f080590;

        case 1: // '\001'
            return 0x7f0801b8;

        case 2: // '\002'
            return 0x7f080090;
        }
    }

    protected void a(ArrayAdapter arrayadapter)
    {
        arrayadapter.add(getString(0x7f080595));
        arrayadapter.add(getString(0x7f08038d));
        arrayadapter.add(getString(0x7f08008f));
    }

    protected void a(com.fitbit.data.bl.SyncDataForLongPeriodOperation.Ranges ranges)
    {
        p();
        m = UUID.randomUUID();
        startService(bv.a(this, com.fitbit.data.bl.SyncDataForLongPeriodOperation.Ranges.e, true, m));
    }

    protected int b(int i, com.fitbit.util.chart.Filter.Type type)
    {
        return 0;
    }

    protected String c(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown item '").append(i).append("'").toString());

        case 0: // '\0'
            return "com.fitbit.weight.ui.ChartFragment.FRAGMENT_WEIGHT";

        case 1: // '\001'
            return "com.fitbit.weight.ui.ChartFragment.FRAGMENT_LEAN_VS_FAT";

        case 2: // '\002'
            return "com.fitbit.weight.ui.ChartFragment.FRAGMENT_BMI";
        }
    }

    protected void d()
    {
        DetailActivity.a(this);
    }

    protected void d(int i)
    {
        v.b(i);
    }

    protected int e()
    {
        return v.i();
    }

    protected void e(int i)
    {
        v.a(i);
    }

    protected int f()
    {
        return v.h();
    }

    protected com.fitbit.util.chart.Filter.Type f(int i)
    {
        switch (i)
        {
        default:
            return com.fitbit.util.chart.Filter.Type.a;

        case 2131820670: 
            return com.fitbit.util.chart.Filter.Type.b;

        case 2131820671: 
            return com.fitbit.util.chart.Filter.Type.h;

        case 2131820672: 
            return com.fitbit.util.chart.Filter.Type.k;

        case 2131820673: 
            return com.fitbit.util.chart.Filter.Type.n;
        }
    }

    protected int g()
    {
        return 0x7f0400d3;
    }

    protected Class g(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown item '").append(i).append("'").toString());

        case 0: // '\0'
            return com/fitbit/weight/ui/WeightChartFragment;

        case 1: // '\001'
            return com/fitbit/weight/ui/LeanVsFatChartFragment;

        case 2: // '\002'
            return com/fitbit/weight/ui/BmiChartFragment;
        }
    }

    protected int h(int i)
    {
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
        default:
            return 0x7f11007e;

        case 2: // '\002'
            return 0x7f11007f;

        case 3: // '\003'
            return 0x7f110080;

        case 4: // '\004'
            return 0x7f110081;
        }
    }
}
