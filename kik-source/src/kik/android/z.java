// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.os.Handler;
import android.os.Message;
import android.support.v4.app.NotificationManagerCompat;

// Referenced classes of package kik.android:
//            KikNotificationHandler

final class z extends Handler
{

    final KikNotificationHandler a;

    z(KikNotificationHandler kiknotificationhandler)
    {
        a = kiknotificationhandler;
        super();
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            removeMessages(0);
            break;
        }
        KikNotificationHandler.b(a).cancelAll();
    }
}
