// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.deeplinks;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.ServiceInitiator;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.deeplinks:
//            IntentResolver, ResolveOperations, ReferrerResolver

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b eventBus;
    private b navigator;
    private b playQueueManager;
    private b playbackInitiator;
    private b referrerResolver;
    private b resolveOperations;
    private b serviceInitiator;

    public final void attach(l l1)
    {
        resolveOperations = l1.a("com.soundcloud.android.deeplinks.ResolveOperations", com/soundcloud/android/deeplinks/IntentResolver, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/deeplinks/IntentResolver, getClass().getClassLoader());
        serviceInitiator = l1.a("com.soundcloud.android.ServiceInitiator", com/soundcloud/android/deeplinks/IntentResolver, getClass().getClassLoader());
        playbackInitiator = l1.a("com.soundcloud.android.playback.PlaybackInitiator", com/soundcloud/android/deeplinks/IntentResolver, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/deeplinks/IntentResolver, getClass().getClassLoader());
        referrerResolver = l1.a("com.soundcloud.android.deeplinks.ReferrerResolver", com/soundcloud/android/deeplinks/IntentResolver, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/deeplinks/IntentResolver, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/deeplinks/IntentResolver, getClass().getClassLoader());
    }

    public final IntentResolver get()
    {
        return new IntentResolver((ResolveOperations)resolveOperations.get(), (AccountOperations)accountOperations.get(), (ServiceInitiator)serviceInitiator.get(), (PlaybackInitiator)playbackInitiator.get(), (PlayQueueManager)playQueueManager.get(), (ReferrerResolver)referrerResolver.get(), (EventBus)eventBus.get(), (Navigator)navigator.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resolveOperations);
        set.add(accountOperations);
        set.add(serviceInitiator);
        set.add(playbackInitiator);
        set.add(playQueueManager);
        set.add(referrerResolver);
        set.add(eventBus);
        set.add(navigator);
    }

    public ()
    {
        super("com.soundcloud.android.deeplinks.IntentResolver", "members/com.soundcloud.android.deeplinks.IntentResolver", false, com/soundcloud/android/deeplinks/IntentResolver);
    }
}
