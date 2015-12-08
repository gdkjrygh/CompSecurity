// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import com.accuweather.android.adapters.MainFragmentAdapter;
import com.accuweather.android.utilities.Data;
import com.viewpagerindicator.PageIndicator;

// Referenced classes of package com.accuweather.android:
//            AbsPrimaryActivity

class this._cls0
    implements Runnable
{

    final AbsPrimaryActivity this$0;

    public void run()
    {
        if (AbsPrimaryActivity.access$100() != null)
        {
            com.accuweather.android.models.WeatherDataModel weatherdatamodel = getData().getCurrentlyViewedWeatherDataModel();
            if (weatherdatamodel != null)
            {
                AbsPrimaryActivity.access$100().refreshContent(weatherdatamodel);
                AbsPrimaryActivity.access$100().notifyDataSetChanged();
                if (AbsPrimaryActivity.access$200(AbsPrimaryActivity.this) != null)
                {
                    AbsPrimaryActivity.access$200(AbsPrimaryActivity.this).notifyDataSetChanged();
                }
            }
        }
    }

    Adapter()
    {
        this$0 = AbsPrimaryActivity.this;
        super();
    }
}
