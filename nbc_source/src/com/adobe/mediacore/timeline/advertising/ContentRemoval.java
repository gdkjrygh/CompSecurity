// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;

import com.adobe.mediacore.timeline.TimelineOperation;

// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            PlacementInformation

public class ContentRemoval extends TimelineOperation
{

    public ContentRemoval(PlacementInformation placementinformation)
    {
        super(placementinformation);
    }

    public boolean isValid()
    {
        return true;
    }
}
