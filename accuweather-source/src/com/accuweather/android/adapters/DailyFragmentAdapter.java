// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.accuweather.android.fragments.DailyDetailsFragment;
import com.accuweather.android.models.daily.DailyForecast;
import java.util.List;

// Referenced classes of package com.accuweather.android.adapters:
//            DetailsFragmentAdapter

public class DailyFragmentAdapter extends DetailsFragmentAdapter
{

    public DailyFragmentAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
    }

    public Fragment getItem(int i)
    {
        return DailyDetailsFragment.newInstance((DailyForecast)getContent().get(i), i);
    }
}
