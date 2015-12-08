// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.timeline.advertising.AdPolicySelector;
import com.adobe.mediacore.timeline.advertising.AdProvider;
import com.adobe.mediacore.timeline.advertising.ContentResolver;
import java.util.List;

// Referenced classes of package com.adobe.mediacore:
//            AdClientFactory, MediaPlayerItem

public abstract class AdvertisingFactory
    implements AdClientFactory
{

    public AdvertisingFactory()
    {
    }

    public abstract AdPolicySelector createAdPolicySelector(MediaPlayerItem mediaplayeritem);

    public AdProvider createAdProvider(MediaPlayerItem mediaplayeritem)
    {
        return null;
    }

    public abstract ContentResolver createContentResolver(MediaPlayerItem mediaplayeritem);

    public abstract List createContentResolvers(MediaPlayerItem mediaplayeritem);
}
