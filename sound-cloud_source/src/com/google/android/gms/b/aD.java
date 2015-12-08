// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;


// Referenced classes of package com.google.android.gms.b:
//            aE

final class aD
    implements Cloneable
{

    private static final aE a = new aE();
    private boolean b;
    private int c[];
    private aE d[];
    private int e;

    public aD()
    {
        this(10);
    }

    private aD(int i)
    {
        b = false;
        i = b(i * 4) / 4;
        c = new int[i];
        d = new aE[i];
        e = 0;
    }

    private static int b(int i)
    {
        int j = 4;
        do
        {
label0:
            {
                int k = i;
                if (j < 32)
                {
                    if (i > (1 << j) - 12)
                    {
                        break label0;
                    }
                    k = (1 << j) - 12;
                }
                return k;
            }
            j++;
        } while (true);
    }

    private void d()
    {
        int l = e;
        int ai[] = c;
        aE aae[] = d;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            aE ae = aae[i];
            k = j;
            if (ae != a)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    aae[j] = ae;
                    aae[i] = null;
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

    public final aE a(int i)
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

    public final aD c()
    {
        int i = 0;
        int j = a();
        aD ad = new aD(j);
        System.arraycopy(c, 0, ad.c, 0, j);
        for (; i < j; i++)
        {
            if (d[i] != null)
            {
                ad.d[i] = d[i].b();
            }
        }

        ad.e = j;
        return ad;
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
        if (!(obj instanceof aD))
        {
            return false;
        }
        obj = (aD)obj;
        if (a() != ((aD) (obj)).a())
        {
            return false;
        }
        aobj = c;
        ai = ((aD) (obj)).c;
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
        obj = ((aD) (obj)).d;
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
