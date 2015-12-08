// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.util;

import com.pinterest.api.model.Interest;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HomefeedBuilderData
{

    private static HomefeedBuilderData _instance;
    private Set _followedInterestUids;
    private Set _unfollowedInterestUids;

    private HomefeedBuilderData()
    {
        _followedInterestUids = new HashSet();
        _unfollowedInterestUids = new HashSet();
    }

    public static HomefeedBuilderData get()
    {
        if (_instance == null)
        {
            _instance = new HomefeedBuilderData();
        }
        return _instance;
    }

    public static HashMap getAuxData(Interest interest, com.pinterest.activity.home.HomefeedBuilderFragment.MODE mode)
    {
        return getAuxData(interest, getReferrer(mode));
    }

    public static HashMap getAuxData(Interest interest, String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("interest", interest.getUrlName());
        if (interest.getRecommendationSource() != null)
        {
            hashmap.put("recommendation_source", interest.getRecommendationSource());
        }
        hashmap.put("referrer", s);
        return hashmap;
    }

    public static String getReferrer(com.pinterest.activity.home.HomefeedBuilderFragment.MODE mode)
    {
        if (mode == com.pinterest.activity.home.HomefeedBuilderFragment.MODE.SEARCH || mode == com.pinterest.activity.home.HomefeedBuilderFragment.MODE.SEARCH_TYPEAHEAD)
        {
            return "homefeed_builder_search";
        }
        if (mode == com.pinterest.activity.home.HomefeedBuilderFragment.MODE.DYNAMIC_GRID)
        {
            return "dynamic_grid_story";
        } else
        {
            return "homefeed_builder_browse";
        }
    }

    public Set getFollowedInterestUids()
    {
        return _followedInterestUids;
    }

    public Set getUnfollowedInterestUids()
    {
        return _unfollowedInterestUids;
    }

    public boolean hasFollowedOrUnfollowed()
    {
        return _followedInterestUids.size() > 0 || _unfollowedInterestUids.size() > 0;
    }
}
