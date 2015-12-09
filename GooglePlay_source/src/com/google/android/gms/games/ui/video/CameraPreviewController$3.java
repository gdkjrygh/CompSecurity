// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import android.graphics.SurfaceTexture;
import com.google.android.gms.games.util.VideoUtils;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            CameraPreviewController

final class this._cls0
    implements android.view.Listener
{

    final CameraPreviewController this$0;

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        CameraPreviewController.access$300(CameraPreviewController.this, i, j);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        VideoUtils.logChatty("CameraPreviewCtrl", "Camera surface destroyed");
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        CameraPreviewController.access$200(CameraPreviewController.this, i, j);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    ()
    {
        this$0 = CameraPreviewController.this;
        super();
    }
}
