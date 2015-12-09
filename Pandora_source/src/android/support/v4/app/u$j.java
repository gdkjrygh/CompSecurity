// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            u, y

static class  extends 
{

    public Notification a( )
    {
        Notification notification = .B;
        notification.setLatestEventInfo(.a, .b, .c, .d);
        notification = y.a(notification, .a, .b, .c, .d, .e);
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
