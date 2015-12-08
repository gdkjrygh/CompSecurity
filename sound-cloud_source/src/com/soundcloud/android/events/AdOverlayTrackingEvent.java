// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import android.net.Uri;
import com.soundcloud.android.ads.AdOverlayProperty;
import com.soundcloud.android.ads.InterstitialProperty;
import com.soundcloud.android.ads.LeaveBehindProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.TrackSourceInfo;
import com.soundcloud.java.collections.PropertySet;
import java.util.List;

// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public final class AdOverlayTrackingEvent extends TrackingEvent
{

    public static final String KIND_CLICK = "click";
    public static final String KIND_IMPRESSION = "impression";
    public static final String TYPE_AUDIO_AD = "audio_ad";
    public static final String TYPE_INTERSTITIAL = "interstitial";
    public static final String TYPE_LEAVE_BEHIND = "leave_behind";
    private final List trackingUrls;

    private AdOverlayTrackingEvent(long l, String s, PropertySet propertyset, Urn urn, Urn urn1, List list, 
            TrackSourceInfo tracksourceinfo)
    {
        super(s, l);
        trackingUrls = list;
        put("user_urn", urn1.toString());
        put("monetizable_track_urn", urn.toString());
        put("ad_artwork_url", (String)propertyset.get(AdOverlayProperty.IMAGE_URL));
        put("click_through", ((Uri)propertyset.get(AdOverlayProperty.CLICK_THROUGH_URL)).toString());
        put("origin_screen", getNonNullOriginScreenValue(tracksourceinfo));
        if (propertyset.contains(LeaveBehindProperty.LEAVE_BEHIND_URN))
        {
            put("ad_urn", (String)propertyset.get(LeaveBehindProperty.LEAVE_BEHIND_URN));
            put("monetization_type", "audio_ad");
            put("ad_type", "leave_behind");
        } else
        if (propertyset.contains(InterstitialProperty.INTERSTITIAL_URN))
        {
            put("ad_urn", (String)propertyset.get(InterstitialProperty.INTERSTITIAL_URN));
            put("monetization_type", "interstitial");
            put("ad_type", "interstitial");
        }
        if (propertyset.contains(LeaveBehindProperty.AUDIO_AD_TRACK_URN))
        {
            put("ad_track_urn", ((Urn)propertyset.get(LeaveBehindProperty.AUDIO_AD_TRACK_URN)).toString());
            put("click_object_urn", ((Urn)propertyset.get(LeaveBehindProperty.AUDIO_AD_TRACK_URN)).toString());
            return;
        } else
        {
            put("ad_track_urn", urn.toString());
            return;
        }
    }

    public static AdOverlayTrackingEvent forClick(long l, PropertySet propertyset, Urn urn, Urn urn1, TrackSourceInfo tracksourceinfo)
    {
        return new AdOverlayTrackingEvent(l, "click", propertyset, urn, urn1, (List)propertyset.get(LeaveBehindProperty.TRACKING_CLICK_URLS), tracksourceinfo);
    }

    public static AdOverlayTrackingEvent forClick(PropertySet propertyset, Urn urn, Urn urn1, TrackSourceInfo tracksourceinfo)
    {
        return forClick(System.currentTimeMillis(), propertyset, urn, urn1, tracksourceinfo);
    }

    public static AdOverlayTrackingEvent forImpression(long l, PropertySet propertyset, Urn urn, Urn urn1, TrackSourceInfo tracksourceinfo)
    {
        return new AdOverlayTrackingEvent(l, "impression", propertyset, urn, urn1, (List)propertyset.get(LeaveBehindProperty.TRACKING_IMPRESSION_URLS), tracksourceinfo);
    }

    public static AdOverlayTrackingEvent forImpression(PropertySet propertyset, Urn urn, Urn urn1, TrackSourceInfo tracksourceinfo)
    {
        return forImpression(System.currentTimeMillis(), propertyset, urn, urn1, tracksourceinfo);
    }

    private String getNonNullOriginScreenValue(TrackSourceInfo tracksourceinfo)
    {
        if (tracksourceinfo != null)
        {
            return tracksourceinfo.getOriginScreen();
        } else
        {
            return "";
        }
    }

    public final List getTrackingUrls()
    {
        return trackingUrls;
    }
}
