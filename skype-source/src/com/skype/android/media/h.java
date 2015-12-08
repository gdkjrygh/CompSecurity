// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

// Referenced classes of package com.skype.android.media:
//            j, i

final class h
    implements j
{

    private EGLDisplay a;
    private EGLContext b;
    private EGLSurface c;

    h()
    {
        b = EGL14.EGL_NO_CONTEXT;
        a = EGL14.EGL_NO_DISPLAY;
        c = EGL14.EGL_NO_SURFACE;
    }

    public final void a()
    {
        if (!EGL14.eglSwapBuffers(a, c))
        {
            throw new i("eglSwapBuffers");
        } else
        {
            return;
        }
    }

    public final void a(SurfaceTexture surfacetexture)
    {
        a = EGL14.eglGetDisplay(0);
        if (a == EGL14.EGL_NO_DISPLAY)
        {
            throw new i("eglGetDisplay EGL14.EGL_NO_DISPLAY");
        }
        Object aobj[] = new int[2];
        if (!EGL14.eglInitialize(a, ((int []) (aobj)), 0, ((int []) (aobj)), 1))
        {
            throw new i("eglInitialize");
        }
        aobj = new EGLConfig[1];
        int ai[] = new int[1];
        if (!EGL14.eglChooseConfig(a, new int[] {
    12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 
    12326, 0, 12352, 4, 12344
}, 0, ((EGLConfig []) (aobj)), 0, 1, ai, 0))
        {
            i.a("eglChooseConfig");
        }
        b = EGL14.eglCreateContext(a, aobj[0], EGL14.EGL_NO_CONTEXT, new int[] {
            12440, 2, 12344
        }, 0);
        i.a("eglCreateContext");
        c = EGL14.eglCreateWindowSurface(a, aobj[0], surfacetexture, new int[] {
            12344
        }, 0);
        i.a("eglCreateWindowSurface");
    }

    public final void a(boolean flag)
    {
        EGLDisplay egldisplay = a;
        EGLSurface eglsurface;
        EGLSurface eglsurface1;
        EGLContext eglcontext;
        if (flag)
        {
            eglsurface = c;
        } else
        {
            eglsurface = EGL14.EGL_NO_SURFACE;
        }
        if (flag)
        {
            eglsurface1 = c;
        } else
        {
            eglsurface1 = EGL14.EGL_NO_SURFACE;
        }
        if (flag)
        {
            eglcontext = b;
        } else
        {
            eglcontext = EGL14.EGL_NO_CONTEXT;
        }
        if (!EGL14.eglMakeCurrent(egldisplay, eglsurface, eglsurface1, eglcontext))
        {
            throw new i("eglMakeCurrent");
        } else
        {
            return;
        }
    }

    public final void b(boolean flag)
    {
        if (a == EGL14.EGL_NO_DISPLAY)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        a(false);
        EGL14.eglDestroySurface(a, c);
        EGL14.eglDestroyContext(a, b);
        EGL14.eglTerminate(a);
        if (flag)
        {
            EGL14.eglReleaseThread();
        }
        a = EGL14.EGL_NO_DISPLAY;
        c = EGL14.EGL_NO_SURFACE;
        b = EGL14.EGL_NO_CONTEXT;
        return;
        Exception exception;
        exception;
        EGL14.eglDestroySurface(a, c);
        EGL14.eglDestroyContext(a, b);
        EGL14.eglTerminate(a);
        if (flag)
        {
            EGL14.eglReleaseThread();
        }
        a = EGL14.EGL_NO_DISPLAY;
        c = EGL14.EGL_NO_SURFACE;
        b = EGL14.EGL_NO_CONTEXT;
        throw exception;
    }
}
