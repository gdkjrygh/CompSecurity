// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.BitSet;

public final class acD extends abR
{

    public static final abR b = new acD();

    private acD()
    {
    }

    private static int b(adU adu)
    {
        int i;
        int k;
        i = 0;
        k = ((aeN) (adu)).K.length;
        if (k <= 5) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        int j = 0;
_L4:
        adS ads;
        int l;
        if (j >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        ads = adu.b(j);
        l = ads.e();
        if (!a((ads.a + ads.e()) - 1)) goto _L1; else goto _L3
_L3:
        j++;
        i = l + i;
          goto _L4
        if (i > 5) goto _L1; else goto _L5
_L5:
        return i;
    }

    public final int a()
    {
        return 3;
    }

    public final void a(aeG aeg, abL abl)
    {
        int j1 = ((abJ)abl).b();
        adU adu = abl.e;
        int i = b(adu);
        int k = ((aeN) (adu)).K.length;
        short word0;
        short word1;
        int j;
        int l;
        int i1;
        int k1;
        if (i != k)
        {
            adU adu1 = new adU(i);
            i = 0;
            j = 0;
            while (j < k) 
            {
                adS ads = adu.b(j);
                adu1.a(i, ads);
                if (ads.e() == 2)
                {
                    adu1.a(i + 1, adS.a(ads.a + 1, aeD.i));
                    i += 2;
                } else
                {
                    i++;
                }
                j++;
            }
            adu1.L = false;
            adu = adu1;
        }
        k1 = ((aeN) (adu)).K.length;
        if (k1 > 0)
        {
            i = adu.b(0).a;
        } else
        {
            i = 0;
        }
        if (k1 > 1)
        {
            j = adu.b(1).a;
        } else
        {
            j = 0;
        }
        if (k1 > 2)
        {
            k = adu.b(2).a;
        } else
        {
            k = 0;
        }
        if (k1 > 3)
        {
            l = adu.b(3).a;
        } else
        {
            l = 0;
        }
        if (k1 > 4)
        {
            i1 = adu.b(4).a;
        } else
        {
            i1 = 0;
        }
        word0 = a(abl, b(i1, k1));
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
            a(aeg, word0, word1, (short)(l << 12 | (k << 8 | (j << 4 | i))));
            return;
        }
    }

    public final boolean a(abL abl)
    {
        aec aec;
        if (abl instanceof abJ)
        {
            if (e((abl = (abJ)abl).b()) && ((((aec = ((abJ) (abl)).a) instanceof aev) || (aec instanceof aez)) && b(abl.e) >= 0))
            {
                return true;
            }
        }
        return false;
    }

    public final BitSet b(abL abl)
    {
        abl = abl.e;
        int j = ((aeN) (abl)).K.length;
        BitSet bitset = new BitSet(j);
        for (int i = 0; i < j; i++)
        {
            adS ads = abl.b(i);
            int k = ads.a;
            bitset.set(i, a((ads.e() + k) - 1));
        }

        return bitset;
    }

}
