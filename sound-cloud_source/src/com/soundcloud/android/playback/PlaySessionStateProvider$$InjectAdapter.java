// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionStateProvider, PlayQueueManager

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b playQueueManager;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/PlaySessionStateProvider, getClass().getClassLoader());
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/playback/PlaySessionStateProvider, getClass().getClassLoader());
    }

    public final PlaySessionStateProvider get()
    {
        return new PlaySessionStateProvider((EventBus)eventBus.get(), (PlayQueueManager)playQueueManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(playQueueManager);
    }

    public ()
    {
        super("com.soundcloud.android.playback.PlaySessionStateProvider", "members/com.soundcloud.android.playback.PlaySessionStateProvider", true, com/soundcloud/android/playback/PlaySessionStateProvider);
    }
}
