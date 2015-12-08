// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.PromotedListItem;
import com.soundcloud.java.optional.Optional;
import java.util.List;

// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public final class PromotedTrackingEvent extends TrackingEvent
{

    public static final String KIND_CLICK = "click";
    public static final String KIND_IMPRESSION = "impression";
    public static final String TYPE_PROMOTED = "promoted";
    private final List trackingUrls;

    private PromotedTrackingEvent(String s, long l, String s1, String s2, Optional optional, List list, 
            String s3)
    {
        super(s, l);
        trackingUrls = list;
        put("monetization_type", "promoted");
        put("ad_urn", s1);
        put("origin_screen", s3);
        put("ad_track_urn", s2);
        if (optional.isPresent())
        {
            put("promoter_urn", ((Urn)optional.get()).toString());
        }
    }

    private static PromotedTrackingEvent basePromotedEvent(String s, PromotedSourceInfo promotedsourceinfo, List list, String s1)
    {
        return new PromotedTrackingEvent(s, System.currentTimeMillis(), promotedsourceinfo.getAdUrn(), promotedsourceinfo.getPromotedItemUrn().toString(), promotedsourceinfo.getPromoterUrn(), list, s1);
    }

    private static PromotedTrackingEvent basePromotedEvent(String s, PromotedListItem promotedlistitem, List list, String s1)
    {
        return basePromotedEvent(s, PromotedSourceInfo.fromItem(promotedlistitem), list, s1);
    }

    public static PromotedTrackingEvent forImpression(PromotedListItem promotedlistitem, String s)
    {
        return basePromotedEvent("impression", promotedlistitem, promotedlistitem.getImpressionUrls(), s);
    }

    public static PromotedTrackingEvent forItemClick(PromotedListItem promotedlistitem, String s)
    {
        return (PromotedTrackingEvent)basePromotedEvent("click", promotedlistitem, promotedlistitem.getClickUrls(), s).put("click_object_urn", promotedlistitem.getEntityUrn().toString()).put("click_target_urn", promotedlistitem.getEntityUrn().toString());
    }

    public static PromotedTrackingEvent forPromoterClick(PromotedListItem promotedlistitem, String s)
    {
        return (PromotedTrackingEvent)basePromotedEvent("click", promotedlistitem, promotedlistitem.getPromoterClickUrls(), s).put("click_object_urn", promotedlistitem.getEntityUrn().toString()).put("click_target_urn", ((Urn)promotedlistitem.getPromoterUrn().get()).toString());
    }

    public final List getTrackingUrls()
    {
        return trackingUrls;
    }
}
