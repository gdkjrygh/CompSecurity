// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import dagger.a.r;

// Referenced classes of package com.soundcloud.android.discovery:
//            DiscoveryModule

public final class INCLUDES extends r
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/com.soundcloud.android.discovery.DiscoveryActivity", "members/com.soundcloud.android.discovery.DiscoveryFragment", "members/com.soundcloud.android.discovery.RecommendedTracksActivity", "members/com.soundcloud.android.discovery.RecommendedTracksFragment", "members/com.soundcloud.android.discovery.SearchActivity", "members/com.soundcloud.android.discovery.SearchResultsActivity", "members/com.soundcloud.android.discovery.PlaylistDiscoveryActivity"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final DiscoveryModule newModule()
    {
        return new DiscoveryModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ()
    {
        super(com/soundcloud/android/discovery/DiscoveryModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}
