// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.discovery:
//            SuggestionsHelperFactory

public final class  extends b
    implements Provider
{

    private b eventBusProvider;
    private b expandPlayerSubscriberProviderProvider;
    private b navigatorProvider;
    private b playbackInitiatorProvider;

    public final void attach(l l1)
    {
        navigatorProvider = l1.a("javax.inject.Provider<com.soundcloud.android.Navigator>", com/soundcloud/android/discovery/SuggestionsHelperFactory, getClass().getClassLoader());
        eventBusProvider = l1.a("javax.inject.Provider<com.soundcloud.rx.eventbus.EventBus>", com/soundcloud/android/discovery/SuggestionsHelperFactory, getClass().getClassLoader());
        expandPlayerSubscriberProviderProvider = l1.a("javax.inject.Provider<javax.inject.Provider<com.soundcloud.android.playback.ExpandPlayerSubscriber>>", com/soundcloud/android/discovery/SuggestionsHelperFactory, getClass().getClassLoader());
        playbackInitiatorProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.PlaybackInitiator>", com/soundcloud/android/discovery/SuggestionsHelperFactory, getClass().getClassLoader());
    }

    public final SuggestionsHelperFactory get()
    {
        return new SuggestionsHelperFactory((Provider)navigatorProvider.get(), (Provider)eventBusProvider.get(), (Provider)expandPlayerSubscriberProviderProvider.get(), (Provider)playbackInitiatorProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(navigatorProvider);
        set.add(eventBusProvider);
        set.add(expandPlayerSubscriberProviderProvider);
        set.add(playbackInitiatorProvider);
    }

    public ()
    {
        super("com.soundcloud.android.discovery.SuggestionsHelperFactory", "members/com.soundcloud.android.discovery.SuggestionsHelperFactory", false, com/soundcloud/android/discovery/SuggestionsHelperFactory);
    }
}
