// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

// Referenced classes of package com.google.android.libraries.wordlens:
//            GL2SurfaceView

final class b
    implements android.opengl.GLSurfaceView.EGLContextFactory
{

    private static int a = 12440;
    private GLSurfaceView b;

    public b(GLSurfaceView glsurfaceview)
    {
        b = glsurfaceview;
    }

    public final EGLContext createContext(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig)
    {
        GL2SurfaceView.a("Before eglCreateContext", egl10);
        int i = a;
        egldisplay = egl10.eglCreateContext(egldisplay, eglconfig, EGL10.EGL_NO_CONTEXT, new int[] {
            i, 2, 12344
        });
        GL2SurfaceView.a("After eglCreateContext", egl10);
        return egldisplay;
    }

    public final void destroyContext(EGL10 egl10, EGLDisplay egldisplay, EGLContext eglcontext)
    {
        egl10.eglDestroyContext(egldisplay, eglcontext);
    }

}
