// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.tablet;

import android.os.Bundle;
import com.accuweather.android.fragments.HourlyDetailsFragment;
import com.accuweather.android.models.hourly.HourlyResult;

public class HourlyDetailsTabletFragment extends HourlyDetailsFragment
{

    public HourlyDetailsTabletFragment()
    {
    }

    public static HourlyDetailsTabletFragment newInstance(HourlyResult hourlyresult, String s)
    {
        HourlyDetailsTabletFragment hourlydetailstabletfragment = new HourlyDetailsTabletFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("content", hourlyresult);
        bundle.putString("title", s);
        hourlydetailstabletfragment.setArguments(bundle);
        return hourlydetailstabletfragment;
    }
}
