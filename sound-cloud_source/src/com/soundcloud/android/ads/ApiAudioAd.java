// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import android.net.Uri;
import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.objects.MoreObjects;
import java.util.List;

// Referenced classes of package com.soundcloud.android.ads:
//            AdProperty, ApiCompanionAd, ApiDisplayProperties, ApiLeaveBehind

class ApiAudioAd
    implements PropertySetSource
{
    private static class RelatedResources
    {

        private final ApiLeaveBehind apiLeaveBehind;
        private final ApiCompanionAd visualAd;



        private RelatedResources(ApiCompanionAd apicompanionad, ApiLeaveBehind apileavebehind)
        {
            visualAd = apicompanionad;
            apiLeaveBehind = apileavebehind;
        }
    }


    private final ApiTrack apiTrack;
    private final ApiLeaveBehind leaveBehind;
    public final List trackingFinishUrls;
    public final List trackingImpressionUrls;
    public final List trackingSkipUrls;
    private final String urn;
    private final ApiCompanionAd visualAd;

    public ApiAudioAd(String s, ApiTrack apitrack, RelatedResources relatedresources, List list, List list1, List list2)
    {
        this(s, apitrack, relatedresources.visualAd, relatedresources.apiLeaveBehind, list, list1, list2);
    }

    public ApiAudioAd(String s, ApiTrack apitrack, ApiCompanionAd apicompanionad, ApiLeaveBehind apileavebehind, List list, List list1, List list2)
    {
        urn = s;
        apiTrack = apitrack;
        visualAd = apicompanionad;
        leaveBehind = apileavebehind;
        trackingImpressionUrls = list;
        trackingFinishUrls = list1;
        trackingSkipUrls = list2;
    }

    public ApiTrack getApiTrack()
    {
        return apiTrack;
    }

    public ApiCompanionAd getCompanion()
    {
        return visualAd;
    }

    public ApiLeaveBehind getLeaveBehind()
    {
        return leaveBehind;
    }

    public String getUrn()
    {
        return urn;
    }

    public boolean hasApiLeaveBehind()
    {
        return leaveBehind != null;
    }

    public PropertySet toPropertySet()
    {
        return PropertySet.from(new PropertyBinding[] {
            AdProperty.AD_URN.bind(urn), AdProperty.AD_TYPE.bind("audio_ad"), AdProperty.COMPANION_URN.bind(visualAd.urn), AdProperty.ARTWORK.bind(Uri.parse(visualAd.imageUrl)), AdProperty.CLICK_THROUGH_LINK.bind(Uri.parse(visualAd.clickthroughUrl)), AdProperty.DEFAULT_TEXT_COLOR.bind(visualAd.displayProperties.defaultTextColor), AdProperty.DEFAULT_BACKGROUND_COLOR.bind(visualAd.displayProperties.defaultBackgroundColor), AdProperty.PRESSED_TEXT_COLOR.bind(visualAd.displayProperties.pressedTextColor), AdProperty.PRESSED_BACKGROUND_COLOR.bind(visualAd.displayProperties.pressedBackgroundColor), AdProperty.FOCUSED_TEXT_COLOR.bind(visualAd.displayProperties.focusedTextColor), 
            AdProperty.FOCUSED_BACKGROUND_COLOR.bind(visualAd.displayProperties.focusedBackgroundColor), AdProperty.AD_IMPRESSION_URLS.bind(trackingImpressionUrls), AdProperty.AD_FINISH_URLS.bind(trackingFinishUrls), AdProperty.AD_CLICKTHROUGH_URLS.bind(visualAd.trackingClickUrls), AdProperty.AD_SKIP_URLS.bind(trackingSkipUrls), AdProperty.AD_COMPANION_DISPLAY_IMPRESSION_URLS.bind(visualAd.trackingImpressionUrls)
        });
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(getClass()).add("urn", urn).add("apiTrack", apiTrack).add("visualAd", visualAd).add("leaveBehind", leaveBehind).add("trackingImpressionUrls", trackingImpressionUrls).add("trackingFinishUrls", trackingFinishUrls).add("trackingSkipUrls", trackingSkipUrls).toString();
    }
}
