// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class AdPlaybackEvent extends MediaPlayerEvent
{

    private final Ad _ad;
    private final AdBreak _adBreak;
    private final int _progress;

    private AdPlaybackEvent(MediaPlayerEvent.Type type, AdBreak adbreak, Ad ad, int i)
    {
        super(type);
        _adBreak = adbreak;
        _ad = ad;
        _progress = i;
    }

    public static AdPlaybackEvent createCompleteEvent(AdBreak adbreak, Ad ad)
    {
        AdPlaybackEvent adplaybackevent = new AdPlaybackEvent(MediaPlayerEvent.Type.AD_COMPLETE, adbreak, ad, 100);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.AD_COMPLETE, "Ad has completed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("AD_BREAK", adbreak.toString());
        metadatanode.setValue("AD", ad.toString());
        info.setMetadata(metadatanode);
        adplaybackevent.setNotification(info);
        return adplaybackevent;
    }

    public static AdPlaybackEvent createProgressEvent(AdBreak adbreak, Ad ad, int i)
    {
        AdPlaybackEvent adplaybackevent = new AdPlaybackEvent(MediaPlayerEvent.Type.AD_PROGRESS, adbreak, ad, i);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.AD_PROGRESS, "Ad playback progress.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("AD_BREAK", adbreak.toString());
        metadatanode.setValue("AD", ad.toString());
        metadatanode.setValue("PROGRESS", (new StringBuilder()).append(i).append("").toString());
        info.setMetadata(metadatanode);
        adplaybackevent.setNotification(info);
        return adplaybackevent;
    }

    public static AdPlaybackEvent createStartEvent(AdBreak adbreak, Ad ad)
    {
        AdPlaybackEvent adplaybackevent = new AdPlaybackEvent(MediaPlayerEvent.Type.AD_START, adbreak, ad, 0);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.AD_START, "Ad has started.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("AD_BREAK", adbreak.toString());
        metadatanode.setValue("AD", ad.toString());
        info.setMetadata(metadatanode);
        adplaybackevent.setNotification(info);
        return adplaybackevent;
    }

    public Ad getAd()
    {
        return _ad;
    }

    public AdBreak getAdBreak()
    {
        return _adBreak;
    }

    public int getProgress()
    {
        return _progress;
    }
}
