// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.domain.payment.IPaymentFactory;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final ApplicationServicesModule module;
    private Binding provider;

    public void attach(Linker linker)
    {
        provider = linker.requestBinding("me.lyft.android.domain.payment.IPaymentFactory$IPaymentMetadataProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IPaymentFactory get()
    {
        return module.providePaymentFactory((me.lyft.android.domain.payment.ule)provider.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(provider);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.domain.payment.IPaymentFactory", false, "me.lyft.android.application.ApplicationServicesModule", "providePaymentFactory");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
