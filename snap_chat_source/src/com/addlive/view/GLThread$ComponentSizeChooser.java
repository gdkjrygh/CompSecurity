// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.view;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

// Referenced classes of package com.addlive.view:
//            GLThread

class mStencilSize extends mStencilSize
{

    protected int mAlphaSize;
    protected int mBlueSize;
    protected int mDepthSize;
    protected int mGreenSize;
    protected int mRedSize;
    protected int mStencilSize;
    private int mValue[];
    final GLThread this$0;

    private int findConfigAttrib(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, int i, int j)
    {
        if (egl10.eglGetConfigAttrib(egldisplay, eglconfig, i, mValue))
        {
            j = mValue[0];
        }
        return j;
    }

    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay egldisplay, EGLConfig aeglconfig[])
    {
        int j = aeglconfig.length;
        for (int i = 0; i < j; i++)
        {
            EGLConfig eglconfig = aeglconfig[i];
            int k = findConfigAttrib(egl10, egldisplay, eglconfig, 12325, 0);
            int l = findConfigAttrib(egl10, egldisplay, eglconfig, 12326, 0);
            if (k < mDepthSize || l < mStencilSize)
            {
                continue;
            }
            k = findConfigAttrib(egl10, egldisplay, eglconfig, 12324, 0);
            l = findConfigAttrib(egl10, egldisplay, eglconfig, 12323, 0);
            int i1 = findConfigAttrib(egl10, egldisplay, eglconfig, 12322, 0);
            int j1 = findConfigAttrib(egl10, egldisplay, eglconfig, 12321, 0);
            if (k == mRedSize && l == mGreenSize && i1 == mBlueSize && j1 == mAlphaSize)
            {
                return eglconfig;
            }
        }

        return null;
    }

    public (int i, int j, int k, int l, int i1, int j1)
    {
        this$0 = GLThread.this;
        super(GLThread.this, new int[] {
            12324, i, 12323, j, 12322, k, 12321, l, 12325, i1, 
            12326, j1, 12344
        });
        mValue = new int[1];
        mRedSize = i;
        mGreenSize = j;
        mBlueSize = k;
        mAlphaSize = l;
        mDepthSize = i1;
        mStencilSize = j1;
    }
}
