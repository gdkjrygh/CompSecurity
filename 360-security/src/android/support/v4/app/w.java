// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package android.support.v4.app:
//            ad, p, o

class w
{
    public static class a
        implements o, p
    {

        private android.app.Notification.Builder a;
        private final Bundle b = new Bundle();
        private List c;

        public android.app.Notification.Builder a()
        {
            return a;
        }

        public void a(s.a a1)
        {
            c.add(w.a(a, a1));
        }

        public Notification b()
        {
            Notification notification = a.build();
            Object obj = w.a(notification);
            Bundle bundle = new Bundle(b);
            Iterator iterator = b.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                if (((Bundle) (obj)).containsKey(s))
                {
                    bundle.remove(s);
                }
            } while (true);
            ((Bundle) (obj)).putAll(bundle);
            obj = w.a(c);
            if (obj != null)
            {
                w.a(notification).putSparseParcelableArray("android.support.actionExtras", ((SparseArray) (obj)));
            }
            return notification;
        }

        public a(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
                PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
                int l, CharSequence charsequence3, boolean flag2, Bundle bundle, String s, boolean flag3, String s1)
        {
            c = new ArrayList();
            context = (new android.app.Notification.Builder(context)).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
            boolean flag4;
            if ((notification.flags & 2) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            context = context.setOngoing(flag4);
            if ((notification.flags & 8) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            context = context.setOnlyAlertOnce(flag4);
            if ((notification.flags & 0x10) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            context = context.setAutoCancel(flag4).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent);
            if ((notification.flags & 0x80) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            a = context.setFullScreenIntent(pendingintent1, flag4).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag1).setPriority(l).setProgress(j, k, flag);
            if (bundle != null)
            {
                b.putAll(bundle);
            }
            if (flag2)
            {
                b.putBoolean("android.support.localOnly", true);
            }
            if (s != null)
            {
                b.putString("android.support.groupKey", s);
                if (flag3)
                {
                    b.putBoolean("android.support.isGroupSummary", true);
                } else
                {
                    b.putBoolean("android.support.useSideChannel", true);
                }
            }
            if (s1 != null)
            {
                b.putString("android.support.sortKey", s1);
            }
        }
    }


    private static final Object a = new Object();
    private static Field b;
    private static boolean c;
    private static final Object d = new Object();

    public static Bundle a(android.app.Notification.Builder builder, s.a a1)
    {
        builder.addAction(a1.a(), a1.b(), a1.c());
        builder = new Bundle(a1.d());
        if (a1.f() != null)
        {
            builder.putParcelableArray("android.support.remoteInputs", ad.a(a1.f()));
        }
        return builder;
    }

    public static Bundle a(Notification notification)
    {
label0:
        {
            synchronized (a)
            {
                if (!c)
                {
                    break label0;
                }
            }
            return null;
        }
        Object obj;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        obj = android/app/Notification.getDeclaredField("extras");
        if (android/os/Bundle.isAssignableFrom(((Field) (obj)).getType()))
        {
            break MISSING_BLOCK_LABEL_58;
        }
        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
        c = true;
        obj1;
        JVM INSTR monitorexit ;
        return null;
        ((Field) (obj)).setAccessible(true);
        b = ((Field) (obj));
        Bundle bundle = (Bundle)b.get(notification);
        obj = bundle;
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        obj = new Bundle();
        b.set(notification, obj);
        obj1;
        JVM INSTR monitorexit ;
        return ((Bundle) (obj));
        notification;
        obj1;
        JVM INSTR monitorexit ;
        throw notification;
        notification;
        Log.e("NotificationCompat", "Unable to access notification extras", notification);
_L1:
        c = true;
        obj1;
        JVM INSTR monitorexit ;
        return null;
        notification;
        Log.e("NotificationCompat", "Unable to access notification extras", notification);
          goto _L1
    }

    public static SparseArray a(List list)
    {
        SparseArray sparsearray = null;
        int j = list.size();
        for (int i = 0; i < j;)
        {
            Bundle bundle = (Bundle)list.get(i);
            SparseArray sparsearray1 = sparsearray;
            if (bundle != null)
            {
                sparsearray1 = sparsearray;
                if (sparsearray == null)
                {
                    sparsearray1 = new SparseArray();
                }
                sparsearray1.put(i, bundle);
            }
            i++;
            sparsearray = sparsearray1;
        }

        return sparsearray;
    }

    public static void a(p p1, CharSequence charsequence, boolean flag, CharSequence charsequence1, Bitmap bitmap, Bitmap bitmap1, boolean flag1)
    {
        p1 = (new android.app.Notification.BigPictureStyle(p1.a())).setBigContentTitle(charsequence).bigPicture(bitmap);
        if (flag1)
        {
            p1.bigLargeIcon(bitmap1);
        }
        if (flag)
        {
            p1.setSummaryText(charsequence1);
        }
    }

    public static void a(p p1, CharSequence charsequence, boolean flag, CharSequence charsequence1, CharSequence charsequence2)
    {
        p1 = (new android.app.Notification.BigTextStyle(p1.a())).setBigContentTitle(charsequence).bigText(charsequence2);
        if (flag)
        {
            p1.setSummaryText(charsequence1);
        }
    }

    public static void a(p p1, CharSequence charsequence, boolean flag, CharSequence charsequence1, ArrayList arraylist)
    {
        p1 = (new android.app.Notification.InboxStyle(p1.a())).setBigContentTitle(charsequence);
        if (flag)
        {
            p1.setSummaryText(charsequence1);
        }
        for (charsequence = arraylist.iterator(); charsequence.hasNext(); p1.addLine((CharSequence)charsequence.next())) { }
    }

}
