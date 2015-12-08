// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.br;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bo.a;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.aw;
import com.google.android.m4b.maps.bo.ay;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bo.bk;
import com.google.android.m4b.maps.bo.bm;
import com.google.android.m4b.maps.bo.d;
import com.google.android.m4b.maps.bo.h;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.bo.p;
import com.google.android.m4b.maps.bo.t;
import com.google.android.m4b.maps.bo.z;
import com.google.android.m4b.maps.bw.g;
import com.google.android.m4b.maps.bx.f;
import com.google.android.m4b.maps.bx.k;
import com.google.android.m4b.maps.bx.s;
import com.google.android.m4b.maps.cc.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.br:
//            b, c, d

public final class e
{
    static final class a
        implements Comparator
    {

        public final int compare(Object obj, Object obj1)
        {
            obj = (com.google.android.m4b.maps.br.d)obj;
            return com.google.android.m4b.maps.br.e.a(((com.google.android.m4b.maps.br.d)obj1).a) - com.google.android.m4b.maps.br.e.a(((com.google.android.m4b.maps.br.d) (obj)).a);
        }

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }

    public static final class b
        implements Iterator
    {

        private final ArrayList a;
        private final int b;
        private int c;

        public final com.google.android.m4b.maps.cc.h a()
        {
            Object obj = a;
            int i1 = c;
            c = i1 + 1;
            obj = (com.google.android.m4b.maps.cc.h)((ArrayList) (obj)).get(i1);
            for (; c < b && a.get(c) == null; c = c + 1) { }
            return ((com.google.android.m4b.maps.cc.h) (obj));
        }

        public final boolean hasNext()
        {
            return c < b;
        }

        public final Object next()
        {
            return a();
        }

        public final void remove()
        {
            throw new UnsupportedOperationException();
        }

        public b(ArrayList arraylist)
        {
            a = arraylist;
            b = arraylist.size();
            for (c = 0; c < b && a.get(c) == null; c = c + 1) { }
        }
    }


    private static com.google.android.m4b.maps.br.b n = new com.google.android.m4b.maps.br.b();
    private Set A;
    private final List B = new ArrayList();
    private Iterator C;
    private final Comparator D = new a((byte)0);
    private com.google.android.m4b.maps.b.a E;
    private final Map F = ax.b();
    private final g G;
    public final k a;
    public volatile com.google.android.m4b.maps.br.c b;
    public final com.google.android.m4b.maps.bm.j.a c = new com.google.android.m4b.maps.bm.j.a(16);
    public com.google.android.m4b.maps.bi.b d;
    public final com.google.android.m4b.maps.bm.d e;
    public as f;
    public ArrayList g;
    public ArrayList h;
    public int i;
    public boolean j;
    public volatile boolean k;
    public boolean l;
    public boolean m;
    private aw o;
    private float p;
    private f q;
    private Iterator r;
    private int s;
    private final Map t = ax.b();
    private int u;
    private float v;
    private int w;
    private int x;
    private boolean y;
    private volatile boolean z;

    public e(com.google.android.m4b.maps.br.c c1, com.google.android.m4b.maps.bm.d d1, Resources resources, g g1)
    {
        a = new k(resources.getDisplayMetrics().density);
        b = c1;
        e = d1;
        g = new ArrayList();
        s = -1;
        h = new ArrayList();
        i = -1;
        G = g1;
    }

