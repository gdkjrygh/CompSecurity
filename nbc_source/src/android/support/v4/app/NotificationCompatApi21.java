// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor, NotificationCompatApi20

class NotificationCompatApi21
{
    public static class Builder
        implements NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor
    {

        private android.app.Notification.Builder b;

        public void addAction(NotificationCompatBase.Action action)
        {
            NotificationCompatApi20.addAction(b, action);
        }

        public Notification build()
        {
            return b.build();
        }

        public android.app.Notification.Builder getBuilder()
        {
            return b;
        }

        public Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
                PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
                boolean flag2, int l, CharSequence charsequence3, boolean flag3, String s, ArrayList arraylist, Bundle bundle, 
                int i1, int j1, Notification notification1, String s1, boolean flag4, String s2)
        {
            context = (new android.app.Notification.Builder(context)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
            if ((notification.flags & 2) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            context = context.setOngoing(flag1);
            if ((notification.flags & 8) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            context = context.setOnlyAlertOnce(flag1);
            if ((notification.flags & 0x10) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            context = context.setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent);
            if ((notification.flags & 0x80) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            b = context.setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setExtras(bundle).setGroup(s1).setGroupSummary(flag4).setSortKey(s2).setCategory(s).setColor(i1).setVisibility(j1).setPublicVersion(notification1);
            for (context = arraylist.iterator(); context.hasNext(); b.addPerson(notification))
            {
                notification = (String)context.next();
            }

        }
    }

}
