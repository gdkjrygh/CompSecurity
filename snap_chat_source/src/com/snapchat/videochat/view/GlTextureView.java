// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import android.view.TextureView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public abstract class GlTextureView extends TextureView
    implements android.view.TextureView.SurfaceTextureListener
{
    final class a extends Thread
    {

        volatile boolean a;
        volatile boolean b;
        private final SurfaceTexture c;
        private EGL10 d;
        private EGLDisplay e;
        private EGLContext f;
        private EGLSurface g;
        private GlTextureView h;

        public final void run()
        {
            d = (EGL10)EGLContext.getEGL();
            e = d.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (e == EGL10.EGL_NO_DISPLAY)
            {
                throw new RuntimeException((new StringBuilder("eglGetDisplay failed ")).append(GLUtils.getEGLErrorString(d.eglGetError())).toString());
            }
            int ai[] = new int[2];
            if (!d.eglInitialize(e, ai))
            {
                throw new RuntimeException((new StringBuilder("eglInitialize failed ")).append(GLUtils.getEGLErrorString(d.eglGetError())).toString());
            }
            ai = new int[1];
            EGLConfig aeglconfig[] = new EGLConfig[1];
            if (!d.eglChooseConfig(e, new int[] {
        12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 1, 
        12325, 0, 12326, 0, 12344
    }, aeglconfig, 1, ai))
            {
                throw new IllegalArgumentException((new StringBuilder("eglChooseConfig failed ")).append(GLUtils.getEGLErrorString(d.eglGetError())).toString());
            }
            EGLConfig eglconfig;
            if (ai[0] > 0)
            {
                eglconfig = aeglconfig[0];
            } else
            {
                eglconfig = null;
            }
            if (eglconfig == null)
            {
                throw new RuntimeException("eglConfig not initialized");
            }
            f = d.eglCreateContext(e, eglconfig, EGL10.EGL_NO_CONTEXT, new int[] {
                12440, 2, 12344
            });
            g = d.eglCreateWindowSurface(e, eglconfig, c, null);
            if (g == null || g == EGL10.EGL_NO_SURFACE)
            {
                int i = d.eglGetError();
                if (i != 12299)
                {
                    throw new RuntimeException((new StringBuilder("createWindowSurface failed ")).append(GLUtils.getEGLErrorString(i)).toString());
                }
            } else
            if (!d.eglMakeCurrent(e, g, g, f))
            {
                throw new RuntimeException((new StringBuilder("eglMakeCurrent failed ")).append(GLUtils.getEGLErrorString(d.eglGetError())).toString());
            }
            h.a();
_L3:
            if (a)
            {
                break; /* Loop/switch isn't completed */
            }
            h.b();
            d.eglSwapBuffers(e, g);
            int j = d.eglGetError();
            if (j != 12288)
            {
                (new StringBuilder("EGL error = 0x")).append(Integer.toHexString(j));
            }
            this;
            JVM INSTR monitorenter ;
_L1:
            boolean flag = b;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_605;
            }
            wait();
              goto _L1
            Object obj;
            obj;
            ((InterruptedException) (obj)).toString();
              goto _L1
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            b = false;
            this;
            JVM INSTR monitorexit ;
            if (true) goto _L3; else goto _L2
_L2:
            d.eglDestroyContext(e, f);
            d.eglDestroySurface(e, g);
            return;
        }

        a(SurfaceTexture surfacetexture)
        {
            h = GlTextureView.this;
            super();
            a = false;
            b = false;
            c = surfacetexture;
            setName("GlTextureView rendering thread.");
            setPriority(10);
        }
    }


    a a;

    protected GlTextureView(Context context)
    {
        super(context);
        setSurfaceTextureListener(this);
        setOpaque(false);
    }

    public abstract void a();

    public abstract void b();

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        if (a == null)
        {
            a = new a(surfacetexture);
            a.start();
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        a.a = true;
        a = null;
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }
}
