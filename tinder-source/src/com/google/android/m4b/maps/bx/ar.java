// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.ao.b;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

public final class ar
    implements as.d
{
    public static final class a
    {

        final int a;
        final int b;
        final int c;
        final int d;
        final int e;
        final int f;
        boolean g;
        private int h[];

        final int[] a()
        {
            if (h == null)
            {
                if (g)
                {
                    h = (new int[] {
                        12324, a, 12323, b, 12322, c, 12321, d, 12325, e, 
                        12326, f, 12352, 4, 12344
                    });
                } else
                {
                    h = (new int[] {
                        12324, a, 12323, b, 12322, c, 12321, d, 12325, e, 
                        12326, f, 12344
                    });
                }
            }
            return h;
        }

        a(int i, int j, int k, int l, int i1, int j1)
        {
            h = null;
            g = false;
            a = i;
            b = j;
            c = k;
            d = l;
            e = i1;
            f = j1;
        }

        a(a a1)
        {
            this(a1.a, a1.b, a1.c, a1.d, a1.e, a1.f);
        }
    }


    private int a[];
    private final a b[];

    public ar(a aa[])
    {
        a = new int[1];
        b = aa;
    }

    private int a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, int i)
    {
        int j = 0;
        if (egl10.eglGetConfigAttrib(egldisplay, eglconfig, i, a))
        {
            j = a[0];
        }
        return j;
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig aeglconfig[], a a1)
    {
        int j = aeglconfig.length;
        for (int i = 0; i < j; i++)
        {
            EGLConfig eglconfig = aeglconfig[i];
            int k = a(egl10, egldisplay, eglconfig, 12325);
            int l = a(egl10, egldisplay, eglconfig, 12326);
            if (k < a1.e || l < a1.f)
            {
                continue;
            }
            k = a(egl10, egldisplay, eglconfig, 12324);
            l = a(egl10, egldisplay, eglconfig, 12323);
            int i1 = a(egl10, egldisplay, eglconfig, 12322);
            int j1 = a(egl10, egldisplay, eglconfig, 12321);
            if (k == a1.a && l == a1.b && i1 == a1.c && j1 == a1.d)
            {
                return eglconfig;
            }
        }

        return null;
    }

    public final EGLConfig a(EGL10 egl10, EGLDisplay egldisplay)
    {
        int ai[] = new int[1];
        Object obj = new a(b[0]);
        obj.g = true;
        if (!egl10.eglChooseConfig(egldisplay, ((a) (obj)).a(), null, 0, ai))
        {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i;
        boolean flag;
        if (ai[0] > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.ao.b.a(flag);
        i = 0;
        obj = null;
        do
        {
            int ai1[] = b[i].a();
            if (!egl10.eglChooseConfig(egldisplay, ai1, null, 0, ai))
            {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int j = ai[0];
            if (j > 0)
            {
                obj = new EGLConfig[j];
                if (!egl10.eglChooseConfig(egldisplay, ai1, ((EGLConfig []) (obj)), j, ai))
                {
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                obj = a(egl10, egldisplay, ((EGLConfig []) (obj)), b[i]);
            }
            if (obj != null)
            {
                break;
            }
            i++;
        } while (i < b.length);
        if (obj == null)
        {
            throw new IllegalArgumentException("No config chosen");
        } else
        {
            return ((EGLConfig) (obj));
        }
    }
}
