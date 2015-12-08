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
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

public class FilterActivityModule
{

    public FilterActivityModule()
    {
    }

    static ListMultimap getActivityFilters(RestrictionCheckFilter restrictioncheckfilter, WarmWelcomeFilter warmwelcomefilter, SetupFilter setupfilter, InitializerFilter initializerfilter, EnforcePinFilter enforcepinfilter, RestrictedFeatureFilter restrictedfeaturefilter, ActivityFilter activityfilter, TosAcceptanceCheckFilter tosacceptancecheckfilter, 
            RpcRejectionFilter rpcrejectionfilter, NavDrawerFilter navdrawerfilter, EmptyNavDrawerFilter emptynavdrawerfilter, HelpContextFilter helpcontextfilter, AnalyticsFilter analyticsfilter, MemoryMonitorFilter memorymonitorfilter, GooglePlayServicesCheckFilter googleplayservicescheckfilter, 
            UserSwitcherFilter userswitcherfilter, DismissNotificationFilter dismissnotificationfilter, ConfidentialFilter confidentialfilter, FeatureManager featuremanager)
    {
        featuremanager = ArrayListMultimap.create();
        featuremanager.put("ALL_NO_PIN", rpcrejectionfilter);
        featuremanager.put("ALL_NO_PIN", restrictioncheckfilter);
        featuremanager.put("ALL_NO_PIN", userswitcherfilter);
        featuremanager.put("ALL_NO_PIN", warmwelcomefilter);
        featuremanager.put("ALL_NO_PIN", setupfilter);
        featuremanager.put("ALL_NO_PIN", initializerfilter);
        featuremanager.put("ALL_NO_PIN", restrictedfeaturefilter);
        featuremanager.put("ALL_NO_PIN", tosacceptancecheckfilter);
        featuremanager.put("ALL_NO_PIN", activityfilter);
        featuremanager.put("ALL_NO_PIN", helpcontextfilter);
        featuremanager.put("ALL_NO_PIN", analyticsfilter);
        featuremanager.put("ALL_NO_PIN", memorymonitorfilter);
        featuremanager.put("ALL_NO_PIN", googleplayservicescheckfilter);
        featuremanager.put("ALL_NO_PIN", confidentialfilter);
        featuremanager.put("ALL_NO_PIN", dismissnotificationfilter);
        featuremanager.put("ALL_NO_PIN", navdrawerfilter);
        featuremanager.putAll("ALL", featuremanager.get("ALL_NO_PIN"));
        featuremanager.put("ALL", enforcepinfilter);
        featuremanager.put("DEFAULT_NO_NAV", rpcrejectionfilter);
        featuremanager.put("DEFAULT_NO_NAV", userswitcherfilter);
        featuremanager.put("DEFAULT_NO_NAV", activityfilter);
        featuremanager.put("DEFAULT_NO_NAV", helpcontextfilter);
        featuremanager.put("DEFAULT_NO_NAV", analyticsfilter);
        featuremanager.put("DEFAULT_NO_NAV", memorymonitorfilter);
        featuremanager.put("DEFAULT_NO_NAV", googleplayservicescheckfilter);
        featuremanager.put("DEFAULT_NO_NAV", confidentialfilter);
        featuremanager.putAll("DEFAULT", featuremanager.get("DEFAULT_NO_NAV"));
        featuremanager.put("DEFAULT", navdrawerfilter);
        featuremanager.putAll("DEFAULT_EMPTY_NAV", featuremanager.get("DEFAULT_NO_NAV"));
        featuremanager.put("DEFAULT_EMPTY_NAV", emptynavdrawerfilter);
        return featuremanager;
    }

    final ActivityFilter getExtraOptionMenuFilter()
    {
        return new ActivityFilter() {

            final FilterActivityModule this$0;

            
            {
                this$0 = FilterActivityModule.this;
                super();
            }
        };
    }
}
