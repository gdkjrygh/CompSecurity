// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksp extends krs
{

    private static volatile ksp o[];
    public int c;
    public String d;
    public ksp e[];
    public ksp f[];
    public ksp g[];
    public String h;
    public String i;
    public long j;
    public boolean k;
    public ksp l[];
    public int m[];
    public boolean n;

    public ksp()
    {
        c = 1;
        d = "";
        e = f();
        f = f();
        g = f();
        h = "";
        i = "";
        j = 0L;
        k = false;
        l = f();
        m = kry.a;
        n = false;
        a = null;
        b = -1;
    }

    public static ksp[] f()
    {
        if (o == null)
        {
            synchronized (krv.a)
            {
                if (o == null)
                {
                    o = new ksp[0];
                }
            }
        }
        return o;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        boolean flag = false;
        int j1 = super.a() + krr.b(1, c);
        int i1 = j1;
        if (!d.equals(""))
        {
            i1 = j1 + krr.b(2, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                for (j1 = 0; j1 < e.length;)
                {
                    ksp ksp1 = e[j1];
                    int k1 = i1;
                    if (ksp1 != null)
                    {
                        k1 = i1 + krr.b(3, ksp1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1;
            if (f.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < f.length;)
                {
                    ksp ksp2 = f[j1];
                    int l1 = i1;
                    if (ksp2 != null)
                    {
                        l1 = i1 + krr.b(4, ksp2);
                    }
                    j1++;
                    i1 = l1;
                }

            }
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1;
            if (g.length > 0)
            {
                for (j1 = 0; j1 < g.length;)
                {
                    ksp ksp3 = g[j1];
                    int i2 = i1;
                    if (ksp3 != null)
                    {
                        i2 = i1 + krr.b(5, ksp3);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (!h.equals(""))
        {
            i1 = j1 + krr.b(6, h);
        }
        j1 = i1;
        if (!i.equals(""))
        {
            j1 = i1 + krr.b(7, i);
        }
        i1 = j1;
        if (j != 0L)
        {
            i1 = j1 + krr.b(8, j);
        }
        j1 = i1;
        if (n)
        {
            boolean flag1 = n;
            j1 = i1 + (krr.b(9) + 1);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1;
            if (m.length > 0)
            {
                i1 = 0;
                int j2 = 0;
                for (; i1 < m.length; i1++)
                {
                    j2 += krr.a(m[i1]);
                }

                i1 = j1 + j2 + m.length * 1;
            }
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                int k2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (k2 >= l.length)
                    {
                        break;
                    }
                    ksp ksp4 = l[k2];
                    j1 = i1;
                    if (ksp4 != null)
                    {
                        j1 = i1 + krr.b(11, ksp4);
                    }
                    k2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (k)
        {
            boolean flag2 = k;
            i1 = j1 + (krr.b(12) + 1);
        }
        return i1;
    }

    public final void a(krr krr1)
    {
        boolean flag = false;
        krr1.a(1, c);
        if (!d.equals(""))
        {
            krr1.a(2, d);
        }
        if (e != null && e.length > 0)
        {
            for (int i1 = 0; i1 < e.length; i1++)
            {
                ksp ksp1 = e[i1];
                if (ksp1 != null)
                {
                    krr1.a(3, ksp1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int j1 = 0; j1 < f.length; j1++)
            {
                ksp ksp2 = f[j1];
                if (ksp2 != null)
                {
                    krr1.a(4, ksp2);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int k1 = 0; k1 < g.length; k1++)
            {
                ksp ksp3 = g[k1];
                if (ksp3 != null)
                {
                    krr1.a(5, ksp3);
                }
            }

        }
        if (!h.equals(""))
        {
            krr1.a(6, h);
        }
        if (!i.equals(""))
        {
            krr1.a(7, i);
        }
        if (j != 0L)
        {
            krr1.a(8, j);
        }
        if (n)
        {
            krr1.a(9, n);
        }
        if (m != null && m.length > 0)
        {
            for (int l1 = 0; l1 < m.length; l1++)
            {
                krr1.a(10, m[l1]);
            }

        }
        if (l != null && l.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < l.length; i2++)
            {
                ksp ksp4 = l[i2];
                if (ksp4 != null)
                {
                    krr1.a(11, ksp4);
                }
            }

        }
        if (k)
        {
            krr1.a(12, k);
        }
        super.a(krr1);
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
        if (!(obj instanceof ksp)) goto _L4; else goto _L3
_L3:
        obj = (ksp)obj;
        flag = flag1;
        if (c != ((ksp) (obj)).c) goto _L4; else goto _L5
_L5:
        if (d != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((ksp) (obj)).d != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!krv.a(e, ((ksp) (obj)).e)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!krv.a(f, ((ksp) (obj)).f)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!krv.a(g, ((ksp) (obj)).g)) goto _L4; else goto _L11
_L11:
        if (h != null) goto _L13; else goto _L12
_L12:
        flag = flag1;
        if (((ksp) (obj)).h != null) goto _L4; else goto _L14
_L14:
        if (i != null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        flag = flag1;
        if (((ksp) (obj)).i != null) goto _L4; else goto _L15
_L15:
        flag = flag1;
        if (j == ((ksp) (obj)).j)
        {
            flag = flag1;
            if (k == ((ksp) (obj)).k)
            {
                flag = flag1;
                if (krv.a(l, ((ksp) (obj)).l))
                {
                    flag = flag1;
                    if (krv.a(m, ((ksp) (obj)).m))
                    {
                        flag = flag1;
                        if (n == ((ksp) (obj)).n)
                        {
                            return a(((krs) (obj)));
                        }
                    }
                }
            }
        }
          goto _L4
_L7:
        if (!d.equals(((ksp) (obj)).d))
        {
            return false;
        }
          goto _L8
_L13:
        if (!h.equals(((ksp) (obj)).h))
        {
            return false;
        }
          goto _L14
        if (!i.equals(((ksp) (obj)).i))
        {
            return false;
        }
          goto _L15
    }

    public final int hashCode()
    {
        char c2 = '\u04CF';
        int k1 = 0;
        int l1 = c;
        int i1;
        int j1;
        char c1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        if (d == null)
        {
            i1 = 0;
        } else
        {
            i1 = d.hashCode();
        }
        i2 = krv.a(e);
        j2 = krv.a(f);
        k2 = krv.a(g);
        if (h == null)
        {
            j1 = 0;
        } else
        {
            j1 = h.hashCode();
        }
        if (i != null)
        {
            k1 = i.hashCode();
        }
        l2 = (int)(j ^ j >>> 32);
        if (k)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        i3 = krv.a(l);
        j3 = krv.a(m);
        if (!n)
        {
            c2 = '\u04D5';
        }
        return ((((c1 + (((j1 + ((((i1 + (l1 + 527) * 31) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + k1) * 31 + l2) * 31) * 31 + i3) * 31 + j3) * 31 + c2) * 31 + b();
    }
}
