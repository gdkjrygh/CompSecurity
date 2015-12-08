// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.models.WeatherDataModel;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.accuweather.android.services:
//            WearablesService

public class this._cls0
    implements Runnable
{

    final WearablesService this$0;
    WeatherDataModel wdm;

    public void run()
    {
        if (WearablesService.access$200(WearablesService.this).isConnected() && wdm != null)
        {
              = new (WearablesService.this, null);
            .setWeatherData(wdm);
            .execute(new Void[0]);
        }
    }

    public void setData(WeatherDataModel weatherdatamodel)
    {
        wdm = weatherdatamodel;
    }

    public ()
    {
        this$0 = WearablesService.this;
        super();
    }
}
