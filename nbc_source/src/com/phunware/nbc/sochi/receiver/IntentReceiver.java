// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.urbanairship.UAirship;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IntentReceiver extends BroadcastReceiver
{

    public static String APID_UPDATED_ACTION_SUFFIX = ".apid.updated";
    private static final String logTag = "PushSample";

    public IntentReceiver()
    {
    }

    private void logPushExtras(Intent intent)
    {
        Iterator iterator = intent.getExtras().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (!Arrays.asList(new String[] {
    "collapse_key", "from", "com.urbanairship.push.NOTIFICATION_ID", "com.urbanairship.push.CANONICAL_PUSH_ID", "com.urbanairship.push.ALERT"
}).contains(s))
            {
                Log.i("PushSample", (new StringBuilder()).append("Push Notification Extra: [").append(s).append(" : ").append(intent.getStringExtra(s)).append("]").toString());
            }
        } while (true);
    }

    public void onReceive(Context context, Intent intent)
    {
        Log.i("PushSample", (new StringBuilder()).append("Received intent: ").append(intent.toString()).toString());
        context = intent.getAction();
        if (context.equals("com.urbanairship.push.PUSH_RECEIVED"))
        {
            int i = intent.getIntExtra("com.urbanairship.push.NOTIFICATION_ID", 0);
            Log.i("PushSample", (new StringBuilder()).append("Received push notification. Alert: ").append(intent.getStringExtra("com.urbanairship.push.ALERT")).append(" [NotificationID=").append(i).append("]").toString());
            logPushExtras(intent);
        } else
        {
            if (context.equals("com.urbanairship.push.NOTIFICATION_OPENED"))
            {
                Log.i("PushSample", (new StringBuilder()).append("User clicked notification. Message: ").append(intent.getStringExtra("com.urbanairship.push.ALERT")).toString());
                logPushExtras(intent);
                context = new Intent("android.intent.action.MAIN");
                context.setClass(UAirship.shared().getApplicationContext(), com/phunware/nbc/sochi/MainNavigationContentActivity);
                context.setFlags(0x10000000);
                UAirship.shared().getApplicationContext().startActivity(context);
                return;
            }
            if (context.equals("com.urbanairship.push.REGISTRATION_FINISHED"))
            {
                Log.i("PushSample", (new StringBuilder()).append("Registration complete. APID:").append(intent.getStringExtra("com.urbanairship.push.APID")).append(". Valid: ").append(intent.getBooleanExtra("com.urbanairship.push.REGISTRATION_VALID", false)).toString());
                try
                {
                    context = new Intent((new StringBuilder()).append(UAirship.getPackageName()).append(APID_UPDATED_ACTION_SUFFIX).toString());
                    UAirship.shared().getApplicationContext().sendBroadcast(context);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return;
                }
            }
            if (context.equals("com.urbanairship.push.ACTION_GCM_DELETED_MESSAGES"))
            {
                Log.i("PushSample", (new StringBuilder()).append("The GCM service deleted ").append(intent.getStringExtra("total_deleted")).append(" messages.").toString());
                return;
            }
        }
    }

}
