// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            at

class g extends g
{

    private int a[];
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private at h;

    private int a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, int i)
    {
        int j = 0;
        if (egl10.eglGetConfigAttrib(egldisplay, eglconfig, i, a))
        {
            j = a[0];
        }
        return j;
    }

    public final EGLConfig a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig aeglconfig[])
    {
        int j = aeglconfig.length;
        for (int i = 0; i < j; i++)
        {
            EGLConfig eglconfig = aeglconfig[i];
            int k = a(egl10, egldisplay, eglconfig, 12325);
            int l = a(egl10, egldisplay, eglconfig, 12326);
            if (k < f || l < g)
            {
                continue;
            }
            k = a(egl10, egldisplay, eglconfig, 12324);
            l = a(egl10, egldisplay, eglconfig, 12323);
            int i1 = a(egl10, egldisplay, eglconfig, 12322);
            int j1 = a(egl10, egldisplay, eglconfig, 12321);
            if (k == b && l == c && i1 == d && j1 == e)
            {
                return eglconfig;
            }
        }

        return null;
    }

    public nfig(at at1)
    {
        h = at1;
        super(at1, new int[] {
            12324, 5, 12323, 6, 12322, 5, 12321, 0, 12325, 16, 
            12326, 0, 12344
        });
        a = new int[1];
        b = 5;
        c = 6;
        d = 5;
        e = 0;
        f = 16;
        g = 0;
    }
}
