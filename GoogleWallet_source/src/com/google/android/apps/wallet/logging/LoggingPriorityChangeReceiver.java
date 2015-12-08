// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.logging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.apps.wallet.logging:
//            WLog

public class LoggingPriorityChangeReceiver extends BroadcastReceiver
{

    private static final String TAG = com/google/android/apps/wallet/logging/LoggingPriorityChangeReceiver.getSimpleName();

    public LoggingPriorityChangeReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            if ("com.google.android.apps.wallet.logging.CHANGE_LOG_PRIORITY_LEVEL".equals(intent.getAction()))
            {
                if (intent.hasExtra("min_priority"))
                {
                    break label0;
                }
                WLog.v(TAG, "Log priority not supplied");
            }
            return;
        }
        context = intent.getStringExtra("min_priority");
        try
        {
            WLog.setMinLogPriority(WLog.LogPriority.valueOf(context.toUpperCase()));
            intent = TAG;
            String s = String.valueOf(WLog.getMinLogPriority());
            WLog.v(intent, (new StringBuilder(String.valueOf(s).length() + 24)).append("Log priority changed to ").append(s).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            intent = TAG;
        }
        context = String.valueOf(context);
        if (context.length() != 0)
        {
            context = "Invalid log priority ".concat(context);
        } else
        {
            context = new String("Invalid log priority ");
        }
        WLog.v(intent, context);
    }

}
