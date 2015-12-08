// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OngoingNotificationsManager
{

    private static final String NOTIFICATIONS_SET = "notifications_set";
    private static final String ONGOING_NOTIFICATIONS_LIST = "ongoing_list";
    private NotificationManager notificationManager;
    private final Set notifications;
    private SharedPreferences preferences;

    public OngoingNotificationsManager(Application application)
    {
        notificationManager = (NotificationManager)application.getSystemService("notification");
        preferences = application.getSharedPreferences("ongoing_list", 0);
        notifications = new HashSet(preferences.getStringSet("notifications_set", new HashSet()));
    }

    private void persistNotifications()
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putStringSet("notifications_set", new HashSet(notifications));
        editor.commit();
    }

    public void cancel(int i)
    {
        String s = Integer.toString(i);
        synchronized (notifications)
        {
            if (notifications.contains(s))
            {
                notifications.remove(s);
                persistNotifications();
            }
        }
        notificationManager.cancel(i);
        return;
        exception;
        set;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void cancelAll()
    {
        Set set = notifications;
        set;
        JVM INSTR monitorenter ;
        Iterator iterator = notifications.iterator();
_L2:
        String s;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_63;
            }
            s = (String)iterator.next();
        } while (s == null);
        int i = Integer.parseInt(s);
        notificationManager.cancel(i);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        set;
        JVM INSTR monitorexit ;
        throw exception;
        persistNotifications();
        set;
        JVM INSTR monitorexit ;
    }

    public void notify(int i, Notification notification)
    {
        String s = Integer.toString(i);
        synchronized (notifications)
        {
            if (!notifications.contains(s))
            {
                notifications.add(s);
                persistNotifications();
            }
        }
        notificationManager.notify(i, notification);
        return;
        notification;
        set;
        JVM INSTR monitorexit ;
        throw notification;
    }
}
