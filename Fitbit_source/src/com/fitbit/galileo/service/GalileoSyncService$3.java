// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import com.fitbit.e.a;

// Referenced classes of package com.fitbit.galileo.service:
//            GalileoSyncService, GalileoServicesStateListener

class a
    implements Runnable
{

    final boolean a;
    final GalileoSyncService b;

    public void run()
    {
        com.fitbit.e.a.a("GalileoSyncService", "Stop service success[%s]", new Object[] {
            Boolean.valueOf(a)
        });
        b.a.a(com.fitbit.galileo.service.istener.GalileoState.a);
        b.b();
        b.stopSelf();
    }

    istener(GalileoSyncService galileosyncservice, boolean flag)
    {
        b = galileosyncservice;
        a = flag;
        super();
    }
}
