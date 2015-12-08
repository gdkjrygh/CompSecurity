// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.current;

import com.accuweather.android.models.ExpirableModel;

// Referenced classes of package com.accuweather.android.models.current:
//            CurrentConditionsResult

class this._cls0 extends ExpirableModel
{

    final CurrentConditionsResult this$0;

    protected int getExpirationTimeInMinutes()
    {
        return 7;
    }

    ()
    {
        this$0 = CurrentConditionsResult.this;
        super();
    }
}
