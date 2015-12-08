// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.res.Resources;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            SlidingPlayerController

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b playQueueManager;
    private b resources;
    private b supertype;

    public final void attach(l l1)
    {
        playQueueManager = l1.a("com.soundcloud.android.playback.PlayQueueManager", com/soundcloud/android/playback/ui/SlidingPlayerController, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/playback/ui/SlidingPlayerController, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/ui/SlidingPlayerController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/playback/ui/SlidingPlayerController, getClass().getClassLoader(), false);
    }

    public final SlidingPlayerController get()
    {
        SlidingPlayerController slidingplayercontroller = new SlidingPlayerController((PlayQueueManager)playQueueManager.get(), (Resources)resources.get(), (EventBus)eventBus.get());
        injectMembers(slidingplayercontroller);
        return slidingplayercontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playQueueManager);
        set.add(resources);
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(SlidingPlayerController slidingplayercontroller)
    {
        supertype.injectMembers(slidingplayercontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SlidingPlayerController)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.SlidingPlayerController", "members/com.soundcloud.android.playback.ui.SlidingPlayerController", false, com/soundcloud/android/playback/ui/SlidingPlayerController);
    }
}
