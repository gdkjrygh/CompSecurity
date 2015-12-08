// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.res.Resources;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentModule, IPaymentErrorHandler

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding dialogFlow;
    private final PaymentModule module;
    private Binding resources;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/payment/PaymentModule, getClass().getClassLoader());
        resources = linker.requestBinding("android.content.res.Resources", me/lyft/android/ui/payment/PaymentModule, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/payment/PaymentModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IPaymentErrorHandler get()
    {
        return module.providePaymentErrorHandler((IViewErrorHandler)viewErrorHandler.get(), (Resources)resources.get(), (DialogFlow)dialogFlow.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(viewErrorHandler);
        set.add(resources);
        set.add(dialogFlow);
    }

    public (PaymentModule paymentmodule)
    {
        super("me.lyft.android.ui.payment.IPaymentErrorHandler", false, "me.lyft.android.ui.payment.PaymentModule", "providePaymentErrorHandler");
        module = paymentmodule;
        setLibrary(false);
    }
}
