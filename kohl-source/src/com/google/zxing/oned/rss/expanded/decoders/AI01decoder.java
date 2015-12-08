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
        int l = 0;
        for (int j = 0; j < 13; j++)
        {
            int j1 = stringbuilder.charAt(j + i) - 48;
            int i1 = j1;
            if ((j & 1) == 0)
            {
                i1 = j1 * 3;
            }
            l += i1;
        }

        int k = 10 - l % 10;
        i = k;
        if (k == 10)
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
