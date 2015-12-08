// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            AbstractExpandedDecoder, GeneralAppIdDecoder

final class AnyAIDecoder extends AbstractExpandedDecoder
{

    private static final int HEADER_SIZE = 5;

    AnyAIDecoder(BitArray bitarray)
    {
        super(bitarray);
    }

    public String parseInformation()
        throws NotFoundException, FormatException
    {
        StringBuilder stringbuilder = new StringBuilder();
        return getGeneralDecoder().decodeAllCodes(stringbuilder, 5);
    }
}
