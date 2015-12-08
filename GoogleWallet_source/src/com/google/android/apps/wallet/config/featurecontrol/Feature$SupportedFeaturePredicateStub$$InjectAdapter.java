// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.featurecontrol;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

public final class  extends Binding
    implements MembersInjector, Provider
{

    private Binding hceSupported;

    public final void attach(Linker linker)
    {
        hceSupported = linker.requestBinding("@com.google.android.apps.wallet.config.featurecontrol.FeatureQualifier(value=NFC_HCE_PPMS)/dagger.Lazy<java.lang.Boolean>", com/google/android/apps/wallet/config/featurecontrol/Feature$SupportedFeaturePredicateStub, getClass().getClassLoader());
    }

    public final hceSupported get()
    {
        hceSupported hcesupported = new hceSupported();
        injectMembers(hcesupported);
        return hcesupported;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(hceSupported);
    }

    public final void injectMembers(hceSupported hcesupported)
    {
        hcesupported.hceSupported = (Lazy)hceSupported.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((injectMembers)obj);
    }

    public ()
    {
        super("com.google.android.apps.wallet.config.featurecontrol.Feature$SupportedFeaturePredicateStub", "members/com.google.android.apps.wallet.config.featurecontrol.Feature$SupportedFeaturePredicateStub", false, com/google/android/apps/wallet/config/featurecontrol/Feature$SupportedFeaturePredicateStub);
    }
}
