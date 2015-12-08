// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

public final class ohr
    implements oht
{

    private int a[];
    private int b[];
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private ohq i;

    public ohr(ohq ohq1, int j, int k, int l, int i1, int j1, int k1)
    {
        i = ohq1;
        super();
        ohq1 = new int[13];
        ohq1[0] = 12324;
        ohq1[1] = 8;
        ohq1[2] = 12323;
        ohq1[3] = 8;
        ohq1[4] = 12322;
        ohq1[5] = 8;
        ohq1[6] = 12321;
        ohq1[7] = 0;
        ohq1[8] = 12325;
        ohq1[9] = j1;
        ohq1[10] = 12326;
        ohq1[11] = 0;
        ohq1[12] = 12344;
        if (ohq.a(i) == 2 || ohq.a(i) == 3)
        {
            int ai[] = new int[15];
            System.arraycopy(ohq1, 0, ai, 0, 12);
            ai[12] = 12352;
            if (ohq.a(i) == 2)
            {
                ai[13] = 4;
            } else
            {
                ai[13] = 64;
            }
            ai[14] = 12344;
            ohq1 = ai;
        }
        a = ohq1;
        b = new int[1];
        c = 8;
        d = 8;
        e = 8;
        f = 0;
        g = j1;
        h = 0;
    }

    private int a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, int j, int k)
    {
        k = 0;
        if (egl10.eglGetConfigAttrib(egldisplay, eglconfig, j, b))
        {
            k = b[0];
        }
        return k;
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig aeglconfig[])
    {
        int k = aeglconfig.length;
        for (int j = 0; j < k; j++)
        {
            EGLConfig eglconfig = aeglconfig[j];
            int l = a(egl10, egldisplay, eglconfig, 12325, 0);
            int i1 = a(egl10, egldisplay, eglconfig, 12326, 0);
            if (l < g || i1 < h)
            {
                continue;
            }
            l = a(egl10, egldisplay, eglconfig, 12324, 0);
            i1 = a(egl10, egldisplay, eglconfig, 12323, 0);
            int j1 = a(egl10, egldisplay, eglconfig, 12322, 0);
            int k1 = a(egl10, egldisplay, eglconfig, 12321, 0);
            if (l == c && i1 == d && j1 == e && k1 == f)
            {
                return eglconfig;
            }
        }

        return null;
    }

    public final EGLConfig a(EGL10 egl10, EGLDisplay egldisplay)
    {
        int ai[] = new int[1];
        if (!egl10.eglChooseConfig(egldisplay, a, null, 0, ai))
        {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int j = ai[0];
        if (j <= 0)
        {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig aeglconfig[] = new EGLConfig[j];
        if (!egl10.eglChooseConfig(egldisplay, a, aeglconfig, j, ai))
        {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        egl10 = a(egl10, egldisplay, aeglconfig);
        if (egl10 == null)
        {
            throw new IllegalArgumentException("No config chosen");
        } else
        {
            return egl10;
        }
    }
}
