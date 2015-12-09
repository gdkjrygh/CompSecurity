// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.storelocator;

import android.content.Context;

// Referenced classes of package com.dominos.android.sdk.core.storelocator:
//            StoreLocatorManager, StoreLocatorAPI_

public final class StoreLocatorManager_ extends StoreLocatorManager
{

    private Context context_;

    private StoreLocatorManager_(Context context)
    {
        context_ = context;
        init_();
    }

    public static StoreLocatorManager_ getInstance_(Context context)
    {
        return new StoreLocatorManager_(context);
    }

    private void init_()
    {
        mStoreLocatorAPI = StoreLocatorAPI_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
