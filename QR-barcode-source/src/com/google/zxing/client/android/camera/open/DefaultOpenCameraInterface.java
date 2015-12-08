// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.camera.open;

import android.hardware.Camera;

// Referenced classes of package com.google.zxing.client.android.camera.open:
//            OpenCameraInterface

final class DefaultOpenCameraInterface
    implements OpenCameraInterface
{

    DefaultOpenCameraInterface()
    {
    }

    public Camera open()
    {
        return Camera.open();
    }
}
