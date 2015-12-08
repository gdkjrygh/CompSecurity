// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.news.receiver;

import android.content.Context;
import android.content.Intent;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.data.sharedpref.ApplicationConfigurationPreferences_;
import com.dominos.utils.AnalyticsUtil_;

// Referenced classes of package com.dominos.news.receiver:
//            PushNotificationReceiver

public final class PushNotificationReceiver_ extends PushNotificationReceiver
{

    public PushNotificationReceiver_()
    {
    }

    private void init_(Context context)
    {
        mConfigurationPreferences = new ApplicationConfigurationPreferences_(context);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(context);
        mMobileSession = MobileSession_.getInstance_(context);
    }

    public final void onReceive(Context context, Intent intent)
    {
        init_(context);
        super.onReceive(context, intent);
    }
}
