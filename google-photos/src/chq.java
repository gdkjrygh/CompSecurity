// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

public class chq
{

    public static final String a = chq.getSimpleName();
    private static final int k[] = {
        12344
    };
    private static final int m[] = {
        12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 
        12325, 0, 12326, 0, 12344
    };
    private static final int n[] = {
        12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 
        12325, 0, 12326, 0, 12610, 1, 12344
    };
    public final dfk b;
    public final Runnable c = new chs(this);
    public final Object d = new Object();
    public volatile ExecutorService e;
    public int f;
    public volatile Queue g;
    public chv h;
    public cid i;
    public int j;
    private final AtomicReference l = new AtomicReference();
    private final int o[] = new int[1];
    private final LinkedList p = new LinkedList();
    private final LinkedList q = new LinkedList();
    private volatile CountDownLatch r;
    private EGLDisplay s;
    private EGLContext t;
    private chv u;

    public chq(dfk dfk1)
    {
        b = (dfk)b.a(dfk1, "executorFactory", null);
        r = new CountDownLatch(0);
    }

    private static int a(int i1)
    {
        return i1 >>> 8 | i1 << 24;
    }

    static EGLConfig a(EGLDisplay egldisplay, int ai[])
    {
        return b(egldisplay, ai);
    }

    static Pair a(chq chq1, int i1)
    {
        Pair pair = (Pair)chq1.l.get();
        int j1;
        if (pair != null)
        {
            j1 = ((int[])pair.second).length;
        } else
        {
            j1 = 0;
        }
        if (pair != null && j1 >= i1)
        {
            return pair;
        }
        int ai[] = new int[i1];
        Pair pair1 = Pair.create(ByteBuffer.allocateDirect(i1 << 2), ai);
        chq1 = (Pair)chq1.l.getAndSet(pair1);
        boolean flag;
        if (chq1 == pair || chq1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "getAuxiliaryBuffers called from two different threads. Expecting only one.");
        return pair1;
    }

    static chv a(chq chq1, chv chv1)
    {
        chq1.u = chv1;
        return chv1;
    }

    static cid a(chq chq1, cid cid1)
    {
        chq1.i = cid1;
        return cid1;
    }

    static CountDownLatch a(chq chq1, CountDownLatch countdownlatch)
    {
        chq1.r = countdownlatch;
        return countdownlatch;
    }

    static void a(int i1, int j1, int k1, int l1)
    {
        GLES20.glBindTexture(j1, i1);
        ByteBuffer bytebuffer = ByteBuffer.allocateDirect(k1 * l1 << 2);
        i1 = c(k1);
        GLES20.glTexImage2D(j1, 0, 6408, k1, l1, 0, 6408, 5121, bytebuffer);
        b.i("glTexImage2D");
        c.a(b(i1), "couldn't reset row byte alignment");
    }

    static void a(int i1, int j1, Bitmap bitmap)
    {
        GLES20.glBindTexture(j1, i1);
        i1 = c(bitmap.getRowBytes());
        GLUtils.texImage2D(j1, 0, bitmap, 0);
        b.i("glTexImage2D");
        c.a(b(i1), "couldn't reset row byte alignment");
    }

    static void a(chq chq1)
    {
        chq1.e();
    }

    static void a(chq chq1, boolean flag)
    {
        chq1.a(false);
    }

    static void a(boolean flag, String s1)
    {
        b(flag, s1);
    }

    static void a(int ai[], int i1, int j1)
    {
        for (int k1 = 0; k1 < (j1 + 1) / 2; k1++)
        {
            for (int l1 = 0; l1 < i1; l1++)
            {
                int i2 = k1 * i1 + l1;
                int j2 = (j1 - k1 - 1) * i1 + l1;
                int k2 = ai[i2];
                int l2 = ai[j2];
                ai[j2] = a(k2);
                ai[i2] = a(l2);
            }

        }

    }

    static int b(chq chq1, int i1)
    {
        chq1.j = i1;
        return i1;
    }

    private static EGLConfig b(EGLDisplay egldisplay, int ai[])
    {
        int ai1[] = new int[1];
        EGLConfig aeglconfig[] = new EGLConfig[1];
        b(EGL14.eglChooseConfig(egldisplay, ai, 0, aeglconfig, 0, 1, ai1, 0), "eglChooseConfig");
        return aeglconfig[0];
    }

    static CountDownLatch b(chq chq1)
    {
        return chq1.r;
    }

    private static void b(boolean flag, String s1)
    {
        if (!flag)
        {
            String s2 = String.valueOf(Integer.toHexString(EGL14.eglGetError()));
            throw c.a((new StringBuilder(String.valueOf(s1).length() + 27 + String.valueOf(s2).length())).append("EGL Error: ").append(s1).append(" failed. Reason:").append(s2).toString());
        } else
        {
            return;
        }
    }

    private static boolean b(int i1)
    {
        GLES20.glPixelStorei(3317, i1);
        return l() == i1;
    }

    private static int c(int i1)
    {
        boolean flag = true;
        int j1 = l();
        int k1;
        boolean flag1;
        if (j1 == 1 || j1 == 2 || j1 == 4 || j1 == 8)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        c.a(flag1, "unexpected row byte alignment");
        k1 = i1 % j1;
        if (k1 > 0)
        {
            for (i1 = ((flag) ? 1 : 0); (k1 & i1) == 0; i1 <<= 1) { }
            c.a(b(i1), "couldn't set row byte alignment");
        }
        return j1;
    }

