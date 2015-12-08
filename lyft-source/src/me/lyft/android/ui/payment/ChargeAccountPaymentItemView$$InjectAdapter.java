// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.payment:
//            ChargeAccountPaymentItemView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding checkoutSession;
    private Binding supertype;

    public void attach(Linker linker)
    {
        checkoutSession = linker.requestBinding("me.lyft.android.application.checkout.ICheckoutSession", me/lyft/android/ui/payment/ChargeAccountPaymentItemView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/ChargeAccountPaymentItemView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.payment.PaymentListItemView", me/lyft/android/ui/payment/ChargeAccountPaymentItemView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(checkoutSession);
        set1.add(appFlow);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ChargeAccountPaymentItemView)obj);
    }

    public void injectMembers(ChargeAccountPaymentItemView chargeaccountpaymentitemview)
    {
        chargeaccountpaymentitemview.checkoutSession = (ICheckoutSession)checkoutSession.get();
        chargeaccountpaymentitemview.appFlow = (AppFlow)appFlow.get();
        supertype.injectMembers(chargeaccountpaymentitemview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.ChargeAccountPaymentItemView", false, me/lyft/android/ui/payment/ChargeAccountPaymentItemView);
    }
}
