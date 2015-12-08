// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bi;

import android.opengl.Matrix;
import com.google.android.m4b.maps.bo.aq;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.cf.e;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.android.m4b.maps.bi:
//            c

public final class b extends e
{

    public static final c a = new c(new g(0, 0), 2.0F, 0.0F, 0.0F, 0.0F);
    public static final AtomicLong o = new AtomicLong(1L);
    private static final float v = (float)(1.0D / Math.log(2D));
    private static float w = 262144F * (float)Math.cos(1.3089969389957472D);
    private static final g x = new g(0, 0, 1);
    private static final float y = (float)(0.5D / Math.tan(0.26179938779914941D));
    private float A;
    private g B;
    private g C;
    private g D;
    private aq E;
    private float F;
    private double G[];
    private float H[];
    private float I[];
    private final g J;
    public c b;
    public boolean c;
    public g d;
    public float e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public float k[];
    public float l[];
    public float m[];
    public final float n[];
    public volatile long p;
    private final Thread z;

    public b(c c1, int i1, int j1, float f1)
    {
        this(c1, i1, j1, f1, (byte)0);
    }

    public b(c c1, int i1, int j1, float f1, byte byte0)
    {
        this(c1, i1, j1, f1, new float[16]);
    }

    private b(c c1, int i1, int j1, float f1, float af[])
    {
        super(af);
        A = y;
        k = null;
        l = null;
        H = null;
        I = null;
        m = null;
        n = new float[8];
        J = new g();
        p = o.getAndIncrement();
        i = j1;
        h = i1;
        j = f1;
        z = null;
        c = false;
        f1 = Math.min(Math.max(0.0F, 30F), 90F);
        if (f1 != g)
        {
            g = f1;
            p = o.incrementAndGet();
            f = (float)(0.5D / Math.tan((double)g * 0.017453292519943295D * 0.5D));
            a(true);
            if (b != null && b.e != 0.0F)
            {
                d = new g();
                a();
            }
        }
        a(c1);
    }

    public static float a(float f1)
    {
        return (float)Math.log(f1) * v;
    }

