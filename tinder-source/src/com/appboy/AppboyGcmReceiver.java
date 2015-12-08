// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.ah;
import android.util.Log;
import com.appboy.configuration.XmlAppConfigurationProvider;
import com.appboy.push.AppboyNotificationActionUtils;
import com.appboy.push.AppboyNotificationUtils;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//            Constants, IAppboyNotificationFactory, Appboy

public final class AppboyGcmReceiver extends BroadcastReceiver
{
    public class HandleAppboyGcmMessageTask extends AsyncTask
    {

        private final Context context;
        private final Intent intent;
        final AppboyGcmReceiver this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            handleAppboyGcmMessage(context, intent);
            return null;
        }

        public HandleAppboyGcmMessageTask(Context context1, Intent intent1)
        {
            this$0 = AppboyGcmReceiver.this;
            super();
            context = context1;
            intent = intent1;
            execute(new Void[0]);
        }
    }


    public static final String CAMPAIGN_ID_KEY = "cid";
    private static final String GCM_DELETED_MESSAGES_KEY = "deleted_messages";
    private static final String GCM_ERROR_KEY = "error";
    private static final String GCM_MESSAGE_TYPE_KEY = "message_type";
    private static final String GCM_NUMBER_OF_MESSAGES_DELETED_KEY = "total_deleted";
    private static final String GCM_RECEIVE_INTENT_ACTION = "com.google.android.c2dm.intent.RECEIVE";
    private static final String GCM_REGISTRATION_ID_KEY = "registration_id";
    private static final String GCM_REGISTRATION_INTENT_ACTION = "com.google.android.c2dm.intent.REGISTRATION";
    private static final String GCM_UNREGISTERED_KEY = "unregistered";
    private static final String TAG;

    public AppboyGcmReceiver()
    {
    }

    final boolean handleAppboyGcmMessage(Context context, Intent intent)
    {
        ah ah1 = ah.a(context);
        if (!"deleted_messages".equals(intent.getStringExtra("message_type"))) goto _L2; else goto _L1
_L1:
        int i = intent.getIntExtra("total_deleted", -1);
        if (i != -1) goto _L4; else goto _L3
_L3:
        Log.e(TAG, String.format("Unable to parse GCM message. Intent: %s", new Object[] {
            intent.toString()
        }));
_L6:
        return false;
_L4:
        AppboyLogger.i(TAG, String.format("GCM deleted %d messages. Fetch them from Appboy.", new Object[] {
            Integer.valueOf(i)
        }));
        return false;
_L2:
        Bundle bundle = intent.getExtras();
        Bundle bundle1 = AppboyNotificationUtils.getAppboyExtrasWithoutPreprocessing(bundle);
        bundle.putBundle("extra", bundle1);
        if (AppboyNotificationUtils.isNotificationMessage(intent))
        {
            int j = AppboyNotificationUtils.getNotificationId(bundle);
            bundle.putInt("nid", j);
            intent = new XmlAppConfigurationProvider(context);
            IAppboyNotificationFactory iappboynotificationfactory = AppboyNotificationUtils.getActiveNotificationFactory();
            try
            {
                intent = iappboynotificationfactory.createNotification(intent, context, bundle, bundle1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e(TAG, "Failed to create notification.", context);
                return false;
            }
            if (intent != null)
            {
                ah1.a("appboy_notification", j, intent);
                AppboyNotificationUtils.sendPushMessageReceivedBroadcast(context, bundle);
                AppboyNotificationUtils.wakeScreenIfHasPermission(context, bundle);
                if (bundle != null && bundle.containsKey("nd"))
                {
                    int k = Integer.parseInt(bundle.getString("nd"));
                    AppboyNotificationUtils.setNotificationDurationAlarm(context, getClass(), j, k);
                }
                return true;
            }
        } else
        {
            AppboyNotificationUtils.sendPushMessageReceivedBroadcast(context, bundle);
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    final void handleAppboyGcmReceiveIntent(Context context, Intent intent)
    {
        if (AppboyNotificationUtils.isAppboyPushMessage(intent))
        {
            new HandleAppboyGcmMessageTask(context, intent);
        }
    }

    final boolean handleRegistrationEventIfEnabled(XmlAppConfigurationProvider xmlappconfigurationprovider, Context context, Intent intent)
    {
        if (xmlappconfigurationprovider.isGcmMessagingRegistrationEnabled())
        {
            handleRegistrationIntent(context, intent);
            return true;
        } else
        {
            return false;
        }
    }

    final boolean handleRegistrationIntent(Context context, Intent intent)
    {
        String s = intent.getStringExtra("error");
        String s1 = intent.getStringExtra("registration_id");
        if (s != null)
        {
            if ("SERVICE_NOT_AVAILABLE".equals(s))
            {
                Log.e(TAG, "Unable to connect to the GCM registration server. Try again later.");
            } else
            if ("ACCOUNT_MISSING".equals(s))
            {
                Log.e(TAG, "No Google account found on the phone. For pre-3.0 devices, a Google account is required on the device.");
            } else
            if ("AUTHENTICATION_FAILED".equals(s))
            {
                Log.e(TAG, "Unable to authenticate Google account. For Android versions <4.0.4, a valid Google Play account is required for Google Cloud Messaging to function. This phone will be unable to receive Google Cloud Messages until the user logs in with a valid Google Play account or upgrades the operating system on this device.");
            } else
            if ("INVALID_SENDER".equals(s))
            {
                Log.e(TAG, "One or multiple of the sender IDs provided are invalid.");
            } else
            if ("PHONE_REGISTRATION_ERROR".equals(s))
            {
                Log.e(TAG, "Device does not support GCM.");
            } else
            if ("INVALID_PARAMETERS".equals(s))
            {
                Log.e(TAG, "The request sent by the device does not contain the expected parameters. This phone does not currently support GCM.");
            } else
            {
                AppboyLogger.w(TAG, String.format("Received an unrecognised GCM registration error type. Ignoring. Error: %s", new Object[] {
                    s
                }));
            }
        } else
        if (s1 != null)
        {
            Appboy.getInstance(context).registerAppboyPushMessages(s1);
        } else
        if (intent.hasExtra("unregistered"))
        {
            Appboy.getInstance(context).unregisterAppboyPushMessages();
        } else
        {
            AppboyLogger.w(TAG, "The GCM registration message is missing error information, registration id, and unregistration confirmation. Ignoring.");
            return false;
        }
        return true;
    }

    public final void onReceive(Context context, Intent intent)
    {
        AppboyLogger.i(TAG, String.format("Received broadcast message. Message: %s", new Object[] {
            intent.toString()
        }));
        String s = intent.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(s))
        {
            handleRegistrationEventIfEnabled(new XmlAppConfigurationProvider(context), context, intent);
            return;
        }
        if ("com.google.android.c2dm.intent.RECEIVE".equals(s))
        {
            handleAppboyGcmReceiveIntent(context, intent);
            return;
        }
        if ("com.appboy.action.CANCEL_NOTIFICATION".equals(s))
        {
            AppboyNotificationUtils.handleCancelNotificationAction(context, intent);
            return;
        }
        if ("com.appboy.action.APPBOY_ACTION_CLICKED".equals(s))
        {
            AppboyNotificationActionUtils.handleNotificationActionClicked(context, intent);
            return;
        }
        if ("com.appboy.action.APPBOY_PUSH_CLICKED".equals(s))
        {
            AppboyNotificationUtils.handleNotificationOpened(context, intent);
            return;
        } else
        {
            AppboyLogger.w(TAG, String.format("The GCM receiver received a message not sent from Appboy. Ignoring the message.", new Object[0]));
            return;
        }
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/AppboyGcmReceiver.getName()
        });
    }
}