    static EGLDisplay c(chq chq1)
    {
        return chq1.s;
    }

    static LinkedList d(chq chq1)
    {
        return chq1.p;
    }

    static chv e(chq chq1)
    {
        return chq1.u;
    }

    static EGLContext f(chq chq1)
    {
        return chq1.t;
    }

    static int[] f()
    {
        return n;
    }

    static int[] g()
    {
        return m;
    }

    static int[] g(chq chq1)
    {
        return chq1.o;
    }

    static chv h(chq chq1)
    {
        return chq1.h;
    }

    static int[] h()
    {
        return k;
    }

    static int i()
    {
        int ai[] = new int[1];
        GLES20.glGenTextures(1, ai, 0);
        b.i("glGenTextures");
        c.b(ai[0], "textures[0]", 0, "could not create texture");
        return ai[0];
    }

    static LinkedList i(chq chq1)
    {
        return chq1.q;
    }

    static int j()
    {
        int ai[] = new int[1];
        GLES20.glGenFramebuffers(1, ai, 0);
        b.i("glGenFramebuffers");
        c.b(ai[0], "fbos[0]", 0, "could not create frame buffer");
        return ai[0];
    }

    static Object j(chq chq1)
    {
        return chq1.d;
    }

    static String k()
    {
        return a;
    }

    static ExecutorService k(chq chq1)
    {
        return chq1.e;
    }

    private static int l()
    {
        int ai[] = new int[1];
        GLES20.glGetIntegerv(3317, ai, 0);
        b.i("glGetIntegerv");
        return ai[0];
    }

    public final Bitmap a(chy chy1, Bitmap bitmap)
    {
        return (Bitmap)chy1.a(new chr(this, chy1, bitmap));
    }

    public final chp a(int i1, int j1)
    {
        return new chv(this, i1, j1);
    }

    public final cin a(Bitmap bitmap, int i1)
    {
        return new chw(this, bitmap, i1);
    }

    public final Object a(Callable callable)
    {
        if (e == null)
        {
            throw new chx();
        }
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
        callable = new FutureTask(callable);
        Object obj;
        g.add(callable);
        e.execute(callable);
        obj = callable.get();
        g.remove(callable);
        return obj;
        Object obj1;
        obj1;
        callable.cancel(true);
        throw obj1;
        obj1;
        g.remove(callable);
        throw obj1;
        obj1;
        Log.w(a, "render context task was cancelled");
        g.remove(callable);
        return null;
    }

    public final void a()
    {
        l.set(null);
    }

    public final void a(Runnable runnable)
    {
        a(((Callable) (new cht(this, runnable))));
    }

    public void a(boolean flag)
    {
        boolean flag2 = false;
        c.b(s, "mDisplay", null);
        c.b(t, "mContext", null);
        Object obj = EGL14.eglGetDisplay(0);
        EGLDisplay egldisplay;
        EGLDisplay egldisplay1;
        boolean flag1;
        if (obj != EGL14.EGL_NO_DISPLAY)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b(flag1, "eglGetDisplay");
        b(EGL14.eglInitialize(((EGLDisplay) (obj)), new int[1], 0, new int[1], 0), "eglInitialize");
        s = ((EGLDisplay) (obj));
        egldisplay = s;
        egldisplay1 = s;
        if (flag)
        {
            obj = n;
        } else
        {
            obj = m;
        }
        obj = EGL14.eglCreateContext(egldisplay, b(egldisplay1, ((int []) (obj))), EGL14.EGL_NO_CONTEXT, new int[] {
            12440, 2, 12344
        }, 0);
        flag1 = flag2;
        if (obj != EGL14.EGL_NO_CONTEXT)
        {
            flag1 = true;
        }
        b(flag1, "eglCreateContext");
        t = ((EGLContext) (obj));
        if (!flag)
        {
            h = new chv(this, 1, 1);
            h.g();
            GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
        }
    }

    public final cin b(int i1, int j1)
    {
        return new chw(this, i1, j1, 1);
    }

    public final void b()
    {
        e();
        a(false);
    }

    public final void b(Runnable runnable)
    {
        if (e == null)
        {
            throw new chx();
        } else
        {
            e.execute(runnable);
            return;
        }
    }

    public final cin c()
    {
        return new chw(this, false);
    }

    public final cin d()
    {
        return new chw(this, true);
    }

    public void e()
    {
        chw chw1;
        for (; !q.isEmpty(); dee.a(chw1))
        {
            chw1 = (chw)q.remove();
            String s1 = a;
            String s3 = String.valueOf(chw1);
            Log.w(s1, (new StringBuilder(String.valueOf(s3).length() + 26)).append("context released texture: ").append(s3).toString());
        }

        p.remove(h);
        chv chv1;
        for (; !p.isEmpty(); dee.a(chv1))
        {
            chv1 = (chv)p.remove();
            String s2 = a;
            String s4 = String.valueOf(chv1);
            Log.w(s2, (new StringBuilder(String.valueOf(s4).length() + 23)).append("context released sink: ").append(s4).toString());
        }

        dee.a(h);
        h = null;
        if (i != null)
        {
            i.a();
        }
        u = null;
        if (s != EGL14.EGL_NO_DISPLAY)
        {
            b(EGL14.eglMakeCurrent(s, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT), "eglMakeCurrent");
        }
        b(EGL14.eglDestroyContext(s, t), "eglDestroyContext");
        b(EGL14.eglTerminate(s), "eglTerminate");
        s = null;
        t = null;
    }

}
