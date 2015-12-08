// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;

import com.adobe.mediacore.timeline.TimelineMarker;
import com.adobe.mediacore.timeline.TimelineOperation;

// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            PlacementInformation, AdBreak

public final class AdBreakPlacement extends TimelineOperation
    implements TimelineMarker
{

    private final AdBreak _adBreak;

    public AdBreakPlacement(AdBreak adbreak, PlacementInformation placementinformation)
    {
        super(placementinformation);
        static class _cls1
        {

            static final int $SwitchMap$com$adobe$mediacore$timeline$advertising$PlacementInformation$Type[];

            static 
            {
                $SwitchMap$com$adobe$mediacore$timeline$advertising$PlacementInformation$Type = new int[PlacementInformation.Type.values().length];
                try
                {
                    $SwitchMap$com$adobe$mediacore$timeline$advertising$PlacementInformation$Type[PlacementInformation.Type.PRE_ROLL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$timeline$advertising$PlacementInformation$Type[PlacementInformation.Type.MID_ROLL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$timeline$advertising$PlacementInformation$Type[PlacementInformation.Type.POST_ROLL.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.adobe.mediacore.timeline.advertising.PlacementInformation.Type[placementinformation.getType().ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 50
    //                   2 60
    //                   3 70;
           goto _L1 _L2 _L3 _L4
_L1:
        _adBreak = adbreak;
        return;
_L2:
        adbreak.setType(AdBreak.Type.PRE_ROLL);
        continue; /* Loop/switch isn't completed */
_L3:
        adbreak.setType(AdBreak.Type.MID_ROLL);
        continue; /* Loop/switch isn't completed */
_L4:
        adbreak.setType(AdBreak.Type.POST_ROLL);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public AdBreak getAdBreak()
    {
        return _adBreak;
    }

    public long getDuration()
    {
        return _adBreak.getDuration();
    }

    public long getTime()
    {
        return _placementInformation.getTime();
    }

    public boolean isValid()
    {
        return _adBreak.isValid();
    }
}
