// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.entrypoint;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.apps.wallet.analytics.AppStartTimeLogger;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.config.featurecontrol.RestrictedFeatureFilter;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.filter.ActivityFilterPipeline;
import com.google.android.apps.wallet.init.ui.InitializerActivity;
import com.google.android.apps.wallet.init.ui.InitializerFilter;
import com.google.android.apps.wallet.pin.EnforcePinFilter;
import com.google.android.apps.wallet.restrictioncheck.RestrictionCheckFilter;
import com.google.android.apps.wallet.userscope.UserScopedActivityInjectHelper;
import com.google.android.apps.wallet.usersetup.SetupFilter;
import com.google.android.apps.wallet.usersetup.WarmWelcomeFilter;
import com.google.android.gms.common.AccountPicker;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.common.base.Strings;
import com.google.common.base.Supplier;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;

public class WalletRootActivity extends Activity
{
    static class WalletRootActivityModule
    {

        static ListMultimap getActivityFilters(RestrictionCheckFilter restrictioncheckfilter, WarmWelcomeFilter warmwelcomefilter, SetupFilter setupfilter, InitializerFilter initializerfilter, EnforcePinFilter enforcepinfilter, RestrictedFeatureFilter restrictedfeaturefilter)
        {
            ArrayListMultimap arraylistmultimap = ArrayListMultimap.create();
            arraylistmultimap.put("ROOT", restrictioncheckfilter);
            arraylistmultimap.put("ROOT", warmwelcomefilter);
            arraylistmultimap.put("ROOT", setupfilter);
            arraylistmultimap.put("ROOT", initializerfilter);
            arraylistmultimap.put("ROOT", enforcepinfilter);
            arraylistmultimap.put("ROOT", restrictedfeaturefilter);
            return arraylistmultimap;
        }

        WalletRootActivityModule()
        {
        }
    }


    ActivityFilterPipeline activityFilterPipeline;
    AppStartTimeLogger appStartTimeLogger;
    private boolean hasGooglePlayServices;
    private final long startTime = SystemClock.elapsedRealtime();
    UriRegistry uriRegistry;
    SharedPreferences userPrefs;

    public WalletRootActivity()
    {
    }

    private boolean checkPlayServices()
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
        if (i == 0)
        {
            return true;
        }
        Dialog dialog1 = GooglePlayServicesUtil.getErrorDialog(i, this, 0);
        Dialog dialog = dialog1;
        if (dialog1 == null)
        {
            dialog = GooglePlayServicesUtil.getErrorDialog(1, this, 0);
        }
        if (!dialog.isShowing())
        {
            dialog.setCancelable(false);
            dialog.show();
        }
        return false;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 0)
        {
            finish();
        }
        if (i == 1 && j == -1)
        {
            intent = intent.getStringExtra("authAccount");
            if (!Strings.isNullOrEmpty(intent))
            {
                SharedPreferences sharedpreferences = getApplication().getSharedPreferences("global_prefs", 0);
                SharedPreference.ACCOUNT_NAME.putAndCommit(sharedpreferences, intent);
            }
            startActivity(InternalIntents.forClass(this, com/google/android/apps/wallet/entrypoint/WalletRootActivity));
            finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        hasGooglePlayServices = checkPlayServices();
        if (!hasGooglePlayServices)
        {
            return;
        }
        SharedPreferences sharedpreferences = getApplication().getSharedPreferences("global_prefs", 0);
        Object obj = (String)SharedPreference.ACCOUNT_NAME.get(sharedpreferences);
        if (Strings.isNullOrEmpty(((String) (obj))) || ((String) (obj)).equals("[ANONYMOUS_USER]"))
        {
            startActivityForResult(AccountPicker.newChooseAccountIntent(null, null, new String[] {
                "com.google"
            }, false, null, null, null, null), 1);
            return;
        }
        obj = new UserScopedActivityInjectHelper();
        ((UserScopedActivityInjectHelper) (obj)).initGraph(this, Lists.newArrayList(new Object[] {
            com/google/android/apps/wallet/entrypoint/WalletRootActivity$WalletRootActivityModule
        }));
        ((UserScopedActivityInjectHelper) (obj)).inject(this);
        appStartTimeLogger.notifyRootActivityConstructed(startTime);
        bundle = activityFilterPipeline.onCreate(this, bundle, new Supplier() {

            final WalletRootActivity this$0;

            private Intent get()
            {
                return new Intent(uriRegistry.createIntent(2, new Object[0]));
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = WalletRootActivity.this;
                super();
            }
        });
        if (!((Boolean)SharedPreference.SETUP_COMPLETE.get(userPrefs)).booleanValue())
        {
            startActivity(bundle);
        } else
        if (((Boolean)SharedPreference.CHANGED_USER.get(sharedpreferences)).booleanValue())
        {
            appStartTimeLogger.setAppStartType(4);
            startActivity(bundle);
        } else
        if (bundle != null)
        {
            if (com/google/android/apps/wallet/init/ui/InitializerActivity.getName().equals(bundle.getComponent().getClassName()))
            {
                appStartTimeLogger.setAppStartType(1);
            }
            startActivity(bundle);
        } else
        {
            startActivity(uriRegistry.createIntent(2, new Object[0]));
        }
        finish();
    }

    protected void onPause()
    {
        super.onPause();
        if (!hasGooglePlayServices)
        {
            finish();
        }
    }
}
