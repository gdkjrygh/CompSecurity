// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            AI01decoder, GeneralAppIdDecoder, DecodedInformation

final class AI01393xDecoder extends AI01decoder
{

    AI01393xDecoder(BitArray bitarray)
    {
        super(bitarray);
    }

    public final String parseInformation()
        throws NotFoundException
    {
        if (getInformation().getSize() < 48)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder stringbuilder = new StringBuilder();
        encodeCompressedGtin(stringbuilder, 8);
        int i = getGeneralDecoder().extractNumericValueFromBitArray(48, 2);
        stringbuilder.append("(393");
        stringbuilder.append(i);
        stringbuilder.append(')');
        i = getGeneralDecoder().extractNumericValueFromBitArray(50, 10);
        if (i / 100 == 0)
        {
            stringbuilder.append('0');
        }
        if (i / 10 == 0)
        {
            stringbuilder.append('0');
        }
        stringbuilder.append(i);
        stringbuilder.append(getGeneralDecoder().decodeGeneralPurposeField(60, null).getNewString());
        return stringbuilder.toString();
    }
}
