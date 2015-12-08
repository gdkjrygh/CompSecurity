// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            AI01decoder, GeneralAppIdDecoder, DecodedInformation

final class AI01392xDecoder extends AI01decoder
{

    private static final int HEADER_SIZE = 8;
    private static final int LAST_DIGIT_SIZE = 2;

    AI01392xDecoder(BitArray bitarray)
    {
        super(bitarray);
    }

    public String parseInformation()
        throws NotFoundException, FormatException
    {
        if (getInformation().getSize() < 48)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            encodeCompressedGtin(stringbuilder, 8);
            int i = getGeneralDecoder().extractNumericValueFromBitArray(48, 2);
            stringbuilder.append("(392");
            stringbuilder.append(i);
            stringbuilder.append(')');
            stringbuilder.append(getGeneralDecoder().decodeGeneralPurposeField(50, null).getNewString());
            return stringbuilder.toString();
        }
    }
}
