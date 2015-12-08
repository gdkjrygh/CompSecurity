// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import android.graphics.Paint;
import com.google.android.m4b.maps.bb.e;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.h;
import com.google.android.m4b.maps.bn.f;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bo.bk;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.i;
import com.google.android.m4b.maps.bo.j;
import com.google.android.m4b.maps.bo.n;
import com.google.android.m4b.maps.bo.s;
import com.google.android.m4b.maps.bo.t;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.ai;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            h

public final class k extends com.google.android.m4b.maps.cc.h
{
    static final class a
    {

        g a;
        float b;
        float c;
        float d;
        float e;
        float f;

        private a(g g1, g g2, float f1)
        {
            a = g1.a(g2, 0.5F);
            b = g1.c(g2) * 0.5F;
            c = f1;
            d = i.b(g1, g2);
        }

        a(g g1, g g2, float f1, byte byte0)
        {
            this(g1, g2, f1);
        }
    }


    private final float A;
    private final float B;
    private int C;
    private int D;
    private float E;
    private final int F;
    private boolean G;
    private int H;
    private boolean I;
    private final String J;
    private final float K;
    private final float L[] = new float[8];
    private final String a;
    private final com.google.android.m4b.maps.bx.a m;
    private final com.google.android.m4b.maps.bo.k n;
    private com.google.android.m4b.maps.bo.k o;
    private final float p;
    private j q;
    private a r[];
    private final com.google.android.m4b.maps.bx.k s;
    private com.google.android.m4b.maps.bm.j t;
    private com.google.android.m4b.maps.bn.g u;
    private com.google.android.m4b.maps.bn.g v;
    private boolean w;
    private com.google.android.m4b.maps.bn.g x;
    private e y;
    private final float z;

    private k(bb bb1, com.google.android.m4b.maps.br.b b1, String s1, t t1, int l, int i1, boolean flag, 
            float f1, int j1, com.google.android.m4b.maps.bo.k k1, float f2, float f3, com.google.android.m4b.maps.bx.a a1, float f4, 
            com.google.android.m4b.maps.bx.k k2, boolean flag1)
    {
        super(bb1, b1, t1, -1F, -1F, l, flag, flag1);
        w = false;
        a = s1;
        bb1 = String.valueOf(a);
        if (bb1.length() != 0)
        {
            bb1 = "L".concat(bb1);
        } else
        {
            bb1 = new String("L");
        }
        J = bb1;
        n = k1;
        p = f4 * f1;
        F = i1;
        s = k2;
        z = f1;
        A = f2;
        B = f3;
        m = a1;
        I = false;
        D = j1;
        H = 0;
        K = f4 * f2;
    }

    private static int a(float f1, float af[], int l)
    {
        float f2;
        float f3;
        int i1;
        f3 = f1 - af[l];
        f2 = f3;
        i1 = l;
        if (f3 > 0.0F) goto _L2; else goto _L1
_L1:
        return l;
_L4:
        i1++;
        f2 = f3;
_L2:
        if (f2 <= 0.0F || i1 >= af.length - 1)
        {
            break; /* Loop/switch isn't completed */
        }
        f3 = f1 - af[i1 + 1];
        if (f3 > 0.0F) goto _L4; else goto _L3
_L3:
        l = i1;
        if (-f3 < f2)
        {
            return i1 + 1;
        }
        if (true) goto _L1; else goto _L5
_L5:
        return af.length - 1;
    }

