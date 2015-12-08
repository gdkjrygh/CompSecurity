// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.opengl.GLU;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.view.SurfaceHolder;
import android.view.View;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.cg.ar;
import com.google.android.m4b.maps.cg.ay;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            w, ag, j, ab, 
//            q, c, ad, g, 
//            l, a, t, p, 
//            z, d, m, h, 
//            ae

final class ah extends Thread
    implements android.view.SurfaceHolder.Callback, ae.c
{
    static final class a
    {

        a a;
        int b;
        int c;
        int d;
        Object e;

        a()
        {
        }
    }

    static final class b
    {

        a a;
        a b;
        a c;

        final void a(int i1, int j1, int k1, Object obj)
        {
            a a1 = a;
            if (a1 != null)
            {
                a = a1.a;
                a1.a = null;
            } else
            {
                a1 = new a();
            }
            a1.b = i1;
            a1.c = j1;
            a1.d = k1;
            a1.e = obj;
            if (c == null)
            {
                c = a1;
                b = a1;
                return;
            } else
            {
                c.a = a1;
                c = a1;
                return;
            }
        }

        final boolean a()
        {
            return b == null;
        }

        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }

    static interface c
    {

        public abstract void a(q q1, com.google.android.m4b.maps.bv.g g1, int i1, int j1);

        public abstract void a(GL10 gl10, ay ay1, f f1, i i1);
    }

    static final class d
    {

        public final ad a;
        public final Bitmap b;

        public d(ad ad1, Bitmap bitmap)
        {
            a = ad1;
            b = bitmap;
        }
    }

    static final class e
    {

        public final float a;
        public final float b;
        public final boolean c = false;
        public boolean d;
        public float e[];

        e(float f1, float f2)
        {
            a = f1;
            b = f2;
        }
    }

    static final class f
    {

        public float a;
        public int b;

        public final void a(float f1)
        {
            b = b + 1;
            a = a + f1;
        }

        f()
        {
        }
    }

    static interface g
    {

        public abstract void a(int i1);

        public abstract void c();
    }

    static final class h
    {

        public final q a;

        public h(q q1)
        {
            a = q1;
        }
    }

    public static final class i
    {

        float a;
        float b;
        public final ay c;
        final long d = System.currentTimeMillis();
        final int e = 1000;
        private float f;
        private float g;

        public final float a()
        {
            return Math.min(1.0F, (float)(System.currentTimeMillis() - d) / (float)e);
        }

        public final boolean a(l l1)
        {
            float af[] = new float[2];
            ar.a(f, 0.0F, -g, af);
            float f1 = l1.a(af[0], af[1], null) * 0.9F;
            a = f;
            b = g;
            float f2 = (float)Math.sqrt(f * f + g * g);
            if (f1 > 0.0F && f2 > f1)
            {
                a = a * (f1 / f2);
                b = b * (f1 / f2);
                return true;
            } else
            {
                return false;
            }
        }

        public i(float f1, float f2, ay ay1)
        {
            f = f1;
            g = f2;
            a = f1;
            b = f2;
            c = new ay(ay1);
        }
    }

    static final class j
    {

        public final float a;
        public final float b;
        public boolean c;
        public float d[];

        j(float f1, float f2)
        {
            a = f1;
            b = f2;
        }
    }


    private static final double c = Math.tan(ar.p(45F));
    private static final Semaphore d = new Semaphore(1);
    private b A;
    private boolean B;
    private w C;
    private boolean D;
    private volatile boolean E;
    private com.google.android.m4b.maps.bv.h F;
    private String G;
    private i H;
    private h I;
    private final com.google.android.m4b.maps.bv.j J;
    private final ae K;
    ab a;
    com.google.android.m4b.maps.bv.h b;
    private Context e;
    private SurfaceHolder f;
    private boolean g;
    private EGL10 h;
    private EGLContext i;
    private EGLDisplay j;
    private EGLSurface k;
    private EGLConfig l;
    private GL10 m;
    private boolean n;
    private boolean o;
    private ay p;
    private com.google.android.m4b.maps.bv.g q;
    private q r;
    private c s;
    private ag t;
    private f u;
    private int v;
    private g w;
    private int x;
    private int y;
    private int z;

    ah(ae ae, m m1)
    {
        F = null;
        b = null;
        G = null;
        K = ae;
        x = 0;
        y = 0;
        C = new w();
        D = true;
        u = new f();
        A = new b((byte)0);
        t = new ag();
        J = new com.google.android.m4b.maps.bv.j(m1);
    }

    public static float a(float f1)
    {
        if (c(f1))
        {
            return ar.o((float)Math.atan(c / (double)f1) * 2.0F);
        } else
        {
            return 90F;
        }
    }

    private a a(a a1)
    {
        b b1 = A;
        b1;
        JVM INSTR monitorenter ;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        b b2 = A;
        a1.a = b2.a;
        a1.e = null;
        b2.a = a1;
        a a2;
        a1 = A;
        a2 = ((b) (a1)).b;
        if (a2 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        a1.b = a2.a;
        a2.a = null;
        if (((b) (a1)).b == null)
        {
            a1.c = null;
        }
        b1;
        JVM INSTR monitorexit ;
        return a2;
        a1;
        b1;
        JVM INSTR monitorexit ;
        throw a1;
    }

    private void a()
    {
        if (H != null)
        {
            return;
        }
        b b1 = A;
        b1;
        JVM INSTR monitorenter ;
_L1:
        if (!A.a())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (i != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        long l1 = 0L;
_L2:
        if (l1 == 0L)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        l1 -= System.currentTimeMillis();
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        A.wait(l1);
          goto _L1
        Exception exception;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
        l1 = a.q;
          goto _L2
        A.wait();
          goto _L1
        b1;
        JVM INSTR monitorexit ;
    }

    private final void a(int i1, int j1, int k1, Object obj)
    {
        b b1 = A;
        b1;
        JVM INSTR monitorenter ;
        b b2;
        a a1;
        if (A.a())
        {
            A.notify();
        }
        b2 = A;
        a1 = b2.c;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        if (a1.b != i1)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        a1.c = j1;
        a1.d = k1;
        a1.e = obj;
_L2:
        b1;
        JVM INSTR monitorexit ;
        return;
        b2.a(i1, j1, k1, obj);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        b1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    private void a(long l1)
    {
        if (x != 0 && y != 0 && i != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        int k1;
        int i2;
        Object obj;
        ad ad1;
        byte byte0;
        int j1;
        long l5;
        boolean flag1;
        boolean flag3;
        if (n)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        j1 = 0;
_L26:
        if (j1 >= byte0) goto _L1; else goto _L3
_L3:
        obj4 = m;
        if (obj4 == null) goto _L5; else goto _L4
_L4:
        if (!o || r == null) goto _L7; else goto _L6
_L6:
        r.r;
        JVM INSTR tableswitch 1 1: default 92
    //                   1 691;
           goto _L8 _L9
_L8:
        s = new com.google.android.m4b.maps.bv.c(K, this);
_L7:
        if (r == null || I == null) goto _L11; else goto _L10
_L10:
        if (H == null) goto _L13; else goto _L12
_L12:
        obj = H;
        l5 = ((i) (obj)).d;
        if ((long)((i) (obj)).e + l5 < System.currentTimeMillis())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L13; else goto _L14
_L14:
        k1 = 1;
_L27:
        i2 = 0;
        flag3 = false;
        flag1 = flag3;
        i1 = i2;
        if (I == null) goto _L16; else goto _L15
_L15:
        flag1 = flag3;
        i1 = i2;
        if (I.a == null) goto _L16; else goto _L17
_L17:
        if (I.a.p) goto _L19; else goto _L18
_L18:
        obj = I.a.s.iterator();
_L22:
        if (!((Iterator) (obj)).hasNext()) goto _L19; else goto _L20
_L20:
        ad1 = (ad)((Iterator) (obj)).next();
        if (q.b(ad1) != null) goto _L22; else goto _L21
_L21:
        i1 = 0;
_L53:
        flag1 = I.a.b;
_L16:
        if (k1 != 0 && (i1 != 0 || flag1 || I == null || I.a == null))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L11; else goto _L23
_L23:
        if (r.z != null)
        {
            r.z.b();
        }
        p = H.c;
        H = null;
        a(I);
        I = null;
        i1 = 1;
_L52:
        k1 = x;
        i2 = y;
        if ((n || o) && r != null)
        {
            s.a(r, q, k1, i2);
            obj = t;
            ((ag) (obj)).b[0] = 0;
            ((ag) (obj)).b[1] = 0;
            ((ag) (obj)).b[2] = k1;
            ((ag) (obj)).b[3] = i2;
            obj = a;
            obj.a = r;
            boolean flag2;
            if (((ab) (obj)).a != null && ((ab) (obj)).a.o == 1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            obj.y = flag2;
            obj.b = ((ab) (obj)).a.y;
            obj.c = k1;
            obj.d = i2;
            obj.e = (float)k1 / (float)i2;
            obj.g = false;
            obj.o = -1;
        }
        if (r == null && i1 != 0) goto _L5; else goto _L24
_L24:
        ((GL10) (obj4)).glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
        ((GL10) (obj4)).glClear(16384);
        if (r != null && (r == null || !r.a()) && p != null && s != null) goto _L25; else goto _L5
_L5:
        D = false;
        n = false;
        o = false;
        ((EGL10)EGLContext.getEGL()).eglSwapBuffers(j, k);
        j1++;
          goto _L26
_L9:
        s = new com.google.android.m4b.maps.bv.a(K, this);
          goto _L7
_L13:
        k1 = 0;
          goto _L27
_L25:
        ab ab1;
        ay ay2;
        ((GL10) (obj4)).glViewport(0, 0, k1, i2);
        ay ay1;
        if (H == null)
        {
            ay1 = p;
        } else
        {
            float f1 = ar.a(H.c.a, p.a);
            float f4 = H.c.b;
            float f7 = p.b;
            float f9 = p.a;
            float f11 = H.a();
            float f12 = p.b;
            ay1 = new ay(f1 * f11 + f9, (f4 - f7) * H.a() + f12, 0.0F);
        }
        s.a(((GL10) (obj4)), ay1, u, H);
        if (w != null)
        {
            if (r.b())
            {
                i1 = 10000;
            } else
            {
                f f13 = u;
                if (f13.b == 0)
                {
                    i1 = 0;
                } else
                {
                    i1 = (int)((f13.a * 10000F) / (float)f13.b);
                }
            }
            if (i1 != v)
            {
                w.a(i1);
                v = i1;
            }
        }
        if (H != null) goto _L29; else goto _L28
_L28:
        ab1 = a;
        ay2 = p;
        if (!ab1.x && ab1.a != null) goto _L30; else goto _L29
_L29:
        if (r.p || !r.q)
        {
            w.c();
            r.p = false;
            r.q = true;
        }
          goto _L5
_L30:
        int ai[] = new int[1];
        ((GL10) (obj4)).glGetIntegerv(3379, ai, 0);
        Object obj1;
        if (ab1.a.z != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (ai[0] >= 2048 && i1 != 0 && !ab1.a.b)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        ab1.p = -1;
        if (l1 - ab1.r < 2000L)
        {
            ab1.p = com.google.android.m4b.maps.bv.q.a(ab1.b, ay2.a);
            long l6 = ab1.r + 2000L;
            if (ab1.q == 0L || ab1.q > l6)
            {
                ab1.q = l6;
            }
        }
        if (i1 == 0) goto _L32; else goto _L31
_L31:
        if (ab1.y) goto _L32; else goto _L33
_L33:
        i1 = 1;
_L37:
        if (ab1.g) goto _L35; else goto _L34
_L34:
        obj1 = ab1.a;
        if (obj1 != null) goto _L36; else goto _L35
_L35:
        obj1 = ab1.l;
        i1 = ab1.c;
        k1 = ab1.d;
        obj1.d = 0;
        obj1.e = i1;
        obj1.f = k1;
        if (!ab1.y && ab1.u)
        {
            ab1.a(((GL10) (obj4)), ay2);
        }
        if (ab1.v)
        {
            ab1.b(((GL10) (obj4)), ay2);
        }
        synchronized (ab1.n)
        {
            obj4 = ab1.m;
            ab1.m = ab1.l;
            ab1.l = ((ab.a) (obj4));
        }
          goto _L29
        obj4;
        obj2;
        JVM INSTR monitorexit ;
        throw obj4;
_L32:
        i1 = 0;
          goto _L37
_L36:
        if (ab1.h == null)
        {
            ab1.b();
        }
        if (!ab1.f)
        {
            ab1.h.a(((GL10) (obj4)));
            ab1.f = true;
        }
        if (i1 == 0) goto _L39; else goto _L38
_L38:
        Object obj5;
        obj5 = ab1.h;
        ((w) (obj5)).a(1, 2);
        ((w) (obj5)).l.clear();
        obj5.i = 0;
        obj5.j = 0;
        obj5.k = 0;
        if (!((w) (obj5)).c) goto _L41; else goto _L40
_L40:
        Object obj3 = android.graphics.Bitmap.Config.ARGB_8888;
_L49:
        int j4;
        obj5.d = Bitmap.createBitmap(((w) (obj5)).a, ((w) (obj5)).b, ((android.graphics.Bitmap.Config) (obj3)));
        obj5.e = new Canvas(((w) (obj5)).d);
        ((w) (obj5)).d.eraseColor(0);
        j4 = ab1.b.length;
        ab1.w = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            j4, 3
        });
        i1 = 0;
_L54:
        if (i1 >= j4) goto _L43; else goto _L42
_L42:
        obj5 = ab1.b[i1];
        if (((t) (obj5)).e == null || ((t) (obj5)).e.length() <= 0) goto _L45; else goto _L44
_L44:
        obj3 = ((t) (obj5)).e;
        obj5 = String.valueOf(ab1.i[((t) (obj5)).b]);
        obj3 = (new StringBuilder(String.valueOf(obj3).length() + 3 + String.valueOf(obj5).length())).append(((String) (obj3))).append(" (").append(((String) (obj5))).append(")").toString();
        k1 = 0;
_L50:
        if (k1 >= 3)
        {
            break MISSING_BLOCK_LABEL_2517;
        }
        int ai1[];
        w w2;
        Paint paint;
        Paint paint1;
        ai1 = ab1.w[i1];
        w2 = ab1.h;
        paint = ab1.j;
        paint1 = ab1.k;
        w2.a(2, 2);
        Object obj6;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int k4;
        int l4;
        int i5;
        if (obj3 != null && paint != null)
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        obj6 = new Rect();
        if (paint1 == null)
        {
            break MISSING_BLOCK_LABEL_1810;
        }
        int j2 = ((int)paint1.getStrokeWidth() + 1) / 2;
        obj6.top = ((Rect) (obj6)).top + j2;
        obj6.bottom = ((Rect) (obj6)).bottom + j2;
        obj6.left = ((Rect) (obj6)).left + j2;
        obj6.right = j2 + ((Rect) (obj6)).right;
        j3 = 0;
        i3 = 0;
        k2 = 0;
        if (!i2) goto _L47; else goto _L46
_L46:
        k2 = Math.min(((String) (obj3)).length(), 20);
        l2 = (int)Math.ceil(-paint.ascent());
        j3 = (int)Math.ceil(paint.descent());
        i3 = (int)Math.ceil(paint.measureText(((String) (obj3)), 0, k2));
_L51:
        j3 += l2;
        k3 = Math.min(w2.a, i3);
        l3 = ((Rect) (obj6)).top + ((Rect) (obj6)).bottom;
        i3 = ((Rect) (obj6)).left;
        int i4 = ((Rect) (obj6)).right + i3;
        k4 = Math.max(0, j3 + l3);
        i3 = Math.max(0, k3 + i4);
        l4 = (k4 - l3 - j3) / 2;
        i5 = (i3 - i4 - k3) / 2;
        k3 = w2.i;
        j3 = w2.j;
        l3 = w2.k;
        if (i3 > w2.a)
        {
            i3 = w2.a;
        }
        if (k3 + i3 > w2.a)
        {
            boolean flag = false;
            j3 += l3;
            k3 = 0;
            l3 = ((flag) ? 1 : 0);
        }
        l3 = Math.max(l3, k4);
        if (j3 + l3 > w2.b)
        {
            throw new IllegalArgumentException("Out of texture space.");
        }
          goto _L48
_L41:
        obj3 = android.graphics.Bitmap.Config.ALPHA_8;
          goto _L49
_L48:
        if (!i2)
        {
            break MISSING_BLOCK_LABEL_2193;
        }
        float f2 = ((Rect) (obj6)).left + k3 + i5;
        float f5 = j3 + l2 + ((Rect) (obj6)).top + l4;
        obj6 = new Path();
        paint.getTextPath(((String) (obj3)), 0, k2, f2, f5, ((Path) (obj6)));
        if (paint1 == null)
        {
            break MISSING_BLOCK_LABEL_2181;
        }
        w2.e.drawPath(((Path) (obj6)), paint1);
        w2.e.drawPath(((Path) (obj6)), paint);
        p p1 = new p(2, 2);
        float f3 = (float)k3 * w2.g;
        float f6 = (float)(k3 + i3) * w2.g;
        float f8 = (float)j3 * w2.h;
        float f10 = (float)(j3 + k4) * w2.h;
        p1.a(0, 0, 0.0F, 0.0F, 0.0F, f3, f10);
        p1.a(1, 0, i3, 0.0F, 0.0F, f6, f10);
        p1.a(0, 1, 0.0F, k4, 0.0F, f3, f8);
        p1.a(1, 1, i3, k4, 0.0F, f6, f8);
        w2.i = k3 + i3;
        w2.j = j3;
        w2.k = l3;
        w2.l.add(new w.a(p1, i3, k4, l2, k3, j3 + k4, i3, -k4));
        ai1[k1] = w2.l.size() - 1;
        k1++;
          goto _L50
_L45:
        try
        {
            ab1.w[i1][0] = -1;
            break MISSING_BLOCK_LABEL_2517;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            ab1.a(((GL10) (obj4)));
            ab1.b();
            ab1.x = true;
        }
          goto _L29
_L43:
        w w1 = ab1.h;
        w1.a(2, 1);
        ((GL10) (obj4)).glBindTexture(3553, w1.f);
        GLUtils.texImage2D(3553, 0, w1.d, 0);
        w1.d.recycle();
        w1.d = null;
        w1.e = null;
_L39:
        ab1.g = true;
          goto _L35
_L47:
        l2 = 0;
          goto _L51
_L11:
        i1 = 0;
          goto _L52
_L19:
        i1 = 1;
          goto _L53
        i1++;
          goto _L54
    }

    private void a(e e1)
    {
        if (p != null) goto _L2; else goto _L1
_L1:
        float af[] = null;
_L4:
        e1.e = af;
        e1;
        JVM INSTR monitorenter ;
        e1.d = true;
        e1.notify();
        e1;
        JVM INSTR monitorexit ;
        return;
_L2:
        t.a(m);
        float af1[];
        ag ag1;
        float af2[];
        if (e1.c)
        {
            af = new float[16];
            Matrix.multiplyMM(af, 0, p.a(), 0, r.c(), 0);
            Matrix.rotateM(af, 0, -r.t, 0.0F, 1.0F, 0.0F);
        } else
        {
            af = p.a();
        }
        af1 = new float[4];
        ag1 = t;
        af2 = new float[3];
        af2[0] = e1.a;
        af2[1] = (float)y - e1.b;
        af2[2] = 1.0F;
        if (af == null)
        {
            af = ag1.a.a;
        }
        GLU.gluUnProject(af2[0], af2[1], af2[2], af, 0, ag1.a.b, 0, ag1.b, 0, af1, 0);
        af = new float[2];
        ar.a(af1[0], af1[1], af1[2], af);
        if (!e1.c)
        {
            af[0] = ar.c(af[0] + 0.5F);
        }
        if (Float.isNaN(af[0]) || Float.isNaN(af[1]))
        {
            af = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        e1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(h h1)
    {
        this;
        JVM INSTR monitorenter ;
        if (H == null) goto _L2; else goto _L1
_L1:
        I = h1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (r != null && r.z != null)
        {
            r.z.b();
        }
        r = h1.a;
        o = true;
        D = true;
        if (r != null)
        {
            h1 = J;
            q q1 = r;
            ay ay1 = p;
            String s1 = q1.i;
            if (!((com.google.android.m4b.maps.bv.j) (h1)).c.equals(s1))
            {
                h1.b = q1.b;
                h1.c = s1;
                h1.d = q1.o;
                h1.a(ay1);
                h1.a(0, 0, 1);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        h1;
        throw h1;
    }

    private boolean a(EGL10 egl10)
    {
        int i1 = egl10.eglGetError();
        if (i1 != 12288)
        {
            com.google.android.m4b.maps.bv.d.a(String.format("EGL error: %d", new Object[] {
                Integer.valueOf(i1)
            }));
            m = null;
            return true;
        } else
        {
            return false;
        }
    }

    public static float b(float f1)
    {
        if (c(f1))
        {
            return 90F;
        } else
        {
            return ar.o((float)Math.atan(c * (double)f1) * 2.0F);
        }
    }

    private void b()
    {
        d();
        f.removeCallback(this);
    }

    private final void b(int i1, Object obj)
    {
        synchronized (A)
        {
            if (A.a())
            {
                A.notify();
            }
            A.a(i1, 0, 0, obj);
        }
        return;
        obj;
        b1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    private void c()
    {
        Object obj;
label0:
        {
            if (i == null && g)
            {
                d.acquire();
                h = (EGL10)EGLContext.getEGL();
                EGLDisplay egldisplay = h.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                Object aobj[] = new int[2];
                h.eglInitialize(egldisplay, ((int []) (aobj)));
                aobj = new EGLConfig[1];
                int ai[] = new int[1];
                h.eglChooseConfig(egldisplay, new int[] {
                    12325, 16, 12344
                }, ((EGLConfig []) (aobj)), 1, ai);
                EGLConfig eglconfig = aobj[0];
                obj = h.eglCreateContext(egldisplay, eglconfig, EGL10.EGL_NO_CONTEXT, null);
                j = egldisplay;
                l = eglconfig;
                i = ((EGLContext) (obj));
                if (!a(h))
                {
                    break label0;
                }
                m = null;
                d.release();
            }
            return;
        }
        m = (GL10)((EGLContext) (obj)).getGL();
        m = new com.google.android.m4b.maps.bv.m(m);
        GL10 gl10 = m;
        EGL10 egl10 = (EGL10)EGLContext.getEGL();
        obj = j;
        k = egl10.eglCreateWindowSurface(((EGLDisplay) (obj)), l, f, null);
        egl10.eglMakeCurrent(((EGLDisplay) (obj)), k, k, i);
        q.a(gl10);
        C.a(gl10);
        D = true;
        gl10.glDisable(2929);
        gl10.glDisable(3089);
        gl10.glDisable(3024);
        gl10.glDisable(2896);
        gl10.glDisable(3042);
        gl10.glHint(3152, 4354);
        gl10.glShadeModel(7424);
        gl10.glDisable(2884);
        gl10.glFrontFace(2305);
        gl10.glDepthFunc(515);
    }

    private static boolean c(float f1)
    {
        return f1 >= 1.0F;
    }

    private void d()
    {
        EGLContext eglcontext = i;
        GL10 gl10 = m;
        EGLDisplay egldisplay = j;
        EGLSurface eglsurface = k;
        if (eglcontext != null)
        {
            q.a();
            C.b(gl10);
            a.a(gl10);
            if (egldisplay != null)
            {
                h.eglMakeCurrent(egldisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                h.eglDestroyContext(egldisplay, eglcontext);
                if (eglsurface != null)
                {
                    h.eglDestroySurface(egldisplay, eglsurface);
                }
                h.eglTerminate(egldisplay);
            }
            h = null;
            i = null;
            d.release();
        }
    }

    private void e()
    {
        EGL10 egl10 = h;
        if (egl10 != null)
        {
            EGLDisplay egldisplay = j;
            EGLSurface eglsurface = k;
            egl10.eglMakeCurrent(egldisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroySurface(egldisplay, eglsurface);
            k = egl10.eglCreateWindowSurface(egldisplay, l, f, null);
            egl10.eglMakeCurrent(egldisplay, k, k, i);
            a(egl10);
        }
    }

    private void f()
    {
        if (this == Thread.currentThread())
        {
            throw new IllegalStateException("This code can only be called outside the rendering thread.");
        } else
        {
            return;
        }
    }

    public final int a(int i1, int j1)
    {
        int k1 = y;
        return a.a(i1, k1 - 1 - j1);
    }

    final void a(int i1)
    {
        a(i1, 0, 0, null);
    }

    final void a(int i1, int j1, int k1)
    {
        a(i1, j1, k1, null);
    }

    final void a(int i1, Object obj)
    {
        a(i1, 0, 0, obj);
    }

    public final void a(Context context, Resources resources, SurfaceHolder surfaceholder, g g1, View view)
    {
        e = context;
        f = surfaceholder;
        f.addCallback(this);
        q = new com.google.android.m4b.maps.bv.g();
        w = g1;
        s = null;
        f.setType(2);
        a = new ab(e, resources, t, view);
        setName("Renderer");
        setPriority(6);
        start();
        this;
        JVM INSTR monitorenter ;
_L3:
        boolean flag = B;
        if (flag) goto _L2; else goto _L1
_L1:
        try
        {
            wait();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        finally { }
        if (true) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final void a(ad ad1, Bitmap bitmap)
    {
        b(6, new d(ad1, bitmap));
    }

    public final float[] a(float f1, float f2)
    {
        f();
        e e1 = new e(f1, f2);
        e1;
        JVM INSTR monitorenter ;
        b(15, e1);
        Exception exception;
        do
        {
            try
            {
                e1.wait();
            }
            catch (InterruptedException interruptedexception) { }
        } while (!e1.d);
        return e1.e;
        exception;
        e1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void b(int i1, int j1)
    {
        a(i1, j1, 0, null);
    }

    public final float[] b(float f1, float f2)
    {
        f();
        j j1 = new j(f1, f2);
        j1;
        JVM INSTR monitorenter ;
        b(19, j1);
        Exception exception;
        do
        {
            try
            {
                j1.wait();
            }
            catch (InterruptedException interruptedexception) { }
        } while (!j1.c);
        return j1.d;
        exception;
        j1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void run()
    {
        this;
        JVM INSTR monitorenter ;
        B = true;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        obj = null;
_L53:
        if (E) goto _L2; else goto _L1
_L1:
        obj1 = a(((a) (obj)));
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        obj = obj1;
        ((a) (obj1)).b;
        JVM INSTR tableswitch 0 19: default 1425
    //                   0 201
    //                   1 217
    //                   2 233
    //                   3 373
    //                   4 392
    //                   5 423
    //                   6 919
    //                   7 23
    //                   8 977
    //                   9 988
    //                   10 1004
    //                   11 1027
    //                   12 1093
    //                   13 1126
    //                   14 23
    //                   15 1138
    //                   16 709
    //                   17 23
    //                   18 895
    //                   19 1157;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L1 _L13 _L14 _L15 _L16 _L17 _L18 _L1 _L19 _L20 _L1 _L21 _L22
_L5:
        int i1 = ((a) (obj1)).b;
        throw new IllegalArgumentException((new StringBuilder(30)).append("Unknown message id ").append(i1).toString());
        obj;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b();
            return;
        }
        finally
        {
            b();
        }
_L6:
        g = true;
        c();
        obj = obj1;
          goto _L1
_L7:
        d();
        g = false;
        obj = obj1;
          goto _L1
_L8:
        int k1;
        int l1;
        k1 = ((a) (obj1)).c;
        l1 = ((a) (obj1)).d;
        float f2;
        float f4;
        float f5;
        float f6;
        float f7;
        Object obj2;
        float af[];
        Object obj3;
        float af1[];
        float af2[];
        ag ag1;
        int j1;
        long l2;
        if (x == 0 && y == 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 != 0) goto _L24; else goto _L23
_L23:
        com.google.android.m4b.maps.bv.d.a(String.format("Window changed size: %d,%d -> %d,%d Recreating OpenGL surface", new Object[] {
            Integer.valueOf(x), Integer.valueOf(y), Integer.valueOf(k1), Integer.valueOf(l1)
        }));
        e();
        e();
_L24:
        x = k1;
        y = l1;
        n = true;
        float f1 = b((float)x / (float)y);
        J.a = f1;
        obj = obj1;
          goto _L1
_L9:
        a((h)((a) (obj1)).e);
        obj = obj1;
          goto _L1
_L10:
        j1 = ((a) (obj1)).c;
        obj = obj1;
        if (H != null) goto _L1; else goto _L25
_L25:
        z = j1;
        obj = obj1;
          goto _L1
_L11:
        obj2 = (ay)((a) (obj1)).e;
        obj = obj1;
        if (H != null) goto _L1; else goto _L26
_L26:
        p = ((ay) (obj2));
        obj2 = J;
        obj3 = p;
        if (((com.google.android.m4b.maps.bv.j) (obj2)).i) goto _L28; else goto _L27
_L27:
        ((com.google.android.m4b.maps.bv.j) (obj2)).a(((ay) (obj3)));
        obj = obj1;
          goto _L1
_L28:
        if (Math.abs(((com.google.android.m4b.maps.bv.j) (obj2)).g - ((ay) (obj3)).c) <= 0.999F) goto _L30; else goto _L29
_L29:
        ((com.google.android.m4b.maps.bv.j) (obj2)).a(0, 1, 0);
        ((com.google.android.m4b.maps.bv.j) (obj2)).a(((ay) (obj3)));
        obj = obj1;
          goto _L1
_L30:
        if (!((com.google.android.m4b.maps.bv.j) (obj2)).i) goto _L32; else goto _L31
_L31:
        if (((com.google.android.m4b.maps.bv.j) (obj2)).a >= 0.0F) goto _L34; else goto _L33
_L33:
        (new IllegalStateException("FOV not set")).printStackTrace();
          goto _L32
_L38:
        obj = obj1;
        if (j1 == 0) goto _L1; else goto _L35
_L35:
        ((com.google.android.m4b.maps.bv.j) (obj2)).a(1, 0, 0);
        ((com.google.android.m4b.maps.bv.j) (obj2)).a(((ay) (obj3)));
        obj = obj1;
          goto _L1
_L34:
        f2 = ((ay) (obj3)).a;
        f7 = ((ay) (obj3)).b();
        if (((com.google.android.m4b.maps.bv.j) (obj2)).e == f2 && ((com.google.android.m4b.maps.bv.j) (obj2)).f == f7) goto _L32; else goto _L36
_L36:
        f4 = ar.i(((com.google.android.m4b.maps.bv.j) (obj2)).f);
        f5 = ar.i(f7);
        f6 = ar.j(((com.google.android.m4b.maps.bv.j) (obj2)).f);
        f7 = ar.j(f7);
        if (ar.o((float)Math.acos(ar.j(((com.google.android.m4b.maps.bv.j) (obj2)).e - f2) * (f7 * f6) + f4 * f5)) * 2.0F <= ((com.google.android.m4b.maps.bv.j) (obj2)).a * ((com.google.android.m4b.maps.bv.j) (obj2)).h) goto _L32; else goto _L37
_L37:
        j1 = 1;
          goto _L38
_L20:
        f2 = Float.intBitsToFloat(((a) (obj1)).c);
        f4 = Float.intBitsToFloat(((a) (obj1)).d);
        obj = obj1;
        if (r.z == null) goto _L1; else goto _L39
_L39:
        obj2 = new e(f2, f4);
        a(((e) (obj2)));
        obj = new float[2];
        r.a(((e) (obj2)).e[0], ((e) (obj2)).e[1], ((float []) (obj)));
        af = new float[3];
        r.z.a();
        r.z.a(obj[0], obj[1], af);
        obj3 = r.z;
        f2 = obj[0];
        f4 = obj[1];
        ((l) (obj3)).c();
        obj = ((l) (obj3)).a(f2, f4);
        if (obj == null) goto _L41; else goto _L40
_L40:
        ((l.a) (obj)).a();
_L41:
        r.a(af[0], af[1], af[2], af);
        obj = obj1;
          goto _L1
_L21:
        H = (i)((a) (obj1)).e;
        I = null;
        obj = obj1;
          goto _L1
_L12:
        obj = (d)((a) (obj1)).e;
        af = ((d) (obj)).a;
        obj3 = ((d) (obj)).b;
        obj = obj1;
        if (q.b(af) != null) goto _L1; else goto _L42
_L42:
        q.a(af, ((Bitmap) (obj3)));
        obj = obj1;
          goto _L1
_L13:
        d();
        obj = obj1;
          goto _L1
_L14:
        c();
        n = true;
        obj = obj1;
          goto _L1
_L15:
        j1 = ((a) (obj1)).c;
        a.o = j1;
        obj = obj1;
          goto _L1
_L16:
        j1 = ((a) (obj1)).c;
        af = a;
        l2 = System.currentTimeMillis();
        if (j1 != 0) goto _L44; else goto _L43
_L43:
        af.r = l2;
        af.s = true;
        obj = obj1;
          goto _L1
_L44:
        obj = obj1;
        if (j1 != 1) goto _L1; else goto _L45
_L45:
        af.t = true;
        obj = obj1;
          goto _L1
_L17:
        synchronized (((a) (obj1)).e)
        {
            obj.notifyAll();
        }
        obj = obj1;
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L18:
        E = true;
        obj = obj1;
          goto _L1
_L19:
        a((e)((a) (obj1)).e);
        obj = obj1;
          goto _L1
_L22:
        obj3 = (j)((a) (obj1)).e;
        if (p != null) goto _L47; else goto _L46
_L46:
        obj = null;
_L52:
        obj3.d = ((float []) (obj));
        obj3;
        JVM INSTR monitorenter ;
        obj3.c = true;
        obj3.notify();
        obj3;
        JVM INSTR monitorexit ;
        obj = obj1;
          goto _L1
        obj;
        obj3;
        JVM INSTR monitorexit ;
        throw obj;
_L47:
        float f3 = ar.c(((j) (obj3)).a - 0.5F);
        af2 = new float[3];
        ar.a(f3, ((j) (obj3)).b, af2);
        t.a(m);
        af1 = new float[4];
        ag1 = t;
        af = p.a();
        obj = af;
        if (af != null) goto _L49; else goto _L48
_L48:
        obj = ag1.a.a;
_L49:
        GLU.gluProject(af2[0], af2[1], af2[2], ((float []) (obj)), 0, ag1.a.b, 0, ag1.b, 0, af1, 0);
        if (!Float.isNaN(af1[0]) && !Float.isNaN(af1[1]) && af1[2] <= 1.0F) goto _L51; else goto _L50
_L51:
        obj = new float[2];
        obj[0] = af1[0];
        obj[1] = y - (int)af1[1];
          goto _L52
_L4:
        if (i != null)
        {
            a(System.currentTimeMillis());
        }
        a();
        obj = obj1;
          goto _L53
_L2:
        b();
        return;
_L32:
        j1 = 0;
          goto _L38
_L50:
        obj = null;
          goto _L52
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
    {
        a(2, j1, k1);
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
        a(0);
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        a(1);
        try
        {
            if (E)
            {
                join();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            return;
        }
        synchronized (new Integer(0))
        {
            b(12, surfaceholder);
            surfaceholder.wait();
        }
        return;
        exception;
        surfaceholder;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
