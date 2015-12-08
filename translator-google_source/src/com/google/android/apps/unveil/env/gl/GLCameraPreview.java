// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import com.google.android.apps.unveil.UnveilSettings;
import com.google.android.apps.unveil.k;
import com.google.android.apps.unveil.nonstop.c;

// Referenced classes of package com.google.android.apps.unveil.env.gl:
//            f, b, c, a

public class GLCameraPreview extends GLSurfaceView
{

    private final f a;

    public GLCameraPreview(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (!((k)context.getApplicationContext()).i().useGLES2Overlay)
        {
            a = null;
            setRenderer(null);
            return;
        } else
        {
            setVisibility(0);
            setZOrderMediaOverlay(true);
            setEGLContextClientVersion(2);
            setEGLConfigChooser(8, 8, 8, 8, 0, 0);
            getHolder().setFormat(-3);
            a = new f(context, new b(this));
            setRenderer(a);
            setRenderMode(0);
            return;
        }
    }

    static f a(GLCameraPreview glcamerapreview)
    {
        return glcamerapreview.a;
    }

    public a getBoundingBoxLayer()
    {
        if (a != null)
        {
            return a.a();
        } else
        {
            return null;
        }
    }

    public c getFrameLoader()
    {
        return new com.google.android.apps.unveil.env.gl.c(this);
    }
}
