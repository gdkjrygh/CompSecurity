// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.w;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEventService

final class Pl extends Handler
{

    final DriveEventService Pl;

    static Message a(Pl pl)
    {
        return pl.iE();
    }

    static Message a(iE ie, OnEventResponse oneventresponse)
    {
        return ie.b(oneventresponse);
    }

    private Message b(OnEventResponse oneventresponse)
    {
        return obtainMessage(1, oneventresponse);
    }

    private Message iE()
    {
        return obtainMessage(2);
    }

    public void handleMessage(Message message)
    {
        w.m("DriveEventService", (new StringBuilder()).append("handleMessage message type:").append(message.what).toString());
        switch (message.what)
        {
        default:
            w.o("DriveEventService", (new StringBuilder()).append("Unexpected message type:").append(message.what).toString());
            return;

        case 1: // '\001'
            DriveEventService.a(Pl, (OnEventResponse)message.obj);
            return;

        case 2: // '\002'
            getLooper().quit();
            break;
        }
    }

    (DriveEventService driveeventservice)
    {
        Pl = driveeventservice;
        super();
    }
}
