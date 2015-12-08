// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.storelocator;

import android.content.Context;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;

// Referenced classes of package com.dominos.android.sdk.core.storelocator:
//            StoreLocatorAPI

public final class StoreLocatorAPI_ extends StoreLocatorAPI
{

    private Context context_;

    private StoreLocatorAPI_(Context context)
    {
        context_ = context;
        init_();
    }

    public static StoreLocatorAPI_ getInstance_(Context context)
    {
        return new StoreLocatorAPI_(context);
    }

    private void init_()
    {
        mPower = PowerRestClient_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
