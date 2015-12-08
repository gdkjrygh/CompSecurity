// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.real;

import com.microsoft.dl.video.capture.api.Camera;
import com.microsoft.dl.video.capture.api.CameraCallback;

// Referenced classes of package com.microsoft.dl.video.capture.impl.real:
//            RealCameraImpl

private static class b
    implements android.hardware.eraImpl.CallbackHandler, android.hardware.eraImpl.CallbackHandler
{

    private final CameraCallback a;
    private final Camera b;

    public void onError(int i, android.hardware.Camera camera)
    {
        a.onError(i, b);
    }

    public void onPreviewFrame(byte abyte0[], android.hardware.Camera camera)
    {
        a.onFrame(abyte0, b);
    }

    public (CameraCallback cameracallback, Camera camera)
    {
        a = cameracallback;
        b = camera;
    }
}
