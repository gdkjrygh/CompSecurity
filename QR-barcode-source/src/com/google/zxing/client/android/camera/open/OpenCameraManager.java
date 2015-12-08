// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.camera.open;

import com.google.zxing.client.android.common.PlatformSupportManager;

// Referenced classes of package com.google.zxing.client.android.camera.open:
//            OpenCameraInterface, DefaultOpenCameraInterface

public final class OpenCameraManager extends PlatformSupportManager
{

    public OpenCameraManager()
    {
        super(com/google/zxing/client/android/camera/open/OpenCameraInterface, new DefaultOpenCameraInterface());
        addImplementationClass(9, "com.google.zxing.client.android.camera.open.GingerbreadOpenCameraInterface");
    }
}
