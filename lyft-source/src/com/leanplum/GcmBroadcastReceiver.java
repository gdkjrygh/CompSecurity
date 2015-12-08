// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;

// Referenced classes of package com.leanplum:
//            LeanplumPushService, LeanplumActivityHelper, m

public class GcmBroadcastReceiver extends WakefulBroadcastReceiver
{

    public GcmBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag;
        flag = false;
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction()))
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if (intent.getStringExtra("error") == null) goto _L2; else goto _L1
_L1:
        Log.e("Leanplum", (new StringBuilder("Error when registering for push notifications: ")).append(intent.getStringExtra("error")).toString());
_L4:
        return;
_L2:
        intent = intent.getStringExtra("registration_id");
        if (intent == null) goto _L4; else goto _L3
_L3:
        LeanplumPushService.a(context, intent);
        return;
        android.os.Bundle bundle;
        if (!intent.hasCategory("lpAction"))
        {
            break MISSING_BLOCK_LABEL_200;
        }
        bundle = intent.getExtras();
        Log.i("Leanplum", "Opening notification");
        intent = LeanplumPushService.a();
        break MISSING_BLOCK_LABEL_95;
        if (LeanplumActivityHelper.b == null || LeanplumActivityHelper.a || intent != null && (intent == null || !intent.isInstance(LeanplumActivityHelper.b)))
        {
            flag = true;
        }
        if (flag)
        {
            intent = LeanplumPushService.a();
            if (intent != null)
            {
                intent = new Intent(context, intent);
            } else
            {
                intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            }
            intent.putExtras(bundle);
            intent.addFlags(0x14000000);
            context.startActivity(intent);
        }
        LeanplumActivityHelper.queueActionUponActive(new m(this, bundle));
        return;
        startWakefulService(context, intent.setComponent(new ComponentName(context.getPackageName(), com/leanplum/LeanplumPushService.getName())));
        setResultCode(-1);
        return;
    }
}
