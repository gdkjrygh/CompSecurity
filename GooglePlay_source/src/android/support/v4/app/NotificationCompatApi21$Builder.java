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
//            NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor, NotificationCompatApi21, NotificationCompatApi20

public static final class b
    implements NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor
{

    private android.app._cls21.Builder.b b;

    public final void addAction(cessor cessor)
    {
        NotificationCompatApi20.addAction(b, cessor);
    }

    public final Notification build()
    {
        return b.b();
    }

    public final android.app._cls21.Builder getBuilder()
    {
        return b;
    }

    public cessor(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
            PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
            boolean flag2, int l, CharSequence charsequence3, boolean flag3, String s, ArrayList arraylist, Bundle bundle, 
            int i1, int j1, Notification notification1, String s1, boolean flag4, String s2)
    {
        context = (new android.app._cls21.Builder(context)).Builder(notification.when).(flag1).n(notification.icon, notification.iconLevel).n(notification.contentView).n(notification.tickerText, null).n(notification.sound, notification.audioStreamType).n(notification.vibrate).n(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = context.n(flag);
        if ((notification.flags & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = context.tOnce(flag);
        if ((notification.flags & 0x10) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = context.el(flag).(notification.defaults).itle(charsequence).ext(charsequence1).ext(null).nfo(charsequence2).ntent(pendingintent).tent(notification.deleteIntent);
        if ((notification.flags & 0x80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = context.enIntent(null, flag).n(bitmap).n(0).nometer(false).(l).(0, 0, false).y(flag3).y(bundle).y(null).mary(false).mary(null).(s).(i1).ty(j1).rsion(null);
        for (context = arraylist.iterator(); context.hasNext(); b.b(notification))
        {
            notification = (String)context.next();
        }

    }
}
