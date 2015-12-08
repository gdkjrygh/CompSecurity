// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;

// Referenced classes of package com.urbanairship.push:
//            PushService, PushManager

public class ADMPushReceiver extends BroadcastReceiver
{

    public ADMPushReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!"com.amazon.device.messaging.intent.RECEIVE".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        Logger.info("Received push from ADM.");
        PushService.startServiceWithWakeLock(context, (new Intent("com.urbanairship.push.ACTION_PUSH_RECEIVED")).putExtras(intent.getExtras()));
_L4:
        return;
_L2:
        if (!intent.getAction().equals("com.amazon.device.messaging.intent.REGISTRATION")) goto _L4; else goto _L3
_L3:
        if (!intent.hasExtra("error")) goto _L6; else goto _L5
_L5:
        Logger.error((new StringBuilder()).append("ADM error occurred: ").append(intent.getStringExtra("error")).toString());
_L8:
        PushService.startServiceWithWakeLock(context, new Intent("com.urbanairship.push.ACTION_PUSH_REGISTRATION_FINISHED"));
        return;
_L6:
        intent = intent.getStringExtra("registration_id");
        if (intent != null)
        {
            Logger.info((new StringBuilder()).append("ADM registration successful. Registration ID: ").append(intent).toString());
            UAirship.shared().getPushManager().setAdmId(intent);
        }
        if (true) goto _L8; else goto _L7
_L7:
    }
}
