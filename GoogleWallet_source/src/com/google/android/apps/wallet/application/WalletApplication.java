// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.application;

import android.content.pm.PackageManager;
import com.google.android.apps.wallet.account.AccountNameChangeHandler;
import com.google.android.apps.wallet.account.InitialAccountSelector;
import com.google.android.apps.wallet.app.migration.WalletDatabaseChecker;
import com.google.android.apps.wallet.app.modules.InitializerActivityModule;
import com.google.android.apps.wallet.app.modules.WalletUserModule;
import com.google.android.apps.wallet.init.ui.InitializerActivity;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.userscope.UserScopedApplication;
import com.google.android.apps.wallet.util.prng.PRNGFixes;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.application:
//            AllInjectedActivitiesModule, WalletApplicationModule, WalletHceUserModule

public class WalletApplication extends UserScopedApplication
{

    private static final String TAG = com/google/android/apps/wallet/application/WalletApplication.getSimpleName();

    public WalletApplication()
    {
    }

    public final List getActivityModules()
    {
        return ImmutableList.of(com/google/android/apps/wallet/application/AllInjectedActivitiesModule);
    }

    protected final List getModules()
    {
        return ImmutableList.of(com/google/android/apps/wallet/application/WalletApplicationModule);
    }

    protected final List getUserModules()
    {
        if (getPackageManager().hasSystemFeature("android.hardware.nfc.hce"))
        {
            return Lists.newArrayList(new Object[] {
                com/google/android/apps/wallet/application/WalletHceUserModule
            });
        } else
        {
            return Lists.newArrayList(new Object[] {
                com/google/android/apps/wallet/app/modules/WalletUserModule
            });
        }
    }

    public void onCreate()
    {
        super.onCreate();
        String s;
        try
        {
            ProviderInstaller.installIfNeeded(this);
        }
        catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
        {
            WLog.e(TAG, "Unable to install gcore security provider", googleplayservicesrepairableexception);
        }
        catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
        {
            WLog.e(TAG, "Unable to install gcore security provider", googleplayservicesnotavailableexception);
        }
        PRNGFixes.apply();
        initGraph();
        InitializerActivity.setModuleClass(com/google/android/apps/wallet/app/modules/InitializerActivityModule);
        ((AccountNameChangeHandler)get(com/google/android/apps/wallet/account/AccountNameChangeHandler)).handleAccountNameChange();
        s = ((InitialAccountSelector)get(com/google/android/apps/wallet/account/InitialAccountSelector)).ensureUser();
        ((WalletDatabaseChecker)get(com/google/android/apps/wallet/app/migration/WalletDatabaseChecker)).checkDatabase(s);
    }

}
