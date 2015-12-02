// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            q

static class 
    implements 
{

    public Notification a( )
    {
        Notification notification = .w;
        notification.setLatestEventInfo(.a, .b, .c, .d);
        if (.j > 0)
        {
            notification.flags = notification.flags | 0x80;
        }
        return notification;
    }

    public Bundle a(Notification notification)
    {
        return null;
    }

    ()
    {
    }
}
