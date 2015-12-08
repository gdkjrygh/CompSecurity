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
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package android.support.v4.app:
//            al, z, y

final class af
{
    public static final class a
        implements y, z
    {

        private android.app.Notification.Builder a;
        private final Bundle b = new Bundle();
        private List c;

        public final android.app.Notification.Builder a()
        {
            return a;
        }

        public final void a(ad.a a1)
        {
            c.add(af.a(a, a1));
        }

        public final Notification b()
        {
            Notification notification = a.build();
            Object obj = af.a(notification);
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
            obj = af.a(c);
            if (obj != null)
            {
                af.a(notification).putSparseParcelableArray("android.support.actionExtras", ((SparseArray) (obj)));
            }
            return notification;
        }

        public a(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int k, 
                PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int l, int i1, boolean flag, boolean flag1, 
                int j1, CharSequence charsequence3, boolean flag2, Bundle bundle, String s, boolean flag3, String s1)
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
            a = context.setFullScreenIntent(pendingintent1, flag4).setLargeIcon(bitmap).setNumber(k).setUsesChronometer(flag1).setPriority(j1).setProgress(l, i1, flag);
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
    private static Class e;
    private static Field f;
    private static Field g;
    private static Field h;
    private static Field i;
    private static boolean j;

    public static Bundle a(android.app.Notification.Builder builder, ad.a a1)
    {
        builder.addAction(a1.a(), a1.b(), a1.c());
        builder = new Bundle(a1.d());
        if (a1.e() != null)
        {
            builder.putParcelableArray("android.support.remoteInputs", al.a(a1.e()));
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

    public static ad.a a(Notification notification, int k, ad.a.a a1, ak.a.a a2)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        obj1 = g(notification)[k];
        notification = a(notification);
        if (notification == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        notification = notification.getSparseParcelableArray("android.support.actionExtras");
        if (notification == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        notification = (Bundle)notification.get(k);
_L1:
        notification = a(a1, a2, g.getInt(obj1), (CharSequence)h.get(obj1), (PendingIntent)i.get(obj1), ((Bundle) (notification)));
        obj;
        JVM INSTR monitorexit ;
        return notification;
        notification;
        Log.e("NotificationCompat", "Unable to access notification actions", notification);
        j = true;
        obj;
        JVM INSTR monitorexit ;
        return null;
        notification;
        obj;
        JVM INSTR monitorexit ;
        throw notification;
        notification = null;
          goto _L1
    }

    public static ad.a a(ad.a.a a1, ak.a.a a2, int k, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
    {
        if (bundle != null)
        {
            Object aobj[] = bundle.getParcelableArray("android.support.remoteInputs");
            if ((aobj instanceof Bundle[]) || aobj == null)
            {
                aobj = (Bundle[])(Bundle[])aobj;
            } else
            {
                aobj = (Bundle[])Arrays.copyOf(aobj, aobj.length, [Landroid/os/Bundle;);
                bundle.putParcelableArray("android.support.remoteInputs", ((android.os.Parcelable []) (aobj)));
            }
            if (aobj == null)
            {
                a2 = null;
            } else
            {
                ak.a aa[] = a2.a(aobj.length);
                for (int l = 0; l < aobj.length; l++)
                {
                    Object obj = aobj[l];
                    aa[l] = a2.a(((Bundle) (obj)).getString("resultKey"), ((Bundle) (obj)).getCharSequence("label"), ((Bundle) (obj)).getCharSequenceArray("choices"), ((Bundle) (obj)).getBoolean("allowFreeFormInput"), ((Bundle) (obj)).getBundle("extras"));
                }

                a2 = aa;
            }
        } else
        {
            a2 = null;
        }
        return a1.a(k, charsequence, pendingintent, bundle, a2);
    }

    public static SparseArray a(List list)
    {
        SparseArray sparsearray = null;
        int l = list.size();
        for (int k = 0; k < l;)
        {
            Bundle bundle = (Bundle)list.get(k);
            SparseArray sparsearray1 = sparsearray;
            if (bundle != null)
            {
                sparsearray1 = sparsearray;
                if (sparsearray == null)
                {
                    sparsearray1 = new SparseArray();
                }
                sparsearray1.put(k, bundle);
            }
            k++;
            sparsearray = sparsearray1;
        }

        return sparsearray;
    }

    public static ArrayList a(ad.a aa[])
    {
        if (aa != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((ArrayList) (obj));
_L2:
        ArrayList arraylist = new ArrayList(aa.length);
        int l = aa.length;
        int k = 0;
        do
        {
            obj = arraylist;
            if (k >= l)
            {
                continue;
            }
            obj = aa[k];
            Bundle bundle = new Bundle();
            bundle.putInt("icon", ((ad.a) (obj)).a());
            bundle.putCharSequence("title", ((ad.a) (obj)).b());
            bundle.putParcelable("actionIntent", ((ad.a) (obj)).c());
            bundle.putBundle("extras", ((ad.a) (obj)).d());
            bundle.putParcelableArray("remoteInputs", al.a(((ad.a) (obj)).e()));
            arraylist.add(bundle);
            k++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(z z1, CharSequence charsequence, boolean flag, CharSequence charsequence1, Bitmap bitmap, Bitmap bitmap1, boolean flag1)
    {
        z1 = (new android.app.Notification.BigPictureStyle(z1.a())).setBigContentTitle(charsequence).bigPicture(bitmap);
        if (flag1)
        {
            z1.bigLargeIcon(bitmap1);
        }
        if (flag)
        {
            z1.setSummaryText(charsequence1);
        }
    }

    public static void a(z z1, CharSequence charsequence, boolean flag, CharSequence charsequence1, CharSequence charsequence2)
    {
        z1 = (new android.app.Notification.BigTextStyle(z1.a())).setBigContentTitle(charsequence).bigText(charsequence2);
        if (flag)
        {
            z1.setSummaryText(charsequence1);
        }
    }

    public static void a(z z1, CharSequence charsequence, boolean flag, CharSequence charsequence1, ArrayList arraylist)
    {
        z1 = (new android.app.Notification.InboxStyle(z1.a())).setBigContentTitle(charsequence);
        if (flag)
        {
            z1.setSummaryText(charsequence1);
        }
        for (charsequence = arraylist.iterator(); charsequence.hasNext(); z1.addLine((CharSequence)charsequence.next())) { }
    }

    private static boolean a()
    {
        if (!j)
        {
            try
            {
                if (f == null)
                {
                    Object obj = Class.forName("android.app.Notification$Action");
                    e = ((Class) (obj));
                    g = ((Class) (obj)).getDeclaredField("icon");
                    h = e.getDeclaredField("title");
                    i = e.getDeclaredField("actionIntent");
                    obj = android/app/Notification.getDeclaredField("actions");
                    f = ((Field) (obj));
                    ((Field) (obj)).setAccessible(true);
                }
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                Log.e("NotificationCompat", "Unable to access notification actions", classnotfoundexception);
                j = true;
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                Log.e("NotificationCompat", "Unable to access notification actions", nosuchfieldexception);
                j = true;
            }
            if (!j)
            {
                return true;
            }
        }
        return false;
    }

    public static int b(Notification notification)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        notification = ((Notification) (g(notification)));
        if (notification == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        int k = notification.length;
_L1:
        obj;
        JVM INSTR monitorexit ;
        return k;
        notification;
        obj;
        JVM INSTR monitorexit ;
        throw notification;
        k = 0;
          goto _L1
    }

    public static boolean c(Notification notification)
    {
        return a(notification).getBoolean("android.support.localOnly");
    }

    public static String d(Notification notification)
    {
        return a(notification).getString("android.support.groupKey");
    }

    public static boolean e(Notification notification)
    {
        return a(notification).getBoolean("android.support.isGroupSummary");
    }

    public static String f(Notification notification)
    {
        return a(notification).getString("android.support.sortKey");
    }

    private static Object[] g(Notification notification)
    {
label0:
        {
            synchronized (d)
            {
                if (a())
                {
                    break label0;
                }
            }
            return null;
        }
        notification = ((Notification) ((Object[])(Object[])f.get(notification)));
        obj;
        JVM INSTR monitorexit ;
        return notification;
        notification;
        obj;
        JVM INSTR monitorexit ;
        throw notification;
        notification;
        Log.e("NotificationCompat", "Unable to access notification actions", notification);
        j = true;
        obj;
        JVM INSTR monitorexit ;
        return null;
    }

}
