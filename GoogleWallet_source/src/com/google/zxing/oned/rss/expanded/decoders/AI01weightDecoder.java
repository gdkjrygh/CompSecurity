// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            AI01decoder, GeneralAppIdDecoder

abstract class AI01weightDecoder extends AI01decoder
{

    AI01weightDecoder(BitArray bitarray)
    {
        super(bitarray);
    }

    protected abstract void addWeightCode(StringBuilder stringbuilder, int i);

    protected abstract int checkWeight(int i);

    protected final void encodeCompressedWeight(StringBuilder stringbuilder, int i, int j)
    {
        i = getGeneralDecoder().extractNumericValueFromBitArray(i, j);
        addWeightCode(stringbuilder, i);
        int k = checkWeight(i);
        j = 0x186a0;
        for (i = 0; i < 5; i++)
        {
            if (k / j == 0)
            {
                stringbuilder.append('0');
            }
            j /= 10;
        }

        stringbuilder.append(k);
    }
}
