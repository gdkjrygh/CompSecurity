// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            v, w, y

final class z
{
    public static final class a
        implements v, w
    {

        private android.app.Notification.Builder a;

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
            return a.build();
        }

        public a(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
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
            a = context.setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setExtras(bundle).setGroup(s1).setGroupSummary(flag4).setSortKey(s2).setCategory(s).setColor(i1).setVisibility(j1).setPublicVersion(notification1);
            for (context = arraylist.iterator(); context.hasNext(); a.addPerson(notification))
            {
                notification = (String)context.next();
            }

        }
    }


    static Bundle a(NotificationCompatBase.UnreadConversation unreadconversation)
    {
        if (unreadconversation == null)
        {
            return null;
        }
        Bundle bundle = new Bundle();
        Parcelable aparcelable[] = null;
        Object obj = aparcelable;
        if (unreadconversation.d() != null)
        {
            obj = aparcelable;
            if (unreadconversation.d().length > 1)
            {
                obj = unreadconversation.d()[0];
            }
        }
        aparcelable = new Parcelable[unreadconversation.a().length];
        for (int i = 0; i < aparcelable.length; i++)
        {
            Bundle bundle1 = new Bundle();
            bundle1.putString("text", unreadconversation.a()[i]);
            bundle1.putString("author", ((String) (obj)));
            aparcelable[i] = bundle1;
        }

        bundle.putParcelableArray("messages", aparcelable);
        obj = unreadconversation.f();
        if (obj != null)
        {
            bundle.putParcelable("remote_input", (new android.app.RemoteInput.Builder(((RemoteInputCompatBase.RemoteInput) (obj)).a())).setLabel(((RemoteInputCompatBase.RemoteInput) (obj)).b()).setChoices(((RemoteInputCompatBase.RemoteInput) (obj)).c()).setAllowFreeFormInput(((RemoteInputCompatBase.RemoteInput) (obj)).d()).addExtras(((RemoteInputCompatBase.RemoteInput) (obj)).e()).build());
        }
        bundle.putParcelable("on_reply", unreadconversation.b());
        bundle.putParcelable("on_read", unreadconversation.c());
        bundle.putStringArray("participants", unreadconversation.d());
        bundle.putLong("timestamp", unreadconversation.e());
        return bundle;
    }
}
