// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat, NotificationCompatApi21

static class  extends 
{

    public Notification build( )
    {
         1 = new (., ., ., ., ., ., ., ., ., ., ., ., .te, .te, .te, .te, .te, .te, .te, .te, .te, .te, .te, .te, .te, .te, .te);
        NotificationCompat.access$000(1, .te);
        NotificationCompat.access$100(1, .te);
        return 1.te();
    }

    public String getCategory(Notification notification)
    {
        return NotificationCompatApi21.getCategory(notification);
    }

    ()
    {
    }
}
