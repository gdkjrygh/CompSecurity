// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package com.localytics.android:
//            DatapointHelper, LocalyticsSession

public class ReferralReceiver extends BroadcastReceiver
{

    protected String appKey;

    public ReferralReceiver()
    {
        appKey = null;
    }

    public void onReceive(Context context, Intent intent)
    {
        Bundle bundle;
        try
        {
            bundle = intent.getExtras();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        bundle.containsKey(null);
        if (intent.getAction().equals("com.android.vending.INSTALL_REFERRER"))
        {
            if (appKey == null || appKey.length() == 0)
            {
                appKey = DatapointHelper.getLocalyticsAppKeyOrNull(context);
            }
            if (appKey != null && appKey.length() != 0)
            {
                intent = intent.getStringExtra("referrer");
                if (intent != null && intent.length() != 0)
                {
                    new LocalyticsSession(context, appKey, intent);
                    return;
                }
            }
        }
        return;
    }
}
