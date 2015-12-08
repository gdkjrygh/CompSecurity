// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.urbanairship;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.urbanairship.UAirship;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import timber.log.Timber;

public class IntentReceiver extends BroadcastReceiver
{

    public static String APID_UPDATED_ACTION_SUFFIX = ".apid.updated";

    public IntentReceiver()
    {
    }

    private void handleDeletedMessages(Intent intent)
    {
        Timber.i("The GCM service deleted %s messages.", new Object[] {
            intent.getStringExtra("total_deleted")
        });
    }

    private void handleNotificationOpened(Intent intent)
    {
        Timber.i("User clicked notification. Message: %s", new Object[] {
            intent.getStringExtra("com.urbanairship.push.ALERT")
        });
        logPushExtras(intent);
        intent = new Intent("android.intent.action.MAIN");
        intent.setClass(UAirship.shared().getApplicationContext(), com/phunware/nbc/sochi/MainNavigationContentActivity);
        intent.setFlags(0x10000000);
        UAirship.shared().getApplicationContext().startActivity(intent);
    }

    private void handlePushReceived(Intent intent)
    {
        int i = intent.getIntExtra("com.urbanairship.push.NOTIFICATION_ID", 0);
        Timber.i("Received push notification. Alert: %s [NotificationID=%d]", new Object[] {
            intent.getStringExtra("com.urbanairship.push.ALERT"), Integer.valueOf(i)
        });
        logPushExtras(intent);
    }

    private void handleRegistrationFinished(Intent intent)
    {
        Timber.i("Registration complete. APID:%s. Valid: %s", new Object[] {
            intent.getStringExtra("com.urbanairship.push.APID"), Boolean.valueOf(intent.getBooleanExtra("com.urbanairship.push.REGISTRATION_VALID", false))
        });
        try
        {
            intent = new Intent((new StringBuilder()).append(UAirship.getPackageName()).append(APID_UPDATED_ACTION_SUFFIX).toString());
            UAirship.shared().getApplicationContext().sendBroadcast(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return;
        }
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
                Timber.i("Push Notification Extra: [%s : %s]", new Object[] {
                    s, intent.getStringExtra(s)
                });
            }
        } while (true);
    }

    public void onReceive(Context context, Intent intent)
    {
        byte byte0;
        byte0 = 0;
        Timber.i("Received intent: %s", new Object[] {
            intent.toString()
        });
        context = intent.getAction();
        context.hashCode();
        JVM INSTR lookupswitch 4: default 68
    //                   -2007185871: 127
    //                   -1548150014: 141
    //                   -751911073: 101
    //                   1782405494: 113;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        byte0 = -1;
          goto _L6
_L4:
        if (!context.equals("com.urbanairship.push.PUSH_RECEIVED")) goto _L1; else goto _L6
_L5:
        if (!context.equals("com.urbanairship.push.NOTIFICATION_OPENED")) goto _L1; else goto _L7
_L7:
        byte0 = 1;
          goto _L6
_L2:
        if (!context.equals("com.urbanairship.push.REGISTRATION_FINISHED")) goto _L1; else goto _L8
_L8:
        byte0 = 2;
          goto _L6
_L3:
        if (!context.equals("com.urbanairship.push.ACTION_GCM_DELETED_MESSAGES")) goto _L1; else goto _L9
_L9:
        byte0 = 3;
_L6:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            handlePushReceived(intent);
            return;

        case 1: // '\001'
            handleNotificationOpened(intent);
            return;

        case 2: // '\002'
            handleRegistrationFinished(intent);
            return;

        case 3: // '\003'
            handleDeletedMessages(intent);
            break;
        }
        return;
    }

}
