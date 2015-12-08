// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.modules;

import com.google.android.apps.common.inject.ApplicationModule;
import com.google.android.apps.common.inject.SystemServiceModule;
import com.google.android.apps.wallet.analytics.AnalyticsModule;
import com.google.android.apps.wallet.base.memorymonitor.MemoryMonitorModule;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigModule;
import com.google.android.apps.wallet.config.featurecontrol.ApplicationScopedFeatureModule;
import com.google.android.apps.wallet.config.sharedpreferences.ApplicationScopedSharedPreferenceModule;
import com.google.android.apps.wallet.gms.GmsCoreApplicationModule;
import com.google.android.apps.wallet.gms.gcm.GcmModule;
import com.google.android.apps.wallet.http.HttpModule;
import com.google.android.apps.wallet.inject.CoreAndroidBindingsModule;
import com.google.android.apps.wallet.locale.LocaleModule;
import com.google.android.apps.wallet.util.async.UtilAsyncModule;
import com.google.android.apps.wallet.util.useragent.UserAgentModule;
import com.google.android.apps.wallet.util.version.VersionUtilModule;
import dagger.internal.ModuleAdapter;

// Referenced classes of package com.google.android.apps.wallet.app.modules:
//            ApplicationScopeSingletonsModule, WalletApplicationLibModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = {
        com/google/android/apps/common/inject/ApplicationModule, com/google/android/apps/common/inject/SystemServiceModule, com/google/android/apps/wallet/analytics/AnalyticsModule, com/google/android/apps/wallet/config/featurecontrol/ApplicationScopedFeatureModule, com/google/android/apps/wallet/app/modules/ApplicationScopeSingletonsModule, com/google/android/apps/wallet/config/sharedpreferences/ApplicationScopedSharedPreferenceModule, com/google/android/apps/wallet/util/version/VersionUtilModule, com/google/android/apps/wallet/config/cloudconfig/CloudConfigModule, com/google/android/apps/wallet/inject/CoreAndroidBindingsModule, com/google/android/apps/wallet/gms/gcm/GcmModule, 
        com/google/android/apps/wallet/gms/GmsCoreApplicationModule, com/google/android/apps/wallet/http/HttpModule, com/google/android/apps/wallet/locale/LocaleModule, com/google/android/apps/wallet/base/memorymonitor/MemoryMonitorModule, com/google/android/apps/wallet/util/useragent/UserAgentModule, com/google/android/apps/wallet/util/async/UtilAsyncModule
    };
    private static final String INJECTS[] = {
        "members/com.google.android.apps.wallet.account.AccountNameChangeHandler", "members/com.google.android.apps.wallet.account.InitialAccountSelector", "members/com.google.android.apps.wallet.init.MarkChangedUserTasksCompletedTask", "members/com.google.android.apps.wallet.usersetup.SimplifiedSetupProfileActivity", "members/com.google.android.apps.wallet.widgets.validation.ValidatedAutoCompleteEditText", "members/com.google.android.apps.wallet.widgets.validation.ValidatedEditText", "members/com.google.android.apps.wallet.widgets.validation.ValidatedDatePicker", "members/com.google.android.apps.wallet.app.migration.WalletDatabaseChecker"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final WalletApplicationLibModule newModule()
    {
        return new WalletApplicationLibModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public enceModule()
    {
        super(com/google/android/apps/wallet/app/modules/WalletApplicationLibModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, true);
    }
}
