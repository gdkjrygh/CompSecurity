// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.main:
//            ActivityLifeCyclePublisher

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b supertype;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/main/ActivityLifeCyclePublisher, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/main/ActivityLifeCyclePublisher, getClass().getClassLoader(), false);
    }

    public final ActivityLifeCyclePublisher get()
    {
        ActivityLifeCyclePublisher activitylifecyclepublisher = new ActivityLifeCyclePublisher((EventBus)eventBus.get());
        injectMembers(activitylifecyclepublisher);
        return activitylifecyclepublisher;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(ActivityLifeCyclePublisher activitylifecyclepublisher)
    {
        supertype.injectMembers(activitylifecyclepublisher);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ActivityLifeCyclePublisher)obj);
    }

    public ()
    {
        super("com.soundcloud.android.main.ActivityLifeCyclePublisher", "members/com.soundcloud.android.main.ActivityLifeCyclePublisher", false, com/soundcloud/android/main/ActivityLifeCyclePublisher);
    }
}
