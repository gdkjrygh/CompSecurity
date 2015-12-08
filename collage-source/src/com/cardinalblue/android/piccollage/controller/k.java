// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.cardinalblue.android.piccollage.a.b;

public class k extends android.view.GestureDetector.SimpleOnGestureListener
{
    public static interface a
    {

        public abstract void a(float f1, float f2);

        public abstract void a(Object obj);
    }

    public static interface b
    {

        public abstract void a(Object obj, d d1);

        public abstract void a(Object obj, e e1);

        public abstract void a(Object obj, e e1, d d1);

        public abstract Object b(float f1, float f2);

        public abstract Object b(d d1);
    }

    public static interface c
    {

        public abstract void a(Object obj, MotionEvent motionevent);

        public abstract void b(Object obj, MotionEvent motionevent);

        public abstract void c(Object obj, MotionEvent motionevent);

        public abstract void d(Object obj, MotionEvent motionevent);

        public abstract void e(Object obj, MotionEvent motionevent);

        public abstract void f(Object obj, MotionEvent motionevent);

        public abstract void g(Object obj, MotionEvent motionevent);

        public abstract void h(Object obj, MotionEvent motionevent);
    }

    public static class d
    {

        private int a;
        private float b[];
        private float c[];
        private float d[];
        private int e[];
        private float f;
        private float g;
        private float h;
        private float i;
        private float j;
        private float k;
        private float l;
        private float m;
        private boolean n;
        private boolean o;
        private boolean p;
        private boolean q;
        private boolean r;
        private int s;
        private long t;

        private int a(int i1)
        {
            int j1 = 32768;
            int k1 = i1;
            i1 = 15;
            int j2 = 0;
            do
            {
                int k2 = (j2 << 1) + j1 << i1;
                int i2 = j2;
                int l1 = k1;
                if (k1 >= k2)
                {
                    i2 = j2 + j1;
                    l1 = k1 - k2;
                }
                j1 >>= 1;
                if (j1 <= 0)
                {
                    return i2;
                }
                i1--;
                j2 = i2;
                k1 = l1;
            } while (true);
        }

