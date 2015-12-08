// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Looper;
import com.google.android.gms.drive.internal.w;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEventService

class Pk extends Thread
{

    final CountDownLatch Pk;
    final DriveEventService Pl;

    public void run()
    {
        Looper.prepare();
        Pl.Ph = new <init>(Pl);
        Pl.Pi = false;
        Pk.countDown();
        w.m("DriveEventService", "Bound and starting loop");
        Looper.loop();
        w.m("DriveEventService", "Finished loop");
        if (DriveEventService.b(Pl) != null)
        {
            DriveEventService.b(Pl).countDown();
        }
        return;
        Exception exception;
        exception;
        if (DriveEventService.b(Pl) != null)
        {
            DriveEventService.b(Pl).countDown();
        }
        throw exception;
    }

    (DriveEventService driveeventservice, CountDownLatch countdownlatch)
    {
        Pl = driveeventservice;
        Pk = countdownlatch;
        super();
    }
}
