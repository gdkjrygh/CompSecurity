// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.ride.IWearRideRequestService;

// Referenced classes of package me.lyft.android.services:
//            WatchListenerService

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding supertype;
    private Binding wearRideRequestService;

    public void attach(Linker linker)
    {
        wearRideRequestService = linker.requestBinding("me.lyft.android.application.ride.IWearRideRequestService", me/lyft/android/services/WatchListenerService, getClass().getClassLoader());
        supertype = linker.requestBinding("members/com.google.android.gms.wearable.WearableListenerService", me/lyft/android/services/WatchListenerService, getClass().getClassLoader(), false, true);
    }

    public volatile Object get()
    {
        return get();
    }

    public WatchListenerService get()
    {
        WatchListenerService watchlistenerservice = new WatchListenerService();
        injectMembers(watchlistenerservice);
        return watchlistenerservice;
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(wearRideRequestService);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((WatchListenerService)obj);
    }

    public void injectMembers(WatchListenerService watchlistenerservice)
    {
        watchlistenerservice.wearRideRequestService = (IWearRideRequestService)wearRideRequestService.get();
        supertype.injectMembers(watchlistenerservice);
    }

    public ()
    {
        super("me.lyft.android.services.WatchListenerService", "members/me.lyft.android.services.WatchListenerService", false, me/lyft/android/services/WatchListenerService);
    }
}
