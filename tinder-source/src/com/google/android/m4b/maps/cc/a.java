// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import android.util.Log;
import com.google.android.m4b.maps.ak.c;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bm.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.e;
import com.google.android.m4b.maps.bm.j;
import com.google.android.m4b.maps.bm.l;
import com.google.android.m4b.maps.bn.g;
import com.google.android.m4b.maps.bn.i;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bn.m;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ak;
import com.google.android.m4b.maps.bo.au;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bo.bj;
import com.google.android.m4b.maps.bo.bm;
import com.google.android.m4b.maps.bo.s;
import com.google.android.m4b.maps.bo.t;
import com.google.android.m4b.maps.bx.ag;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            d

public final class com.google.android.m4b.maps.cc.a extends com.google.android.m4b.maps.cc.d
{
    static final class a
    {

        final k a;
        final com.google.android.m4b.maps.bn.c b;
        final g c;
        final k d;
        final g e;
        final int f;

        private void a(com.google.android.m4b.maps.bo.m m1, au au1, b b1)
        {
            if (au1.d.c() != 0)
            {
                au1 = au1.b;
                int k1 = au1.a();
                if (k1 != 0)
                {
                    int i1 = m1.c().a;
                    int j1 = (int)b1.d;
                    int l1 = m1.c().b;
                    com.google.android.m4b.maps.bo.g g1 = new com.google.android.m4b.maps.bo.g(i1 + j1, (int)b1.e + l1);
                    l1 = m1.f();
                    m1 = ((com.google.android.m4b.maps.bo.g[])com.google.android.m4b.maps.cc.a.c().get())[0];
                    com.google.android.m4b.maps.bo.g g2 = ((com.google.android.m4b.maps.bo.g[])com.google.android.m4b.maps.cc.a.c().get())[1];
                    com.google.android.m4b.maps.bo.g g3 = ((com.google.android.m4b.maps.bo.g[])com.google.android.m4b.maps.cc.a.c().get())[2];
                    j1 = 0;
                    i1 = 0;
                    for (; j1 < k1; j1++)
                    {
                        au1.a(j1, g1, m1, g2, g3);
                        d.a(m1, l1);
                        d.a(g2, l1);
                        d.a(g3, l1);
                        i1 += 3;
                    }

                    if (b1.c)
                    {
                        j1 = 0x10000;
                    } else
                    {
                        j1 = 0;
                    }
                    e.a(j1, 0, i1);
                    return;
                }
            }
        }

