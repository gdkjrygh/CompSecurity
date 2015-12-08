// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            AbstractExpandedDecoder, GeneralAppIdDecoder

abstract class AI01decoder extends AbstractExpandedDecoder
{

    protected static final int GTIN_SIZE = 40;

    AI01decoder(BitArray bitarray)
    {
        super(bitarray);
    }

    private static void appendCheckDigit(StringBuilder stringbuilder, int i)
    {
        int j = 0;
        int k = 0;
        for (; j < 13; j++)
        {
            int i1 = stringbuilder.charAt(j + i) - 48;
            int l = i1;
            if ((j & 1) == 0)
            {
                l = i1 * 3;
            }
            k += l;
        }

        j = 10 - k % 10;
        i = j;
        if (j == 10)
        {
            i = 0;
        }
        stringbuilder.append(i);
    }

    protected final void encodeCompressedGtin(StringBuilder stringbuilder, int i)
    {
        stringbuilder.append("(01)");
        int j = stringbuilder.length();
        stringbuilder.append('9');
        encodeCompressedGtinWithoutAI(stringbuilder, i, j);
    }

    protected final void encodeCompressedGtinWithoutAI(StringBuilder stringbuilder, int i, int j)
    {
        for (int k = 0; k < 4; k++)
        {
            int l = getGeneralDecoder().extractNumericValueFromBitArray(k * 10 + i, 10);
            if (l / 100 == 0)
            {
                stringbuilder.append('0');
            }
            if (l / 10 == 0)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(l);
        }

        appendCheckDigit(stringbuilder, j);
    }
}
