// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.soundcloud.android.ServiceInitiator;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.cast:
//            CastSessionController, CastOperations, CastPlayer

public final class Manager extends b
    implements a, Provider
{

    private b castOperations;
    private b castPlayer;
    private b eventBus;
    private b expandPlayerSubscriberProvider;
    private b playQueueManager;
    private b playSessionStateProvider;
    private b serviceInitiator;
    private b supertype;
    private b videoCastManager;

    public final void attach(l l1)
    {
        castOperations = l1.a("com.soundcloud.android.cast.CastOperations", com/soundcloud/android/cast/CastSessionController, getClass().getClassLoader());
        serviceInitiator = l1.a("com.soundcloud.android.ServiceInitiator", com/soundcloud/android/cast/CastSessionController, getClass().getClassLoader());
        castPlayer = l1.a("com.soundcloud.android.cast.CastPlayer", com/soundcloud/android/cast/CastSessionController, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/cast/CastSessionController, getClass().getClassLoader());
        videoCastManager = l1.a("com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager", com/soundcloud/android/cast/CastSessionController, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/cast/CastSessionController, getClass().getClassLoader());
        playSessionStateProvider = l1.a("com.soundcloud.android.playback.PlaySessionStateProvider", com/soundcloud/android/cast/CastSessionController, getClass().getClassLoader());
        expandPlayerSubscriberProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.ExpandPlayerSubscriber>", com/soundcloud/android/cast/CastSessionController, getClass().getClassLoader());
        supertype = l1.a("members/com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumerImpl", com/soundcloud/android/cast/CastSessionController, getClass().getClassLoader(), false);
    }

    public final CastSessionController get()
    {
        CastSessionController castsessioncontroller = new CastSessionController((CastOperations)castOperations.get(), (ServiceInitiator)serviceInitiator.get(), (CastPlayer)castPlayer.get(), (PlayQueueManager)playQueueManager.get(), (VideoCastManager)videoCastManager.get(), (EventBus)eventBus.get(), (PlaySessionStateProvider)playSessionStateProvider.get(), (Provider)expandPlayerSubscriberProvider.get());
        injectMembers(castsessioncontroller);
        return castsessioncontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(castOperations);
        set.add(serviceInitiator);
        set.add(castPlayer);
        set.add(playQueueManager);
        set.add(videoCastManager);
        set.add(eventBus);
        set.add(playSessionStateProvider);
        set.add(expandPlayerSubscriberProvider);
        set1.add(supertype);
    }

    public final void injectMembers(CastSessionController castsessioncontroller)
    {
        supertype.injectMembers(castsessioncontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CastSessionController)obj);
    }

    public Manager()
    {
        super("com.soundcloud.android.cast.CastSessionController", "members/com.soundcloud.android.cast.CastSessionController", true, com/soundcloud/android/cast/CastSessionController);
    }
}
