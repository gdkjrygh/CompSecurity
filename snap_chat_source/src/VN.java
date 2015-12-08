// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;

public class VN
    implements android.graphics.SurfaceTexture.OnFrameAvailableListener
{

    protected final WJ a;
    protected SurfaceTexture b;
    protected Surface c;
    protected VR d;
    private final Bitmap e;
    private EGLDisplay f;
    private EGLContext g;
    private EGLSurface h;
    private Object i;
    private boolean j;

    public VN(WJ wj, WK wk, Bitmap bitmap)
    {
        f = EGL14.EGL_NO_DISPLAY;
        g = EGL14.EGL_NO_CONTEXT;
        h = EGL14.EGL_NO_SURFACE;
        i = new Object();
        a = (WJ)dv.a(wj);
        e = bitmap;
        a(wk);
    }

    public final void a()
    {
        d.d();
        if (f != EGL14.EGL_NO_DISPLAY)
        {
            (new StringBuilder("mEGLDisplay: ")).append(f);
            EGL14.eglDestroySurface(f, h);
            EGL14.eglDestroyContext(f, g);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(f);
        }
        c.release();
        f = EGL14.EGL_NO_DISPLAY;
        g = EGL14.EGL_NO_CONTEXT;
        h = EGL14.EGL_NO_SURFACE;
        d = null;
        c = null;
        b = null;
    }

    public final void a(int k)
    {
        d.a(k);
    }

    public final void a(int k, int l)
    {
        d.a(k, l);
    }

    protected void a(WK wk)
    {
        d = new VR(a, wk);
        d.a(e);
        d.a();
        (new StringBuilder("textureID=")).append(d.f());
        b = new SurfaceTexture(d.f());
        b.setOnFrameAvailableListener(this);
        c = new Surface(b);
    }

    public final void a(WP wp)
    {
        d.b(wp.a);
    }

    public final Surface b()
    {
        return c;
    }

    public final boolean c()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
_L2:
        boolean flag = j;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        i.wait(100L);
        flag = j;
        if (flag) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return false;
        Object obj1;
        obj1;
        throw new RuntimeException(((Throwable) (obj1)));
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        j = false;
        obj;
        JVM INSTR monitorexit ;
        d.a("before updateTexImage");
        b.updateTexImage();
        return true;
    }

    public final void d()
    {
        d.e();
    }

    public void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        surfacetexture = ((SurfaceTexture) (i));
        surfacetexture;
        JVM INSTR monitorenter ;
        if (j)
        {
            throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        surfacetexture;
        JVM INSTR monitorexit ;
        throw exception;
        j = true;
        i.notifyAll();
        surfacetexture;
        JVM INSTR monitorexit ;
    }
}
