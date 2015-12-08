// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.java.objects.MoreObjects;
import java.util.List;

abstract class ApiBaseAdVisual
{

    public final String clickthroughUrl;
    public final String imageUrl;
    public final List trackingClickUrls;
    public final List trackingImpressionUrls;
    public final String urn;

    public ApiBaseAdVisual(String s, String s1, String s2, List list, List list1)
    {
        urn = s;
        imageUrl = s1;
        clickthroughUrl = s2;
        trackingImpressionUrls = list;
        trackingClickUrls = list1;
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(getClass()).add("urn", urn).add("imageUrl", imageUrl).add("clickthroughUrl", clickthroughUrl).add("trackingImpressionUrls", trackingImpressionUrls).add("trackingClickUrls", trackingClickUrls).toString();
    }
}
