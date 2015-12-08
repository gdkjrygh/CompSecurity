// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            x

static final class  extends 
{

    public final Notification a( )
    {
        Notification notification = .B;
        notification.setLatestEventInfo(.a, .b, .c, .d);
        android.content.Context context = .a;
        CharSequence charsequence = .b;
        CharSequence charsequence1 = .c;
        android.app.PendingIntent pendingintent = .d;
        android.app.PendingIntent pendingintent1 = .e;
        notification.setLatestEventInfo(context, charsequence, charsequence1, pendingintent);
        notification.fullScreenIntent = pendingintent1;
        if (.j > 0)
        {
            notification.flags = notification.flags | 0x80;
        }
        return notification;
    }

    ()
    {
    }
}
