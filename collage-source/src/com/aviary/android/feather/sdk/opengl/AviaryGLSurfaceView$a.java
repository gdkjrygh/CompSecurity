// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.opengl;

import android.util.Log;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.aviary.android.feather.sdk.opengl:
//            AviaryGLSurfaceView

private class <init>
    implements android.opengl.
{

    final AviaryGLSurfaceView a;
    private int b;
    private int c;

    public void onDrawFrame(GL10 gl10)
    {
        AviaryGLSurfaceView.a().a("onDrawFrame");
    }

    public void onSurfaceChanged(GL10 gl10, int i, int j)
    {
        AviaryGLSurfaceView.a().a((new StringBuilder()).append("onSurfaceChanged. ").append(i).append("x").append(j).toString());
        boolean flag;
        if (b != i || c != j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = i;
        c = j;
        AviaryGLSurfaceView.b(a, flag, i, j);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
        Log.d("GL", (new StringBuilder()).append("GL_RENDERER = ").append(gl10.glGetString(7937)).toString());
        Log.d("GL", (new StringBuilder()).append("GL_VENDOR = ").append(gl10.glGetString(7936)).toString());
        Log.d("GL", (new StringBuilder()).append("GL_VERSION = ").append(gl10.glGetString(7938)).toString());
        Log.i("GL", (new StringBuilder()).append("GL_EXTENSIONS = ").append(gl10.glGetString(7939)).toString());
        AviaryGLSurfaceView.a().a("onSurfaceCreated");
        AviaryGLSurfaceView.c(a);
    }

    private A(AviaryGLSurfaceView aviaryglsurfaceview)
    {
        a = aviaryglsurfaceview;
        super();
    }

    a(AviaryGLSurfaceView aviaryglsurfaceview, a a1)
    {
        this(aviaryglsurfaceview);
    }
}
