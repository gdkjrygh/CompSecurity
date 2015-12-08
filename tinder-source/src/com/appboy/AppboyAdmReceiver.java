// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import com.appboy.configuration.XmlAppConfigurationProvider;
import com.appboy.push.AppboyNotificationActionUtils;
import com.appboy.push.AppboyNotificationUtils;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//            Constants, IAppboyNotificationFactory, Appboy

public final class AppboyAdmReceiver extends BroadcastReceiver
{
    public class HandleAppboyAdmMessageTask extends AsyncTask
    {

        private final Context context;
        private final Intent intent;
        final AppboyAdmReceiver this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            handleAppboyAdmMessage(context, intent);
            return null;
        }

        public HandleAppboyAdmMessageTask(Context context1, Intent intent1)
        {
            this$0 = AppboyAdmReceiver.this;
            super();
            context = context1;
            intent = intent1;
            execute(new Void[0]);
        }
    }


    private static final String ADM_DELETED_MESSAGES_KEY = "deleted_messages";
    private static final String ADM_ERROR_KEY = "error";
    private static final String ADM_MESSAGE_TYPE_KEY = "message_type";
    private static final String ADM_NUMBER_OF_MESSAGES_DELETED_KEY = "total_deleted";
    private static final String ADM_RECEIVE_INTENT_ACTION = "com.amazon.device.messaging.intent.RECEIVE";
    private static final String ADM_REGISTRATION_ID_KEY = "registration_id";
    private static final String ADM_REGISTRATION_INTENT_ACTION = "com.amazon.device.messaging.intent.REGISTRATION";
    private static final String ADM_UNREGISTERED_KEY = "unregistered";
    public static final String CAMPAIGN_ID_KEY = "cid";
    private static final String TAG;

    public AppboyAdmReceiver()
    {
    }

    final boolean handleAppboyAdmMessage(Context context, Intent intent)
    {
        NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
        if ("deleted_messages".equals(intent.getStringExtra("message_type")))
        {
            int i = intent.getIntExtra("total_deleted", -1);
            if (i == -1)
            {
                AppboyLogger.e(TAG, String.format("Unable to parse ADM message. Intent: %s", new Object[] {
                    intent.toString()
                }));
            } else
            {
                AppboyLogger.i(TAG, String.format("ADM deleted %d messages. Fetch them from Appboy.", new Object[] {
                    Integer.valueOf(i)
                }));
            }
            return false;
        }
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
                AppboyLogger.e(TAG, "Failed to create notification.", context);
                return false;
            }
            if (intent == null)
            {
                return false;
            }
            notificationmanager.notify("appboy_notification", j, intent);
            AppboyNotificationUtils.sendPushMessageReceivedBroadcast(context, bundle);
            AppboyNotificationUtils.wakeScreenIfHasPermission(context, bundle);
            if (bundle.containsKey("nd"))
            {
                int k = Integer.parseInt(bundle.getString("nd"));
                AppboyNotificationUtils.setNotificationDurationAlarm(context, getClass(), j, k);
            }
            return true;
        } else
        {
            AppboyNotificationUtils.sendPushMessageReceivedBroadcast(context, bundle);
            return false;
        }
    }

    final void handleAppboyAdmReceiveIntent(Context context, Intent intent)
    {
        if (AppboyNotificationUtils.isAppboyPushMessage(intent))
        {
            new HandleAppboyAdmMessageTask(context, intent);
        }
    }

    final boolean handleRegistrationEventIfEnabled(XmlAppConfigurationProvider xmlappconfigurationprovider, Context context, Intent intent)
    {
        AppboyLogger.i(TAG, String.format("Received ADM registration. Message: %s", new Object[] {
            intent.toString()
        }));
        if (xmlappconfigurationprovider.isAdmMessagingRegistrationEnabled())
        {
            AppboyLogger.d(TAG, "ADM enabled in appboy.xml. Continuing to process ADM registration intent.");
            handleRegistrationIntent(context, intent);
            return true;
        } else
        {
            AppboyLogger.w(TAG, "ADM not enabled in appboy.xml. Ignoring ADM registration intent. Note: you must set com_appboy_push_adm_messaging_registration_enabled to true in your appboy.xml to enable ADM.");
            return false;
        }
    }

    final boolean handleRegistrationIntent(Context context, Intent intent)
    {
        String s = intent.getStringExtra("error");
        String s1 = intent.getStringExtra("registration_id");
        intent = intent.getStringExtra("unregistered");
        if (s != null)
        {
            AppboyLogger.e(TAG, (new StringBuilder("Error during ADM registration: ")).append(s).toString());
        } else
        if (s1 != null)
        {
            AppboyLogger.i(TAG, (new StringBuilder("Registering for ADM messages with registrationId: ")).append(s1).toString());
            Appboy.getInstance(context).registerAppboyPushMessages(s1);
        } else
        if (intent != null)
        {
            AppboyLogger.i(TAG, (new StringBuilder("Unregistering from ADM: ")).append(intent).toString());
            Appboy.getInstance(context).unregisterAppboyPushMessages();
        } else
        {
            AppboyLogger.w(TAG, "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.");
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
        if ("com.amazon.device.messaging.intent.REGISTRATION".equals(s))
        {
            handleRegistrationEventIfEnabled(new XmlAppConfigurationProvider(context), context, intent);
            return;
        }
        if ("com.amazon.device.messaging.intent.RECEIVE".equals(s))
        {
            handleAppboyAdmReceiveIntent(context, intent);
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
            AppboyLogger.w(TAG, String.format("The ADM receiver received a message not sent from Appboy. Ignoring the message.", new Object[0]));
            return;
        }
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/AppboyAdmReceiver.getName()
        });
    }
}
