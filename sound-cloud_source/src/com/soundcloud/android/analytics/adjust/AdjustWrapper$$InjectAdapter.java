// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.adjust;

import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics.adjust:
//            AdjustWrapper

public final class  extends b
    implements Provider
{

    private b applicationProperties;
    private b eventBus;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/analytics/adjust/AdjustWrapper, getClass().getClassLoader());
        applicationProperties = l1.a("com.soundcloud.android.properties.ApplicationProperties", com/soundcloud/android/analytics/adjust/AdjustWrapper, getClass().getClassLoader());
    }

    public final AdjustWrapper get()
    {
        return new AdjustWrapper((EventBus)eventBus.get(), (ApplicationProperties)applicationProperties.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(applicationProperties);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.adjust.AdjustWrapper", "members/com.soundcloud.android.analytics.adjust.AdjustWrapper", false, com/soundcloud/android/analytics/adjust/AdjustWrapper);
    }
}