    static int a(bb bb1)
    {
        int i1;
        int k1;
        i1 = 0;
        k1 = 0;
        bb1.a();
        JVM INSTR tableswitch 2 11: default 64
    //                   2 68
    //                   3 186
    //                   4 186
    //                   5 186
    //                   6 64
    //                   7 110
    //                   8 141
    //                   9 64
    //                   10 64
    //                   11 141;
           goto _L1 _L2 _L3 _L3 _L3 _L1 _L4 _L5 _L1 _L1 _L5
_L1:
        i1 = 0;
_L7:
        return i1;
_L2:
        int j1;
        bb1 = (p)bb1;
        j1 = 0;
_L8:
        i1 = j1;
        if (k1 >= bb1.c()) goto _L7; else goto _L6
_L6:
        j1 = Math.max(j1, a(((p) (bb1)).b[k1], ((p) (bb1)).c));
        k1++;
          goto _L8
_L4:
        bb1 = (h)bb1;
        i1 = a(((h) (bb1)).l, ((h) (bb1)).e);
        return a(((h) (bb1)).m, ((h) (bb1)).e) + i1;
_L5:
        bb1 = (bm)bb1;
        j1 = 0;
        k1 = i1;
_L10:
        i1 = j1;
        if (k1 >= ((bm) (bb1)).c.length) goto _L7; else goto _L9
_L9:
        j1 = Math.max(j1, a(((bm) (bb1)).c[k1], ((bm) (bb1)).d));
        k1++;
          goto _L10
          goto _L7
_L3:
        return 0;
    }

    private static int a(bk bk1, t t1)
    {
        int l1 = 0;
        if (bk1 == null)
        {
            return 0;
        }
        int i1;
        int j1;
        if (t1 != null && t1.e())
        {
            i1 = t1.d.c;
        } else
        {
            i1 = 10;
        }
        j1 = 0;
        while (l1 < bk1.a()) 
        {
            t1 = bk1.a(l1);
            int k1 = j1;
            if (t1.b())
            {
                if (com.google.android.m4b.maps.bo.d.a(((com.google.android.m4b.maps.bo.bk.a) (t1)).a, 4) && ((com.google.android.m4b.maps.bo.bk.a) (t1)).e.e())
                {
                    k1 = ((com.google.android.m4b.maps.bo.bk.a) (t1)).e.d.c;
                } else
                {
                    k1 = i1;
                }
                k1 = j1 + k1 * ((com.google.android.m4b.maps.bo.bk.a) (t1)).d.length();
            }
            j1 = k1;
            if (t1.a())
            {
                j1 = k1 + 8;
            }
            k1 = j1;
            if (t1.c())
            {
                k1 = (int)((float)j1 + ((com.google.android.m4b.maps.bo.bk.a) (t1)).g);
            }
            l1++;
            j1 = k1;
        }
        return j1;
    }

    private com.google.android.m4b.maps.bo.k a(com.google.android.m4b.maps.bo.k k1)
    {
        ArrayList arraylist = new ArrayList();
        o.a(k1, arraylist);
        int j1 = arraylist.size();
        if (j1 == 0)
        {
            return null;
        }
        if (j1 == 1)
        {
            return (com.google.android.m4b.maps.bo.k)arraylist.get(0);
        }
        k1 = (com.google.android.m4b.maps.bo.k)arraylist.get(0);
        float f1 = k1.c();
        for (int i1 = 1; i1 < j1; i1++)
        {
            float f2 = ((com.google.android.m4b.maps.bo.k)arraylist.get(i1)).c();
            if (f2 > f1)
            {
                k1 = (com.google.android.m4b.maps.bo.k)arraylist.get(i1);
                f1 = f2;
            }
        }

        return k1;
    }

    private void a(int i1)
    {
        com.google.android.m4b.maps.cc.h h1 = (com.google.android.m4b.maps.cc.h)g.get(i1);
        if (e(h1))
        {
            w = w - 1;
        }
        h1.c(e);
        g.set(i1, null);
        t.remove(h1.r());
        if (i1 == s)
        {
            s = -1;
            int j1 = 0x7fffffff;
            for (i1 = 0; i1 < g.size();)
            {
                com.google.android.m4b.maps.cc.h h2 = (com.google.android.m4b.maps.cc.h)g.get(i1);
                int k1 = j1;
                if (h2 != null)
                {
                    k1 = j1;
                    if (h2.q() < j1)
                    {
                        k1 = j1;
                        if (e(h2))
                        {
                            k1 = h2.q();
                            s = i1;
                        }
                    }
                }
                i1++;
                j1 = k1;
            }

        }
    }

