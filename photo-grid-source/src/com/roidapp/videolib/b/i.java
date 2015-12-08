// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b;

import android.opengl.GLES20;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.roidapp.videolib.gl.f;
import com.roidapp.videolib.gl.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import jp.co.cyberagent.android.a.a.a;
import jp.co.cyberagent.android.a.an;

// Referenced classes of package com.roidapp.videolib.b:
//            j, m

public final class i
    implements android.opengl.GLSurfaceView.Renderer
{

    static final float a[] = {
        -1F, -1F, 1.0F, -1F, -1F, 1.0F, 1.0F, 1.0F
    };
    private long A;
    private AtomicBoolean B;
    private long C;
    private long D;
    private Handler E;
    private long F;
    private int G;
    private boolean H;
    private boolean I;
    private boolean J;
    public final Object b = new Object();
    public boolean c;
    private m d;
    private int e;
    private final FloatBuffer f;
    private final FloatBuffer g;
    private final FloatBuffer h;
    private int i;
    private int j;
    private int k;
    private int l;
    private float m;
    private final Queue n = new LinkedList();
    private final Queue o = new LinkedList();
    private int p;
    private boolean q;
    private boolean r;
    private int s;
    private f t;
    private long u;
    private AtomicBoolean v;
    private AtomicBoolean w;
    private String x;
    private boolean y;
    private int z;

    public i(m m1)
    {
        e = -1;
        m = 1.0F;
        s = com.roidapp.videolib.b.j.a;
        c = false;
        v = new AtomicBoolean(true);
        w = new AtomicBoolean(false);
        x = getClass().getSimpleName();
        z = 1;
        A = 150L;
        B = new AtomicBoolean(false);
        C = 0L;
        D = 0L;
        E = null;
        F = 0L;
        G = 0;
        H = true;
        I = false;
        J = false;
        d = m1;
        f = ByteBuffer.allocateDirect(a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        f.put(a).position(0);
        g = ByteBuffer.allocateDirect(a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        h = ByteBuffer.allocateDirect(a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        m1 = jp.co.cyberagent.android.a.a.a.a(an.a, false, true);
        h.clear();
        h.put(m1).position(0);
        int i1 = an.a;
        q = false;
        r = false;
        p = i1;
        e();
        if (android.os.Build.VERSION.SDK_INT == 14)
        {
            A = 200L;
        }
    }

    private static float a(float f1, float f2)
    {
        if (f1 == 0.0F)
        {
            return f2;
        } else
        {
            return 1.0F - f2;
        }
    }

    private static void a(Queue queue)
    {
        queue;
        JVM INSTR monitorenter ;
        for (; !queue.isEmpty(); ((Runnable)queue.poll()).run()) { }
        break MISSING_BLOCK_LABEL_33;
        Exception exception;
        exception;
        queue;
        JVM INSTR monitorexit ;
        throw exception;
        queue;
        JVM INSTR monitorexit ;
    }

    private void e()
    {
        float f2 = i;
        float f1 = j;
        if (p == an.d || p == an.b)
        {
            f2 = j;
            f1 = i;
        }
        if (t != null)
        {
            k = (int)f2;
            l = (int)f1;
        }
        float f3 = Math.max(f2 / (float)k, f1 / (float)l);
        int i1 = Math.round((float)k * f3);
        int j1 = Math.round(f3 * (float)l);
        f2 = (float)i1 / f2;
        f1 = (float)j1 / f1;
        float af[] = a;
        float af1[] = jp.co.cyberagent.android.a.a.a.a(p, q, r);
        if (s == j.b)
        {
            f2 = (1.0F - 1.0F / f2) / 2.0F;
            f1 = (1.0F - 1.0F / f1) / 2.0F;
            float af2[] = new float[8];
            af2[0] = a(af1[0], f2);
            af2[1] = a(af1[1], f1);
            af2[2] = a(af1[2], f2);
            af2[3] = a(af1[3], f1);
            af2[4] = a(af1[4], f2);
            af2[5] = a(af1[5], f1);
            af2[6] = a(af1[6], f2);
            af2[7] = a(af1[7], f1);
            af1 = af;
            af = af2;
        } else
        if (!c)
        {
            float af3[] = {
                a[0] / f1, a[1] / f2, a[2] / f1, a[3] / f2, a[4] / f1, a[5] / f2, a[6] / f1, a[7] / f2
            };
            af = af1;
            af1 = af3;
        } else
        {
            float af4[] = af;
            af = af1;
            af1 = af4;
        }
        f.clear();
        f.put(af1).position(0);
        g.clear();
        g.put(af).position(0);
    }

    public final void a()
    {
        v.set(true);
        w.set(false);
        F = D;
        B.set(false);
    }

    public final void a(float f1)
    {
        m = f1;
        if (d != null)
        {
            d.a(f1);
        }
    }

    public final void a(int i1)
    {
        G = i1;
        H = false;
        v.set(true);
        w.set(false);
        B.set(true);
    }

    public final void a(long l1)
    {
        C = l1;
    }

    public final void a(Handler handler)
    {
        E = handler;
    }

    public final void a(boolean flag)
    {
        J = flag;
        if (d != null)
        {
            m m1 = d;
            int i1;
            if (J)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            m1.b(i1);
        }
    }

    public final void b()
    {
        F = D;
        v.set(true);
        B.set(false);
    }

    public final void b(int i1)
    {
        G = i1;
        H = false;
        v.set(true);
    }

    public final void b(long l1)
    {
        F = l1;
        H = true;
        v.set(true);
        w.set(false);
        B.set(true);
    }

    public final void c()
    {
        F = D;
        v.set(true);
        B.set(true);
    }

    public final void c(long l1)
    {
        F = l1;
        H = true;
        v.set(true);
    }

    public final int d(long l1)
    {
        if (d != null)
        {
            return d.a(l1);
        } else
        {
            return 0;
        }
    }

    public final void d()
    {
        I = true;
    }

    public final void onDrawFrame(GL10 gl10)
    {
        if (!H && d != null && (w.get() || y || v.get()))
        {
            d.a();
            F = d.a(G);
            H = true;
        }
        long l1;
        if (!B.get() && !J)
        {
            l1 = F;
            D = l1;
        } else
        if (w.getAndSet(false))
        {
            l1 = F;
            D = l1;
        } else
        if (y)
        {
            l1 = F;
            D = l1;
        } else
        {
            if (v.getAndSet(false))
            {
                if (I)
                {
                    v.set(true);
                }
                u = SystemClock.uptimeMillis() - F;
                D = F;
            }
            if (I)
            {
                I = false;
            }
            if (J)
            {
                l1 = C;
            } else
            {
                l1 = SystemClock.uptimeMillis() - u;
            }
        }
        if (!J && d != null && l1 > D + d.e())
        {
            l1 = D + d.e();
        }
        GLES20.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
        com.roidapp.videolib.gl.g.a("glClearColor");
        GLES20.glClear(16640);
        com.roidapp.videolib.gl.g.a("glClear");
        a(n);
        if (d != null)
        {
            m m1 = d;
            int i1 = e;
            FloatBuffer floatbuffer = f;
            if (J)
            {
                gl10 = h;
            } else
            {
                gl10 = g;
            }
            D = m1.a(i1, floatbuffer, gl10, l1);
        }
        if (E != null && y)
        {
            E.sendEmptyMessage(8213);
            v.set(true);
        }
        if (y)
        {
            y = false;
        }
        if (E == null) goto _L2; else goto _L1
_L1:
        if (!d.d()) goto _L4; else goto _L3
_L3:
        z = (int)(D / A + 1L);
        E.sendMessage(Message.obtain(null, 8214, z, 0));
        E.sendEmptyMessage(8212);
_L2:
        a(o);
        return;
_L4:
        if ((long)z != D / A + 1L)
        {
            z = (int)(D / A + 1L);
            E.sendMessage(Message.obtain(null, 8214, z, 0));
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void onSurfaceChanged(GL10 gl10, int i1, int j1)
    {
        i = i1;
        j = j1;
        if (t == null)
        {
            l = i1;
            k = j1;
        }
        GLES20.glViewport(0, 0, i1, j1);
        d.a(i1, j1);
        e();
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
        y = true;
        v.set(true);
        GLES20.glDisable(2929);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        d.f();
        d.b();
        d.a(m);
        e = -1;
    }

}
