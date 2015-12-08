// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.graphics.SurfaceTexture;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

// Referenced classes of package com.skype.android.media:
//            j, i

final class f
    implements j
{

    private EGL10 a;
    private EGLDisplay b;
    private EGLContext c;
    private EGLSurface d;

    f()
    {
        c = EGL10.EGL_NO_CONTEXT;
        b = EGL10.EGL_NO_DISPLAY;
        d = EGL10.EGL_NO_SURFACE;
    }

    private static void a(EGL10 egl10, String s)
    {
        int k = egl10.eglGetError();
        if (k != 12288)
        {
            throw new i(k, s);
        } else
        {
            return;
        }
    }

    public final void a()
    {
        if (!a.eglSwapBuffers(b, d))
        {
            throw new i("eglSwapBuffers");
        } else
        {
            return;
        }
    }

    public final void a(SurfaceTexture surfacetexture)
    {
        a = (EGL10)EGLContext.getEGL();
        b = a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (b == EGL10.EGL_NO_DISPLAY)
        {
            throw new i("eglGetDisplay EGL10.EGL_NO_DISPLAY");
        }
        Object aobj[] = new int[2];
        if (!a.eglInitialize(b, ((int []) (aobj))))
        {
            throw new i("eglInitialize");
        }
        aobj = new EGLConfig[1];
        int ai[] = new int[1];
        if (!a.eglChooseConfig(b, new int[] {
    12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 
    12326, 0, 12352, 4, 12344
}, ((EGLConfig []) (aobj)), 1, ai))
        {
            i.a("eglChooseConfig");
        }
        c = a.eglCreateContext(b, aobj[0], EGL10.EGL_NO_CONTEXT, new int[] {
            12440, 2, 12344
        });
        a(a, "eglCreateContext");
        d = a.eglCreateWindowSurface(b, aobj[0], surfacetexture, new int[] {
            12344
        });
        a(a, "eglCreateWindowSurface");
    }

    public final void a(boolean flag)
    {
        EGL10 egl10 = a;
        EGLDisplay egldisplay = b;
        EGLSurface eglsurface;
        EGLSurface eglsurface1;
        EGLContext eglcontext;
        if (flag)
        {
            eglsurface = d;
        } else
        {
            eglsurface = EGL10.EGL_NO_SURFACE;
        }
        if (flag)
        {
            eglsurface1 = d;
        } else
        {
            eglsurface1 = EGL10.EGL_NO_SURFACE;
        }
        if (flag)
        {
            eglcontext = c;
        } else
        {
            eglcontext = EGL10.EGL_NO_CONTEXT;
        }
        if (!egl10.eglMakeCurrent(egldisplay, eglsurface, eglsurface1, eglcontext))
        {
            throw new i("eglMakeCurrent");
        } else
        {
            return;
        }
    }

    public final void b(boolean flag)
    {
        if (b == EGL10.EGL_NO_DISPLAY)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        a(false);
        a.eglDestroySurface(b, d);
        a.eglDestroyContext(b, c);
        a.eglTerminate(b);
        b = EGL10.EGL_NO_DISPLAY;
        d = EGL10.EGL_NO_SURFACE;
        c = EGL10.EGL_NO_CONTEXT;
        return;
        Exception exception;
        exception;
        a.eglDestroySurface(b, d);
        a.eglDestroyContext(b, c);
        a.eglTerminate(b);
        b = EGL10.EGL_NO_DISPLAY;
        d = EGL10.EGL_NO_SURFACE;
        c = EGL10.EGL_NO_CONTEXT;
        throw exception;
    }
}
