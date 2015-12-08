// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.discovery:
//            DiscoveryItem, RecommendationProperty, RecommendationReason, RecommendedTrackProperty

class RecommendationItem extends DiscoveryItem
{

    private final PropertySet source;

    RecommendationItem(PropertySet propertyset)
    {
        super(DiscoveryItem.Kind.TrackRecommendationItem);
        source = propertyset;
    }

    int getRecommendationCount()
    {
        return ((Integer)source.get(RecommendationProperty.RECOMMENDED_TRACKS_COUNT)).intValue();
    }

    RecommendationReason getRecommendationReason()
    {
        return (RecommendationReason)source.get(RecommendationProperty.REASON);
    }

    String getRecommendationTitle()
    {
        return (String)source.get(RecommendedTrackProperty.TITLE);
    }

    Urn getRecommendationUrn()
    {
        return (Urn)source.get(RecommendedTrackProperty.URN);
    }

    String getRecommendationUserName()
    {
        return (String)source.get(RecommendedTrackProperty.USERNAME);
    }

    long getSeedTrackLocalId()
    {
        return ((Long)source.get(RecommendationProperty.SEED_TRACK_LOCAL_ID)).longValue();
    }

    String getSeedTrackTitle()
    {
        return (String)source.get(RecommendationProperty.SEED_TRACK_TITLE);
    }

    Urn getSeedTrackUrn()
    {
        return (Urn)source.get(RecommendationProperty.SEED_TRACK_URN);
    }
}
