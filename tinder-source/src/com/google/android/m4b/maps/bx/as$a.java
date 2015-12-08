// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            as

abstract class a
    implements a
{

    private int a[];
    private as b;

    public final EGLConfig a(EGL10 egl10, EGLDisplay egldisplay)
    {
        int ai[] = new int[1];
        if (!egl10.eglChooseConfig(egldisplay, a, null, 0, ai))
        {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i = ai[0];
        if (i <= 0)
        {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig aeglconfig[] = new EGLConfig[i];
        if (!egl10.eglChooseConfig(egldisplay, a, aeglconfig, i, ai))
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

    abstract EGLConfig a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig aeglconfig[]);

    public nfig(as as1, int ai[])
    {
        b = as1;
        super();
        as.B();
        a = ai;
    }
}
