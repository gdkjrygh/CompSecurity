// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import java.util.GregorianCalendar;

// Referenced classes of package com.fitbit.activity.ui:
//            h, IntradayActivityChartFragment

public class g extends FragmentStatePagerAdapter
{

    public static final int a = 365;
    private com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType b;

    public g(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
        b = com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY;
    }

    public com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType a()
    {
        return b;
    }

    public void a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype)
    {
        if (timeseriesresourcetype != b)
        {
            b = timeseriesresourcetype;
            notifyDataSetChanged();
        }
    }

    public int getCount()
    {
        return 365;
    }

    public Fragment getItem(int i)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar();
        gregoriancalendar.add(5, -(getCount() - i - 1));
        IntradayActivityChartFragment intradayactivitychartfragment = (new h()).a(b).a(gregoriancalendar.getTime()).a();
        intradayactivitychartfragment.a(gregoriancalendar.getTime());
        return intradayactivitychartfragment;
    }

    public int getItemPosition(Object obj)
    {
        return -2;
    }
}
