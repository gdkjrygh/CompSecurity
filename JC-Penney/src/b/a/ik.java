// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gr, pe, nj, nh, 
//            ot, pn, gl, gi, 
//            ol, op, ow

public final class ik extends gr
{

    public static final gr b = new ik();

    private ik()
    {
    }

    private static int d(nj nj1)
    {
        int i;
        int k;
        i = 0;
        k = ((pe) (nj1)).K.length;
        if (k <= 5) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        int j = 0;
_L4:
        nh nh1;
        int l;
        if (j >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        nh1 = nj1.b(j);
        l = nh1.i();
        if (!a((nh1.e() + nh1.i()) - 1)) goto _L1; else goto _L3
_L3:
        j++;
        i = l + i;
          goto _L4
        if (i > 5) goto _L1; else goto _L5
_L5:
        return i;
    }

    private static nj e(nj nj1)
    {
        int i = d(nj1);
        int k = ((pe) (nj1)).K.length;
        if (i == k)
        {
            return nj1;
        }
        nj nj2 = new nj(i);
        int j = 0;
        i = 0;
        while (j < k) 
        {
            nh nh1 = nj1.b(j);
            nj2.a(i, nh1);
            if (nh1.i() == 2)
            {
                nj2.a(i + 1, nh.a(nh1.e() + 1, ot.i));
                i += 2;
            } else
            {
                i++;
            }
            j++;
        }
        nj2.L = false;
        return nj2;
    }

    public final int a()
    {
        return 3;
    }

    public final String a(gl gl1)
    {
        nj nj1 = e(gl1.f);
        return (new StringBuilder()).append(a(nj1)).append(", ").append(f(gl1)).toString();
    }

    public final void a(ow ow, gl gl1)
    {
        int j1 = ((gi)gl1).b();
        nj nj1 = e(gl1.f);
        int k1 = ((pe) (nj1)).K.length;
        short word0;
        short word1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (k1 > 0)
        {
            i = nj1.b(0).e();
        } else
        {
            i = 0;
        }
        if (k1 > 1)
        {
            j = nj1.b(1).e();
        } else
        {
            j = 0;
        }
        if (k1 > 2)
        {
            k = nj1.b(2).e();
        } else
        {
            k = 0;
        }
        if (k1 > 3)
        {
            l = nj1.b(3).e();
        } else
        {
            l = 0;
        }
        if (k1 > 4)
        {
            i1 = nj1.b(4).e();
        } else
        {
            i1 = 0;
        }
        word0 = a(gl1, b(i1, k1));
        word1 = (short)j1;
        if ((i & 0xf) != i)
        {
            throw new IllegalArgumentException("n0 out of range 0..15");
        }
        if ((j & 0xf) != j)
        {
            throw new IllegalArgumentException("n1 out of range 0..15");
        }
        if ((k & 0xf) != k)
        {
            throw new IllegalArgumentException("n2 out of range 0..15");
        }
        if ((l & 0xf) != l)
        {
            throw new IllegalArgumentException("n3 out of range 0..15");
        } else
        {
            a(ow, word0, word1, (short)(l << 12 | (k << 8 | (j << 4 | i))));
            return;
        }
    }

    public final String b(gl gl1, boolean flag)
    {
        if (flag)
        {
            return g(gl1);
        } else
        {
            return "";
        }
    }

    public final boolean b(gl gl1)
    {
        nr nr;
        if (gl1 instanceof gi)
        {
            if (e((gl1 = (gi)gl1).b()) && ((((nr = ((gi) (gl1)).a) instanceof ol) || (nr instanceof op)) && d(gl1.f) >= 0))
            {
                return true;
            }
        }
        return false;
    }

    public final BitSet c(gl gl1)
    {
        gl1 = gl1.f;
        int j = ((pe) (gl1)).K.length;
        BitSet bitset = new BitSet(j);
        for (int i = 0; i < j; i++)
        {
            nh nh1 = gl1.b(i);
            int k = nh1.e();
            bitset.set(i, a((nh1.i() + k) - 1));
        }

        return bitset;
    }

}
