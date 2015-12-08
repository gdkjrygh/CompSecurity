// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.peripherals;

import android.content.Context;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.peripherals:
//            PeripheralsController

public final class  extends b
    implements Provider
{

    private b context;
    private b eventBus;
    private b trackRepository;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/peripherals/PeripheralsController, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/peripherals/PeripheralsController, getClass().getClassLoader());
        trackRepository = l1.a("com.soundcloud.android.tracks.TrackRepository", com/soundcloud/android/peripherals/PeripheralsController, getClass().getClassLoader());
    }

    public final PeripheralsController get()
    {
        return new PeripheralsController((Context)context.get(), (EventBus)eventBus.get(), (TrackRepository)trackRepository.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(eventBus);
        set.add(trackRepository);
    }

    public ()
    {
        super("com.soundcloud.android.peripherals.PeripheralsController", "members/com.soundcloud.android.peripherals.PeripheralsController", false, com/soundcloud/android/peripherals/PeripheralsController);
    }
}
