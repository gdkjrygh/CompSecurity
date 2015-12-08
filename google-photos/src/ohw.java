// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

final class ohw
{

    WeakReference a;
    EGL10 b;
    EGLDisplay c;
    EGLSurface d;
    EGLConfig e;
    EGLContext f;

    public ohw(WeakReference weakreference)
    {
        a = weakreference;
    }

    public static void a(String s, int i)
    {
        throw new RuntimeException(b(s, i));
    }

    public static void a(String s, String s1, int i)
    {
        Log.w(s, b(s1, i));
    }

    private static String b(String s, int i)
    {
        return (new StringBuilder(String.valueOf(s).length() + 20)).append(s).append(" failed: ").append(i).toString();
    }

    void a()
    {
        if (d != null && d != EGL10.EGL_NO_SURFACE)
        {
            b.eglMakeCurrent(c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            ohq ohq1 = (ohq)a.get();
            if (ohq1 != null)
            {
                ohq.d(ohq1).a(b, c, d);
            }
            d = null;
        }
    }

    public final void b()
    {
        if (f != null)
        {
            ohq ohq1 = (ohq)a.get();
            if (ohq1 != null)
            {
                ohq.c(ohq1).a(b, c, f);
            }
            f = null;
        }
        if (c != null)
        {
            b.eglTerminate(c);
            c = null;
        }
    }
}
