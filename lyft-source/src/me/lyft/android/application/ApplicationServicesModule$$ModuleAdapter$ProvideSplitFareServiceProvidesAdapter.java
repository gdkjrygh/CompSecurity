// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import android.content.res.Resources;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.data.ContactsDatabaseHelper;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.splitfare.ISplitFareService;
import me.lyft.android.providers.ContactsProvider;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding contactsDatabaseHelper;
    private Binding contactsProvider;
    private Binding lyftApi;
    private final ApplicationServicesModule module;
    private Binding resources;
    private Binding rideProvider;

    public void attach(Linker linker)
    {
        contactsDatabaseHelper = linker.requestBinding("me.lyft.android.data.ContactsDatabaseHelper", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        rideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        contactsProvider = linker.requestBinding("me.lyft.android.providers.ContactsProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        resources = linker.requestBinding("android.content.res.Resources", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ISplitFareService get()
    {
        return module.provideSplitFareService((ContactsDatabaseHelper)contactsDatabaseHelper.get(), (ILyftApi)lyftApi.get(), (IPassengerRideProvider)rideProvider.get(), (ContactsProvider)contactsProvider.get(), (Resources)resources.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(contactsDatabaseHelper);
        set.add(lyftApi);
        set.add(rideProvider);
        set.add(contactsProvider);
        set.add(resources);
    }

    public q(ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.infrastructure.splitfare.ISplitFareService", true, "me.lyft.android.application.ApplicationServicesModule", "provideSplitFareService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
