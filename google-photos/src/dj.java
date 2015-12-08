// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.NotificationManager;

class dj
{

    dj()
    {
    }

    public int a()
    {
        return 1;
    }

    public void a(NotificationManager notificationmanager, String s, int i)
    {
        notificationmanager.cancel(i);
    }

    public void a(NotificationManager notificationmanager, String s, int i, Notification notification)
    {
        notificationmanager.notify(i, notification);
    }
}
