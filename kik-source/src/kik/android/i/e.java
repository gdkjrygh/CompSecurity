// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.i;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;

final class e
{

    private EGLDisplay a;
    private EGLContext b;
    private EGLSurface c;
    private Surface d;

    public e(Surface surface)
    {
        if (surface == null)
        {
            throw new NullPointerException();
        }
        d = surface;
        a = EGL14.eglGetDisplay(0);
        if (a == EGL14.EGL_NO_DISPLAY)
        {
            throw new RuntimeException("unable to get EGL14 display");
        }
        surface = new int[2];
        if (!EGL14.eglInitialize(a, surface, 0, surface, 1))
        {
            a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        surface = new EGLConfig[1];
        int ai[] = new int[1];
        if (!EGL14.eglChooseConfig(a, new int[] {
    12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 
    12344
}, 0, surface, 0, 1, ai, 0))
        {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        b = EGL14.eglCreateContext(a, surface[0], EGL14.EGL_NO_CONTEXT, new int[] {
            12440, 2, 12344
        }, 0);
        a("eglCreateContext");
        if (b == null)
        {
            throw new RuntimeException("null context");
        }
        c = EGL14.eglCreateWindowSurface(a, surface[0], d, new int[] {
            12344
        }, 0);
        a("eglCreateWindowSurface");
        if (c == null)
        {
            throw new RuntimeException("surface was null");
        } else
        {
            return;
        }
    }

    private static void a(String s)
    {
        boolean flag = false;
        do
        {
            int i = EGL14.eglGetError();
            if (i == 12288)
            {
                break;
            }
            Log.e("InputSurface", (new StringBuilder()).append(s).append(": EGL error: 0x").append(Integer.toHexString(i)).toString());
            flag = true;
        } while (true);
        if (flag)
        {
            throw new RuntimeException("EGL error encountered (see log)");
        } else
        {
            return;
        }
    }

    public final void a()
    {
        if (EGL14.eglGetCurrentContext().equals(b))
        {
            EGL14.eglMakeCurrent(a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(a, c);
        EGL14.eglDestroyContext(a, b);
        d.release();
        a = null;
        b = null;
        c = null;
        d = null;
    }

    public final void a(long l)
    {
        EGLExt.eglPresentationTimeANDROID(a, c, l);
    }

    public final void b()
    {
        if (!EGL14.eglMakeCurrent(a, c, c, b))
        {
            throw new RuntimeException("eglMakeCurrent failed");
        } else
        {
            return;
        }
    }

    public final boolean c()
    {
        return EGL14.eglSwapBuffers(a, c);
    }
}
