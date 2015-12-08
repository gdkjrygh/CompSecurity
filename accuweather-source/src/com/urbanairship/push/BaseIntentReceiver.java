// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.urbanairship.Logger;

// Referenced classes of package com.urbanairship.push:
//            PushMessage

public abstract class BaseIntentReceiver extends BroadcastReceiver
{

    public static int RESULT_ACTIVITY_LAUNCHED = 1;
    public static int RESULT_ACTIVITY_NOT_LAUNCHED = -1;

    public BaseIntentReceiver()
    {
    }

    private void handlePushOpened(Context context, Intent intent)
    {
        int i = intent.getIntExtra("com.urbanairship.push.NOTIFICATION_ID", -1);
        Object obj = intent.getBundleExtra("com.urbanairship.push.EXTRA_PUSH_BUNDLE");
        if (obj == null)
        {
            Logger.error("Missing push bundle.");
        } else
        {
            obj = new PushMessage(((android.os.Bundle) (obj)));
            boolean flag;
            if (intent.hasExtra("com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_ID"))
            {
                flag = onNotificationActionOpened(context, ((PushMessage) (obj)), i, intent.getStringExtra("com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_ID"), intent.getBooleanExtra("com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_FOREGROUND", false));
            } else
            {
                flag = onNotificationOpened(context, ((PushMessage) (obj)), i);
            }
            if (isOrderedBroadcast() && getResultCode() != RESULT_ACTIVITY_LAUNCHED)
            {
                if (flag)
                {
                    i = RESULT_ACTIVITY_LAUNCHED;
                } else
                {
                    i = RESULT_ACTIVITY_NOT_LAUNCHED;
                }
                setResultCode(i);
                return;
            }
        }
    }

    private void handlePushReceived(Context context, Intent intent)
    {
        Object obj = intent.getBundleExtra("com.urbanairship.push.EXTRA_PUSH_BUNDLE");
        if (obj == null)
        {
            Logger.error("Missing push bundle.");
            return;
        }
        obj = new PushMessage(((android.os.Bundle) (obj)));
        if (intent.hasExtra("com.urbanairship.push.NOTIFICATION_ID"))
        {
            onPushReceived(context, ((PushMessage) (obj)), intent.getIntExtra("com.urbanairship.push.NOTIFICATION_ID", -1));
            return;
        } else
        {
            onBackgroundPushReceived(context, ((PushMessage) (obj)));
            return;
        }
    }

    private void handleRegistrationIntent(Context context, Intent intent)
    {
        if (intent.hasExtra("com.urbanairship.push.EXTRA_ERROR"))
        {
            onChannelRegistrationFailed(context);
            return;
        }
        intent = intent.getStringExtra("com.urbanairship.push.EXTRA_CHANNEL_ID");
        if (intent == null)
        {
            Logger.error("Missing channel registration ID.");
            return;
        } else
        {
            onChannelRegistrationSucceeded(context, intent);
            return;
        }
    }

    protected abstract void onBackgroundPushReceived(Context context, PushMessage pushmessage);

    protected abstract void onChannelRegistrationFailed(Context context);

    protected abstract void onChannelRegistrationSucceeded(Context context, String s);

    protected abstract boolean onNotificationActionOpened(Context context, PushMessage pushmessage, int i, String s, boolean flag);

    protected abstract boolean onNotificationOpened(Context context, PushMessage pushmessage, int i);

    protected abstract void onPushReceived(Context context, PushMessage pushmessage, int i);

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        Logger.info((new StringBuilder()).append("Received intent with action: ").append(s).toString());
        if ("com.urbanairship.push.RECEIVED".equals(s))
        {
            handlePushReceived(context, intent);
        } else
        {
            if ("com.urbanairship.push.OPENED".equals(s))
            {
                handlePushOpened(context, intent);
                return;
            }
            if ("com.urbanairship.push.CHANNEL_UPDATED".equals(s))
            {
                handleRegistrationIntent(context, intent);
                return;
            }
        }
    }

}
