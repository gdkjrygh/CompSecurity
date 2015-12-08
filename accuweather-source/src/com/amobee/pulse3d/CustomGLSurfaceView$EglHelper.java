// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLDebugHelper;
import android.util.Log;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;

// Referenced classes of package com.amobee.pulse3d:
//            CustomGLSurfaceView

private static class mGLSurfaceViewWeakRef
{

    EGL10 mEgl;
    EGLConfig mEglConfig;
    EGLContext mEglContext;
    EGLDisplay mEglDisplay;
    EGLSurface mEglSurface;
    private WeakReference mGLSurfaceViewWeakRef;

    private void destroySurfaceImp()
    {
        if (mEglSurface != null && mEglSurface != EGL10.EGL_NO_SURFACE)
        {
            mEgl.eglMakeCurrent(mEglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            CustomGLSurfaceView customglsurfaceview = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
            if (customglsurfaceview != null)
            {
                CustomGLSurfaceView.access$500(customglsurfaceview).destroySurface(mEgl, mEglDisplay, mEglSurface);
            }
            mEglSurface = null;
        }
    }

    public static String formatEglError(String s, int i)
    {
        return (new StringBuilder()).append(s).append(" failed with error: ").append(i).toString();
    }

    public static void logEglErrorAsWarning(String s, String s1, int i)
    {
        Log.w(s, formatEglError(s1, i));
    }

    private void throwEglException(String s)
    {
        throwEglException(s, mEgl.eglGetError());
    }

    public static void throwEglException(String s, int i)
    {
        s = formatEglError(s, i);
        Log.e("EglHelper", (new StringBuilder()).append("throwEglException tid=").append(Thread.currentThread().getId()).append(" ").append(s).toString());
    }

    GL createGL()
    {
        GL gl1 = mEglContext.getGL();
        CustomGLSurfaceView customglsurfaceview = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
        Object obj = gl1;
        if (customglsurfaceview != null)
        {
            GL gl = gl1;
            if (CustomGLSurfaceView.access$600(customglsurfaceview) != null)
            {
                gl = CustomGLSurfaceView.access$600(customglsurfaceview).wrap(gl1);
            }
            obj = gl;
            if ((CustomGLSurfaceView.access$700(customglsurfaceview) & 3) != 0)
            {
                int i = 0;
                obj = null;
                if ((CustomGLSurfaceView.access$700(customglsurfaceview) & 1) != 0)
                {
                    i = false | true;
                }
                if ((CustomGLSurfaceView.access$700(customglsurfaceview) & 2) != 0)
                {
                    obj = new <init>();
                }
                obj = GLDebugHelper.wrap(gl, i, ((java.io.Writer) (obj)));
            }
        }
        return ((GL) (obj));
    }

    public boolean createSurface()
    {
        if (mEgl == null)
        {
            throw new RuntimeException("egl not initialized");
        }
        if (mEglDisplay == null)
        {
            throw new RuntimeException("eglDisplay not initialized");
        }
        if (mEglConfig == null)
        {
            throw new RuntimeException("mEglConfig not initialized");
        }
        destroySurfaceImp();
        CustomGLSurfaceView customglsurfaceview = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
        if (customglsurfaceview != null)
        {
            mEglSurface = CustomGLSurfaceView.access$500(customglsurfaceview).createWindowSurface(mEgl, mEglDisplay, mEglConfig, customglsurfaceview.getHolder());
        } else
        {
            mEglSurface = null;
        }
        if (mEglSurface == null || mEglSurface == EGL10.EGL_NO_SURFACE)
        {
            if (mEgl.eglGetError() == 12299)
            {
                Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
            }
            return false;
        }
        if (!mEgl.eglMakeCurrent(mEglDisplay, mEglSurface, mEglSurface, mEglContext))
        {
            logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", mEgl.eglGetError());
            return false;
        } else
        {
            return true;
        }
    }

    public void destroySurface()
    {
        destroySurfaceImp();
    }

    public void finish()
    {
        if (mEglContext != null)
        {
            CustomGLSurfaceView customglsurfaceview = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
            if (customglsurfaceview != null)
            {
                CustomGLSurfaceView.access$400(customglsurfaceview).destroyContext(mEgl, mEglDisplay, mEglContext);
            }
            mEglContext = null;
        }
        if (mEglDisplay != null)
        {
            mEgl.eglTerminate(mEglDisplay);
            mEglDisplay = null;
        }
    }

    public void start()
    {
        mEgl = (EGL10)EGLContext.getEGL();
        mEglDisplay = mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (mEglDisplay == EGL10.EGL_NO_DISPLAY)
        {
            throw new RuntimeException("eglGetDisplay failed");
        }
        int ai[] = new int[2];
        if (!mEgl.eglInitialize(mEglDisplay, ai))
        {
            throw new RuntimeException("eglInitialize failed");
        }
        CustomGLSurfaceView customglsurfaceview = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
        if (customglsurfaceview == null)
        {
            mEglConfig = null;
            mEglContext = null;
        } else
        {
            mEglConfig = CustomGLSurfaceView.access$300(customglsurfaceview).chooseConfig(mEgl, mEglDisplay);
            mEglContext = CustomGLSurfaceView.access$400(customglsurfaceview).createContext(mEgl, mEglDisplay, mEglConfig);
        }
        if (mEglContext == null || mEglContext == EGL10.EGL_NO_CONTEXT)
        {
            mEglContext = null;
            throwEglException("createContext");
        }
        mEglSurface = null;
    }

    public int swap()
    {
        if (!mEgl.eglSwapBuffers(mEglDisplay, mEglSurface))
        {
            return mEgl.eglGetError();
        } else
        {
            return 12288;
        }
    }

    public hooser(WeakReference weakreference)
    {
        mGLSurfaceViewWeakRef = weakreference;
    }
}
