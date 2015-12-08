// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.widgets.validation.ValidationGroup;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            EnterPlasticCardShippingAddressFragment

public final class gment extends Binding
    implements MembersInjector, Provider
{

    private Binding confirmOrderFragmentProvider;
    private com.google.android.apps.wallet.base.fragment.wallet_plastic_EnterPlasticCardShippingAddressFragment nextInjectableAncestor;
    private Binding userEventLogger;
    private Binding validationGroup;

    public final void attach(Linker linker)
    {
        nextInjectableAncestor.attach(linker);
        validationGroup = linker.requestBinding("com.google.android.apps.wallet.widgets.validation.ValidationGroup", com/google/android/apps/wallet/plastic/EnterPlasticCardShippingAddressFragment, getClass().getClassLoader());
        userEventLogger = linker.requestBinding("com.google.android.apps.wallet.userevents.UserEventLogger", com/google/android/apps/wallet/plastic/EnterPlasticCardShippingAddressFragment, getClass().getClassLoader());
        confirmOrderFragmentProvider = linker.requestBinding("javax.inject.Provider<com.google.android.apps.wallet.plastic.ConfirmPlasticCardOrderFragment>", com/google/android/apps/wallet/plastic/EnterPlasticCardShippingAddressFragment, getClass().getClassLoader());
    }

    public final EnterPlasticCardShippingAddressFragment get()
    {
        EnterPlasticCardShippingAddressFragment enterplasticcardshippingaddressfragment = new EnterPlasticCardShippingAddressFragment();
        injectMembers(enterplasticcardshippingaddressfragment);
        return enterplasticcardshippingaddressfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(validationGroup);
        set1.add(userEventLogger);
        set1.add(confirmOrderFragmentProvider);
        nextInjectableAncestor.getDependencies(null, set1);
    }

    public final void injectMembers(EnterPlasticCardShippingAddressFragment enterplasticcardshippingaddressfragment)
    {
        enterplasticcardshippingaddressfragment.validationGroup = (ValidationGroup)validationGroup.get();
        enterplasticcardshippingaddressfragment.userEventLogger = (UserEventLogger)userEventLogger.get();
        enterplasticcardshippingaddressfragment.confirmOrderFragmentProvider = (Provider)confirmOrderFragmentProvider.get();
        nextInjectableAncestor.injectMembers(enterplasticcardshippingaddressfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((EnterPlasticCardShippingAddressFragment)obj);
    }

    public _apps_wallet_plastic_EnterPlasticCardShippingAddressFragment()
    {
        super("com.google.android.apps.wallet.plastic.EnterPlasticCardShippingAddressFragment", "members/com.google.android.apps.wallet.plastic.EnterPlasticCardShippingAddressFragment", false, com/google/android/apps/wallet/plastic/EnterPlasticCardShippingAddressFragment);
        nextInjectableAncestor = new com.google.android.apps.wallet.base.fragment.wallet_plastic_EnterPlasticCardShippingAddressFragment();
    }
}
