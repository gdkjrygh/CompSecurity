// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.service;

import com.fitbit.e.a;
import com.fitbit.galileo.bluetooth.GalileoTaskExecutor;
import com.fitbit.galileo.bluetooth.f;

// Referenced classes of package com.fitbit.dncs.service:
//            DncsSendNotificationService

class me extends GalileoTaskExecutor
{

    final DncsSendNotificationService a;

    protected void d()
    {
        if (this == com.fitbit.dncs.service.DncsSendNotificationService.a(a))
        {
            com.fitbit.e.a.a("DncsSendNotificationService", "Galileo task is finished", new Object[0]);
            com.fitbit.dncs.service.DncsSendNotificationService.a(a, null);
            DncsSendNotificationService.b(a);
        }
    }

    me(DncsSendNotificationService dncssendnotificationservice, f f, com.fitbit.galileo.bluetooth.a a1, com.fitbit.util.threading. )
    {
        a = dncssendnotificationservice;
        super(f, a1, );
    }
}
