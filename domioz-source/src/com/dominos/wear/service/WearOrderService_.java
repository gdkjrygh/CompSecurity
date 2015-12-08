// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.service;

import android.content.Context;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.remote.contoller.RemoteOrderManager_;
import com.dominos.wear.WearSession_;

// Referenced classes of package com.dominos.wear.service:
//            WearOrderService

public final class WearOrderService_ extends WearOrderService
{

    public WearOrderService_()
    {
    }

    private void init_()
    {
        mOrderUtil = OrderUtil_.getInstance_(this);
        mRemoteOrderManager = RemoteOrderManager_.getInstance_(this);
        mWearSession = WearSession_.getInstance_(this);
    }

    public static IntentBuilder_ intent(Context context)
    {
        return new IntentBuilder_(context);
    }

    public final void onCreate()
    {
        init_();
        super.onCreate();
    }

    private class IntentBuilder_ extends f
    {

        public IntentBuilder_(Context context)
        {
            super(context, com/dominos/wear/service/WearOrderService_);
        }
    }

}
