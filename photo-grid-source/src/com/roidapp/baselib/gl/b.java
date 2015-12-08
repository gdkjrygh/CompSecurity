// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.gl;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.roidapp.baselib.gl:
//            GPUTestView

public final class b
    implements android.opengl.GLSurfaceView.Renderer
{

    final GPUTestView a;

    public b(GPUTestView gputestview)
    {
        a = gputestview;
        super();
    }

    public final void onDrawFrame(GL10 gl10)
    {
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int j)
    {
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
        GPUTestView.a(a, gl10.glGetString(7936));
        (new StringBuilder("vendor ")).append(GPUTestView.a(a));
        gl10.glGetString(7938);
        GPUTestView.b(a, gl10.glGetString(7937));
        (new StringBuilder("Model ")).append(GPUTestView.b(a));
        a.a(GPUTestView.b(a));
    }
}
