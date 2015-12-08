// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.photos;

import com.accuweather.android.models.ExpirableModel;

// Referenced classes of package com.accuweather.android.models.photos:
//            PhotoResults

class this._cls0 extends ExpirableModel
{

    final PhotoResults this$0;

    protected int getExpirationTimeInMinutes()
    {
        return 120;
    }

    ()
    {
        this$0 = PhotoResults.this;
        super();
    }
}
