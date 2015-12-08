// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.entrypoint;

import com.google.android.apps.common.inject.ActivityModule;
import com.google.android.apps.wallet.config.featurecontrol.RestrictedFeatureFilter;
import com.google.android.apps.wallet.init.ui.InitializerFilter;
import com.google.android.apps.wallet.pin.EnforcePinFilter;
import com.google.android.apps.wallet.restrictioncheck.RestrictionCheckFilter;
import com.google.android.apps.wallet.usersetup.SetupFilter;
import com.google.android.apps.wallet.usersetup.WarmWelcomeFilter;
import com.google.common.collect.ListMultimap;
import dagger.internal.Binding;
import dagger.internal.BindingsGroup;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

public final class INCLUDES extends ModuleAdapter
{
    public static final class GetActivityFiltersProvidesAdapter extends ProvidesBinding
        implements Provider
    {

        private Binding enforcePinFilter;
        private Binding initializerFilter;
        private final WalletRootActivity.WalletRootActivityModule module;
        private Binding restrictedFeatureFilter;
        private Binding restrictionCheckFilter;
        private Binding setupFilter;
        private Binding warmWelcomeFilter;

        public final void attach(Linker linker)
        {
            restrictionCheckFilter = linker.requestBinding("com.google.android.apps.wallet.restrictioncheck.RestrictionCheckFilter", com/google/android/apps/wallet/entrypoint/WalletRootActivity$WalletRootActivityModule, getClass().getClassLoader());
            warmWelcomeFilter = linker.requestBinding("com.google.android.apps.wallet.usersetup.WarmWelcomeFilter", com/google/android/apps/wallet/entrypoint/WalletRootActivity$WalletRootActivityModule, getClass().getClassLoader());
            setupFilter = linker.requestBinding("com.google.android.apps.wallet.usersetup.SetupFilter", com/google/android/apps/wallet/entrypoint/WalletRootActivity$WalletRootActivityModule, getClass().getClassLoader());
            initializerFilter = linker.requestBinding("com.google.android.apps.wallet.init.ui.InitializerFilter", com/google/android/apps/wallet/entrypoint/WalletRootActivity$WalletRootActivityModule, getClass().getClassLoader());
            enforcePinFilter = linker.requestBinding("com.google.android.apps.wallet.pin.EnforcePinFilter", com/google/android/apps/wallet/entrypoint/WalletRootActivity$WalletRootActivityModule, getClass().getClassLoader());
            restrictedFeatureFilter = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.RestrictedFeatureFilter", com/google/android/apps/wallet/entrypoint/WalletRootActivity$WalletRootActivityModule, getClass().getClassLoader());
        }

        public final ListMultimap get()
        {
            WalletRootActivity.WalletRootActivityModule walletrootactivitymodule = module;
            return WalletRootActivity.WalletRootActivityModule.getActivityFilters((RestrictionCheckFilter)restrictionCheckFilter.get(), (WarmWelcomeFilter)warmWelcomeFilter.get(), (SetupFilter)setupFilter.get(), (InitializerFilter)initializerFilter.get(), (EnforcePinFilter)enforcePinFilter.get(), (RestrictedFeatureFilter)restrictedFeatureFilter.get());
        }

        public final volatile Object get()
        {
            return get();
        }

        public final void getDependencies(Set set, Set set1)
        {
            set.add(restrictionCheckFilter);
            set.add(warmWelcomeFilter);
            set.add(setupFilter);
            set.add(initializerFilter);
            set.add(enforcePinFilter);
            set.add(restrictedFeatureFilter);
        }

        public GetActivityFiltersProvidesAdapter(WalletRootActivity.WalletRootActivityModule walletrootactivitymodule)
        {
            super("com.google.common.collect.ListMultimap<java