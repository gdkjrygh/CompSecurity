// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.purchaserecord.api.NewPurchaseRecordReceiptEvent;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.settings.UserSettingsPublisher;
import com.google.android.apps.wallet.sound.SoundRegistry;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Strings;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.notifications:
//            NotificationService, NotificationIconRegistry

public class NotificationProcessor
{

    private static final String TAG = com/google/android/apps/wallet/notifications/NotificationProcessor.getSimpleName();
    private final Application context;
    private final EventBus eventBus;
    private final Provider notificationBuilderProvider;
    private final NotificationManager notificationManager;
    private final UserSettingsPublisher userSettingsPublisher;

    NotificationProcessor(Application application, NotificationManager notificationmanager, Provider provider, UserSettingsPublisher usersettingspublisher, EventBus eventbus)
    {
        context = application;
        notificationManager = notificationmanager;
        notificationBuilderProvider = provider;
        userSettingsPublisher = usersettingspublisher;
        eventBus = eventbus;
    }

    private Uri getRingtoneUri(com.google.wallet.proto.api.NanoWalletNotification.NotificationIndicators notificationindicators)
    {
        if (notificationindicators == null || Protos.valueWithDefaultTrue(notificationindicators.sound)) goto _L2; else goto _L1
_L1:
        String s;
        return null;
_L2:
        if (Strings.isNullOrEmpty(s = Protos.valueWithDefault(userSettingsPublisher.getCachedSettings().ringtoneLocation, "content://settings/wallet/notification_sound"))) goto _L1; else goto _L3
_L3:
        if (!"content://settings/wallet/notification_sound".equals(s)) goto _L5; else goto _L4
_L4:
        if (notificationindicators != null) goto _L7; else goto _L6
_L6:
        notificationindicators = null;
_L8:
        return SoundRegistry.getSoundWithDefault(context, notificationindicators, 1);
_L7:
        notificationindicators = notificationindicators.soundType;
        if (true) goto _L8; else goto _L5
_L5:
        try
        {
            notificationindicators = Uri.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.wallet.proto.api.NanoWalletNotification.NotificationIndicators notificationindicators)
        {
            return null;
        }
        return notificationindicators;
    }

    private PendingIntent resolveIntent(int i, com.google.wallet.proto.api.NanoWalletNotification.NotificationAction notificationaction, String as[], boolean flag)
    {
        notificationaction = resolveIntentUris(Arrays.asList(notificationaction.destinationUri));
        if (!flag)
        {
            WLog.dfmt(TAG, "Adding EXTRA_NOTIFICATION_ID extra with id %s to %s", new Object[] {
                Integer.valueOf(i), notificationaction
            });
            notificationaction.putExtra("notificationId", i);
        }
        return PendingIntent.getActivity(context, 0, notificationaction, 0x10000000);
    }

    private Intent resolveIntentUris(List list)
    {
        String s;
        for (list = list.iterator(); list.hasNext(); WLog.vfmt(TAG, "Unable to resolve tap-uri to launchable Activity: %s", new Object[] {
    s
}))
        {
            s = (String)list.next();
            Intent intent = UriIntents.create(context, Uri.parse(s));
            ResolveInfo resolveinfo = context.getPackageManager().resolveActivity(intent, 0x10000);
            if (resolveinfo != null && resolveinfo.activityInfo != null)
            {
                WLog.dfmt(TAG, "Resolved intent %s for uri %s", new Object[] {
                    intent, s
                });
                return intent;
            }
        }

        WLog.wfmt(TAG, "ClientNotification has no resolvable tap-uris", new Object[0]);
        return null;
    }

    private static void setDigestView(android.support.v4.app.NotificationCompat.Builder builder, com.google.wallet.proto.api.NanoWalletNotification.DigestView digestview)
    {
        android.support.v4.app.NotificationCompat.InboxStyle inboxstyle = new android.support.v4.app.NotificationCompat.InboxStyle();
        if (!Strings.isNullOrEmpty(digestview.summary))
        {
            inboxstyle.setSummaryText(digestview.summary);
        }
        digestview = digestview.line;
        int j = digestview.length;
        for (int i = 0; i < j; i++)
        {
            inboxstyle.addLine(digestview[i]);
        }

        builder.setStyle(inboxstyle);
    }

