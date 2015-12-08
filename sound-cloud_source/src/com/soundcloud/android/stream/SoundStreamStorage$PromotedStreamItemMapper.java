// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.model.PromotedItemProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.propeller.CursorReader;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamStorage

private static class <init> extends <init>
{

    private void addOptionalPromotedProperties(CursorReader cursorreader, PropertySet propertyset)
    {
        if (cursorreader.isNotNull("ad_urn"))
        {
            propertyset.put(PromotedItemProperty.AD_URN, cursorreader.getString("ad_urn"));
            propertyset.put(PromotedItemProperty.TRACK_CLICKED_URLS, splitUrls(cursorreader.getString("tracking_track_clicked_urls")));
            propertyset.put(PromotedItemProperty.TRACK_IMPRESSION_URLS, splitUrls(cursorreader.getString("tracking_track_impression_urls")));
            propertyset.put(PromotedItemProperty.TRACK_PLAYED_URLS, splitUrls(cursorreader.getString("tracking_track_played_urls")));
            propertyset.put(PromotedItemProperty.PROMOTER_CLICKED_URLS, splitUrls(cursorreader.getString("tracking_promoter_clicked_urls")));
            addOptionalPromoter(cursorreader, propertyset);
        }
    }

    private void addOptionalPromoter(CursorReader cursorreader, PropertySet propertyset)
    {
        if (cursorreader.isNotNull("promoter_id"))
        {
            propertyset.put(PromotedItemProperty.PROMOTER_URN, Optional.of(Urn.forUser(cursorreader.getLong("promoter_id"))));
            propertyset.put(PromotedItemProperty.PROMOTER_NAME, Optional.of(cursorreader.getString("promoter_name")));
            return;
        } else
        {
            propertyset.put(PromotedItemProperty.PROMOTER_URN, Optional.absent());
            propertyset.put(PromotedItemProperty.PROMOTER_NAME, Optional.absent());
            return;
        }
    }

    private List splitUrls(String s)
    {
        return Lists.newArrayList(s.split(" "));
    }

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = super.addOptionalPromoter(cursorreader);
        addOptionalPromotedProperties(cursorreader, propertyset);
        return propertyset;
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private ()
    {
        super(null);
    }

    ( )
    {
        this();
    }
}
