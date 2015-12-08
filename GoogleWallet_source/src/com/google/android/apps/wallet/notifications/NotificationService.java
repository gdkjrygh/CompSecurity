// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.base.service.WalletContextParameter;
import com.google.android.apps.wallet.base.service.WalletIntentService;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.geofencing.api.GeofencingNotificationHandler;
import com.google.android.apps.wallet.geofencing.api.GeofencingNotificationHandlerManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.collect.ImmutableSet;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.Arrays;
import java.util.EnumSet;

// Referenced classes of package com.google.android.apps.wallet.notifications:
//            NotificationProtoManager, NotificationPersistenceManager

public class NotificationService extends WalletIntentService
{

    private static final String SERVICE_NAME = com/google/android/apps/wallet/notifications/NotificationService.getSimpleName();
    AnalyticsUtil analyticsUtil;
    GeofencingNotificationHandlerManager geofencingNotificationHandlerManager;
    NotificationPersistenceManager notificationPersistenceManager;
    NotificationProtoManager notificationProtoManager;
    SharedPreferences sharedPreferences;

    public NotificationService()
    {
        super(SERVICE_NAME, EnumSet.of(WalletContextParameter.RESTRICTIONS_SATISFIED, WalletContextParameter.SETUP_COMPLETE));
    }

    public static PendingIntent createDismissGeofencingNotificationIntent(Context context, com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage)
    {
        geofencedmessage = InternalIntents.forAction(context, "com.google.android.apps.wallet.services.notification.DISMISS_GEOFENCING_NOTIFICATION").setData(createNotificationServiceDataUri(Protos.valueWithDefault(geofencedmessage.type, 1)));
        return PendingIntent.getService(context, (int)System.currentTimeMillis(), geofencedmessage, 0x10000000);
    }

    public static PendingIntent createDismissPushNotificationIntent(Context context, String as[], int i)
    {
        as = InternalIntents.forAction(context, "com.google.android.apps.wallet.services.notification.DISMISS_PUSH_NOTIFICATION").putExtra("DISMISS_NOTIFICATION_INTENT", null).putExtra("NOTIFICATION_IDS", as).setData(createNotificationServiceDataUri(i));
        return PendingIntent.getService(context, (int)System.currentTimeMillis(), as, 0x10000000);
    }

    private static Uri createNotificationServiceDataUri(int i)
    {
        return (new android.net.Uri.Builder()).scheme("walletnotification").authority("notificationservice").path(Integer.toString(i)).build();
    }

    public static PendingIntent createOpenGeofencingNotificationIntent(Context context, com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage, PendingIntent pendingintent)
    {
        geofencedmessage = InternalIntents.forAction(context, "com.google.android.apps.wallet.services.notification.OPEN_GEOFENCING_NOTIFICATION").putExtra("OPEN_NOTIFICATION_INTENT", pendingintent).putExtra("GEOFENCED_MESSAGE_PROTO", MessageNano.toByteArray(geofencedmessage)).setData(createNotificationServiceDataUri(Protos.valueWithDefault(geofencedmessage.type, 1)));
        return PendingIntent.getService(context, (int)System.currentTimeMillis(), geofencedmessage, 0x10000000);
    }

    public static PendingIntent createOpenGeofencingWobDetailIntent(Context context, com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage, PendingIntent pendingintent)
    {
        geofencedmessage = InternalIntents.forAction(context, "com.google.android.apps.wallet.services.notification.OPEN_GEOFENCING_NOTIFICATION_WOB_DETAIL").putExtra("OPEN_NOTIFICATION_INTENT", pendingintent).putExtra("GEOFENCED_MESSAGE_PROTO", MessageNano.toByteArray(geofencedmessage)).setData(createNotificationServiceDataUri(Protos.valueWithDefault(geofencedmessage.type, 1)));
        return PendingIntent.getService(context, (int)System.currentTimeMillis(), geofencedmessage, 0x10000000);
    }

    public static PendingIntent createOpenPushNotificationIntent(Context context, PendingIntent pendingintent, String as[], int i, String s)
    {
        pendingintent = InternalIntents.forAction(context, "com.google.android.apps.wallet.services.notification.OPEN_PUSH_NOTIFICATION").putExtra("OPEN_NOTIFICATION_INTENT", pendingintent).putExtra("NOTIFICATION_IDS", as).setData(createNotificationServiceDataUri(i));
        if (s != null)
        {
            pendingintent.putExtra("ANALYTICS_EVENT_LABEL", s);
        }
        return PendingIntent.getService(context, (int)System.currentTimeMillis(), pendingintent, 0x10000000);
    }

    private void handleDismissGeofencingNotificationAction(Intent intent)
    {
        SharedPreference.ALLOW_REMOVING_GEOFENCING_NOTIFICATION.put(sharedPreferences, Boolean.valueOf(true));
    }

    private void handleDismissPushNotificationAction(Intent intent)
    {
        removeDisplayedNotifications(intent);
        intent = (PendingIntent)intent.getParcelableExtra("DISMISS_NOTIFICATION_INTENT");
        if (intent == null)
        {
            return;
        } else
        {
            sendPendingIntent(intent);
            return;
        }
    }

