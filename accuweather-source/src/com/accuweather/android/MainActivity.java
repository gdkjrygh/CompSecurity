// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;


// Referenced classes of package com.accuweather.android:
//            AnalyticsPrimaryActivity, DailyActivity, HourlyActivity, NewsDetailsActivity

public class MainActivity extends AnalyticsPrimaryActivity
{

    public MainActivity()
    {
    }

    protected Class getDailyActivity()
    {
        return com/accuweather/android/DailyActivity;
    }

    protected float getFragmentPagerWidth()
    {
        return 1.0F;
    }

    protected Class getHourlyActivity()
    {
        return com/accuweather/android/HourlyActivity;
    }

    protected Class getNewsActivity()
    {
        return com/accuweather/android/NewsDetailsActivity;
    }
}
