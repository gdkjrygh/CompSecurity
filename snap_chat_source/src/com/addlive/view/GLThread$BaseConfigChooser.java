// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.view;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

// Referenced classes of package com.addlive.view:
//            GLThread

abstract class filterConfigSpec
    implements filterConfigSpec
{

    protected int mConfigSpec[];
    final GLThread this$0;

    private int[] filterConfigSpec(int ai[])
    {
        int i = ai.length;
        int ai1[] = new int[i + 2];
        System.arraycopy(ai, 0, ai1, 0, i - 1);
        ai1[i - 1] = 12352;
        ai1[i] = 4;
        ai1[i + 1] = 12344;
        return ai1;
    }

    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay egldisplay)
    {
        int ai[] = new int[1];
        if (!egl10.eglChooseConfig(egldisplay, mConfigSpec, null, 0, ai))
        {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i = ai[0];
        if (i <= 0)
        {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig aeglconfig[] = new EGLConfig[i];
        if (!egl10.eglChooseConfig(egldisplay, mConfigSpec, aeglconfig, i, ai))
        {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        egl10 = chooseConfig(egl10, egldisplay, aeglconfig);
        if (egl10 == null)
        {
            throw new IllegalArgumentException("No config chosen");
        } else
        {
            return egl10;
        }
    }

    abstract EGLConfig chooseConfig(EGL10 egl10, EGLDisplay egldisplay, EGLConfig aeglconfig[]);

    public (int ai[])
    {
        this$0 = GLThread.this;
        super();
        mConfigSpec = filterConfigSpec(ai);
    }
}
