// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            at

final class <init>
    implements <init>
{

    private int a;
    private at b;

    public final EGLContext a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig)
    {
        int i = a;
        at.B();
        EGLContext eglcontext = EGL10.EGL_NO_CONTEXT;
        at.B();
        return egl10.eglCreateContext(egldisplay, eglconfig, eglcontext, null);
    }

    public final void a(EGL10 egl10, EGLDisplay egldisplay, EGLContext eglcontext)
    {
        if (!egl10.eglDestroyContext(egldisplay, eglcontext))
        {
            if (ab.a("DefaultContextFactory", 6))
            {
                egldisplay = String.valueOf(egldisplay);
                eglcontext = String.valueOf(eglcontext);
                Log.e("DefaultContextFactory", (new StringBuilder(String.valueOf(egldisplay).length() + 18 + String.valueOf(eglcontext).length())).append("display:").append(egldisplay).append(" context: ").append(eglcontext).toString());
            }
            a("eglDestroyContex", egl10.eglGetError());
        }
    }

    private ntext(at at1)
    {
        b = at1;
        super();
        a = 12440;
    }

    a(at at1, byte byte0)
    {
        this(at1);
    }
}
