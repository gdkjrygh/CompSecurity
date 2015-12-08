// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.ride.IRatingSession;
import me.lyft.android.persistence.rating.IRatingStateStorage;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final ApplicationServicesModule module;
    private Binding stateStorage;

    public void attach(Linker linker)
    {
        stateStorage = linker.requestBinding("me.lyft.android.persistence.rating.IRatingStateStorage", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IRatingSession get()
    {
        return module.providePassengerRateDriverSession((IRatingStateStorage)stateStorage.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(stateStorage);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.ride.IRatingSession", true, "me.lyft.android.application.ApplicationServicesModule", "providePassengerRateDriverSession");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
