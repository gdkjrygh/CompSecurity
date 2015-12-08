// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;

import android.graphics.SurfaceTexture;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

// Referenced classes of package com.skype.android.video.render:
//            EGLRenderSurface, EGLException

class EGL10RenderSurface
    implements EGLRenderSurface
{

    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private EGL10 egl;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface;

    EGL10RenderSurface()
    {
        eglContext = EGL10.EGL_NO_CONTEXT;
        eglDisplay = EGL10.EGL_NO_DISPLAY;
        eglSurface = EGL10.EGL_NO_SURFACE;
    }

    private static void check(EGL10 egl10, String s)
    {
        int i = egl10.eglGetError();
        if (i != 12288)
        {
            throw new EGLException(i, s);
        } else
        {
            return;
        }
    }

    public void create(SurfaceTexture surfacetexture)
    {
        egl = (EGL10)EGLContext.getEGL();
        eglDisplay = egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglDisplay == EGL10.EGL_NO_DISPLAY)
        {
            throw new EGLException("eglGetDisplay EGL10.EGL_NO_DISPLAY");
        }
        Object aobj[] = new int[2];
        if (!egl.eglInitialize(eglDisplay, ((int []) (aobj))))
        {
            throw new EGLException("eglInitialize");
        }
        aobj = new EGLConfig[1];
        int ai[] = new int[1];
        if (!egl.eglChooseConfig(eglDisplay, new int[] {
    12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 
    12326, 0, 12352, 4, 12344
}, ((EGLConfig []) (aobj)), 1, ai))
        {
            EGLException.check("eglChooseConfig");
        }
        eglContext = egl.eglCreateContext(eglDisplay, aobj[0], EGL10.EGL_NO_CONTEXT, new int[] {
            12440, 2, 12344
        });
        check(egl, "eglCreateContext");
        eglSurface = egl.eglCreateWindowSurface(eglDisplay, aobj[0], surfacetexture, new int[] {
            12344
        });
        check(egl, "eglCreateWindowSurface");
    }

    public void destroy(boolean flag)
    {
        if (eglDisplay == EGL10.EGL_NO_DISPLAY)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        makeCurrent(false);
        egl.eglDestroySurface(eglDisplay, eglSurface);
        egl.eglDestroyContext(eglDisplay, eglContext);
        egl.eglTerminate(eglDisplay);
        eglDisplay = EGL10.EGL_NO_DISPLAY;
        eglSurface = EGL10.EGL_NO_SURFACE;
        eglContext = EGL10.EGL_NO_CONTEXT;
        return;
        Exception exception;
        exception;
        egl.eglDestroySurface(eglDisplay, eglSurface);
        egl.eglDestroyContext(eglDisplay, eglContext);
        egl.eglTerminate(eglDisplay);
        eglDisplay = EGL10.EGL_NO_DISPLAY;
        eglSurface = EGL10.EGL_NO_SURFACE;
        eglContext = EGL10.EGL_NO_CONTEXT;
        throw exception;
    }

    public void makeCurrent(boolean flag)
    {
        EGL10 egl10 = egl;
        EGLDisplay egldisplay = eglDisplay;
        EGLSurface eglsurface;
        EGLSurface eglsurface1;
        EGLContext eglcontext;
        if (flag)
        {
            eglsurface = eglSurface;
        } else
        {
            eglsurface = EGL10.EGL_NO_SURFACE;
        }
        if (flag)
        {
            eglsurface1 = eglSurface;
        } else
        {
            eglsurface1 = EGL10.EGL_NO_SURFACE;
        }
        if (flag)
        {
            eglcontext = eglContext;
        } else
        {
            eglcontext = EGL10.EGL_NO_CONTEXT;
        }
        if (!egl10.eglMakeCurrent(egldisplay, eglsurface, eglsurface1, eglcontext))
        {
            throw new EGLException("eglMakeCurrent");
        } else
        {
            return;
        }
    }

    public void swapBuffers()
    {
        if (!egl.eglSwapBuffers(eglDisplay, eglSurface))
        {
            throw new EGLException("eglSwapBuffers");
        } else
        {
            return;
        }
    }
}
