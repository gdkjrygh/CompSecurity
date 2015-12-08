// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import android.net.Uri;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.optional.Optional;
import java.util.List;

// Referenced classes of package com.soundcloud.android.ads:
//            VideoAdProperty, ApiCompanionAd, ApiDisplayProperties, ApiVideoTracking

class ApiVideoAd
    implements PropertySetSource
{

    private final String adUrn;
    private final List videoSources;
    private final ApiVideoTracking videoTracking;
    private final ApiCompanionAd visualAd;

    public ApiVideoAd(String s, List list, ApiVideoTracking apivideotracking, ApiCompanionAd apicompanionad)
    {
        adUrn = s;
        videoSources = list;
        visualAd = apicompanionad;
        videoTracking = apivideotracking;
    }

    public List getVideoSources()
    {
        return videoSources;
    }

    public Optional getVisualAd()
    {
        if (visualAd != null)
        {
            return Optional.of(visualAd);
        } else
        {
            return Optional.absent();
        }
    }

    public PropertySet toPropertySet()
    {
        return PropertySet.from(new PropertyBinding[] {
            VideoAdProperty.AD_URN.bind(adUrn), VideoAdProperty.AD_TYPE.bind("video_ad"), VideoAdProperty.COMPANION_URN.bind(visualAd.urn), VideoAdProperty.ARTWORK.bind(Uri.parse(visualAd.imageUrl)), VideoAdProperty.CLICK_THROUGH_LINK.bind(Uri.parse(visualAd.clickthroughUrl)), VideoAdProperty.DEFAULT_TEXT_COLOR.bind(visualAd.displayProperties.defaultTextColor), VideoAdProperty.DEFAULT_BACKGROUND_COLOR.bind(visualAd.displayProperties.defaultBackgroundColor), VideoAdProperty.PRESSED_TEXT_COLOR.bind(visualAd.displayProperties.pressedTextColor), VideoAdProperty.PRESSED_BACKGROUND_COLOR.bind(visualAd.displayProperties.pressedBackgroundColor), VideoAdProperty.FOCUSED_TEXT_COLOR.bind(visualAd.displayProperties.focusedTextColor), 
            VideoAdProperty.FOCUSED_BACKGROUND_COLOR.bind(visualAd.displayProperties.focusedBackgroundColor), VideoAdProperty.AD_CLICKTHROUGH_URLS.bind(visualAd.trackingClickUrls), VideoAdProperty.AD_COMPANION_DISPLAY_IMPRESSION_URLS.bind(visualAd.trackingImpressionUrls)
        }).merge(videoTracking.toPropertySet());
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(getClass()).add("urn", adUrn).add("videoSources", videoSources).add("visualAd", visualAd).toString();
    }
}
