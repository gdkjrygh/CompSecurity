// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import android.os.SystemClock;
import com.google.android.m4b.maps.ak.c;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.ap;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bo.bh;
import com.google.android.m4b.maps.bo.bi;
import com.google.android.m4b.maps.bo.bj;
import com.google.android.m4b.maps.bo.bm;
import com.google.android.m4b.maps.bo.e;
import com.google.android.m4b.maps.bo.h;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.bo.p;
import com.google.android.m4b.maps.bq.d;
import com.google.android.m4b.maps.bw.a;
import com.google.android.m4b.maps.bw.g;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.ai;
import com.google.android.m4b.maps.bx.f;
import com.google.android.m4b.maps.bx.i;
import com.google.android.m4b.maps.bx.n;
import com.google.android.m4b.maps.bx.s;
import com.google.android.m4b.maps.cf.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            q, p, a, l, 
//            b, o, s, d, 
//            c, j, r, h

public final class t
    implements q
{
    static final class a
        implements com.google.android.m4b.maps.cf.b
    {

        public final void a()
        {
            x x1 = x.b;
            throw new NullPointerException();
        }

        public final void b()
        {
            x x1 = x.b;
            throw new NullPointerException();
        }
    }


    private static float K[] = new float[8];
    public static final com.google.android.m4b.maps.bw.a a;
    private static final a.b c = new a.b(0.0F, 120F, false, -48F, 48F, true, 0x6fffffff);
    private static final a.b d = new a.b(48F, 120F, true, 0.0F, 0.0F, false, 0xccffffff);
    private static final a.b e = new a.b(0.0F, 60F, false, -24F, 24F, true, 0x6fffffff);
    private static final a.b f = new a.b(24F, 60F, true, 0.0F, 0.0F, false, 0xccffffff);
    private static final a.b g = new a.b(0.0F, 30F, false, -6F, 6F, true, 0x6fffffff);
    private static final a.b h = new a.b(16F, 40F, true, 0.0F, 0.0F, false, 0xccffffff);
    private ah A;
    private int B;
    private float C[];
    private long D;
    private volatile int E;
    private com.google.android.m4b.maps.br.b F;
    private Boolean G;
    private long H;
    private long I;
    private long J;
    private boolean L;
    private a M;
    private final g N;
    public Set b;
    private com.google.android.m4b.maps.bm.i i;
    private com.google.android.m4b.maps.bm.i j;
    private final float k[] = new float[4];
    private o l[];
    private com.google.android.m4b.maps.cc.d m[];
    private j n[];
    private com.google.android.m4b.maps.cc.p o[][];
    private com.google.android.m4b.maps.cc.d p[];
    private j q[];
    private com.google.android.m4b.maps.cc.b r[];
    private com.google.android.m4b.maps.cc.s s[];
    private com.google.android.m4b.maps.cc.h t;
    private ArrayList u;
    private final ac v;
    private final m w;
    private final HashSet x = new HashSet();
    private int y;
    private s z;

    private t(ac ac1, g g1)
    {
        i = null;
        j = null;
        C = new float[4];
        D = 0L;
        E = -1;
        F = null;
        G = null;
        H = -1L;
        I = -1L;
        J = 0L;
        L = false;
        M = null;
        v = ac1;
        N = g1;
        w = v.d();
    }

    public static t a(aa aa1, com.google.android.m4b.maps.bw.a a1, com.google.android.m4b.maps.bm.d d1, g g1)
    {
        ap ap1;
        String as[];
        ArrayList arraylist;
        ArrayList arraylist1;
        ArrayList arraylist2;
        ArrayList arraylist3;
        j.a a2;
        j.a a3;
        ArrayList arraylist4;
        ArrayList arraylist5;
        ArrayList arraylist6;
        g1 = new t(aa1.a(), g1);
        if (!(aa1 instanceof ap))
        {
            break MISSING_BLOCK_LABEL_1510;
        }
        ap1 = (ap)aa1;
        g1.y = ap1.g;
        aa1 = ap1.i();
        int l1 = aa1.length;
        for (int i1 = 0; i1 < l1; i1++)
        {
            Object obj = aa1[i1];
            ((t) (g1)).x.add(obj);
        }

        g1.A = ap1.h;
        g1.B = ap1.j;
        as = ap1.j();
        arraylist4 = new ArrayList();
        arraylist5 = new ArrayList();
        arraylist = new ArrayList();
        arraylist6 = new ArrayList();
        arraylist1 = new ArrayList();
        arraylist2 = new ArrayList();
        arraylist3 = new ArrayList();
        a2 = new j.a(((t) (g1)).v, as);
        a3 = new j.a(((t) (g1)).v, as);
        arraylist.add(arraylist6);
        aa1 = (bj)ap1.c.a(com.google.android.m4b.maps.bo.bd.a.d);
        if (aa1 == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        aa1 = ((bj) (aa1)).a.a;
        obj1 = com.google.android.m4b.maps.bq.d.a();
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        obj1 = ((d) (obj1)).a(aa1);
        if (obj1 == null) goto _L2; else goto _L4
_L4:
        aa1 = ((bh) (obj1)).a(aa1);
        if (aa1 == null) goto _L2; else goto _L5
_L5:
        if (((bi) (aa1)).b <= 0) goto _L7; else goto _L6
_L6:
        Object obj2;
        boolean flag;
        long l3;
        if ((float)ap1.c.a > 18.5F)
        {
            aa1 = g;
        } else
        if ((float)ap1.c.a > 16.5F)
        {
            aa1 = e;
        } else
        {
            aa1 = c;
        }
_L14:
        obj1 = ap1.l();
        l3 = SystemClock.uptimeMillis();
        flag = true;
_L12:
        if (!((com.google.android.m4b.maps.bo.ap.b) (obj1)).hasNext()) goto _L9; else goto _L8
_L8:
        obj2 = ((com.google.android.m4b.maps.bo.ap.b) (obj1)).a();
        if (a1.a(((bb) (obj2)).a())) goto _L11; else goto _L10
_L10:
        ((com.google.android.m4b.maps.bo.ap.b) (obj1)).next();
          goto _L12
_L7:
        if (((bi) (aa1)).b >= 0) goto _L2; else goto _L13
_L13:
        if ((float)ap1.c.a > 18.5F)
        {
            aa1 = h;
        } else
        if ((float)ap1.c.a > 16.5F)
        {
            aa1 = f;
        } else
        {
            aa1 = d;
        }
          goto _L14
_L2:
        aa1 = null;
          goto _L14
_L11:
        ((bb) (obj2)).a();
        JVM INSTR tableswitch 2 9: default 500
    //                   2 535
    //                   3 605
    //                   4 788
    //                   5 658
    //                   6 808
    //                   7 500
    //                   8 705
    //                   9 824;
           goto _L15 _L16 _L17 _L18 _L19 _L20 _L15 _L21 _L22
_L22:
        break MISSING_BLOCK_LABEL_824;
_L15:
        ((com.google.android.m4b.maps.bo.ap.b) (obj1)).next();
_L23:
        long l4 = SystemClock.uptimeMillis();
        if (l4 - l3 > 10L)
        {
            Thread.yield();
            l3 = l4;
        }
          goto _L12
_L16:
        obj2 = com.google.android.m4b.maps.cc.p.a(((t) (g1)).v, as, ((com.google.android.m4b.maps.bo.ap.b) (obj1)), d1);
        boolean flag1 = flag;
        if (flag)
        {
            boolean flag2;
            if (((com.google.android.m4b.maps.cc.p) (obj2)).c.a() > 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            flag1 = flag;
            if (flag2)
            {
                flag1 = false;
            }
        }
        arraylist6.add(obj2);
        flag = flag1;
          goto _L23
_L17:
        if (flag)
        {
            arraylist5.add(com.google.android.m4b.maps.cc.a.a(((t) (g1)).v, as, ((com.google.android.m4b.maps.bo.ap.b) (obj1)), a2, aa1, d1));
        } else
        {
            arraylist1.add(com.google.android.m4b.maps.cc.a.a(((t) (g1)).v, as, ((com.google.android.m4b.maps.bo.ap.b) (obj1)), a3, aa1, d1));
        }
          goto _L23
_L19:
        if (flag)
        {
            arraylist5.add(com.google.android.m4b.maps.cc.l.a(((t) (g1)).v, as, ((com.google.android.m4b.maps.bo.ap.b) (obj1)), d1));
        } else
        {
            arraylist1.add(com.google.android.m4b.maps.cc.l.a(((t) (g1)).v, as, ((com.google.android.m4b.maps.bo.ap.b) (obj1)), d1));
        }
          goto _L23
_L21:
        if (com.google.android.m4b.maps.cc.l.a((bm)obj2))
        {
            if (flag)
            {
                arraylist5.add(com.google.android.m4b.maps.cc.l.a(((t) (g1)).v, as, ((com.google.android.m4b.maps.bo.ap.b) (obj1)), d1));
            } else
            {
                arraylist1.add(com.google.android.m4b.maps.cc.l.a(((t) (g1)).v, as, ((com.google.android.m4b.maps.bo.ap.b) (obj1)), d1));
            }
        } else
        if (flag)
        {
            a2.a(((com.google.android.m4b.maps.bo.ap.b) (obj1)));
        } else
        {
            a3.a(((com.google.android.m4b.maps.bo.ap.b) (obj1)));
        }
          goto _L23
_L18:
        arraylist2.add(com.google.android.m4b.maps.cc.b.a(((t) (g1)).v, as, ((com.google.android.m4b.maps.bo.ap.b) (obj1))));
          goto _L23
_L20:
        arraylist4.add(com.google.android.m4b.maps.cc.o.a(as, ((com.google.android.m4b.maps.bo.ap.b) (obj1))));
          goto _L23
        arraylist3.add(com.google.android.m4b.maps.cc.s.a(((t) (g1)).v, as, ((com.google.android.m4b.maps.bo.ap.b) (obj1))));
          goto _L23
_L9:
        int k1;
        int j2;
        if (arraylist4.size() > 0)
        {
            g1.l = (o[])arraylist4.toArray(new o[arraylist4.size()]);
        }
        if (arraylist5.size() > 0)
        {
            g1.m = (com.google.android.m4b.maps.cc.d[])arraylist5.toArray(new com.google.android.m4b.maps.cc.d[arraylist5.size()]);
        }
        if (((ArrayList)arraylist.get(0)).size() > 0)
        {
            g1.o = new com.google.android.m4b.maps.cc.p[arraylist.size()][];
            for (int j1 = 0; j1 < ((t) (g1)).o.length; j1++)
            {
                aa1 = (List)arraylist.get(j1);
                ((t) (g1)).o[j1] = (com.google.android.m4b.maps.cc.p[])aa1.toArray(new com.google.android.m4b.maps.cc.p[aa1.size()]);
            }

        }
        if (arraylist1.size() > 0)
        {
            g1.p = (com.google.android.m4b.maps.cc.d[])arraylist1.toArray(new com.google.android.m4b.maps.cc.d[arraylist1.size()]);
        }
        if (arraylist2.size() > 0)
        {
            g1.r = (com.google.android.m4b.maps.cc.b[])arraylist2.toArray(new com.google.android.m4b.maps.cc.b[arraylist2.size()]);
        }
        if (arraylist3.size() > 0)
        {
            g1.s = (com.google.android.m4b.maps.cc.s[])arraylist3.toArray(new com.google.android.m4b.maps.cc.s[arraylist3.size()]);
        }
        g1.n = a2.a();
        g1.q = a3.a();
        j2 = ap1.k();
        g1.u = new ArrayList(j2);
        k1 = 0;
_L29:
        if (k1 >= j2)
        {
            break MISSING_BLOCK_LABEL_1463;
        }
        aa1 = ap1.a(k1);
        aa1.a();
        JVM INSTR lookupswitch 4: default 1172
    //                   2: 1445
    //                   7: 1181
    //                   8: 1426
    //                   11: 1426;
           goto _L24 _L25 _L26 _L27 _L27
_L25:
        break MISSING_BLOCK_LABEL_1445;
_L24:
        break; /* Loop/switch isn't completed */
_L26:
        break; /* Loop/switch isn't completed */
_L30:
        k1++;
        if (true) goto _L29; else goto _L28
_L28:
        g1.a(((bb) (aa1)));
        a1 = (h)aa1;
        if (((t) (g1)).z == null)
        {
            g1.z = ((t) (g1)).N.a().a(((t) (g1)).w.e(), ((t) (g1)).A);
        }
        d1 = ((t) (g1)).z;
        int i2 = ((h) (a1)).f;
        float f1;
        float f2;
        int k2;
        if (i2 < 0 || i2 >= ((s) (d1)).h.length)
        {
            f1 = -1F;
        } else
        {
            f1 = ((s) (d1)).h[i2];
        }
        f2 = f1;
        if (f1 < 0.0F)
        {
            f2 = ((h) (a1)).f;
        }
        a1.i = f2;
        d1 = ((t) (g1)).z;
        i2 = ((h) (a1)).g;
        if (i2 < 0 || i2 >= ((s) (d1)).h.length)
        {
            f1 = -1F;
        } else
        {
            f1 = ((s) (d1)).k[i2];
        }
        f2 = f1;
        if (f1 < 0.0F)
        {
            f2 = Math.min(22, ((h) (a1)).g + 1);
        }
        a1.j = f2;
        aa1 = aa1.f();
        k2 = aa1.length;
        i2 = 0;
        while (i2 < k2) 
        {
            int l2 = aa1[i2];
            if (l2 >= 0 && l2 < as.length)
            {
                ((t) (g1)).x.add(as[l2]);
            }
            i2++;
        }
          goto _L30
_L27:
        if (((bm)aa1).c.length > 0)
        {
            g1.a(((bb) (aa1)));
        }
          goto _L30
        if (((p)aa1).c() > 0)
        {
            g1.a(((bb) (aa1)));
        }
          goto _L30
        Collections.sort(((t) (g1)).u, g1. new Comparator() {

            private t a;

            public final int compare(Object obj3, Object obj4)
            {
                obj3 = (com.google.android.m4b.maps.br.d)obj3;
                return ((com.google.android.m4b.maps.br.d)obj4).a.e() - ((com.google.android.m4b.maps.br.d) (obj3)).a.e();
            }

            
            {
                a = t.this;
                super();
            }
        });
        if (ap1 instanceof e)
        {
            g1.b = Collections.unmodifiableSet(((e)ap1).b);
        }
        g1.a(ap1.m());
        return g1;
          goto _L12
    }

    private void a(bb bb1)
    {
        u.add(new com.google.android.m4b.maps.br.d(bb1, null));
    }

    public final int a(b b1, i i1)
    {
        int k1 = 2;
        if (i1 == i.g && l != null)
        {
            return 2;
        }
        int j1;
        boolean flag;
        if (l == null)
        {
            k1 = 0;
        }
        j1 = k1;
        if (m != null)
        {
            j1 = k1 | 4;
        }
        k1 = j1;
        if (n != null)
        {
            k1 = j1 | 8;
        }
        j1 = k1;
        if (o != null)
        {
            j1 = k1 | com.google.android.m4b.maps.cc.p.a(b1, i1);
        }
        k1 = j1;
        if (p != null)
        {
            k1 = j1 | 0x200;
        }
        j1 = k1;
        if (q != null)
        {
            j1 = k1 | 0x400;
        }
        k1 = j1;
        if (r != null)
        {
            k1 = j1;
            if (b1.b.c > 0.0F)
            {
                k1 = j1 | 0x800;
            }
            k1 |= 0x1000;
        }
        j1 = k1;
        if (s != null)
        {
            j1 = k1 | 0x2000;
        }
        flag = ai.a;
        return j1;
    }

    public final void a(long l1)
    {
        while (l1 < 0L || H >= 0L && l1 >= H) 
        {
            return;
        }
        H = l1;
        I = 60000L + l1;
    }

    public final void a(com.google.android.m4b.maps.bm.d d1, b b1, ab ab1)
    {
        int i1;
        GL10 gl10;
        if (d1.m > 0 && d1.n)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        gl10 = d1.a;
        gl10.glPushMatrix();
        if (b1.p != D)
        {
            D = b1.p;
            com.google.android.m4b.maps.bo.g g2 = w.c();
            com.google.android.m4b.maps.bo.g g1 = g2;
            if (!b1.c)
            {
                g1 = g2;
                if (b1.b.c == 0.0F)
                {
                    g1 = g2;
                    if (b1.b.d == 0.0F)
                    {
                        g1 = g2;
                        if (b1.b.b == (float)(int)b1.b.b)
                        {
                            b1.a(g2, K);
                            g1 = b1.b(Math.round(K[0]), Math.round(K[1]));
                        }
                    }
                }
            }
            com.google.android.m4b.maps.bx.n.a(d1, b1, g1, w.f(), C);
        }
        com.google.android.m4b.maps.bx.n.a(gl10, C);
        ab1.b;
        JVM INSTR tableswitch 1 15: default 264
    //                   1 359
    //                   2 407
    //                   3 536
    //                   4 584
    //                   5 668
    //                   6 1048
    //                   7 1132
    //                   8 1132
    //                   9 1216
    //                   10 1266
    //                   11 1314
    //                   12 1314
    //                   13 1362
    //                   14 264
    //                   15 1410;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L8 _L9 _L10 _L11 _L11 _L12 _L1 _L13
_L1:
        gl10.glPopMatrix();
        if (G == null)
        {
            if (!d1.g || com.google.android.m4b.maps.ao.b.a)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj;
            Object aobj[];
            com.google.android.m4b.maps.cc.p ap1[];
            Object obj1;
            com.google.android.m4b.maps.cc.p ap2[][];
            com.google.android.m4b.maps.cc.p ap3[];
            int j1;
            int k1;
            int l1;
            int i2;
            boolean flag;
            if (m == null && o == null && n == null && p == null && q == null && r == null && s == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            G = Boolean.valueOf(flag);
        }
        return;
_L2:
        if (l != null)
        {
            obj = l;
            j1 = obj.length;
            i1 = 0;
            while (i1 < j1) 
            {
                obj[i1].a(d1, b1, ab1);
                i1++;
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (m != null)
        {
            obj = m;
            j1 = obj.length;
            for (i1 = 0; i1 < j1; i1++)
            {
                obj[i1].a(d1, b1, ab1);
            }

        }
        if (o != null)
        {
            obj = o;
            k1 = obj.length;
            i1 = 0;
            while (i1 < k1) 
            {
                ap1 = obj[i1];
                l1 = ap1.length;
                for (j1 = 0; j1 < l1; j1++)
                {
                    ap1[j1].a(d1, b1, ab1);
                }

                i1++;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (n != null)
        {
            obj = n;
            j1 = obj.length;
            i1 = 0;
            while (i1 < j1) 
            {
                obj[i1].a(d1, b1, ab1);
                i1++;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (i1 == 0 && o != null)
        {
            obj = o;
            k1 = obj.length;
            i1 = 0;
            while (i1 < k1) 
            {
                ap1 = obj[i1];
                l1 = ap1.length;
                for (j1 = 0; j1 < l1; j1++)
                {
                    ap1[j1].a(d1, b1, ab1);
                }

                i1++;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (i1 != 0 && o != null)
        {
            obj1 = ab1.a;
            k1 = com.google.android.m4b.maps.cc.p.a(b1, ((i) (obj1)));
            obj = new ab(((i) (obj1)), 4);
            obj1 = new ab(((i) (obj1)), 6);
            ap2 = o;
            l1 = ap2.length;
            i1 = 0;
            while (i1 < l1) 
            {
                ap3 = ap2[i1];
                if ((k1 & 0x10) != 0)
                {
                    b(d1, b1, ((ab) (obj)));
                    i2 = ap3.length;
                    for (j1 = 0; j1 < i2; j1++)
                    {
                        ap3[j1].a(d1, b1, ((ab) (obj)));
                    }

                }
                if ((k1 & 0x20) != 0)
                {
                    b(d1, b1, ab1);
                    i2 = ap3.length;
                    for (j1 = 0; j1 < i2; j1++)
                    {
                        ap3[j1].a(d1, b1, ab1);
                    }

                }
                if ((k1 & 0x40) != 0)
                {
                    d1.b();
                    b(d1, b1, ((ab) (obj1)));
                    i2 = ap3.length;
                    for (j1 = 0; j1 < i2; j1++)
                    {
                        ap3[j1].a(d1, b1, ((ab) (obj1)));
                    }

                }
                if ((k1 & 0x180) != 0)
                {
                    d1.a();
                    b(d1, b1, ab1);
                    i2 = ap3.length;
                    for (j1 = 0; j1 < i2; j1++)
                    {
                        ap3[j1].a(d1, b1, ab1);
                    }

                }
                i1++;
            }
        } else
        if (o != null)
        {
            obj = o;
            k1 = obj.length;
            i1 = 0;
            while (i1 < k1) 
            {
                obj1 = obj[i1];
                l1 = obj1.length;
                for (j1 = 0; j1 < l1; j1++)
                {
                    obj1[j1].a(d1, b1, ab1);
                }

                i1++;
            }
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (i1 == 0 && o != null)
        {
            obj = o;
            k1 = obj.length;
            i1 = 0;
            while (i1 < k1) 
            {
                obj1 = obj[i1];
                l1 = obj1.length;
                for (j1 = 0; j1 < l1; j1++)
                {
                    obj1[j1].a(d1, b1, ab1);
                }

                i1++;
            }
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (i1 == 0 && o != null)
        {
            obj = o;
            k1 = obj.length;
            i1 = 0;
            while (i1 < k1) 
            {
                obj1 = obj[i1];
                l1 = obj1.length;
                for (j1 = 0; j1 < l1; j1++)
                {
                    obj1[j1].a(d1, b1, ab1);
                }

                i1++;
            }
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (p != null)
        {
            obj = p;
            j1 = obj.length;
            i1 = 0;
            while (i1 < j1) 
            {
                obj[i1].a(d1, b1, ab1);
                i1++;
            }
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (q != null)
        {
            aobj = q;
            j1 = aobj.length;
            i1 = 0;
            while (i1 < j1) 
            {
                aobj[i1].a(d1, b1, ab1);
                i1++;
            }
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (r != null)
        {
            aobj = r;
            j1 = aobj.length;
            i1 = 0;
            while (i1 < j1) 
            {
                aobj[i1].a(d1, b1, ab1);
                i1++;
            }
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (s != null)
        {
            aobj = s;
            j1 = aobj.length;
            i1 = 0;
            while (i1 < j1) 
            {
                aobj[i1].a(d1, b1, ab1);
                i1++;
            }
        }
        continue; /* Loop/switch isn't completed */
_L13:
        com.google.android.m4b.maps.cc.r.a.a(d1, b1, ab1);
        if (true) goto _L1; else goto _L14
_L14:
        G = Boolean.TRUE;
        return;
    }

    public final void a(com.google.android.m4b.maps.br.b b1)
    {
        if (com.google.android.m4b.maps.br.b.a(b1, F))
        {
            return;
        }
        F = b1;
        for (int i1 = 0; i1 < u.size(); i1++)
        {
            bb bb1 = ((com.google.android.m4b.maps.br.d)u.get(i1)).a;
            u.set(i1, new com.google.android.m4b.maps.br.d(bb1, b1));
        }

        E = -1;
    }

    public final void a(Collection collection)
    {
        boolean flag = false;
        collection.addAll(x);
        if (l != null)
        {
            o ao[] = l;
            int i3 = ao.length;
            for (int i1 = 0; i1 < i3; i1++)
            {
                collection.addAll(((com.google.android.m4b.maps.cc.d) (ao[i1])).a);
            }

        }
        if (m != null)
        {
            com.google.android.m4b.maps.cc.d ad[] = m;
            int j3 = ad.length;
            for (int j1 = 0; j1 < j3; j1++)
            {
                collection.addAll(ad[j1].a);
            }

        }
        if (n != null)
        {
            j aj[] = n;
            int k3 = aj.length;
            for (int k1 = 0; k1 < k3; k1++)
            {
                collection.addAll(((com.google.android.m4b.maps.cc.d) (aj[k1])).a);
            }

        }
        if (o != null)
        {
            com.google.android.m4b.maps.cc.p ap1[][] = o;
            int i5 = ap1.length;
            for (int l1 = 0; l1 < i5; l1++)
            {
                com.google.android.m4b.maps.cc.p ap2[] = ap1[l1];
                int j5 = ap2.length;
                for (int l3 = 0; l3 < j5; l3++)
                {
                    collection.addAll(((com.google.android.m4b.maps.cc.d) (ap2[l3])).a);
                }

            }

        }
        if (p != null)
        {
            com.google.android.m4b.maps.cc.d ad1[] = p;
            int i4 = ad1.length;
            for (int i2 = 0; i2 < i4; i2++)
            {
                collection.addAll(ad1[i2].a);
            }

        }
        if (q != null)
        {
            j aj1[] = q;
            int j4 = aj1.length;
            for (int j2 = 0; j2 < j4; j2++)
            {
                collection.addAll(((com.google.android.m4b.maps.cc.d) (aj1[j2])).a);
            }

        }
        if (r != null)
        {
            com.google.android.m4b.maps.cc.b ab1[] = r;
            int k4 = ab1.length;
            for (int k2 = 0; k2 < k4; k2++)
            {
                collection.addAll(((com.google.android.m4b.maps.cc.d) (ab1[k2])).a);
            }

        }
        if (s != null)
        {
            com.google.android.m4b.maps.cc.s as[] = s;
            int l4 = as.length;
            for (int l2 = ((flag) ? 1 : 0); l2 < l4; l2++)
            {
                collection.addAll(((com.google.android.m4b.maps.cc.d) (as[l2])).a);
            }

        }
    }

    public final void a(boolean flag)
    {
        if (L == flag)
        {
            return;
        } else
        {
            L = flag;
            return;
        }
    }

    public final boolean a()
    {
        return G == null || G.booleanValue();
    }

    public final boolean a(f f1)
    {
        if (u.isEmpty())
        {
            return false;
        }
        Iterator iterator = u.iterator();
        if (f1.b != null)
        {
            throw new IllegalStateException("Cannot call addIterator after next has been called");
        }
        if (iterator.hasNext())
        {
            f1.a.add(iterator);
        }
        return true;
    }

    public final ac b()
    {
        return v;
    }

    public final void b(com.google.android.m4b.maps.bm.d d1)
    {
        boolean flag = false;
        if (l != null)
        {
            o ao[] = l;
            int i3 = ao.length;
            for (int i1 = 0; i1 < i3; i1++)
            {
                ao[i1].b(d1);
            }

        }
        if (m != null)
        {
            com.google.android.m4b.maps.cc.d ad[] = m;
            int j3 = ad.length;
            for (int j1 = 0; j1 < j3; j1++)
            {
                ad[j1].b(d1);
            }

        }
        if (n != null)
        {
            j aj[] = n;
            int k3 = aj.length;
            for (int k1 = 0; k1 < k3; k1++)
            {
                aj[k1].b(d1);
            }

        }
        if (o != null)
        {
            com.google.android.m4b.maps.cc.p ap1[][] = o;
            int i5 = ap1.length;
            for (int l1 = 0; l1 < i5; l1++)
            {
                com.google.android.m4b.maps.cc.p ap2[] = ap1[l1];
                int j5 = ap2.length;
                for (int l3 = 0; l3 < j5; l3++)
                {
                    ap2[l3].b(d1);
                }

            }

        }
        if (p != null)
        {
            com.google.android.m4b.maps.cc.d ad1[] = p;
            int i4 = ad1.length;
            for (int i2 = 0; i2 < i4; i2++)
            {
                ad1[i2].b(d1);
            }

        }
        if (q != null)
        {
            j aj1[] = q;
            int j4 = aj1.length;
            for (int j2 = 0; j2 < j4; j2++)
            {
                aj1[j2].b(d1);
            }

        }
        if (r != null)
        {
            com.google.android.m4b.maps.cc.b ab1[] = r;
            int k4 = ab1.length;
            for (int k2 = 0; k2 < k4; k2++)
            {
                ab1[k2].b(d1);
            }

        }
        if (t != null)
        {
            t.b(d1);
            t = null;
        }
        if (s != null)
        {
            com.google.android.m4b.maps.cc.s as[] = s;
            int l4 = as.length;
            for (int l2 = ((flag) ? 1 : 0); l2 < l4; l2++)
            {
                as[l2].b(d1);
            }

        }
    }

    public final void b(com.google.android.m4b.maps.bm.d d1, b b1, ab ab1)
    {
        i i1 = ab1.a;
        int j1 = ab1.b;
        switch (j1)
        {
        case 14: // '\016'
        default:
            return;

        case 1: // '\001'
            com.google.android.m4b.maps.cc.o.a(d1);
            return;

        case 2: // '\002'
            com.google.android.m4b.maps.cc.a.a(d1, ab1);
            return;

        case 3: // '\003'
            com.google.android.m4b.maps.cc.j.a(d1);
            return;

        case 4: // '\004'
            com.google.android.m4b.maps.cc.p.a(d1, b1.b.b, v.a);
            return;

        case 5: // '\005'
            com.google.android.m4b.maps.cc.p.a(d1, b1.b.b, v.a, i1);
            return;

        case 6: // '\006'
            b1 = b1.b;
            com.google.android.m4b.maps.cc.p.a(d1);
            return;

        case 7: // '\007'
            com.google.android.m4b.maps.cc.p.b(d1, b1.b.b, v.a);
            return;

        case 8: // '\b'
            b1 = b1.b;
            com.google.android.m4b.maps.cc.p.d(d1);
            return;

        case 9: // '\t'
            com.google.android.m4b.maps.cc.a.a(d1, ab1);
            return;

        case 10: // '\n'
            com.google.android.m4b.maps.cc.j.a(d1);
            return;

        case 12: // '\f'
            com.google.android.m4b.maps.cc.b.a(d1, j1);
            return;

        case 11: // '\013'
            com.google.android.m4b.maps.cc.b.a(d1, j1);
            return;

        case 13: // '\r'
            com.google.android.m4b.maps.cc.s.a(d1);
            return;

        case 15: // '\017'
            com.google.android.m4b.maps.cc.r.a(d1, ab1);
            break;
        }
    }

    public final void b(Collection collection)
    {
    }

    public final void c(com.google.android.m4b.maps.bm.d d1)
    {
        boolean flag = false;
        G = Boolean.FALSE;
        if (l != null)
        {
            o ao[] = l;
            int i3 = ao.length;
            for (int i1 = 0; i1 < i3; i1++)
            {
                ao[i1].c(d1);
            }

        }
        if (m != null)
        {
            com.google.android.m4b.maps.cc.d ad[] = m;
            int j3 = ad.length;
            for (int j1 = 0; j1 < j3; j1++)
            {
                ad[j1].c(d1);
            }

        }
        if (n != null)
        {
            j aj[] = n;
            int k3 = aj.length;
            for (int k1 = 0; k1 < k3; k1++)
            {
                aj[k1].c(d1);
            }

        }
        if (o != null)
        {
            com.google.android.m4b.maps.cc.p ap1[][] = o;
            int i5 = ap1.length;
            for (int l1 = 0; l1 < i5; l1++)
            {
                com.google.android.m4b.maps.cc.p ap2[] = ap1[l1];
                int j5 = ap2.length;
                for (int l3 = 0; l3 < j5; l3++)
                {
                    ap2[l3].c(d1);
                }

            }

        }
        if (p != null)
        {
            com.google.android.m4b.maps.cc.d ad1[] = p;
            int i4 = ad1.length;
            for (int i2 = 0; i2 < i4; i2++)
            {
                ad1[i2].c(d1);
            }

        }
        if (q != null)
        {
            j aj1[] = q;
            int j4 = aj1.length;
            for (int j2 = 0; j2 < j4; j2++)
            {
                aj1[j2].c(d1);
            }

        }
        if (r != null)
        {
            com.google.android.m4b.maps.cc.b ab1[] = r;
            int k4 = ab1.length;
            for (int k2 = 0; k2 < k4; k2++)
            {
                ab1[k2].c(d1);
            }

        }
        if (t != null)
        {
            t.c(d1);
            t = null;
        }
        if (s != null)
        {
            com.google.android.m4b.maps.cc.s as[] = s;
            int l4 = as.length;
            for (int l2 = ((flag) ? 1 : 0); l2 < l4; l2++)
            {
                as[l2].c(d1);
            }

        }
    }

    public final boolean c()
    {
        return H >= 0L && com.google.android.m4b.maps.ay.k.c() > H;
    }

    public final boolean d()
    {
        return I >= 0L && com.google.android.m4b.maps.ay.k.c() > I;
    }

    public final boolean e()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (l == null) goto _L2; else goto _L1
_L1:
        o ao[];
        int i1;
        int j1;
        ao = l;
        j1 = ao.length;
        i1 = 0;
_L7:
        flag = flag1;
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        if (!ao[i1].c) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void f()
    {
        if (l != null)
        {
            o ao[] = l;
            int j1 = ao.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                ao[i1].c = false;
            }

        }
    }

    public final int g()
    {
        return y;
    }

    public final int h()
    {
        boolean flag = false;
        int l1;
        if (l != null)
        {
            o ao[] = l;
            int i4 = ao.length;
            int i2 = 0;
            int i1 = 0;
            do
            {
                l1 = i1;
                if (i2 >= i4)
                {
                    break;
                }
                l1 = ao[i2].a();
                i2++;
                i1 = l1 + i1;
            } while (true);
        } else
        {
            l1 = 0;
        }
        int j1 = l1;
        if (n != null)
        {
            j aj[] = n;
            int j4 = aj.length;
            int j2 = 0;
            do
            {
                j1 = l1;
                if (j2 >= j4)
                {
                    break;
                }
                j1 = aj[j2].a();
                j2++;
                l1 = j1 + l1;
            } while (true);
        }
        l1 = j1;
        if (o != null)
        {
            com.google.android.m4b.maps.cc.p ap1[][] = o;
            int k4 = ap1.length;
            int k2 = 0;
            do
            {
                l1 = j1;
                if (k2 >= k4)
                {
                    break;
                }
                com.google.android.m4b.maps.cc.p ap2[] = ap1[k2];
                int i6 = ap2.length;
                for (l1 = 0; l1 < i6; l1++)
                {
                    j1 += ap2[l1].a();
                }

                k2++;
            } while (true);
        }
        j1 = l1;
        if (q != null)
        {
            j aj1[] = q;
            int l4 = aj1.length;
            int l2 = 0;
            do
            {
                j1 = l1;
                if (l2 >= l4)
                {
                    break;
                }
                j1 = aj1[l2].a();
                l2++;
                l1 = j1 + l1;
            } while (true);
        }
        l1 = j1;
        if (r != null)
        {
            com.google.android.m4b.maps.cc.b ab1[] = r;
            int i5 = ab1.length;
            int i3 = 0;
            do
            {
                l1 = j1;
                if (i3 >= i5)
                {
                    break;
                }
                l1 = ab1[i3].a();
                i3++;
                j1 = l1 + j1;
            } while (true);
        }
        j1 = l1;
        if (s != null)
        {
            com.google.android.m4b.maps.cc.s as[] = s;
            int j5 = as.length;
            int j3 = 0;
            do
            {
                j1 = l1;
                if (j3 >= j5)
                {
                    break;
                }
                j1 = as[j3].a();
                j3++;
                l1 = j1 + l1;
            } while (true);
        }
        l1 = j1;
        if (m != null)
        {
            com.google.android.m4b.maps.cc.d ad[] = m;
            int k5 = ad.length;
            int k3 = 0;
            do
            {
                l1 = j1;
                if (k3 >= k5)
                {
                    break;
                }
                l1 = ad[k3].a();
                k3++;
                j1 = l1 + j1;
            } while (true);
        }
        int l3 = l1;
        if (p != null)
        {
            com.google.android.m4b.maps.cc.d ad1[] = p;
            int l5 = ad1.length;
            int k1 = ((flag) ? 1 : 0);
            do
            {
                l3 = l1;
                if (k1 >= l5)
                {
                    break;
                }
                l1 += ad1[k1].a();
                k1++;
            } while (true);
        }
        return l3;
    }

    public final int i()
    {
        boolean flag = false;
        int l3 = 256;
        if (l != null)
        {
            int i1 = 272;
            o ao[] = l;
            int i4 = ao.length;
            int j3 = 0;
            do
            {
                l3 = i1;
                if (j3 >= i4)
                {
                    break;
                }
                l3 = ao[j3].b();
                j3++;
                i1 = l3 + i1;
            } while (true);
        }
        int k3 = l3;
        if (n != null)
        {
            int j1 = l3 + 16;
            j aj[] = n;
            int j4 = aj.length;
            l3 = 0;
            do
            {
                k3 = j1;
                if (l3 >= j4)
                {
                    break;
                }
                k3 = aj[l3].b();
                l3++;
                j1 = k3 + j1;
            } while (true);
        }
        l3 = k3;
        if (o != null)
        {
            int k1 = k3 + 16;
            com.google.android.m4b.maps.cc.p ap1[][] = o;
            int k4 = ap1.length;
            k3 = 0;
            do
            {
                l3 = k1;
                if (k3 >= k4)
                {
                    break;
                }
                com.google.android.m4b.maps.cc.p ap2[] = ap1[k3];
                int i6 = ap2.length;
                for (l3 = 0; l3 < i6; l3++)
                {
                    k1 += ap2[l3].b();
                }

                k3++;
            } while (true);
        }
        k3 = l3;
        if (q != null)
        {
            int l1 = l3 + 16;
            j aj1[] = q;
            int l4 = aj1.length;
            l3 = 0;
            do
            {
                k3 = l1;
                if (l3 >= l4)
                {
                    break;
                }
                k3 = aj1[l3].b();
                l3++;
                l1 = k3 + l1;
            } while (true);
        }
        l3 = k3;
        if (r != null)
        {
            int i2 = k3 + 16;
            com.google.android.m4b.maps.cc.b ab1[] = r;
            int i5 = ab1.length;
            k3 = 0;
            do
            {
                l3 = i2;
                if (k3 >= i5)
                {
                    break;
                }
                l3 = ab1[k3].b();
                k3++;
                i2 = l3 + i2;
            } while (true);
        }
        k3 = l3;
        if (s != null)
        {
            int j2 = l3 + 16;
            com.google.android.m4b.maps.cc.s as[] = s;
            int j5 = as.length;
            l3 = 0;
            do
            {
                k3 = j2;
                if (l3 >= j5)
                {
                    break;
                }
                k3 = as[l3].b();
                l3++;
                j2 = k3 + j2;
            } while (true);
        }
        l3 = k3;
        if (m != null)
        {
            int k2 = k3 + 16;
            com.google.android.m4b.maps.cc.d ad[] = m;
            int k5 = ad.length;
            k3 = 0;
            do
            {
                l3 = k2;
                if (k3 >= k5)
                {
                    break;
                }
                l3 = ad[k3].b();
                k3++;
                k2 = l3 + k2;
            } while (true);
        }
        k3 = l3;
        if (p != null)
        {
            int l2 = l3 + 16;
            com.google.android.m4b.maps.cc.d ad1[] = p;
            int l5 = ad1.length;
            l3 = ((flag) ? 1 : 0);
            do
            {
                k3 = l2;
                if (l3 >= l5)
                {
                    break;
                }
                k3 = ad1[l3].b();
                l3++;
                l2 = k3 + l2;
            } while (true);
        }
        l3 = E;
        int i3 = l3;
        if (l3 == -1)
        {
            Iterator iterator = u.iterator();
            for (i3 = 24; iterator.hasNext(); i3 = ((com.google.android.m4b.maps.br.d)iterator.next()).a.g() + 16 + i3) { }
            E = i3;
        }
        return k3 + i3;
    }

    static 
    {
        a = com.google.android.m4b.maps.bw.a.a;
    }
}
