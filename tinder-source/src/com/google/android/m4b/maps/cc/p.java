// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.f;
import com.google.android.m4b.maps.bm.j;
import com.google.android.m4b.maps.bn.a;
import com.google.android.m4b.maps.bn.b;
import com.google.android.m4b.maps.bn.e;
import com.google.android.m4b.maps.bn.h;
import com.google.android.m4b.maps.bn.i;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bn.m;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.s;
import com.google.android.m4b.maps.bo.t;
import com.google.android.m4b.maps.bx.ab;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            d

public final class p extends com.google.android.m4b.maps.cc.d
{
    static final class a
    {

        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        Boolean i;

        a()
        {
        }
    }

    static final class b
    {

        boolean a;
        boolean b;
        float c;
        int d;
        int e;
        int f;
        int g;

        public final String toString()
        {
            String s1 = String.valueOf("RoadAttributes{draw?=");
            boolean flag = a;
            boolean flag1 = b;
            float f1 = c;
            String s2 = String.valueOf(Integer.toHexString(d));
            String s3 = String.valueOf(Integer.toHexString(e));
            String s4 = String.valueOf(Integer.toHexString(f));
            String s5 = String.valueOf(Integer.toHexString(g));
            return (new StringBuilder(String.valueOf(s1).length() + 97 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length())).append(s1).append(flag).append(", renderAsLine?=").append(flag1).append(", width=").append(f1).append(", outline=").append(s2).append(", fill=").append(s3).append(", highlight=").append(s4).append(", dashedHighlight=").append(s5).append("}").toString();
        }

        b()
        {
        }
    }


    private static final float d[] = {
        0.7176471F, 0.7176471F, 0.8980392F, 1.0F
    };
    private static final float e = (float)(1.0D / Math.sqrt(2D));
    private final g A = new g();
    private final ArrayList B = new ArrayList();
    private final ArrayList C = new ArrayList();
    private boolean D;
    private float E;
    private float F;
    final k c;
    private final ac f;
    private final float g[];
    private final f h = null;
    private final f i = null;
    private final com.google.android.m4b.maps.bn.g j;
    private final com.google.android.m4b.maps.bn.a k;
    private final com.google.android.m4b.maps.bn.a l;
    private final com.google.android.m4b.maps.bn.c m;
    private final com.google.android.m4b.maps.bn.a n;
    private final k o;
    private final com.google.android.m4b.maps.bn.g p;
    private final com.google.android.m4b.maps.bn.c q;
    private final com.google.android.m4b.maps.bn.a r;
    private final k s;
    private final com.google.android.m4b.maps.bm.b t;
    private final com.google.android.m4b.maps.bn.c u;
    private final com.google.android.m4b.maps.bn.c v;
    private final k w;
    private final com.google.android.m4b.maps.bn.g x;
    private final com.google.android.m4b.maps.bn.c y;
    private com.google.android.m4b.maps.bb.e z;

    private p(ac ac1, a a1, HashSet hashset, d d1, int i1)
    {
        super(hashset);
        D = false;
        f = ac1;
        g = (new float[] {
            (float)(i1 >>> 16 & 0xff) / 255F, (float)(i1 >>> 8 & 0xff) / 255F, (float)(i1 & 0xff) / 255F, (float)(i1 >>> 24 & 0xff) / 255F
        });
        c = new m(a1.a, (byte)0);
        j = new i(a1.a, (byte)0);
        l = new com.google.android.m4b.maps.bn.b(a1.a, (byte)0);
        k = new com.google.android.m4b.maps.bn.b(a1.a, (byte)0);
        m = new e(a1.b, (byte)0);
        if (a1.i == Boolean.TRUE)
        {
            n = new com.google.android.m4b.maps.bn.b(a1.a);
        } else
        {
            n = null;
        }
        if (a1.c > 0)
        {
            s = new m(a1.c);
            t = new com.google.android.m4b.maps.bm.b(a1.c, d1.A);
            u = new e(a1.d);
            v = new e(a1.b);
        } else
        {
            s = null;
            t = null;
            u = null;
            v = null;
        }
        if (a1.e > 0)
        {
            w = new m(a1.e);
            x = new i(a1.e);
            y = new e(a1.f);
        } else
        {
            w = null;
            x = null;
            y = null;
        }
        E = -1F;
        if (a1.g > 0)
        {
            o = new m(a1.g);
            p = new i(a1.g);
            q = new e(a1.h);
            r = new com.google.android.m4b.maps.bn.b(a1.g);
        } else
        {
            o = null;
            p = null;
            q = null;
            r = null;
        }
        F = -1F;
    }

