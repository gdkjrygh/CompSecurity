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
//            RemoteInputCompatApi20, NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions

class NotificationCompatApi20
{
    public static class Builder
        implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions
    {

        private android.app.Notification.Builder b;

        public void addAction(NotificationCompatBase.Action action)
        {
            android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
            if (action.getRemoteInputs() != null)
            {
                android.app.RemoteInput aremoteinput[] = RemoteInputCompatApi20.fromCompat(action.getRemoteInputs());
                int j = aremoteinput.length;
                for (int i = 0; i < j; i++)
                {
                    builder.addRemoteInput(aremoteinput[i]);
                }

            }
            if (action.getExtras() != null)
            {
                builder.addExtras(action.getExtras());
            }
            b.addAction(builder.build());
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
                int l, CharSequence charsequence3, boolean flag2, Bundle bundle, String s, boolean flag3, String s1)
        {
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
            b = context.setFullScreenIntent(pendingintent1, flag4).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag1).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag2).setExtras(bundle).setGroup(s).setGroupSummary(flag3).setSortKey(s1);
        }
    }


    NotificationCompatApi20()
    {
    }

    public static NotificationCompatBase.Action getAction(Notification notification, int i, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
    {
        return getActionCompatFromAction(notification.actions[i], factory, factory1);
    }

    private static NotificationCompatBase.Action getActionCompatFromAction(android.app.Notification.Action action, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
    {
        factory1 = RemoteInputCompatApi20.toCompat(action.getRemoteInputs(), factory1);
        return factory.build(action.icon, action.title, action.actionIntent, action.getExtras(), factory1);
    }

    private static android.app.Notification.Action getActionFromActionCompat(NotificationCompatBase.Action action)
    {
        android.app.Notification.Action.Builder builder = (new android.app.Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent())).addExtras(action.getExtras());
        action = action.getRemoteInputs();
        if (action != null)
        {
            action = RemoteInputCompatApi20.fromCompat(action);
            int j = action.length;
            for (int i = 0; i < j; i++)
            {
                builder.addRemoteInput(action[i]);
            }

        }
        return builder.build();
    }

    public static NotificationCompatBase.Action[] getActionsFromParcelableArrayList(ArrayList arraylist, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
    {
        if (arraylist != null) goto _L2; else goto _L1
_L1:
        NotificationCompatBase.Action aaction[] = null;
_L4:
        return aaction;
_L2:
        NotificationCompatBase.Action aaction1[] = factory.newArray(arraylist.size());
        int i = 0;
        do
        {
            aaction = aaction1;
            if (i >= aaction1.length)
            {
                continue;
            }
            aaction1[i] = getActionCompatFromAction((android.app.Notification.Action)arraylist.get(i), factory, factory1);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String getGroup(Notification notification)
    {
        return notification.getGroup();
    }

    public static boolean getLocalOnly(Notification notification)
    {
        return (notification.flags & 0x100) != 0;
    }

    public static ArrayList getParcelableArrayListForActions(NotificationCompatBase.Action aaction[])
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
            arraylist1.add(getActionFromActionCompat(aaction[i]));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String getSortKey(Notification notification)
    {
        return notification.getSortKey();
    }

    public static boolean isGroupSummary(Notification notification)
    {
        return (notification.flags & 0x200) != 0;
    }
}
