// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.os.Bundle;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.j;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.ui.FitbitChartView;
import com.fitbit.util.format.DistanceDecimalFormat;
import java.text.DecimalFormat;
import java.text.Format;

// Referenced classes of package com.fitbit.activity.ui:
//            IntradayActivityChartFragment

public class DistanceIntradayActivityChartFragment extends IntradayActivityChartFragment
{

    private com.fitbit.data.domain.Length.LengthUnits d;

    public DistanceIntradayActivityChartFragment()
    {
    }

    public Format a()
    {
        DistanceDecimalFormat distancedecimalformat = new DistanceDecimalFormat(d);
        distancedecimalformat.setMaximumFractionDigits(1);
        return distancedecimalformat;
    }

    protected void a(j j1)
    {
        super.a(j1);
        if (isResumed() && d != null && d != com.fitbit.data.domain.Length.LengthUnits.KM)
        {
            j1.b((new Length(j1.a(0), com.fitbit.data.domain.Length.LengthUnits.KM)).a(d).b());
        }
    }

    protected void a(FitbitChartView fitbitchartview)
    {
        super.a(fitbitchartview);
        DecimalFormat decimalformat = new DecimalFormat();
        decimalformat.setMinimumFractionDigits(0);
        decimalformat.setMaximumFractionDigits(2);
        ((ChartSeries)fitbitchartview.h().get(0)).E().b(decimalformat);
    }

    public void b()
    {
    }

    protected double h_()
    {
        return 0.050000000000000003D;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = an.a().b().t();
    }
}
