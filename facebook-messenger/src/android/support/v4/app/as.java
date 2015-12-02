// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            ar, ap

class as
    implements ar
{

    as()
    {
    }

    public Notification a(ap ap1)
    {
        Notification notification = ap1.r;
        notification.setLatestEventInfo(ap1.a, ap1.b, ap1.c, ap1.d);
        if (ap1.j > 0)
        {
            notification.flags = notification.flags | 0x80;
        }
        return notification;
    }
}
