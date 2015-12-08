// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public final class jlf
    implements jkd, jko
{

    private final jnl b;
    private final jnl c = new jnl(4);
    private final jnl d = new jnl(16);
    private final Stack e = new Stack();
    private int f;
    private int g;
    private long h;
    private int i;
    private jnl j;
    private int k;
    private int l;
    private int m;
    private jkf n;
    private jlg o[];

    public jlf()
    {
        b = new jnl(jnj.a);
        c();
    }

    private int b(jke jke1, jkk jkk1)
    {
        long l3 = 0x7fffffffffffffffL;
        int i1 = 0;
        int j1 = -1;
        while (i1 < o.length) 
        {
            jlg jlg1 = o[i1];
            int k2 = jlg1.d;
            int i2 = j1;
            long l4 = l3;
            if (k2 != jlg1.b.a)
            {
                long l6 = jlg1.b.b[k2];
                i2 = j1;
                l4 = l3;
                if (l6 < l3)
                {
                    l4 = l6;
                    i2 = i1;
                }
            }
            i1++;
            j1 = i2;
            l3 = l4;
        }
        if (j1 == -1)
        {
            return -1;
        }
        jlg jlg2 = o[j1];
        jkq jkq1 = jlg2.c;
        i1 = jlg2.d;
        l3 = jlg2.b.b[i1];
        long l5 = (l3 - jke1.b()) + (long)l;
        if (l5 < 0L || l5 >= 0x40000L)
        {
            jkk1.a = l3;
            return 1;
        }
        jke1.a((int)l5);
        k = jlg2.b.c[i1];
        if (jlg2.a.j != -1)
        {
            jkk1 = c.a;
            jkk1[0] = 0;
            jkk1[1] = 0;
            jkk1[2] = 0;
            int k1 = jlg2.a.j;
            int j2 = 4 - jlg2.a.j;
            while (l < k) 
            {
                if (m == 0)
                {
                    jke1.b(c.a, j2, k1);
                    c.b(0);
                    m = c.j();
                    b.b(0);
                    jkq1.a(b, 4);
                    l = l + 4;
                    k = k + j2;
                } else
                {
                    int l2 = jkq1.a(jke1, m, false);
                    l = l + l2;
                    m = m - l2;
                }
            }
        } else
        {
            while (l < k) 
            {
                int l1 = jkq1.a(jke1, k - l, false);
                l = l + l1;
                m = m - l1;
            }
        }
        jkq1.a(jlg2.b.e[i1], jlg2.b.f[i1], k, 0, null);
        jlg2.d = jlg2.d + 1;
        l = 0;
        m = 0;
        return 0;
    }

    private void c()
    {
        f = 1;
        i = 0;
    }

    public final int a(jke jke1, jkk jkk1)
    {
_L5:
        f;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 39
    //                   1 65
    //                   2 582;
           goto _L1 _L2 _L3 _L4
_L1:
        return b(jke1, jkk1);
_L2:
        if (jke1.b() == 0L)
        {
            c();
        } else
        {
            f = 3;
        }
          goto _L5
_L3:
        if (i != 0) goto _L7; else goto _L6
_L6:
        if (jke1.a(d.a, 0, 8, true)) goto _L9; else goto _L8
_L8:
        int i1 = 0;
_L11:
        if (i1 != 0) goto _L5; else goto _L10
_L10:
        return -1;
_L9:
        i = 8;
        d.b(0);
        h = d.g();
        g = d.h();
_L7:
        if (h == 1L)
        {
            jke1.b(d.a, 8, 8);
            i = i + 8;
            h = d.k();
        }
        i1 = g;
        if (i1 == jkx.x || i1 == jkx.z || i1 == jkx.A || i1 == jkx.B || i1 == jkx.C)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            long l1 = jke1.b();
            long l3 = h;
            long l5 = i;
            e.add(new jky(g, (l1 + l3) - l5));
            c();
        } else
        {
            i1 = g;
            boolean flag;
            if (i1 == jkx.K || i1 == jkx.y || i1 == jkx.L || i1 == jkx.ab || i1 == jkx.ac || i1 == jkx.M || i1 == jkx.b || i1 == jkx.D || i1 == jkx.i || i1 == jkx.F || i1 == jkx.ae || i1 == jkx.af || i1 == jkx.ag || i1 == jkx.ah || i1 == jkx.ai || i1 == jkx.aj || i1 == jkx.ak || i1 == jkx.J || i1 == jkx.f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                boolean flag1;
                if (i == 8)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                c.b(flag1);
                if (h <= 0x7fffffffL)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                c.b(flag1);
                j = new jnl((int)h);
                System.arraycopy(d.a, 0, j.a, 0, 8);
                f = 2;
            } else
            {
                j = null;
                f = 2;
            }
        }
        i1 = 1;
          goto _L11
_L4:
        jky jky1;
        long l2 = h - (long)i;
        long l4 = jke1.b();
        int j1 = 0;
        Object obj;
        Object obj1;
        Object obj2;
        if (j != null)
        {
            jke1.b(j.a, i, (int)l2);
            flag = j1;
            if (!e.isEmpty())
            {
                ((jky)e.peek()).a(new jkz(g, j));
                flag = j1;
            }
        } else
        if (l2 < 0x40000L)
        {
            jke1.a((int)l2);
            flag = j1;
        } else
        {
            jkk1.a = jke1.b() + l2;
            flag = true;
        }
_L16:
        if (e.isEmpty() || ((jky)e.peek()).ao != l4 + l2) goto _L13; else goto _L12
_L12:
        jky1 = (jky)e.pop();
        if (jky1.an != jkx.x) goto _L15; else goto _L14
_L14:
        ArrayList arraylist = new ArrayList();
        for (flag = false; flag < jky1.aq.size(); flag++)
        {
            obj1 = (jky)jky1.aq.get(flag);
            if (((jky) (obj1)).an == jkx.z)
            {
                obj = b.a(((jky) (obj1)), jky1.d(jkx.y));
                if (obj != null)
                {
                    obj2 = b.a(((jli) (obj)), ((jky) (obj1)).e(jkx.A).e(jkx.B).e(jkx.C));
                    if (((jll) (obj2)).a != 0)
                    {
                        obj1 = new jlg(((jli) (obj)), ((jll) (obj2)), n.c(flag));
                        j1 = ((jll) (obj2)).d;
                        obj2 = ((jlg) (obj1)).c;
                        obj = ((jli) (obj)).h;
                        ((jkq) (obj2)).a(new jjh(((jjh) (obj)).a, ((jjh) (obj)).b, ((jjh) (obj)).c, j1 + 30, ((jjh) (obj)).d, ((jjh) (obj)).g, ((jjh) (obj)).h, ((jjh) (obj)).k, ((jjh) (obj)).l, ((jjh) (obj)).m, ((jjh) (obj)).n, ((jjh) (obj)).o, ((jjh) (obj)).p, ((jjh) (obj)).e, ((jjh) (obj)).f, ((jjh) (obj)).i, ((jjh) (obj)).j));
                        arraylist.add(obj1);
                    }
                }
            }
        }

        o = (jlg[])arraylist.toArray(new jlg[0]);
        n.g();
        n.a(this);
        e.clear();
        f = 3;
        flag = false;
_L17:
        if (flag != 0)
        {
            return 1;
        }
          goto _L5
_L15:
        if (!e.isEmpty())
        {
            ((jky)e.peek()).a(jky1);
        }
          goto _L16
_L13:
        c();
          goto _L17
    }

    public final long a(long l1)
    {
        int k1;
        long l2;
        l2 = 0x7fffffffffffffffL;
        k1 = 0;
_L11:
        jll jll1;
        int i1;
        if (k1 >= o.length)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        jll1 = o[k1].b;
        i1 = jno.a(jll1.e, l1, true, false);
_L8:
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        if (jll1.e[i1] > l1 || (jll1.f[i1] & 1) == 0) goto _L4; else goto _L3
_L3:
        int j1 = i1;
        if (i1 != -1) goto _L6; else goto _L5
_L5:
        j1 = jno.b(jll1.e, l1, true, false);
_L9:
        if (j1 >= jll1.e.length)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        if (jll1.e[j1] < l1 || (jll1.f[j1] & 1) == 0) goto _L7; else goto _L6
_L6:
        o[k1].d = j1;
        long l4 = jll1.b[o[k1].d];
        long l3 = l2;
        if (l4 < l2)
        {
            l3 = l4;
        }
        k1++;
        l2 = l3;
        continue; /* Loop/switch isn't completed */
_L4:
        i1--;
          goto _L8
_L2:
        i1 = -1;
          goto _L3
_L7:
        j1++;
          goto _L9
        j1 = -1;
          goto _L6
        return l2;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final void a(jkf jkf1)
    {
        n = jkf1;
    }

    public final boolean a()
    {
        return true;
    }

    public final boolean a(jke jke1)
    {
        return jlh.b(jke1);
    }

    public final void b()
    {
        e.clear();
        i = 0;
        l = 0;
        m = 0;
        f = 0;
    }
}
