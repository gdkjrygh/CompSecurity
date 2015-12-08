// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.discovery:
//            DiscoveryAdapter, RecommendationItemRenderer, PlaylistTagRenderer, SearchItemRenderer

public final class  extends b
    implements a, Provider
{

    private b playlistTagRenderer;
    private b searchItemRenderer;
    private b supertype;
    private b trackRecommendationRenderer;

    public final void attach(l l1)
    {
        trackRecommendationRenderer = l1.a("com.soundcloud.android.discovery.RecommendationItemRenderer", com/soundcloud/android/discovery/DiscoveryAdapter, getClass().getClassLoader());
        playlistTagRenderer = l1.a("com.soundcloud.android.discovery.PlaylistTagRenderer", com/soundcloud/android/discovery/DiscoveryAdapter, getClass().getClassLoader());
        searchItemRenderer = l1.a("com.soundcloud.android.discovery.SearchItemRenderer", com/soundcloud/android/discovery/DiscoveryAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerItemAdapter", com/soundcloud/android/discovery/DiscoveryAdapter, getClass().getClassLoader(), false);
    }

    public final DiscoveryAdapter get()
    {
        DiscoveryAdapter discoveryadapter = new DiscoveryAdapter((RecommendationItemRenderer)trackRecommendationRenderer.get(), (PlaylistTagRenderer)playlistTagRenderer.get(), (SearchItemRenderer)searchItemRenderer.get());
        injectMembers(discoveryadapter);
        return discoveryadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(trackRecommendationRenderer);
        set.add(playlistTagRenderer);
        set.add(searchItemRenderer);
        set1.add(supertype);
    }

    public final void injectMembers(DiscoveryAdapter discoveryadapter)
    {
        supertype.injectMembers(discoveryadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((DiscoveryAdapter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.discovery.DiscoveryAdapter", "members/com.soundcloud.android.discovery.DiscoveryAdapter", false, com/soundcloud/android/discovery/DiscoveryAdapter);
    }
}
