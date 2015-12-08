// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IConstantsProvider

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding lyftPreferences;
    private final ApplicationServicesModule module;

    public void attach(Linker linker)
    {
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IConstantsProvider get()
    {
        return module.provideConstantsProvider((ILyftPreferences)lyftPreferences.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftPreferences);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.IConstantsProvider", true, "me.lyft.android.application.ApplicationServicesModule", "provideConstantsProvider");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
