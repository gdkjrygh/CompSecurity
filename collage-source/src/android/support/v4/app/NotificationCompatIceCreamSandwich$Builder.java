// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

// Referenced classes of package android.support.v4.app:
//            NotificationBuilderWithBuilderAccessor, NotificationCompatIceCreamSandwich

public static class b
    implements NotificationBuilderWithBuilderAccessor
{

    private android.app.ch.Builder.b b;

    public Notification build()
    {
        return b.b();
    }

    public android.app.ch.Builder getBuilder()
    {
        return b;
    }

    public (Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
            PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag)
    {
        context = (new android.app.ch.Builder(context)).Builder(notification.when).Builder(notification.icon, notification.iconLevel).Builder(notification.contentView).Builder(notification.tickerText, remoteviews).Builder(notification.sound, notification.audioStreamType).Builder(notification.vibrate).Builder(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean flag1;
        if ((notification.flags & 2) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        context = context.Builder(flag1);
        if ((notification.flags & 8) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        context = context.Builder(flag1);
        if ((notification.flags & 0x10) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        context = context.Builder(flag1).Builder(notification.defaults).Builder(charsequence).Builder(charsequence1).Builder(charsequence2).Builder(pendingintent).Builder(notification.deleteIntent);
        if ((notification.flags & 0x80) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b = context.b(pendingintent1, flag1).b(bitmap).b(i).b(j, k, flag);
    }
}
