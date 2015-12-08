// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model.stream;

import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.api.model.ApiUser;
import java.util.Collections;
import java.util.List;

public class ApiPromotedPlaylist
{

    private final String adUrn;
    private final ApiPlaylist apiPlaylist;
    private final ApiUser promoter;
    private final List trackingPlaylistClickedUrls;
    private final List trackingPlaylistImpressionUrls;
    private final List trackingProfileClickedUrls;
    private final List trackingPromoterClickedUrls;

    public ApiPromotedPlaylist(ApiPlaylist apiplaylist, ApiUser apiuser, String s, List list, List list1, List list2, List list3)
    {
        apiPlaylist = apiplaylist;
        promoter = apiuser;
        adUrn = s;
        trackingPlaylistClickedUrls = list;
        trackingPlaylistImpressionUrls = list1;
        trackingProfileClickedUrls = list2;
        trackingPromoterClickedUrls = list3;
    }

    public String getAdUrn()
    {
        return adUrn;
    }

    public ApiPlaylist getApiPlaylist()
    {
        return apiPlaylist;
    }

    public ApiUser getPromoter()
    {
        return promoter;
    }

    public List getTrackingPlaylistClickedUrls()
    {
        return trackingPlaylistClickedUrls;
    }

    public List getTrackingPlaylistImpressionUrls()
    {
        return trackingPlaylistImpressionUrls;
    }

    public List getTrackingProfileClickedUrls()
    {
        return trackingProfileClickedUrls;
    }

    public List getTrackingPromoterClickedUrls()
    {
        return trackingPromoterClickedUrls;
    }

    public List getTrackingTrackPlayedUrls()
    {
        return Collections.emptyList();
    }
}
