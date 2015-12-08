// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.skype.android.media:
//            SurfaceWrapper, GLES20Renderer, SurfaceListener, SurfaceTextureRenderer

public class GLSurfaceViewWrapper
    implements android.opengl.GLSurfaceView.Renderer, android.view.SurfaceHolder.Callback, SurfaceWrapper
{

    private SurfaceListener a;
    private GLSurfaceView b;
    private GLES20Renderer c;
    private Matrix d;

    GLSurfaceViewWrapper(Context context, SurfaceListener surfacelistener, android.graphics.SurfaceTexture.OnFrameAvailableListener onframeavailablelistener)
    {
        a = surfacelistener;
        c = new GLES20Renderer(this, onframeavailablelistener, true);
        b = new GLSurfaceView(context);
        b.setEGLContextClientVersion(2);
        b.setRenderer(this);
        b.setRenderMode(0);
        b.getHolder().addCallback(this);
    }

    static GLES20Renderer a(GLSurfaceViewWrapper glsurfaceviewwrapper)
    {
        return glsurfaceviewwrapper.c;
    }

    public final Matrix a(Matrix matrix)
    {
        Matrix matrix1 = matrix;
        if (matrix == null)
        {
            matrix1 = new Matrix();
        }
        matrix1.set(d);
        return matrix1;
    }

    public final Surface a()
    {
        throw new UnsupportedOperationException();
    }

    public final void a(Runnable runnable)
    {
        b.queueEvent(runnable);
    }

    public final SurfaceTexture b()
    {
        return c.c();
    }

    public final void b(Matrix matrix)
    {
        d = matrix;
    }

    public final View c()
    {
        return b;
    }

    public final void d()
    {
        b.onPause();
    }

    public final void e()
    {
        b.onResume();
    }

    public final void f()
    {
        b.requestRender();
    }

    public final SurfaceTextureRenderer g()
    {
        return c;
    }

    public void onDrawFrame(GL10 gl10)
    {
        c.f();
    }

    public void onSurfaceChanged(GL10 gl10, int i, int j)
    {
        a.onSurfaceSizeChanged(this, i, j);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
        c.a(b.getWidth(), b.getHeight());
        a.onSurfaceAvailable(this);
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        b.queueEvent(new Runnable() {

            final GLSurfaceViewWrapper a;

            public final void run()
            {
                GLSurfaceViewWrapper.a(a).d();
            }

            
            {
                a = GLSurfaceViewWrapper.this;
                super();
            }
        });
    }
}
