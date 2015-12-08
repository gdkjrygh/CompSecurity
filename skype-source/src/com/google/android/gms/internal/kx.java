// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            ky

final class kx
    implements Cloneable
{

    private static final ky a = new ky();
    private boolean b;
    private int c[];
    private ky d[];
    private int e;

    public kx()
    {
        this(10);
    }

    private kx(int i)
    {
        b = false;
        i = c(i);
        c = new int[i];
        d = new ky[i];
        e = 0;
    }

    private static int c(int i)
    {
        int k = i * 4;
        i = 4;
        do
        {
label0:
            {
                int j = k;
                if (i < 32)
                {
                    if (k > (1 << i) - 12)
                    {
                        break label0;
                    }
                    j = (1 << i) - 12;
                }
                return j / 4;
            }
            i++;
        } while (true);
    }

    private int d(int i)
    {
        int k;
label0:
        {
            k = e;
            int j = 0;
            for (k--; j <= k;)
            {
                int l = j + k >>> 1;
                int i1 = c[l];
                if (i1 < i)
                {
                    j = l + 1;
                } else
                {
                    k = l;
                    if (i1 <= i)
                    {
                        break label0;
                    }
                    k = l - 1;
                }
            }

            k = ~j;
        }
        return k;
    }

    private void d()
    {
        int l = e;
        int ai[] = c;
        ky aky[] = d;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            ky ky1 = aky[i];
            k = j;
            if (ky1 != a)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    aky[j] = ky1;
                    aky[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        b = false;
        e = j;
    }

    public final int a()
    {
        if (b)
        {
            d();
        }
        return e;
    }

    public final ky a(int i)
    {
        i = d(i);
        if (i < 0 || d[i] == a)
        {
            return null;
        } else
        {
            return d[i];
        }
    }

    public final void a(int i, ky ky1)
    {
        int j = d(i);
        if (j >= 0)
        {
            d[j] = ky1;
            return;
        }
        int k = ~j;
        if (k < e && d[k] == a)
        {
            c[k] = i;
            d[k] = ky1;
            return;
        }
        j = k;
        if (b)
        {
            j = k;
            if (e >= c.length)
            {
                d();
                j = ~d(i);
            }
        }
        if (e >= c.length)
        {
            int l = c(e + 1);
            int ai[] = new int[l];
            ky aky[] = new ky[l];
            System.arraycopy(c, 0, ai, 0, c.length);
            System.arraycopy(d, 0, aky, 0, d.length);
            c = ai;
            d = aky;
        }
        if (e - j != 0)
        {
            System.arraycopy(c, j, c, j + 1, e - j);
            System.arraycopy(d, j, d, j + 1, e - j);
        }
        c[j] = i;
        d[j] = ky1;
        e = e + 1;
    }

    public final ky b(int i)
    {
        if (b)
        {
            d();
        }
        return d[i];
    }

    public final boolean b()
    {
        return a() == 0;
    }

    public final kx c()
    {
        int i = 0;
        int j = a();
        kx kx1 = new kx(j);
        System.arraycopy(c, 0, kx1.c, 0, j);
        for (; i < j; i++)
        {
            if (d[i] != null)
            {
                kx1.d[i] = d[i].b();
            }
        }

        kx1.e = j;
        return kx1;
    }

    public final Object clone()
        throws CloneNotSupportedException
    {
        return c();
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        Object aobj[];
        int ai[];
        int i;
        int j;
        if (!(obj instanceof kx))
        {
            return false;
        }
        obj = (kx)obj;
        if (a() != ((kx) (obj)).a())
        {
            return false;
        }
        aobj = c;
        ai = ((kx) (obj)).c;
        j = e;
        i = 0;
_L10:
        if (i >= j) goto _L4; else goto _L3
_L3:
        if (aobj[i] == ai[i]) goto _L6; else goto _L5
_L5:
        i = 0;
_L11:
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj = d;
        obj = ((kx) (obj)).d;
        j = e;
        i = 0;
_L12:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        if (aobj[i].equals(obj[i])) goto _L8; else goto _L7
_L7:
        i = 0;
_L13:
        if (i != 0) goto _L1; else goto _L9
_L9:
        return false;
_L6:
        i++;
          goto _L10
_L4:
        i = 1;
          goto _L11
_L8:
        i++;
          goto _L12
        i = 1;
          goto _L13
    }

    public final int hashCode()
    {
        if (b)
        {
            d();
        }
        int j = 17;
        for (int i = 0; i < e; i++)
        {
            j = (j * 31 + c[i]) * 31 + d[i].hashCode();
        }

        return j;
    }

}
