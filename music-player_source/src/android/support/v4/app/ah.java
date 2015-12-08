// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            ag, ad

final class ah extends ag
{

    ah()
    {
    }

    public final Notification a(ad ad1)
    {
        Notification notification = ad1.r;
        notification.setLatestEventInfo(ad1.a, ad1.b, ad1.c, ad1.d);
        android.content.Context context = ad1.a;
        CharSequence charsequence = ad1.b;
        CharSequence charsequence1 = ad1.c;
        android.app.PendingIntent pendingintent = ad1.d;
        android.app.PendingIntent pendingintent1 = ad1.e;
        notification.setLatestEventInfo(context, charsequence, charsequence1, pendingintent);
        notification.fullScreenIntent = pendingintent1;
        if (ad1.j > 0)
        {
            notification.flags = notification.flags | 0x80;
        }
        return notification;
    }
}
