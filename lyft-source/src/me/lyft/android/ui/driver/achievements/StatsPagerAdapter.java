// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import me.lyft.android.ui.driver.DriverActivitiesView;

class StatsPagerAdapter extends PagerAdapter
{

    private static final int DAILY_STATS_POSITION = 0;
    private static final int NUMBER_OF_STATS_TABS = 2;
    private static final int WEEKLY_STATS_POSITION = 1;
    private Context context;
    private SparseArray views;

    StatsPagerAdapter(Context context1)
    {
        views = new SparseArray(2);
        context = context1;
    }

    private int getPositionByType(me.lyft.android.domain.driver.DriverActivities.Type type)
    {
        class _cls1
        {

            static final int $SwitchMap$me$lyft$android$domain$driver$DriverActivities$Type[];

            static 
            {
                $SwitchMap$me$lyft$android$domain$driver$DriverActivities$Type = new int[me.lyft.android.domain.driver.DriverActivities.Type.values().length];
                try
                {
                    $SwitchMap$me$lyft$android$domain$driver$DriverActivities$Type[me.lyft.android.domain.driver.DriverActivities.Type.DAILY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$me$lyft$android$domain$driver$DriverActivities$Type[me.lyft.android.domain.driver.DriverActivities.Type.WEEKLY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.me.lyft.android.domain.driver.DriverActivities.Type[type.ordinal()])
        {
        default:
            return -1;

        case 1: // '\001'
            return 0;

        case 2: // '\002'
            return 1;
        }
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
        views.remove(i);
    }

    public int getCount()
    {
        return 2;
    }

    public DriverActivitiesView getStatsView(me.lyft.android.domain.driver.DriverActivities.Type type)
    {
        return (DriverActivitiesView)views.get(getPositionByType(type));
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        DriverActivitiesView driveractivitiesview = (DriverActivitiesView)View.inflate(context, 0x7f03005e, null);
        viewgroup.addView(driveractivitiesview);
        views.append(i, driveractivitiesview);
        return driveractivitiesview;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }
}
