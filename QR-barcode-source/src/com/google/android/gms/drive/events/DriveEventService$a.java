// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.v;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEventService

final class NZ extends Handler
{

    final DriveEventService NZ;

    static Message a(NZ nz)
    {
        return nz.hW();
    }

    static Message a(hW hw, OnEventResponse oneventresponse)
    {
        return hw.b(oneventresponse);
    }

    private Message b(OnEventResponse oneventresponse)
    {
        return obtainMessage(1, oneventresponse);
    }

    private Message hW()
    {
        return obtainMessage(2);
    }

    public void handleMessage(Message message)
    {
        v.n("DriveEventService", (new StringBuilder()).append("handleMessage message type:").append(message.what).toString());
        switch (message.what)
        {
        default:
            v.p("DriveEventService", (new StringBuilder()).append("Unexpected message type:").append(message.what).toString());
            return;

        case 1: // '\001'
            DriveEventService.a(NZ, (OnEventResponse)message.obj);
            return;

        case 2: // '\002'
            getLooper().quit();
            break;
        }
    }

    (DriveEventService driveeventservice)
    {
        NZ = driveeventservice;
        super();
    }
}
