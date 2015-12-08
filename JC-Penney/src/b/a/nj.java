// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            pe, ov, nh, pn, 
//            ot

public final class nj extends pe
    implements ov
{

    public static final nj a = new nj(0);

    public nj(int i)
    {
        super(i);
    }

    public static nj a(nh nh1)
    {
        nj nj1 = new nj(1);
        nj1.a(0, nh1);
        return nj1;
    }

    public static nj a(nh nh1, nh nh2)
    {
        nj nj1 = new nj(2);
        nj1.a(0, nh1);
        nj1.a(1, nh2);
        return nj1;
    }

    public static nj a(nh nh1, nh nh2, nh nh3)
    {
        nj nj1 = new nj(3);
        nj1.a(0, nh1);
        nj1.a(1, nh2);
        nj1.a(2, nh3);
        return nj1;
    }

    public final nj a(int i, boolean flag, BitSet bitset)
    {
        int l = super.K.length;
        if (l == 0)
        {
            return this;
        }
        nj nj1 = new nj(l);
        int j = 0;
        int k = i;
        while (j < l) 
        {
            nh nh1 = (nh)d(j);
            if (bitset == null)
            {
                i = 1;
            } else
            if (!bitset.get(j))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                nj1.a(j, nh1.a(k));
                i = k;
                if (!flag)
                {
                    i = nh1.i() + k;
                }
            } else
            {
                nj1.a(j, nh1);
                i = k;
            }
            if (flag)
            {
                flag = false;
            }
            j++;
            k = i;
        }
        if (e())
        {
            nj1.L = false;
        }
        return nj1;
    }

    public final nj a(BitSet bitset)
    {
        int i = super.K.length - bitset.cardinality();
        if (i == 0)
        {
            return a;
        }
        nj nj1 = new nj(i);
        i = 0;
        int k;
        for (int j = 0; i < super.K.length; j = k)
        {
            k = j;
            if (!bitset.get(i))
            {
                nj1.a(j, d(i));
                k = j + 1;
            }
            i++;
        }

        if (e())
        {
            nj1.L = false;
        }
        return nj1;
    }

    public final ot a(int i)
    {
        return b(i).b().b();
    }

    public final void a(int i, nh nh1)
    {
        a(i, nh1);
    }

    public final int b()
    {
        int i = 0;
        int k = super.K.length;
        int j = 0;
        for (; i < k; i++)
        {
            j += a(i).f();
        }

        return j;
    }

    public final nh b(int i)
    {
        return (nh)d(i);
    }

    public final nj b(nh nh1)
    {
        int j = super.K.length;
        nj nj1 = new nj(j + 1);
        for (int i = 0; i < j; i++)
        {
            nj1.a(i + 1, d(i));
        }

        nj1.a(0, nh1);
        if (e())
        {
            nj1.L = false;
        }
        return nj1;
    }

    public final nj c(int i)
    {
        int k = super.K.length;
        if (k == 0)
        {
            return this;
        }
        nj nj1 = new nj(k);
        for (int j = 0; j < k; j++)
        {
            nh nh1 = (nh)d(j);
            if (nh1 != null)
            {
                nj1.a(j, nh1.b(i));
            }
        }

        if (e())
        {
            nj1.L = false;
        }
        return nj1;
    }

}
