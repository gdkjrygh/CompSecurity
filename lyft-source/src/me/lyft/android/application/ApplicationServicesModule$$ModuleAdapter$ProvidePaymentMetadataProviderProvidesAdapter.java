// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.infrastructure.paypal.IPayPalService;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final ApplicationServicesModule module;
    private Binding service;

    public void attach(Linker linker)
    {
        service = linker.requestBinding("me.lyft.android.infrastructure.paypal.IPayPalService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public me.lyft.android.domain.payment. get()
    {
        return module.providePaymentMetadataProvider((IPayPalService)service.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(service);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.domain.payment.IPaymentFactory$IPaymentMetadataProvider", false, "me.lyft.android.application.ApplicationServicesModule", "providePaymentMetadataProvider");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