        public a(com.google.android.m4b.maps.bo.m m1, List list, List list1, b b1)
        {
            int i1 = com.google.android.m4b.maps.bm.e.a(list);
            a = new m(i1);
            c = new i(i1);
            b = new com.google.android.m4b.maps.bn.e(com.google.android.m4b.maps.bm.e.b(list));
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) 
            {
                list = (com.google.android.m4b.maps.bo.k)iterator.next();
                com.google.android.m4b.maps.bo.g g1 = new com.google.android.m4b.maps.bo.g(m1.c().a + (int)b1.d, m1.c().b + (int)b1.e);
                int k1 = m1.f();
                float f1;
                float f2;
                e e1;
                int j1;
                if (b1.c)
                {
                    i1 = 0x10000;
                } else
                {
                    i1 = 0;
                }
                if (b1.c)
                {
                    j1 = 0;
                } else
                {
                    j1 = 0x10000;
                }
                if (b1.g > 0.0F)
                {
                    list = list.c(b1.g);
                }
                e1 = com.google.android.m4b.maps.bm.e.a();
                if (b1.c)
                {
                    f1 = b1.b;
                } else
                {
                    f1 = b1.a;
                }
                if (b1.c)
                {
                    f2 = b1.a;
                } else
                {
                    f2 = b1.b;
                }
                e1.a(list, f1, f2, g1, k1, i1, j1, a, b, c);
            }
            list = list1.iterator();
            for (i1 = 0; list.hasNext(); i1 = com.google.android.m4b.maps.cc.a.a((au)list.next()) + i1) { }
            if (b1.f && i1 > 0)
            {
                d = new m(i1);
                e = new i(i1);
                for (list = list1.iterator(); list.hasNext(); a(m1, (au)list.next(), b1)) { }
            } else
            {
                d = null;
                e = null;
            }
            f = b1.h;
        }
    }

    static final class b
    {

        final float a;
        final float b;
        final boolean c;
        final float d;
        final float e;
        final boolean f;
        final float g = 0.0F;
        final int h;

        public b(float f1, float f2, boolean flag, float f3, float f4, boolean flag1, int i1)
        {
            a = f1;
            b = f2;
            c = flag;
            d = f3;
            e = f4;
            f = flag1;
            h = i1;
        }
    }


    private static final int c[] = {
        0, 2, 2, 4, 2, 4, 4, 6
    };
    private static int d = 16384;
    private static final t l;
    private static final t m;
    private static final ThreadLocal n = new ThreadLocal() {

        protected final Object initialValue()
        {
            return (new com.google.android.m4b.maps.bo.g[] {
                new com.google.android.m4b.maps.bo.g(), new com.google.android.m4b.maps.bo.g(), new com.google.android.m4b.maps.bo.g()
            });
        }

    };
    private final k e;
    private final k f;
    private final com.google.android.m4b.maps.bm.b g;
    private final com.google.android.m4b.maps.bm.b h;
    private com.google.android.m4b.maps.cf.l i;
    private com.google.android.m4b.maps.cf.l j;
    private final a k;

    private com.google.android.m4b.maps.cc.a(int i1, int j1, Set set, a a1, d d1)
    {
        super(set);
        j = null;
        i = null;
        f = new m(i1, (byte)0);
        e = new m(j1, (byte)0);
        h = new com.google.android.m4b.maps.bm.b(i1, d1.A);
        g = new com.google.android.m4b.maps.bm.b(j1, d1.A);
        k = a1;
    }

    static int a(au au1)
    {
        if (au1.d.c() == 0)
        {
            return 0;
        } else
        {
            return au1.b.a() * 3;
        }
    }

    public static com.google.android.m4b.maps.cc.a a(ac ac1, String as[], com.google.android.m4b.maps.bo.ap.b b1, j.a a1, b b2, d d1)
    {
        com.google.android.m4b.maps.bo.m m1 = ac1.d();
        ArrayList arraylist1 = new ArrayList();
        HashSet hashset = new HashSet();
        ArrayList arraylist;
        int i1;
        int j1;
        if (b2 != null)
        {
            arraylist = new ArrayList();
        } else
        {
            arraylist = null;
        }
        j1 = 0;
        i1 = 0;
        do
        {
            if (b1.hasNext())
            {
                bb bb1 = b1.a();
                if (bb1 instanceof au)
                {
                    Object obj = (au)bb1;
                    int l1 = a(((au) (obj)));
                    int k1 = c(((au) (obj)));
                    if (l1 > d || k1 > d)
                    {
                        if (ab.a("GLAreaGroup", 3))
                        {
                            obj = String.valueOf(ac1);
                            int i2 = d;
                            Log.d("GLAreaGroup", (new StringBuilder(String.valueOf(obj).length() + 132)).append("unable to handle the Area with fillVertexCount = ").append(l1).append(" and strokeVertexCount = ").append(k1).append(" for ").append(((String) (obj))).append(" since the limit is ").append(i2).toString());
                        }
                        b1.next();
                        continue;
                    }
                    if (j1 + l1 <= d && i1 + k1 <= d)
                    {
                        j1 += l1;
                        k1 = i1 + k1;
                        int ai[] = bb1.f();
                        l1 = ai.length;
                        for (i1 = 0; i1 < l1; i1++)
                        {
                            int j2 = ai[i1];
                            if (j2 >= 0 && j2 < as.length)
                            {
                                hashset.add(as[j2]);
                            }
                        }

                        arraylist1.add(obj);
                        boolean flag;
                        if (b2 != null && ((au) (obj)).h())
                        {
                            i1 = 1;
                        } else
                        {
                            i1 = 0;
                        }
                        flag = b(((au) (obj)));
                        if ((i1 != 0 || !flag) && ((au) (obj)).c())
                        {
                            List list = com.google.android.m4b.maps.bm.l.a(((au) (obj)).b, ((au) (obj)).c);
                            if (!flag)
                            {
                                a(a1, ((au) (obj)), list, null);
                            }
                            if (((au) (obj)).h())
                            {
                                a(a1, ((au) (obj)), list, ac1);
                            }
                            if (i1 != 0)
                            {
                                arraylist.addAll(list);
                            }
                        }
                        b1.next();
                        i1 = k1;
                        continue;
                    }
                }
            }
            as = null;
            ac1 = as;
            if (arraylist != null)
            {
                ac1 = as;
                if (!arraylist.isEmpty())
                {
                    ac1 = new ArrayList();
                    as = arraylist1.iterator();
                    do
                    {
                        if (!as.hasNext())
                        {
                            break;
                        }
                        b1 = (au)as.next();
                        if (b1.h())
                        {
                            ac1.add(b1);
                        }
                    } while (true);
                    ac1 = new a(m1, arraylist, ac1, b2);
                }
            }
            ac1 = new com.google.android.m4b.maps.cc.a(j1, i1, hashset, ac1, d1);
            for (as = arraylist1.iterator(); as.hasNext(); ac1.a(m1, (au)as.next())) { }
            return ac1;
        } while (true);
    }

    public static void a(d d1, com.google.android.m4b.maps.bx.ab ab1)
    {
        if (!ab1.c.c())
        {
            d1.c();
        }
        d1.a.glLineWidthx(0x10000);
        d1.a.glBlendFunc(1, 771);
        d1.a.glTexEnvx(8960, 8704, 8448);
        d1.a.glColor4x(0x10000, 0x10000, 0x10000, 0x10000);
    }

    private void a(com.google.android.m4b.maps.bo.m m1, au au1)
    {
        Object obj = au1.d;
        ak ak1 = au1.b;
        int k2 = ak1.a();
        if (k2 != 0)
        {
            boolean flag;
            boolean flag1;
            if (((t) (obj)).c() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = b(au1);
            if (flag || flag1)
            {
                com.google.android.m4b.maps.bo.g g1 = m1.c();
                int l2 = m1.f();
                com.google.android.m4b.maps.bo.g g2;
                int i1;
                int j1;
                int k1;
                int l1;
                if (flag)
                {
                    k1 = ((t) (obj)).b[0];
                } else
                {
                    k1 = 0;
                }
                if (flag1)
                {
                    l1 = ((t) (obj)).c[0].a;
                } else
                {
                    l1 = 0;
                }
                m1 = au1.c;
                j1 = 0;
                i1 = 0;
                au1 = ((com.google.android.m4b.maps.bo.g[])n.get())[0];
                obj = ((com.google.android.m4b.maps.bo.g[])n.get())[1];
                g2 = ((com.google.android.m4b.maps.bo.g[])n.get())[2];
                for (int i2 = 0; i2 < k2;)
                {
                    ak1.a(i2, g1, au1, ((com.google.android.m4b.maps.bo.g) (obj)), g2);
                    int j2 = j1;
                    if (flag)
                    {
                        f.a(au1, l2);
                        f.a(((com.google.android.m4b.maps.bo.g) (obj)), l2);
                        f.a(g2, l2);
                        j2 = j1 + 3;
                    }
                    j1 = i1;
                    if (flag1)
                    {
                        j1 = i1;
                        if ((m1[i2] & 1) != 0)
                        {
                            e.a(au1, l2);
                            e.a(((com.google.android.m4b.maps.bo.g) (obj)), l2);
                            j1 = i1 + 2;
                        }
                        i1 = j1;
                        if ((m1[i2] & 2) != 0)
                        {
                            e.a(((com.google.android.m4b.maps.bo.g) (obj)), l2);
                            e.a(g2, l2);
                            i1 = j1 + 2;
                        }
                        j1 = i1;
                        if ((m1[i2] & 4) != 0)
                        {
                            e.a(g2, l2);
                            e.a(au1, l2);
                            j1 = i1 + 2;
                        }
                    }
                    i2++;
                    i1 = j1;
                    j1 = j2;
                }

                h.a(k1, j1);
                g.a(l1, i1);
                return;
            }
        }
    }

    private static void a(j.a a1, au au1, List list, ac ac1)
    {
        Object obj;
        if (ac1 != null)
        {
            com.google.android.m4b.maps.ak.c c1 = ((bj)ac1.a(com.google.android.m4b.maps.bo.bd.a.d)).a.a;
            if ((float)ac1.a > 18F)
            {
                ac1 = l;
            } else
            {
                ac1 = m;
            }
            obj = ac1;
            ac1 = c1;
        } else
        {
            ac1 = au1.a;
            obj = au1.d;
        }
        if (au1.b.a() != 0 && ((t) (obj)).b() != 0 && au1.c())
        {
            int i1 = au1.g;
            int j1 = au1.e;
            String s1 = au1.f;
            au1 = au1.i;
            list = list.iterator();
            while (list.hasNext()) 
            {
                Object obj1 = (com.google.android.m4b.maps.bo.k)list.next();
                boolean flag;
                if (ac1 != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = new bm(-1, ac1, ((com.google.android.m4b.maps.bo.k) (obj1)), null, ((t) (obj)), j1, s1, i1, 0.0F, 0, au1, flag);
                a1.a.add(new j.c((bm)obj1, a1.b));
            }
        }
    }

    private static boolean b(au au1)
    {
        t t1 = au1.d;
        if (t1.b() != 0 && au1.c()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1 = 0;
_L5:
        if (i1 >= t1.b())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (t1.c[i1].b > 1.0F) goto _L1; else goto _L3
_L3:
        au1 = t1.c[i1];
        boolean flag;
        if (((s) (au1)).c != null && ((s) (au1)).c.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L1; else goto _L4
_L4:
        i1++;
          goto _L5
        return true;
    }

    private static int c(au au1)
    {
        int i1 = 0;
        if (!b(au1))
        {
            return 0;
        }
        au1 = au1.c;
        int j1 = 0;
        for (; i1 < au1.length; i1++)
        {
            byte byte0 = au1[i1];
            j1 += c[byte0 & 7];
        }

        return j1;
    }

    static ThreadLocal c()
    {
        return n;
    }

    public final int a()
    {
        int j1 = 0;
        int i1 = 0;
        int k1 = e.c();
        int l1 = f.c();
        int i2 = g.a.b();
        int j2 = h.a.b();
        if (k != null)
        {
            a a1 = k;
            int k2 = a1.a.c();
            int l2 = a1.b.c();
            int i3 = a1.c.b();
            if (a1.d != null)
            {
                i1 = a1.d.c();
            } else
            {
                i1 = 0;
            }
            if (a1.e != null)
            {
                j1 = a1.e.b();
            }
            i1 = j1 + (i1 + (i3 + (k2 + l2)));
        }
        return j2 + (k1 + l1 + i2) + i1;
    }

    public final void a(d d1, com.google.android.m4b.maps.bi.b b1, com.google.android.m4b.maps.bx.ab ab1)
    {
        b1 = d1.a;
        ab1 = ab1.c;
        if (!ab1.a()) goto _L2; else goto _L1
_L1:
        com.google.android.m4b.maps.bm.a.c(d1);
        if (f.a() > 0)
        {
            f.d(d1);
            h.a(d1);
            b1.glDrawArrays(4, 0, f.a());
        }
        if (e.a() > 0)
        {
            e.d(d1);
            g.a(d1);
            b1.glDrawArrays(1, 0, e.a());
        }
        com.google.android.m4b.maps.bm.a.d(d1);
_L4:
        return;
_L2:
        if (!ab1.c())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f.a() > 0)
        {
            f.d(d1);
            b1.glDrawArrays(4, 0, f.a());
        }
        if (e.a() <= 0) goto _L4; else goto _L3
_L3:
        e.d(d1);
        b1.glDrawArrays(1, 0, e.a());
        return;
        if (!ab1.b() || k == null) goto _L4; else goto _L5
_L5:
        b1 = k;
        com.google.android.m4b.maps.bm.c.a(d1.a, ((a) (b1)).f);
        d1.C.a[23].a(d1.a);
        ((a) (b1)).a.d(d1);
        ((a) (b1)).c.d(d1);
        ((a) (b1)).b.a(d1, 4);
        if (((a) (b1)).d != null && ((a) (b1)).e != null)
        {
            ((a) (b1)).d.d(d1);
            ((a) (b1)).e.d(d1);
            d1.a.glDrawArrays(4, 0, ((a) (b1)).d.a());
        }
        d1.a.glColor4x(0x10000, 0x10000, 0x10000, 0x10000);
        return;
    }

    public final int b()
    {
        int j1 = 0;
        int i1 = 0;
        int k1 = e.d();
        int l1 = f.d();
        int i2 = g.a();
        int j2 = h.a();
        if (k != null)
        {
            a a1 = k;
            int k2 = a1.a.d();
            int l2 = a1.b.d();
            int i3 = a1.c.c();
            if (a1.d != null)
            {
                i1 = a1.d.d();
            } else
            {
                i1 = 0;
            }
            if (a1.e != null)
            {
                j1 = a1.e.c();
            }
            i1 = j1 + (i1 + (i3 + (k2 + 156 + l2)));
        }
        return j2 + (k1 + 156 + l1 + i2) + i1;
    }

    public final void b(d d1)
    {
        f.b(d1);
        e.b(d1);
        h.b(d1);
        g.b(d1);
        if (k != null)
        {
            a a1 = k;
            a1.a.b(d1);
            a1.b.b(d1);
            a1.c.b(d1);
        }
    }

    public final void c(d d1)
    {
        f.c(d1);
        e.c(d1);
        h.c(d1);
        g.c(d1);
        if (k != null)
        {
            a a1 = k;
            a1.a.c(d1);
            a1.b.c(d1);
            a1.c.c(d1);
        }
    }

    static 
    {
        s s1 = new s(0xffba8b61, 2.0F, new int[0], 0);
        l = new t(-1, 2, new int[0], new s[] {
            s1
        }, null, null, null, null);
        s1 = new s(0xffba8b61, 1.5F, new int[0], 0);
        m = new t(-1, 2, new int[0], new s[] {
            s1
        }, null, null, null, null);
    }
}
