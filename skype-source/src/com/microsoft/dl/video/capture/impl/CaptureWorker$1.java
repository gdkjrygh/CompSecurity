// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl;

import com.microsoft.dl.utils.Log;

// Referenced classes of package com.microsoft.dl.video.capture.impl:
//            CaptureWorker

class a
    implements Runnable
{

    final CaptureWorker a;
    private final Thread b = Thread.currentThread();

    public void run()
    {
        b.join();
        CaptureWorker.a(CaptureWorker.a(a), CaptureWorker.b(a));
_L1:
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        if (Log.isLoggable("Capture", 5))
        {
            Log.w("Capture", (new StringBuilder("Interrupted (")).append(CaptureWorker.c(a)).append(")").toString(), interruptedexception);
            return;
        }
          goto _L1
    }

    _cls9(CaptureWorker captureworker)
    {
        a = captureworker;
        super();
    }
}
