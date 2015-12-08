// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            af, ad

class ag
    implements af
{

    ag()
    {
    }

    public Notification a(ad ad1)
    {
        Notification notification = ad1.r;
        notification.setLatestEventInfo(ad1.a, ad1.b, ad1.c, ad1.d);
        if (ad1.j > 0)
        {
            notification.flags = notification.flags | 0x80;
        }
        return notification;
    }
}
