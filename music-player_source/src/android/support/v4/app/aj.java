// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            af, ad

final class aj
    implements af
{

    aj()
    {
    }

    public final Notification a(ad ad1)
    {
        android.content.Context context = ad1.a;
        Notification notification = ad1.r;
        CharSequence charsequence = ad1.b;
        CharSequence charsequence1 = ad1.c;
        CharSequence charsequence2 = ad1.h;
        android.widget.RemoteViews remoteviews = ad1.f;
        int i = ad1.i;
        android.app.PendingIntent pendingintent1 = ad1.d;
        android.app.PendingIntent pendingintent = ad1.e;
        android.graphics.Bitmap bitmap = ad1.g;
        int j = ad1.n;
        int k = ad1.o;
        boolean flag1 = ad1.p;
        ad1 = (new android.app.Notification.Builder(context)).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean flag;
        if ((notification.flags & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ad1 = ad1.setOngoing(flag);
        if ((notification.flags & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ad1 = ad1.setOnlyAlertOnce(flag);
        if ((notification.flags & 0x10) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ad1 = ad1.setAutoCancel(flag).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setContentInfo(charsequence2).setContentIntent(pendingintent1).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 0x80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return ad1.setFullScreenIntent(pendingintent, flag).setLargeIcon(bitmap).setNumber(i).setProgress(j, k, flag1).getNotification();
    }
}
