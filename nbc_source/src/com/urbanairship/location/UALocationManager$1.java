// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.urbanairship.analytics.Analytics;

// Referenced classes of package com.urbanairship.location:
//            UALocationManager, LocationPreferences

static final class  extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = UALocationManager.access$100(UALocationManager.access$000()).isLocationEnabled();
        boolean flag1 = UALocationManager.access$100(UALocationManager.access$000()).isBackgroundLocationEnabled();
        boolean flag2 = UALocationManager.access$100(UALocationManager.access$000()).isForegroundLocationEnabled();
        if (flag && !flag1)
        {
            if (Analytics.ACTION_APP_BACKGROUND.equals(intent.getAction()))
            {
                UALocationManager.access$200();
                return;
            }
            if (Analytics.ACTION_APP_FOREGROUND.equals(intent.getAction()) && flag2)
            {
                UALocationManager.access$300();
                return;
            }
        }
    }

    ()
    {
    }
}
