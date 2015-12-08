// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            at

static final class a
{

    WeakReference a;
    EGL10 b;
    EGLDisplay c;
    EGLSurface d;
    EGLConfig e;
    EGLContext f;

    public static void a(String s, int i)
    {
        throw new RuntimeException(b(s, i));
    }

    public static void a(String s, String s1, int i)
    {
        if (ab.a(s, 5))
        {
            Log.w(s, b(s1, i));
        }
    }

    private static String b(String s, int i)
    {
        return (new StringBuilder(String.valueOf(s).length() + 20)).append(s).append(" failed: ").append(i).toString();
    }

    final void a()
    {
        if (d != null && d != EGL10.EGL_NO_SURFACE)
        {
            b.eglMakeCurrent(c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            at at1 = (at)a.get();
            if (at1 != null)
            {
                at.c(at1);
                b.eglDestroySurface(c, d);
            }
            d = null;
        }
    }

    public final void b()
    {
        if (f != null)
        {
            at at1 = (at)a.get();
            if (at1 != null)
            {
                at.b(at1).a(b, c, f);
            }
            f = null;
        }
        if (c != null)
        {
            b.eglTerminate(c);
            c = null;
        }
    }

    public ntext(WeakReference weakreference)
    {
        a = weakreference;
    }
}
