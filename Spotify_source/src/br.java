// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;

public final class br
    implements av, aw
{

    private android.app.Notification.Builder a;

    public br(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, PendingIntent pendingintent, Bitmap bitmap, boolean flag, 
            String s, ArrayList arraylist, int i)
    {
        context = (new android.app.Notification.Builder(context)).setWhen(notification.when).setShowWhen(flag).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = context.setOngoing(flag);
        if ((notification.flags & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = context.setOnlyAlertOnce(flag);
        if ((notification.flags & 0x10) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = context.setAutoCancel(flag).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(null).setContentInfo(null).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 0x80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = context.setFullScreenIntent(null, flag).setLargeIcon(bitmap).setNumber(0).setUsesChronometer(false).setPriority(0).setProgress(0, 0, false).setLocalOnly(false).setExtras(null).setGroup(null).setGroupSummary(false).setSortKey(null).setCategory(s).setColor(0).setVisibility(i).setPublicVersion(null);
        for (context = arraylist.iterator(); context.hasNext(); a.addPerson(notification))
        {
            notification = (String)context.next();
        }

    }

    public final android.app.Notification.Builder a()
    {
        return a;
    }

    public final void a(bt bt)
    {
        bo.a(a, bt);
    }

    public final Notification b()
    {
        return a.build();
    }
}
