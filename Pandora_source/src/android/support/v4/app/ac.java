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
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            s, t, ab

class ac
{
    public static class a
        implements s, t
    {

        private android.app.Notification.Builder a;
        private Bundle b;
        private List c;

        public android.app.Notification.Builder a()
        {
            return a;
        }

        public void a(x.a a1)
        {
            c.add(ab.a(a, a1));
        }

        public Notification b()
        {
            android.util.SparseArray sparsearray = ab.a(c);
            if (sparsearray != null)
            {
                b.putSparseParcelableArray("android.support.actionExtras", sparsearray);
            }
            a.setExtras(b);
            return a.build();
        }

        public a(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
                PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
                boolean flag2, int l, CharSequence charsequence3, boolean flag3, ArrayList arraylist, Bundle bundle, String s1, 
                boolean flag4, String s2)
        {
            c = new ArrayList();
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
            a = context.setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag);
            b = new Bundle();
            if (bundle != null)
            {
                b.putAll(bundle);
            }
            if (arraylist != null && !arraylist.isEmpty())
            {
                b.putStringArray("android.people", (String[])arraylist.toArray(new String[arraylist.size()]));
            }
            if (flag3)
            {
                b.putBoolean("android.support.localOnly", true);
            }
            if (s1 != null)
            {
                b.putString("android.support.groupKey", s1);
                if (flag4)
                {
                    b.putBoolean("android.support.isGroupSummary", true);
                } else
                {
                    b.putBoolean("android.support.useSideChannel", true);
                }
            }
            if (s2 != null)
            {
                b.putString("android.support.sortKey", s2);
            }
        }
    }

}
