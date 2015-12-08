// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.persistence.driverdocuments.IDriverDocumentsStorage;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding driverDocumentsStorage;
    private final ApplicationServicesModule module;

    public void attach(Linker linker)
    {
        driverDocumentsStorage = linker.requestBinding("me.lyft.android.persistence.driverdocuments.IDriverDocumentsStorage", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IDriverDocumentsProvider get()
    {
        return module.provideDriverDocumentsProvider((IDriverDocumentsStorage)driverDocumentsStorage.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(driverDocumentsStorage);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.driverdocuments.IDriverDocumentsProvider", true, "me.lyft.android.application.ApplicationServicesModule", "provideDriverDocumentsProvider");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
