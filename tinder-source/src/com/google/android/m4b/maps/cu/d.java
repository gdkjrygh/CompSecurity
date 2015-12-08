// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cu;


// Referenced classes of package com.google.android.m4b.maps.cu:
//            e

public final class d
    implements Cloneable
{

    private static final e c = new e();
    e a[];
    int b;
    private boolean d;
    private int e[];

    d()
    {
        this(10);
    }

    private d(int i)
    {
        d = false;
        i = a(i * 4) / 4;
        e = new int[i];
        a = new e[i];
        b = 0;
    }

    private static int a(int i)
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

    public final d a()
    {
        int i = 0;
        int j = b;
        d d1 = new d(j);
        System.arraycopy(e, 0, d1.e, 0, j);
        for (; i < j; i++)
        {
            if (a[i] != null)
            {
                d1.a[i] = a[i].b();
            }
        }

        d1.b = j;
        return d1;
    }

    public final Object clone()
    {
        return a();
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
        if (b != ((d) (obj)).b)
        {
            return false;
        }
        aobj = e;
        ai = ((d) (obj)).e;
        j = b;
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
        aobj = a;
        obj = ((d) (obj)).a;
        j = b;
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
        int j = 17;
        for (int i = 0; i < b; i++)
        {
            j = (j * 31 + e[i]) * 31 + a[i].hashCode();
        }

        return j;
    }

}
