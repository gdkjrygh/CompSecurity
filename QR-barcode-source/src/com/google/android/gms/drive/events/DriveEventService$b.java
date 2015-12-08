// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.RemoteException;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.v;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEventService

final class NZ extends com.google.android.gms.drive.internal.
{

    final DriveEventService NZ;

    public void c(OnEventResponse oneventresponse)
        throws RemoteException
    {
        synchronized (NZ)
        {
            v.n("DriveEventService", (new StringBuilder()).append("onEvent: ").append(oneventresponse).toString());
            o.i(NZ.NW);
            DriveEventService.a(NZ);
            oneventresponse = a(NZ.NW, oneventresponse);
            NZ.NW.sendMessage(oneventresponse);
        }
        return;
        oneventresponse;
        driveeventservice;
        JVM INSTR monitorexit ;
        throw oneventresponse;
    }

    (DriveEventService driveeventservice)
    {
        NZ = driveeventservice;
        super();
    }
}
