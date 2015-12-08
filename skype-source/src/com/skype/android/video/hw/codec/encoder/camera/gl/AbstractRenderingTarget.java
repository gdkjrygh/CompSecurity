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
//            GLException, Context, EGLUtils

public abstract class AbstractRenderingTarget
    implements Closeable
{
    public static interface Events
    {

        public abstract void onFrameRendered(long l);
    }

    private class TargetSurface
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

        public TargetSurface(Surface surface1, Resolution resolution1)
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


    protected Context context;
    private Events eventsListener;
    private float fitFactor;
    private boolean isEnabled;
    private boolean isHorizFlipped;
    private boolean isVertFlipped;
    private int rotationAngle;
    private float targetFrameRate;
    private TargetSurface targetSurface;

    protected AbstractRenderingTarget(Context context1, int ai[], Events events)
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Creating").toString());
        }
        eventsListener = events;
        context = new Context(context1, ai);
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Created").toString());
        }
    }

    public void bind()
        throws GLException
    {
        if (targetSurface == null)
        {
            throw new IllegalStateException("no targetSurface set");
        } else
        {
            targetSurface.bind();
            return;
        }
    }

    public void close()
    {
        if (context != null)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Closing").toString());
            }
            unsetSurface();
            context.close();
            context = null;
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Closed").toString());
            }
        }
        eventsListener = null;
    }

    protected EGLSurface doCreateEGLSurface(Surface surface, Resolution resolution)
    {
        return EGL14.eglCreateWindowSurface(context.getEGLDisplay(), context.getEGLConfig(), surface, new int[] {
            12344
        }, 0);
    }

    protected abstract void doInitialBinding()
        throws GLException;

    public float getFitFactor()
    {
        return fitFactor;
    }

    public Resolution getResolution()
    {
        if (targetSurface == null)
        {
            throw new IllegalStateException("no targetSurface set");
        } else
        {
            return targetSurface.getResolution();
        }
    }

    public int getRotationAngle()
    {
        return rotationAngle;
    }

    public Surface getSurface()
    {
        if (targetSurface == null)
        {
            throw new IllegalStateException("no targetSurface set");
        } else
        {
            return targetSurface.getSurface();
        }
    }

    public float getTargetFrameRate()
    {
        return targetFrameRate;
    }

    public boolean hasSurface()
    {
        return targetSurface != null;
    }

    public boolean isBound()
    {
        if (targetSurface == null)
        {
            throw new IllegalStateException("no targetSurface set");
        } else
        {
            return targetSurface.isBound();
        }
    }

    protected boolean isBoundAny()
    {
        return EGL14.eglGetCurrentContext() != EGL14.EGL_NO_CONTEXT && EGL14.eglGetCurrentSurface(12377) != EGL14.EGL_NO_SURFACE;
    }

    public boolean isEnabled()
    {
        return isEnabled;
    }

    public boolean isHorizFlipped()
    {
        return isHorizFlipped;
    }

    public boolean isVertFlipped()
    {
        return isVertFlipped;
    }

    void onFrameReady(long l)
    {
        if (eventsListener != null)
        {
            eventsListener.onFrameRendered(l);
        }
    }

    public void setEnabled(boolean flag)
    {
        isEnabled = flag;
    }

    public void setFitFactor(float f)
    {
        fitFactor = f;
    }

    public void setFlipped(boolean flag, boolean flag1)
    {
        isHorizFlipped = flag;
        isVertFlipped = flag1;
    }

    public void setRotationAngle(int i)
    {
        rotationAngle = i;
    }

    public void setSurface(Surface surface, Resolution resolution)
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Setting ").append(surface).append(" at ").append(resolution).toString());
        }
        unsetSurface();
        targetSurface = new TargetSurface(surface, resolution);
        doInitialBinding();
    }

    public void setTargetFrameRate(float f)
    {
        targetFrameRate = f;
    }

    public void setTimestamp(long l)
        throws GLException
    {
        if (targetSurface == null)
        {
            throw new IllegalStateException("no targetSurface set");
        } else
        {
            targetSurface.setTimestamp(l);
            return;
        }
    }

    public boolean swapBuffers()
        throws GLException
    {
        if (targetSurface == null)
        {
            throw new IllegalStateException("no targetSurface set");
        } else
        {
            return targetSurface.swapBuffers();
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [context=").append(context).append(", targetSurface=").append(targetSurface).append(", isEnabled=").append(isEnabled).append(", isHorizFlipped=").append(isHorizFlipped).append(", isVertFlipped=").append(isVertFlipped).append(", rotationAngle=").append(rotationAngle).append("]").toString();
    }

    public void unbind()
        throws GLException
    {
        if (targetSurface == null)
        {
            throw new IllegalStateException("no targetSurface set");
        } else
        {
            targetSurface.unbind();
            return;
        }
    }

    public void unsetSurface()
    {
        if (targetSurface != null)
        {
            targetSurface.close();
            targetSurface = null;
        }
    }
}
