// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.app.Application;
import android.app.NotificationManager;
import com.google.android.apps.wallet.notifications.LegacyNotificationProtoManager;
import com.google.android.apps.wallet.notifications.NotificationPersistenceManager;
import java.util.concurrent.Callable;

public class ClearNotificationsTask
    implements Callable
{

    private NotificationManager notificationManager;
    private NotificationPersistenceManager notificationPersistenceManager;
    private LegacyNotificationProtoManager notificationProtoManager;

    ClearNotificationsTask(Application application, LegacyNotificationProtoManager legacynotificationprotomanager, NotificationPersistenceManager notificationpersistencemanager)
    {
        notificationManager = (NotificationManager)application.getSystemService("notification");
        notificationProtoManager = legacynotificationprotomanager;
        notificationPersistenceManager = notificationpersistencemanager;
    }

    private Void call()
    {
        notificationManager.cancelAll();
        notificationProtoManager.deleteAllNotifications();
        notificationPersistenceManager.removeAllNotificationIds();
        return null;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }
}
