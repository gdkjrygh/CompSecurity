// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat, RemoteInput, NotificationCompatKitKat

static class an extends an
{

    public Notification build(an an)
    {
        an an1 = new an(an.an, an.an, an.an, an.an, an.an, an.an, an.an, an.an, an.an, an.an, an.an, an.an, an.e, an.e, an.e, an.e, an.e, an.e, an.e, an.e, an.e, an.e, an.e);
        NotificationCompat.access$000(an1, an.e);
        NotificationCompat.access$100(an1, an.e);
        return an1.e();
    }

    public e getAction(Notification notification, int i)
    {
        return (e)NotificationCompatKitKat.getAction(notification, i, e, RemoteInput.FACTORY);
    }

    public int getActionCount(Notification notification)
    {
        return NotificationCompatKitKat.getActionCount(notification);
    }

    public Bundle getExtras(Notification notification)
    {
        return NotificationCompatKitKat.getExtras(notification);
    }

    public String getGroup(Notification notification)
    {
        return NotificationCompatKitKat.getGroup(notification);
    }

    public boolean getLocalOnly(Notification notification)
    {
        return NotificationCompatKitKat.getLocalOnly(notification);
    }

    public String getSortKey(Notification notification)
    {
        return NotificationCompatKitKat.getSortKey(notification);
    }

    public boolean isGroupSummary(Notification notification)
    {
        return NotificationCompatKitKat.isGroupSummary(notification);
    }

    an()
    {
    }
}
