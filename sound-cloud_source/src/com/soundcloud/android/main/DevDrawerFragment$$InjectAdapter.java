// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.main:
//            DevDrawerFragment

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b featureFlags;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/main/DevDrawerFragment, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/main/DevDrawerFragment, getClass().getClassLoader());
    }

    public final DevDrawerFragment get()
    {
        DevDrawerFragment devdrawerfragment = new DevDrawerFragment();
        injectMembers(devdrawerfragment);
        return devdrawerfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(eventBus);
        set1.add(featureFlags);
    }

    public final void injectMembers(DevDrawerFragment devdrawerfragment)
    {
        devdrawerfragment.eventBus = (EventBus)eventBus.get();
        devdrawerfragment.featureFlags = (FeatureFlags)featureFlags.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((DevDrawerFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.main.DevDrawerFragment", "members/com.soundcloud.android.main.DevDrawerFragment", false, com/soundcloud/android/main/DevDrawerFragment);
    }
}
