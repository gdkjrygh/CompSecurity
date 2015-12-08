// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;

final class cu extends cq
{

    cu()
    {
    }

    public final Notification a(cn cn1, co co)
    {
        boolean flag1 = true;
        Object obj1 = cn1.a;
        co = cn1.v;
        Object obj = cn1.b;
        CharSequence charsequence = cn1.c;
        CharSequence charsequence1 = cn1.f;
        android.app.PendingIntent pendingintent = cn1.d;
        cn1 = cn1.e;
        obj1 = (new android.app.Notification.Builder(((android.content.Context) (obj1)))).setWhen(((Notification) (co)).when).setSmallIcon(((Notification) (co)).icon, ((Notification) (co)).iconLevel).setContent(((Notification) (co)).contentView).setTicker(((Notification) (co)).tickerText, null).setSound(((Notification) (co)).sound, ((Notification) (co)).audioStreamType).setVibrate(((Notification) (co)).vibrate).setLights(((Notification) (co)).ledARGB, ((Notification) (co)).ledOnMS, ((Notification) (co)).ledOffMS);
        boolean flag;
        if ((((Notification) (co)).flags & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = ((android.app.Notification.Builder) (obj1)).setOngoing(flag);
        if ((((Notification) (co)).flags & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = ((android.app.Notification.Builder) (obj1)).setOnlyAlertOnce(flag);
        if ((((Notification) (co)).flags & 0x10) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = ((android.app.Notification.Builder) (obj1)).setAutoCancel(flag).setDefaults(((Notification) (co)).defaults).setContentTitle(((CharSequence) (obj))).setContentText(charsequence).setContentInfo(charsequence1).setContentIntent(pendingintent).setDeleteIntent(((Notification) (co)).deleteIntent);
        if ((((Notification) (co)).flags & 0x80) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return ((android.app.Notification.Builder) (obj)).setFullScreenIntent(null, flag).setLargeIcon(cn1).setNumber(0).getNotification();
    }
}
