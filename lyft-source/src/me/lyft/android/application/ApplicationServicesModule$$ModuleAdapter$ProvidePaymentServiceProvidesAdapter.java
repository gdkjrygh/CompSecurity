// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.application.payment.PaymentService;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final ApplicationServicesModule module;
    private Binding paymentService;

    public void attach(Linker linker)
    {
        paymentService = linker.requestBinding("me.lyft.android.application.payment.PaymentService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IPaymentService get()
    {
        return module.providePaymentService((PaymentService)paymentService.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(paymentService);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.payment.IPaymentService", false, "me.lyft.android.application.ApplicationServicesModule", "providePaymentService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
