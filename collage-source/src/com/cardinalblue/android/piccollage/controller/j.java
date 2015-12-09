// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLU;
import android.util.Log;
import android.view.Surface;

class j
{

    private EGLDisplay a;
    private EGLContext b;
    private EGLSurface c;
    private Surface d;

    public j(Surface surface)
    {
        if (surface == null)
        {
            throw new NullPointerException();
        } else
        {
            d = surface;
            d();
            return;
        }
    }

    public static void a(String s)
    {
        boolean flag = false;
        do
        {
            int i = EGL14.eglGetError();
            if (i == 12288)
            {
                break;
            }
            String s1 = GLU.gluErrorString(i);
            Log.e("InputSurface", (new StringBuilder()).append(s).append(": EGL error: 0x").append(Integer.toHexString(i)).append(", error msg: ").append(s1).toString());
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

    private void d()
    {
        a = EGL14.eglGetDisplay(0);
        if (a == EGL14.EGL_NO_DISPLAY)
        {
            throw new RuntimeException("unable to get EGL14 display");
        }
        Object aobj[] = new int[2];
        if (!EGL14.eglInitialize(a, ((int []) (aobj)), 0, ((int []) (aobj)), 1))
        {
            a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        aobj = new EGLConfig[1];
        int ai[] = new int[1];
        EGLDisplay egldisplay = a;
        int i = aobj.length;
        if (!EGL14.eglChooseConfig(egldisplay, new int[] {
    12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 
    12344
}, 0, ((EGLConfig []) (aobj)), 0, i, ai, 0))
        {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        b = EGL14.eglCreateContext(a, aobj[0], EGL14.EGL_NO_CONTEXT, new int[] {
            12440, 2, 12344
        }, 0);
        a("eglCreateContext");
        if (b == null)
        {
            throw new RuntimeException("null context");
        }
        c = EGL14.eglCreateWindowSurface(a, aobj[0], d, new int[] {
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

    public void a()
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

    public void a(long l)
    {
        EGLExt.eglPresentationTimeANDROID(a, c, l);
    }

    public void b()
    {
        if (!EGL14.eglMakeCurrent(a, c, c, b))
        {
            throw new RuntimeException("eglMakeCurrent failed");
        } else
        {
            return;
        }
    }

    public boolean c()
    {
        return EGL14.eglSwapBuffers(a, c);
    }
}