    private aq a(float f1, int i1, int j1, int k1, int l1)
    {
        f1 = Math.min(f1, b(c().c));
        float f4 = b.c;
        float f2 = i;
        float f3 = f;
        f4 = (float)Math.tan((f1 - f4) * 0.01745329F);
        f2 = (float)Math.ceil((float)i * 0.5F - f4 * (f2 * f3));
        Object obj = b(i1, i - l1);
        g g1 = b(h - k1, i - l1);
        g g2 = b(i1, (float)j1 + f2);
        g g3 = b(h - k1, (float)j1 + f2);
        if (obj == null || g1 == null || g2 == null || g3 == null)
        {
            obj = b.toString();
            i1 = h;
            j1 = i;
            throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 81)).append("pos: ").append(((String) (obj))).append(" farAngle: ").append(f1).append(" size: ").append(i1).append("x").append(j1).append(" top:").append(f2).toString());
        } else
        {
            return aq.a(((g) (obj)), g1, g2, g3);
        }
    }

    public static float b(float f1)
    {
        if (f1 < w)
        {
            return (float)Math.acos(f1 / 262144F) * 57.29578F;
        } else
        {
            return 75F;
        }
    }

    private double[] n()
    {
        if (G != null) goto _L2; else goto _L1
_L1:
        double d2 = 90D - (double)b.d;
        if (d2 >= 0.0D) goto _L4; else goto _L3
_L3:
        double d1 = d2 + 360D;
_L6:
        d2 = (double)b.c * 0.017453292519943295D;
        d1 *= 0.017453292519943295D;
        double d3 = Math.sin(d2);
        G = new double[3];
        G[0] = Math.cos(d1) * d3;
        G[1] = Math.sin(d1) * d3;
        G[2] = -Math.cos(d2);
_L2:
        return G;
_L4:
        d1 = d2;
        if (d2 >= 360D)
        {
            d1 = d2 - 360D;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final float a(float f1, float f2)
    {
        return (f2 * f1) / (f * (float)i);
    }

    public final aq a(int i1, int j1, int k1, int l1)
    {
        if (E == null)
        {
            float f1 = b.c;
            E = a(g * 0.5F + f1, i1, j1, k1, l1);
        }
        return E;
    }

    public final void a()
    {
        double d1 = (double)b.d * 0.017453292519943295D;
        double d2 = (double)b.c * 0.017453292519943295D;
        double d3 = b.e * 0.5F * g;
        double d4 = e;
        double d5 = Math.sin(d2);
        double d6 = Math.cos(d2);
        d2 = (d5 - Math.tan(d2 - d3 * 0.017453292519943295D) * d6) * d4;
        int i1 = (int)(Math.sin(d1) * d2);
        int j1 = (int)(Math.cos(d1) * d2);
        g g1 = com.google.android.m4b.maps.bo.g.a(b.a);
        d.d(g1.a + i1, j1 + g1.b);
    }

    public final void a(c c1)
    {
        if (b != null && b.equals(c1))
        {
            return;
        }
        p = o.incrementAndGet();
        a(false);
        if (b == null || c1.d != b.d || c1.c != b.c)
        {
            G = null;
        }
        b = c1;
        b();
        if (b.e != 0.0F)
        {
            d = new g();
            a();
        } else
        {
            d = com.google.android.m4b.maps.bo.g.a(b.a);
        }
        m();
    }

    public final void a(g g1)
    {
        g1.b(d);
    }

    public final void a(g g1, float af[])
    {
        int j1;
        if (I == null)
        {
            l();
        }
        j1 = g1.a - d.a;
        if (j1 < 0x20000000) goto _L2; else goto _L1
_L1:
        int i1 = j1 - 0x40000000;
_L4:
        j1 = c().c;
        af[0] = i1;
        af[1] = g1.b - d.b;
        af[2] = g1.c;
        af[3] = j1;
        Matrix.multiplyMV(af, 4, I, 0, af, 0);
        float f1 = 1.0F / af[7];
        af[0] = af[4] * f1;
        af[1] = f1 * af[5];
        return;
_L2:
        i1 = j1;
        if (j1 < 0xe0000000)
        {
            i1 = j1 + 0x40000000;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(boolean flag)
    {
        B = null;
        C = null;
        D = null;
        E = null;
        F = -1F;
        k = null;
        I = null;
        m = null;
        if (flag)
        {
            l = null;
            H = null;
        }
    }

    public final float b(g g1)
    {
        double ad[] = n();
        com.google.android.m4b.maps.bo.g.b(g1, c(), J);
        J.h(J);
        double d1 = J.a;
        double d2 = ad[0];
        double d3 = J.b;
        double d4 = ad[1];
        double d5 = J.c;
        return (float)(ad[2] * d5 + (d1 * d2 + d3 * d4));
    }

    public final g b(float f1, float f2)
    {
        if (m == null)
        {
            l();
        }
        float af[] = n;
        af[0] = f1;
        af[1] = f2;
        af[2] = 1.0F;
        af[3] = 1.0F;
        Matrix.multiplyMV(af, 4, m, 0, af, 0);
        f1 = 1.0F / af[7];
        double d1 = af[4] * f1;
        double d2 = af[5] * f1;
        double d3 = af[6] * f1;
        if (d3 >= 1.0D)
        {
            return null;
        } else
        {
            g g1 = c();
            int i1 = g1.a;
            int j1 = g1.b;
            int k1 = g1.c;
            d3 = 1.0D / (1.0D - d3);
            double d4 = k1;
            double d5 = d.a;
            double d6 = i1;
            double d7 = i1;
            double d8 = k1;
            double d9 = d.b;
            double d10 = j1;
            double d11 = j1;
            return new g((int)(((d1 * d4 + d5) - d6) * d3 + d7), (int)(d11 + d3 * ((d8 * d2 + d9) - d10)));
        }
    }

    public final void b()
    {
        e = (float)(Math.pow(2D, 30F - b.b) * ((double)i / (double)(256F * j))) * A;
    }

    public final aq c(float f1)
    {
        return a(f1, 0, 0, 0, 0);
    }

    public final g c()
    {
        if (B == null)
        {
            double ad[] = n();
            B = new g((int)Math.round((double)(-e) * ad[0]), (int)Math.round((double)(-e) * ad[1]), (int)Math.round((double)(-e) * ad[2]));
            com.google.android.m4b.maps.bo.g.a(B, d, B);
        }
        return B;
    }

    public final int[] c(g g1)
    {
        float af[] = new float[8];
        a(g1, af);
        return (new int[] {
            Math.round(af[0]), Math.round(af[1])
        });
    }

    public final g d()
    {
        if (D == null)
        {
            g g1 = c();
            if (b.c == 0.0F || g1.a == d.a && g1.b == d.b)
            {
                double d2 = -b.d;
                double d1;
                if (d2 < 0.0D)
                {
                    d1 = d2 + 360D;
                } else
                {
                    d1 = d2;
                    if (d2 >= 360D)
                    {
                        d1 = d2 - 360D;
                    }
                }
                d1 *= 0.017453292519943295D;
                D = new g((int)(Math.cos(d1) * 65536D), (int)(Math.sin(d1) * 65536D));
            } else
            {
                g1 = d.f(g1).g(x);
                com.google.android.m4b.maps.bo.g.b(g1, 65536F, g1);
                D = g1;
            }
        }
        return D;
    }

    public final g e()
    {
        if (C == null)
        {
            g g1 = c();
            if ((double)b.c == 0.0D || g1.a == d.a && g1.b == d.b)
            {
                double d2 = 90D - (double)b.d;
                double d1;
                if (d2 < 0.0D)
                {
                    d1 = d2 + 360D;
                } else
                {
                    d1 = d2;
                    if (d2 >= 360D)
                    {
                        d1 = d2 - 360D;
                    }
                }
                d1 *= 0.017453292519943295D;
                C = new g((int)(Math.cos(d1) * 65536D), (int)(Math.sin(d1) * 65536D));
            } else
            {
                g1 = d.f(g1);
                com.google.android.m4b.maps.bo.g.b(g1, 16384F, g1);
                g1 = d().g(g1);
                com.google.android.m4b.maps.bo.g.b(g1, 65536F, g1);
                C = g1;
            }
        }
        return C;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof b)
            {
                if (e != ((b) (obj = (b)obj)).e || !b.equals(((b) (obj)).b) || g != ((b) (obj)).g || i != ((b) (obj)).i || h != ((b) (obj)).h || j != ((b) (obj)).j)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final float f()
    {
        if (F < 0.0F)
        {
            F = 1.0F / (float)c().c;
        }
        return F;
    }

    public final float g()
    {
        return a(1.0F, e);
    }

    public final aq h()
    {
        return a(0, 0, 0, 0);
    }

    public final int hashCode()
    {
        int j1 = Float.floatToIntBits(e);
        int k1 = i;
        int l1 = h;
        int i2 = Float.floatToIntBits(g);
        int j2 = Float.floatToIntBits(j);
        int i1;
        if (b == null)
        {
            i1 = 0;
        } else
        {
            i1 = b.hashCode();
        }
        return i1 + (((((j1 + 31) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31;
    }

    public final aq i()
    {
        if (b.c == 0.0F)
        {
            return h();
        } else
        {
            float f1 = b.c * 0.01745329F;
            float f2 = 0.5F / f;
            return c(((float)Math.atan((Math.sin(f1) + (double)f2) / Math.cos(f1)) - f1) * 57.29578F + b.c);
        }
    }

    public final void j()
    {
        l = new float[16];
        float f1 = ((float)h * 1.0F) / (float)i;
        float f2 = 0.1F * (float)Math.tan((double)g * 0.017453292519943295D * 0.5D);
        float f3 = -f2;
        Matrix.frustumM(l, 0, f3 * f1, f2 * f1, f3, f2, 0.1F, 20F);
    }

    public final void k()
    {
        k = new float[16];
        float f3 = f();
        g g1 = d;
        g1 = c().f(g1);
        float f1 = (float)g1.a * f3;
        float f2 = (float)g1.b * f3;
        f3 *= g1.c;
        g1 = e();
        float af[] = k;
        float f7 = g1.a;
        float f8 = g1.b;
        float f9 = g1.c;
        float f4 = -f1;
        float f5 = -f2;
        float f6 = -f3;
        float f10 = 1.0F / Matrix.length(f4, f5, f6);
        f4 *= f10;
        f5 *= f10;
        f6 *= f10;
        f10 = f5 * f9 - f6 * f8;
        f9 = f6 * f7 - f9 * f4;
        f7 = f8 * f4 - f7 * f5;
        f8 = 1.0F / Matrix.length(f10, f9, f7);
        f10 *= f8;
        f9 *= f8;
        f7 *= f8;
        af[0] = f10;
        af[1] = f9 * f6 - f7 * f5;
        af[2] = -f4;
        af[3] = 0.0F;
        af[4] = f9;
        af[5] = f7 * f4 - f10 * f6;
        af[6] = -f5;
        af[7] = 0.0F;
        af[8] = f7;
        af[9] = f10 * f5 - f9 * f4;
        af[10] = -f6;
        af[11] = 0.0F;
        af[12] = 0.0F;
        af[13] = 0.0F;
        af[14] = 0.0F;
        af[15] = 1.0F;
        Matrix.translateM(af, 0, -f1, -f2, -f3);
    }

    public final void l()
    {
        if (k == null)
        {
            k();
        }
        if (l == null)
        {
            j();
        }
        if (H == null)
        {
            H = new float[16];
            H[0] = (float)h * 0.5F;
            H[5] = (float)i * -0.5F;
            H[10] = 1.0F;
            H[15] = 1.0F;
            H[12] = (float)h * 0.5F;
            H[13] = (float)i * 0.5F;
        }
        I = new float[16];
        float af[] = new float[16];
        Matrix.multiplyMM(af, 0, H, 0, l, 0);
        Matrix.multiplyMM(I, 0, af, 0, k, 0);
        m = af;
        Matrix.invertM(m, 0, I, 0);
    }

    public final String toString()
    {
        String s = String.valueOf(new g(Math.round(d.a), Math.round(d.b), Math.round(d.c)));
        float f1 = e;
        float f2 = b.d;
        float f3 = b.c;
        float f4 = g;
        return (new StringBuilder(String.valueOf(s).length() + 70)).append("[").append(s).append(", ").append(f1).append(", ").append(f2).append(", ").append(f3).append(", ").append(f4).append("]").toString();
    }

}
