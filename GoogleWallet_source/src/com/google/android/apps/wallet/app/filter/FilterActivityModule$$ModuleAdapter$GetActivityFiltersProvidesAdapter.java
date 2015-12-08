// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.filter;

import com.google.android.apps.wallet.account.UserSwitcherFilter;
import com.google.android.apps.wallet.analytics.AnalyticsFilter;
import com.google.android.apps.wallet.base.memorymonitor.MemoryMonitorFilter;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.featurecontrol.RestrictedFeatureFilter;
import com.google.android.apps.wallet.dogfood.ConfidentialFilter;
import com.google.android.apps.wallet.filter.ActivityFilter;
import com.google.android.apps.wallet.gms.GooglePlayServicesCheckFilter;
import com.google.android.apps.wallet.help.HelpContextFilter;
import com.google.android.apps.wallet.init.ui.InitializerFilter;
import com.google.android.apps.wallet.navdrawer.EmptyNavDrawerFilter;
import com.google.android.apps.wallet.navdrawer.NavDrawerFilter;
import com.google.android.apps.wallet.notifications.DismissNotificationFilter;
import com.google.android.apps.wallet.pin.EnforcePinFilter;
import com.google.android.apps.wallet.restrictioncheck.RestrictionCheckFilter;
import com.google.android.apps.wallet.rpcrejection.RpcRejectionFilter;
import com.google.android.apps.wallet.usersetup.SetupFilter;
import com.google.android.apps.wallet.usersetup.TosAcceptanceCheckFilter;
import com.google.android.apps.wallet.usersetup.WarmWelcomeFilter;
import com.google.common.collect.ListMultimap;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.app.filter:
//            FilterActivityModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding analyticsFilter;
    private Binding confidentialFilter;
    private Binding dismissNotificationFilter;
    private Binding emptyNavDrawerFilter;
    private Binding enforcePinFilter;
    private Binding extraOptionMenuFilter;
    private Binding featureManager;
    private Binding googlePlayServicesCheckFilter;
    private Binding helpContextFilter;
    private Binding initializerFilter;
    private Binding memoryMonitorFilter;
    private final FilterActivityModule module;
    private Binding navDrawerFilter;
    private Binding restrictedFeatureFilter;
    private Binding restrictionCheckFilter;
    private Binding rpcRejectionFilter;
    private Binding setupFilter;
    private Binding tosAcceptanceCheckFilter;
    private Binding userSwitcherFilter;
    private Binding warmWelcomeFilter;

    public final void attach(Linker linker)
    {
        restrictionCheckFilter = linker.requestBinding("com.google.android.apps.wallet.restrictioncheck.RestrictionCheckFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        warmWelcomeFilter = linker.requestBinding("com.google.android.apps.wallet.usersetup.WarmWelcomeFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        setupFilter = linker.requestBinding("com.google.android.apps.wallet.usersetup.SetupFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        initializerFilter = linker.requestBinding("com.google.android.apps.wallet.init.ui.InitializerFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        enforcePinFilter = linker.requestBinding("com.google.android.apps.wallet.pin.EnforcePinFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        restrictedFeatureFilter = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.RestrictedFeatureFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        extraOptionMenuFilter = linker.requestBinding("@com.google.android.apps.wallet.filter.BindingAnnotations$ExtraOptionMenuFilter()/com.google.android.apps.wallet.filter.ActivityFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        tosAcceptanceCheckFilter = linker.requestBinding("com.google.android.apps.wallet.usersetup.TosAcceptanceCheckFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        rpcRejectionFilter = linker.requestBinding("com.google.android.apps.wallet.rpcrejection.RpcRejectionFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        navDrawerFilter = linker.requestBinding("com.google.android.apps.wallet.navdrawer.NavDrawerFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        emptyNavDrawerFilter = linker.requestBinding("com.google.android.apps.wallet.navdrawer.EmptyNavDrawerFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        helpContextFilter = linker.requestBinding("com.google.android.apps.wallet.help.HelpContextFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        analyticsFilter = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        memoryMonitorFilter = linker.requestBinding("com.google.android.apps.wallet.base.memorymonitor.MemoryMonitorFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        googlePlayServicesCheckFilter = linker.requestBinding("com.google.android.apps.wallet.gms.GooglePlayServicesCheckFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        userSwitcherFilter = linker.requestBinding("com.google.android.apps.wallet.account.UserSwitcherFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        dismissNotificationFilter = linker.requestBinding("com.google.android.apps.wallet.notifications.DismissNotificationFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        confidentialFilter = linker.requestBinding("com.google.android.apps.wallet.dogfood.ConfidentialFilter", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/app/filter/FilterActivityModule, getClass().getClassLoader());
    }

    public final ListMultimap get()
    {
        FilterActivityModule filteractivitymodule = module;
        return FilterActivityModule.getActivityFilters((RestrictionCheckFilter)restrictionCheckFilter.get(), (WarmWelcomeFilter)warmWelcomeFilter.get(), (SetupFilter)setupFilter.get(), (InitializerFilter)initializerFilter.get(), (EnforcePinFilter)enforcePinFilter.get(), (RestrictedFeatureFilter)restrictedFeatureFilter.get(), (ActivityFilter)extraOptionMenuFilter.get(), (TosAcceptanceCheckFilter)tosAcceptanceCheckFilter.get(), (RpcRejectionFilter)rpcRejectionFilter.get(), (NavDrawerFilter)navDrawerFilter.get(), (EmptyNavDrawerFilter)emptyNavDrawerFilter.get(), (HelpContextFilter)helpContextFilter.get(), (AnalyticsFilter)analyticsFilter.get(), (MemoryMonitorFilter)memoryMonitorFilter.get(), (GooglePlayServicesCheckFilter)googlePlayServicesCheckFilter.get(), (UserSwitcherFilter)userSwitcherFilter.get(), (DismissNotificationFilter)dismissNotificationFilter.get(), (ConfidentialFilter)confidentialFilter.get(), (FeatureManager)featureManager.get());
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
        set.add(extraOptionMenuFilter);
        set.add(tosAcceptanceCheckFilter);
        set.add(rpcRejectionFilter);
        set.add(navDrawerFilter);
        set.add(emptyNavDrawerFilter);
        set.add(helpContextFilter);
        set.add(analyticsFilter);
        set.add(memoryMonitorFilter);
        set.add(googlePlayServicesCheckFilter);
        set.add(userSwitcherFilter);
        set.add(dismissNotificationFilter);
        set.add(confidentialFilter);
        set.add(featureManager);
    }

    public (FilterActivityModule filteractivitymodule)
    {
        super("com.google.common.collect.ListMultimap<java.lang.String, com.google.android.apps.wallet.filter.ActivityFilter>", false, "com.google.android.apps.wallet.app.filter.FilterActivityModule", "getActivityFilters");
        module = filteractivitymodule;
        setLibrary(true);
    }
}
