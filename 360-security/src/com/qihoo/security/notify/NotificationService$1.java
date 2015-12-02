// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.notify;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.qihoo.security.notify:
//            NotificationService

class a extends Handler
{

    final NotificationService a;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 4104: 
            NotificationService.a(a);
            break;
        }
    }

    (NotificationService notificationservice)
    {
        a = notificationservice;
        super();
    }
}
