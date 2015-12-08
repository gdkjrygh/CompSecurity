// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.quarter;

import com.accuweather.android.models.ExpirableModel;

// Referenced classes of package com.accuweather.android.models.quarter:
//            QuarterResults

class this._cls0 extends ExpirableModel
{

    final QuarterResults this$0;

    protected int getExpirationTimeInMinutes()
    {
        return 30;
    }

    ()
    {
        this$0 = QuarterResults.this;
        super();
    }
}
