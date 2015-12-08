// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.multitouch.photoproto;

import android.app.NotificationManager;
import bolts.i;
import bolts.j;

// Referenced classes of package com.cardinalblue.android.piccollage.multitouch.photoproto:
//            PCGCMIntentService

class a
    implements i
{

    final android.support.v4.app.ilder a;
    final PCGCMIntentService b;

    public Void a(j j)
        throws Exception
    {
        j = a.build();
        PCGCMIntentService.a(PCGCMIntentService.a() % 65535);
        b.a.notify(PCGCMIntentService.b(), j);
        return null;
    }

    public Object then(j j)
        throws Exception
    {
        return a(j);
    }

    (PCGCMIntentService pcgcmintentservice, android.support.v4.app.ilder ilder)
    {
        b = pcgcmintentservice;
        a = ilder;
        super();
    }
}
