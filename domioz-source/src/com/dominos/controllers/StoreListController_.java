// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.content.Context;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.handlers.LocationUpdateHandler_;

// Referenced classes of package com.dominos.controllers:
//            StoreListController

public final class StoreListController_ extends StoreListController
{

    private Context context_;

    private StoreListController_(Context context)
    {
        super(context);
        context_ = context;
        init_();
    }

    public static StoreListController_ getInstance_(Context context)
    {
        return new StoreListController_(context);
    }

    private void init_()
    {
        mLocationUpdateHandler = LocationUpdateHandler_.getInstance_(context_);
        mPowerRestClient = PowerRestClient_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
