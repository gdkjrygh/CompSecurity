// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Looper;
import com.google.android.gms.drive.internal.v;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEventService

class NY extends Thread
{

    final CountDownLatch NY;
    final DriveEventService NZ;

    public void run()
    {
        Looper.prepare();
        NZ.NW = new <init>(NZ);
        NY.countDown();
        v.n("DriveEventService", "Bound and starting loop");
        Looper.loop();
        v.n("DriveEventService", "Finished loop");
        DriveEventService.b(NZ).countDown();
        return;
        Exception exception;
        exception;
        DriveEventService.b(NZ).countDown();
        throw exception;
    }

    (DriveEventService driveeventservice, CountDownLatch countdownlatch)
    {
        NZ = driveeventservice;
        NY = countdownlatch;
        super();
    }
}
