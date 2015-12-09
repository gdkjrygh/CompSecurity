// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat

static final class  extends 
{

    public final Notification build$ab8b522( )
    {
        boolean flag1 = true;
        Object obj1 = .;
        Notification notification = .;
        Object obj = .;
        CharSequence charsequence = .;
        CharSequence charsequence1 = .;
        android.app.PendingIntent pendingintent = .;
         = .;
        obj1 = (new android.app.t(((android.content.Context) (obj1)))).t(notification.when).t(notification.icon, notification.iconLevel).t(notification.contentView).t(notification.tickerText, null).t(notification.sound, notification.audioStreamType).t(notification.vibrate).t(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean flag;
        if ((notification.flags & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = ((android.app.t) (obj1)).t(flag);
        if ((notification.flags & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = ((android.app.t) (obj1)).t(flag);
        if ((notification.flags & 0x10) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = ((android.app.t) (obj1)).t(flag).t(notification.defaults).t(((CharSequence) (obj))).t(charsequence).t(charsequence1).t(pendingintent).t(notification.deleteIntent);
        if ((notification.flags & 0x80) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return ((android.app.t) (obj)).t(null, flag).t().t(0).t();
    }

    ()
    {
    }
}
