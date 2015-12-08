// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

// Referenced classes of package com.skype.android.video.render:
//            EGLRenderSurface, EGLException

class EGL14RenderSurface
    implements EGLRenderSurface
{

    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface;

    EGL14RenderSurface()
    {
        eglContext = EGL14.EGL_NO_CONTEXT;
        eglDisplay = EGL14.EGL_NO_DISPLAY;
        eglSurface = EGL14.EGL_NO_SURFACE;
    }

    public void create(SurfaceTexture surfacetexture)
    {
        eglDisplay = EGL14.eglGetDisplay(0);
        if (eglDisplay == EGL14.EGL_NO_DISPLAY)
        {
            throw new EGLException("eglGetDisplay EGL14.EGL_NO_DISPLAY");
        }
        Object aobj[] = new int[2];
        if (!EGL14.eglInitialize(eglDisplay, ((int []) (aobj)), 0, ((int []) (aobj)), 1))
        {
            throw new EGLException("eglInitialize");
        }
        aobj = new EGLConfig[1];
        int ai[] = new int[1];
        if (!EGL14.eglChooseConfig(eglDisplay, new int[] {
    12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 
    12326, 0, 12352, 4, 12344
}, 0, ((EGLConfig []) (aobj)), 0, 1, ai, 0))
        {
            EGLException.check("eglChooseConfig");
        }
        eglContext = EGL14.eglCreateContext(eglDisplay, aobj[0], EGL14.EGL_NO_CONTEXT, new int[] {
            12440, 2, 12344
        }, 0);
        EGLException.check("eglCreateContext");
        eglSurface = EGL14.eglCreateWindowSurface(eglDisplay, aobj[0], surfacetexture, new int[] {
            12344
        }, 0);
        EGLException.check("eglCreateWindowSurface");
    }

    public void destroy(boolean flag)
    {
        if (eglDisplay == EGL14.EGL_NO_DISPLAY)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        makeCurrent(false);
        EGL14.eglDestroySurface(eglDisplay, eglSurface);
        EGL14.eglDestroyContext(eglDisplay, eglContext);
        EGL14.eglTerminate(eglDisplay);
        if (flag)
        {
            EGL14.eglReleaseThread();
        }
        eglDisplay = EGL14.EGL_NO_DISPLAY;
        eglSurface = EGL14.EGL_NO_SURFACE;
        eglContext = EGL14.EGL_NO_CONTEXT;
        return;
        Exception exception;
        exception;
        EGL14.eglDestroySurface(eglDisplay, eglSurface);
        EGL14.eglDestroyContext(eglDisplay, eglContext);
        EGL14.eglTerminate(eglDisplay);
        if (flag)
        {
            EGL14.eglReleaseThread();
        }
        eglDisplay = EGL14.EGL_NO_DISPLAY;
        eglSurface = EGL14.EGL_NO_SURFACE;
        eglContext = EGL14.EGL_NO_CONTEXT;
        throw exception;
    }

    public void makeCurrent(boolean flag)
    {
        EGLDisplay egldisplay = eglDisplay;
        EGLSurface eglsurface;
        EGLSurface eglsurface1;
        EGLContext eglcontext;
        if (flag)
        {
            eglsurface = eglSurface;
        } else
        {
            eglsurface = EGL14.EGL_NO_SURFACE;
        }
        if (flag)
        {
            eglsurface1 = eglSurface;
        } else
        {
            eglsurface1 = EGL14.EGL_NO_SURFACE;
        }
        if (flag)
        {
            eglcontext = eglContext;
        } else
        {
            eglcontext = EGL14.EGL_NO_CONTEXT;
        }
        if (!EGL14.eglMakeCurrent(egldisplay, eglsurface, eglsurface1, eglcontext))
        {
            throw new EGLException("eglMakeCurrent");
        } else
        {
            return;
        }
    }

    public void swapBuffers()
    {
        if (!EGL14.eglSwapBuffers(eglDisplay, eglSurface))
        {
            throw new EGLException("eglSwapBuffers");
        } else
        {
            return;
        }
    }
}
