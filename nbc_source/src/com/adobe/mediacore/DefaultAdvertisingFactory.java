// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import android.content.Context;
import com.adobe.mediacore.metadata.AdSignalingMode;
import com.adobe.mediacore.timeline.advertising.AdPolicySelector;
import com.adobe.mediacore.timeline.advertising.ContentResolver;
import java.util.List;

// Referenced classes of package com.adobe.mediacore:
//            AdvertisingFactory, DefaultAdPolicySelector, MediaPlayerItem, DefaultContentResolverFactory, 
//            DefaultOpportunityDetectorFactory, PlacementOpportunityDetector

public class DefaultAdvertisingFactory extends AdvertisingFactory
{

    private AdSignalingMode _adSignalingMode;
    private Context _context;

    public DefaultAdvertisingFactory(AdSignalingMode adsignalingmode)
    {
        _adSignalingMode = adsignalingmode;
    }

    public DefaultAdvertisingFactory(AdSignalingMode adsignalingmode, Context context)
    {
        _adSignalingMode = adsignalingmode;
        _context = context;
    }

    public AdPolicySelector createAdPolicySelector(MediaPlayerItem mediaplayeritem)
    {
        return new DefaultAdPolicySelector(mediaplayeritem);
    }

    public ContentResolver createContentResolver(MediaPlayerItem mediaplayeritem)
    {
        return DefaultContentResolverFactory.createContentResolver(mediaplayeritem.getResource(), _context);
    }

    public List createContentResolvers(MediaPlayerItem mediaplayeritem)
    {
        return DefaultContentResolverFactory.createContentResolvers(mediaplayeritem.getResource(), _context);
    }

    public PlacementOpportunityDetector createOpportunityDetector(MediaPlayerItem mediaplayeritem)
    {
        return DefaultOpportunityDetectorFactory.createOpportunityDetector(mediaplayeritem, _adSignalingMode);
    }
}
