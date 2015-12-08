// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.minutecast;

import com.accuweather.android.models.ExpirableModel;

// Referenced classes of package com.accuweather.android.models.minutecast:
//            MinuteCastResult

class this._cls0 extends ExpirableModel
{

    private static final long serialVersionUID = 0x9a899089e588cf1eL;
    final MinuteCastResult this$0;

    protected int getExpirationTimeInMinutes()
    {
        return 1;
    }

    ()
    {
        this$0 = MinuteCastResult.this;
        super();
    }
}
