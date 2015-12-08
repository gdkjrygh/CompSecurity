// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.payment:
//            CreditLinePaymentItemView

public final class I extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding supertype;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/CreditLinePaymentItemView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.payment.ChargeAccountPaymentItemView", me/lyft/android/ui/payment/CreditLinePaymentItemView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((CreditLinePaymentItemView)obj);
    }

    public void injectMembers(CreditLinePaymentItemView creditlinepaymentitemview)
    {
        creditlinepaymentitemview.appFlow = (AppFlow)appFlow.get();
        supertype.injectMembers(creditlinepaymentitemview);
    }

    public I()
    {
        super(null, "members/me.lyft.android.ui.payment.CreditLinePaymentItemView", false, me/lyft/android/ui/payment/CreditLinePaymentItemView);
    }
}
