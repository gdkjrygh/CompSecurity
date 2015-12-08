// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.ads.InterstitialProperty;
import com.soundcloud.android.ads.LeaveBehindProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerPageData

final class TrackPageData extends PlayerPageData
{

    private final Urn collectionUrn;
    private final Urn trackUrn;

    TrackPageData(int i, Urn urn, Urn urn1, PropertySet propertyset)
    {
        super(PlayerPageData.Kind.TRACK, i, propertyset);
        trackUrn = urn;
        collectionUrn = urn1;
    }

    public final Urn getCollectionUrn()
    {
        return collectionUrn;
    }

    public final Urn getTrackUrn()
    {
        return trackUrn;
    }

    final boolean hasAdOverlay()
    {
        return properties.contains(LeaveBehindProperty.LEAVE_BEHIND_URN) || properties.contains(InterstitialProperty.INTERSTITIAL_URN);
    }

    public final String toString()
    {
        return (new StringBuilder("TrackPageData{positionInPlayQueue=")).append(positionInPlayQueue).append(", trackUrn=").append(trackUrn).append(", properties=").append(properties).append('}').toString();
    }
}
