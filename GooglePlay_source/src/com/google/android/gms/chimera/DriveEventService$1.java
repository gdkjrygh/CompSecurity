// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.chimera;

import android.os.Looper;
import com.google.android.gms.drive.internal.DriveLog;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.chimera:
//            DriveEventService

final class val.initLatch extends Thread
{

    final DriveEventService this$0;
    final CountDownLatch val$initLatch;

    public final void run()
    {
        Looper.prepare();
        mEventHandler = new entHandler(DriveEventService.this);
        mInitializing = false;
        val$initLatch.countDown();
        DriveLog.d("DriveEventService", "Bound and starting loop");
        Looper.loop();
        DriveLog.d("DriveEventService", "Finished loop");
        if (DriveEventService.access$300(DriveEventService.this) != null)
        {
            DriveEventService.access$300(DriveEventService.this).countDown();
        }
        return;
        Exception exception;
        exception;
        if (DriveEventService.access$300(DriveEventService.this) != null)
        {
            DriveEventService.access$300(DriveEventService.this).countDown();
        }
        throw exception;
    }

    entHandler()
    {
        this$0 = final_driveeventservice;
        val$initLatch = CountDownLatch.this;
        super();
    }
}
