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
//            FacebookPaymentItemView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding supertype;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/FacebookPaymentItemView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.payment.ChargeAccountPaymentItemView", me/lyft/android/ui/payment/FacebookPaymentItemView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((FacebookPaymentItemView)obj);
    }

    public void injectMembers(FacebookPaymentItemView facebookpaymentitemview)
    {
        facebookpaymentitemview.appFlow = (AppFlow)appFlow.get();
        supertype.injectMembers(facebookpaymentitemview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.FacebookPaymentItemView", false, me/lyft/android/ui/payment/FacebookPaymentItemView);
    }
}
