// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import com.snapchat.android.Timber;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class Gr
{
    public static interface a
    {

        public abstract Object a();

        public abstract boolean a(Object obj, c c1);

        public abstract void b(Object obj, c c1);
    }

    public static final class b
    {

        float a[];
        float b[];
        float c[];
        int d[];
        float e;
        float f;
        float g;
        float h;
        float i;
        float j;
        float k;
        boolean l;
        boolean m;
        boolean n;
        boolean o;
        boolean p;
        long q;

        public final float a()
        {
            if (m)
            {
                return g;
            } else
            {
                return 0.0F;
            }
        }

        public final float b()
        {
            if (m)
            {
                return h;
            } else
            {
                return 0.0F;
            }
        }

        public b()
        {
            a = new float[20];
            b = new float[20];
            c = new float[20];
            d = new int[20];
        }
    }

    public static final class c
    {

        public float a;
        public float b;
        float c;
        float d;
        float e;
        float f;
        boolean g;
        boolean h;
        boolean i;

        public final float a()
        {
            if (!g)
            {
                return 1.0F;
            } else
            {
                return c;
            }
        }

        public final void a(float f1, float f2, boolean flag, float f3, boolean flag1, float f4, float f5, 
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

        public final float b()
        {
            if (!i)
            {
                return 0.0F;
            } else
            {
                return f;
            }
        }

        public c()
        {
        }
    }


    private static Method A;
    private static Method B;
    private static Method C;
    private static Method D;
    private static int E = 6;
    private static int F = 8;
    private static final float G[] = new float[20];
    private static final float H[] = new float[20];
    private static final float I[] = new float[20];
    private static final int J[] = new int[20];
    private static boolean v;
    private static Method w;
    private static Method x;
    private static Method y;
    private static Method z;
    private a a;
    private b b;
    private b c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private boolean j;
    private Object k;
    private c l;
    private long m;
    private long n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private int u;

    public Gr(a a1)
    {
        this(a1, (byte)0);
    }

    private Gr(a a1, byte byte0)
    {
        k = null;
        l = new c();
        u = 0;
        b = new b();
        c = new b();
        j = true;
        a = a1;
    }

    private void a()
    {
        float f2;
        f2 = 0.0F;
        d = b.e;
        e = b.f;
        if (l.g) goto _L2; else goto _L1
_L1:
        float f1 = 0.0F;
_L7:
        int i1;
        int k1;
        int l1;
        int i2;
        int j2;
        f = Math.max(21.3F, f1);
        b b1;
        int j1;
        int k2;
        if (!l.h)
        {
            f1 = 0.0F;
        } else
        {
            f1 = b.a();
        }
        g = Math.max(30F, f1);
        if (!l.h)
        {
            f1 = 0.0F;
        } else
        {
            f1 = b.b();
        }
        h = Math.max(30F, f1);
        if (!l.i)
        {
            f1 = f2;
        } else
        {
            b b2 = b;
            if (!b2.p)
            {
                if (!b2.m)
                {
                    b2.k = 0.0F;
                } else
                {
                    b2.k = (float)Math.atan2(b2.b[1] - b2.b[0], b2.a[1] - b2.a[0]);
                }
                b2.p = true;
            }
            f1 = b2.k;
        }
        i = f1;
        return;
_L2:
        b1 = b;
        if (b1.o) goto _L4; else goto _L3
_L3:
        if (b1.m) goto _L6; else goto _L5
_L5:
        b1.i = 0.0F;
_L10:
        b1.o = true;
_L4:
        f1 = b1.i;
          goto _L7
_L6:
        if (!b1.n)
        {
            if (b1.m)
            {
                f1 = b1.g * b1.g + b1.h * b1.h;
            } else
            {
                f1 = 0.0F;
            }
            b1.j = f1;
            b1.n = true;
        }
        f1 = b1.j;
        if (f1 != 0.0F) goto _L9; else goto _L8
_L8:
        f1 = 0.0F;
_L11:
        b1.i = f1;
        if (b1.i < b1.g)
        {
            b1.i = b1.g;
        }
        if (b1.i < b1.h)
        {
            b1.i = b1.h;
        }
          goto _L10
_L9:
        k1 = (int)(f1 * 256F);
        j1 = 32768;
        i1 = 15;
        j2 = 0;
_L12:
label0:
        {
            k2 = (j2 << 1) + j1 << i1;
            i2 = j2;
            l1 = k1;
            if (k1 >= k2)
            {
                i2 = j2 + j1;
                l1 = k1 - k2;
            }
            j1 >>= 1;
            if (j1 > 0)
            {
                break label0;
            }
            f1 = (float)i2 / 16F;
        }
          goto _L11
        i1--;
        j2 = i2;
        k1 = l1;
          goto _L12
    }

    private void b()
    {
        if (k == null)
        {
            return;
        } else
        {
            a.b(k, l);
            a();
            o = d - l.a;
            p = e - l.b;
            q = l.c / f;
            s = l.d / g;
            t = l.e / h;
            r = l.f - i;
            return;
        }
    }

    private void c()
    {
        float f2 = 1.0F;
        if (k == null)
        {
            return;
        }
        a();
        float f1 = d;
        float f8 = o;
        float f9 = e;
        float f10 = p;
        float f5 = q * f;
        float f4 = s * g;
        float f3 = t * h;
        float f6 = r;
        float f7 = i;
        c c1 = l;
        c1.a = f1 - f8;
        c1.b = f9 - f10;
        f1 = f5;
        if (f5 == 0.0F)
        {
            f1 = 1.0F;
        }
        c1.c = f1;
        if (f4 == 0.0F)
        {
            f1 = 1.0F;
        } else
        {
            f1 = f4;
        }
        c1.d = f1;
        if (f3 == 0.0F)
        {
            f1 = f2;
        } else
        {
            f1 = f3;
        }
        c1.e = f1;
        c1.f = f6 + f7;
        a.a(k, l);
    }

    public final boolean a(MotionEvent motionevent)
    {
        if (!v) goto _L2; else goto _L1
_L1:
        int i1 = ((Integer)w.invoke(motionevent, new Object[0])).intValue();
_L40:
        if (u == 0 && !j && i1 == 1)
        {
            return false;
        }
        float f1;
        float af[];
        float af1[];
        float af2[];
        int ai[];
        b b1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        long l3;
        boolean flag;
        try
        {
            i2 = motionevent.getAction();
            j2 = motionevent.getHistorySize() / i1;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return false;
        }
        j1 = 0;
          goto _L3
_L43:
        if (v && i1 != 1) goto _L5; else goto _L4
_L4:
        af = G;
        if (k1 == 0) goto _L7; else goto _L6
_L6:
        f1 = motionevent.getHistoricalX(j1);
_L21:
        af[0] = f1;
        af = H;
        if (k1 == 0) goto _L9; else goto _L8
_L8:
        f1 = motionevent.getHistoricalY(j1);
_L22:
        af[0] = f1;
        af = I;
        if (k1 == 0) goto _L11; else goto _L10
_L10:
        f1 = motionevent.getHistoricalPressure(j1);
          goto _L12
_L24:
        af = G;
        af1 = H;
        af2 = I;
        ai = J;
        if (k1 != 0) goto _L14; else goto _L13
_L13:
        if (i2 == 1) goto _L16; else goto _L15
_L15:
        if (((1 << F) - 1 & i2) == E || i2 == 3) goto _L16; else goto _L14
_L44:
        if (k1 == 0) goto _L18; else goto _L17
_L17:
        l3 = motionevent.getHistoricalEventTime(j1);
_L33:
        b1 = c;
        c = b;
        b = b1;
        b1 = b;
        b1.q = l3;
        k1 = 0;
_L20:
        if (k1 >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        b1.a[k1] = af[k1];
        b1.b[k1] = af1[k1];
        b1.c[k1] = af2[k1];
        b1.d[k1] = ai[k1];
        k1++;
        if (true) goto _L20; else goto _L19
_L7:
        f1 = motionevent.getX();
          goto _L21
_L9:
        f1 = motionevent.getY();
          goto _L22
_L11:
        f1 = motionevent.getPressure();
          goto _L12
_L5:
        k2 = Math.min(i1, 20);
        l1 = 0;
_L29:
        if (l1 >= k2) goto _L24; else goto _L23
_L23:
        l2 = ((Integer)x.invoke(motionevent, new Object[] {
            Integer.valueOf(l1)
        })).intValue();
        J[l1] = l2;
        af1 = G;
        if (k1 == 0) goto _L26; else goto _L25
_L25:
        af = ((float []) (z.invoke(motionevent, new Object[] {
            Integer.valueOf(l1), Integer.valueOf(j1)
        })));
_L30:
        af1[l1] = ((Float)af).floatValue();
        af1 = H;
        if (k1 == 0) goto _L28; else goto _L27
_L27:
        af = ((float []) (A.invoke(motionevent, new Object[] {
            Integer.valueOf(l1), Integer.valueOf(j1)
        })));
_L31:
        af1[l1] = ((Float)af).floatValue();
        af1 = I;
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_593;
        }
        af = ((float []) (B.invoke(motionevent, new Object[] {
            Integer.valueOf(l1), Integer.valueOf(j1)
        })));
_L32:
        af1[l1] = ((Float)af).floatValue();
        l1++;
          goto _L29
_L26:
        af = ((float []) (C.invoke(motionevent, new Object[] {
            Integer.valueOf(l1)
        })));
          goto _L30
_L28:
        af = ((float []) (D.invoke(motionevent, new Object[] {
            Integer.valueOf(l1)
        })));
          goto _L31
        af = ((float []) (y.invoke(motionevent, new Object[] {
            Integer.valueOf(l1)
        })));
          goto _L32
_L18:
        l3 = motionevent.getEventTime();
          goto _L33
_L19:
        b1.l = flag;
        if (i1 >= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b1.m = flag;
        if (b1.m)
        {
            b1.e = (af[0] + af[1]) * 0.5F;
            b1.f = (af1[0] + af1[1]) * 0.5F;
            b1.g = Math.abs(af[1] - af[0]);
            b1.h = Math.abs(af1[1] - af1[0]);
        } else
        {
            b1.e = af[0];
            b1.f = af1[0];
            b1.h = 0.0F;
            b1.g = 0.0F;
        }
        b1.p = false;
        b1.o = false;
        b1.n = false;
        u;
        JVM INSTR tableswitch 0 2: default 1260
    //                   0 804
    //                   1 867
    //                   2 964;
           goto _L34 _L35 _L36 _L37
_L34:
        break MISSING_BLOCK_LABEL_1260;
_L35:
        if (b.l)
        {
            k = a.a();
            if (k != null)
            {
                u = 1;
                b();
                l3 = b.q;
                n = l3;
                m = l3;
            }
        }
        break MISSING_BLOCK_LABEL_1260;
_L36:
        if (!b.l)
        {
            u = 0;
            k = null;
            break MISSING_BLOCK_LABEL_1260;
        }
        if (b.m)
        {
            u = 2;
            b();
            m = b.q;
            n = m + 20L;
            break MISSING_BLOCK_LABEL_1260;
        }
        if (b.q < n)
        {
            b();
            break MISSING_BLOCK_LABEL_1260;
        }
        c();
        break MISSING_BLOCK_LABEL_1260;
_L37:
        if (b.m && b.l) goto _L39; else goto _L38
_L38:
        if (!b.l)
        {
            u = 0;
            k = null;
            break MISSING_BLOCK_LABEL_1260;
        }
        u = 1;
        b();
        m = b.q;
        n = m + 20L;
        break MISSING_BLOCK_LABEL_1260;
_L39:
        if (Math.abs(b.e - c.e) > 30F || Math.abs(b.f - c.f) > 30F || Math.abs(b.a() - c.a()) * 0.5F > 40F || Math.abs(b.b() - c.b()) * 0.5F > 40F)
        {
            b();
            m = b.q;
            n = m + 20L;
            break MISSING_BLOCK_LABEL_1260;
        }
        if (b.q < n)
        {
            b();
            break MISSING_BLOCK_LABEL_1260;
        }
        c();
        break MISSING_BLOCK_LABEL_1260;
_L42:
        return true;
_L2:
        i1 = 1;
          goto _L40
_L3:
        if (j1 > j2) goto _L42; else goto _L41
_L41:
        if (j1 < j2)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
          goto _L43
_L12:
        af[0] = f1;
          goto _L24
_L14:
        flag = true;
          goto _L44
_L16:
        flag = false;
          goto _L44
        j1++;
          goto _L3
    }

    static 
    {
        boolean flag = true;
        try
        {
            w = android/view/MotionEvent.getMethod("getPointerCount", new Class[0]);
            x = android/view/MotionEvent.getMethod("getPointerId", new Class[] {
                Integer.TYPE
            });
            y = android/view/MotionEvent.getMethod("getPressure", new Class[] {
                Integer.TYPE
            });
            z = android/view/MotionEvent.getMethod("getHistoricalX", new Class[] {
                Integer.TYPE, Integer.TYPE
            });
            A = android/view/MotionEvent.getMethod("getHistoricalY", new Class[] {
                Integer.TYPE, Integer.TYPE
            });
            B = android/view/MotionEvent.getMethod("getHistoricalPressure", new Class[] {
                Integer.TYPE, Integer.TYPE
            });
            C = android/view/MotionEvent.getMethod("getX", new Class[] {
                Integer.TYPE
            });
            D = android/view/MotionEvent.getMethod("getY", new Class[] {
                Integer.TYPE
            });
        }
        catch (Exception exception)
        {
            Timber.e("MultiTouchController", "static initializer failed", new Object[] {
                exception
            });
            flag = false;
        }
        v = flag;
        if (flag)
        {
            try
            {
                E = android/view/MotionEvent.getField("ACTION_POINTER_UP").getInt(null);
                F = android/view/MotionEvent.getField("ACTION_POINTER_INDEX_SHIFT").getInt(null);
            }
            catch (Exception exception1) { }
        }
    }
}
