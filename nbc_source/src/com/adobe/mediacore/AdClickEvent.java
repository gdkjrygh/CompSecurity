// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdClick;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class AdClickEvent extends MediaPlayerEvent
{

    private final Ad _ad;
    private final AdBreak _adBreak;
    private final AdClick _adClick;

    private AdClickEvent(MediaPlayerEvent.Type type, Ad ad, AdBreak adbreak, AdClick adclick)
    {
        super(type);
        _ad = ad;
        _adBreak = adbreak;
        _adClick = adclick;
    }

    public static AdClickEvent createAdClickEvent()
    {
        return new AdClickEvent(MediaPlayerEvent.Type.VIEW_CLICKED, null, null, null);
    }

    public static AdClickEvent createAdClickEvent(AdBreak adbreak, Ad ad, AdClick adclick)
    {
        AdClickEvent adclickevent = new AdClickEvent(MediaPlayerEvent.Type.AD_CLICK, ad, adbreak, adclick);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.AD_CLICK, "Ad click event detected.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("AD_BREAK", adbreak.toString());
        metadatanode.setValue("AD", ad.toString());
        metadatanode.setValue("AD_CLICK", adclick.toString());
        info.setMetadata(metadatanode);
        adclickevent.setNotification(info);
        return adclickevent;
    }

    public Ad getAd()
    {
        return _ad;
    }

    public AdBreak getAdBreak()
    {
        return _adBreak;
    }

    public AdClick getAdClick()
    {
        return _adClick;
    }
}
