// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

// Referenced classes of package com.amobee.pulse3d:
//            CustomGLSurfaceView

private class <init>
    implements <init>
{

    private int EGL_CONTEXT_CLIENT_VERSION;
    final CustomGLSurfaceView this$0;

    public EGLContext createContext(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig)
    {
        int ai[] = new int[3];
        ai[0] = EGL_CONTEXT_CLIENT_VERSION;
        ai[1] = CustomGLSurfaceView.access$200(CustomGLSurfaceView.this);
        ai[2] = 12344;
        EGLContext eglcontext = EGL10.EGL_NO_CONTEXT;
        if (CustomGLSurfaceView.access$200(CustomGLSurfaceView.this) == 0)
        {
            ai = null;
        }
        return egl10.eglCreateContext(egldisplay, eglconfig, eglcontext, ai);
    }

    public void destroyContext(EGL10 egl10, EGLDisplay egldisplay, EGLContext eglcontext)
    {
        if (!egl10.eglDestroyContext(egldisplay, eglcontext))
        {
            Log.e("DefaultContextFactory", (new StringBuilder()).append("display:").append(egldisplay).append(" context: ").append(eglcontext).toString());
            ption("eglDestroyContex", egl10.eglGetError());
        }
    }

    private ()
    {
        this$0 = CustomGLSurfaceView.this;
        super();
        EGL_CONTEXT_CLIENT_VERSION = 12440;
    }

    EGL_CONTEXT_CLIENT_VERSION(EGL_CONTEXT_CLIENT_VERSION egl_context_client_version)
    {
        this();
    }
}
