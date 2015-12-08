// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.models.WeatherDataModel;

// Referenced classes of package com.accuweather.android.services:
//            WearablesService

class val.wdm
    implements eerConnectedListener
{

    final WearablesService this$0;
    final WeatherDataModel val$wdm;

    public void onPeerConnected()
    {
        if (isLocationServiceEnabled())
        {
            if (val$wdm != null)
            {
                WearablesService.access$400(WearablesService.this, true);
                startTaskSend(val$wdm);
                return;
            } else
            {
                WearablesService.access$500(WearablesService.this);
                return;
            }
        } else
        {
            WearablesService.access$400(WearablesService.this, false);
            WearablesService.access$600(WearablesService.this);
            return;
        }
    }

    eerConnectedListener()
    {
        this$0 = final_wearablesservice;
        val$wdm = WeatherDataModel.this;
        super();
    }
}
