// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.checkout.CheckoutSession;
import me.lyft.android.application.checkout.ICheckoutSession;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding checkoutSession;
    private final ApplicationServicesModule module;

    public void attach(Linker linker)
    {
        checkoutSession = linker.requestBinding("me.lyft.android.application.checkout.CheckoutSession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ICheckoutSession get()
    {
        return module.provideCheckoutSession((CheckoutSession)checkoutSession.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(checkoutSession);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.checkout.ICheckoutSession", true, "me.lyft.android.application.ApplicationServicesModule", "provideCheckoutSession");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
