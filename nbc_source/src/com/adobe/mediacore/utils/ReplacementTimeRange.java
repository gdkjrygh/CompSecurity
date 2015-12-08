// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.utils;


// Referenced classes of package com.adobe.mediacore.utils:
//            TimeRange

public class ReplacementTimeRange extends TimeRange
{

    private long _replacementDuration;

    public ReplacementTimeRange(long l, long l1, long l2)
    {
        super(l, l1);
        _replacementDuration = 0L;
        _replacementDuration = l2;
    }

    public static ReplacementTimeRange createRange(long l, long l1, long l2)
    {
        return new ReplacementTimeRange(l, l + l1, l2);
    }

    public long getReplacementDuration()
    {
        return _replacementDuration;
    }
}
