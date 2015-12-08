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

// Referenced classes of package android.support.v4.app:
//            NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions, NotificationCompatApi20, RemoteInputCompatApi20

public static class b
    implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions
{

    private android.app._cls20.Builder.b b;

    public void addAction(cessor cessor)
    {
        android.app..RemoteInput remoteinput = new android.app.t>(cessor.tIcon(), cessor.tTitle(), cessor.tActionIntent());
        if (cessor.tRemoteInputs() != null)
        {
            android.app.RemoteInput aremoteinput[] = RemoteInputCompatApi20.fromCompat(cessor.tRemoteInputs());
            int j = aremoteinput.length;
            for (int i = 0; i < j; i++)
            {
                remoteinput.emoteInput(aremoteinput[i]);
            }

        }
        if (cessor.tExtras() != null)
        {
            remoteinput.xtras(cessor.tExtras());
        }
        b.b(remoteinput.d());
    }

    public Notification build()
    {
        return b.b();
    }

    public android.app._cls20.Builder getBuilder()
    {
        return b;
    }

    public cessor(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
            PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
            int l, CharSequence charsequence3, boolean flag2, Bundle bundle, String s, boolean flag3, String s1)
    {
        context = (new android.app._cls20.Builder(context)).Builder(notification.when).n(notification.icon, notification.iconLevel).n(notification.contentView).n(notification.tickerText, remoteviews).n(notification.sound, notification.audioStreamType).n(notification.vibrate).n(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean flag4;
        if ((notification.flags & 2) != 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        context = context.n(flag4);
        if ((notification.flags & 8) != 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        context = context.tOnce(flag4);
        if ((notification.flags & 0x10) != 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        context = context.el(flag4).(notification.defaults).itle(charsequence).ext(charsequence1).ext(charsequence3).nfo(charsequence2).ntent(pendingintent).tent(notification.deleteIntent);
        if ((notification.flags & 0x80) != 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        b = context.enIntent(pendingintent1, flag4).n(bitmap).n(i).nometer(flag1).(l).(j, k, flag).y(flag2).y(bundle).y(s).mary(flag3).mary(s1);
    }
}
