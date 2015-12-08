// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.ads:
//            AdPlayerController, AdsOperations

public final class  extends b
    implements a, Provider
{

    private b adsOperations;
    private b eventBus;
    private b supertype;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/ads/AdPlayerController, getClass().getClassLoader());
        adsOperations = l1.a("com.soundcloud.android.ads.AdsOperations", com/soundcloud/android/ads/AdPlayerController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/ads/AdPlayerController, getClass().getClassLoader(), false);
    }

    public final AdPlayerController get()
    {
        AdPlayerController adplayercontroller = new AdPlayerController((EventBus)eventBus.get(), (AdsOperations)adsOperations.get());
        injectMembers(adplayercontroller);
        return adplayercontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(adsOperations);
        set1.add(supertype);
    }

    public final void injectMembers(AdPlayerController adplayercontroller)
    {
        supertype.injectMembers(adplayercontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AdPlayerController)obj);
    }

    public ()
    {
        super("com.soundcloud.android.ads.AdPlayerController", "members/com.soundcloud.android.ads.AdPlayerController", true, com/soundcloud/android/ads/AdPlayerController);
    }
}
