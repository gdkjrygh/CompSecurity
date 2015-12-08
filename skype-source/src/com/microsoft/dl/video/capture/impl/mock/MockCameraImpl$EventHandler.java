// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.mock;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.microsoft.dl.utils.Log;

// Referenced classes of package com.microsoft.dl.video.capture.impl.mock:
//            MockCameraImpl

private static class a extends Handler
{

    private final MockCameraImpl a;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", (new StringBuilder("Unknown message ")).append(message).toString());
            }
            return;

        case 0: // '\0'
            byte abyte0[] = (byte[])message.obj;
            long l = message.arg1;
            MockCameraImpl.a(a, abyte0, l);
            return;
        }
    }

    public (MockCameraImpl mockcameraimpl)
    {
        Looper looper1 = Looper.myLooper();
        Looper looper = looper1;
        if (looper1 != null)
        {
            looper = Looper.getMainLooper();
        }
        super(looper);
        a = mockcameraimpl;
    }
}
