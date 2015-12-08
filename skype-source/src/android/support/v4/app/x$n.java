// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            x

static final class ilder extends ilder
{

    public final Notification a(ilder ilder)
    {
        Object obj1 = ilder.a;
        Notification notification = ilder.B;
        Object obj = ilder.b;
        CharSequence charsequence = ilder.c;
        CharSequence charsequence1 = ilder.h;
        android.widget.RemoteViews remoteviews = ilder.f;
        int i = ilder.i;
        android.app.PendingIntent pendingintent1 = ilder.d;
        android.app.PendingIntent pendingintent = ilder.e;
        ilder = ilder.g;
        obj1 = (new android.app.fication.Builder(((android.content.Context) (obj1)))).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean flag;
        if ((notification.flags & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = ((android.app.fication.Builder) (obj1)).setOngoing(flag);
        if ((notification.flags & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = ((android.app.fication.Builder) (obj1)).setOnlyAlertOnce(flag);
        if ((notification.flags & 0x10) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = ((android.app.fication.Builder) (obj1)).setAutoCancel(flag).setDefaults(notification.defaults).setContentTitle(((CharSequence) (obj))).setContentText(charsequence).setContentInfo(charsequence1).setContentIntent(pendingintent1).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 0x80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return ((android.app.fication.Builder) (obj)).setFullScreenIntent(pendingintent, flag).setLargeIcon(ilder).setNumber(i).getNotification();
    }

    ilder()
    {
    }
}
