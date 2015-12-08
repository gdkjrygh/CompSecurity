// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.playback.PlaybackInitiator;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.view.adapters:
//            MixedItemClickListener

public static class navigator
{

    private final FeatureOperations featureOperations;
    private final Navigator navigator;
    private final PlaybackInitiator playbackInitiator;
    private final Provider subscriberProvider;

    public MixedItemClickListener create(Screen screen, SearchQuerySourceInfo searchquerysourceinfo)
    {
        return new MixedItemClickListener(playbackInitiator, subscriberProvider, featureOperations, navigator, screen, searchquerysourceinfo);
    }

    public I(PlaybackInitiator playbackinitiator, Provider provider, FeatureOperations featureoperations, Navigator navigator1)
    {
        playbackInitiator = playbackinitiator;
        subscriberProvider = provider;
        featureOperations = featureoperations;
        navigator = navigator1;
    }
}