    private void setIndicators(android.support.v4.app.NotificationCompat.Builder builder, com.google.wallet.proto.api.NanoWalletNotification.NotificationIndicators notificationindicators)
    {
        byte byte1 = 0;
        byte byte0;
        if (notificationindicators == null || Protos.valueWithDefaultTrue(notificationindicators.light))
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (byte0 != 0)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        if (shouldVibrate(notificationindicators))
        {
            byte1 = 2;
        }
        builder.setDefaults(byte0 | byte1);
        builder.setSound(getRingtoneUri(notificationindicators));
    }

    private void setIntents(android.support.v4.app.NotificationCompat.Builder builder, com.google.wallet.proto.api.NanoWalletNotification.ClientNotification clientnotification)
    {
        com.google.wallet.proto.api.NanoWalletNotification.NotificationView notificationview = clientnotification.view;
        builder.setContentIntent(NotificationService.createOpenPushNotificationIntent(context, resolveIntent(clientnotification.clientNotificationId.intValue(), notificationview.primaryAction, clientnotification.notificationId, true), clientnotification.notificationId, clientnotification.clientNotificationId.intValue(), notificationview.primaryAction.notificationTrackingLabel));
        com.google.wallet.proto.api.NanoWalletNotification.NotificationAction anotificationaction[] = notificationview.secondaryAction;
        int j = anotificationaction.length;
        for (int i = 0; i < j; i++)
        {
            com.google.wallet.proto.api.NanoWalletNotification.NotificationAction notificationaction = anotificationaction[i];
            builder.addAction(NotificationIconRegistry.getIconByType(notificationaction.icon, 0), notificationaction.title, NotificationService.createOpenPushNotificationIntent(context, resolveIntent(clientnotification.clientNotificationId.intValue(), notificationaction, clientnotification.notificationId, false), clientnotification.notificationId, clientnotification.clientNotificationId.intValue(), notificationaction.notificationTrackingLabel));
        }

        builder.setDeleteIntent(NotificationService.createDismissPushNotificationIntent(context, clientnotification.notificationId, clientnotification.clientNotificationId.intValue()));
    }

    private boolean shouldVibrate(com.google.wallet.proto.api.NanoWalletNotification.NotificationIndicators notificationindicators)
    {
        if (notificationindicators == null || Protos.valueWithDefaultTrue(notificationindicators.vibrate)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Protos.valueWithDefault(userSettingsPublisher.getCachedSettings().vibrationCondition, 1);
        JVM INSTR tableswitch 1 3: default 83
    //                   1 85
    //                   2 56
    //                   3 14;
           goto _L3 _L4 _L5 _L1
_L5:
        int i = ((AudioManager)context.getSystemService("audio")).getRingerMode();
        if (i == 1)
        {
            return true;
        }
          goto _L1
        notificationindicators;
        return false;
_L3:
        return false;
_L4:
        return true;
    }

    public final void process(com.google.wallet.proto.api.NanoWalletNotification.ClientNotification clientnotification)
    {
        String s = TAG;
        String s1 = String.valueOf(clientnotification);
        WLog.d(s, (new StringBuilder(String.valueOf(s1).length() + 9)).append("process: ").append(s1).toString());
        if (clientnotification.view == null)
        {
            notificationManager.cancel(clientnotification.clientNotificationId.intValue());
        } else
        {
            com.google.wallet.proto.api.NanoWalletNotification.NotificationView notificationview = clientnotification.view;
            android.support.v4.app.NotificationCompat.Builder builder = ((android.support.v4.app.NotificationCompat.Builder)notificationBuilderProvider.get()).setAutoCancel(true).setWhen(Protos.valueWithDefault(notificationview.notificationTimeMillis, 0L)).setContentTitle(notificationview.title).setContentText(notificationview.text).setSmallIcon(NotificationIconRegistry.getIconByType(notificationview.smallIcon, com.google.android.apps.walletnfcrel.R.drawable.ic_wallet_logo_white_24dp));
            if (notificationview.ticker != null)
            {
                builder.setTicker(notificationview.ticker);
            }
            setIntents(builder, clientnotification);
            setIndicators(builder, notificationview.indicators);
            if (notificationview.digestView != null)
            {
                setDigestView(builder, notificationview.digestView);
            }
            notificationManager.notify(clientnotification.clientNotificationId.intValue(), builder.build());
            if (clientnotification.clientNotificationId.intValue() == 1 || clientnotification.clientNotificationId.intValue() == 5)
            {
                eventBus.post(new NewPurchaseRecordReceiptEvent(clientnotification.view.primaryAction.destinationUri, clientnotification.clientNotificationId));
                return;
            }
        }
    }

}
