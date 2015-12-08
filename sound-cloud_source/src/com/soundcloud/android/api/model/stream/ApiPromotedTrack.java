// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model.stream;

import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.api.model.ApiUser;
import java.util.List;

public class ApiPromotedTrack
{

    private final String adUrn;
    private final ApiTrack apiTrack;
    private final ApiUser promoter;
    private final List trackingProfileClickedUrls;
    private final List trackingPromoterClickedUrls;
    private final List trackingTrackClickedUrls;
    private final List trackingTrackImpressionUrls;
    private final List trackingTrackPlayedUrls;

    public ApiPromotedTrack(ApiTrack apitrack, ApiUser apiuser, String s, List list, List list1, List list2, List list3, 
            List list4)
    {
        apiTrack = apitrack;
        promoter = apiuser;
        adUrn = s;
        trackingTrackClickedUrls = list;
        trackingProfileClickedUrls = list1;
        trackingPromoterClickedUrls = list2;
        trackingTrackPlayedUrls = list3;
        trackingTrackImpressionUrls = list4;
    }

    public String getAdUrn()
    {
        return adUrn;
    }

    public ApiTrack getApiTrack()
    {
        return apiTrack;
    }

    public ApiUser getPromoter()
    {
        return promoter;
    }

    public List getTrackingProfileClickedUrls()
    {
        return trackingProfileClickedUrls;
    }

    public List getTrackingPromoterClickedUrls()
    {
        return trackingPromoterClickedUrls;
    }

    public List getTrackingTrackClickedUrls()
    {
        return trackingTrackClickedUrls;
    }

    public List getTrackingTrackImpressionUrls()
    {
        return trackingTrackImpressionUrls;
    }

    public List getTrackingTrackPlayedUrls()
    {
        return trackingTrackPlayedUrls;
    }
}
