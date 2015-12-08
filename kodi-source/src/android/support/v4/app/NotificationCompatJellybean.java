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
//            NotificationBuilderWithBuilderAccessor, RemoteInputCompatJellybean, NotificationBuilderWithActions

class NotificationCompatJellybean
{
    public static class Builder
        implements NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor
    {

        private android.app.Notification.Builder b;
        private List mActionExtrasList;
        private final Bundle mExtras = new Bundle();

        public void addAction(NotificationCompatBase.Action action)
        {
            mActionExtrasList.add(NotificationCompatJellybean.writeActionAndGetExtras(b, action));
        }

        public Notification build()
        {
            Notification notification = b.build();
            Object obj = NotificationCompatJellybean.getExtras(notification);
            Bundle bundle = new Bundle(mExtras);
            Iterator iterator = mExtras.keySet().iterator();
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
            obj = NotificationCompatJellybean.buildActionExtrasMap(mActionExtrasList);
            if (obj != null)
            {
                NotificationCompatJellybean.getExtras(notification).putSparseParcelableArray("android.support.actionExtras", ((SparseArray) (obj)));
            }
            return notification;
        }

        public android.app.Notification.Builder getBuilder()
        {
            return b;
        }

        public Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
                PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
                int l, CharSequence charsequence3, boolean flag2, Bundle bundle, String s, boolean flag3, String s1)
        {
            mActionExtrasList = new ArrayList();
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
            b = context.setFullScreenIntent(pendingintent1, flag4).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag1).setPriority(l).setProgress(j, k, flag);
            if (bundle != null)
            {
                mExtras.putAll(bundle);
            }
            if (flag2)
            {
                mExtras.putBoolean("android.support.localOnly", true);
            }
            if (s != null)
            {
                mExtras.putString("android.support.groupKey", s);
                if (flag3)
                {
                    mExtras.putBoolean("android.support.isGroupSummary", true);
                } else
                {
                    mExtras.putBoolean("android.support.useSideChannel", true);
                }
            }
            if (s1 != null)
            {
                mExtras.putString("android.support.sortKey", s1);
            }
        }
    }


    private static final Object sActionsLock = new Object();
    private static Field sExtrasField;
    private static boolean sExtrasFieldAccessFailed;
    private static final Object sExtrasLock = new Object();

    public static void addBigPictureStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, boolean flag, CharSequence charsequence1, Bitmap bitmap, Bitmap bitmap1, boolean flag1)
    {
        notificationbuilderwithbuilderaccessor = (new android.app.Notification.BigPictureStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(charsequence).bigPicture(bitmap);
        if (flag1)
        {
            notificationbuilderwithbuilderaccessor.bigLargeIcon(bitmap1);
        }
        if (flag)
        {
            notificationbuilderwithbuilderaccessor.setSummaryText(charsequence1);
        }
    }

    public static void addBigTextStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, boolean flag, CharSequence charsequence1, CharSequence charsequence2)
    {
        notificationbuilderwithbuilderaccessor = (new android.app.Notification.BigTextStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(charsequence).bigText(charsequence2);
        if (flag)
        {
            notificationbuilderwithbuilderaccessor.setSummaryText(charsequence1);
        }
    }

    public static void addInboxStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, boolean flag, CharSequence charsequence1, ArrayList arraylist)
    {
        notificationbuilderwithbuilderaccessor = (new android.app.Notification.InboxStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(charsequence);
        if (flag)
        {
            notificationbuilderwithbuilderaccessor.setSummaryText(charsequence1);
        }
        for (charsequence = arraylist.iterator(); charsequence.hasNext(); notificationbuilderwithbuilderaccessor.addLine((CharSequence)charsequence.next())) { }
    }

    public static SparseArray buildActionExtrasMap(List list)
    {
        SparseArray sparsearray = null;
        int i = 0;
        for (int j = list.size(); i < j;)
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

    public static Bundle getExtras(Notification notification)
    {
label0:
        {
            synchronized (sExtrasLock)
            {
                if (!sExtrasFieldAccessFailed)
                {
                    break label0;
                }
            }
            return null;
        }
        Object obj;
        if (sExtrasField != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        obj = android/app/Notification.getDeclaredField("extras");
        if (android/os/Bundle.isAssignableFrom(((Field) (obj)).getType()))
        {
            break MISSING_BLOCK_LABEL_58;
        }
        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
        sExtrasFieldAccessFailed = true;
        obj1;
        JVM INSTR monitorexit ;
        return null;
        ((Field) (obj)).setAccessible(true);
        sExtrasField = ((Field) (obj));
        Bundle bundle = (Bundle)sExtrasField.get(notification);
        obj = bundle;
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        obj = new Bundle();
        sExtrasField.set(notification, obj);
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
        sExtrasFieldAccessFailed = true;
        obj1;
        JVM INSTR monitorexit ;
        return null;
        notification;
        Log.e("NotificationCompat", "Unable to access notification extras", notification);
          goto _L1
    }

    public static Bundle writeActionAndGetExtras(android.app.Notification.Builder builder, NotificationCompatBase.Action action)
    {
        builder.addAction(action.getIcon(), action.getTitle(), action.getActionIntent());
        builder = new Bundle(action.getExtras());
        if (action.getRemoteInputs() != null)
        {
            builder.putParcelableArray("android.support.remoteInputs", RemoteInputCompatJellybean.toBundleArray(action.getRemoteInputs()));
        }
        return builder;
    }

}
