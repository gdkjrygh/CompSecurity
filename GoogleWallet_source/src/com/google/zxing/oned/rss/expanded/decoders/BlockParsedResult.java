// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;


// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            DecodedInformation

final class BlockParsedResult
{

    private final DecodedInformation decodedInformation;
    private final boolean finished;

    BlockParsedResult(DecodedInformation decodedinformation, boolean flag)
    {
        finished = flag;
        decodedInformation = decodedinformation;
    }

    BlockParsedResult(boolean flag)
    {
        this(null, flag);
    }

    final DecodedInformation getDecodedInformation()
    {
        return decodedInformation;
    }

    final boolean isFinished()
    {
        return finished;
    }
}
