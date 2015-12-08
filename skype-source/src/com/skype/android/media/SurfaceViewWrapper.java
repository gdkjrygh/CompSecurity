// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

// Referenced classes of package com.skype.android.media:
//            SurfaceWrapper, SurfaceListener, SurfaceTextureRenderer

public class SurfaceViewWrapper
    implements android.view.SurfaceHolder.Callback, SurfaceWrapper
{

    private SurfaceListener a;
    private SurfaceView b;

    public SurfaceViewWrapper(Context context, SurfaceListener surfacelistener)
    {
        a = surfacelistener;
        b = new SurfaceView(context);
        b.getHolder().addCallback(this);
    }

    public final Matrix a(Matrix matrix)
    {
        throw new UnsupportedOperationException();
    }

    public final Surface a()
    {
        return b.getHolder().getSurface();
    }

    public final void a(Runnable runnable)
    {
        b.post(runnable);
    }

    public final SurfaceTexture b()
    {
        return null;
    }

    public final void b(Matrix matrix)
    {
        throw new UnsupportedOperationException();
    }

    public final volatile View c()
    {
        return b;
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

    public final SurfaceView h()
    {
        return b;
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        a.onSurfaceSizeChanged(this, j, k);
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        a.onSurfaceAvailable(this);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        a.onSurfaceDestroyed(this);
    }
}
