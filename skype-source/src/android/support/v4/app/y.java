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

// Referenced classes of package android.support.v4.app:
//            af, v, w

final class y
{
    public static final class a
        implements v, w
    {

        private android.app.Notification.Builder a;
        private Bundle b;

        public final android.app.Notification.Builder a()
        {
            return a;
        }

        public final void a(NotificationCompatBase.Action action)
        {
            y.a(a, action);
        }

        public final Notification b()
        {
            a.setExtras(b);
            return a.build();
        }

        public a(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
                PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
                boolean flag2, int l, CharSequence charsequence3, boolean flag3, ArrayList arraylist, Bundle bundle, String s, 
                boolean flag4, String s1)
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
            a = context.setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setGroup(s).setGroupSummary(flag4).setSortKey(s1);
            b = new Bundle();
            if (bundle != null)
            {
                b.putAll(bundle);
            }
            if (arraylist != null && !arraylist.isEmpty())
            {
                b.putStringArray("android.people", (String[])arraylist.toArray(new String[arraylist.size()]));
            }
        }
    }


    private static android.app.Notification.Action a(NotificationCompatBase.Action action)
    {
        android.app.Notification.Action.Builder builder = (new android.app.Notification.Action.Builder(action.a(), action.b(), action.c())).addExtras(action.d());
        action = action.e();
        if (action != null)
        {
            action = af.a(action);
            int j = action.length;
            for (int i = 0; i < j; i++)
            {
                builder.addRemoteInput(action[i]);
            }

        }
        return builder.build();
    }

    public static ArrayList a(NotificationCompatBase.Action aaction[])
    {
        if (aaction != null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = null;
_L4:
        return arraylist;
_L2:
        ArrayList arraylist1 = new ArrayList(aaction.length);
        int j = aaction.length;
        int i = 0;
        do
        {
            arraylist = arraylist1;
            if (i >= j)
            {
                continue;
            }
            arraylist1.add(a(aaction[i]));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(android.app.Notification.Builder builder, NotificationCompatBase.Action action)
    {
        android.app.Notification.Action.Builder builder1 = new android.app.Notification.Action.Builder(action.a(), action.b(), action.c());
        if (action.e() != null)
        {
            android.app.RemoteInput aremoteinput[] = af.a(action.e());
            int j = aremoteinput.length;
            for (int i = 0; i < j; i++)
            {
                builder1.addRemoteInput(aremoteinput[i]);
            }

        }
        if (action.d() != null)
        {
            builder1.addExtras(action.d());
        }
        builder.addAction(builder1.build());
    }
}
