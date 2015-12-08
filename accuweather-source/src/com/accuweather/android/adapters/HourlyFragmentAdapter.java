// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.accuweather.android.fragments.HourlyDetailsFragment;
import com.accuweather.android.models.hourly.HourlyResult;
import com.accuweather.android.utilities.Logger;
import java.util.List;

// Referenced classes of package com.accuweather.android.adapters:
//            DetailsFragmentAdapter

public class HourlyFragmentAdapter extends DetailsFragmentAdapter
{

    public HourlyFragmentAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
    }

    public Fragment getItem(int i)
    {
        if (Logger.isDebugEnabled())
        {
            Logger.i(this, (new StringBuilder()).append("GetItem at ").append(i).toString());
        }
        return HourlyDetailsFragment.newInstance((HourlyResult)getContent().get(i));
    }
}
