// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import android.hardware.camera2.CameraDevice;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            CameraPreviewController

final class this._cls0 extends android.hardware.camera2.
{

    final CameraPreviewController this$0;

    public final void onDisconnected(CameraDevice cameradevice)
    {
        CameraPreviewController.access$700(CameraPreviewController.this, cameradevice, "Camera disconnected");
    }

    public final void onError(CameraDevice cameradevice, int i)
    {
        CameraPreviewController.access$700(CameraPreviewController.this, cameradevice, (new StringBuilder("Camera error: ")).append(i).toString());
    }

    public final void onOpened(CameraDevice cameradevice)
    {
        CameraPreviewController.access$402(CameraPreviewController.this, cameradevice);
        boolean flag;
        if (CameraPreviewController.access$500(CameraPreviewController.this).availablePermits() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Unexpected lock state");
        CameraPreviewController.access$500(CameraPreviewController.this).release();
        CameraPreviewController.access$600(CameraPreviewController.this);
    }

    ()
    {
        this$0 = CameraPreviewController.this;
        super();
    }
}
