// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.b:
//            aB, b, aJ, aF, 
//            aA

public static final class n extends aB
{

    private static volatile b o[];
    public int a;
    public String b;
    public b c[];
    public b d[];
    public b e[];
    public String f;
    public String g;
    public long h;
    public boolean i;
    public b j[];
    public int k[];
    public boolean l;

    private static n[] f()
    {
        if (o == null)
        {
            synchronized (aF.a)
            {
                if (o == null)
                {
                    o = new o[0];
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
        int j1 = super.a() + aA.b(1, a);
        int i1 = j1;
        if (!b.equals(""))
        {
            i1 = j1 + aA.b(2, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                for (j1 = 0; j1 < c.length;)
                {
                    o o1 = c[j1];
                    int k1 = i1;
                    if (o1 != null)
                    {
                        k1 = i1 + aA.b(3, o1);
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
                    o o2 = d[j1];
                    int l1 = i1;
                    if (o2 != null)
                    {
                        l1 = i1 + aA.b(4, o2);
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
                    o o3 = e[j1];
                    int i2 = i1;
                    if (o3 != null)
                    {
                        i2 = i1 + aA.b(5, o3);
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
            i1 = j1 + aA.b(6, f);
        }
        j1 = i1;
        if (!g.equals(""))
        {
            j1 = i1 + aA.b(7, g);
        }
        i1 = j1;
        if (h != 0L)
        {
            i1 = j1 + aA.b(8, h);
        }
        j1 = i1;
        if (l)
        {
            j1 = i1 + (aA.b(9) + 1);
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
                    j2 += aA.a(k[i1]);
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
                    o o4 = j[k2];
                    j1 = i1;
                    if (o4 != null)
                    {
                        j1 = i1 + aA.b(11, o4);
                    }
                    k2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (i)
        {
            i1 = j1 + (aA.b(12) + 1);
        }
        return i1;
    }

    public final void a(aA aa)
        throws IOException
    {
        boolean flag = false;
        aa.a(1, a);
        if (!b.equals(""))
        {
            aa.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i1 = 0; i1 < c.length; i1++)
            {
                  = c[i1];
                if ( != null)
                {
                    aa.a(3, );
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j1 = 0; j1 < d.length; j1++)
            {
                 1 = d[j1];
                if (1 != null)
                {
                    aa.a(4, 1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int k1 = 0; k1 < e.length; k1++)
            {
                 2 = e[k1];
                if (2 != null)
                {
                    aa.a(5, 2);
                }
            }

        }
        if (!f.equals(""))
        {
            aa.a(6, f);
        }
        if (!g.equals(""))
        {
            aa.a(7, g);
        }
        if (h != 0L)
        {
            aa.a(8, h);
        }
        if (l)
        {
            aa.a(9, l);
        }
        if (k != null && k.length > 0)
        {
            for (int l1 = 0; l1 < k.length; l1++)
            {
                aa.a(10, k[l1]);
            }

        }
        if (j != null && j.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < j.length; i2++)
            {
                 3 = j[i2];
                if (3 != null)
                {
                    aa.a(11, 3);
                }
            }

        }
        if (i)
        {
            aa.a(12, i);
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
        if (!(obj instanceof )) goto _L4; else goto _L3
_L3:
        obj = ()obj;
        flag = flag1;
        if (a != ((a) (obj)).a) goto _L4; else goto _L5
_L5:
        if (b != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((b) (obj)).b != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!aF.a(c, ((c) (obj)).c)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!aF.a(d, ((d) (obj)).d)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!aF.a(e, ((e) (obj)).e)) goto _L4; else goto _L11
_L11:
        if (f != null) goto _L13; else goto _L12
_L12:
        flag = flag1;
        if (((f) (obj)).f != null) goto _L4; else goto _L14
_L14:
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        flag = flag1;
        if (((g) (obj)).g != null) goto _L4; else goto _L15
_L15:
        flag = flag1;
        if (h == ((h) (obj)).h)
        {
            flag = flag1;
            if (i == ((i) (obj)).i)
            {
                flag = flag1;
                if (aF.a(j, ((j) (obj)).j))
                {
                    flag = flag1;
                    if (aF.a(k, ((k) (obj)).k))
                    {
                        flag = flag1;
                        if (l == ((l) (obj)).l)
                        {
                            return a(((aB) (obj)));
                        }
                    }
                }
            }
        }
          goto _L4
_L7:
        if (!b.equals(((b) (obj)).b))
        {
            return false;
        }
          goto _L8
_L13:
        if (!f.equals(((f) (obj)).f))
        {
            return false;
        }
          goto _L14
        if (!g.equals(((g) (obj)).g))
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
        i2 = aF.a(c);
        j2 = aF.a(d);
        k2 = aF.a(e);
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
        i3 = aF.a(j);
        j3 = aF.a(k);
        if (!l)
        {
            c2 = '\u04D5';
        }
        return ((((c1 + (((j1 + ((((i1 + (l1 + 527) * 31) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + k1) * 31 + l2) * 31) * 31 + i3) * 31 + j3) * 31 + c2) * 31 + b();
    }

    public ()
    {
        a = 1;
        b = "";
        c = f();
        d = f();
        e = f();
        f = "";
        g = "";
        h = 0L;
        i = false;
        j = f();
        k = aJ.a;
        l = false;
        m = null;
        n = -1;
    }
}
