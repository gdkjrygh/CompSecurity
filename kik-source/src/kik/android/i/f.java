// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.i;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

// Referenced classes of package kik.android.i:
//            g

final class f
    implements android.graphics.SurfaceTexture.OnFrameAvailableListener
{

    private EGL10 a;
    private EGLDisplay b;
    private EGLContext c;
    private EGLSurface d;
    private SurfaceTexture e;
    private Surface f;
    private Object g;
    private boolean h;
    private g i;

    public f()
    {
        g = new Object();
        i = new g();
        i.b();
        e = new SurfaceTexture(i.a());
        e.setOnFrameAvailableListener(this);
        f = new Surface(e);
    }

    public final void a()
    {
        if (a != null)
        {
            if (a.eglGetCurrentContext().equals(c))
            {
                a.eglMakeCurrent(b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            }
            a.eglDestroySurface(b, d);
            a.eglDestroyContext(b, c);
        }
        f.release();
        e.release();
        b = null;
        c = null;
        d = null;
        a = null;
        i = null;
        f = null;
        e = null;
    }

    public final Surface b()
    {
        return f;
    }

    public final boolean c()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
_L2:
        boolean flag = h;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        g.wait(500L);
        flag = h;
        if (flag) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return false;
        Object obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        return false;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        h = false;
        obj;
        JVM INSTR monitorexit ;
        kik.android.i.g.a("before updateTexImage");
        e.updateTexImage();
        return true;
    }

    public final void d()
    {
        i.a(e);
    }

    public final void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        surfacetexture = ((SurfaceTexture) (g));
        surfacetexture;
        JVM INSTR monitorenter ;
        if (h)
        {
            throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        surfacetexture;
        JVM INSTR monitorexit ;
        throw exception;
        h = true;
        g.notifyAll();
        surfacetexture;
        JVM INSTR monitorexit ;
    }
}
