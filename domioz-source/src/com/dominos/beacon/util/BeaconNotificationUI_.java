// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.util;

import android.app.NotificationManager;
import android.content.Context;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.beacon.util:
//            BeaconNotificationUI

public final class BeaconNotificationUI_ extends BeaconNotificationUI
{

    private static BeaconNotificationUI_ instance_;
    private Context context_;

    private BeaconNotificationUI_(Context context)
    {
        context_ = context;
    }

    public static BeaconNotificationUI_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new BeaconNotificationUI_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mNotificationManager = (NotificationManager)context_.getSystemService("notification");
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(context_);
    }
}
