// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.metadata;

import com.adobe.mediacore.utils.TimeRange;

// Referenced classes of package com.adobe.mediacore.metadata:
//            MetadataNode

public class BlackoutMetadata extends MetadataNode
{

    private TimeRange _nonSeekableRanges[];

    public BlackoutMetadata(TimeRange atimerange[])
    {
        _nonSeekableRanges = atimerange;
    }

    public TimeRange[] getNonSeekableRanges()
    {
        return _nonSeekableRanges;
    }
}
