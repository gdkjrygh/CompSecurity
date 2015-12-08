// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import android.view.TextureView;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            CameraPreviewController

final class this._cls0
    implements iceRotationListenerCallback
{

    final CameraPreviewController this$0;

    public final void onDeviceOrientationChanged(int i)
    {
        GamesLog.d("CameraPreviewCtrl", (new StringBuilder("Device rotation changed to ")).append(i).toString());
        CameraPreviewController.access$200(CameraPreviewController.this, CameraPreviewController.access$100(CameraPreviewController.this).getWidth(), CameraPreviewController.access$100(CameraPreviewController.this).getHeight());
    }

    public final void onInitialDeviceOrientationDetected(int i)
    {
        GamesLog.d("CameraPreviewCtrl", (new StringBuilder("Device rotation starting at ")).append(i).toString());
        CameraPreviewController.access$200(CameraPreviewController.this, CameraPreviewController.access$100(CameraPreviewController.this).getWidth(), CameraPreviewController.access$100(CameraPreviewController.this).getHeight());
    }

    iceRotationListenerCallback()
    {
        this$0 = CameraPreviewController.this;
        super();
    }
}
