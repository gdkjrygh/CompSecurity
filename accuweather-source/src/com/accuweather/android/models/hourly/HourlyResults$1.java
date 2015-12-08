// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.hourly;

import com.accuweather.android.models.ExpirableModel;

// Referenced classes of package com.accuweather.android.models.hourly:
//            HourlyResults

class this._cls0 extends ExpirableModel
{

    final HourlyResults this$0;

    protected int getExpirationTimeInMinutes()
    {
        return 30;
    }

    ()
    {
        this$0 = HourlyResults.this;
        super();
    }
}
