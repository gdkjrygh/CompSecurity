// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.timeline.advertising.AdBreak;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class AdBreakPlaybackEvent extends MediaPlayerEvent
{

    private final AdBreak _adBreak;

    private AdBreakPlaybackEvent(MediaPlayerEvent.Type type, AdBreak adbreak)
    {
        super(type);
        _adBreak = adbreak;
    }

    public static AdBreakPlaybackEvent createCompleteEvent(AdBreak adbreak)
    {
        AdBreakPlaybackEvent adbreakplaybackevent = new AdBreakPlaybackEvent(MediaPlayerEvent.Type.AD_BREAK_COMPLETE, adbreak);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.AD_BREAK_COMPLETE, "Ad-break has completed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("AD_BREAK", adbreak.toString());
        info.setMetadata(metadatanode);
        adbreakplaybackevent.setNotification(info);
        return adbreakplaybackevent;
    }

    public static AdBreakPlaybackEvent createSkippedEvent(AdBreak adbreak)
    {
        AdBreakPlaybackEvent adbreakplaybackevent = new AdBreakPlaybackEvent(MediaPlayerEvent.Type.AD_BREAK_SKIPPED, adbreak);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.AD_BREAK_SKIPPED, "Ad-break has been skipped.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("AD_BREAK", adbreak.toString());
        info.setMetadata(metadatanode);
        adbreakplaybackevent.setNotification(info);
        return adbreakplaybackevent;
    }

    public static AdBreakPlaybackEvent createStartEvent(AdBreak adbreak)
    {
        AdBreakPlaybackEvent adbreakplaybackevent = new AdBreakPlaybackEvent(MediaPlayerEvent.Type.AD_BREAK_START, adbreak);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.AD_BREAK_START, "Ad-break has started.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("AD_BREAK", adbreak.toString());
        info.setMetadata(metadatanode);
        adbreakplaybackevent.setNotification(info);
        return adbreakplaybackevent;
    }

    public AdBreak getAdBreak()
    {
        return _adBreak;
    }
}
