// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.android.users.UserRepository;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics:
//            EngagementsTracking

public final class I extends b
    implements Provider
{

    private b eventBus;
    private b trackRepository;
    private b userRepository;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/analytics/EngagementsTracking, getClass().getClassLoader());
        trackRepository = l1.a("com.soundcloud.android.tracks.TrackRepository", com/soundcloud/android/analytics/EngagementsTracking, getClass().getClassLoader());
        userRepository = l1.a("com.soundcloud.android.users.UserRepository", com/soundcloud/android/analytics/EngagementsTracking, getClass().getClassLoader());
    }

    public final EngagementsTracking get()
    {
        return new EngagementsTracking((EventBus)eventBus.get(), (TrackRepository)trackRepository.get(), (UserRepository)userRepository.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(trackRepository);
        set.add(userRepository);
    }

    public I()
    {
        super("com.soundcloud.android.analytics.EngagementsTracking", "members/com.soundcloud.android.analytics.EngagementsTracking", false, com/soundcloud/android/analytics/EngagementsTracking);
    }
}
