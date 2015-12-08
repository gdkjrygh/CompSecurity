// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import com.fitbit.bluetooth.e;
import com.fitbit.dncs.service.DncsSendNotificationService;

// Referenced classes of package com.fitbit.dncs:
//            NotificationManager

class a extends e
{

    final NotificationManager a;

    protected void a()
    {
        NotificationManager.a(a, a.c());
    }

    protected void b()
    {
        NotificationManager.a(a, a.c());
        DncsSendNotificationService.b();
    }

    cationService(NotificationManager notificationmanager)
    {
        a = notificationmanager;
        super();
    }
}
