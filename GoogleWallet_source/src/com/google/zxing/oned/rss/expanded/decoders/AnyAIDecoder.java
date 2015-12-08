// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            AbstractExpandedDecoder, GeneralAppIdDecoder

final class AnyAIDecoder extends AbstractExpandedDecoder
{

    AnyAIDecoder(BitArray bitarray)
    {
        super(bitarray);
    }

    public final String parseInformation()
        throws NotFoundException
    {
        StringBuilder stringbuilder = new StringBuilder();
        return getGeneralDecoder().decodeAllCodes(stringbuilder, 5);
    }
}
