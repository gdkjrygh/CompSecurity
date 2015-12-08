// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

// Referenced classes of package com.amobee.pulse3d:
//            CustomGLSurfaceView

private static class <init>
    implements <init>
{

    public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, Object obj)
    {
        try
        {
            egl10 = egl10.eglCreateWindowSurface(egldisplay, eglconfig, obj, null);
        }
        // Misplaced declaration of an exception variable
        catch (EGL10 egl10)
        {
            Log.e("CustomGLSurfaceView", "eglCreateWindowSurface", egl10);
            return null;
        }
        return egl10;
    }

    public void destroySurface(EGL10 egl10, EGLDisplay egldisplay, EGLSurface eglsurface)
    {
        egl10.eglDestroySurface(egldisplay, eglsurface);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
