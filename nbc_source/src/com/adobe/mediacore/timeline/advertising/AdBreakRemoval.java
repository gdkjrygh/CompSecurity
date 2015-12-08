// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;

import com.adobe.mediacore.timeline.TimelineOperation;

// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            AdBreakPlacement, AdBreak

public final class AdBreakRemoval extends TimelineOperation
{

    private final AdBreak _adBreak;

    public AdBreakRemoval(AdBreakPlacement adbreakplacement)
    {
        super(adbreakplacement.getPlacement());
        _adBreak = adbreakplacement.getAdBreak();
    }

    public AdBreak getAdBreak()
    {
        return _adBreak;
    }

    public boolean isValid()
    {
        return _adBreak.isValid();
    }
}
