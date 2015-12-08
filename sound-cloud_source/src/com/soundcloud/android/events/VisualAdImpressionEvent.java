// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import android.net.Uri;
import com.soundcloud.android.ads.AdProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.TrackSourceInfo;
import com.soundcloud.java.collections.PropertySet;
import java.util.List;

// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public class VisualAdImpressionEvent extends TrackingEvent
{

    private final List impressionUrls;

    public VisualAdImpressionEvent(PropertySet propertyset, Urn urn, Urn urn1, TrackSourceInfo tracksourceinfo)
    {
        this(propertyset, urn, urn1, tracksourceinfo, System.currentTimeMillis());
    }

    public VisualAdImpressionEvent(PropertySet propertyset, Urn urn, Urn urn1, TrackSourceInfo tracksourceinfo, long l)
    {
        super("default", l);
        put("user_urn", urn1.toString());
        put("ad_track_urn", urn.toString());
        put("monetizable_track_urn", ((Urn)propertyset.get(AdProperty.MONETIZABLE_TRACK_URN)).toString());
        put("ad_urn", (String)propertyset.get(AdProperty.COMPANION_URN));
        put("ad_artwork_url", ((Uri)propertyset.get(AdProperty.ARTWORK)).toString());
        put("origin_screen", tracksourceinfo.getOriginScreen());
        impressionUrls = (List)propertyset.get(AdProperty.AD_COMPANION_DISPLAY_IMPRESSION_URLS);
    }

    public List getImpressionUrls()
    {
        return impressionUrls;
    }
}
