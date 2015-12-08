// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.TrackSourceInfo;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.ads:
//            AdOverlayImpressionOperations

private static final class trackSourceInfo
{

    private final PropertySet adMetaData;
    private final boolean adOverlayIsVisible;
    private final Urn currentPlayingUrn;
    private final boolean isAppInForeground;
    private final boolean playerIsExpanding;
    private final TrackSourceInfo trackSourceInfo;







    public (boolean flag, boolean flag1, boolean flag2, Urn urn, PropertySet propertyset, TrackSourceInfo tracksourceinfo)
    {
        isAppInForeground = flag1;
        adOverlayIsVisible = flag;
        playerIsExpanding = flag2;
        currentPlayingUrn = urn;
        adMetaData = propertyset;
        trackSourceInfo = tracksourceinfo;
    }
}
