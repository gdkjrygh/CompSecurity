// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;

// Referenced classes of package com.skype.android.media:
//            SurfaceWrapper, GLES20Renderer, GLTextureView, SurfaceListener, 
//            SurfaceTextureRenderer

public class GLTextureViewWrapper
    implements android.view.TextureView.SurfaceTextureListener, SurfaceWrapper
{

    private GLTextureView a;
    private GLES20Renderer b;
    private SurfaceListener c;

    public GLTextureViewWrapper(Context context, SurfaceListener surfacelistener, android.graphics.SurfaceTexture.OnFrameAvailableListener onframeavailablelistener)
    {
        c = surfacelistener;
        b = new GLES20Renderer(this, onframeavailablelistener, false);
        a = new GLTextureView(context);
        a.setSurfaceTextureListener(this);
    }

    public final Matrix a(Matrix matrix)
    {
        return a.getTransform(matrix);
    }

    public final Surface a()
    {
        throw new UnsupportedOperationException();
    }

    public final void a(Runnable runnable)
    {
        a.a(runnable);
    }

    public final SurfaceTexture b()
    {
        return b.c();
    }

    public final void b(Matrix matrix)
    {
        a.setTransform(matrix);
    }

    public final volatile View c()
    {
        return a;
    }

    public final void d()
    {
        a.b();
    }

    public final void e()
    {
        a.c();
    }

    public final void f()
    {
        a.a();
    }

    public final volatile SurfaceTextureRenderer g()
    {
        return b;
    }

    public final GLTextureView h()
    {
        return a;
    }

    public final GLES20Renderer i()
    {
        return b;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int j, int k)
    {
        b.a(j, k);
        a.setRenderer(b);
        c.onSurfaceAvailable(this);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        c.onSurfaceDestroyed(this);
        b.d();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int j, int k)
    {
        c.onSurfaceSizeChanged(this, j, k);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }
}
