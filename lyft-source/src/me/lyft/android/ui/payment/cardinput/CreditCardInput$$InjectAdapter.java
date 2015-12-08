// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.infrastructure.cardscan.ICardScanService;

// Referenced classes of package me.lyft.android.ui.payment.cardinput:
//            CreditCardInput

public final class I extends Binding
    implements MembersInjector
{

    private Binding cardScanService;
    private Binding geoService;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        cardScanService = linker.requestBinding("me.lyft.android.infrastructure.cardscan.ICardScanService", me/lyft/android/ui/payment/cardinput/CreditCardInput, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/payment/cardinput/CreditCardInput, getClass().getClassLoader());
        geoService = linker.requestBinding("me.lyft.android.application.geo.IGeoService", me/lyft/android/ui/payment/cardinput/CreditCardInput, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(cardScanService);
        set1.add(userProvider);
        set1.add(geoService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((CreditCardInput)obj);
    }

    public void injectMembers(CreditCardInput creditcardinput)
    {
        creditcardinput.cardScanService = (ICardScanService)cardScanService.get();
        creditcardinput.userProvider = (IUserProvider)userProvider.get();
        creditcardinput.geoService = (IGeoService)geoService.get();
    }

    public I()
    {
        super(null, "members/me.lyft.android.ui.payment.cardinput.CreditCardInput", false, me/lyft/android/ui/payment/cardinput/CreditCardInput);
    }
}
