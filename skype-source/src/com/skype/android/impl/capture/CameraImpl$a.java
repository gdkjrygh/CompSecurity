// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.impl.capture;

import android.hardware.Camera;
import com.skype.android.platform.capture.CameraCallback;

// Referenced classes of package com.skype.android.impl.capture:
//            CameraImpl

final class b
    implements android.hardware.wCallback
{

    final CameraImpl a;
    private final CameraCallback b;

    public final void onPreviewFrame(byte abyte0[], Camera camera)
    {
        b.onFrame(abyte0, a);
    }

    public lback(CameraImpl cameraimpl, CameraCallback cameracallback)
    {
        a = cameraimpl;
        super();
        b = cameracallback;
    }
}
