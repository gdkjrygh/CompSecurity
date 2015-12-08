// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.view.View;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;

// Referenced classes of package com.accuweather.android.adapters:
//            LocationListAdapter

class val.position
    implements android.view.cationListAdapter._cls1
{

    final LocationListAdapter this$0;
    final Data val$data;
    final int val$position;
    final WeatherDataModel val$wdm;

    public void onClick(View view)
    {
        Logger.d(this, "onclick");
        LocationListAdapter.access$000(LocationListAdapter.this).onLocationSelected(val$data.getLocationFromKey(val$wdm.getLocationKey()), val$position);
    }

    ocationListListener()
    {
        this$0 = final_locationlistadapter;
        val$data = data1;
        val$wdm = weatherdatamodel;
        val$position = I.this;
        super();
    }
}
