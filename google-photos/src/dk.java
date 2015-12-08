// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.NotificationManager;

class dk extends dj
{

    dk()
    {
    }

    public final void a(NotificationManager notificationmanager, String s, int i)
    {
        notificationmanager.cancel(s, i);
    }

    public final void a(NotificationManager notificationmanager, String s, int i, Notification notification)
    {
        notificationmanager.notify(s, i, notification);
    }
}
