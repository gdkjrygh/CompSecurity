// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.receiver;

import android.content.Context;
import android.content.Intent;
import com.dominos.MobileSession_;
import com.dominos.beacon.util.BeaconNotificationUI_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;

// Referenced classes of package com.dominos.beacon.receiver:
//            BeaconReceiver

public final class BeaconReceiver_ extends BeaconReceiver
{

    public BeaconReceiver_()
    {
    }

    private void init_(Context context)
    {
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(context);
        mNotificationUI = BeaconNotificationUI_.getInstance_(context);
        mActivityHelper = ActivityHelper_.getInstance_(context);
        mMobileSession = MobileSession_.getInstance_(context);
        onAfterInject();
    }

    public final void onReceive(Context context, Intent intent)
    {
        init_(context);
        super.onReceive(context, intent);
    }
}
