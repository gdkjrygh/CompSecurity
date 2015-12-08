// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Autopilot;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;

// Referenced classes of package com.urbanairship.push:
//            PushService

public class GCMPushReceiver extends BroadcastReceiver
{

    public GCMPushReceiver()
    {
    }

    private void handleIncomingMessage(Context context, Intent intent, AirshipConfigOptions airshipconfigoptions)
    {
        String s = intent.getStringExtra("from");
        if (s != null && !s.equals(airshipconfigoptions.gcmSender))
        {
            Logger.info((new StringBuilder()).append("Ignoring GCM message from sender: ").append(s).toString());
        } else
        if ("com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()))
        {
            if ("deleted_messages".equals(intent.getStringExtra("message_type")))
            {
                Logger.info((new StringBuilder()).append("GCM deleted ").append(intent.getStringExtra("total_deleted")).append(" pending messages.").toString());
                return;
            } else
            {
                Logger.info("Received push from GCM.");
                PushService.startServiceWithWakeLock(context, (new Intent("com.urbanairship.push.ACTION_PUSH_RECEIVED")).putExtras(intent.getExtras()));
                return;
            }
        }
    }

    public void onReceive(final Context context, final Intent intent)
    {
        Autopilot.automaticTakeOff((Application)context.getApplicationContext());
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            final android.content.BroadcastReceiver.PendingResult pendingResult = goAsync();
            pendingResult.setResultCode(-1);
            UAirship.shared(new com.urbanairship.UAirship.OnReadyCallback() {

                final GCMPushReceiver this$0;
                final Context val$context;
                final Intent val$intent;
                final android.content.BroadcastReceiver.PendingResult val$pendingResult;

                public void onAirshipReady(UAirship uairship)
                {
                    handleIncomingMessage(context, intent, uairship.getAirshipConfigOptions());
                    pendingResult.finish();
                }

            
            {
                this$0 = GCMPushReceiver.this;
                context = context1;
                intent = intent1;
                pendingResult = pendingresult;
                super();
            }
            });
            return;
        } else
        {
            handleIncomingMessage(context, intent, UAirship.shared().getAirshipConfigOptions());
            setResultCode(-1);
            return;
        }
    }

}
