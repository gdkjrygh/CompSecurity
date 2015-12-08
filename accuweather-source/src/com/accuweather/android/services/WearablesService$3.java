// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.util.Log;
import com.accuweather.android.utilities.Data;

// Referenced classes of package com.accuweather.android.services:
//            WearablesService

class this._cls0
    implements Runnable
{

    final WearablesService this$0;

    public void run()
    {
        String s = getGPSKey();
        if (s != null)
        {
            if (WearablesService.access$700(WearablesService.this).getLocationFromKey(s) != null)
            {
                WearablesService.access$800(WearablesService.this, s);
                return;
            } else
            {
                Log.d("WearablesService", "getdata.getLocationFromKey(key) == null -> force get GPS");
                Data.getInstance(getApplicationContext()).getGpsLocationOnlyForWearable();
                return;
            }
        } else
        {
            Data.getInstance(getApplicationContext()).getGpsLocationOnlyForWearable();
            return;
        }
    }

    _cls9()
    {
        this$0 = WearablesService.this;
        super();
    }
}
