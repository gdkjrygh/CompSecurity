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

public static final class b
    implements NotificationBuilderWithBuilderAccessor
{

    private android.app.ch.Builder.b b;

    public final Notification build()
    {
        return b.b();
    }

    public final android.app.ch.Builder getBuilder()
    {
        return b;
    }

    public (Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
            PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag)
    {
        context = (new android.app.ch.Builder(context)).Builder(notification.when).Builder(notification.icon, notification.iconLevel).Builder(notification.contentView).Builder(notification.tickerText, null).Builder(notification.sound, notification.audioStreamType).Builder(notification.vibrate).Builder(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = context.Builder(flag);
        if ((notification.flags & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = context.Builder(flag);
        if ((notification.flags & 0x10) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = context.Builder(flag).Builder(notification.defaults).Builder(charsequence).Builder(charsequence1).Builder(charsequence2).Builder(pendingintent).Builder(notification.deleteIntent);
        if ((notification.flags & 0x80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = context.b(null, flag).b(bitmap).b(0).b(0, 0, false);
    }
}
