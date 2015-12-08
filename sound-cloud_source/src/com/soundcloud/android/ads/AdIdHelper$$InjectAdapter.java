// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.ads:
//            AdIdHelper, AdIdWrapper

public final class  extends b
    implements Provider
{

    private b adIdWrapper;
    private b scheduler;

    public final void attach(l l1)
    {
        adIdWrapper = l1.a("com.soundcloud.android.ads.AdIdWrapper", com/soundcloud/android/ads/AdIdHelper, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/ads/AdIdHelper, getClass().getClassLoader());
    }

    public final AdIdHelper get()
    {
        return new AdIdHelper((AdIdWrapper)adIdWrapper.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(adIdWrapper);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.ads.AdIdHelper", "members/com.soundcloud.android.ads.AdIdHelper", true, com/soundcloud/android/ads/AdIdHelper);
    }
}
