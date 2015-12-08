// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.payment:
//            DebtView

public final class Provider extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding chargeAccountsProvider;
    private Binding lyftPreferences;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/payment/DebtView, getClass().getClassLoader());
        chargeAccountsProvider = linker.requestBinding("me.lyft.android.application.payment.IChargeAccountsProvider", me/lyft/android/ui/payment/DebtView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/payment/DebtView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/payment/DebtView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(userProvider);
        set1.add(chargeAccountsProvider);
        set1.add(lyftPreferences);
        set1.add(appFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DebtView)obj);
    }

    public void injectMembers(DebtView debtview)
    {
        debtview.userProvider = (IUserProvider)userProvider.get();
        debtview.chargeAccountsProvider = (IChargeAccountsProvider)chargeAccountsProvider.get();
        debtview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        debtview.appFlow = (AppFlow)appFlow.get();
    }

    public Provider()
    {
        super(null, "members/me.lyft.android.ui.payment.DebtView", false, me/lyft/android/ui/payment/DebtView);
    }
}
