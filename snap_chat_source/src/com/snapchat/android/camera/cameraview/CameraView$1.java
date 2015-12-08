// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.cameraview;

import OQ;
import android.graphics.SurfaceTexture;
import com.snapchat.android.Timber;
import qF;

// Referenced classes of package com.snapchat.android.camera.cameraview:
//            CameraView

public final class a
    implements android.view.urfaceTextureListener
{

    private qF a;
    private CameraView b;

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        Timber.c("CameraView", "Camera View: Surface texture available", new Object[0]);
        a.a(surfacetexture);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        Timber.c("CameraView", "Surface Destroyed", new Object[0]);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        CameraView.a(b).a();
    }

    public _cls9(CameraView cameraview, qF qf)
    {
        b = cameraview;
        a = qf;
        super();
    }
}
