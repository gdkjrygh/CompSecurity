// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

// Referenced classes of package com.skype.android.media:
//            i

final class g
{

    private EGLDisplay a;
    private EGLContext b;
    private EGLSurface c;
    private Surface d;

    public g()
    {
        b = EGL14.EGL_NO_CONTEXT;
        a = EGL14.EGL_NO_DISPLAY;
        c = EGL14.EGL_NO_SURFACE;
    }

    public final void a(long l)
    {
        if (c != EGL14.EGL_NO_SURFACE)
        {
            if (!EGLExt.eglPresentationTimeANDROID(a, c, l))
            {
                throw new i("eglPresentationTimeANDROID");
            }
            if (!EGL14.eglSwapBuffers(a, c))
            {
                throw new i("eglSwapBuffers");
            }
        }
    }

    public final void a(Surface surface, EGLContext eglcontext)
    {
        if (surface == null)
        {
            throw new IllegalArgumentException("null input surface");
        }
        d = surface;
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
    12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 
    12610, 1, 12344
}, 0, ((EGLConfig []) (aobj)), 0, 1, ai, 0))
        {
            i.a("eglChooseConfig");
        }
        b = EGL14.eglCreateContext(a, aobj[0], eglcontext, new int[] {
            12440, 2, 12344
        }, 0);
        i.a("eglCreateContext");
        c = EGL14.eglCreateWindowSurface(a, aobj[0], surface, new int[] {
            12344
        }, 0);
        i.a("eglCreateWindowSurface");
    }

    public final void a(boolean flag)
    {
        if (a == EGL14.EGL_NO_DISPLAY)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        b(false);
        if (d != null)
        {
            d.release();
            d = null;
        }
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
        if (d != null)
        {
            d.release();
            d = null;
        }
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

    public final void b(boolean flag)
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
}
