// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            AI01decoder, GeneralAppIdDecoder

final class AI01AndOtherAIs extends AI01decoder
{

    private static final int HEADER_SIZE = 4;

    AI01AndOtherAIs(BitArray bitarray)
    {
        super(bitarray);
    }

    public String parseInformation()
        throws NotFoundException, FormatException
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("(01)");
        int i = stringbuilder.length();
        stringbuilder.append(getGeneralDecoder().extractNumericValueFromBitArray(4, 4));
        encodeCompressedGtinWithoutAI(stringbuilder, 8, i);
        return getGeneralDecoder().decodeAllCodes(stringbuilder, 48);
    }
}
