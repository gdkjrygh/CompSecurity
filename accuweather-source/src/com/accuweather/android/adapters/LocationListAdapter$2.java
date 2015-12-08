// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.view.View;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.utilities.Data;

// Referenced classes of package com.accuweather.android.adapters:
//            LocationListAdapter

class val.wdm
    implements android.view.er
{

    final LocationListAdapter this$0;
    final Data val$data;
    final WeatherDataModel val$wdm;

    public boolean onLongClick(View view)
    {
        LocationListAdapter.access$000(LocationListAdapter.this).onLocationLongPressed(val$data.getLocationFromKey(val$wdm.getLocationKey()));
        return true;
    }

    ocationListListener()
    {
        this$0 = final_locationlistadapter;
        val$data = data1;
        val$wdm = WeatherDataModel.this;
        super();
    }
}
