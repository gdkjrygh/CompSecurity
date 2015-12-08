// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;

import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.skype.android.video.hw.format.Resolution;
import com.skype.android.video.hw.utils.Log;
import java.io.Closeable;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            AbstractRenderingTarget, GLException, EGLUtils, Context

private class eglSurface
    implements Closeable
{

    private EGLSurface eglSurface;
    private Resolution resolution;
    private Surface surface;
    final AbstractRenderingTarget this$0;

    public void bind()
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Binding EGL surface ").append(Integer.toHexString(System.identityHashCode(eglSurface))).toString());
        }
        EGL14.eglMakeCurrent(context.getEGLDisplay(), eglSurface, eglSurface, context.getEGLContext());
        EGLUtils.validate("Failed to bind the surface.");
    }

    public void close()
    {
        if (eglSurface != null)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Destroying EGL surface ").append(EGLUtils.idStringOf(eglSurface)).toString());
            }
            if (!EGL14.eglDestroySurface(context.getEGLDisplay(), eglSurface) && Log.isLoggable("SLIQ", 5))
            {
                Log.w("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Failed to destroy EGL surface ").append(EGLUtils.idStringOf(eglSurface)).append(". Error: ").append(Integer.toHexString(EGL14.eglGetError())).toString());
            }
            eglSurface = EGL14.EGL_NO_SURFACE;
        }
        surface = null;
        resolution = null;
    }

    public Resolution getResolution()
    {
        return resolution;
    }

    public Surface getSurface()
    {
        return surface;
    }

    public boolean isBound()
    {
        return eglSurface.equals(EGL14.eglGetCurrentSurface(12377));
    }

    public void setResolution(Resolution resolution1)
    {
        resolution = resolution1;
    }

    public void setTimestamp(long l)
        throws GLException
    {
        EGLExt.eglPresentationTimeANDROID(context.getEGLDisplay(), eglSurface, l);
        EGLUtils.validate("Failed to set timestamp.");
    }

    public boolean swapBuffers()
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Swapping buffers of EGL surface ").append(Integer.toHexString(System.identityHashCode(eglSurface))).toString());
        }
        boolean flag = EGL14.eglSwapBuffers(context.getEGLDisplay(), eglSurface);
        EGLUtils.validate("Failed to swap buffers.");
        return flag;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [eglSurface=").append(eglSurface).append(", surface=").append(surface).append(", resolution=").append(resolution).append("]").toString();
    }

    public void unbind()
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Unbinding EGL surface ").append(Integer.toHexString(System.identityHashCode(eglSurface))).toString());
        }
        EGL14.eglMakeCurrent(context.getEGLDisplay(), EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        EGLUtils.validate("Failed to unbind the surface.");
    }

    public (Surface surface1, Resolution resolution1)
        throws GLException
    {
        this$0 = AbstractRenderingTarget.this;
        super();
        eglSurface = EGL14.EGL_NO_SURFACE;
        if (resolution1 == null)
        {
            throw new IllegalArgumentException("resolution is null");
        }
        surface = surface1;
        resolution = resolution1;
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Creating EGL surface for ").append(surface1).toString());
        }
        eglSurface = doCreateEGLSurface(surface1, resolution1);
        EGLUtils.validate("Failed to create EGL surface.");
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": EGL surface ").append(Integer.toHexString(System.identityHashCode(eglSurface))).append(" created with ").append(surface1).toString());
        }
    }
}
