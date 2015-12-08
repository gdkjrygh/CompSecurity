// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.SparseArray;

// Referenced classes of package android.support.v4.app:
//            NotificationCompatJellybean

class NotificationCompatKitKat
{

    NotificationCompatKitKat()
    {
    }

    public static NotificationCompatBase.Action getAction(Notification notification, int i, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
    {
        android.app.Notification.Action action = notification.actions[i];
        Object obj = null;
        SparseArray sparsearray = notification.extras.getSparseParcelableArray("android.support.actionExtras");
        notification = obj;
        if (sparsearray != null)
        {
            notification = (Bundle)sparsearray.get(i);
        }
        return NotificationCompatJellybean.readAction(factory, factory1, action.icon, action.title, action.actionIntent, notification);
    }

    public static int getActionCount(Notification notification)
    {
        if (notification.actions != null)
        {
            return notification.actions.length;
        } else
        {
            return 0;
        }
    }

    public static Bundle getExtras(Notification notification)
    {
        return notification.extras;
    }

    public static String getGroup(Notification notification)
    {
        return notification.extras.getString("android.support.groupKey");
    }

    public static boolean getLocalOnly(Notification notification)
    {
        return notification.extras.getBoolean("android.support.localOnly");
    }

    public static String getSortKey(Notification notification)
    {
        return notification.extras.getString("android.support.sortKey");
    }

    public static boolean isGroupSummary(Notification notification)
    {
        return notification.extras.getBoolean("android.support.isGroupSummary");
    }
}
