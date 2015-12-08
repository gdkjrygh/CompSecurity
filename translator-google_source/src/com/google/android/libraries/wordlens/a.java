// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

final class a
    implements android.opengl.GLSurfaceView.EGLConfigChooser
{

    private static int g;
    private static int h[];
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private int i[];

    public a(int j, int k)
    {
        i = new int[1];
        a = 5;
        b = 6;
        c = 5;
        d = 0;
        e = j;
        f = k;
    }

    private int a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, int j)
    {
        int k = 0;
        if (egl10.eglGetConfigAttrib(egldisplay, eglconfig, j, i))
        {
            k = i[0];
        }
        return k;
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig aeglconfig[])
    {
        int k = aeglconfig.length;
        for (int j = 0; j < k; j++)
        {
            EGLConfig eglconfig = aeglconfig[j];
            int l = a(egl10, egldisplay, eglconfig, 12325);
            int i1 = a(egl10, egldisplay, eglconfig, 12326);
            if (l < e || i1 < f)
            {
                continue;
            }
            l = a(egl10, egldisplay, eglconfig, 12324);
            i1 = a(egl10, egldisplay, eglconfig, 12323);
            int j1 = a(egl10, egldisplay, eglconfig, 12322);
            int k1 = a(egl10, egldisplay, eglconfig, 12321);
            if (l == a && i1 == b && j1 == c && k1 == d)
            {
                return eglconfig;
            }
        }

        return null;
    }

    public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay egldisplay)
    {
        int ai[] = new int[1];
        egl10.eglChooseConfig(egldisplay, h, null, 0, ai);
        int j = ai[0];
        if (j <= 0)
        {
            throw new IllegalArgumentException("No configs match configSpec");
        } else
        {
            EGLConfig aeglconfig[] = new EGLConfig[j];
            egl10.eglChooseConfig(egldisplay, h, aeglconfig, j, ai);
            return a(egl10, egldisplay, aeglconfig);
        }
    }

    static 
    {
        g = 4;
        h = (new int[] {
            12324, 4, 12323, 4, 12322, 4, 12352, g, 12344
        });
    }
}
