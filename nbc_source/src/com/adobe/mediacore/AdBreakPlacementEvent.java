// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.timeline.advertising.AdBreakPlacement;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class AdBreakPlacementEvent extends MediaPlayerEvent
{

    private final AdBreakPlacement _acceptedAdBreak;
    private final AdBreakPlacement _proposedAdBreak;

    private AdBreakPlacementEvent(MediaPlayerEvent.Type type, AdBreakPlacement adbreakplacement, AdBreakPlacement adbreakplacement1)
    {
        super(type);
        _proposedAdBreak = adbreakplacement;
        _acceptedAdBreak = adbreakplacement1;
    }

    public static AdBreakPlacementEvent createPlacementCompletedEvent(AdBreakPlacement adbreakplacement, AdBreakPlacement adbreakplacement1)
    {
        AdBreakPlacementEvent adbreakplacementevent = new AdBreakPlacementEvent(MediaPlayerEvent.Type.ADBREAK_PLACEMENT_COMPLETED, adbreakplacement, adbreakplacement1);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.AD_BREAK_PLACEMENT_COMPLETE, "Ad-break placement operation is complete.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("PROPOSED_AD_BREAK", adbreakplacement.toString());
        metadatanode.setValue("ACCEPTED_AD_BREAK", adbreakplacement1.toString());
        info.setMetadata(metadatanode);
        adbreakplacementevent.setNotification(info);
        return adbreakplacementevent;
    }

    public static AdBreakPlacementEvent createPlacementFailedEvent(AdBreakPlacement adbreakplacement)
    {
        AdBreakPlacementEvent adbreakplacementevent = new AdBreakPlacementEvent(MediaPlayerEvent.Type.ADBREAK_PLACEMENT_FAILED, adbreakplacement, null);
        MediaPlayerNotification.Error error = new MediaPlayerNotification.Error(MediaPlayerNotification.ErrorCode.AD_INSERTION_FAIL, "Ad-break placement operation has failed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("PROPOSED_AD_BREAK", adbreakplacement.toString());
        error.setMetadata(metadatanode);
        adbreakplacementevent.setNotification(error);
        return adbreakplacementevent;
    }

    public AdBreakPlacement getAcceptedAdBreak()
    {
        return _acceptedAdBreak;
    }

    public AdBreakPlacement getProposedAdBreak()
    {
        return _proposedAdBreak;
    }
}
