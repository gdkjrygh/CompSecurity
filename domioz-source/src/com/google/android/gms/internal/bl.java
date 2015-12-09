// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            nj, nr, nn, nh

public final class bl extends nj
{

    private static volatile bl m[];
    public int a;
    public String b;
    public bl c[];
    public bl d[];
    public bl e[];
    public String f;
    public String g;
    public long h;
    public boolean i;
    public bl j[];
    public int k[];
    public boolean l;

    public bl()
    {
        a = 1;
        b = "";
        c = b();
        d = b();
        e = b();
        f = "";
        g = "";
        h = 0L;
        i = false;
        j = b();
        k = nr.a;
        l = false;
        o = null;
        p = -1;
    }

    private static bl[] b()
    {
        if (m == null)
        {
            synchronized (nn.a)
            {
                if (m == null)
                {
                    m = new bl[0];
                }
            }
        }
        return m;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        boolean flag = false;
        int j1 = super.a() + nh.b(1, a);
        int i1 = j1;
        if (!b.equals(""))
        {
            i1 = j1 + nh.b(2, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                for (j1 = 0; j1 < c.length;)
                {
                    bl bl1 = c[j1];
                    int k1 = i1;
                    if (bl1 != null)
                    {
                        k1 = i1 + nh.b(3, bl1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1;
            if (d.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < d.length;)
                {
                    bl bl2 = d[j1];
                    int l1 = i1;
                    if (bl2 != null)
                    {
                        l1 = i1 + nh.b(4, bl2);
                    }
                    j1++;
                    i1 = l1;
                }

            }
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                for (j1 = 0; j1 < e.length;)
                {
                    bl bl3 = e[j1];
                    int i2 = i1;
                    if (bl3 != null)
                    {
                        i2 = i1 + nh.b(5, bl3);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (!f.equals(""))
        {
            i1 = j1 + nh.b(6, f);
        }
        j1 = i1;
        if (!g.equals(""))
        {
            j1 = i1 + nh.b(7, g);
        }
        i1 = j1;
        if (h != 0L)
        {
            i1 = j1 + nh.b(8, h);
        }
        j1 = i1;
        if (l)
        {
            j1 = i1 + (nh.b(9) + 1);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1;
            if (k.length > 0)
            {
                i1 = 0;
                int j2 = 0;
                for (; i1 < k.length; i1++)
                {
                    j2 += nh.a(k[i1]);
                }

                i1 = j1 + j2 + k.length * 1;
            }
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                int k2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (k2 >= j.length)
                    {
                        break;
                    }
                    bl bl4 = j[k2];
                    j1 = i1;
                    if (bl4 != null)
                    {
                        j1 = i1 + nh.b(11, bl4);
                    }
                    k2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (i)
        {
            i1 = j1 + (nh.b(12) + 1);
        }
        return i1;
    }

    public final void a(nh nh1)
    {
        boolean flag = false;
        nh1.a(1, a);
        if (!b.equals(""))
        {
            nh1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i1 = 0; i1 < c.length; i1++)
            {
                bl bl1 = c[i1];
                if (bl1 != null)
                {
                    nh1.a(3, bl1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j1 = 0; j1 < d.length; j1++)
            {
                bl bl2 = d[j1];
                if (bl2 != null)
                {
                    nh1.a(4, bl2);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int k1 = 0; k1 < e.length; k1++)
            {
                bl bl3 = e[k1];
                if (bl3 != null)
                {
                    nh1.a(5, bl3);
                }
            }

        }
        if (!f.equals(""))
        {
            nh1.a(6, f);
        }
        if (!g.equals(""))
        {
            nh1.a(7, g);
        }
        if (h != 0L)
        {
            nh1.a(8, h);
        }
        if (l)
        {
            nh1.a(9, l);
        }
        if (k != null && k.length > 0)
        {
            for (int l1 = 0; l1 < k.length; l1++)
            {
                nh1.a(10, k[l1]);
            }

        }
        if (j != null && j.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < j.length; i2++)
            {
                bl bl4 = j[i2];
                if (bl4 != null)
                {
                    nh1.a(11, bl4);
                }
            }

        }
        if (i)
        {
            nh1.a(12, i);
        }
        super.a(nh1);
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
        if (!(obj instanceof bl)) goto _L4; else goto _L3
_L3:
        obj = (bl)obj;
        flag = flag1;
        if (a != ((bl) (obj)).a) goto _L4; else goto _L5
_L5:
        if (b != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((bl) (obj)).b != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!nn.a(c, ((bl) (obj)).c)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!nn.a(d, ((bl) (obj)).d)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!nn.a(e, ((bl) (obj)).e)) goto _L4; else goto _L11
_L11:
        if (f != null) goto _L13; else goto _L12
_L12:
        flag = flag1;
        if (((bl) (obj)).f != null) goto _L4; else goto _L14
_L14:
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        flag = flag1;
        if (((bl) (obj)).g != null) goto _L4; else goto _L15
_L15:
        flag = flag1;
        if (h == ((bl) (obj)).h)
        {
            flag = flag1;
            if (i == ((bl) (obj)).i)
            {
                flag = flag1;
                if (nn.a(j, ((bl) (obj)).j))
                {
                    flag = flag1;
                    if (nn.a(k, ((bl) (obj)).k))
                    {
                        flag = flag1;
                        if (l == ((bl) (obj)).l)
                        {
                            return a(((nj) (obj)));
                        }
                    }
                }
            }
        }
          goto _L4
_L7:
        if (!b.equals(((bl) (obj)).b))
        {
            return false;
        }
          goto _L8
_L13:
        if (!f.equals(((bl) (obj)).f))
        {
            return false;
        }
          goto _L14
        if (!g.equals(((bl) (obj)).g))
        {
            return false;
        }
          goto _L15
    }

    public final int hashCode()
    {
        char c2 = '\u04CF';
        int k1 = 0;
        int l1 = a;
        int i1;
        int j1;
        char c1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        if (b == null)
        {
            i1 = 0;
        } else
        {
            i1 = b.hashCode();
        }
        i2 = nn.a(c);
        j2 = nn.a(d);
        k2 = nn.a(e);
        if (f == null)
        {
            j1 = 0;
        } else
        {
            j1 = f.hashCode();
        }
        if (g != null)
        {
            k1 = g.hashCode();
        }
        l2 = (int)(h ^ h >>> 32);
        if (i)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        i3 = nn.a(j);
        j3 = nn.a(k);
        if (!l)
        {
            c2 = '\u04D5';
        }
        return ((((c1 + (((j1 + ((((i1 + (l1 + 527) * 31) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + k1) * 31 + l2) * 31) * 31 + i3) * 31 + j3) * 31 + c2) * 31 + c();
    }
}
