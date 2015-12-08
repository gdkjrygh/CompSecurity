// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.NotificationManager;

// Referenced classes of package android.support.v4.app:
//            ad

static class ger extends ger
{

    public final void a(NotificationManager notificationmanager)
    {
        notificationmanager.cancel(null, 64);
    }

    public final void a(NotificationManager notificationmanager, Notification notification)
    {
        notificationmanager.notify(null, 64, notification);
    }

    ger()
    {
    }
}
