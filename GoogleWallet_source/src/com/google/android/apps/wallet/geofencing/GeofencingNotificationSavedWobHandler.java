// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing;

import android.app.Application;
import android.app.NotificationManager;
import android.net.Uri;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.geofencing.api.GeofencingNotificationHandler;
import com.google.android.apps.wallet.geofencing.api.GeofencingNotificationServiceClient;
import com.google.android.apps.wallet.geofencing.api.GeofencingServiceDebugInfo;
import com.google.android.apps.wallet.notifications.LegacyNotificationProcessor;
import com.google.android.apps.wallet.notifications.LegacyNotificationProtoManager;
import com.google.android.apps.wallet.settings.UserSettingsPublisher;
import com.google.android.apps.wallet.sound.SoundRegistry;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Strings;
import javax.inject.Provider;

public class GeofencingNotificationSavedWobHandler extends LegacyNotificationProcessor
    implements GeofencingNotificationHandler
{

    private final GeofencingNotificationServiceClient geofencingNotificationServiceClient;
    private final GeofencingServiceDebugInfo geofencingServiceDebugInfo;
    private final UserEventLogger userEventLogger;

    GeofencingNotificationSavedWobHandler(Application application, NotificationManager notificationmanager, LegacyNotificationProtoManager legacynotificationprotomanager, UserSettingsPublisher usersettingspublisher, UserEventLogger usereventlogger, AnalyticsUtil analyticsutil, GeofencingServiceDebugInfo geofencingservicedebuginfo, 
            Provider provider, GeofencingNotificationServiceClient geofencingnotificationserviceclient)
    {
        super(application, notificationmanager, legacynotificationprotomanager, usersettingspublisher, analyticsutil, provider);
        userEventLogger = usereventlogger;
        geofencingServiceDebugInfo = geofencingservicedebuginfo;
        geofencingNotificationServiceClient = geofencingnotificationserviceclient;
    }

    public final void cancelNotification()
    {
        super.cancelNotification();
        geofencingServiceDebugInfo.logMessage("Removes notification");
    }

    protected final int getNotificationMessageId()
    {
        return 9;
    }

    protected final Uri getWalletSoundUri()
    {
        return SoundRegistry.getSound(context, 4);
    }

    public final boolean isEnabled(com.google.wallet.proto.api.NanoWalletSettings.Settings settings)
    {
        if (!Protos.valueWithDefaultTrue(settings.enableNotifications))
        {
            return false;
        }
        settings = settings.wobNotificationSetting;
        int j = settings.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = settings[i];
            if (Protos.valueWithDefaultFalse(((com.google.wallet.proto.api.NanoWalletSettings.DynamicSetting) (obj)).requiresLocationConsent))
            {
                return Protos.valueWithDefaultTrue(((com.google.wallet.proto.api.NanoWalletSettings.DynamicSetting) (obj)).value);
            }
        }

        geofencingServiceDebugInfo.logMessage("No geofencing dynamic settings");
        return false;
    }

    public final void onOpen(com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage)
    {
        analyticsUtil.sendOpenNotification("Geofence", new AnalyticsCustomDimension[0]);
        userEventLogger.log(54, 316);
        geofencingServiceDebugInfo.logMessage("Opens notification");
    }

    public final boolean process(com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage)
    {
        if (geofencedmessage.targetUri == null)
        {
            geofencingServiceDebugInfo.logMessage("Invalid GeofencedMessage, missing targetUri");
            return false;
        }
        if (geofencedmessage.localizedStrings == null || Strings.isNullOrEmpty(geofencedmessage.localizedStrings.title))
        {
            geofencingServiceDebugInfo.logMessage("Invalid GeofencedMessage, missing localizedString");
            return false;
        } else
        {
            GeofencingNotificationServiceClient geofencingnotificationserviceclient = geofencingNotificationServiceClient;
            GeofencingNotificationServiceClient.startService(context, GeofencingNotificationServiceClient.createShowFirstWobIntent(context, geofencedmessage, canBuzzUser(), shouldVibrate(), getRingtoneUri(), getNotificationMessageId()));
            userEventLogger.log(54, 315);
            return true;
        }
    }
}
