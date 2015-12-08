// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;


// Referenced classes of package com.google.android.apps.unveil.sensors.proxies.camera:
//            FakeCamera

class val.dataBuffer
    implements Runnable
{

    final FakeCamera this$0;
    final byte val$dataBuffer[];
    final android.hardware.wCallback val$tmpCallback;

    public void run()
    {
        val$tmpCallback.onPreviewFrame(val$dataBuffer, null);
        FakeCamera.access$702(FakeCamera.this, false);
        synchronized (FakeCamera.this)
        {
            notify();
        }
        return;
        exception;
        fakecamera;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ()
    {
        this$0 = final_fakecamera;
        val$tmpCallback = wcallback;
        val$dataBuffer = _5B_B.this;
        super();
    }
}
