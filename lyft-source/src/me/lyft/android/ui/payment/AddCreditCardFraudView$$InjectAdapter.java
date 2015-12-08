// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.cardscan.ICardScanService;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddCreditCardFraudView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding cardScanService;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/AddCreditCardFraudView, getClass().getClassLoader());
        cardScanService = linker.requestBinding("me.lyft.android.infrastructure.cardscan.ICardScanService", me/lyft/android/ui/payment/AddCreditCardFraudView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(cardScanService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((AddCreditCardFraudView)obj);
    }

    public void injectMembers(AddCreditCardFraudView addcreditcardfraudview)
    {
        addcreditcardfraudview.appFlow = (AppFlow)appFlow.get();
        addcreditcardfraudview.cardScanService = (ICardScanService)cardScanService.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.payment.AddCreditCardFraudView", false, me/lyft/android/ui/payment/AddCreditCardFraudView);
    }
}
