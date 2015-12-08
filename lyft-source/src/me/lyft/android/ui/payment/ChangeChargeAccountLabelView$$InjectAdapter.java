// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.payment:
//            ChangeChargeAccountLabelView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding dialogFlow;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/ChangeChargeAccountLabelView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/payment/ChangeChargeAccountLabelView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/payment/ChangeChargeAccountLabelView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(bus);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ChangeChargeAccountLabelView)obj);
    }

    public void injectMembers(ChangeChargeAccountLabelView changechargeaccountlabelview)
    {
        changechargeaccountlabelview.appFlow = (AppFlow)appFlow.get();
        changechargeaccountlabelview.dialogFlow = (DialogFlow)dialogFlow.get();
        changechargeaccountlabelview.bus = (MessageBus)bus.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.ChangeChargeAccountLabelView", false, me/lyft/android/ui/payment/ChangeChargeAccountLabelView);
    }
}
