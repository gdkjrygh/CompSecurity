// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.b:
//            aB, aK, aJ, aA, 
//            aF

public static final class n extends aB
{

    public long a;
    public long b;
    public String c;
    public int d;
    public int e;
    public boolean f;
    public b g[];
    public b h;
    public byte i[];
    public byte j[];
    public byte k[];
    public b l;
    public String o;
    public long p;
    public b q;
    public byte r[];
    public int s;
    public int t[];

    protected final int a()
    {
        boolean flag = false;
        int i1 = super.a();
        int j1 = i1;
        if (a != 0L)
        {
            j1 = i1 + aA.b(1, a);
        }
        i1 = j1;
        if (!c.equals(""))
        {
            i1 = j1 + aA.b(2, c);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1;
            if (g.length > 0)
            {
                for (j1 = 0; j1 < g.length;)
                {
                    n n = g[j1];
                    int k1 = i1;
                    if (n != null)
                    {
                        k1 = i1 + aA.b(3, n);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (!Arrays.equals(i, aJ.h))
        {
            i1 = j1 + aA.b(6, i);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + aA.b(7, l);
        }
        i1 = j1;
        if (!Arrays.equals(j, aJ.h))
        {
            i1 = j1 + aA.b(8, j);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + aA.b(9, h);
        }
        i1 = j1;
        if (f)
        {
            i1 = j1 + (aA.b(10) + 1);
        }
        j1 = i1;
        if (d != 0)
        {
            j1 = i1 + aA.b(11, d);
        }
        i1 = j1;
        if (e != 0)
        {
            i1 = j1 + aA.b(12, e);
        }
        j1 = i1;
        if (!Arrays.equals(k, aJ.h))
        {
            j1 = i1 + aA.b(13, k);
        }
        i1 = j1;
        if (!o.equals(""))
        {
            i1 = j1 + aA.b(14, o);
        }
        j1 = i1;
        if (p != 0x2bf20L)
        {
            long l2 = p;
            j1 = aA.b(15);
            j1 = i1 + (aA.b(aA.c(l2)) + j1);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + aA.b(16, q);
        }
        j1 = i1;
        if (b != 0L)
        {
            j1 = i1 + aA.b(17, b);
        }
        int l1 = j1;
        if (!Arrays.equals(r, aJ.h))
        {
            l1 = j1 + aA.b(18, r);
        }
        i1 = l1;
        if (s != 0)
        {
            i1 = l1 + aA.b(19, s);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1;
            if (t.length > 0)
            {
                int i2 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < t.length; j1++)
                {
                    i2 += aA.a(t[j1]);
                }

                j1 = i1 + i2 + t.length * 2;
            }
        }
        return j1;
    }

    public final void a(aA aa)
        throws IOException
    {
        boolean flag = false;
        if (a != 0L)
        {
            aa.a(1, a);
        }
        if (!c.equals(""))
        {
            aa.a(2, c);
        }
        if (g != null && g.length > 0)
        {
            for (int i1 = 0; i1 < g.length; i1++)
            {
                t t1 = g[i1];
                if (t1 != null)
                {
                    aa.a(3, t1);
                }
            }

        }
        if (!Arrays.equals(i, aJ.h))
        {
            aa.a(6, i);
        }
        if (l != null)
        {
            aa.a(7, l);
        }
        if (!Arrays.equals(j, aJ.h))
        {
            aa.a(8, j);
        }
        if (h != null)
        {
            aa.a(9, h);
        }
        if (f)
        {
            aa.a(10, f);
        }
        if (d != 0)
        {
            aa.a(11, d);
        }
        if (e != 0)
        {
            aa.a(12, e);
        }
        if (!Arrays.equals(k, aJ.h))
        {
            aa.a(13, k);
        }
        if (!o.equals(""))
        {
            aa.a(14, o);
        }
        if (p != 0x2bf20L)
        {
            long l1 = p;
            aa.c(15, 0);
            aa.a(aA.c(l1));
        }
        if (q != null)
        {
            aa.a(16, q);
        }
        if (b != 0L)
        {
            aa.a(17, b);
        }
        if (!Arrays.equals(r, aJ.h))
        {
            aa.a(18, r);
        }
        if (s != 0)
        {
            aa.a(19, s);
        }
        if (t != null && t.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < t.length; j1++)
            {
                aa.a(20, t[j1]);
            }

        }
        super.a(aa);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof t)) goto _L4; else goto _L3
_L3:
        obj = (t)obj;
        flag = flag1;
        if (a != ((a) (obj)).a) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (b != ((b) (obj)).b) goto _L4; else goto _L6
_L6:
        if (c != null) goto _L8; else goto _L7
_L7:
        flag = flag1;
        if (((c) (obj)).c != null) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (d != ((d) (obj)).d) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (e != ((e) (obj)).e) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (f != ((f) (obj)).f) goto _L4; else goto _L12
_L12:
        flag = flag1;
        if (!aF.a(g, ((g) (obj)).g)) goto _L4; else goto _L13
_L13:
        if (h != null) goto _L15; else goto _L14
_L14:
        flag = flag1;
        if (((h) (obj)).h != null) goto _L4; else goto _L16
_L16:
        flag = flag1;
        if (!Arrays.equals(i, ((i) (obj)).i)) goto _L4; else goto _L17
_L17:
        flag = flag1;
        if (!Arrays.equals(j, ((j) (obj)).j)) goto _L4; else goto _L18
_L18:
        flag = flag1;
        if (!Arrays.equals(k, ((k) (obj)).k)) goto _L4; else goto _L19
_L19:
        if (l != null) goto _L21; else goto _L20
_L20:
        flag = flag1;
        if (((l) (obj)).l != null) goto _L4; else goto _L22
_L22:
        if (o != null) goto _L24; else goto _L23
_L23:
        flag = flag1;
        if (((o) (obj)).o != null) goto _L4; else goto _L25
_L25:
        flag = flag1;
        if (p != ((p) (obj)).p) goto _L4; else goto _L26
_L26:
        if (q != null)
        {
            break MISSING_BLOCK_LABEL_365;
        }
        flag = flag1;
        if (((q) (obj)).q != null) goto _L4; else goto _L27
_L27:
        flag = flag1;
        if (Arrays.equals(r, ((r) (obj)).r))
        {
            flag = flag1;
            if (s == ((s) (obj)).s)
            {
                flag = flag1;
                if (aF.a(t, ((t) (obj)).t))
                {
                    return a(((aB) (obj)));
                }
            }
        }
          goto _L4
_L8:
        if (!c.equals(((c) (obj)).c))
        {
            return false;
        }
          goto _L9
_L15:
        if (!h.equals(((equals) (obj)).h))
        {
            return false;
        }
          goto _L16
_L21:
        if (!l.equals(((equals) (obj)).l))
        {
            return false;
        }
          goto _L22
_L24:
        if (!o.equals(((o) (obj)).o))
        {
            return false;
        }
          goto _L25
        if (!q.equals(((equals) (obj)).q))
        {
            return false;
        }
          goto _L27
    }

