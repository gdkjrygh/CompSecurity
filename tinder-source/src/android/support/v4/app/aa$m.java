// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            aa

static final class lder extends lder
{

    public final Notification a(lder lder, lder lder1)
    {
        Object obj1 = lder.mContext;
        lder1 = lder.mNotification;
        Object obj = lder.mContentTitle;
        CharSequence charsequence = lder.mContentText;
        CharSequence charsequence1 = lder.mContentInfo;
        android.widget.RemoteViews remoteviews = lder.mTickerView;
        int i = lder.mNumber;
        android.app.PendingIntent pendingintent1 = lder.mContentIntent;
        android.app.PendingIntent pendingintent = lder.mFullScreenIntent;
        lder = lder.mLargeIcon;
        obj1 = (new android.app.ication.Builder(((android.content.Context) (obj1)))).setWhen(((Notification) (lder1)).when).setSmallIcon(((Notification) (lder1)).icon, ((Notification) (lder1)).iconLevel).setContent(((Notification) (lder1)).contentView).setTicker(((Notification) (lder1)).tickerText, remoteviews).setSound(((Notification) (lder1)).sound, ((Notification) (lder1)).audioStreamType).setVibrate(((Notification) (lder1)).vibrate).setLights(((Notification) (lder1)).ledARGB, ((Notification) (lder1)).ledOnMS, ((Notification) (lder1)).ledOffMS);
        boolean flag;
        if ((((Notification) (lder1)).flags & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = ((android.app.ication.Builder) (obj1)).setOngoing(flag);
        if ((((Notification) (lder1)).flags & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = ((android.app.ication.Builder) (obj1)).setOnlyAlertOnce(flag);
        if ((((Notification) (lder1)).flags & 0x10) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = ((android.app.ication.Builder) (obj1)).setAutoCancel(flag).setDefaults(((Notification) (lder1)).defaults).setContentTitle(((CharSequence) (obj))).setContentText(charsequence).setContentInfo(charsequence1).setContentIntent(pendingintent1).setDeleteIntent(((Notification) (lder1)).deleteIntent);
        if ((((Notification) (lder1)).flags & 0x80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return ((android.app.ication.Builder) (obj)).setFullScreenIntent(pendingintent, flag).setLargeIcon(lder).setNumber(i).getNotification();
    }

    lder()
    {
    }
}
