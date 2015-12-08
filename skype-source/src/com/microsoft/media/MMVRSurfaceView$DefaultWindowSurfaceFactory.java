// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

// Referenced classes of package com.microsoft.media:
//            MMVRSurfaceView, RtcPalConfig

private class <init>
    implements android.opengl.tory
{

    final MMVRSurfaceView this$0;

    public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, Object obj)
    {
        RtcPalConfig.isLogcatEnabled();
        egl10 = egl10.eglCreateWindowSurface(egldisplay, eglconfig, obj, null);
        MMVRSurfaceView.access$300(MMVRSurfaceView.this);
        return egl10;
    }

    public void destroySurface(EGL10 egl10, EGLDisplay egldisplay, EGLSurface eglsurface)
    {
        egl10.eglDestroySurface(egldisplay, eglsurface);
        MMVRSurfaceView.access$400(MMVRSurfaceView.this);
        RtcPalConfig.isLogcatEnabled();
    }

    private ()
    {
        this$0 = MMVRSurfaceView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
