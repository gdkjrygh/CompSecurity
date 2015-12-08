// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            fb

public final class fa
    implements Cloneable
{

    static final fb a = new fb();
    boolean b;
    int c[];
    fb d[];
    int e;

    fa()
    {
        this(10);
    }

    private fa(int i)
    {
        b = false;
        i = b(i);
        c = new int[i];
        d = new fb[i];
        e = 0;
    }

    static int b(int i)
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

    final fb a(int i)
    {
        if (b)
        {
            a();
        }
        return d[i];
    }

    final void a()
    {
        int l = e;
        int ai[] = c;
        fb afb[] = d;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            fb fb1 = afb[i];
            k = j;
            if (fb1 != a)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    afb[j] = fb1;
                    afb[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        b = false;
        e = j;
    }

    final int b()
    {
        if (b)
        {
            a();
        }
        return e;
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

    public final boolean c()
    {
        return b() == 0;
    }

    public final Object clone()
        throws CloneNotSupportedException
    {
        return d();
    }

    public final fa d()
    {
        int i = 0;
        int j = b();
        fa fa1 = new fa(j);
        System.arraycopy(c, 0, fa1.c, 0, j);
        for (; i < j; i++)
        {
            if (d[i] != null)
            {
                fa1.d[i] = d[i].b();
            }
        }

        fa1.e = j;
        return fa1;
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
        if (!(obj instanceof fa))
        {
            return false;
        }
        obj = (fa)obj;
        if (b() != ((fa) (obj)).b())
        {
            return false;
        }
        aobj = c;
        ai = ((fa) (obj)).c;
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
        obj = ((fa) (obj)).d;
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
            a();
        }
        int j = 17;
        for (int i = 0; i < e; i++)
        {
            j = (j * 31 + c[i]) * 31 + d[i].hashCode();
        }

        return j;
    }

}
