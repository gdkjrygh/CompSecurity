// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

public final class ohs
    implements ohu
{

    private int a;
    private ohq b;

    public ohs(ohq ohq1)
    {
        b = ohq1;
        super();
        a = 12440;
    }

    public final EGLContext a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig)
    {
        int ai[] = new int[3];
        ai[0] = a;
        ai[1] = ohq.a(b);
        ai[2] = 12344;
        EGLContext eglcontext = EGL10.EGL_NO_CONTEXT;
        if (ohq.a(b) == 0)
        {
            ai = null;
        }
        return egl10.eglCreateContext(egldisplay, eglconfig, eglcontext, ai);
    }

    public final void a(EGL10 egl10, EGLDisplay egldisplay, EGLContext eglcontext)
    {
        if (!egl10.eglDestroyContext(egldisplay, eglcontext))
        {
            egldisplay = String.valueOf(egldisplay);
            eglcontext = String.valueOf(eglcontext);
            Log.e("DefaultContextFactory", (new StringBuilder(String.valueOf(egldisplay).length() + 18 + String.valueOf(eglcontext).length())).append("display:").append(egldisplay).append(" context: ").append(eglcontext).toString());
            ohw.a("eglDestroyContex", egl10.eglGetError());
        }
    }
}
