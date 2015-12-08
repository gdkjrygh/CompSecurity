// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.az.i;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bi.d;
import com.google.android.m4b.maps.bi.e;
import com.google.android.m4b.maps.bi.f;
import com.google.android.m4b.maps.bo.aq;
import com.google.android.m4b.maps.bo.g;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            u, j, e, z, 
//            q

public final class p
    implements u
{
    public static final class a extends com.google.android.m4b.maps.bi.a
    {

        private final com.google.android.m4b.maps.bi.c b;
        private com.google.android.m4b.maps.bi.d c;
        private final int d;
        private final long e = com.google.android.m4b.maps.ay.k.c();
        private int f;
        private final k g = com.google.android.m4b.maps.ay.k.a();
        private float h;

        public final int a()
        {
            return f;
        }

        public final com.google.android.m4b.maps.bi.d a(com.google.android.m4b.maps.bi.b b1)
        {
            long l1 = com.google.android.m4b.maps.ay.k.c();
            float f1;
            int i1;
            if (d == 0)
            {
                f1 = 1.0F;
            } else
            {
                f1 = (float)(l1 - e) / (float)d;
            }
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            com.google.android.m4b.maps.bi.c c1;
            com.google.android.m4b.maps.bi.c c2;
            if (c instanceof f)
            {
                f f9 = (f)c;
                c = f9.a(b1);
                i1 = f9.a();
            } else
            {
                i1 = 0;
            }
            if (f1 >= 1.0F)
            {
                f = i1;
                return c;
            }
            f6 = 1.0F - ((float)Math.cos((double)f1 * 3.1415926535897931D) + 1.0F) * 0.5F;
            c1 = b;
            c2 = c.b().a(b);
            f1 = h;
            if (f1 == 0.0F)
            {
                b1 = c1.a.a(c2.a, f6);
                f1 = c1.b;
                f1 = (c2.b - f1) * f6 + f1;
            } else
            {
                b1 = c1.a.a(c2.a, ((float)Math.cos(3.141593F * (f6 - 1.0F)) + 1.0F) / 2.0F);
                f4 = c1.b;
                f3 = c2.b;
                f2 = (float)Math.sin(3.141593F * f6);
                f4 = com.google.android.m4b.maps.bi.c.a(f4);
                f3 = com.google.android.m4b.maps.bi.c.a(f3);
                f1 = Math.min((float)(0.5D * Math.pow(f2, 1.2D) * Math.pow(f1, 0.40000000000000002D)) + (f4 * (1.0F - f6) + f3 * f6), 160F);
                if (f1 > 0.0F)
                {
                    f1 = (float)(-Math.log((double)f1 * 0.10000000000000001D) * 1.4426950216293335D + 4D);
                } else
                {
                    f1 = 32F;
                }
                f1 = Math.max(f1, 2.0F);
            }
            f7 = c1.c;
            f8 = c2.c;
            f4 = c1.d;
            f5 = c2.d;
            if (f4 <= f5) goto _L2; else goto _L1
_L1:
            f2 = f5;
            f3 = f4;
            if (f4 - f5 > 180F)
            {
                f3 = f4 - 360F;
                f2 = f5;
            }
_L4:
            f3 += (f2 - f3) * f6;
            f2 = f3;
            if ((double)f3 < 0.0D)
            {
                f2 = f3 + 360F;
            }
            f3 = c1.e;
            a = new com.google.android.m4b.maps.bi.c(b1, f1, (f8 - f7) * f6 + f7, f2, f6 * (c2.e - f3) + f3);
            f = i1 | 2;
            return this;
_L2:
            f2 = f5;
            f3 = f4;
            if (f5 - f4 > 180F)
            {
                f2 = f5 - 360F;
                f3 = f4;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected a(com.google.android.m4b.maps.bi.c c1, com.google.android.m4b.maps.bi.d d1, int i1, boolean flag, float f1)
        {
            super(c1);
            f = 0;
            b = c1;
            c = d1;
            if (b.equals(c.b()))
            {
                d = 0;
            } else
            {
                d = Math.max(0, i1);
            }
            if (flag)
            {
                h = 0.0F;
                return;
            } else
            {
                h = f1;
                return;
            }
        }
    }

    static final class b extends com.google.android.m4b.maps.bi.a
    {

        private final com.google.android.m4b.maps.bi.e b;
        private float c;
        private float d;
        private long e;

        public final int a()
        {
            return c != 0.0F || d != 0.0F ? 2 : 0;
        }

        public final com.google.android.m4b.maps.bi.d a(com.google.android.m4b.maps.bi.b b1)
        {
            long l1 = SystemClock.uptimeMillis();
            this;
            JVM INSTR monitorenter ;
            float f2;
            float f3;
            float f4;
            long l2 = e;
            e = l1;
            float f1 = (float)Math.exp((float)(-(l1 - l2)) * 0.006F);
            f2 = (1.0F - f1) / 0.006F;
            f3 = c;
            f4 = d;
            c = c * f1;
            d = f1 * d;
            if (Math.abs(c) < 0.15F && Math.abs(d) < 0.15F)
            {
                c = 0.0F;
                d = 0.0F;
            }
            this;
            JVM INSTR monitorexit ;
            a = b.a(p.a(a, b1, f3 * f2, f2 * f4));
            b1 = this;
            if (c == 0.0F)
            {
                b1 = this;
                if (d == 0.0F)
                {
                    b1 = a;
                }
            }
            return b1;
            b1;
            this;
            JVM INSTR monitorexit ;
            throw b1;
        }

        final void a(float f1, float f2)
        {
            this;
            JVM INSTR monitorenter ;
            c = f1 * -0.001F;
            d = f2 * -0.001F;
            e = SystemClock.uptimeMillis();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public b(com.google.android.m4b.maps.bi.c c1, com.google.android.m4b.maps.bi.e e1)
        {
            super(c1);
            b = e1;
        }
    }

    static final class c extends com.google.android.m4b.maps.bi.a
    {

        private final float b;
        private final float c;
        private final float d;
        private final int e;
        private final long f = SystemClock.uptimeMillis();
        private final com.google.android.m4b.maps.bi.e g;
        private f h;

        public final int a()
        {
            if (h == null)
            {
                return 0;
            } else
            {
                return h.a();
            }
        }

        public final com.google.android.m4b.maps.bi.d a(com.google.android.m4b.maps.bi.b b1)
        {
            com.google.android.m4b.maps.bi.c c1 = p.a(a, b1, g, b, c, d);
            int i1 = (int)(SystemClock.uptimeMillis() - f);
            h = new a(a, c1, e - i1, true, 0.0F);
            return h.a(b1);
        }

        protected c(com.google.android.m4b.maps.bi.c c1, com.google.android.m4b.maps.bi.e e1, float f1, float f2, float f3, int i1)
        {
            super(c1);
            g = e1;
            b = f1;
            c = f2;
            d = f3;
            e = i1;
        }
    }

    static final class d extends com.google.android.m4b.maps.bi.a
    {

        private float b;
        private float c;
        private float d;
        private float e;
        private float f;
        private float g;
        private volatile boolean h;
        private final com.google.android.m4b.maps.bi.e i;
        private final float j[] = new float[2];

        public final int a()
        {
            return !h ? 0 : 2;
        }

        public final com.google.android.m4b.maps.bi.d a(com.google.android.m4b.maps.bi.b b1)
        {
            this;
            JVM INSTR monitorenter ;
            float f3;
            float f4;
            float f5;
            float f6;
            f3 = f;
            f4 = g;
            f5 = d;
            f6 = e;
            if (b >= 0.0F) goto _L2; else goto _L1
_L1:
            float f1 = Math.max(b, b * b * b * 100F);
_L9:
            if (c >= 0.0F) goto _L4; else goto _L3
_L3:
            float f2 = Math.max(c, c * c * -0.1F);
_L7:
            b = b - f1;
            c = c - f2;
            d = 0.0F;
            e = 0.0F;
            if ((double)Math.abs(f1) >= 0.001D || (double)Math.abs(f2) >= 0.001D || f5 != 0.0F || f6 != 0.0F) goto _L6; else goto _L5
_L5:
            h = false;
            b1 = a;
            this;
            JVM INSTR monitorexit ;
            return b1;
_L2:
            f1 = Math.min(b, b * b * b * 100F);
            continue; /* Loop/switch isn't completed */
_L4:
            f2 = Math.min(c, c * c * 0.1F);
              goto _L7
_L6:
            this;
            JVM INSTR monitorexit ;
            boolean flag;
            boolean flag1;
            boolean flag2;
            if (f5 != 0.0F || f6 != 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (f2 != 0.0F)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (f1 != 0.0F)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag)
            {
                a = p.a(a, b1, f5, f6);
                if (flag1 || flag2)
                {
                    b1.a(a);
                }
            }
            if (flag1)
            {
                g g1 = b1.b(f3, f4);
                a = p.a(b1, i, g1, f2);
                if (flag2)
                {
                    b1.a(a);
                }
            }
            if (flag2)
            {
                a = p.a(a, b1, i, f1, f3, f4);
                return this;
            }
            break MISSING_BLOCK_LABEL_392;
            b1;
            this;
            JVM INSTR monitorexit ;
            throw b1;
            return this;
            if (true) goto _L9; else goto _L8
_L8:
        }

        final float[] a(float f1, float f2, float f3, float f4, float f5, float f6)
        {
            this;
            JVM INSTR monitorenter ;
            b = b + f1;
            c = c + f2;
            d = d + f5;
            e = e + f6;
            if (f1 == 0.0F && f2 == 0.0F)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            f = f3;
            g = f4;
            float af[];
            h = true;
            j[0] = Math.max(Math.min(a.b + b, com.google.android.m4b.maps.bx.p.b()), 2.0F);
            j[1] = com.google.android.m4b.maps.bx.p.b(a.d + c);
            af = j;
            this;
            JVM INSTR monitorexit ;
            return af;
            Exception exception;
            exception;
            throw exception;
        }

        public d(com.google.android.m4b.maps.bi.c c1, com.google.android.m4b.maps.bi.e e1)
        {
            super(c1);
            i = e1;
        }
    }

    public static interface e
    {

        public abstract void b();
    }


    public static float a = 21F;
    private static final float f = (float)(1.0D / Math.log(2D));
    private static final com.google.android.m4b.maps.bi.c g = null;
    public final com.google.android.m4b.maps.bi.e b;
    public volatile com.google.android.m4b.maps.bi.c c;
    public volatile float d;
    public q e;
    private Resources h;
    private volatile com.google.android.m4b.maps.bi.c i;
    private volatile com.google.android.m4b.maps.bi.d j;
    private volatile boolean k;
    private boolean l;
    private j m;
    private com.google.android.m4b.maps.bx.e n;
    private z o;
    private e p;
    private boolean q;
    private int r;
    private float s;
    private final i t = com.google.android.m4b.maps.az.i.a();

    public p(Resources resources)
    {
        r = 6;
        s = 1.0F;
        h = resources;
        c = com.google.android.m4b.maps.bi.b.a;
        j = com.google.android.m4b.maps.bi.b.a;
        b = new com.google.android.m4b.maps.bi.e(resources);
    }

    public static com.google.android.m4b.maps.bi.c a(com.google.android.m4b.maps.bi.b b1, com.google.android.m4b.maps.bi.e e1, g g1, float f1)
    {
        g g2 = com.google.android.m4b.maps.bo.g.a(b1.d);
        int i1 = g2.a - g1.a;
        int j1 = g2.b - g1.b;
        float f3 = (float)(((double)f1 * 3.1415926535897931D) / 180D);
        float f2 = (float)Math.sin(-f3);
        f3 = (float)Math.cos(-f3);
        float f4 = i1;
        float f5 = j1;
        float f6 = i1;
        float f7 = j1;
        g1 = new g((int)((float)g1.a + (f4 * f3 - f5 * f2)), (int)(f7 * f3 + f6 * f2 + (float)g1.b));
        f1 = c(b1.b.d + f1);
        return e1.a(new com.google.android.m4b.maps.bi.c(g1, b1.b.b, b1.b.c, f1, 0.0F));
    }

    public static com.google.android.m4b.maps.bi.c a(com.google.android.m4b.maps.bi.c c1, com.google.android.m4b.maps.bi.b b1, float f1, float f2)
    {
        float f3 = b1.g();
        f2 = (-f2 * b1.g()) / (float)Math.cos(b1.b.c * 0.01745329F);
        g g1 = b1.d();
        g g2 = b1.e();
        g1 = new g(g1.a, g1.b);
        g2 = new g(g2.a, g2.b);
        com.google.android.m4b.maps.bo.g.b(g1, f3 * f1, g1);
        com.google.android.m4b.maps.bo.g.b(g2, f2, g2);
        b1 = com.google.android.m4b.maps.bo.g.a(b1.d);
        f1 = c1.b;
        int i1 = ((g) (b1)).c;
        b1 = b1.e(g1);
        com.google.android.m4b.maps.bo.g.a(b1, g2, b1);
        b1.c = i1;
        return new com.google.android.m4b.maps.bi.c(b1, f1, c1.c, c1.d, 0.0F);
    }

    public static com.google.android.m4b.maps.bi.c a(com.google.android.m4b.maps.bi.c c1, com.google.android.m4b.maps.bi.b b1, com.google.android.m4b.maps.bi.e e1, float f1, float f2, float f3)
    {
        f2 -= (float)b1.h / 2.0F;
        f3 -= (float)b1.i / 2.0F;
        c1 = e1.a(a(c1, b1, f2, f3));
        c1 = new com.google.android.m4b.maps.bi.c(com.google.android.m4b.maps.bo.g.a(c1.a), Math.min(a, c1.b + f1), c1.c, c1.d, 0.0F);
        b1.a(c1);
        return a(c1, b1, -f2, -f3);
    }

    private void a(com.google.android.m4b.maps.bi.d d1, int i1)
    {
        int j1;
        if (i1 == 0)
        {
            j1 = 0;
        } else
        {
            j1 = -1;
        }
        a(d1, i1, j1);
    }

    private void a(com.google.android.m4b.maps.bi.d d1, com.google.android.m4b.maps.bi.c c1)
    {
        this;
        JVM INSTR monitorenter ;
        if (p != null)
        {
            p.b();
        }
        if (d1 instanceof f)
        {
            k = true;
        }
        j = d1;
        l = true;
        c = b.a(j.b());
        d1 = c1;
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        d1 = b.a(c1);
        i = d1;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        if (m != null)
        {
            m.a(false, true);
        }
        return;
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
    }

    static float b()
    {
        return a;
    }

    static float b(float f1)
    {
        return c(f1);
    }

    private static float c(float f1)
    {
        float f2;
        do
        {
            f2 = f1;
            if ((double)f1 < 360D)
            {
                break;
            }
            f1 = (float)((double)f1 - 360D);
        } while (true);
        for (; (double)f2 < 0.0D; f2 = (float)((double)f2 + 360D)) { }
        return f2;
    }

    public final float a(float f1, float f2, float f3)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.bi.c c1;
        com.google.android.m4b.maps.bi.c c2;
        c1 = c;
        c2 = b.a(new com.google.android.m4b.maps.bi.c(com.google.android.m4b.maps.bo.g.a(c1.a), c1.b + f1, c1.c, c1.d, c1.e));
        if (c1.b != c2.b) goto _L2; else goto _L1
_L1:
        f1 = c1.b;
_L4:
        this;
        JVM INSTR monitorexit ;
        return f1;
_L2:
        if (!(j instanceof d))
        {
            break; /* Loop/switch isn't completed */
        }
        f1 = ((d)j).a(f1, 0.0F, f2, f3, 0.0F, 0.0F)[0];
_L5:
        d = f1;
        if (true) goto _L4; else goto _L3
        Exception exception;
        exception;
        throw exception;
_L3:
        d d1 = new d(j.b(), b);
        f1 = d1.a(f1, 0.0F, f2, f3, 0.0F, 0.0F)[0];
        a(((com.google.android.m4b.maps.bi.d) (d1)), ((com.google.android.m4b.maps.bi.c) (null)));
          goto _L5
    }

    public final float a(float f1, float f2, float f3, int i1)
    {
        com.google.android.m4b.maps.bi.c c1 = c;
        d = c1.b + f1;
        a(((com.google.android.m4b.maps.bi.d) (new c(c1, b, f1, f2, f3, i1))), ((com.google.android.m4b.maps.bi.c) (null)));
        return Math.max(Math.min(c1.b + f1, a), 2.0F);
    }

    public final float a(float f1, int i1)
    {
        com.google.android.m4b.maps.bi.c c1 = c;
        c1 = b.a(new com.google.android.m4b.maps.bi.c(com.google.android.m4b.maps.bo.g.a(c1.a), c1.b + f1, c1.c, c1.d, c1.e));
        a(((com.google.android.m4b.maps.bi.d) (c1)), i1);
        return c1.b;
    }

    public final void a()
    {
        b.a = 67.5F;
    }

    public final void a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.bi.c c1 = c;
        float f2 = c1.c;
        a(((com.google.android.m4b.maps.bi.d) (b.a(new com.google.android.m4b.maps.bi.c(com.google.android.m4b.maps.bo.g.a(c1.a), c1.b, f2 + f1, c1.d, c1.e)))), 0);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(float f1, float f2)
    {
        this;
        JVM INSTR monitorenter ;
        if (!(j instanceof d)) goto _L2; else goto _L1
_L1:
        ((d)j).a(0.0F, 0.0F, 0.0F, 0.0F, f1, f2);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d d1 = new d(j.b(), b);
        d1.a(0.0F, 0.0F, 0.0F, 0.0F, f1, f2);
        a(((com.google.android.m4b.maps.bi.d) (d1)), ((com.google.android.m4b.maps.bi.c) (null)));
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(com.google.android.m4b.maps.bi.d d1, int i1, int j1)
    {
        if (!q && j.equals(d1))
        {
            n.a(c);
            return;
        }
        if (q)
        {
            i1 = 0;
            j1 = 0;
        }
        q = false;
        com.google.android.m4b.maps.bi.c c1 = c;
        com.google.android.m4b.maps.bi.c c2 = d1.b().a(c1);
        d = c2.b;
        float f1 = Math.abs(c2.b - c1.b);
        int k1 = 0x40000000 >> Math.min(Math.round((c2.b + c1.b) * 0.5F), 30);
        float f2 = com.google.android.m4b.maps.bo.g.a(c2.a).c(com.google.android.m4b.maps.bo.g.a(c1.a));
        float f3 = f2 / (float)k1;
        boolean flag;
        if (f3 <= (float)r)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (i1 == 0)
            {
                a(d1, ((com.google.android.m4b.maps.bi.c) (null)));
                return;
            }
            if (i1 == -1)
            {
                i1 = (int)(((Math.min(f1, 8F) / 8F) * 0.75F + 1.5F) * 700F);
            }
            a(((com.google.android.m4b.maps.bi.d) (new a(c1, d1, i1, true, 0.0F))), ((com.google.android.m4b.maps.bi.c) (null)));
            return;
        }
        if (j1 == 0)
        {
            a(d1, ((com.google.android.m4b.maps.bi.c) (null)));
            return;
        }
        if (j1 == -1)
        {
            i1 = (int)((float)Math.min((int)((((f3 - (float)r) / (1.073742E+09F / (float)k1 - (float)r)) * 4.1F + 1.4F) * 700F), 2500) * s);
        } else
        {
            i1 = j1;
        }
        a(((com.google.android.m4b.maps.bi.d) (new a(c1, d1, i1, false, (float)Math.pow(2D, Math.log(f2) * (double)f * 2.3900000000000001D - 58.710000000000001D)))), c2);
    }

    public final void a(com.google.android.m4b.maps.bi.e.a a1)
    {
        b.b = a1;
    }

    public final void a(com.google.android.m4b.maps.bx.e e1)
    {
        this;
        JVM INSTR monitorenter ;
        n = e1;
        this;
        JVM INSTR monitorexit ;
        return;
        e1;
        throw e1;
    }

    public final void a(j j1)
    {
        m = j1;
        q = true;
    }

    public final void a(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        p = e1;
        this;
        JVM INSTR monitorexit ;
        return;
        e1;
        throw e1;
    }

    public final void a(z z1)
    {
        this;
        JVM INSTR monitorenter ;
        o = z1;
        this;
        JVM INSTR monitorexit ;
        return;
        z1;
        throw z1;
    }

    public final float b(float f1, float f2, float f3)
    {
        this;
        JVM INSTR monitorenter ;
        if (!(j instanceof d)) goto _L2; else goto _L1
_L1:
        f1 = ((d)j).a(0.0F, f3, f1, f2, 0.0F, 0.0F)[1];
_L4:
        this;
        JVM INSTR monitorexit ;
        return f1;
_L2:
        d d1 = new d(c, b);
        a(d1, ((com.google.android.m4b.maps.bi.c) (null)));
        f1 = d1.a(0.0F, f3, f1, f2, 0.0F, 0.0F)[1];
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final int b(com.google.android.m4b.maps.bi.b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!(j instanceof f)) goto _L2; else goto _L1
_L1:
        int l1;
        f f1 = (f)j;
        int i1 = f1.a();
        j = f1.a(b1);
        c = b.a(j.b());
        notifyAll();
        l1 = f1.a() | i1;
_L3:
        b1.a(c);
        if (!l || l1 != 0)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        if (n != null)
        {
            n.a(c);
        }
        l = false;
        if (o != null)
        {
            o.b(c);
        }
        this;
        JVM INSTR monitorexit ;
        if ((l1 & 2) == 0 && e != null)
        {
            q q1 = e;
            g g3 = com.google.android.m4b.maps.bo.g.a(b1.d);
            int j2 = Math.max(0, Math.min(30, Math.round(b1.b.b)));
            if (j2 != q1.b)
            {
                q1.a(g3, g3, j2, b1.h().c);
            } else
            if (!q1.a.equals(g3))
            {
                g g4 = q1.a;
                g g1 = null;
                g g2 = com.google.android.m4b.maps.bo.g.a(b1.d);
                int k1 = (int)((float)(g2.a - g4.a) / b1.g());
                int k2 = (int)((float)(g2.b - g4.b) / b1.g());
                int j1 = b1.h;
                int i2 = b1.i;
                int i3 = j1 / 2;
                int l2 = i2 / 2;
                if (Math.abs(k1) > j1 || Math.abs(k2) > i2)
                {
                    g1 = g2;
                } else
                {
                    if (k1 < -i3)
                    {
                        j1 = -j1;
                    } else
                    if (k1 <= i3)
                    {
                        j1 = 0;
                    }
                    k1 = 0;
                    if (k2 < -l2)
                    {
                        k1 = -i2;
                    } else
                    if (k2 > l2)
                    {
                        k1 = i2;
                    }
                    if (k1 != 0 || j1 != 0)
                    {
                        j1 = (int)((float)j1 * b1.g());
                        k1 = (int)((float)k1 * b1.g());
                        q1.c.d(j1, k1);
                        g1 = g4.e(q1.c);
                    }
                }
                if (g1 != null && (q1.a == null || g3.d(g1) < g3.d(q1.a)))
                {
                    q1.a(g1, g3, j2, b1.h().c);
                    return l1;
                }
            }
        }
        return l1;
_L2:
        j = b.a(j.b());
        c = j.b();
        k = false;
        notifyAll();
        l1 = 0;
          goto _L3
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final void b(float f1, float f2)
    {
        this;
        JVM INSTR monitorenter ;
        if (!(j instanceof b))
        {
            a(new b(j.b(), b), ((com.google.android.m4b.maps.bi.c) (null)));
        }
        ((b)j).a(f1, f2);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final com.google.android.m4b.maps.bi.c h()
    {
        return i;
    }

}
