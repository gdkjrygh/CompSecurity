// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.analytics:
//            EventTracker, TrackingHandlerFactory

public final class  extends b
    implements Provider
{

    private b handlerFactory;

    public final void attach(l l1)
    {
        handlerFactory = l1.a("com.soundcloud.android.analytics.TrackingHandlerFactory", com/soundcloud/android/analytics/EventTracker, getClass().getClassLoader());
    }

    public final EventTracker get()
    {
        return new EventTracker((TrackingHandlerFactory)handlerFactory.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(handlerFactory);
    }

    public ()
    {
        super("com.soundcloud.android.analytics.EventTracker", "members/com.soundcloud.android.analytics.EventTracker", true, com/soundcloud/android/analytics/EventTracker);
    }
}
