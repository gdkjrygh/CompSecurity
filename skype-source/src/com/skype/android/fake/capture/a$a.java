// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.skype.android.platform.capture.CameraCallback;
import com.skype.android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.skype.android.fake.capture:
//            a

private static final class b extends Handler
{

    private final a a;
    private final AtomicReference b;

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 57;
           goto _L1 _L2
_L1:
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Unknown message ")).append(message).toString());
        }
_L4:
        return;
_L2:
        CameraCallback cameracallback = (CameraCallback)b.get();
        if (cameracallback != null)
        {
            cameracallback.onFrame((byte[])message.obj, a);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public eference(a a1, Looper looper)
    {
        super(looper);
        a = a1;
        b = com.skype.android.fake.capture.a.d(a1);
    }
}
