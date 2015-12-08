// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            SplitPaymentAddChargeAccountView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding splitFareRequestRepository;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/splitfare/SplitPaymentAddChargeAccountView, getClass().getClassLoader());
        splitFareRequestRepository = linker.requestBinding("me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository", me/lyft/android/ui/splitfare/SplitPaymentAddChargeAccountView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(splitFareRequestRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((SplitPaymentAddChargeAccountView)obj);
    }

    public void injectMembers(SplitPaymentAddChargeAccountView splitpaymentaddchargeaccountview)
    {
        splitpaymentaddchargeaccountview.appFlow = (AppFlow)appFlow.get();
        splitpaymentaddchargeaccountview.splitFareRequestRepository = (ISplitFareRequestRepository)splitFareRequestRepository.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.splitfare.SplitPaymentAddChargeAccountView", false, me/lyft/android/ui/splitfare/SplitPaymentAddChargeAccountView);
    }
}
