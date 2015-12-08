// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.tablet;

import android.os.Bundle;
import com.accuweather.android.fragments.DailyDetailsFragment;
import com.accuweather.android.models.daily.DailyForecast;

public class DailyDetailsTabletFragment extends DailyDetailsFragment
{

    public DailyDetailsTabletFragment()
    {
    }

    public static DailyDetailsTabletFragment newInstance(DailyForecast dailyforecast, int i, String s)
    {
        DailyDetailsTabletFragment dailydetailstabletfragment = new DailyDetailsTabletFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("content", dailyforecast);
        bundle.putInt("additional_content", i);
        bundle.putString("title", s);
        dailydetailstabletfragment.setArguments(bundle);
        return dailydetailstabletfragment;
    }
}
