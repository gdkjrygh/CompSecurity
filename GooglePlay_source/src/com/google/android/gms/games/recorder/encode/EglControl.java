// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.encode;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import com.google.android.gms.games.internal.GamesLog;

public final class EglControl
{

    EGLConfig mEglConfig;
    EGLContext mEglContext;
    EGLDisplay mEglDisplay;

    public EglControl()
    {
        mEglDisplay = EGL14.EGL_NO_DISPLAY;
        mEglContext = EGL14.EGL_NO_CONTEXT;
        mEglDisplay = EGL14.eglGetDisplay(0);
        if (mEglDisplay == EGL14.EGL_NO_DISPLAY)
        {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int ai[] = new int[2];
        if (!EGL14.eglInitialize(mEglDisplay, ai, 0, ai, 1))
        {
            mEglDisplay = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        createContext(3, false);
        if (mEglContext == EGL14.EGL_NO_CONTEXT)
        {
            createContext(2, true);
        }
        ai = new int[1];
        EGL14.eglQueryContext(mEglDisplay, mEglContext, 12440, ai, 0);
        GamesLog.d("ScreencastEglState", (new StringBuilder("EGLContext created, client version ")).append(ai[0]).toString());
    }

    static void checkEglError(String s)
    {
        int i = EGL14.eglGetError();
        if (i != 12288)
        {
            throw new RuntimeException((new StringBuilder()).append(s).append(": EGL error: 0x").append(Integer.toHexString(i)).toString());
        } else
        {
            return;
        }
    }

    public static void checkGlError(String s)
    {
        int i = GLES20.glGetError();
        if (i != 0)
        {
            s = (new StringBuilder()).append(s).append(": glError 0x").append(Integer.toHexString(i)).toString();
            GamesLog.e("ScreencastEglState", s);
            throw new RuntimeException(s);
        } else
        {
            return;
        }
    }

    private void createContext(int i, boolean flag)
    {
        byte byte0 = 4;
        if (i >= 3)
        {
            byte0 = 68;
        }
        EGLConfig eglconfig = new EGLConfig[1];
        int ai[] = new int[1];
        if (!EGL14.eglChooseConfig(mEglDisplay, new int[] {
    12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, byte0, 
    12610, 1, 12344
}, 0, eglconfig, 0, 1, ai, 0))
        {
            GamesLog.w("ScreencastEglState", (new StringBuilder("unable to find RGB8888 / ")).append(i).append(" EGLConfig").toString());
            eglconfig = null;
        } else
        {
            eglconfig = eglconfig[0];
        }
        if (eglconfig != null)
        {
            EGLContext eglcontext = EGL14.eglCreateContext(mEglDisplay, eglconfig, EGL14.EGL_NO_CONTEXT, new int[] {
                12440, i, 12344
            }, 0);
            if (flag)
            {
                checkEglError("eglCreateContext");
            }
            if (EGL14.eglGetError() == 12288)
            {
                mEglConfig = eglconfig;
                mEglContext = eglcontext;
            }
        } else
        if (flag)
        {
            throw new RuntimeException("Unable to find a suitable EGLConfig");
        }
    }

    public static int loadShader(int i, String s)
    {
        int k = GLES20.glCreateShader(i);
        checkGlError((new StringBuilder("glCreateShader type=")).append(i).toString());
        GLES20.glShaderSource(k, s);
        GLES20.glCompileShader(k);
        s = new int[1];
        GLES20.glGetShaderiv(k, 35713, s, 0);
        int j = k;
        if (s[0] == 0)
        {
            GamesLog.e("ScreencastEglState", (new StringBuilder("Could not compile shader ")).append(i).append(":").toString());
            GamesLog.e("ScreencastEglState", (new StringBuilder(" ")).append(GLES20.glGetShaderInfoLog(k)).toString());
            GLES20.glDeleteShader(k);
            j = 0;
        }
        return j;
    }

    protected final void finalize()
        throws Throwable
    {
        if (mEglDisplay != EGL14.EGL_NO_DISPLAY)
        {
            GamesLog.w("ScreencastEglState", "WARNING: EglControl was not explicitly released -- state may be leaked");
            release();
        }
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public final void release()
    {
        if (mEglDisplay != EGL14.EGL_NO_DISPLAY)
        {
            EGL14.eglMakeCurrent(mEglDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(mEglDisplay, mEglContext);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(mEglDisplay);
        }
        mEglDisplay = EGL14.EGL_NO_DISPLAY;
        mEglContext = EGL14.EGL_NO_CONTEXT;
        mEglConfig = null;
    }
}
