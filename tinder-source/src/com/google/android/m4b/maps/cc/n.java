// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import android.opengl.Matrix;
import com.google.android.m4b.maps.az.f;
import com.google.android.m4b.maps.bb.e;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bo.a;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bo.bc;
import com.google.android.m4b.maps.bo.bk;
import com.google.android.m4b.maps.bo.d;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.h;
import com.google.android.m4b.maps.bo.p;
import com.google.android.m4b.maps.bo.t;
import com.google.android.m4b.maps.br.c;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.ai;
import com.google.android.m4b.maps.bx.i;
import com.google.android.m4b.maps.bx.k;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            h, i, g

public class n extends com.google.android.m4b.maps.cc.h
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        private static final a j[];

        public static a a(int k)
        {
            switch (k)
            {
            case 8: // '\b'
            case 12: // '\f'
            default:
                throw new IllegalArgumentException("Unknown position");

            case 5: // '\005'
                return a;

            case 6: // '\006'
                return e;

            case 7: // '\007'
                return c;

            case 9: // '\t'
                return b;

            case 10: // '\n'
                return i;

            case 11: // '\013'
                return h;

            case 13: // '\r'
                return d;

            case 14: // '\016'
                return g;

            case 15: // '\017'
                return f;
            }
        }

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/cc/n$a, s1);
        }

        public static a[] values()
        {
            return (a[])j.clone();
        }

        static 
        {
            a = new a("AT_CENTER", 0);
            b = new a("ABOVE_CENTER", 1);
            c = new a("RIGHT_OF_CENTER", 2);
            d = new a("BELOW_CENTER", 3);
            e = new a("LEFT_OF_CENTER", 4);
            f = new a("BOTTOM_RIGHT", 5);
            g = new a("BOTTOM_LEFT", 6);
            h = new a("TOP_RIGHT", 7);
            i = new a("TOP_LEFT", 8);
            j = (new a[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private a(String s1, int k)
        {
            super(s1, k);
        }
    }

    public static final class b
    {

        public final a a;
        public final i.c b;

        public b(a a1, i.c c1)
        {
            a = a1;
            b = c1;
        }
    }


    private static final b L[] = new b[0];
    private static final b M[];
    private boolean A;
    private final b B[];
    private int C;
    private e D;
    private boolean E;
    private float F;
    private final float G;
    private final float H[] = new float[8];
    private final boolean I;
    private final com.google.android.m4b.maps.b.a J;
    private boolean K;
    private com.google.android.m4b.maps.bo.a a;
    protected com.google.android.m4b.maps.bo.a m;
    protected com.google.android.m4b.maps.cc.i n;
    protected com.google.android.m4b.maps.cc.i o;
    protected b p;
    protected float q;
    protected float r;
    protected float s;
    protected float t;
    private bc u;
    private bc v;
    private final String w;
    private final boolean x;
    private boolean y;
    private float z;

    n(bb bb1, com.google.android.m4b.maps.br.b b1, String s1, com.google.android.m4b.maps.bo.a a1, com.google.android.m4b.maps.bo.a a2, float f1, float f2, 
            boolean flag, boolean flag1, com.google.android.m4b.maps.cc.i j, com.google.android.m4b.maps.cc.i k, b ab1[], boolean flag2, boolean flag3, 
            com.google.android.m4b.maps.b.a a3)
    {
        super(bb1, b1, bb1.d(), f1, f2, bb1.e(), flag, flag2);
        z = -1F;
        w = s1;
        m = a1;
        a = a2;
        n = j;
        o = k;
        x = flag1;
        if (o == null)
        {
            ab1 = L;
        }
        B = ab1;
        I = flag3;
        J = a3;
        C = 0;
        if (o != null)
        {
            p = B[C];
            o.a(p.b);
        }
        A = false;
        f1 = 0.0F;
        if (j != null)
        {
            f1 = 0.0F + j.a * j.b;
        }
        f2 = f1;
        if (k != null)
        {
            f2 = f1 + k.a * k.b;
        }
        G = f2;
    }

    private float a(com.google.android.m4b.maps.bi.b b1)
    {
        if (x)
        {
            return b1.a(1.0F, b1.b(m.a));
        } else
        {
            return b1.a(1.0F, b1.e);
        }
    }

    static int a(t t1, c c1, float f1)
    {
        return (int)com.google.android.m4b.maps.cc.h.a(t1, c1.e, c1.f, c1.g, f1);
    }

    public static n a(h h1, com.google.android.m4b.maps.br.b b1, boolean flag, com.google.android.m4b.maps.bi.b b2, com.google.android.m4b.maps.bm.j.a a1, k k, c c1, com.google.android.m4b.maps.b.a a2)
    {
        com.google.android.m4b.maps.bi.b b3;
        com.google.android.m4b.maps.cc.i j;
        j = com.google.android.m4b.maps.cc.i.a(h1.l, h1, b2, a1, k, c1);
        if (j == null || j.a())
        {
            return null;
        }
        b3 = null;
        if (h1.m != null)
        {
            b2 = com.google.android.m4b.maps.cc.i.a(h1.m, h1, b2, a1, k, c1);
            if (b2 == null)
            {
                return null;
            }
            b3 = b2;
            if (b2.a())
            {
                b3 = null;
            }
        }
        if (h1.n.length != 0 || b3 == null) goto _L2; else goto _L1
_L1:
        b2 = M;
_L4:
        StringBuilder stringbuilder;
        boolean flag1;
        int i1;
        if (b3 == null || b2.length == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a1 = h1.k[0];
        k = ((com.google.android.m4b.maps.bo.a) (a1)).a;
        stringbuilder = new StringBuilder();
        for (int l = 0; l < h1.l.a(); l++)
        {
            com.google.android.m4b.maps.bo.bk.a a3 = h1.l.a(l);
            if (a3.a())
            {
                stringbuilder.append(a3.b);
            }
        }

        break; /* Loop/switch isn't completed */
_L2:
        a1 = new b[h1.n.length];
        i1 = 0;
        do
        {
            b2 = a1;
            if (i1 >= a1.length)
            {
                break;
            }
            a1[i1] = new b(com.google.android.m4b.maps.cc.a.a(h1.n[i1].d()), com.google.android.m4b.maps.cc.i.c.a(h1.n[i1].a()));
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        for (int j1 = 0; j1 < h1.m.a(); j1++)
        {
            com.google.android.m4b.maps.bo.bk.a a4 = h1.m.a(j1);
            if (a4.a())
            {
                stringbuilder.append(a4.b);
            }
        }

        if (h1.d != null)
        {
            stringbuilder.append(h1.d.a());
        }
        boolean flag2;
        if (h1.c.length() > 0)
        {
            stringbuilder.append(h1.c);
        } else
        if (h1.a.a > 13)
        {
            stringbuilder.append(k.toString());
        }
        k = stringbuilder.toString();
        if (d.a(16, h1.h) && h1.c.length() > 0 && c1.p)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2)
        {
            return new com.google.android.m4b.maps.cc.g(h1, b1, k, a1, h1.i, h1.j, flag, flag1, j, b3, b2, c1.q);
        } else
        {
            return new n(h1, b1, k, a1, null, h1.i, h1.j, flag, flag1, j, b3, b2, c1.q, flag2, a2);
        }
    }

    public static n a(p p1, int j, com.google.android.m4b.maps.br.b b1, g g1, g g2, boolean flag, c c1, com.google.android.m4b.maps.bi.b b2, 
            com.google.android.m4b.maps.bm.j.a a1)
    {
        bk bk1 = p1.b[j];
        Object obj = new StringBuilder();
        for (j = 0; j < bk1.a(); j++)
        {
            com.google.android.m4b.maps.bo.bk.a a2 = bk1.a(j);
            if (com.google.android.m4b.maps.bo.bk.a.a(a2.a))
            {
                return null;
            }
            if (a2.a())
            {
                ((StringBuilder) (obj)).append(a2.b);
            }
        }

        if (((StringBuilder) (obj)).length() == 0)
        {
            return null;
        }
        b2 = com.google.android.m4b.maps.cc.i.a(bk1, p1, b2, a1, null, c1);
        if (b2 == null)
        {
            return null;
        }
        a1 = ((StringBuilder) (obj)).toString();
        obj = new com.google.android.m4b.maps.bo.a(g1, 0, 0.0F, null, 0.0F, 0.0F, 0.0F);
        if (g2 == null)
        {
            g1 = null;
        } else
        {
            g1 = new com.google.android.m4b.maps.bo.a(g2, 0, 0.0F, null, 0.0F, 0.0F, 0.0F);
        }
        return new n(p1, b1, a1, ((com.google.android.m4b.maps.bo.a) (obj)), g1, -1F, -1F, flag, false, b2, null, L, c1.q, false, null);
    }

    public final void a(com.google.android.m4b.maps.bm.d d1, com.google.android.m4b.maps.bi.b b1, ab ab1)
    {
        if (A) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = ab1.a;
        if (i)
        {
            D = new e(com.google.android.m4b.maps.bb.e.a.a);
        }
        if (obj != i.g || !(b instanceof h)) goto _L4; else goto _L3
_L3:
        obj = (h)b;
        if (((h) (obj)).l == null) goto _L6; else goto _L5
_L5:
        int j = 0;
_L8:
        if (j >= ((h) (obj)).l.a()) goto _L6; else goto _L7
_L7:
        boolean flag;
        Object obj1 = ((h) (obj)).l.a(j);
        if (((com.google.android.m4b.maps.bo.bk.a) (obj1)).a())
        {
            flag = true;
        } else
        {
label0:
            {
                obj1 = ((com.google.android.m4b.maps.bo.bk.a) (obj1)).e;
                if (obj1 == null || !((t) (obj1)).f())
                {
                    break label0;
                }
                flag = true;
            }
        }
_L9:
        K = flag;
_L4:
        A = true;
_L2:
        if (K)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_253;
        j++;
          goto _L8
_L6:
        if (((h) (obj)).m == null)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        j = 0;
_L10:
        if (j >= ((h) (obj)).m.a())
        {
            break MISSING_BLOCK_LABEL_247;
        }
        Object obj2 = ((h) (obj)).m.a(j);
        if (((com.google.android.m4b.maps.bo.bk.a) (obj2)).a())
        {
            flag = true;
        } else
        {
label1:
            {
                obj2 = ((com.google.android.m4b.maps.bo.bk.a) (obj2)).e;
                if (obj2 == null || !((t) (obj2)).f())
                {
                    break label1;
                }
                flag = true;
            }
        }
          goto _L9
        j++;
          goto _L10
        flag = false;
          goto _L9
        g g1;
        GL10 gl10;
        GL10 gl10_1;
label2:
        {
            gl10 = d1.a;
            gl10.glPushMatrix();
            gl10_1 = d1.a;
            g g2 = m.a;
            g1 = g2;
            if (b1.c)
            {
                break label2;
            }
            if (m.a())
            {
                g1 = g2;
                if (m.b - b1.b.d != 0.0F)
                {
                    break label2;
                }
            }
            g1 = g2;
            if (b1.b.c == 0.0F)
            {
                b1.a(m.a, H);
                g1 = b1.b(Math.round(H[0]), Math.round(H[1]));
            }
        }
        com.google.android.m4b.maps.bx.n.a(d1, b1, g1, z);
        int k;
        if (D != null)
        {
            int l = D.a(d1);
            k = l;
            if (l == 0x10000)
            {
                D = null;
                k = l;
            }
        } else
        {
            k = this.l;
        }
        d1.a.glColor4x(k, k, k, k);
        if (m.a())
        {
            float f2 = m.b - b1.b.d;
            float f1 = f2;
            if (f2 < 0.0F)
            {
                f1 = f2 + 360F;
            }
            f2 = m.b;
            static final class _cls1
            {

                static final int a[];
                static final int b[];

                static 
                {
                    b = new int[i.c.values().length];
                    try
                    {
                        b[com.google.android.m4b.maps.cc.i.c.b.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror11) { }
                    try
                    {
                        b[com.google.android.m4b.maps.cc.i.c.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        b[com.google.android.m4b.maps.cc.i.c.a.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    a = new int[a.values().length];
                    try
                    {
                        a[com.google.android.m4b.maps.cc.a.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        a[com.google.android.m4b.maps.cc.a.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        a[com.google.android.m4b.maps.cc.a.e.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        a[com.google.android.m4b.maps.cc.a.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[com.google.android.m4b.maps.cc.a.b.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[com.google.android.m4b.maps.cc.a.f.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[com.google.android.m4b.maps.cc.a.g.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[com.google.android.m4b.maps.cc.a.h.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.google.android.m4b.maps.cc.a.i.ordinal()] = 9;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            float f3;
            float f4;
            float f5;
            if (!y && f1 > 90F && f1 < 270F)
            {
                f1 = 180F + f2;
            } else
            {
                f1 = f2;
            }
            f2 = f1;
            if (f1 >= 360F)
            {
                f2 = f1 - 360F;
            }
            gl10_1.glRotatef(f2, 0.0F, 0.0F, -1F);
            gl10_1.glRotatef(-90F, 1.0F, 0.0F, 0.0F);
        } else
        {
            com.google.android.m4b.maps.bx.n.a(gl10_1, b1);
        }
        if (n != null)
        {
            f3 = n.a;
            f2 = n.b;
            f5 = n.a / 2.0F;
            f1 = n.b / 2.0F;
            gl10_1.glTranslatef(-f5, 0.0F, -f1);
            n.a(d1, b1, ab1);
        } else
        {
            f1 = 0.0F;
            f5 = 0.0F;
            f2 = 0.0F;
            f3 = 0.0F;
        }
        if (o == null) goto _L12; else goto _L11
_L11:
        com.google.android.m4b.maps.cc._cls1.a[p.a.ordinal()];
        JVM INSTR tableswitch 1 9: default 728
    //                   1 856
    //                   2 891
    //                   3 912
    //                   4 943
    //                   5 959
    //                   6 965
    //                   7 982
    //                   8 1005
    //                   9 1012;
           goto _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L13:
        f2 = 0.0F;
        f1 = 0.0F;
_L30:
        if (p.a == com.google.android.m4b.maps.cc.a.d) goto _L24; else goto _L23
_L23:
        f4 = f1;
        if (p.a != com.google.android.m4b.maps.cc.a.b) goto _L25; else goto _L24
_L24:
        com.google.android.m4b.maps.cc._cls1.b[p.b.ordinal()];
        JVM INSTR tableswitch 1 3: default 804
    //                   1 1025
    //                   2 1033
    //                   3 1052;
           goto _L26 _L27 _L28 _L29
_L26:
        f4 = f1;
_L25:
        gl10_1.glTranslatef(f4, 0.0F, f2);
        o.a(d1, b1, ab1);
_L12:
        gl10.glPopMatrix();
        return;
_L14:
        f4 = o.a / 2.0F;
        f2 = f1 - o.b / 2.0F;
        f1 = f5 - f4;
          goto _L30
_L15:
        f2 = f1 - o.b / 2.0F;
        f1 = f3;
          goto _L30
_L16:
        f4 = -o.a;
        f2 = f1 - o.b / 2.0F;
        f1 = f4;
          goto _L30
_L17:
        f2 = -o.b;
        f1 = 0.0F;
          goto _L30
_L18:
        f1 = 0.0F;
          goto _L30
_L19:
        f2 = -o.b;
        f1 = f3;
          goto _L30
_L20:
        f1 = -o.a;
        f2 = -o.b;
          goto _L30
_L21:
        f1 = f3;
          goto _L30
_L22:
        f1 = -o.a;
          goto _L30
_L27:
        f4 = -10F;
          goto _L25
_L28:
        f4 = (10F + f3) - o.a;
          goto _L25
_L29:
        f4 = f5 - o.a / 2.0F;
          goto _L25
    }

    public boolean a(com.google.android.m4b.maps.bi.b b1, com.google.android.m4b.maps.bm.d d1)
    {
        int j;
        int l;
        if (super.j && this.k && z > 0.0F)
        {
            float f1 = a(b1) / z;
            this.l = a(f1);
            return f1 >= 0.25F && f1 <= 2.0F;
        }
        this.l = 0x10000;
        float f2;
        boolean flag;
        if (b1.b.c == 0.0F && b1.b.d == 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f2 = b1.b.b;
        if (u != null && E && flag && f2 == F)
        {
            return true;
        }
        if (u != null && m.a() && f2 == F)
        {
            v = u;
            return true;
        }
        E = flag;
        F = f2;
        l = 0;
        j = 0;
        if (n != null)
        {
            l = (int)n.a >> 1;
            j = (int)n.b >> 1;
        }
        if (o != null) goto _L2; else goto _L1
_L1:
        q = -l;
        r = l;
        s = -j;
        t = j;
_L12:
        d1 = ((com.google.android.m4b.maps.bm.h)ai.b.get()).a;
        g.b(b1.c(), m.a, d1);
        z = a(b1);
        if (!x)
        {
            float f3 = b1.e / b1.b(m.a);
            q = q * f3;
            r = r * f3;
            s = s * f3;
            t = f3 * t;
        }
        if (d != null && (d instanceof com.google.android.m4b.maps.br.a))
        {
            d1 = ((com.google.android.m4b.maps.bm.d) (((com.google.android.m4b.maps.br.a)d).a));
            if (d1 != null && (d1 instanceof com.google.android.m4b.maps.ak.a.c))
            {
                d1 = com.google.android.m4b.maps.az.i.a().a((com.google.android.m4b.maps.ak.a.c)d1, false, false);
                if (d1 != null)
                {
                    m.a.c = (int)d1.a(b1, m.a);
                }
            }
        }
        v = u;
        if (m.a())
        {
            int j1;
            int l1;
            int j2;
            int l2;
            if (!m.a())
            {
                b1 = null;
            } else
            {
                float f4 = m.b;
                float f6;
                float f8;
                g g1;
                g g3;
                Object obj;
                g g6;
                if (f4 < 270F)
                {
                    f4 += 90F;
                } else
                {
                    f4 -= 270F;
                }
                if (f4 < 270F)
                {
                    f6 = 90F + f4;
                } else
                {
                    f6 = f4 - 270F;
                }
                f8 = b1.b(m.a);
                obj = (com.google.android.m4b.maps.bm.h)ai.b.get();
                d1 = ((com.google.android.m4b.maps.bm.h) (obj)).a;
                d1.a(f4, b1.a(q, f8));
                g1 = ((com.google.android.m4b.maps.bm.h) (obj)).b;
                g1.a(f4, b1.a(r, f8));
                g6 = ((com.google.android.m4b.maps.bm.h) (obj)).c;
                g6.a(f6, b1.a(s, f8));
                g3 = ((com.google.android.m4b.maps.bm.h) (obj)).d;
                g3.a(f6, b1.a(t, f8));
                b1 = ((com.google.android.m4b.maps.bm.h) (obj)).e;
                g.a(m.a, g6, b1);
                obj = ((com.google.android.m4b.maps.bm.h) (obj)).f;
                g.a(m.a, g3, ((g) (obj)));
                g3 = b1.e(d1);
                b1 = b1.e(g1);
                b1 = bc.a(((g) (obj)).e(d1), ((g) (obj)).e(g1), g3, b1);
            }
            u = b1;
        } else
        {
            b1.a(m.a, H);
            float f10 = H[0];
            float f7 = H[1];
            float f5 = f10 + q;
            float f11 = r;
            float f12 = s;
            float f9 = t;
            if (b1.m == null)
            {
                b1.l();
            }
            d1 = b1.c();
            int k = ((g) (d1)).a;
            int i1 = ((g) (d1)).b;
            int k1 = ((g) (d1)).c;
            int i2 = b1.d.a - k;
            int k2 = b1.d.b - i1;
            d1 = b1.n;
            d1[0] = f5;
            d1[1] = f7 + f12;
            d1[2] = 1.0F;
            d1[3] = 1.0F;
            Matrix.multiplyMV(d1, 4, b1.m, 0, d1, 0);
            f12 = 1.0F / d1[7];
            double d2 = d1[4] * f12;
            double d3 = d1[5] * f12;
            double d4 = f12 * d1[6];
            if (d4 >= 1.0D)
            {
                b1 = null;
            } else
            {
                d4 = 1.0D / (1.0D - d4);
                double d5 = k1;
                double d9 = i2;
                double d13 = k;
                double d17 = k1;
                double d21 = k2;
                double d25 = i1;
                g g2 = new g((int)((d2 * d5 + d9) * d4 + d13), (int)((d3 * d17 + d21) * d4 + d25));
                d1[0] = f10 + f11;
                Matrix.multiplyMV(d1, 4, b1.m, 0, d1, 0);
                f10 = 1.0F / d1[7];
                d2 = d1[4] * f10;
                d3 = d1[5] * f10;
                d4 = f10 * d1[6];
                if (d4 >= 1.0D)
                {
                    b1 = null;
                } else
                {
                    d4 = 1.0D / (1.0D - d4);
                    double d6 = k1;
                    double d10 = i2;
                    double d14 = k;
                    double d18 = k1;
                    double d22 = k2;
                    double d26 = i1;
                    g g4 = new g((int)((d2 * d6 + d10) * d4 + d14), (int)((d3 * d18 + d22) * d4 + d26));
                    d1[1] = f7 + f9;
                    Matrix.multiplyMV(d1, 4, b1.m, 0, d1, 0);
                    f7 = 1.0F / d1[7];
                    d2 = d1[4] * f7;
                    d3 = d1[5] * f7;
                    d4 = f7 * d1[6];
                    if (d4 >= 1.0D)
                    {
                        b1 = null;
                    } else
                    {
                        d4 = 1.0D / (1.0D - d4);
                        double d7 = k1;
                        double d11 = i2;
                        double d15 = k;
                        double d19 = k1;
                        double d23 = k2;
                        double d27 = i1;
                        g g5 = new g((int)((d2 * d7 + d11) * d4 + d15), (int)((d3 * d19 + d23) * d4 + d27));
                        d1[0] = f5;
                        Matrix.multiplyMV(d1, 4, b1.m, 0, d1, 0);
                        f5 = 1.0F / d1[7];
                        d2 = d1[4] * f5;
                        d3 = d1[5] * f5;
                        d4 = d1[6] * f5;
                        if (d4 >= 1.0D)
                        {
                            b1 = null;
                        } else
                        {
                            d4 = 1.0D / (1.0D - d4);
                            double d8 = k1;
                            double d12 = i2;
                            double d16 = k;
                            double d20 = k1;
                            double d24 = k2;
                            double d28 = i1;
                            b1 = bc.a(new g((int)((d2 * d8 + d12) * d4 + d16), (int)(d4 * (d3 * d20 + d24) + d28)), g5, g2, g4);
                        }
                    }
                }
            }
            u = b1;
        }
        return u != null;
_L2:
        j2 = (int)o.a >> 1;
        l2 = (int)o.b >> 1;
        if (l > j2)
        {
            j1 = l;
        } else
        {
            j1 = j2;
        }
        if (j > l2)
        {
            l1 = j;
        } else
        {
            l1 = l2;
        }
        com.google.android.m4b.maps.cc._cls1.a[p.a.ordinal()];
        JVM INSTR tableswitch 2 9: default 604
    //                   2 774
    //                   3 835
    //                   4 812
    //                   5 751
    //                   6 873
    //                   7 916
    //                   8 959
    //                   9 1002;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_1002;
_L3:
        q = -j1;
        r = j1;
        s = -l1;
        t = l1;
_L13:
        if (p.a == com.google.android.m4b.maps.cc.a.d || p.a == com.google.android.m4b.maps.cc.a.b)
        {
            switch (com.google.android.m4b.maps.cc._cls1.b[p.b.ordinal()])
            {
            case 1: // '\001'
                q = -l - 10;
                r = Math.max(q + (float)(j2 * 2), l);
                break;

            case 2: // '\002'
                r = l + 10;
                q = Math.min(r - (float)(j2 * 2), -l);
                break;

            case 3: // '\003'
                q = -j1;
                r = j1;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
          goto _L12
_L7:
        s = -j - l2 * 2;
        t = j;
          goto _L13
_L4:
        q = -l;
        r = j2 * 2 + l;
        s = -l1;
        t = l1;
          goto _L13
_L6:
        s = -j;
        t = j + l2 * 2;
          goto _L13
_L5:
        q = -l - j2 * 2;
        r = l;
        s = -l1;
        t = l1;
          goto _L13
_L8:
        q = -l;
        r = j2 * 2 + l;
        s = -j;
        t = j + l2 * 2;
          goto _L13
_L9:
        q = -l - j2 * 2;
        r = l;
        s = -j;
        t = j + l2 * 2;
          goto _L13
_L10:
        q = -l;
        r = j2 * 2 + l;
        s = -j - l2 * 2;
        t = j;
          goto _L13
        q = -l - j2 * 2;
        r = l;
        s = -j - l2 * 2;
        t = j;
          goto _L13
        if (true) goto _L12; else goto _L14
_L14:
    }

    public final boolean a(as as1)
    {
        return as1.a(m.a);
    }

    public final void b(com.google.android.m4b.maps.bm.d d1)
    {
        super.b(d1);
        if (n != null)
        {
            n.b(d1);
        }
        if (o != null)
        {
            o.b(d1);
        }
    }

    public final boolean b(com.google.android.m4b.maps.bi.b b1, com.google.android.m4b.maps.bm.d d1)
    {
        if (C + 1 < B.length)
        {
            b ab1[] = B;
            int j = C + 1;
            C = j;
            p = ab1[j];
            o.a(p.b);
            u = null;
            a(b1, d1);
            return true;
        }
        if (a != null)
        {
            m = a;
            a = null;
            if (B.length > 1)
            {
                C = 0;
                p = B[0];
                o.a(p.b);
            }
            u = null;
            a(b1, d1);
            return true;
        } else
        {
            return false;
        }
    }

    public final void c(com.google.android.m4b.maps.bm.d d1)
    {
        super.c(d1);
        if (n != null)
        {
            n.c(d1);
        }
        if (o != null)
        {
            o.c(d1);
        }
    }

    public final float n()
    {
        return G;
    }

    public final com.google.android.m4b.maps.bo.n o()
    {
        return u;
    }

    public final String r()
    {
        return w;
    }

    public final boolean u()
    {
        if (m == null)
        {
            return false;
        } else
        {
            return m.a();
        }
    }

    static 
    {
        M = (new b[] {
            new b(com.google.android.m4b.maps.cc.a.d, com.google.android.m4b.maps.cc.i.c.a), new b(com.google.android.m4b.maps.cc.a.b, com.google.android.m4b.maps.cc.i.c.a), new b(com.google.android.m4b.maps.cc.a.e, com.google.android.m4b.maps.cc.i.c.c), new b(com.google.android.m4b.maps.cc.a.c, com.google.android.m4b.maps.cc.i.c.b)
        });
    }
}
