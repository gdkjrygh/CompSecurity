// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.AdSignalingMode;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerItem, SpliceOutPlacementOpportunityDetector, PlacementOpportunityDetector

class DefaultOpportunityDetectorFactory
{

    DefaultOpportunityDetectorFactory()
    {
    }

    public static PlacementOpportunityDetector createOpportunityDetector(MediaPlayerItem mediaplayeritem, AdSignalingMode adsignalingmode)
    {
        if (mediaplayeritem.isLive() || adsignalingmode == AdSignalingMode.MANIFEST_CUES)
        {
            return new SpliceOutPlacementOpportunityDetector(mediaplayeritem);
        } else
        {
            return null;
        }
    }
}
