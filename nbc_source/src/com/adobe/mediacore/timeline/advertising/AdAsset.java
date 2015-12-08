// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;

import com.adobe.mediacore.MediaResource;
import com.adobe.mediacore.metadata.Metadata;

// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            AdClick

public final class AdAsset
{

    private final AdClick _adClick;
    private final long _duration;
    private final int _id;
    private final MediaResource _mediaResource;
    private final Metadata _metadata;

    public AdAsset(int i, long l, MediaResource mediaresource, AdClick adclick, Metadata metadata)
    {
        _id = i;
        _duration = l;
        _mediaResource = mediaresource;
        _adClick = adclick;
        _metadata = metadata;
    }

    public static AdAsset newInstance(AdAsset adasset)
    {
        return new AdAsset(adasset._id, adasset._duration, adasset._mediaResource, AdClick.newInstance(adasset.getAdClick()), adasset._metadata);
    }

    public AdClick getAdClick()
    {
        return _adClick;
    }

    public long getDuration()
    {
        return _duration;
    }

    public int getId()
    {
        return _id;
    }

    public MediaResource getMediaResource()
    {
        return _mediaResource;
    }

    public Metadata getMetadata()
    {
        return _metadata;
    }
}
