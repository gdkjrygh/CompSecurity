// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.microsoft.media:
//            MMVRSurfaceView

class m_surfaceView
    implements android.opengl.erer
{

    private MMVRSurfaceView m_surfaceView;
    final MMVRSurfaceView this$0;

    public void onDrawFrame(GL10 gl10)
    {
        MMVRSurfaceView.access$100(m_surfaceView);
    }

    public void onSurfaceChanged(GL10 gl10, int i, int j)
    {
        MMVRSurfaceView.access$200(m_surfaceView, i, j);
        m_surfaceView.requestRender();
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
    }

    public (MMVRSurfaceView mmvrsurfaceview1)
    {
        this$0 = MMVRSurfaceView.this;
        super();
        m_surfaceView = null;
        m_surfaceView = mmvrsurfaceview1;
    }
}
