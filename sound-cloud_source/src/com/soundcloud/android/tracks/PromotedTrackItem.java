// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.model.PromotedItemProperty;
import com.soundcloud.android.presentation.PromotedListItem;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;
import java.util.List;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItem

public class PromotedTrackItem extends TrackItem
    implements PromotedListItem
{

    PromotedTrackItem(PropertySet propertyset)
    {
        super(propertyset);
    }

    public static PromotedTrackItem from(PropertySet propertyset)
    {
        return new PromotedTrackItem(propertyset);
    }

    public String getAdUrn()
    {
        return (String)source.get(PromotedItemProperty.AD_URN);
    }

    public List getClickUrls()
    {
        return (List)source.get(PromotedItemProperty.TRACK_CLICKED_URLS);
    }

    public List getImpressionUrls()
    {
        return (List)source.get(PromotedItemProperty.TRACK_IMPRESSION_URLS);
    }

    public com.soundcloud.android.stream.StreamItem.Kind getKind()
    {
        return com.soundcloud.android.stream.StreamItem.Kind.PROMOTED;
    }

    public List getPlayUrls()
    {
        return (List)source.get(PromotedItemProperty.TRACK_PLAYED_URLS);
    }

    public List getPromoterClickUrls()
    {
        return (List)source.get(PromotedItemProperty.PROMOTER_CLICKED_URLS);
    }

    public Optional getPromoterName()
    {
        return (Optional)source.get(PromotedItemProperty.PROMOTER_NAME);
    }

    public Optional getPromoterUrn()
    {
        return (Optional)source.get(PromotedItemProperty.PROMOTER_URN);
    }

    public boolean hasPromoter()
    {
        return ((Optional)source.get(PromotedItemProperty.PROMOTER_URN)).isPresent();
    }
}
