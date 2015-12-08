// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            ScreenCaptureOverlay, CameraPreviewController

public final class this._cls0
    implements .CameraPreviewCallbacks
{

    final ScreenCaptureOverlay this$0;

    public final void onCameraPreviewError(Exception exception)
    {
        GamesLog.e("ScreenCaptureOverlay", "Camera preview failed", exception);
        ScreenCaptureOverlay.access$600(ScreenCaptureOverlay.this).onMissingCamera();
        ScreenCaptureOverlay.access$700(ScreenCaptureOverlay.this).mCallbacksHandler = null;
        ScreenCaptureOverlay.access$700(ScreenCaptureOverlay.this).cleanup();
        CameraPreviewController _tmp = ScreenCaptureOverlay.access$702$7d764f8b(ScreenCaptureOverlay.this);
        boolean _tmp1 = ScreenCaptureOverlay.access$802$44fe56bf(ScreenCaptureOverlay.this);
        ScreenCaptureOverlay.access$900(ScreenCaptureOverlay.this);
        ScreenCaptureOverlay.access$1000(ScreenCaptureOverlay.this);
    }

    public ()
    {
        this$0 = ScreenCaptureOverlay.this;
        super();
    }
}
