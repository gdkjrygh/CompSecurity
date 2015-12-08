// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.notifications;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.google.gson.Gson;
import com.squareup.picasso.RequestCreator;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.activity.ActivityService;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.logging.L;
import me.lyft.android.managers.DeepLinkManager;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.ui.MainActivity;

// Referenced classes of package me.lyft.android.notifications:
//            IStatusBarNotificationsService, StatusBarNotification, QuickAction, StatusBarNotificationMapper

public class StatusBarNotificationsService extends ActivityService
    implements IStatusBarNotificationsService
{

    private static final int LIGHTS_OFF_MILLIS = 1000;
    private static final int LIGHTS_ON_MILLIS = 300;
    private static final String NOTIFICATION_SOUND = "android.resource://me.lyft.android/raw/passenger_notification";
    IAppForegroundDetector appForegroundedDetector;
    DeepLinkManager deepLinkManager;
    Gson gson;
    ImageLoader imageLoader;
    NotificationManager notificationManager;
    ILyftPreferences preferences;

    public StatusBarNotificationsService(ImageLoader imageloader, NotificationManager notificationmanager, ILyftPreferences ilyftpreferences, IAppForegroundDetector iappforegrounddetector, Gson gson1, DeepLinkManager deeplinkmanager)
    {
        imageLoader = imageloader;
        notificationManager = notificationmanager;
        preferences = ilyftpreferences;
        appForegroundedDetector = iappforegrounddetector;
        gson = gson1;
        deepLinkManager = deeplinkmanager;
    }

    private void addActions(android.support.v4.app.NotificationCompat.Builder builder, Context context, StatusBarNotification statusbarnotification)
    {
        statusbarnotification = statusbarnotification.getActions().iterator();
        do
        {
            if (!statusbarnotification.hasNext())
            {
                break;
            }
            QuickAction quickaction = (QuickAction)statusbarnotification.next();
            if (!Strings.isNullOrEmpty(quickaction.getDeeplink()) && deepLinkManager.isSupportedDeepLink(quickaction.getDeeplink()))
            {
                Intent intent = new Intent(context, me/lyft/android/ui/MainActivity);
                intent.setFlags(0x20000000);
                intent.setData(Uri.parse(quickaction.getDeeplink()));
                int i = quickaction.getDeeplink().hashCode();
                builder.addAction(0, quickaction.getButtonText(), PendingIntent.getActivity(context, i, intent, 0x8000000));
            }
        } while (true);
    }

    private void addBaseNotificationParams(android.support.v4.app.NotificationCompat.Builder builder, Context context, StatusBarNotification statusbarnotification)
    {
        builder.setDefaults(2).setSmallIcon(0x7f0201c5).setColor(context.getResources().getColor(0x7f0c007e)).setContentTitle(statusbarnotification.getTitle()).setContentText(statusbarnotification.getMessage()).setAutoCancel(true).setLights(context.getResources().getColor(0x7f0c007c), 300, 1000).setSound(Uri.parse("android.resource://me.lyft.android/raw/passenger_notification"));
    }

    private void addBigTextStyle(android.support.v4.app.NotificationCompat.Builder builder, Context context, StatusBarNotification statusbarnotification)
    {
        android.support.v4.app.NotificationCompat.BigTextStyle bigtextstyle = new android.support.v4.app.NotificationCompat.BigTextStyle();
        bigtextstyle.setBigContentTitle(statusbarnotification.getBigTitle());
        bigtextstyle.bigText(statusbarnotification.getMessage());
        builder.setStyle(bigtextstyle);
        if (Strings.isNullOrEmpty(statusbarnotification.getBigImageUrl()))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        builder.setLargeIcon(imageLoader.load(statusbarnotification.getBigImageUrl()).resize((int)context.getResources().getDimension(0x1050005), (int)context.getResources().getDimension(0x1050006)).centerInside().get());
        return;
        builder;
        L.e(builder, "StatusBarNotificationsService: unable to load image", new Object[0]);
        return;
    }

    private void addPendingIntent(android.support.v4.app.NotificationCompat.Builder builder, Context context, StatusBarNotification statusbarnotification)
    {
        Intent intent = new Intent(context, me/lyft/android/ui/MainActivity);
        if (!Strings.isNullOrEmpty(statusbarnotification.getDeepLink()))
        {
            intent.setData(Uri.parse(statusbarnotification.getDeepLink()));
        }
        intent.setFlags(0x20000000);
        builder.setContentIntent(PendingIntent.getActivity(context, 0, intent, 0x8000000));
    }

    private boolean messageExpired(StatusBarNotification statusbarnotification)
    {
        return statusbarnotification.getTimestamp() < preferences.getLastPushTimestamp();
    }

    private void saveMessageTime(StatusBarNotification statusbarnotification)
    {
        preferences.setLastPushTimestamp(statusbarnotification.getTimestamp());
    }

    public void hideMessage(Bundle bundle)
    {
        bundle = StatusBarNotificationMapper.createStatusBarNotification(bundle, gson);
        if (messageExpired(bundle))
        {
            return;
        } else
        {
            saveMessageTime(bundle);
            notificationManager.cancel(2);
            return;
        }
    }

    public void onActivityResumed(Activity activity)
    {
        super.onActivityResumed(activity);
        notificationManager.cancel(2);
    }

    public void showMessage(Context context, Bundle bundle)
    {
        bundle = StatusBarNotificationMapper.createStatusBarNotification(bundle, gson);
        if (!messageExpired(bundle))
        {
            saveMessageTime(bundle);
            if (!appForegroundedDetector.isForegrounded())
            {
                try
                {
                    android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(context);
                    addBaseNotificationParams(builder, context, bundle);
                    addPendingIntent(builder, context, bundle);
                    addBigTextStyle(builder, context, bundle);
                    addActions(builder, context, bundle);
                    builder.setVisibility(1);
                    notificationManager.cancel(2);
                    notificationManager.notify(2, builder.build());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    L.e(context, "handleMessageEvent", new Object[0]);
                }
                return;
            }
        }
    }
}
