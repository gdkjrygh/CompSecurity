// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.encode;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.recorder.encode:
//            EglControl

public final class EglSurface
{

    final EglControl mEglControl;
    EGLSurface mEglSurface;
    int mHeight;
    int mWidth;

    EglSurface(EglControl eglcontrol, Object obj)
    {
        mEglControl = eglcontrol;
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture))
        {
            throw new RuntimeException((new StringBuilder("invalid surface: ")).append(obj).toString());
        }
        eglcontrol = EGL14.eglCreateWindowSurface(eglcontrol.mEglDisplay, eglcontrol.mEglConfig, obj, new int[] {
            12344
        }, 0);
        EglControl.checkEglError("eglCreateWindowSurface");
        if (eglcontrol == null)
        {
            throw new RuntimeException("surface was null");
        } else
        {
            mEglSurface = eglcontrol;
            mWidth = -1;
            mHeight = -1;
            return;
        }
    }

    public final void makeCurrent()
    {
        EglControl eglcontrol = mEglControl;
        EGLSurface eglsurface = mEglSurface;
        if (eglcontrol.mEglDisplay == EGL14.EGL_NO_DISPLAY)
        {
            GamesLog.d("ScreencastEglState", "NOTE: makeCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(eglcontrol.mEglDisplay, eglsurface, eglsurface, eglcontrol.mEglContext))
        {
            throw new RuntimeException("eglMakeCurrent failed");
        } else
        {
            return;
        }
    }
}
