// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;


// Referenced classes of package com.google.protobuf.nano:
//            e

public final class d
    implements Cloneable
{

    static final e a = new e();
    boolean b;
    e c[];
    private int d[];
    private int e;

    d()
    {
        this(10);
    }

    private d(int i)
    {
        b = false;
        i = d(i);
        d = new int[i];
        c = new e[i];
        e = 0;
    }

    private void c()
    {
        int l = e;
        int ai[] = d;
        e ae[] = c;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            e e1 = ae[i];
            k = j;
            if (e1 != a)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    ae[j] = e1;
                    ae[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        b = false;
        e = j;
    }

    private static int d(int i)
    {
        int k = i << 2;
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

    final int a()
    {
        if (b)
        {
            c();
        }
        return e;
    }

    final e a(int i)
    {
        i = c(i);
        if (i < 0 || c[i] == a)
        {
            return null;
        } else
        {
            return c[i];
        }
    }

    final void a(int i, e e1)
    {
        int j = c(i);
        if (j >= 0)
        {
            c[j] = e1;
            return;
        }
        int k = ~j;
        if (k < e && c[k] == a)
        {
            d[k] = i;
            c[k] = e1;
            return;
        }
        j = k;
        if (b)
        {
            j = k;
            if (e >= d.length)
            {
                c();
                j = ~c(i);
            }
        }
        if (e >= d.length)
        {
            int l = d(e + 1);
            int ai[] = new int[l];
            e ae[] = new e[l];
            System.arraycopy(d, 0, ai, 0, d.length);
            System.arraycopy(c, 0, ae, 0, c.length);
            d = ai;
            c = ae;
        }
        if (e - j != 0)
        {
            System.arraycopy(d, j, d, j + 1, e - j);
            System.arraycopy(c, j, c, j + 1, e - j);
        }
        d[j] = i;
        c[j] = e1;
        e = e + 1;
    }

    public final d b()
    {
        int i = 0;
        int j = a();
        d d1 = new d(j);
        System.arraycopy(d, 0, d1.d, 0, j);
        for (; i < j; i++)
        {
            if (c[i] != null)
            {
                d1.c[i] = c[i].b();
            }
        }

        d1.e = j;
        return d1;
    }

    final e b(int i)
    {
        if (b)
        {
            c();
        }
        return c[i];
    }

    final int c(int i)
    {
        int k;
label0:
        {
            k = e;
            int j = 0;
            for (k--; j <= k;)
            {
                int l = j + k >>> 1;
                int i1 = d[l];
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

    public final Object clone()
    {
        return b();
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
        if (!(obj instanceof d))
        {
            return false;
        }
        obj = (d)obj;
        if (a() != ((d) (obj)).a())
        {
            return false;
        }
        aobj = d;
        ai = ((d) (obj)).d;
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
        aobj = c;
        obj = ((d) (obj)).c;
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
            c();
        }
        int j = 17;
        for (int i = 0; i < e; i++)
        {
            j = (j * 31 + d[i]) * 31 + c[i].hashCode();
        }

        return j;
    }

}
