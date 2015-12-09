// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class bw
{

    private static final Object a = new Object();
    private static Field b;
    private static boolean c;

    public static Bundle a(android.app.Notification.Builder builder, bt bt1)
    {
        builder.addAction(0, null, null);
        builder = new Bundle(bt1.a());
        if (bt1.b() != null)
        {
            builder.putParcelableArray("android.support.remoteInputs", ch.a(bt1.b()));
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

    public static void a(aw aw1)
    {
        (new android.app.Notification.BigPictureStyle(aw1.a())).setBigContentTitle(null).bigPicture(null);
    }

    public static void a(aw aw1, CharSequence charsequence)
    {
        (new android.app.Notification.BigTextStyle(aw1.a())).setBigContentTitle(null).bigText(charsequence);
    }

    public static void a(aw aw1, ArrayList arraylist)
    {
        aw1 = (new android.app.Notification.InboxStyle(aw1.a())).setBigContentTitle(null);
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); aw1.addLine((CharSequence)arraylist.next())) { }
    }

    static 
    {
        new Object();
    }
}
