// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;

public final class gzw
    implements fsq
{

    private static hab a = new gzx();
    private final ntz b;
    private final aen c;
    private final fqi d;
    private final hac e;
    private final had f;
    private final hab g;
    private final int h;

    public gzw(aen aen1, fqi fqi1, hac hac1, had had1, int i)
    {
        this(aen1, fqi1, hac1, had1, a, i);
    }

    public gzw(aen aen1, fqi fqi1, hac hac1, had had1, hab hab1, int i)
    {
        b = new ntz(this);
        e = hac1;
        c = aen1;
        d = fqi1;
        f = had1;
        g = hab1;
        h = i;
        fqi1.a.a(new gzy(this), false);
        aen1.a(new gzz(this));
    }

    static ntz a(gzw gzw1)
    {
        return gzw1.b;
    }

    private int c(int i)
    {
        SparseArray sparsearray;
        boolean flag;
        flag = false;
        sparsearray = d.b;
        if (i > 0 && sparsearray != null) goto _L2; else goto _L1
_L1:
        int j1 = 0;
_L4:
        return j1;
_L2:
        int k1 = c.a();
        int l1 = f.a(h);
        boolean flag1 = g.s();
        int j;
        int k;
        if (flag1)
        {
            j = g.av_();
        } else
        {
            j = 0;
        }
        for (k = 0; k < sparsearray.size(); k++)
        {
            int i2 = sparsearray.keyAt(k);
            int i1;
            if (k == sparsearray.size() - 1)
            {
                i1 = k1;
            } else
            {
                i1 = sparsearray.keyAt(k + 1);
            }
            j1 = j;
            if (i == i2)
            {
                continue; /* Loop/switch isn't completed */
            }
            j += l1;
            if (i < i1)
            {
                return j + e.a(i2, i);
            }
            j += e.b(i2, i1);
        }

        j1 = j;
        if (sparsearray.size() == 0)
        {
            int l = ((flag) ? 1 : 0);
            if (flag1)
            {
                l = 1;
            }
            if (i < k1)
            {
                return j + e.a(l, i);
            } else
            {
                return j + e.b(l, k1);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int a(int i)
    {
        return c(Math.max(0, Math.min(i, c.a() - 1)));
    }

    public final nud a()
    {
        return b;
    }

    public final int b()
    {
        return c(c.a());
    }

    public final int b(int i)
    {
        boolean flag1 = false;
        int k1 = c.a();
        int l1 = f.a(h);
        SparseArray sparsearray = d.b;
        boolean flag2 = g.s();
        int j;
        if (flag2)
        {
            j = g.av_();
        } else
        {
            j = 0;
        }
        if (i < j)
        {
            return 0;
        }
        boolean flag = false;
        int i1 = j;
        for (int k = ((flag) ? 1 : 0); k < sparsearray.size(); k++)
        {
            int i2 = sparsearray.keyAt(k);
            int j1;
            if (k == sparsearray.size() - 1)
            {
                j1 = k1;
            } else
            {
                j1 = sparsearray.keyAt(k + 1);
            }
            i1 += l1;
            if (i < i1)
            {
                return i2;
            }
            j1 = e.b(i2, j1);
            if (i < i1 + j1)
            {
                return e.c(i2, i - i1) + i2 + 1;
            }
            i1 += j1;
        }

        if (sparsearray.size() == 0)
        {
            int l = ((flag1) ? 1 : 0);
            if (flag2)
            {
                l = 1;
            }
            if (i < e.b(l, k1) + i1)
            {
                return e.c(l, i - i1) + l + 1;
            }
        }
        return k1 - 1;
    }

}
