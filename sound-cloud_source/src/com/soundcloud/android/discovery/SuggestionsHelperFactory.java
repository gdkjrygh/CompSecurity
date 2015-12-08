// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.search.suggestions.SuggestionsAdapter;
import com.soundcloud.rx.eventbus.EventBus;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.discovery:
//            SuggestionsHelper

class SuggestionsHelperFactory
{

    private final Provider eventBusProvider;
    private final Provider expandPlayerSubscriberProviderProvider;
    private final Provider navigatorProvider;
    private final Provider playbackInitiatorProvider;

    SuggestionsHelperFactory(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        navigatorProvider = provider;
        eventBusProvider = provider1;
        expandPlayerSubscriberProviderProvider = provider2;
        playbackInitiatorProvider = provider3;
    }

    SuggestionsHelper create(SuggestionsAdapter suggestionsadapter)
    {
        return new SuggestionsHelper((Navigator)navigatorProvider.get(), (EventBus)eventBusProvider.get(), (Provider)expandPlayerSubscriberProviderProvider.get(), (PlaybackInitiator)playbackInitiatorProvider.get(), suggestionsadapter);
    }
}
