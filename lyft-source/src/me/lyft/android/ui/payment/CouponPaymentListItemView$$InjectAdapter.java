// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.payment:
//            CouponPaymentListItemView

public final class I extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding checkoutSession;
    private Binding dialogFlow;
    private Binding fareRepository;
    private Binding supertype;

    public void attach(Linker linker)
    {
        checkoutSession = linker.requestBinding("me.lyft.android.application.checkout.ICheckoutSession", me/lyft/android/ui/payment/CouponPaymentListItemView, getClass().getClassLoader());
        fareRepository = linker.requestBinding("me.lyft.android.application.ride.IRideFareRepository", me/lyft/android/ui/payment/CouponPaymentListItemView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/CouponPaymentListItemView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/payment/CouponPaymentListItemView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.payment.PaymentListItemView", me/lyft/android/ui/payment/CouponPaymentListItemView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(checkoutSession);
        set1.add(fareRepository);
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((CouponPaymentListItemView)obj);
    }

    public void injectMembers(CouponPaymentListItemView couponpaymentlistitemview)
    {
        couponpaymentlistitemview.checkoutSession = (ICheckoutSession)checkoutSession.get();
        couponpaymentlistitemview.fareRepository = (IRideFareRepository)fareRepository.get();
        couponpaymentlistitemview.appFlow = (AppFlow)appFlow.get();
        couponpaymentlistitemview.dialogFlow = (DialogFlow)dialogFlow.get();
        supertype.injectMembers(couponpaymentlistitemview);
    }

    public I()
    {
        super(null, "members/me.lyft.android.ui.payment.CouponPaymentListItemView", false, me/lyft/android/ui/payment/CouponPaymentListItemView);
    }
}
