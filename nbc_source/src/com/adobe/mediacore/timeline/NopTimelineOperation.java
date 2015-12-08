// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline;

import com.adobe.mediacore.timeline.advertising.PlacementInformation;

// Referenced classes of package com.adobe.mediacore.timeline:
//            TimelineOperation

public class NopTimelineOperation extends TimelineOperation
{

    public NopTimelineOperation()
    {
        super(new PlacementInformation(null, null, -1L, -1L));
    }

    public boolean isValid()
    {
        return true;
    }
}
