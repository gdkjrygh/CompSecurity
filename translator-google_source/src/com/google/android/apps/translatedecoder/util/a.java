// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;


// Referenced classes of package com.google.android.apps.translatedecoder.util:
//            BitData

public final class a
{

    public static int a(BitData bitdata, int i, int j)
    {
        if (j <= 0)
        {
            throw new IllegalArgumentException("len is zero or negative!");
        }
        if (j > 32)
        {
            throw new IllegalArgumentException((new StringBuilder(74)).append("Bitset is too big for an integer, len = ").append(j).append(" max_size = 32").toString());
        }
        int l = 0;
        for (int k = bitdata.nextSetBit(i); k >= 0 && k < i + j; k = bitdata.nextSetBit(k + 1))
        {
            l |= 1 << k - i;
        }

        return l;
    }

    public static void a(int i, BitData bitdata, int j, int k)
    {
        if (k > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j1;
        int l = 0;
        int i1 = i;
        do
        {
            if (i1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (i1 % 2 != 0)
            {
                bitdata.set(l + j);
            }
            i1 >>>= 1;
            j1 = l + 1;
            l = j1;
        } while (j1 <= k);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        throw new IllegalArgumentException((new StringBuilder(94)).append("The integer is longer than specified length, n=").append(i).append("; index=").append(j1).append("; len=").append(k).toString());
    }

    public static long b(BitData bitdata, int i, int j)
    {
        if (j <= 0)
        {
            throw new IllegalArgumentException("len is zero or negative!");
        }
        if (j > 64)
        {
            throw new IllegalArgumentException((new StringBuilder(70)).append("Bitset is too big for a Long, len = ").append(j).append(" max_size = 64").toString());
        }
        long l = 0L;
        for (int k = bitdata.nextSetBit(i); k >= 0 && k < i + j; k = bitdata.nextSetBit(k + 1))
        {
            l |= 1L << k - i;
        }

        return l;
    }
}
