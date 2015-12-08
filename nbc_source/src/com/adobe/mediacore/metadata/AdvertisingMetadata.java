// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.metadata;

import com.adobe.mediacore.utils.StringUtils;
import com.adobe.mediacore.utils.TimeRangeCollection;

// Referenced classes of package com.adobe.mediacore.metadata:
//            MetadataNode, DefaultMetadataKeys, AdBreakAsWatched, AdSignalingMode, 
//            Metadata

public class AdvertisingMetadata extends MetadataNode
{

    public AdvertisingMetadata()
    {
    }

    public final AdBreakAsWatched getAdBreakAsWatched()
    {
        String s = getValue(DefaultMetadataKeys.AD_BREAK_AS_WATCHED_KEY.getValue());
        if (StringUtils.isEmpty(s))
        {
            return AdBreakAsWatched.AD_BREAK_AS_WATCHED_ON_BEGIN;
        } else
        {
            return AdBreakAsWatched.createFrom(s);
        }
    }

    public final String getEnableLivePreroll()
    {
        return getValue(DefaultMetadataKeys.ENABLE_LIVE_PRE_ROLL.getValue());
    }

    public final AdSignalingMode getSignalingMode()
    {
        String s = getValue(DefaultMetadataKeys.AD_SIGNALING_MODE_KEY.getValue());
        if (StringUtils.isEmpty(s))
        {
            return AdSignalingMode.DEFAULT;
        } else
        {
            return AdSignalingMode.createFrom(s);
        }
    }

    public final void setAdBreakAsWatched(AdBreakAsWatched adbreakaswatched)
    {
        setValue(DefaultMetadataKeys.AD_BREAK_AS_WATCHED_KEY.getValue(), adbreakaswatched.getValue());
    }

    public final void setEnableLivePreroll(String s)
    {
        setValue(DefaultMetadataKeys.ENABLE_LIVE_PRE_ROLL.getValue(), s);
    }

    public final void setSignalingMode(AdSignalingMode adsignalingmode)
    {
        setValue(DefaultMetadataKeys.AD_SIGNALING_MODE_KEY.getValue(), adsignalingmode.getValue());
    }

    public final void setTimeRanges(TimeRangeCollection timerangecollection, Metadata metadata)
    {
        setNode(DefaultMetadataKeys.TIME_RANGES_METADATA_KEY.getValue(), timerangecollection.toMetadata(metadata));
    }
}
