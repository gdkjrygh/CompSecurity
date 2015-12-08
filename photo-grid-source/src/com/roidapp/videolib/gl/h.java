// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.gl;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

public final class h
{

    android.opengl.GLSurfaceView.Renderer a;
    int b;
    int c;
    Bitmap d;
    EGL10 e;
    EGLDisplay f;
    EGLConfig g[];
    EGLConfig h;
    EGLContext i;
    EGLSurface j;
    GL10 k;
    String l;
    IntBuffer m;

    public h(int i1, int j1)
    {
        b = i1;
        c = j1;
        int ai[] = new int[2];
        i1 = b;
        j1 = c;
        e = (EGL10)EGLContext.getEGL();
        f = e.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        e.eglInitialize(f, ai);
        ai = new int[15];
        int[] _tmp = ai;
        ai[0] = 12325;
        ai[1] = 0;
        ai[2] = 12326;
        ai[3] = 0;
        ai[4] = 12324;
        ai[5] = 8;
        ai[6] = 12323;
        ai[7] = 8;
        ai[8] = 12322;
        ai[9] = 8;
        ai[10] = 12321;
        ai[11] = 8;
        ai[12] = 12352;
        ai[13] = 4;
        ai[14] = 12344;
        int ai1[] = new int[1];
        e.eglChooseConfig(f, ai, null, 0, ai1);
        int k1 = ai1[0];
        g = new EGLConfig[k1];
        e.eglChooseConfig(f, ai, g, k1, ai1);
        h = g[0];
        i = e.eglCreateContext(f, h, EGL10.EGL_NO_CONTEXT, new int[] {
            12440, 2, 12344
        });
        j = e.eglCreatePbufferSurface(f, h, new int[] {
            12375, i1, 12374, j1, 12344
        });
        if (e.eglGetError() != 12288)
        {
            e.eglMakeCurrent(f, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            e.eglDestroySurface(f, j);
            e.eglDestroyContext(f, i);
            e.eglTerminate(f);
            throw new IllegalArgumentException();
        } else
        {
            e.eglMakeCurrent(f, j, j, i);
            k = (GL10)i.getGL();
            l = Thread.currentThread().getName();
            return;
        }
    }

    public final Bitmap a()
    {
        if (a == null)
        {
            Log.e("PixelBuffer", "getBitmap: Renderer was not set.");
            return null;
        }
        if (!Thread.currentThread().getName().equals(l))
        {
            Log.e("PixelBuffer", "getBitmap: This thread does not own the OpenGL context.");
            return null;
        } else
        {
            a.onDrawFrame(k);
            m.rewind();
            System.currentTimeMillis();
            k.glReadPixels(0, 0, b, c, 6408, 5121, m);
            System.currentTimeMillis();
            d.copyPixelsFromBuffer(m);
            System.currentTimeMillis();
            return d;
        }
    }

    public final void a(android.opengl.GLSurfaceView.Renderer renderer)
    {
        a = renderer;
        if (!Thread.currentThread().getName().equals(l))
        {
            Log.e("PixelBuffer", "setRenderer: This thread does not own the OpenGL context.");
            return;
        } else
        {
            a.onSurfaceCreated(k, h);
            a.onSurfaceChanged(k, b, c);
            m = IntBuffer.allocate(b * c);
            d = Bitmap.createBitmap(b, c, android.graphics.Bitmap.Config.ARGB_8888);
            return;
        }
    }

    public final void b()
    {
        if (d != null && !d.isRecycled())
        {
            d.recycle();
            d = null;
        }
        e.eglMakeCurrent(f, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        e.eglDestroySurface(f, j);
        e.eglDestroyContext(f, i);
        e.eglTerminate(f);
    }
}
