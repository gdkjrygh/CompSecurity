// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.service;

import android.content.Context;
import com.dominos.MobileSession_;
import com.dominos.beacon.api.BeaconAPI_;
import com.dominos.utils.AnalyticsUtil_;

// Referenced classes of package com.dominos.beacon.service:
//            BeaconService

public final class BeaconService_ extends BeaconService
{

    public BeaconService_()
    {
    }

    private void init_()
    {
        mMobileSession = MobileSession_.getInstance_(this);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(this);
        mBeaconAPI = BeaconAPI_.getInstance_(this);
        setup();
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
            super(context, com/dominos/beacon/service/BeaconService_);
        }
    }

}
