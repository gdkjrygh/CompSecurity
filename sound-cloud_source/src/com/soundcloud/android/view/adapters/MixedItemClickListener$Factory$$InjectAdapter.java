// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.playback.PlaybackInitiator;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

public final class  extends b
    implements Provider
{

    private b featureOperations;
    private b navigator;
    private b playbackInitiator;
    private b subscriberProvider;

    public final void attach(l l1)
    {
        playbackInitiator = l1.a("com.soundcloud.android.playback.PlaybackInitiator", com/soundcloud/android/view/adapters/MixedItemClickListener$Factory, getClass().getClassLoader());
        subscriberProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.ExpandPlayerSubscriber>", com/soundcloud/android/view/adapters/MixedItemClickListener$Factory, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/view/adapters/MixedItemClickListener$Factory, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/view/adapters/MixedItemClickListener$Factory, getClass().getClassLoader());
    }

    public final navigator get()
    {
        return new navigator((PlaybackInitiator)playbackInitiator.get(), (Provider)subscriberProvider.get(), (FeatureOperations)featureOperations.get(), (Navigator)navigator.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playbackInitiator);
        set.add(subscriberProvider);
        set.add(featureOperations);
        set.add(navigator);
    }

    public ()
    {
        super("com.soundcloud.android.view.adapters.MixedItemClickListener$Factory", "members/com.soundcloud.android.view.adapters.MixedItemClickListener$Factory", false, com/soundcloud/android/view/adapters/MixedItemClickListener$Factory);
    }
}
