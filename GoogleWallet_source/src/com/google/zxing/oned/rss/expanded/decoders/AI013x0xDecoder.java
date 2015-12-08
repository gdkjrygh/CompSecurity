// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            AI01weightDecoder

abstract class AI013x0xDecoder extends AI01weightDecoder
{

    AI013x0xDecoder(BitArray bitarray)
    {
        super(bitarray);
    }

    public final String parseInformation()
        throws NotFoundException
    {
        if (getInformation().getSize() != 60)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            encodeCompressedGtin(stringbuilder, 5);
            encodeCompressedWeight(stringbuilder, 45, 15);
            return stringbuilder.toString();
        }
    }
}