    private static com.google.android.m4b.maps.bo.k a(com.google.android.m4b.maps.bo.k k1, float f1, float f2)
    {
        g g1;
        g g2;
        g g3;
        Object obj;
        int l;
        int i1;
        int j1;
        obj = (h)ai.b.get();
        g1 = ((h) (obj)).g;
        g2 = ((h) (obj)).h;
        g3 = ((h) (obj)).i;
        obj = ((h) (obj)).j;
        i1 = 0;
        j1 = k1.a.length / 3 - 1;
        l = 0;
        float f3 = f2;
        f2 = f1;
        f1 = f3;
_L8:
        boolean flag1 = i1;
        if (l >= j1) goto _L2; else goto _L1
_L1:
        float f4;
        f4 = k1.b(l);
        f2 -= f4;
        if (f2 > 1E-04F) goto _L4; else goto _L3
_L3:
        flag1 = i1;
        if (f2 < -1E-04F)
        {
            flag1 = true;
            f2 /= f4;
            k1.a(l, ((g) (obj)));
            k1.a(l + 1, g3);
            g.a(((g) (obj)), g3, f2 + 1.0F, g1);
        }
_L2:
        int ai1[];
        boolean flag;
        int i2;
        i1 = l;
        break MISSING_BLOCK_LABEL_143;
_L4:
        f1 -= f4;
        l++;
        continue; /* Loop/switch isn't completed */
        do
        {
            if (i1 >= j1)
            {
                break MISSING_BLOCK_LABEL_372;
            }
            f2 = k1.b(i1);
            f1 -= f2;
            int l1;
            int j2;
            if (f1 <= 1E-04F)
            {
                if (f1 >= 1E-04F)
                {
                    break MISSING_BLOCK_LABEL_372;
                }
                f1 /= f2;
                k1.a(i1, ((g) (obj)));
                k1.a(i1 + 1, g3);
                g.a(((g) (obj)), g3, 1.0F + f1, g2);
                flag = true;
                break MISSING_BLOCK_LABEL_212;
            }
            i1++;
        } while (true);
_L6:
        j2 = l + 1;
        if (flag1)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (flag)
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        ai1 = new int[(i2 + ((i1 - j2) + 1 + l)) * 3];
        if (flag1)
        {
            l = 1;
            g1.a(ai1, 0);
        } else
        {
            l = 0;
        }
        for (l1 = j2; l1 <= i1;)
        {
            k1.a(l1, g3);
            g3.a(ai1, l);
            l1++;
            l++;
        }

        if (flag)
        {
            g2.a(ai1, l);
        }
        return com.google.android.m4b.maps.bo.k.a(ai1);
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static k a(bb bb1, com.google.android.m4b.maps.br.b b1, bk bk1, com.google.android.m4b.maps.bo.k k1, int l, boolean flag, float f1, float f2, 
            com.google.android.m4b.maps.bx.a a1, b b2, com.google.android.m4b.maps.bx.k k2, boolean flag1)
    {
        float f3;
        Object obj;
        int i1;
        f3 = b2.g();
        if (k1.a.length / 3 > 2)
        {
            k1 = k1.b(f1 * f3 * 0.2F);
        }
        obj = bb1.d();
        i1 = 0;
_L10:
        t t1 = ((t) (obj));
        if (i1 >= bk1.a()) goto _L2; else goto _L1
_L1:
        if (!com.google.android.m4b.maps.bo.bk.a.a(bk1.a(i1).a)) goto _L4; else goto _L3
_L3:
        t1 = bk1.a(i1).e;
_L2:
        float f4;
        float f5;
        obj = bk1.b;
        if (t1 != null)
        {
            bk1 = t1.d;
        } else
        {
            bk1 = null;
        }
        k2.a(a1, bk1);
        k2.a.setTextSize(f1);
        f4 = k2.a.measureText(((String) (obj)));
        f5 = b2.a(1.0F + f4, b2.e);
        if (f4 != 0.0F) goto _L6; else goto _L5
_L5:
        bb1 = null;
_L8:
        return bb1;
_L4:
        i1++;
        continue; /* Loop/switch isn't completed */
_L6:
        if (f5 > k1.c())
        {
            return null;
        }
        b1 = new k(bb1, b1, ((String) (obj)), t1, bb1.e(), l, flag, f3, (int)b2.b.d, k1, f1, f2, a1, f4, k2, flag1);
        bb1 = b1;
        if (b1.c()) goto _L8; else goto _L7
_L7:
        return null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private boolean c()
    {
_L19:
        int i1;
        if (H >= 6)
        {
            break; /* Loop/switch isn't completed */
        }
        if (H > 1 && n.c() < p * 2.0F)
        {
            return false;
        }
        if (H > 3 && n.c() < p * 3F)
        {
            return false;
        }
        i1 = n.a.length / 3;
        if (H != 0) goto _L2; else goto _L1
_L1:
        int l = 0;
_L11:
        if (l >= i1 - 1) goto _L4; else goto _L3
_L3:
        float f1 = n.b(l);
        if (f1 <= p) goto _L6; else goto _L5
_L5:
        Object obj;
        Object obj3 = (h)ai.b.get();
        obj = ((h) (obj3)).a;
        g g1 = ((h) (obj3)).b;
        g g2 = ((h) (obj3)).c;
        obj3 = ((h) (obj3)).d;
        n.a(l, g2);
        n.a(l + 1, ((g) (obj3)));
        f1 = (f1 - p) / f1;
        g.a(g2, ((g) (obj3)), f1 * 0.25F, ((g) (obj)));
        g.a(((g) (obj3)), g2, f1 * 0.75F, g1);
        obj = com.google.android.m4b.maps.bo.k.a(((g) (obj)), g1);
_L17:
        Object obj1;
        l = ((com.google.android.m4b.maps.bo.k) (obj)).a.length / 3;
        obj1 = obj;
        if (l <= 2) goto _L8; else goto _L7
_L7:
        if ((l - 1) * 3 <= a.length()) goto _L10; else goto _L9
_L9:
        obj1 = null;
          goto _L8
_L6:
        l++;
          goto _L11
_L4:
        H = 1;
_L2:
        f2 = n.c();
        switch (H)
        {
        default:
            obj = null;
            break;

        case 1: // '\001'
            f2 = (f2 - p) * 0.25F;
            float f3 = p;
            obj = a(n, f2, f3 + f2);
            break;

        case 2: // '\002'
            f2 = Math.min(z * 2.0F * A, f2 - p);
            float f4 = p;
            obj = a(n, f2, f4 + f2);
            break;

        case 3: // '\003'
            f2 = Math.max(0.0F, f2 - p - z * 2.0F * A);
            float f5 = p;
            obj = a(n, f2, f5 + f2);
            break;

        case 4: // '\004'
            f2 = (f2 - p) * 0.33F;
            float f6 = p;
            obj = a(n, f2, f6 + f2);
            break;

        case 5: // '\005'
            f2 = (f2 - p) * 0.67F;
            float f7 = p;
            obj = a(n, f2, f7 + f2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        j1 = ((com.google.android.m4b.maps.bo.k) (obj)).a.length / 3 - 1;
        if (j1 < 2)
        {
            break MISSING_BLOCK_LABEL_800;
        }
        f2 = ((com.google.android.m4b.maps.bo.k) (obj)).d(0);
        l = 1;
_L14:
        if (l >= j1)
        {
            break MISSING_BLOCK_LABEL_800;
        }
        f8 = Math.abs(((com.google.android.m4b.maps.bo.k) (obj)).d(l) - f2);
        if (f8 <= 60F || f8 >= 300F) goto _L13; else goto _L12
_L12:
        l = 1;
_L15:
        obj1 = obj;
        if (l != 0)
        {
            obj1 = null;
        }
          goto _L8
_L13:
        l++;
          goto _L14
        l = 0;
          goto _L15
_L8:
        o = ((com.google.android.m4b.maps.bo.k) (obj1));
        if (o == null)
        {
            break MISSING_BLOCK_LABEL_876;
        }
        float f2 = B;
        Object obj4 = (h)ai.b.get();
        obj = ((h) (obj4)).a;
        obj1 = ((h) (obj4)).b;
        Object obj2 = ((h) (obj4)).c;
        obj4 = ((h) (obj4)).d;
        int j1 = o.a.length / 3;
        f2 = (z * A * f2) / 2.0F;
        g ag[] = new g[j1 * 2];
        o.a(0, ((g) (obj4)));
        float f8;
        for (l = 1; l < j1; l++)
        {
            o.a(l, ((g) (obj2)));
            g.b(((g) (obj2)), ((g) (obj4)), ((g) (obj)));
            i.a(((g) (obj)), f2, ((g) (obj1)));
            ag[l] = ((g) (obj2)).f(((g) (obj1)));
            ag[j1 * 2 - l - 1] = ((g) (obj2)).e(((g) (obj1)));
            if (l == 1)
            {
                ag[0] = ((g) (obj4)).f(((g) (obj1)));
                ag[j1 * 2 - 1] = ((g) (obj4)).e(((g) (obj1)));
            }
            ((g) (obj4)).b(((g) (obj2)));
        }

        q = new j(ag);
        obj = o;
        obj2 = (h)ai.b.get();
        obj1 = ((h) (obj2)).a;
        obj2 = ((h) (obj2)).b;
        ((com.google.android.m4b.maps.bo.k) (obj)).a(0, ((g) (obj1)));
        ((com.google.android.m4b.maps.bo.k) (obj)).a(((g) (obj2)));
        C = (int)i.b(((g) (obj1)), ((g) (obj2)));
        return true;
        if (true) goto _L17; else goto _L16
_L16:
        H = H + 1;
        if (true) goto _L19; else goto _L18
_L18:
        return false;
    }

    public final void a(d d1, b b1, ab ab1)
    {
        if (I) goto _L2; else goto _L1
_L1:
        Object obj;
        t t1;
        int l;
        int i1;
        obj = ab1.a;
        i1 = a(c, ((com.google.android.m4b.maps.bx.i) (obj)));
        t1 = c;
        if (b.a() == 2)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (l == 0 || obj != com.google.android.m4b.maps.bx.i.a || t1.b() <= 0 || t1.b() > 2) goto _L4; else goto _L3
_L3:
        l = t1.b();
        l = t1.c[l - 1].a;
        if (com.google.android.m4b.maps.bm.c.a(l) < 128) goto _L4; else goto _L5
_L5:
        if (c != null)
        {
            obj = c.d;
        } else
        {
            obj = null;
        }
        t = s.a(a, m, ((com.google.android.m4b.maps.bo.z) (obj)), A, i1, l, 0);
        if (t != null) goto _L7; else goto _L6
_L6:
        if (d1.a(10000)) goto _L9; else goto _L8
_L8:
        l = 0;
_L13:
        if (l != 0) goto _L2; else goto _L10
_L10:
        return;
_L4:
        l = com.google.android.m4b.maps.cc.h.b(t1, ((com.google.android.m4b.maps.bx.i) (obj)));
          goto _L5
_L9:
        t = s.a(d1, a, m, ((com.google.android.m4b.maps.bo.z) (obj)), A, i1, l, 0);
_L7:
        float f1 = ((float)t.a * z * 0.5F) / 1.5F;
        float f4;
        if (o.a.length / 3 == 2)
        {
            Object obj1 = (h)ai.b.get();
            obj = ((h) (obj1)).a;
            obj1 = ((h) (obj1)).b;
            o.a(0, ((g) (obj)));
            o.a(1, ((g) (obj1)));
            r = new a[1];
            r[0] = new a(((g) (obj)), ((g) (obj1)), f1, (byte)0);
            f1 = t.f;
            float f3 = t.g;
            r[0].e = f1;
            r[0].f = f3;
        } else
        {
            Object obj5 = o;
            Object obj2 = (h)ai.b.get();
            obj = ((h) (obj2)).a;
            obj2 = ((h) (obj2)).b;
            int j2 = ((com.google.android.m4b.maps.bo.k) (obj5)).a.length / 3;
            int j1 = j2 - 1;
            l = j1 * 4;
            u = new com.google.android.m4b.maps.bn.i(l, (byte)0);
            v = new com.google.android.m4b.maps.bn.i(l, (byte)0);
            r = new a[j1];
            float af2[] = new float[j2];
            af2[0] = 0.0F;
            ((com.google.android.m4b.maps.bo.k) (obj5)).a(0, ((g) (obj)));
            l = 0;
            do
            {
                g g1 = ((g) (obj2));
                if (l >= j1)
                {
                    break;
                }
                ((com.google.android.m4b.maps.bo.k) (obj5)).a(l + 1, g1);
                r[l] = new a(((g) (obj)), g1, f1, (byte)0);
                af2[l + 1] = ((g) (obj)).c(g1) + af2[l];
                l++;
                obj2 = obj;
                obj = g1;
            } while (true);
            com.google.android.m4b.maps.bx.k k1 = s;
            obj5 = a;
            com.google.android.m4b.maps.bx.a a1 = m;
            float af1[];
            if (c != null)
            {
                obj = c.d;
            } else
            {
                obj = null;
            }
            f1 = A;
            af1 = new float[((String) (obj5)).length() + 1];
            if (af1.length != 0)
            {
                k1.a(a1, ((com.google.android.m4b.maps.bo.z) (obj)));
                k1.a.setTextSize(f1);
                k1.a.getTextWidths(((String) (obj5)), af1);
                f1 = k1.c;
                for (l = 0; l < af1.length;)
                {
                    float f5 = af1[l];
                    af1[l] = f1;
                    l++;
                    f1 = f5 + f1;
                }

                af1[0] = af1[0] - k1.c;
                l = af1.length - 1;
                af1[l] = af1[l] + k1.c;
            }
            f1 = 1.0F / af1[af1.length - 1];
            for (l = 0; l < af1.length; l++)
            {
                af1[l] = af1[l] * f1;
            }

            f1 = 1.0F / af2[af2.length - 1];
            float af[] = new float[j2];
            for (l = 0; l < j2; l++)
            {
                af2[l] = af2[l] * f1;
                af[j2 - 1 - l] = 1.0F - af2[l];
            }

            int i2 = 0;
            j1 = 0;
            for (l = 0; l < j2; l++)
            {
                i2 = a(af2[l], af1, i2);
                af2[l] = af1[i2];
                j1 = a(af[l], af1, j1);
                af[l] = af1[j1];
            }

            f1 = t.f;
            float f6 = t.g;
            l = 0;
            while (l < j2) 
            {
                float f8 = af2[l] * f1;
                float f10 = af[j2 - l - 1] * f1;
                u.a(f8, 0.0F);
                u.a(f8, f6);
                v.a(f10, f6);
                v.a(f10, 0.0F);
                if (l > 0)
                {
                    r[l - 1].e = f8;
                    r[l - 1].f = f6;
                }
                l++;
            }
        }
        if (r.length <= 1) goto _L12; else goto _L11
_L11:
        f1 = r[0].d;
        l = 1;
_L14:
        if (l < r.length)
        {
            f4 = Math.abs(r[l].d - f1);
            if (f4 <= 30F || f4 >= 330F)
            {
                break MISSING_BLOCK_LABEL_1189;
            }
            G = true;
        }
_L12:
        if (i)
        {
            y = new e(com.google.android.m4b.maps.bb.e.a.a);
        }
        I = true;
        l = 1;
          goto _L13
        l++;
          goto _L14
_L2:
        if (ab1.b != 0 || r.length <= 0) goto _L10; else goto _L15
_L15:
        float f2;
        af = d1.a;
        d1.c();
        float f7;
        float f9;
        float f11;
        Object obj3;
        boolean flag;
        if (r.length == 1)
        {
            d1.q.a(d1);
        } else
        {
            d1.t.d(d1);
        }
        t.a(af);
        if (y != null)
        {
            int l1 = y.a(d1);
            l = l1;
            if (l1 == 0x10000)
            {
                y = null;
                l = l1;
            }
        } else
        {
            l = this.l;
        }
        d1.a.glColor4x(l, l, l, l);
        if (x != null && b1.b.c <= 0.0F && b1.b.d <= 0.0F)
        {
            break MISSING_BLOCK_LABEL_2152;
        }
        obj3 = (h)ai.b.get();
        ab1 = ((h) (obj3)).a;
        obj3 = ((h) (obj3)).b;
        o.a(0, ab1);
        o.a(((g) (obj3)));
        b1.a(ab1, L);
        f2 = L[0];
        f7 = L[1];
        b1.a(((g) (obj3)), L);
        ab1 = L;
        ab1[0] = ab1[0] - f2;
        ab1 = L;
        ab1[1] = ab1[1] - f7;
        f2 = L[0];
        f9 = L[1];
        f11 = (float)Math.sqrt(f2 * f2 + f9 * f9);
        if (f2 >= 0.0F)
        {
            f2 = 1.0F;
        } else
        {
            f2 = -1F;
        }
        if (f9 >= 0.0F)
        {
            f7 = 1.0F;
        } else
        {
            f7 = -1F;
        }
        f2 = (1.0F - (f9 * f7) / f11) * f2;
        if (x == null)
        {
            GL10 gl10;
            g g2;
            Object obj4;
            if (f7 > 0.0F)
            {
                ab1 = v;
            } else
            {
                ab1 = u;
            }
            x = ab1;
            if (f7 > 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            w = flag;
        }
        if (x == v)
        {
            if (f2 < 0.001F)
            {
                ab1 = v;
            } else
            {
                ab1 = u;
            }
            x = ab1;
            if (f2 < 0.001F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            w = flag;
        } else
        {
            boolean flag1;
            if (f2 < -0.001F)
            {
                ab1 = v;
            } else
            {
                ab1 = u;
            }
            x = ab1;
            if (f2 < -0.001F)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            w = flag1;
        }
        if (G || f2 <= 0.75F && f2 >= -0.75F)
        {
            break MISSING_BLOCK_LABEL_2152;
        }
        f2 = b1.b.c * f2;
_L16:
        l = 0;
        while (l < r.length) 
        {
            if (r.length == 1)
            {
                af.glMatrixMode(5890);
                af.glLoadIdentity();
                if (w)
                {
                    af.glTranslatef(r[l].e / 2.0F, r[l].f / 2.0F, 0.0F);
                    af.glRotatef(180F, 0.0F, 0.0F, 1.0F);
                    af.glTranslatef(-r[l].e / 2.0F, -r[l].f / 2.0F, 0.0F);
                }
                af.glScalef(r[l].e, r[l].f, 1.0F);
                af.glMatrixMode(5888);
            } else
            {
                x.a(d1, l * 2);
            }
            af.glPushMatrix();
            ab1 = r[l];
            gl10 = d1.a;
            obj4 = (h)ai.b.get();
            g2 = ((h) (obj4)).a;
            obj4 = ((h) (obj4)).b;
            b1.a(((g) (obj4)));
            g.b(((a) (ab1)).a, ((g) (obj4)), g2);
            f7 = b1.f();
            gl10.glTranslatef((float)g2.a * f7, (float)g2.b * f7, (float)g2.c * f7);
            gl10.glRotatef(90F - ((a) (ab1)).d, 0.0F, 0.0F, 1.0F);
            if (f2 != 0.0F)
            {
                gl10.glRotatef(f2, 1.0F, 0.0F, 0.0F);
            }
            gl10.glScalef(((a) (ab1)).b * f7, f7 * ((a) (ab1)).c, 1.0F);
            gl10.glDrawArrays(5, 0, 4);
            af.glPopMatrix();
            l++;
        }
        if (r.length == 1)
        {
            af.glMatrixMode(5890);
            af.glLoadIdentity();
            af.glMatrixMode(5888);
            return;
        }
          goto _L10
        f2 = 0.0F;
          goto _L16
    }

    public final boolean a(b b1, d d1)
    {
        float f1 = b1.g() / z;
        boolean flag;
        if (super.j && k)
        {
            if (f1 >= 0.25F && f1 <= 2.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = a(f1);
        } else
        {
            if (f1 >= 0.9F && f1 <= 1.25F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = 0x10000;
        }
        if (flag)
        {
            D = (int)b1.b.d;
            E = b1.b.c;
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(as as1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (as1.a(o.a(0)))
        {
            flag = flag1;
            if (as1.a(o.b()))
            {
                flag = true;
            }
        }
        return flag;
    }

    public final void b(d d1)
    {
        super.b(d1);
        if (t != null)
        {
            t.c();
            t = null;
        }
        if (u != null)
        {
            u.b(d1);
            v.b(d1);
        }
    }

    public final boolean b(b b1, d d1)
    {
        H = H + 1;
        return c();
    }

    public final void c(d d1)
    {
        super.c(d1);
        if (u != null)
        {
            u.c(d1);
            v.c(d1);
        }
    }

    public final float n()
    {
        return K;
    }

    public final n o()
    {
        return q;
    }

    public final int q()
    {
        int i1 = 0;
        int j1 = g;
        int l;
        if (H == 0)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (E >= 30F)
        {
            i1 = Math.abs(D - C);
            float f1 = F;
            i1 = (int)(Math.abs((float)Math.sin((float)i1 * 0.01745329F)) * f1);
        }
        return l + j1 + i1;
    }

    public final String r()
    {
        return J;
    }
}
