// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.multitouch.photoproto;

import android.app.Notification;
import android.app.NotificationManager;
import bolts.i;
import bolts.j;

// Referenced classes of package com.cardinalblue.android.piccollage.multitouch.photoproto:
//            PCGCMIntentService

class a
    implements i
{

    final PCGCMIntentService a;

    public Object then(j j1)
        throws Exception
    {
        j1 = (Notification)j1.e();
        if (j1 != null)
        {
            PCGCMIntentService.a(PCGCMIntentService.a() % 65535);
            a.a.notify(PCGCMIntentService.b(), j1);
        }
        return null;
    }

    (PCGCMIntentService pcgcmintentservice)
    {
        a = pcgcmintentservice;
        super();
    }
}
