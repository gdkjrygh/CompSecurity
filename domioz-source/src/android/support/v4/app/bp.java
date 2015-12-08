// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            bo, bi

final class bp extends bo
{

    bp()
    {
    }

    public final Notification a(bi bi1)
    {
        Notification notification = bi1.B;
        notification.setLatestEventInfo(bi1.a, bi1.b, bi1.c, bi1.d);
        android.content.Context context = bi1.a;
        CharSequence charsequence = bi1.b;
        CharSequence charsequence1 = bi1.c;
        android.app.PendingIntent pendingintent = bi1.d;
        android.app.PendingIntent pendingintent1 = bi1.e;
        notification.setLatestEventInfo(context, charsequence, charsequence1, pendingintent);
        notification.fullScreenIntent = pendingintent1;
        if (bi1.j > 0)
        {
            notification.flags = notification.flags | 0x80;
        }
        return notification;
    }
}
