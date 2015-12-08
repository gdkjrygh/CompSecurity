// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import com.skype.android.video.hw.utils.Log;
import java.io.Closeable;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            GLException, EGLUtils

class Context
    implements Closeable
{

    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;

    private Context(EGLDisplay egldisplay, EGLContext eglcontext, int ai[])
        throws GLException
    {
        eglDisplay = EGL14.EGL_NO_DISPLAY;
        eglContext = EGL14.EGL_NO_CONTEXT;
        eglDisplay = egldisplay;
        eglConfig = chooseConfig(eglDisplay, ai);
        eglContext = createContext(eglDisplay, eglConfig, eglcontext);
    }

    public Context(EGLDisplay egldisplay, int ai[])
        throws GLException
    {
        this(egldisplay, EGL14.EGL_NO_CONTEXT, ai);
    }

    public Context(Context context, int ai[])
        throws GLException
    {
        this(context.getEGLDisplay(), context.getEGLContext(), ai);
    }

    private static EGLConfig chooseConfig(EGLDisplay egldisplay, int ai[])
        throws GLException
    {
        EGLConfig aeglconfig[] = new EGLConfig[1];
        int ai1[] = new int[1];
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/Context.getSimpleName()).append(": Choosing EGL config").toString());
        }
        EGL14.eglChooseConfig(egldisplay, ai, 0, aeglconfig, 0, 1, ai1, 0);
        EGLUtils.validate("Failed to choose EGL config.");
        return aeglconfig[0];
    }

    private static EGLContext createContext(EGLDisplay egldisplay, EGLConfig eglconfig, EGLContext eglcontext)
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/Context.getSimpleName()).append(": Creating EGL context").toString());
        }
        egldisplay = EGL14.eglCreateContext(egldisplay, eglconfig, eglcontext, new int[] {
            12440, 2, 12344
        }, 0);
        EGLUtils.validate("Failed to create EGL context.");
        return egldisplay;
    }

    public void close()
    {
        if (eglContext != EGL14.EGL_NO_CONTEXT)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Destroying EGL context").toString());
            }
            EGL14.eglDestroyContext(eglDisplay, eglContext);
            eglContext = EGL14.EGL_NO_CONTEXT;
        }
        eglDisplay = EGL14.EGL_NO_DISPLAY;
        eglConfig = null;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (Context)obj;
        if (eglConfig == null)
        {
            if (((Context) (obj)).eglConfig != null)
            {
                return false;
            }
        } else
        if (!eglConfig.equals(((Context) (obj)).eglConfig))
        {
            return false;
        }
        if (eglContext == null)
        {
            if (((Context) (obj)).eglContext != null)
            {
                return false;
            }
        } else
        if (!eglContext.equals(((Context) (obj)).eglContext))
        {
            return false;
        }
        if (eglDisplay != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Context) (obj)).eglDisplay == null) goto _L1; else goto _L3
_L3:
        return false;
        if (eglDisplay.equals(((Context) (obj)).eglDisplay)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public EGLConfig getEGLConfig()
    {
        if (eglConfig == null)
        {
            throw new IllegalStateException("closed");
        } else
        {
            return eglConfig;
        }
    }

    public EGLContext getEGLContext()
    {
        if (eglContext == EGL14.EGL_NO_CONTEXT)
        {
            throw new IllegalStateException("closed");
        } else
        {
            return eglContext;
        }
    }

    public EGLDisplay getEGLDisplay()
    {
        if (eglDisplay == EGL14.EGL_NO_DISPLAY)
        {
            throw new IllegalStateException("closed");
        } else
        {
            return eglDisplay;
        }
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (eglConfig != null)
        {
            i = eglConfig.hashCode();
        } else
        {
            i = 0;
        }
        if (eglContext != null)
        {
            j = eglContext.hashCode();
        } else
        {
            j = 0;
        }
        if (eglDisplay != null)
        {
            k = eglDisplay.hashCode();
        }
        return ((i + 31) * 31 + j) * 31 + k;
    }

    public boolean isCurrent()
    {
        if (eglContext == EGL14.EGL_NO_CONTEXT)
        {
            throw new IllegalStateException("closed");
        } else
        {
            return eglContext.equals(EGL14.eglGetCurrentContext());
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [display=").append(EGLUtils.idStringOf(eglDisplay)).append(", context=").append(EGLUtils.idStringOf(eglContext)).append(", config=").append(EGLUtils.idStringOf(eglConfig)).append("]").toString();
    }
}
