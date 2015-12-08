// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import com.accuweather.android.TermsAndConditionsActivity;
import com.google.android.gms.wearable.MessageEvent;

// Referenced classes of package com.accuweather.android.services:
//            WearablesService, WearablesBroadcastReceiver

public class WearablesServiceExtended extends WearablesService
{

    final Runnable mRunnableStartActivity = new Runnable() {

        final WearablesServiceExtended this$0;

        public void run()
        {
            Log.i("WearablesService", "Start activity run");
            Intent intent = new Intent(WearablesServiceExtended.this, com/accuweather/android/TermsAndConditionsActivity);
            intent.addFlags(0x10000000);
            startActivity(intent);
        }

            
            {
                this$0 = WearablesServiceExtended.this;
                super();
            }
    };
    private WearablesBroadcastReceiver wearablesBroadcastReceiver;

    public WearablesServiceExtended()
    {
        wearablesBroadcastReceiver = new WearablesBroadcastReceiver();
    }

    public void cancelAlarm(Context context)
    {
        wearablesBroadcastReceiver.cancelAlarm(this);
    }

    protected void onOpenApp(MessageEvent messageevent)
    {
        getHandler().removeCallbacks(mRunnableStartActivity);
        getHandler().postDelayed(mRunnableStartActivity, 10L);
    }

    protected void onStartService()
    {
        Log.i("WearablesService", "onStartService");
        Intent intent = new Intent(this, com/accuweather/android/services/WearablesServiceExtended);
        intent.putExtra("update_wearables_service", true);
        startService(intent);
    }

    public void startRepeatingAlarm(Context context)
    {
        wearablesBroadcastReceiver.startAlarm(this);
    }
}