    private void handleOpenGeofencingNotificationAction(Intent intent, boolean flag)
    {
        PendingIntent pendingintent;
        com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage;
        pendingintent = (PendingIntent)intent.getParcelableExtra("OPEN_NOTIFICATION_INTENT");
        if (pendingintent == null)
        {
            WLog.e(SERVICE_NAME, "Missing notification intent");
            return;
        }
        SharedPreference.ALLOW_REMOVING_GEOFENCING_NOTIFICATION.put(sharedPreferences, Boolean.valueOf(true));
        if (!intent.hasExtra("GEOFENCED_MESSAGE_PROTO"))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        geofencedmessage = new com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage();
        com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage.mergeFrom(geofencedmessage, intent.getByteArrayExtra("GEOFENCED_MESSAGE_PROTO"));
        int i = Protos.valueWithDefault(geofencedmessage.type, 1);
        intent = geofencingNotificationHandlerManager.getNotificationHandler(i);
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        intent.cancelNotification();
        intent.onOpen(geofencedmessage);
_L2:
        sendPendingIntent(pendingintent);
        getApplicationContext().sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        return;
        intent;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void handleOpenPushNotificationAction(Intent intent)
    {
        WLog.dfmt(SERVICE_NAME, "handleOpenPushNotificationAction intent %s", new Object[] {
            intent
        });
        removeDisplayedNotifications(intent);
        PendingIntent pendingintent = (PendingIntent)intent.getParcelableExtra("OPEN_NOTIFICATION_INTENT");
        WLog.dfmt(SERVICE_NAME, "handleOpenPushNotificationAction notificationIntent %s", new Object[] {
            pendingintent
        });
        if (pendingintent == null)
        {
            WLog.e(SERVICE_NAME, "Missing notification intent");
            return;
        }
        if (intent.hasExtra("ANALYTICS_EVENT_LABEL"))
        {
            intent = intent.getStringExtra("ANALYTICS_EVENT_LABEL");
            analyticsUtil.sendOpenNotification(intent, new AnalyticsCustomDimension[0]);
        }
        sendPendingIntent(pendingintent);
        getApplicationContext().sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    private void removeDisplayedNotifications(Intent intent)
    {
        if (intent.hasExtra("NOTIFICATION_TYPE"))
        {
            int i = intent.getExtras().getInt("NOTIFICATION_TYPE");
            WLog.dfmt(SERVICE_NAME, "Removing legacyNotifications with type %s", new Object[] {
                Integer.valueOf(i)
            });
            notificationProtoManager.deleteNotifications(i);
        }
        if (intent.hasExtra("NOTIFICATION_IDS"))
        {
            intent = intent.getExtras().getStringArray("NOTIFICATION_IDS");
            WLog.dfmt(SERVICE_NAME, "Removing displayedNotifications with ids %s", new Object[] {
                Arrays.toString(intent)
            });
            notificationPersistenceManager.removeNotificationIds(ImmutableSet.copyOf(intent));
        }
    }

    private static void sendPendingIntent(PendingIntent pendingintent)
    {
        try
        {
            pendingintent.send();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            WLog.e(SERVICE_NAME, "Failed to send pending intent", pendingintent);
        }
    }

    protected final void doOnHandleIntent(Intent intent)
    {
        String s1 = intent.getAction();
        String s2 = SERVICE_NAME;
        String s = String.valueOf(intent.getAction());
        if (s.length() != 0)
        {
            s = "Received intent ".concat(s);
        } else
        {
            s = new String("Received intent ");
        }
        WLog.d(s2, s);
        if ("com.google.android.apps.wallet.services.notification.OPEN_PUSH_NOTIFICATION".equals(s1))
        {
            handleOpenPushNotificationAction(intent);
            return;
        }
        if ("com.google.android.apps.wallet.services.notification.DISMISS_PUSH_NOTIFICATION".equals(s1))
        {
            handleDismissPushNotificationAction(intent);
            return;
        }
        if ("com.google.android.apps.wallet.services.notification.OPEN_GEOFENCING_NOTIFICATION".equals(s1))
        {
            handleOpenGeofencingNotificationAction(intent, false);
            return;
        }
        if ("com.google.android.apps.wallet.services.notification.OPEN_GEOFENCING_NOTIFICATION_WOB_DETAIL".equals(s1))
        {
            handleOpenGeofencingNotificationAction(intent, true);
            return;
        }
        if ("com.google.android.apps.wallet.services.notification.DISMISS_GEOFENCING_NOTIFICATION".equals(s1))
        {
            handleDismissGeofencingNotificationAction(intent);
            return;
        }
        s = SERVICE_NAME;
        intent = String.valueOf(s1);
        if (intent.length() != 0)
        {
            intent = "Received an unhandled intent ".concat(intent);
        } else
        {
            intent = new String("Received an unhandled intent ");
        }
        WLog.d(s, intent);
    }

}
