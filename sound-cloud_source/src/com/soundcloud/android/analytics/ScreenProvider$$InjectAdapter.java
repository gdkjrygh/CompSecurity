// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics:
//            ScreenProvider

public final class  extends b
    implements Provider
{

    private b eventBus;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/analytics/ScreenProvider, getClass().getClassLoader());
    }

    public final ScreenProvider get()
    {
        return new ScreenProvider((EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.ScreenProvider", "members/com.soundcloud.android.analytics.ScreenProvider", true, com/soundcloud/android/analytics/ScreenProvider);
    }
}
