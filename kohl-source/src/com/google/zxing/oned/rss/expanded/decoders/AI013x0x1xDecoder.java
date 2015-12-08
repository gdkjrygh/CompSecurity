// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            AI01weightDecoder, GeneralAppIdDecoder

final class AI013x0x1xDecoder extends AI01weightDecoder
{

    private static final int DATE_SIZE = 16;
    private static final int HEADER_SIZE = 8;
    private static final int WEIGHT_SIZE = 20;
    private final String dateCode;
    private final String firstAIdigits;

    AI013x0x1xDecoder(BitArray bitarray, String s, String s1)
    {
        super(bitarray);
        dateCode = s1;
        firstAIdigits = s;
    }

    private void encodeCompressedDate(StringBuilder stringbuilder, int i)
    {
        int j = getGeneralDecoder().extractNumericValueFromBitArray(i, 16);
        if (j == 38400)
        {
            return;
        }
        stringbuilder.append('(');
        stringbuilder.append(dateCode);
        stringbuilder.append(')');
        i = j % 32;
        int k = j / 32;
        j = k % 12 + 1;
        k /= 12;
        if (k / 10 == 0)
        {
            stringbuilder.append('0');
        }
        stringbuilder.append(k);
        if (j / 10 == 0)
        {
            stringbuilder.append('0');
        }
        stringbuilder.append(j);
        if (i / 10 == 0)
        {
            stringbuilder.append('0');
        }
        stringbuilder.append(i);
    }

    protected void addWeightCode(StringBuilder stringbuilder, int i)
    {
        i /= 0x186a0;
        stringbuilder.append('(');
        stringbuilder.append(firstAIdigits);
        stringbuilder.append(i);
        stringbuilder.append(')');
    }

    protected int checkWeight(int i)
    {
        return i % 0x186a0;
    }

    public String parseInformation()
        throws NotFoundException
    {
        if (getInformation().getSize() != 84)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            encodeCompressedGtin(stringbuilder, 8);
            encodeCompressedWeight(stringbuilder, 48, 20);
            encodeCompressedDate(stringbuilder, 68);
            return stringbuilder.toString();
        }
    }
}