    private void a(bb bb1, com.google.android.m4b.maps.br.b b1, boolean flag, boolean flag1)
    {
        if (a(b1)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!(bb1 instanceof p))
        {
            break; /* Loop/switch isn't completed */
        }
        p p1 = (p)bb1;
        bb1 = p1.a;
        m m1 = bb1.a();
        if (f.b(m1))
        {
            com.google.android.m4b.maps.bo.k k2 = a(((com.google.android.m4b.maps.bo.k) (bb1)));
            if (k2 != null && k2.c() > d.g() * d.j * 40F)
            {
                int i1 = 0;
                while (i1 < p1.c()) 
                {
                    n n1 = com.google.android.m4b.maps.cc.n.a(p1, i1, b1, k2.a(0.7F), k2.a(0.3F), flag, b, d, c);
                    bb1 = n1;
                    if (n1 == null)
                    {
                        float f1 = b.c;
                        float f5 = d.b.b - 14.5F;
                        if (f5 > 0.0F)
                        {
                            float f3 = b.b;
                            f1 = f3;
                            if (!y)
                            {
                                f1 = f3 + f5;
                            }
                        }
                        float f4 = d.j;
                        byte byte0;
                        if (b.o)
                        {
                            byte0 = 10;
                        } else
                        {
                            byte0 = 0;
                        }
                        bb1 = com.google.android.m4b.maps.cc.k.a(p1, b1, p1.b[i1], k2, byte0, flag, f1 * f4, b.l, b.a, d, a, b.q);
                    }
                    if (d(bb1) && flag1)
                    {
                        bb1.t();
                    }
                    i1++;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!(bb1 instanceof bm))
        {
            continue; /* Loop/switch isn't completed */
        }
        bb1 = (bm)bb1;
        if (((bm) (bb1)).c.length == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        com.google.android.m4b.maps.bo.k k1 = ((bm) (bb1)).b;
        Object obj = k1.a();
        if (!f.b(((com.google.android.m4b.maps.bo.n) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = a(k1);
        if (k1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        float f2 = com.google.android.m4b.maps.cc.h.a(((bm) (bb1)).d, b.i, b.j, b.k, d.j);
        obj = ((bm) (bb1)).c[0];
        com.google.android.m4b.maps.bx.k.a a1 = b.h;
        bb1 = com.google.android.m4b.maps.cc.k.a(bb1, b1, ((bk) (obj)), k1, 0, flag, f2, b.l, a1, d, a, b.q);
_L5:
        if (d(bb1) && flag1)
        {
            bb1.t();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        bb1 = null;
          goto _L5
        if (!(bb1 instanceof h)) goto _L1; else goto _L6
_L6:
        com.google.android.m4b.maps.bo.g g1;
        bb1 = (h)bb1;
        g1 = ((h) (bb1)).k[0].a;
        if (!f.a(g1)) goto _L8; else goto _L7
_L7:
        boolean flag2;
        com.google.android.m4b.maps.bo.ax ax1 = b(b1);
        boolean flag3;
        if (ax1 != null)
        {
            flag3 = ax1.a(g1);
        } else
        {
            flag3 = false;
        }
        if (flag3) goto _L8; else goto _L9
_L9:
        flag2 = true;
_L10:
        if (flag2)
        {
            if (((h) (bb1)).i > p || ((h) (bb1)).j > -1F && ((h) (bb1)).j <= p && !a(((h) (bb1))))
            {
                bb1 = null;
            } else
            {
                bb1 = com.google.android.m4b.maps.cc.n.a(bb1, b1, flag, d, c, a, b, E);
            }
        } else
        {
            bb1 = null;
        }
        if (d(bb1) && flag1)
        {
            bb1.t();
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
        flag2 = false;
          goto _L10
    }

    private boolean a(h h1)
    {
        return h1.a.a == x && y;
    }

    private boolean a(com.google.android.m4b.maps.br.b b1)
    {
        return b1 == null || A.contains(b1);
    }

    private com.google.android.m4b.maps.bo.ax b(com.google.android.m4b.maps.br.b b1)
    {
        if (F.isEmpty())
        {
            b1 = null;
        } else
        {
            Object obj = b1;
            if (b1 == null)
            {
                obj = n;
            }
            obj = (com.google.android.m4b.maps.bo.ax)F.get(obj);
            b1 = ((com.google.android.m4b.maps.br.b) (obj));
            if (obj == null)
            {
                return (com.google.android.m4b.maps.bo.ax)F.get(n);
            }
        }
        return b1;
    }

    private boolean d(com.google.android.m4b.maps.cc.h h1)
    {
        boolean flag;
label0:
        {
label1:
            {
label2:
                {
                    if (h1 == null)
                    {
                        break label1;
                    }
                    if (t.containsKey(h1.r()))
                    {
                        int i1 = ((Integer)t.get(h1.r())).intValue();
                        com.google.android.m4b.maps.cc.h h2 = (com.google.android.m4b.maps.cc.h)g.get(i1);
                        if (h2 == null)
                        {
                            break label2;
                        }
                        if ((h2 instanceof n) && (h1 instanceof n) && ((n)h1).u() && !((n)h2).u())
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (!flag)
                        {
                            break label2;
                        }
                        a(i1);
                    }
                    h1.a(d, e);
                    if (c(h1) || a(h1))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    while (flag && h1.b(d, e)) 
                    {
                        if (c(h1) || a(h1))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                    }
                    break label0;
                }
                h1.c(e);
            }
            return false;
        }
        if (flag)
        {
            h1.c(e);
            return false;
        } else
        {
            b(h1);
            return true;
        }
    }

    private boolean e(com.google.android.m4b.maps.cc.h h1)
    {
        if (h1.n() >= v)
        {
            if ((h1 = h1.p()) == null || !((com.google.android.m4b.maps.br.b) (h1)).b)
            {
                return true;
            }
        }
        return false;
    }

    public final void a()
    {
        if (k)
        {
            int k1 = g.size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                com.google.android.m4b.maps.cc.h h1 = (com.google.android.m4b.maps.cc.h)g.get(i1);
                if (h1 != null)
                {
                    h1.c(e);
                }
            }

            g.clear();
            s = -1;
            k = false;
            l = false;
            m = false;
        }
        ArrayList arraylist = h;
        h = g;
        g = arraylist;
        int j1 = i;
        i = s;
        s = j1;
        w = 0;
        t.clear();
    }

    public final void a(com.google.android.m4b.maps.bi.b b1, as as1, int i1, f f1, Set set, Set set1, Map map, 
            ah ah)
    {
        long l2;
        l2 = SystemClock.elapsedRealtime();
        d = b1;
        r = null;
        q = f1;
        f = as1;
        x = i1;
        A = set1;
        o = new aw(as1.b());
        as1 = F;
        as1.clear();
        if (!map.isEmpty())
        {
            i1 = map.size();
            as1.put(n, new ay(i1));
            for (f1 = map.keySet().iterator(); f1.hasNext(); as1.put((com.google.android.m4b.maps.br.b)f1.next(), new ay(i1 - 1))) { }
            for (f1 = map.keySet().iterator(); f1.hasNext();)
            {
                set1 = (com.google.android.m4b.maps.br.b)f1.next();
                com.google.android.m4b.maps.bo.ax ax1 = (com.google.android.m4b.maps.bo.ax)map.get(set1);
                Iterator iterator = as1.keySet().iterator();
                while (iterator.hasNext()) 
                {
                    com.google.android.m4b.maps.br.b b2 = (com.google.android.m4b.maps.br.b)iterator.next();
                    if (!b2.equals(set1))
                    {
                        ((ay)as1.get(b2)).a(ax1);
                    }
                }
            }

        }
        float f2 = b1.j;
        f2 = (float)(b1.i * b1.h) / (f2 * f2);
        int j1;
        int l1;
        boolean flag;
        if (f2 > 200000F)
        {
            f2 = (f2 - 200000F) * 1E-04F + 44F;
        } else
        {
            f2 *= 0.00022F;
        }
        i1 = (int)f2;
        if (i1 != u)
        {
            u = i1;
            b1 = a;
            i1 *= 2;
            if (i1 != ((com.google.android.m4b.maps.bw.e) (((k) (b1)).b)).a.size())
            {
                ((k) (b1)).b.a(0);
                b1.b = new com.google.android.m4b.maps.bm.j.a(i1);
            }
        }
        v = d.j * d.j * 200F;
        a();
        B.clear();
        C = null;
        l1 = h.size();
        b1 = new ArrayList(l1);
        p = d.b.b;
        as1 = G.a().a(com.google.android.m4b.maps.bo.g.a(d.d), ah);
        if (x < ((s) (as1)).d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y = flag;
        j1 = 0;
_L9:
        if (j1 >= l1) goto _L2; else goto _L1
_L1:
        as1 = (com.google.android.m4b.maps.cc.h)h.get(j1);
        if (as1 == null) goto _L4; else goto _L3
_L3:
        if (set.contains(as1.s().b())) goto _L6; else goto _L5
_L5:
        if (p < ((com.google.android.m4b.maps.cc.h) (as1)).e)
        {
            i1 = 0;
        } else
        if (!a(as1.p()))
        {
            i1 = 0;
        } else
        if ((!(as1.s() instanceof h) || !a((h)as1.s())) && ((com.google.android.m4b.maps.cc.h) (as1)).f > 0.0F && p >= ((com.google.android.m4b.maps.cc.h) (as1)).f)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        if (i1 != 0) goto _L7; else goto _L6
_L6:
        as1.c(e);
_L4:
        j1++;
        continue; /* Loop/switch isn't completed */
_L7:
        if (as1.a(d, e))
        {
            boolean flag1;
            if (b.r)
            {
                flag1 = f.b(as1.o().a());
            } else
            {
                flag1 = as1.a(f);
            }
            if (flag1 && !c(as1))
            {
                if (!a(((com.google.android.m4b.maps.cc.h) (as1))))
                {
                    b(as1);
                } else
                {
                    as1.c(e);
                }
                continue; /* Loop/switch isn't completed */
            }
        }
        b1.add(as1);
        as1.c(e);
        if (true) goto _L4; else goto _L2
_L2:
        int k1 = b1.size();
        for (i1 = 0; i1 < k1; i1++)
        {
            as1 = (com.google.android.m4b.maps.cc.h)b1.get(i1);
            a(as1.s(), as1.p(), ((com.google.android.m4b.maps.cc.h) (as1)).h, false);
        }

        h.clear();
        i = -1;
        l = false;
        m = false;
        j = a(l2 + 20L);
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final boolean a(long l1)
    {
_L3:
        if (C == null && !q.hasNext() || w >= u && (!q.hasNext() || ((com.google.android.m4b.maps.cc.h)g.get(s)).q() > q.b().a())) goto _L2; else goto _L1
_L1:
        flag1 = z;
        int i1;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        if (SystemClock.elapsedRealtime() >= l1)
        {
            return true;
        }
        if (C != null)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        com.google.android.m4b.maps.br.d d1 = q.a();
        B.add(d1);
        com.google.android.m4b.maps.br.d d3;
        for (; q.hasNext() && q.b().a() == d1.a(); B.add(d3))
        {
            d3 = q.a();
        }

        Collections.sort(B, D);
        C = B.listIterator();
_L4:
        int j1 = i1;
        if (!C.hasNext())
        {
            break MISSING_BLOCK_LABEL_399;
        }
        j1 = i1 + 1;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        if (SystemClock.elapsedRealtime() >= l1)
        {
            return true;
        }
        boolean flag2 = z;
        com.google.android.m4b.maps.br.d d2 = (com.google.android.m4b.maps.br.d)C.next();
        if (w < u || ((com.google.android.m4b.maps.cc.h)g.get(s)).q() < d2.a())
        {
            a(d2.a, d2.b, false, true);
            if (w > u)
            {
                a(s);
            }
            break MISSING_BLOCK_LABEL_434;
        }
        B.clear();
        C = null;
        i1 = j1;
          goto _L3
_L2:
        return false;
        {
            boolean flag1;
            try
            {
                if (h.size() > 0)
                {
                    throw new IllegalStateException("Cannot run labeler loop until all previous labels have either been copied into new label table or destroyed.");
                }
                for (; r != null && r.hasNext() && w < u; a((bb)r.next(), null, true, true))
                {
                    boolean flag = z;
                }

            }
            catch (RuntimeException runtimeexception)
            {
                return false;
            }
            i1 = 0;
        }
          goto _L3
        i1 = j1;
          goto _L4
    }

    public final boolean a(com.google.android.m4b.maps.cc.h h1)
    {
        com.google.android.m4b.maps.bo.n n1;
        m m1;
        com.google.android.m4b.maps.cc.h h2;
        int i1;
        int j1;
        int l1;
        l1 = h1.q();
        com.google.android.m4b.maps.ak.a a1;
        com.google.android.m4b.maps.ak.a a2;
        int i2;
        if (h1.h)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        n1 = h1.o();
        m1 = n1.a();
        i2 = g.size();
        j1 = 0;
        if (j1 >= i2)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        h2 = (com.google.android.m4b.maps.cc.h)g.get(j1);
        if (h2 == null) goto _L2; else goto _L1
_L1:
        a1 = h1.s().b();
        a2 = h2.s().b();
        boolean flag;
        if (a1 != null && a2 != null && (a1 instanceof com.google.android.m4b.maps.ak.a.a) && (a2 instanceof com.google.android.m4b.maps.ak.a.a) && !com.google.android.m4b.maps.ak.a.a.equals(a1) && a1.equals(a2))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        if (h1.e <= h2.e) goto _L6; else goto _L5
_L5:
        a(j1);
_L2:
        j1++;
        break MISSING_BLOCK_LABEL_38;
_L6:
        if (h1.e >= h2.e) goto _L4; else goto _L7
_L7:
        return true;
_L4:
        com.google.android.m4b.maps.bo.n n2 = h2.o();
        if (!n2.a().a(m1) || !n2.a(n1))
        {
            continue; /* Loop/switch isn't completed */
        }
        int k1;
        if (h2.h)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (i1 <= k1 && (i1 != k1 || l1 <= h2.q())) goto _L7; else goto _L8
_L8:
        a(j1);
        if (true) goto _L2; else goto _L9
_L9:
        return false;
    }

    public final void b(com.google.android.m4b.maps.cc.h h1)
    {
        if (e(h1))
        {
            w = w + 1;
            if (s < 0 || h1.q() < ((com.google.android.m4b.maps.cc.h)g.get(s)).q())
            {
                s = g.size();
            }
        }
        g.add(h1);
        t.put(h1.r(), Integer.valueOf(g.size() - 1));
    }

    public final boolean c(com.google.android.m4b.maps.cc.h h1)
    {
        com.google.android.m4b.maps.bo.ax ax1 = b(h1.p());
        if (ax1 != null)
        {
            return ax1.a(h1.o());
        } else
        {
            return false;
        }
    }

}
