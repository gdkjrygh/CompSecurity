// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;

final class bj extends bh
{

    bj()
    {
    }

    public final Notification a(bb bb1)
    {
        boolean flag1 = true;
        Object obj1 = bb1.a;
        Notification notification = bb1.k;
        Object obj = bb1.b;
        CharSequence charsequence = bb1.c;
        android.app.PendingIntent pendingintent = bb1.d;
        bb1 = bb1.e;
        obj1 = (new android.app.Notification.Builder(((android.content.Context) (obj1)))).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean flag;
        if ((notification.flags & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = ((android.app.Notification.Builder) (obj1)).setOngoing(flag);
        if ((notification.flags & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = ((android.app.Notification.Builder) (obj1)).setOnlyAlertOnce(flag);
        if ((notification.flags & 0x10) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = ((android.app.Notification.Builder) (obj1)).setAutoCancel(flag).setDefaults(notification.defaults).setContentTitle(((CharSequence) (obj))).setContentText(charsequence).setContentInfo(null).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 0x80) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return ((android.app.Notification.Builder) (obj)).setFullScreenIntent(null, flag).setLargeIcon(bb1).setNumber(0).getNotification();
    }
}
