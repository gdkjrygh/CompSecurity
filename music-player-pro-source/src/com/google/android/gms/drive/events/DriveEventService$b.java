// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.RemoteException;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.w;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEventService

final class Pl extends com.google.android.gms.drive.internal.
{

    final DriveEventService Pl;

    public void c(OnEventResponse oneventresponse)
        throws RemoteException
    {
        DriveEventService driveeventservice = Pl;
        driveeventservice;
        JVM INSTR monitorenter ;
        w.m("DriveEventService", (new StringBuilder()).append("onEvent: ").append(oneventresponse).toString());
        DriveEventService.a(Pl);
        if (Pl.Ph == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        oneventresponse = a(Pl.Ph, oneventresponse);
        Pl.Ph.sendMessage(oneventresponse);
_L2:
        return;
        w.p("DriveEventService", "Receiving event before initialize is completed.");
        if (true) goto _L2; else goto _L1
_L1:
        oneventresponse;
        driveeventservice;
        JVM INSTR monitorexit ;
        throw oneventresponse;
    }

    (DriveEventService driveeventservice)
    {
        Pl = driveeventservice;
        super();
    }
}
