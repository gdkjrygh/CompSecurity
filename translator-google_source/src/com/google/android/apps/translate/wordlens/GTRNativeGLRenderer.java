// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.wordlens;

import com.google.android.libraries.wordlens.WordLensSystem;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class GTRNativeGLRenderer
    implements android.opengl.GLSurfaceView.Renderer
{

    public boolean a;
    private boolean b;
    private boolean c;
    public float pixelDensity;

    public GTRNativeGLRenderer(boolean flag)
    {
        pixelDensity = 1.0F;
        a = true;
        b = false;
        c = false;
        c = flag;
    }

    public static void a()
    {
        synchronized (WordLensSystem.c())
        {
            onContextDestroyedNative();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static native void onContextDestroyedNative();

    public native void doAppTickNative();

    public void onDrawFrame(GL10 gl10)
    {
        if (!a)
        {
            synchronized (WordLensSystem.c())
            {
                if (!c && !b)
                {
                    doAppTickNative();
                }
                onDrawFrameNative(gl10);
                b = false;
            }
            return;
        } else
        {
            gl10.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            gl10.glClear(16640);
            return;
        }
        gl10;
        obj;
        JVM INSTR monitorexit ;
        throw gl10;
    }

    public native void onDrawFrameNative(GL10 gl10);

    public void onSurfaceChanged(GL10 gl10, int i, int j)
    {
        synchronized (WordLensSystem.c())
        {
            onSurfaceChangedNative(gl10, i, j);
        }
        return;
        gl10;
        obj;
        JVM INSTR monitorexit ;
        throw gl10;
    }

    public native void onSurfaceChangedNative(GL10 gl10, int i, int j);

    public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
        synchronized (WordLensSystem.c())
        {
            onSurfaceCreatedNative(gl10, eglconfig);
        }
        return;
        gl10;
        obj;
        JVM INSTR monitorexit ;
        throw gl10;
    }

    public native void onSurfaceCreatedNative(GL10 gl10, EGLConfig eglconfig);
}