        private void a(int i1, float af[], float af1[], float af2[], int ai[], int j1, boolean flag, 
                long l1)
        {
            t = l1;
            s = j1;
            a = i1;
            for (j1 = 0; j1 < i1; j1++)
            {
                b[j1] = af[j1];
                c[j1] = af1[j1];
                d[j1] = af2[j1];
                e[j1] = ai[j1];
            }

            n = flag;
            if (i1 >= 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o = flag;
            if (o)
            {
                f = (af[0] + af[1]) * 0.5F;
                g = (af1[0] + af1[1]) * 0.5F;
                h = (af2[0] + af2[1]) * 0.5F;
                i = Math.abs(af[1] - af[0]);
                j = Math.abs(af1[1] - af1[0]);
            } else
            {
                f = af[0];
                g = af1[0];
                h = af2[0];
                j = 0.0F;
                i = 0.0F;
            }
            r = false;
            q = false;
            p = false;
        }

        static void a(d d1, int i1, float af[], float af1[], float af2[], int ai[], int j1, boolean flag, 
                long l1)
        {
            d1.a(i1, af, af1, af2, ai, j1, flag, l1);
        }

        static long b(d d1)
        {
            return d1.t;
        }

        public void a(d d1)
        {
            a = d1.a;
            for (int i1 = 0; i1 < a; i1++)
            {
                b[i1] = d1.b[i1];
                c[i1] = d1.c[i1];
                d[i1] = d1.d[i1];
                e[i1] = d1.e[i1];
            }

            f = d1.f;
            g = d1.g;
            h = d1.h;
            i = d1.i;
            j = d1.j;
            k = d1.k;
            l = d1.l;
            m = d1.m;
            n = d1.n;
            s = d1.s;
            o = d1.o;
            q = d1.q;
            p = d1.p;
            r = d1.r;
            t = d1.t;
        }

        public boolean a()
        {
            return o;
        }

        public float b()
        {
            if (o)
            {
                return i;
            } else
            {
                return 0.0F;
            }
        }

        public float c()
        {
            if (o)
            {
                return j;
            } else
            {
                return 0.0F;
            }
        }

        public float d()
        {
            if (!p)
            {
                float f1;
                if (o)
                {
                    f1 = i * i + j * j;
                } else
                {
                    f1 = 0.0F;
                }
                l = f1;
                p = true;
            }
            return l;
        }

        public float e()
        {
            float f1 = 0.0F;
            if (q) goto _L2; else goto _L1
_L1:
            if (o) goto _L4; else goto _L3
_L3:
            k = 0.0F;
_L6:
            q = true;
_L2:
            return k;
_L4:
            float f2 = d();
            if (f2 != 0.0F)
            {
                f1 = (float)a((int)(256F * f2)) / 16F;
            }
            k = f1;
            if (k < i)
            {
                k = i;
            }
            if (k < j)
            {
                k = j;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        public float f()
        {
            if (!r)
            {
                if (!o)
                {
                    m = 0.0F;
                } else
                {
                    m = (float)Math.atan2(c[1] - c[0], b[1] - b[0]);
                }
                r = true;
            }
            return m;
        }

        public float g()
        {
            return f;
        }

        public float h()
        {
            return g;
        }

        public boolean i()
        {
            return n;
        }

        public long j()
        {
            return t;
        }

        public d()
        {
            b = new float[20];
            c = new float[20];
            d = new float[20];
            e = new int[20];
        }
    }

    public static class e
    {

        private float a;
        private float b;
        private float c;
        private float d;
        private float e;
        private float f;
        private boolean g;
        private boolean h;
        private boolean i;

        static boolean a(e e1)
        {
            return e1.g;
        }

        static boolean b(e e1)
        {
            return e1.h;
        }

        static boolean c(e e1)
        {
            return e1.i;
        }

        static float d(e e1)
        {
            return e1.c;
        }

        static float e(e e1)
        {
            return e1.a;
        }

        static float f(e e1)
        {
            return e1.b;
        }

        static float g(e e1)
        {
            return e1.d;
        }

        static float h(e e1)
        {
            return e1.e;
        }

        static float i(e e1)
        {
            return e1.f;
        }

        public float a()
        {
            return a;
        }

        public void a(float f1, float f2, float f3, float f4, float f5, float f6)
        {
            float f7 = 1.0F;
            a = f1;
            b = f2;
            f1 = f3;
            if (f3 == 0.0F)
            {
                f1 = 1.0F;
            }
            c = f1;
            f1 = f4;
            if (f4 == 0.0F)
            {
                f1 = 1.0F;
            }
            d = f1;
            if (f5 == 0.0F)
            {
                f1 = f7;
            } else
            {
                f1 = f5;
            }
            e = f1;
            f = f6;
        }

        public void a(float f1, float f2, boolean flag, float f3, boolean flag1, float f4, float f5, 
                boolean flag2, float f6)
        {
            float f7 = 1.0F;
            a = f1;
            b = f2;
            g = flag;
            f1 = f3;
            if (f3 == 0.0F)
            {
                f1 = 1.0F;
            }
            c = f1;
            h = flag1;
            f1 = f4;
            if (f4 == 0.0F)
            {
                f1 = 1.0F;
            }
            d = f1;
            if (f5 == 0.0F)
            {
                f1 = f7;
            } else
            {
                f1 = f5;
            }
            e = f1;
            i = flag2;
            f = f6;
        }

        public float b()
        {
            return b;
        }

        public float c()
        {
            if (!g)
            {
                return 1.0F;
            } else
            {
                return c;
            }
        }

        public float d()
        {
            if (!i)
            {
                return 0.0F;
            } else
            {
                return f;
            }
        }

        public e()
        {
        }
    }


    private static final float I[] = new float[20];
    private static final float J[] = new float[20];
    private static final float K[] = new float[20];
    private static final int L[] = new int[20];
    private static int P = 0;
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private int G;
    private boolean H;
    private int M;
    private int N;
    private VelocityTracker O;
    b a;
    private boolean b;
    private Object c;
    private long d;
    private boolean e;
    private float f;
    private float g;
    private final GestureDetector h;
    private d i;
    private d j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private c q;
    private a r;
    private float s;
    private float t;
    private long u;
    private boolean v;
    private Object w;
    private e x;
    private long y;
    private long z;

    public k(b b1, ViewConfiguration viewconfiguration)
    {
        this(b1, true, viewconfiguration);
    }

    public k(b b1, boolean flag, ViewConfiguration viewconfiguration)
    {
        b = true;
        e = false;
        h = new GestureDetector(this);
        w = null;
        x = new e();
        G = 0;
        H = true;
        O = null;
        i = new d();
        j = new d();
        v = flag;
        a = b1;
        M = viewconfiguration.getScaledMinimumFlingVelocity();
        N = Math.max(viewconfiguration.getScaledMaximumFlingVelocity(), M);
    }

    private void a(float f1, float f2)
    {
        Object obj = w;
        if (!H) goto _L2; else goto _L1
_L1:
        G;
        JVM INSTR tableswitch 0 2: default 44
    //                   0 45
    //                   1 186
    //                   2 305;
           goto _L2 _L3 _L4 _L5
_L2:
        return;
_L3:
        if (i.i())
        {
            w = a.b(i);
            if (w != null)
            {
                G = 1;
                a.a(w, i);
                f();
                long l1 = i.j();
                z = l1;
                y = l1;
                if (w != obj && obj != null && (obj instanceof com.cardinalblue.android.piccollage.view.k) && !((com.cardinalblue.android.piccollage.view.k)obj).I() && q != null)
                {
                    q.g(obj, null);
                }
            }
            if (w == null)
            {
                w = obj;
                return;
            }
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        if (!i.i())
        {
            G = 0;
            b b1 = a;
            w = null;
            b1.a(null, i);
            if (w == null)
            {
                w = obj;
                return;
            }
        } else
        {
            if (i.a())
            {
                G = 2;
                f();
                y = i.j();
                z = y + 20L;
                return;
            }
            if (i.j() < z)
            {
                f();
                return;
            } else
            {
                l();
                return;
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (!i.a() || !i.i())
        {
            if (!i.i())
            {
                G = 0;
                b b2 = a;
                w = null;
                b2.a(null, i);
            } else
            {
                G = 1;
                f();
                y = i.j();
                z = y + 20L;
            }
            if (w == null)
            {
                w = obj;
                return;
            }
        } else
        {
            if (Math.abs(i.g() - j.g()) > 30F || Math.abs(i.h() - j.h()) > 30F || Math.abs(i.b() - j.b()) * 0.5F > 40F || Math.abs(i.c() - j.c()) * 0.5F > 40F)
            {
                f();
                y = i.j();
                z = y + 20L;
                return;
            }
            if (com.cardinalblue.android.piccollage.controller.d.b(i) < z)
            {
                f();
                return;
            } else
            {
                l();
                return;
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    private void a(float f1, float f2, int i1, float af[], float af1[], float af2[], int ai[], 
            int j1, boolean flag, long l1)
    {
        d d1 = j;
        j = i;
        i = d1;
        d.a(i, i1, af, af1, af2, ai, j1, flag, l1);
        a(f1, f2);
    }

    private void b(MotionEvent motionevent)
    {
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        if (s == 0.0F && t == 0.0F)
        {
            s = f1;
            t = f2;
        } else
        if (Math.sqrt((f1 - s) * (f1 - s) + (f2 - t) * (f2 - t)) < 10D)
        {
            if (u == 0L)
            {
                u = System.currentTimeMillis();
                if (r != null)
                {
                    r.a(w);
                    return;
                }
            }
        } else
        {
            u = 0L;
            s = f1;
            t = f2;
            return;
        }
    }

    private void c(MotionEvent motionevent)
    {
        if (System.currentTimeMillis() - u >= 500L && u != 0L)
        {
            if (r != null)
            {
                r.a(motionevent.getX(), motionevent.getY());
            }
            u = 0L;
        }
    }

    private void i()
    {
        e = true;
        h();
        h.setIsLongpressEnabled(false);
    }

    private void j()
    {
        e = false;
        h.setIsLongpressEnabled(true);
        g();
    }

    private void k()
    {
        float f2 = 0.0F;
        k = i.g();
        l = i.h();
        float f1;
        if (!e.a(x))
        {
            f1 = 0.0F;
        } else
        {
            f1 = i.e();
        }
        m = Math.max(21.3F, f1);
        if (!com.cardinalblue.android.piccollage.controller.e.b(x))
        {
            f1 = 0.0F;
        } else
        {
            f1 = i.b();
        }
        n = Math.max(30F, f1);
        if (!com.cardinalblue.android.piccollage.controller.e.b(x))
        {
            f1 = 0.0F;
        } else
        {
            f1 = i.c();
        }
        o = Math.max(30F, f1);
        if (!e.c(x))
        {
            f1 = f2;
        } else
        {
            f1 = i.f();
        }
        p = f1;
    }

    private void l()
    {
        float f1;
        f1 = 1.0F;
        if (w == null)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_10;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        if (e.a(x) && e.d(x) != 0.0F)
        {
            f1 = e.d(x);
        }
        k();
        f2 = k;
        f3 = A;
        f4 = l;
        f5 = B;
        f6 = C;
        f7 = m;
        f8 = E;
        f9 = n;
        f10 = F;
        f11 = o;
        f12 = D;
        f13 = p;
        x.a(f2 - f3 * f1, f4 - f1 * f5, f7 * f6, f9 * f8, f11 * f10, f13 + f12);
        a.a(w, x, i);
        return;
    }

    public void a()
    {
        d = 0L;
    }

    public void a(c c1)
    {
        q = c1;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public boolean a(MotionEvent motionevent)
    {
        Object obj;
        if (e)
        {
            if (motionevent.getAction() == 1)
            {
                j();
            }
            return false;
        }
        f = motionevent.getX();
        g = motionevent.getY();
        h.onTouchEvent(motionevent);
        obj = w;
        P = motionevent.getPointerCount();
        if (G == 0 && !v && P == 1)
        {
            return false;
        }
        float f1;
        float f2;
        float af[];
        float af1[];
        float af2[];
        int ai[];
        int i1;
        boolean flag;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        long l2;
        boolean flag1;
        try
        {
            k1 = motionevent.getAction();
            l1 = motionevent.getHistorySize() / P;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return false;
        }
        i1 = 0;
          goto _L1
_L43:
        if (P != 1) goto _L3; else goto _L2
_L2:
        af = I;
        if (!flag) goto _L5; else goto _L4
_L4:
        f1 = motionevent.getHistoricalX(i1);
_L14:
        af[0] = f1;
        af = J;
        if (!flag) goto _L7; else goto _L6
_L6:
        f1 = motionevent.getHistoricalY(i1);
_L15:
        af[0] = f1;
        af = K;
        if (!flag) goto _L9; else goto _L8
_L8:
        f1 = motionevent.getHistoricalPressure(i1);
          goto _L10
_L17:
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        i2 = P;
        af = I;
        af1 = J;
        af2 = K;
        ai = L;
          goto _L11
_L36:
        if (!flag) goto _L13; else goto _L12
_L12:
        l2 = motionevent.getHistoricalEventTime(i1);
_L27:
        a(f1, f2, i2, af, af1, af2, ai, j1, flag1, l2);
        i1++;
          goto _L1
_L5:
        f1 = motionevent.getX();
          goto _L14
_L7:
        f1 = motionevent.getY();
          goto _L15
_L9:
        f1 = motionevent.getPressure();
          goto _L10
_L3:
        i2 = Math.min(P, 20);
        j1 = 0;
_L37:
        if (j1 >= i2) goto _L17; else goto _L16
_L16:
        j2 = motionevent.getPointerId(j1);
        L[j1] = j2;
        af = I;
        if (!flag) goto _L19; else goto _L18
_L18:
        f1 = motionevent.getHistoricalX(j1, i1);
_L25:
        af[j1] = f1;
        af = J;
        if (!flag) goto _L21; else goto _L20
_L20:
        f1 = motionevent.getHistoricalY(j1, i1);
_L26:
        af[j1] = f1;
        af = K;
        if (!flag) goto _L23; else goto _L22
_L22:
        f1 = motionevent.getHistoricalPressure(j1, i1);
          goto _L24
_L19:
        f1 = motionevent.getX(j1);
          goto _L25
_L21:
        f1 = motionevent.getY(j1);
          goto _L26
_L23:
        f1 = motionevent.getPressure(j1);
          goto _L24
_L13:
        l2 = motionevent.getEventTime();
          goto _L27
_L35:
        if (q == null)
        {
            return true;
        }
        if (k1 == 1 || k1 == 3)
        {
            break MISSING_BLOCK_LABEL_466;
        }
        if (w == null)
        {
            return true;
        }
        if (O == null)
        {
            O = VelocityTracker.obtain();
        }
          goto _L28
_L38:
        O.addMovement(motionevent);
        if (q != null)
        {
            q.e(w, motionevent);
        }
          goto _L29
_L40:
        O.addMovement(motionevent);
        if (q != null)
        {
            q.f(w, motionevent);
        }
        if (P == 1)
        {
            b(motionevent);
            c(motionevent);
        }
          goto _L29
_L39:
        O.addMovement(motionevent);
        O.computeCurrentVelocity(1000, N);
        f1 = Math.abs(O.getXVelocity());
        f2 = Math.abs(O.getYVelocity());
        flag1 = false;
        if (obj instanceof com.cardinalblue.android.piccollage.view.k)
        {
            flag1 = ((com.cardinalblue.android.piccollage.view.k)obj).O();
        }
        if (Math.max(f1, f2) <= (float)(N / 3) || q == null || flag1) goto _L31; else goto _L30
_L30:
        if (q != null)
        {
            q.h(obj, motionevent);
        }
        a(false);
_L33:
        w = null;
_L41:
        O.recycle();
        O = null;
          goto _L29
_L31:
        if (q == null) goto _L33; else goto _L32
_L32:
        q.g(obj, motionevent);
          goto _L33
_L1:
        if (i1 > l1) goto _L35; else goto _L34
_L34:
        if (i1 < l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        af[0] = f1;
          goto _L17
_L11:
        if (flag)
        {
            j1 = 2;
        } else
        {
            j1 = k1;
        }
        if (flag)
        {
            flag1 = true;
        } else
        if (k1 != 1 && (k1 & 0xff) != 6 && k1 != 3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
          goto _L36
_L24:
        af[j1] = f1;
        j1++;
          goto _L37
_L28:
        k1;
        JVM INSTR tableswitch 0 3: default 860
    //                   0 483
    //                   1 564
    //                   2 515
    //                   3 687;
           goto _L29 _L38 _L39 _L40 _L41
_L29:
        return true;
        if (true) goto _L43; else goto _L42
_L42:
    }

    public float b()
    {
        return f;
    }

    public float c()
    {
        return g;
    }

    public Object d()
    {
        return w;
    }

    public void e()
    {
        w = null;
    }

    public void f()
    {
        if (w == null)
        {
            return;
        }
        a.a(w, x);
        float f1;
        if (!e.a(x))
        {
            f1 = 1.0F;
        } else
        if (e.d(x) == 0.0F)
        {
            f1 = 1.0F;
        } else
        {
            f1 = e.d(x);
        }
        f1 = 1.0F / f1;
        k();
        A = (k - e.e(x)) * f1;
        B = f1 * (l - e.f(x));
        C = e.d(x) / m;
        E = e.g(x) / n;
        F = e.h(x) / o;
        D = e.i(x) - p;
    }

    public void g()
    {
        H = true;
    }

    public void h()
    {
        H = false;
    }

    public boolean onDoubleTap(MotionEvent motionevent)
    {
        Object obj = a.b(motionevent.getX(), motionevent.getY());
        if (obj != null)
        {
            i();
            if (q != null)
            {
                q.c(obj, motionevent);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void onLongPress(MotionEvent motionevent)
    {
        Object obj1 = a.b(motionevent.getX(), motionevent.getY());
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = d();
        }
        if (q != null)
        {
            q.a(obj, motionevent);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        Object obj = a.b(motionevent.getX(), motionevent.getY());
        if (!b)
        {
            b = true;
        } else
        if (obj != null)
        {
            if (c == obj)
            {
                long l1 = System.currentTimeMillis() - d;
                if (l1 < 2000L)
                {
                    if (q != null)
                    {
                        if (l1 < 500L)
                        {
                            q.c(obj, motionevent);
                        } else
                        {
                            q.b(obj, motionevent);
                        }
                    }
                    c = null;
                    return true;
                }
            }
            c = obj;
            d = System.currentTimeMillis();
            if (q != null)
            {
                q.d(obj, motionevent);
            }
            return true;
        }
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        com.cardinalblue.android.piccollage.a.b.S();
        if (a.b(motionevent.getX(), motionevent.getY()) == null)
        {
            if (q != null)
            {
                q.d(null, motionevent);
            }
            return true;
        } else
        {
            return false;
        }
    }

}
