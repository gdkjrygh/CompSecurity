// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.skype.android.video.hw.format.Resolution;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            AbstractRenderingTarget, GLException, Context

public class BufferRenderingTarget extends AbstractRenderingTarget
{

    private static final int EGL_CONTEXT_ATTRIBUTES[] = {
        12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 
        12325, 0, 12326, 0, 12339, 1, 12344
    };

    public BufferRenderingTarget(Context context, AbstractRenderingTarget.Events events)
        throws GLException
    {
        super(context, EGL_CONTEXT_ATTRIBUTES, events);
    }

    protected EGLSurface doCreateEGLSurface(Surface surface, Resolution resolution)
    {
        if (surface != null)
        {
            throw new IllegalArgumentException((new StringBuilder("surfce is not supported by ")).append(getClass().getCanonicalName()).toString());
        } else
        {
            int i = resolution.getWidth();
            int j = resolution.getHeight();
            return EGL14.eglCreatePbufferSurface(context.getEGLDisplay(), context.getEGLConfig(), new int[] {
                12375, i, 12374, j, 12344
            }, 0);
        }
    }

    protected void doInitialBinding()
        throws GLException
    {
        bind();
    }

}
