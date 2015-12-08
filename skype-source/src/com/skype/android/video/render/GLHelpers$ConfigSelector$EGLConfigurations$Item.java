// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;

// Referenced classes of package com.skype.android.video.render:
//            GLHelpers

private class config
{

    private final EGLConfig config;
    final config this$2;

    public int getAttribute(int i)
    {
        int j = 0;
        int ai[] = new int[1];
        if (s._mth400(this._cls2.this).eglGetConfigAttrib(s._mth300(this._cls2.this), config, i, ai))
        {
            j = ai[0];
        }
        return j;
    }

    public EGLConfig getEGLConfig()
    {
        return config;
    }

    public (EGLConfig eglconfig)
    {
        this$2 = this._cls2.this;
        super();
        config = eglconfig;
    }
}
