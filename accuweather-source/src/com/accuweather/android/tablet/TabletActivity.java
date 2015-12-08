// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.tablet;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.accuweather.android.AnalyticsPrimaryActivity;
import com.accuweather.android.utilities.PreferenceUtils;
import com.accuweather.android.utilities.Utilities;
import com.actionbarsherlock.view.Menu;

// Referenced classes of package com.accuweather.android.tablet:
//            DailyTabletActivity, HourlyTabletActivity, NewsTabletActivity

public class TabletActivity extends AnalyticsPrimaryActivity
{

    public TabletActivity()
    {
    }

    protected Class getDailyActivity()
    {
        return com/accuweather/android/tablet/DailyTabletActivity;
    }

    protected float getFragmentPagerWidth()
    {
        Resources resources = getResources();
        float f = resources.getDisplayMetrics().density;
        float f1 = resources.getDisplayMetrics().widthPixels;
        if (Utilities.isLandscape(this))
        {
            return (f * 348F) / (f1 - 330F * f);
        } else
        {
            return (f * 348F) / f1;
        }
    }

    protected Class getHourlyActivity()
    {
        return com/accuweather/android/tablet/HourlyTabletActivity;
    }

    protected Class getNewsActivity()
    {
        return com/accuweather/android/tablet/NewsTabletActivity;
    }

    protected boolean isDmaDarkThemed()
    {
        return !Utilities.isLandscape(this);
    }

    protected void updateMenuOptions(int i)
    {
        if (PreferenceUtils.get(this, "hourly_graph_showing", true))
        {
            mMenu.setGroupVisible(com.accuweather.android.R.id.graph_off_group, true);
            mMenu.setGroupVisible(com.accuweather.android.R.id.graph_on_group, false);
            return;
        } else
        {
            mMenu.setGroupVisible(com.accuweather.android.R.id.graph_off_group, false);
            mMenu.setGroupVisible(com.accuweather.android.R.id.graph_on_group, true);
            return;
        }
    }
}
