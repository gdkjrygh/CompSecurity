// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.timeline.advertising.AdProvider;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerItem, PlacementOpportunityDetector

public interface AdClientFactory
{

    public abstract AdProvider createAdProvider(MediaPlayerItem mediaplayeritem);

    public abstract PlacementOpportunityDetector createOpportunityDetector(MediaPlayerItem mediaplayeritem);
}
