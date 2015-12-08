// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.artfulbits.aiCharts.Base.j;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.util.format.FitbitTimeFormat;
import com.fitbit.weight.ui.a;
import java.text.Format;

// Referenced classes of package com.fitbit.activity.ui:
//            IntradayActivityChartFragment

public class MinutesVeryActiveIntradayActivityChartFragment extends IntradayActivityChartFragment
{

    public MinutesVeryActiveIntradayActivityChartFragment()
    {
    }

    protected Drawable a(j j, TimeSeriesObject timeseriesobject)
    {
        return com.fitbit.weight.ui.a.a(3);
    }

    public Format a()
    {
        return new FitbitTimeFormat();
    }

    public void a(View view, j j, TextView textview, TextView textview1, TextView textview2)
    {
        if (isResumed())
        {
            textview1.setVisibility(8);
        }
    }

    public void b()
    {
    }
}
