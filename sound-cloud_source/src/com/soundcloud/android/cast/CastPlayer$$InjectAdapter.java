// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.ProgressReporter;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.cast:
//            CastPlayer, CastOperations

public final class t.VideoCastManager extends b
    implements a, Provider
{

    private b castManager;
    private b castOperations;
    private b eventBus;
    private b playQueueManager;
    private b progressReporter;
    private b supertype;

    public final void attach(l l1)
    {
        castOperations = l1.a("com.soundcloud.android.cast.CastOperations", com/soundcloud/android/cast/CastPlayer, getClass().getClassLoader());
        castManager = l1.a("com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager", com/soundcloud/android/cast/CastPlayer, getClass().getClassLoader());
        progressReporter = l1.a("com.soundcloud.android.playback.ProgressReporter", com/soundcloud/android/cast/CastPlayer, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/cast/CastPlayer, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/cast/CastPlayer, getClass().getClassLoader());
        supertype = l1.a("members/com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumerImpl", com/soundcloud/android/cast/CastPlayer, getClass().getClassLoader(), false);
    }

    public final CastPlayer get()
    {
        CastPlayer castplayer = new CastPlayer((CastOperations)castOperations.get(), (VideoCastManager)castManager.get(), (ProgressReporter)progressReporter.get(), (PlayQueueManager)playQueueManager.get(), (EventBus)eventBus.get());
        injectMembers(castplayer);
        return castplayer;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(castOperations);
        set.add(castManager);
        set.add(progressReporter);
        set.add(playQueueManager);
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(CastPlayer castplayer)
    {
        supertype.injectMembers(castplayer);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CastPlayer)obj);
    }

    public t.VideoCastManager()
    {
        super("com.soundcloud.android.cast.CastPlayer", "members/com.soundcloud.android.cast.CastPlayer", true, com/soundcloud/android/cast/CastPlayer);
    }
}