    private static float a(float f1)
    {
        int i1 = (int)f1;
        if (f1 - (float)i1 > 0.5F)
        {
            f1 = e;
        } else
        {
            f1 = 1.0F;
        }
        return (f1 * (float)(1 << 30 - i1)) / 256F;
    }

    private float a(float f1, int i1)
    {
        float f2;
        if (f.a > 14)
        {
            f2 = 0.5F;
        } else
        {
            f2 = 0.3F;
        }
        return f2 * (((float)i1 * f1) / 256F);
    }

    private static float a(t t1)
    {
        float f1;
        float f2;
        f1 = 0.0F;
        f2 = 0.0F;
        if (t1.b() != 0) goto _L2; else goto _L1
_L1:
        return f2;
_L2:
        int i1 = 0;
        do
        {
            f2 = f1;
            if (i1 >= t1.b())
            {
                continue;
            }
            f1 = Math.max(f1, t1.c[i1].b);
            i1++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static int a(com.google.android.m4b.maps.bi.b b1, com.google.android.m4b.maps.bx.i i1)
    {
        int k1;
label0:
        {
            k1 = 0;
            float f1 = b1.b.b;
            if (i1 != com.google.android.m4b.maps.bx.i.b || f1 <= 17.5F)
            {
                k1 = 32;
            }
            int j1 = k1;
            if (i1 == com.google.android.m4b.maps.bx.i.a)
            {
                j1 = k1 | 0x14;
            }
            k1 = j1;
            if (f1 < 15.5F)
            {
                break label0;
            }
            if (i1 != com.google.android.m4b.maps.bx.i.a)
            {
                k1 = j1;
                if (i1 != com.google.android.m4b.maps.bx.i.c)
                {
                    break label0;
                }
            }
            k1 = j1 | 0x40;
        }
        return k1 | 0x180;
    }

    public static p a(ac ac1, String as[], com.google.android.m4b.maps.bo.ap.b b1, d d1)
    {
        com.google.android.m4b.maps.bo.m m1;
        b b2;
        Object obj;
        HashSet hashset;
        a a1;
        int j1;
        int j2;
        m1 = ac1.d();
        hashset = new HashSet();
        obj = new ArrayList(512);
        j2 = ac1.a;
        a1 = new a();
        b2 = new b();
        j1 = -1;
_L8:
        com.google.android.m4b.maps.bo.p p1;
        bb bb1;
        int i1;
        int l1;
        l1 = j1;
        if (!b1.hasNext())
        {
            break MISSING_BLOCK_LABEL_255;
        }
        bb1 = b1.a();
        l1 = j1;
        if (!(bb1 instanceof com.google.android.m4b.maps.bo.p))
        {
            break MISSING_BLOCK_LABEL_255;
        }
        p1 = (com.google.android.m4b.maps.bo.p)bb1;
        i1 = j1;
        if (!p1.i()) goto _L2; else goto _L1
_L1:
        if (p1.c.f != null) goto _L4; else goto _L3
_L3:
        i1 = 0xffb7b7e5;
_L2:
        a(p1, b2);
        l1 = i1;
        if (a(j2, p1, b2, a1))
        {
            int ai[] = bb1.f();
            l1 = ai.length;
            for (j1 = 0; j1 < l1; j1++)
            {
                int k2 = ai[j1];
                if (k2 >= 0 && k2 < as.length)
                {
                    hashset.add(as[k2]);
                }
            }

            break MISSING_BLOCK_LABEL_743;
        }
        break MISSING_BLOCK_LABEL_255;
_L4:
        if (j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = p1.c.f.a;
        if (true) goto _L2; else goto _L5
_L5:
        i1 = j1;
        if (j1 == p1.c.f.a) goto _L2; else goto _L6
_L6:
        l1 = j1;
        ac1 = new p(ac1, a1, hashset, d1, l1);
        as = com.google.android.m4b.maps.bm.e.a();
        b1 = ((ArrayList) (obj)).iterator();
        do
        {
            if (!b1.hasNext())
            {
                break;
            }
            d1 = (com.google.android.m4b.maps.bo.p)b1.next();
            a(((com.google.android.m4b.maps.bo.p) (d1)), b2);
            if (b2.a)
            {
                boolean flag2 = false;
                boolean flag4 = false;
                obj = ((com.google.android.m4b.maps.bo.p) (d1)).c;
                boolean flag1 = flag2;
                boolean flag = flag4;
                if (((t) (obj)).b() > 0)
                {
                    obj = ((t) (obj)).c[0];
                    flag1 = flag2;
                    flag = flag4;
                    if (obj != null)
                    {
                        float f1;
                        com.google.android.m4b.maps.bo.k k1;
                        int i2;
                        boolean flag3;
                        if ((((s) (obj)).d & 1) != 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if ((((s) (obj)).d & 2) != 0)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        flag3 = flag;
                        flag = flag1;
                        flag1 = flag3;
                    }
                }
                obj = m1.c();
                i1 = m1.f();
                k1 = ((com.google.android.m4b.maps.bo.p) (d1)).a;
                f1 = ac1.a(b2.c, i1);
                if (b2.e != 0 || b2.d != 0 || b2.f != 0)
                {
                    i2 = ((p) (ac1)).c.a();
                    j1 = ((p) (ac1)).m.b;
                    as.a(k1, f1, ((g) (obj)), i1, ((p) (ac1)).c, ((p) (ac1)).j, ((p) (ac1)).m, flag1, flag);
                    i2 = ((p) (ac1)).c.a() - i2;
                    ((p) (ac1)).k.b(b2.e, i2);
                    ((p) (ac1)).l.b(b2.d, i2);
                    if (((p) (ac1)).n != null && b2.f != 0)
                    {
                        ((p) (ac1)).n.b(b2.f, i2);
                    }
                    if (((p) (ac1)).s != null)
                    {
                        if (b2.b)
                        {
                            ac1.a(k1, ((g) (obj)), i1, b2.d);
                        } else
                        {
                            ((p) (ac1)).v.a(((p) (ac1)).m, j1, ((p) (ac1)).m.b - j1);
                        }
                    }
                }
                if (a(((p) (ac1)).f.a, ((com.google.android.m4b.maps.bo.p) (d1))))
                {
                    as.a(k1, f1, false, ((g) (obj)), i1, 1.0F, ((p) (ac1)).w, ((p) (ac1)).y, null);
                    ((p) (ac1)).B.add(d1);
                }
                if (b2.g != 0)
                {
                    j1 = ((p) (ac1)).o.a();
                    as.a(k1, f1, false, ((g) (obj)), i1, 1.0F, ((p) (ac1)).o, ((p) (ac1)).q, null);
                    i1 = ((p) (ac1)).o.a();
                    ((p) (ac1)).r.b(b2.g, i1 - j1);
                    ((p) (ac1)).C.add(d1);
                }
                ac1.D = com.google.android.m4b.maps.bo.d.a(((com.google.android.m4b.maps.bo.p) (d1)).d, 128);
            }
        } while (true);
        break; /* Loop/switch isn't completed */
        ((ArrayList) (obj)).add(p1);
        b1.next();
        j1 = i1;
        if (true) goto _L8; else goto _L7
_L7:
        return ac1;
    }

    public static void a(d d1)
    {
        GL10 gl10 = d1.a;
        gl10.glBlendFunc(770, 771);
        gl10.glTexEnvx(8960, 8704, 8448);
        d1.c();
        d1.C.a[0].a(gl10);
    }

    public static void a(d d1, float f1, int i1)
    {
        GL10 gl10 = d1.a;
        gl10.glBlendFunc(770, 771);
        gl10.glTexEnvx(8960, 8704, 7681);
        d1.a();
        d1.c();
        f1 -= i1;
        if (f1 >= 4F)
        {
            i1 = 2;
        } else
        if (f1 >= 3F)
        {
            i1 = 3;
        } else
        if (f1 >= 2.25F)
        {
            i1 = 4;
        } else
        if (f1 >= 1.0F && i1 >= 17)
        {
            i1 = 5;
        } else
        {
            i1 = 22;
        }
        d1.C.a[i1].a(gl10);
    }

    public static void a(d d1, float f1, int i1, com.google.android.m4b.maps.bx.i j1)
    {
        GL10 gl10 = d1.a;
        gl10.glBlendFunc(770, 771);
        gl10.glTexEnvx(8960, 8704, 7681);
        d1.a();
        d1.c();
        if (j1 == com.google.android.m4b.maps.bx.i.b)
        {
            if (f1 < 16F)
            {
                i1 = 7;
            } else
            {
                i1 = 21;
            }
        } else
        {
            f1 -= i1;
            if (f1 >= 4F)
            {
                i1 = 1;
            } else
            if (f1 >= 3F)
            {
                i1 = 2;
            } else
            if (f1 >= 2.25F)
            {
                i1 = 3;
            } else
            if (f1 >= 1.0F && i1 >= 17)
            {
                i1 = 4;
            } else
            {
                i1 = 6;
            }
        }
        d1.C.a[i1].a(gl10);
    }

    private void a(com.google.android.m4b.maps.bo.k k1, g g1, int i1, int j1)
    {
        int i2 = s.a();
        int j2 = k1.a.length / 3;
        for (int l1 = 0; l1 < j2; l1++)
        {
            k1.a(l1, A);
            com.google.android.m4b.maps.bo.g.b(A, g1, A);
            s.a(A, i1);
            if (l1 > 0)
            {
                u.a((short)((i2 + l1) - 1), (short)(i2 + l1));
            }
        }

        t.a(j1, j2);
    }

    private static void a(com.google.android.m4b.maps.bo.p p1, b b1)
    {
        t t1;
        boolean flag1;
        flag1 = true;
        t1 = p1.c;
        b1.c = a(t1);
        b1.d = 0;
        b1.e = 0;
        b1.f = 0;
        if (t1.b() < 2) goto _L2; else goto _L1
_L1:
        b1.d = t1.c[0].a;
        b1.e = t1.c[1].a;
        if (t1.b() <= 2) goto _L4; else goto _L3
_L3:
        int i1 = 2;
_L9:
        if (i1 >= t1.b()) goto _L6; else goto _L5
_L5:
        if (t1.c[i1].c.length != 0) goto _L8; else goto _L7
_L7:
        b1.f = t1.c[i1].a;
          goto _L4
_L8:
        i1++;
          goto _L9
_L2:
        if (t1.b() > 0)
        {
            b1.e = t1.c[0].a;
        }
_L4:
        boolean flag;
        b1.g = 0;
        if (t1.b() > 2)
        {
            i1 = 2;
            float f1 = 0.0F;
            while (i1 < t1.b()) 
            {
                float f3;
                if (t1.c[i1].c.length > 0)
                {
                    f3 = t1.c[i1].b;
                    b1.g = t1.c[i1].a;
                } else
                {
                    f3 = f1;
                    if (b1.g != 0)
                    {
                        f3 = f1;
                        if (t1.c[i1].b > f1)
                        {
                            b1.g = 0;
                            f3 = f1;
                        }
                    }
                }
                i1++;
                f1 = f3;
            }
        }
        if (b1.g != 0)
        {
            b1.f = 0;
        }
        if (b1.f != 0 && (com.google.android.m4b.maps.bm.c.a(b1.e) < com.google.android.m4b.maps.bm.c.a(b1.d) || b1.c < 9F))
        {
            b1.e = b1.f;
        }
        if (p1.a.a.length / 3 >= 2 && b1.c != 0.0F && (b1.e != 0 || b1.d != 0 || b1.f != 0 || b1.g != 0 || p1.j()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b1.a = flag;
        if (!com.google.android.m4b.maps.bo.d.a(p1.d, 64) || b1.g != 0 || b1.f != 0) goto _L11; else goto _L10
_L10:
        i1 = b1.e;
        float f2 = i1 >> 16 & 0xff;
        float f4 = i1 >> 8 & 0xff;
        float f5 = i1 & 0xff;
        if (f2 == f4 && f4 == f5)
        {
            f2 = -1F;
        } else
        if (f2 >= f4 && f4 >= f5)
        {
            f2 = ((f4 - f5) * 60F) / (f2 - f5);
        } else
        if (f4 > f2 && f2 >= f5)
        {
            f2 = (2.0F - (f2 - f5) / (f4 - f5)) * 60F;
        } else
        if (f4 >= f5 && f5 > f2)
        {
            f2 = ((f5 - f2) / (f4 - f2) + 2.0F) * 60F;
        } else
        if (f5 > f4 && f4 > f2)
        {
            f2 = (4F - (f4 - f2) / (f5 - f2)) * 60F;
        } else
        if (f5 > f2 && f2 >= f4)
        {
            f2 = ((f2 - f4) / (f5 - f4) + 4F) * 60F;
        } else
        {
            f2 = (6F - (f5 - f4) / (f2 - f4)) * 60F;
        }
        if (f2 >= 80F && f2 <= 160F)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0) goto _L11; else goto _L12
_L12:
        flag = flag1;
_L13:
        b1.b = flag;
        return;
_L11:
        flag = false;
        if (true) goto _L13; else goto _L6
_L6:
        i1 = 2;
          goto _L7
    }

    private static boolean a(int i1, com.google.android.m4b.maps.bo.p p1)
    {
        return i1 >= 14 && p1.i();
    }

    private static boolean a(int i1, com.google.android.m4b.maps.bo.p p1, b b1, a a1)
    {
        int j1 = 0;
        com.google.android.m4b.maps.bo.k k1 = p1.a;
        int l1 = k1.a.length / 3;
        int i2 = l1 - 1;
        if (b1.a)
        {
            int j2 = com.google.android.m4b.maps.bm.e.a(k1);
            if (a1.a > 0 && a1.a + j2 > 16384)
            {
                return false;
            }
            t t1 = p1.c;
            boolean flag;
            if (b1.f != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (a1.i == null)
            {
                a1.i = Boolean.valueOf(flag);
            } else
            if (a1.i.booleanValue() != flag)
            {
                return false;
            }
            if (b1.g != 0)
            {
                for (; j1 < t1.b(); j1++)
                {
                    if (t1.c[j1].c.length != 0)
                    {
                        a1.g = i2 * 4 + a1.g;
                        a1.h = a1.h + i2 * 2 * 3;
                    }
                }

            }
            a1.a = a1.a + j2;
            a1.b = a1.b + com.google.android.m4b.maps.bm.e.b(k1);
            if (b1.b)
            {
                a1.c = a1.c + l1;
                a1.d = a1.d + i2 * 2;
            }
            if (a(i1, p1))
            {
                a1.e = i2 * 4 + a1.e;
                a1.f = a1.f + i2 * 2 * 3;
                return true;
            }
        }
        return true;
    }

    public static void b(d d1, float f1, int i1)
    {
        GL10 gl10 = d1.a;
        gl10.glBlendFunc(770, 771);
        gl10.glTexEnvx(8960, 8704, 7681);
        d1.a();
        d1.c();
        f1 -= i1;
        if (f1 >= 4F)
        {
            i1 = 25;
        } else
        if (f1 >= 3F)
        {
            i1 = 26;
        } else
        if (f1 >= 2.25F)
        {
            i1 = 27;
        } else
        if (f1 >= 1.0F && i1 >= 17)
        {
            i1 = 28;
        } else
        {
            i1 = 29;
        }
        d1.C.a[i1].a(gl10);
    }

    public static void d(d d1)
    {
        GL10 gl10 = d1.a;
        gl10.glBlendFunc(770, 771);
        gl10.glTexEnvx(8960, 8704, 7681);
        d1.a();
        d1.c();
        d1.C.a[30].a(gl10);
    }

    public final int a()
    {
        int j1 = c.c() + j.b() + k.a() + l.a() + m.c();
        int i1 = j1;
        if (n != null)
        {
            i1 = j1 + n.a();
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + s.c();
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + t.a.b();
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + u.c();
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + v.c();
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + w.c();
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + x.b();
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1 + y.c();
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + o.c();
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + p.b();
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + q.c();
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + r.a();
        }
        return j1;
    }

    public final void a(d d1, com.google.android.m4b.maps.bi.b b1, ab ab1)
    {
        float f1 = b1.b.b - (float)f.a;
        ab1.b;
        JVM INSTR tableswitch 2 8: default 64
    //                   2 65
    //                   3 64
    //                   4 115
    //                   5 175
    //                   6 235
    //                   7 782
    //                   8 849;
           goto _L1 _L2 _L1 _L3 _L4 _L5 _L6 _L7
_L1:
        return;
_L2:
        if (s != null && f1 <= 0.25F)
        {
            s.d(d1);
            t.a(d1);
            com.google.android.m4b.maps.bm.a.c(d1);
            u.a(d1, 1);
            com.google.android.m4b.maps.bm.a.d(d1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        j.d(d1);
        c.d(d1);
        l.c(d1);
        if (v == null || f1 > 0.25F)
        {
            m.a(d1, 4);
            return;
        } else
        {
            v.a(d1, 4);
            return;
        }
_L4:
        j.d(d1);
        c.d(d1);
        k.c(d1);
        if (v == null || f1 > 0.25F)
        {
            m.a(d1, 4);
            return;
        } else
        {
            v.a(d1, 4);
            return;
        }
_L5:
        if (w != null)
        {
            f1 = 6F * a(b1.b.b);
            if ((double)f1 > 0.0D)
            {
                if (f1 != E)
                {
                    E = f1;
                    x.a(d1);
                    b1 = x;
                    for (ab1 = B.iterator(); ab1.hasNext();)
                    {
                        com.google.android.m4b.maps.bo.p p1 = (com.google.android.m4b.maps.bo.p)ab1.next();
                        float f3 = 1.0F / f1;
                        float f6 = 1.0F / (16F * f1);
                        int i1 = f.d().f();
                        com.google.android.m4b.maps.bo.k k2 = p1.a;
                        int i5 = k2.a.length / 3;
                        float f8 = a(a(p1.c), i1);
                        int i2 = 0;
                        while (i2 < i5 - 1) 
                        {
                            float f10 = k2.b(i2);
                            int j3 = 0;
                            int l2 = 0;
                            int l3 = 0;
                            f10 *= f6;
                            int j1;
                            if (f10 > 0.5F)
                            {
                                int j4 = (int)(2.0F * f8 * f3 * 32768F);
                                int l4 = (int)(65536F * f10);
                                f10 -= (int)f10;
                                j1 = l3;
                                l2 = l4;
                                j3 = j4;
                                if (f10 > 0.125F)
                                {
                                    j1 = l3;
                                    l2 = l4;
                                    j3 = j4;
                                    if (f10 < 0.375F)
                                    {
                                        j1 = 40960;
                                        j3 = j4;
                                        l2 = l4;
                                    }
                                }
                            } else
                            {
                                j1 = 49152;
                            }
                            l3 = 32768 - j3;
                            j3 += 32768;
                            if (p1.h())
                            {
                                b1.a(j3, l2 + j1);
                                b1.a(l3, l2 + j1);
                                b1.a(l3, j1);
                                b1.a(j3, j1);
                            } else
                            {
                                b1.a(l3, j1);
                                b1.a(j3, j1);
                                b1.a(j3, l2 + j1);
                                b1.a(l3, j1 + l2);
                            }
                            i2++;
                        }
                    }

                    z = new com.google.android.m4b.maps.bb.e(0L, 500L, com.google.android.m4b.maps.bb.e.a.c, 0, 100);
                }
                f1 = 1.0F;
                if (z != null)
                {
                    float f4 = (float)z.a(d1) / 100F;
                    f1 = f4;
                    if (f4 > 0.99F)
                    {
                        z = null;
                        f1 = f4;
                    }
                }
                d1.a.glColor4f(g[0], g[1], g[2], f1 * g[3]);
                x.d(d1);
                w.d(d1);
                y.a(d1, 4);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (n != null)
        {
            j.d(d1);
            c.d(d1);
            n.c(d1);
            if (v == null || f1 > 0.25F)
            {
                m.a(d1, 4);
                return;
            } else
            {
                v.a(d1, 4);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (o != null)
        {
            float f5 = 6F * a(b1.b.b);
            if ((double)f5 > 0.0D)
            {
                if (f5 != F)
                {
                    F = f5;
                    float f2 = 1.0F / f5;
                    f5 = 1.0F / (16F * f5);
                    p.a(d1);
                    b1 = C.iterator();
                    int j2 = f.d().f();
                    while (b1.hasNext()) 
                    {
                        ab1 = (com.google.android.m4b.maps.bo.p)b1.next();
                        com.google.android.m4b.maps.bo.k k1 = ((com.google.android.m4b.maps.bo.p) (ab1)).a;
                        int i3 = k1.a.length / 3;
                        float f7 = a(a(((com.google.android.m4b.maps.bo.p) (ab1)).c), j2);
                        int l1 = 0;
                        while (l1 < i3 - 1) 
                        {
                            float f9 = k1.b(l1);
                            int k4 = (int)(2.0F * f7 * f2 * 32768F);
                            int k3 = (int)(f9 * f5 * 65536F);
                            int i4 = 32768 - k4;
                            k4 += 32768;
                            p.a(k4, k3);
                            p.a(i4, k3);
                            p.a(i4, 0);
                            p.a(k4, 0);
                            l1++;
                        }
                    }
                }
                p.d(d1);
                o.d(d1);
                r.c(d1);
                q.a(d1, 4);
                return;
            }
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    public final int b()
    {
        int j1 = c.d() + 464 + j.c() + k.b() + l.b() + m.d();
        int i1 = j1;
        if (n != null)
        {
            i1 = j1 + n.b();
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + s.d();
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + t.a();
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + u.d();
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + v.d();
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + w.d();
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + x.c();
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1 + y.d();
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + o.d();
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + p.c();
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + q.d();
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + r.b();
        }
        Iterator iterator = B.iterator();
        for (i1 = j1 + 24; iterator.hasNext(); i1 = ((com.google.android.m4b.maps.bo.p)iterator.next()).g() + i1) { }
        iterator = C.iterator();
        for (i1 += 24; iterator.hasNext(); i1 = ((com.google.android.m4b.maps.bo.p)iterator.next()).g() + i1) { }
        return i1;
    }

    public final void b(d d1)
    {
        c.b(d1);
        j.b(d1);
        l.a(d1);
        k.a(d1);
        m.b(d1);
        if (n != null)
        {
            n.a(d1);
        }
        if (s != null)
        {
            s.b(d1);
            t.b(d1);
            u.b(d1);
            v.b(d1);
        }
        if (w != null)
        {
            w.b(d1);
            x.b(d1);
            y.b(d1);
        }
        if (o != null)
        {
            o.b(d1);
            p.b(d1);
            q.b(d1);
            r.a(d1);
        }
    }

    public final void c(d d1)
    {
        c.c(d1);
        j.c(d1);
        l.b(d1);
        k.b(d1);
        m.c(d1);
        if (n != null)
        {
            n.b(d1);
        }
        if (s != null)
        {
            s.c(d1);
            t.c(d1);
            u.c(d1);
            v.c(d1);
        }
        if (w != null)
        {
            w.c(d1);
            x.c(d1);
            y.c(d1);
        }
        if (o != null)
        {
            o.c(d1);
            p.c(d1);
            q.c(d1);
            r.b(d1);
        }
    }

}
