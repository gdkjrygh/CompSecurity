// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.chimera;

import android.os.RemoteException;
import com.google.android.gms.drive.internal.DriveLog;
import com.google.android.gms.drive.internal.OnEventResponse;

// Referenced classes of package com.google.android.gms.chimera:
//            DriveEventService

final class it> extends com.google.android.gms.drive.internal.I
{

    final DriveEventService this$0;

    public final void onEvent(OnEventResponse oneventresponse)
        throws RemoteException
    {
        DriveEventService driveeventservice = DriveEventService.this;
        driveeventservice;
        JVM INSTR monitorenter ;
        DriveLog.d("DriveEventService", (new StringBuilder("onEvent: ")).append(oneventresponse).toString());
        DriveEventService.access$100(DriveEventService.this);
        if (mEventHandler == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        oneventresponse = .access._mth200(mEventHandler, oneventresponse);
        mEventHandler.sendMessage(oneventresponse);
_L2:
        return;
        DriveLog.e("DriveEventService", "Receiving event before initialize is completed.");
        if (true) goto _L2; else goto _L1
_L1:
        oneventresponse;
        driveeventservice;
        JVM INSTR monitorexit ;
        throw oneventresponse;
    }

    ()
    {
        this$0 = DriveEventService.this;
        super();
    }
}
