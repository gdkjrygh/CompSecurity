// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddCreditCardPaymentItemView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding supertype;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/AddCreditCardPaymentItemView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/payment/AddCreditCardPaymentItemView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.payment.PaymentListItemView", me/lyft/android/ui/payment/AddCreditCardPaymentItemView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(userProvider);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((AddCreditCardPaymentItemView)obj);
    }

    public void injectMembers(AddCreditCardPaymentItemView addcreditcardpaymentitemview)
    {
        addcreditcardpaymentitemview.appFlow = (AppFlow)appFlow.get();
        addcreditcardpaymentitemview.userProvider = (IUserProvider)userProvider.get();
        supertype.injectMembers(addcreditcardpaymentitemview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.AddCreditCardPaymentItemView", false, me/lyft/android/ui/payment/AddCreditCardPaymentItemView);
    }
}
