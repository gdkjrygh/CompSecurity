// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;

// Referenced classes of package com.skype.android.media:
//            SurfaceWrapper, SurfaceListener, SurfaceTextureRenderer

public class TextureViewWrapper
    implements android.view.TextureView.SurfaceTextureListener, SurfaceWrapper
{

    private TextureView a;
    private SurfaceListener b;
    private SurfaceTexture c;

    public TextureViewWrapper(Context context, SurfaceListener surfacelistener)
    {
        b = surfacelistener;
        a = new TextureView(context);
        a.setSurfaceTextureListener(this);
    }

    public final Matrix a(Matrix matrix)
    {
        return a.getTransform(matrix);
    }

    public final Surface a()
    {
        if (c != null)
        {
            return new Surface(c);
        } else
        {
            throw new IllegalStateException("surfaceTexture not available yet");
        }
    }

    public final void a(Runnable runnable)
    {
        a.post(runnable);
    }

    public final SurfaceTexture b()
    {
        return c;
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
    }

    public final void e()
    {
    }

    public final void f()
    {
    }

    public final SurfaceTextureRenderer g()
    {
        return null;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        c = surfacetexture;
        b.onSurfaceAvailable(this);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        b.onSurfaceDestroyed(this);
        c = null;
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        b.onSurfaceSizeChanged(this, i, j);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        b.onSurfaceUpdated(this);
    }
}