    public final int hashCode()
    {
        int i2 = 0;
        int j2 = (int)(a ^ a >>> 32);
        int k2 = (int)(b ^ b >>> 32);
        int i1;
        char c1;
        int j1;
        int k1;
        int l1;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        if (c == null)
        {
            i1 = 0;
        } else
        {
            i1 = c.hashCode();
        }
        l2 = d;
        i3 = e;
        if (f)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        j3 = aF.a(g);
        if (h == null)
        {
            j1 = 0;
        } else
        {
            j1 = h.hashCode();
        }
        k3 = Arrays.hashCode(i);
        l3 = Arrays.hashCode(j);
        i4 = Arrays.hashCode(k);
        if (l == null)
        {
            k1 = 0;
        } else
        {
            k1 = l.hashCode();
        }
        if (o == null)
        {
            l1 = 0;
        } else
        {
            l1 = o.hashCode();
        }
        j4 = (int)(p ^ p >>> 32);
        if (q != null)
        {
            i2 = q.hashCode();
        }
        return ((((((l1 + (k1 + ((((j1 + ((c1 + (((i1 + ((j2 + 527) * 31 + k2) * 31) * 31 + l2) * 31 + i3) * 31) * 31 + j3) * 31) * 31 + k3) * 31 + l3) * 31 + i4) * 31) * 31) * 31 + j4) * 31 + i2) * 31 + Arrays.hashCode(r)) * 31 + s) * 31 + aF.a(t)) * 31 + b();
    }

    public ()
    {
        a = 0L;
        b = 0L;
        c = "";
        d = 0;
        e = 0;
        f = false;
        g = f();
        h = null;
        i = aJ.h;
        j = aJ.h;
        k = aJ.h;
        l = null;
        o = "";
        p = 0x2bf20L;
        q = null;
        r = aJ.h;
        s = 0;
        t = aJ.a;
        m = null;
        n = -1;
    }
}
