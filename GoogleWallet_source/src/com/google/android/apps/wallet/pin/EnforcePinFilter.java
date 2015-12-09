// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.wallet.analytics.AppStartTimeLogger;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.filter.ActivityFilter;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            CloudPinManager, CloudPinState, ChangeOrSetPinActivity, VerifyCloudPinActivity

public class EnforcePinFilter extends ActivityFilter
{

    private final Activity activity;
    private final AppStartTimeLogger appStartTimeLogger;
    private final CloudPinManager cloudPinManager;

    EnforcePinFilter(Activity activity1, CloudPinManager cloudpinmanager, AppStartTimeLogger appstarttimelogger)
    {
        activity = activity1;
        cloudPinManager = cloudpinmanager;
        appStartTimeLogger = appstarttimelogger;
    }

    private Intent createIntent(Class class1)
    {
        class1 = InternalIntents.forClass(activity, class1);
        Intent intent = activity.getIntent();
        intent.setFlags(intent.getFlags() & 0xefffffff);
        class1.putExtra("ActivityFilterSourceIntent", intent);
        return class1;
    }

    protected final void onResume()
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$google$android$apps$wallet$pin$CloudPinState[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$pin$CloudPinState = new int[CloudPinState.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$pin$CloudPinState[CloudPinState.UNSET.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$pin$CloudPinState[CloudPinState.EXPIRED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$pin$CloudPinState[CloudPinState.ACTIVE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.google.android.apps.wallet.pin.CloudPinState[cloudPinManager.getCloudPinState().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            activity.startActivity(createIntent(com/google/android/apps/wallet/pin/ChangeOrSetPinActivity));
            activity.overridePendingTransition(0, 0);
            appStartTimeLogger.abandonLogging();
            activity.finish();
            return;

        case 2: // '\002'
            activity.startActivity(createIntent(com/google/android/apps/wallet/pin/VerifyCloudPinActivity));
            break;
        }
        activity.overridePendingTransition(0, 0);
        activity.finish();
    }
}
