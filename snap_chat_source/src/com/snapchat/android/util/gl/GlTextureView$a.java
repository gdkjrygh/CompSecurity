// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.gl;

import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import com.snapchat.android.Timber;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

// Referenced classes of package com.snapchat.android.util.gl:
//            GlTextureView

final class  extends Thread
{

    static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    static final int EGL_OPENGL_ES2_BIT = 4;
    private EGL10 mEgl;
    private EGLContext mEglContext;
    private EGLDisplay mEglDisplay;
    private EGLSurface mEglSurface;
    private volatile boolean mFinished;
    private volatile boolean mRenderRequested;
    private final SurfaceTexture mSurface;
    final GlTextureView this$0;

    private static EGLContext a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, int i)
    {
        return egl10.eglCreateContext(egldisplay, eglconfig, EGL10.EGL_NO_CONTEXT, new int[] {
            12440, i, 12344
        });
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
_L1:
        boolean flag = mRenderRequested;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        wait();
          goto _L1
        Object obj;
        obj;
        Timber.a("GLTextureView", ((Throwable) (obj)));
          goto _L1
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        mRenderRequested = false;
        this;
        JVM INSTR monitorexit ;
    }

    public final void run()
    {
        mEgl = (EGL10)EGLContext.getEGL();
        mEglDisplay = mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (mEglDisplay == EGL10.EGL_NO_DISPLAY)
        {
            throw new RuntimeException((new StringBuilder("eglGetDisplay failed ")).append(GLUtils.getEGLErrorString(mEgl.eglGetError())).toString());
        }
        int ai[] = new int[2];
        if (!mEgl.eglInitialize(mEglDisplay, ai))
        {
            throw new RuntimeException((new StringBuilder("eglInitialize failed ")).append(GLUtils.getEGLErrorString(mEgl.eglGetError())).toString());
        }
        ai = new int[1];
        EGLConfig aeglconfig[] = new EGLConfig[1];
        if (!mEgl.eglChooseConfig(mEglDisplay, new int[] {
    12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 1, 
    12325, 0, 12326, 0, 12344
}, aeglconfig, 1, ai))
        {
            throw new IllegalArgumentException((new StringBuilder("eglChooseConfig failed ")).append(GLUtils.getEGLErrorString(mEgl.eglGetError())).toString());
        }
        EGLConfig eglconfig;
        if (ai[0] > 0)
        {
            eglconfig = aeglconfig[0];
        } else
        {
            eglconfig = null;
        }
        if (eglconfig == null)
        {
            throw new RuntimeException("eglConfig not initialized");
        }
        if (GlTextureView.b(GlTextureView.this))
        {
            mEglContext = a(mEgl, mEglDisplay, eglconfig, 3);
        }
        if (mEglContext == null || mEglContext == EGL10.EGL_NO_CONTEXT)
        {
            mEglContext = a(mEgl, mEglDisplay, eglconfig, 2);
        }
        mEglSurface = mEgl.eglCreateWindowSurface(mEglDisplay, eglconfig, mSurface, null);
        if (mEglSurface != null && mEglSurface != EGL10.EGL_NO_SURFACE) goto _L2; else goto _L1
_L1:
        int i = mEgl.eglGetError();
        if (i != 12299) goto _L4; else goto _L3
_L3:
        Timber.e("GLTextureView", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.", new Object[0]);
_L6:
        do
        {
            if (mFinished)
            {
                break;
            }
            mEgl.eglSwapBuffers(mEglDisplay, mEglSurface);
            i = mEgl.eglGetError();
            if (i != 12288)
            {
                Timber.d("GLTextureView", (new StringBuilder("EGL error = 0x")).append(Integer.toHexString(i)).toString(), new Object[0]);
            }
            if (!GlTextureView.a(GlTextureView.this))
            {
                a();
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L4:
        throw new RuntimeException((new StringBuilder("createWindowSurface failed ")).append(GLUtils.getEGLErrorString(i)).toString());
_L2:
        if (!mEgl.eglMakeCurrent(mEglDisplay, mEglSurface, mEglSurface, mEglContext))
        {
            throw new RuntimeException((new StringBuilder("eglMakeCurrent failed ")).append(GLUtils.getEGLErrorString(mEgl.eglGetError())).toString());
        }
        if (true) goto _L6; else goto _L5
_L5:
        mEgl.eglDestroyContext(mEglDisplay, mEglContext);
        mEgl.eglDestroySurface(mEglDisplay, mEglSurface);
        return;
    }
}
