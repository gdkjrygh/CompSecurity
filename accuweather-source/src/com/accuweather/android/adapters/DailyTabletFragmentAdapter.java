// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.tablet.DailyDetailsTabletFragment;
import java.util.List;

// Referenced classes of package com.accuweather.android.adapters:
//            DailyFragmentAdapter

public class DailyTabletFragmentAdapter extends DailyFragmentAdapter
{

    public DailyTabletFragmentAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
    }

    public Fragment getItem(int i)
    {
        String s = "";
        if (mTitles.size() > i)
        {
            s = (String)mTitles.get(i);
        }
        return DailyDetailsTabletFragment.newInstance((DailyForecast)mFragmentArguments.get(i), i, s);
    }
}
