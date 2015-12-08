// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.util.LinkedList;
import java.util.concurrent.Callable;

public final class chv
    implements chp, ded
{

    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private EGLSurface h;
    private long i;
    private boolean j;
    private boolean k;
    private chq l;

    chv(chq chq1, int i1, int j1)
    {
        boolean flag = true;
        l = chq1;
        super();
        i = -1L;
        h = EGL14.eglCreatePbufferSurface(chq.c(chq1), chq.a(chq.c(chq1), chq.g()), new int[] {
            12375, i1, 12374, j1, 12344
        }, 0);
        if (h == EGL14.EGL_NO_SURFACE)
        {
            flag = false;
        }
        chq.a(flag, "eglCreatePbufferSurface");
        g = false;
        a = b.a(i1, "width");
        b = b.a(j1, "height");
        c = a;
        d = b;
        e = 0;
        f = 0;
        j = false;
        chq.d(chq1).add(this);
    }

    private chv(chq chq1, Object obj, boolean flag, int i1, int j1, int k1, int l1, 
            boolean flag1, boolean flag2)
    {
        boolean flag3 = true;
        l = chq1;
        super();
        i = -1L;
        android.opengl.EGLDisplay egldisplay = chq.c(chq1);
        android.opengl.EGLDisplay egldisplay1 = chq.c(chq1);
        int ai[];
        int i2;
        if (flag)
        {
            ai = chq.f();
        } else
        {
            ai = chq.g();
        }
        h = EGL14.eglCreateWindowSurface(egldisplay, chq.a(egldisplay1, ai), b.a(obj, "surface", null), chq.h(), 0);
        if (h != EGL14.EGL_NO_SURFACE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        chq.a(flag, "eglCreateWindowSurface");
        a = b.a(i1, "width");
        b = b.a(j1, "height");
        if (flag2)
        {
            i2 = j1;
        } else
        {
            i2 = i1;
        }
        if (!flag2)
        {
            i1 = j1;
        }
        c = b.a(k1, "surfaceWidth");
        d = b.a(l1, "surfaceHeight");
        g = flag2;
        if ((float)c / (float)d < (float)i2 / (float)i1)
        {
            j1 = ((flag3) ? 1 : 0);
        } else
        {
            j1 = 0;
        }
        if (j1 != 0)
        {
            e = 0;
            f = (d - (c * i1) / i2) / 2;
        } else
        {
            e = (c - (i2 * d) / i1) / 2;
            f = 0;
        }
        j = flag1;
        chq.d(chq1).add(this);
    }

    public chv(chq chq1, Object obj, boolean flag, int i1, int j1, int k1, int l1, 
            boolean flag1, boolean flag2, byte byte0)
    {
        this(chq1, obj, flag, i1, j1, k1, l1, flag1, flag2);
    }

    static void a(chv chv1)
    {
        chv1.g();
    }

    public final Object a(Callable callable)
    {
        g();
        return callable.call();
    }

    public final void a()
    {
        if (h != EGL14.EGL_NO_SURFACE)
        {
            chq.a(EGL14.eglDestroySurface(chq.c(l), h), "eglDestroySurface");
            h = EGL14.EGL_NO_SURFACE;
            chq.d(l).remove(this);
            if (this != chq.h(l))
            {
                chq.h(l).g();
                return;
            }
        }
    }

    void a(int i1)
    {
        EGLSurface eglsurface = h;
        EGLSurface eglsurface1 = EGL14.EGL_NO_SURFACE;
        if (b.e(eglsurface, eglsurface1))
        {
            c.a((new StringBuilder()).append("mSurface").append(" must not be equal to ").append(eglsurface1), null);
        }
        if (chq.e(l) != this)
        {
            chq.a(EGL14.eglMakeCurrent(chq.c(l), h, h, chq.f(l)), "eglMakeCurrent");
            chq.a(l, this);
        }
        GLES20.glGetIntegerv(36006, chq.g(l), 0);
        b.i("glGetIntegerv");
        if (chq.g(l)[0] != i1)
        {
            GLES20.glBindFramebuffer(36160, i1);
            b.i("glBindFramebuffer");
        }
    }

    public final void a(long l1)
    {
        if (j)
        {
            boolean flag;
            if (i < l1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b.a(flag, "received out of order frames");
            i = l1;
            EGLExt.eglPresentationTimeANDROID(chq.c(l), h, 1000L * l1);
        }
        b();
    }

    public final void a(cia cia)
    {
        throw new UnsupportedOperationException("Unimplemented");
    }

    public final void b()
    {
        if (!k)
        {
            chq.a(EGL14.eglSwapBuffers(chq.c(l), h), "eglSwapBuffers");
            return;
        } else
        {
            k = false;
            return;
        }
    }

    public final void b(cia cia)
    {
        throw new UnsupportedOperationException("Unimplemented");
    }

    public final void c()
    {
        k = true;
    }

    public final int d()
    {
        return a;
    }

    public final int e()
    {
        return b;
    }

    public final boolean f()
    {
        return g;
    }

    public void g()
    {
        a(0);
        if (e > 0 || f > 0)
        {
            GLES20.glViewport(0, 0, c, d);
            b.i("glViewport");
            GLES20.glClear(16384);
            b.i("glClear");
        }
        GLES20.glViewport(e, f, c - (e << 1), d - (f << 1));
        b.i("glViewport");
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            h, Integer.valueOf(c), Integer.valueOf(d), Boolean.valueOf(g), Integer.valueOf(a), Integer.valueOf(b), Boolean.valueOf(j)
        });
    }
}
