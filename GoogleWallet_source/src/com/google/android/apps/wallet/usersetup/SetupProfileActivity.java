// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.accounts.Account;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Window;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.OrientationController;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import com.google.android.apps.wallet.callstatus.CallStatus;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import com.google.android.apps.wallet.config.cloudconfig.CloudServiceSpec;
import com.google.android.apps.wallet.globalresources.GlobalResourceManager;
import com.google.android.apps.wallet.log.SLog;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.restrictioncheck.WalletRestrictionCheckFailActivity;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.usersetup.service.SetupWalletServiceClient;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.activity.WalletActivityActionExecutor;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import com.google.android.gms.wallet.ia.CreateProfileIntentBuilder;
import com.google.android.gms.wallet.shared.BrokerAndRelationships;
import com.google.android.gms.wallet.shared.LegalDocsForCountry;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            FinishSetupActivator

public class SetupProfileActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/usersetup/SetupProfileActivity.getSimpleName();
    Account account;
    String accountName;
    ActionExecutor actionExecutor;
    AnalyticsUtil analyticsUtil;
    WalletGoogleAuthUtil authUtil;
    private BrokerAndRelationships brokerAndRelationships[];
    CloudConfigurationManager cloudConfigurationManager;
    ConnectivityManager connectivityManager;
    private final List countrySpecifications = Lists.newArrayList();
    FinishSetupActivator finishSetupActivator;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    GlobalResourceManager globalResourceManager;
    private LegalDocsForCountry legalDocsForCountries[];
    CreateProfileIntentBuilder profileIntentBuilder;
    CloudServiceSpec serviceSpec;
    SetupWalletServiceClient setupWalletServiceClient;
    SharedPreferences sharedPreferences;
    SLog slog;
    UriRegistry uriRegistry;
    UserEventLogger userEventLogger;

    public SetupProfileActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void fail()
    {
        analyticsUtil.sendError("SetupFailed", new AnalyticsCustomDimension[0]);
        AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.presetup_dialog_presetup_fail_title).setMessage(com.google.android.apps.walletnfcrel.R.string.presetup_dialog_presetup_fail_details_general).setFinishActivityOnClick().setCancelable(false).build().show(getSupportFragmentManager(), "dialog_presetup_failed");
    }

    private void finishSetup()
    {
        actionExecutor.executeAction(new Callable() {

            final SetupProfileActivity this$0;

            private CallStatus call()
                throws Exception
            {
                return finishSetupActivator.finishSetup();
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = SetupProfileActivity.this;
                super();
            }
        }, new AsyncCallback() {

            final SetupProfileActivity this$0;

            private void onSuccess(CallStatus callstatus)
            {
                if (callstatus == CallStatus.SUCCESS)
                {
                    userEventLogger.log(31, 239);
                    startActivity(uriRegistry.createIntent(2, new Object[0]));
                    finish();
                    return;
                } else
                {
                    fail();
                    return;
                }
            }

            public final void onFailure(Exception exception)
            {
                fail();
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((CallStatus)obj);
            }

            
            {
                this$0 = SetupProfileActivity.this;
                super();
            }
        });
    }

    private void leaveToSelectAccount()
    {
        startActivity(InternalIntents.forClass(this, com/google/android/apps/wallet/restrictioncheck/WalletRestrictionCheckFailActivity).addFlags(0x10010000).putExtra("mode", 5));
        finish();
    }

    private static BrokerAndRelationships newBrokerAndRelationships(String s, String as[])
    {
        return BrokerAndRelationships.newBuilder().setBrokerId(s).setRelationships(as).build();
    }

    private void startProfileCreationActivity()
    {
        profileIntentBuilder.setBuyerAccount(account);
        profileIntentBuilder.setInstrumentRequired(false);
        profileIntentBuilder.setBrokerAndRelationships(brokerAndRelationships);
        profileIntentBuilder.setEnvironment(cloudConfigurationManager.getCloudConfig().getPaymentsSdkEnvironment().intValue());
        profileIntentBuilder.setTheme(1);
        CountrySpecification countryspecification;
        for (Iterator iterator = countrySpecifications.iterator(); iterator.hasNext(); profileIntentBuilder.addCountrySpecificationFilter(countryspecification))
        {
            countryspecification = (CountrySpecification)iterator.next();
        }

        if (legalDocsForCountries != null && legalDocsForCountries.length > 0)
        {
            profileIntentBuilder.setLegalDocsForCountries(new ArrayList(Arrays.asList(legalDocsForCountries)));
        }
        Intent intent = profileIntentBuilder.build();
        analyticsUtil.sendScreen("Set Up Cdp Profile And Tos", new AnalyticsCustomDimension[0]);
        startActivityForResult(intent, 1);
    }

    private void startSetupAuthRequest()
    {
        actionExecutor.executeAction(new Callable() {

            final SetupProfileActivity this$0;

            private Boolean call()
                throws Exception
            {
                com.google.wallet.proto.api.NanoWalletSetup.PreSetupWalletResponse presetupwalletresponse;
                com.google.wallet.proto.api.NanoWalletSetup.GetSetupConfigurationResponse getsetupconfigurationresponse;
                boolean flag;
                try
                {
                    authUtil.getToken(accountName, serviceSpec.getOauthScope());
                }
                catch (UserRecoverableAuthException userrecoverableauthexception)
                {
                    Intent intent = userrecoverableauthexception.getIntent();
                    startActivityForResult(intent, 2);
                    throw userrecoverableauthexception;
                }
                presetupwalletresponse = setupWalletServiceClient.preSetup(new com.google.wallet.proto.api.NanoWalletSetup.PreSetupWalletRequest());
                getsetupconfigurationresponse = setupWalletServiceClient.getSetupConfiguration(new com.google.wallet.proto.api.NanoWalletSetup.GetSetupConfigurationRequest());
                brokerAndRelationships = translateBrokerAndRelationships(getsetupconfigurationresponse);
                legalDocsForCountries = SetupProfileActivity.translateLegalDocsForCountries(SetupProfileActivity.this, getsetupconfigurationresponse);
                globalResourceManager.update(presetupwalletresponse.globalResources, presetupwalletresponse.globalResourcesFingerprint.longValue());
                if (presetupwalletresponse.hasCdpProfile != null && presetupwalletresponse.hasCdpProfile.booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = SetupProfileActivity.this;
                super();
            }
        }, new AsyncCallback() {

            final SetupProfileActivity this$0;

            private void onSuccess(Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    finishSetup();
                    return;
                } else
                {
                    startProfileCreationActivity();
                    return;
                }
            }

            public final void onFailure(Exception exception)
            {
                if (exception instanceof UserRecoverableAuthException)
                {
                    return;
                } else
                {
                    fail();
                    return;
                }
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((Boolean)obj);
            }

            
            {
                this$0 = SetupProfileActivity.this;
                super();
            }
        });
    }

    private BrokerAndRelationships[] translateBrokerAndRelationships(com.google.wallet.proto.api.NanoWalletSetup.GetSetupConfigurationResponse getsetupconfigurationresponse)
    {
        boolean flag = false;
        BrokerAndRelationships abrokerandrelationships[];
        com.google.wallet.proto.NanoWalletEntities.BrokerAndRelationships abrokerandrelationships1[];
        int i;
        int k;
        int l;
        if (getsetupconfigurationresponse.brokerAndRelationships == null)
        {
            i = 0;
        } else
        {
            i = getsetupconfigurationresponse.brokerAndRelationships.length;
        }
        abrokerandrelationships = new BrokerAndRelationships[i];
        k = 0;
        abrokerandrelationships1 = getsetupconfigurationresponse.brokerAndRelationships;
        l = abrokerandrelationships1.length;
        for (i = 0; i < l; i++)
        {
            com.google.wallet.proto.NanoWalletEntities.BrokerAndRelationships brokerandrelationships = abrokerandrelationships1[i];
            abrokerandrelationships[k] = newBrokerAndRelationships(brokerandrelationships.obfuscatedBrokerId, brokerandrelationships.relationship);
            k++;
        }

        getsetupconfigurationresponse = getsetupconfigurationresponse.supportedCountries;
        k = getsetupconfigurationresponse.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            String s = getsetupconfigurationresponse[j];
            countrySpecifications.add(new CountrySpecification(s));
        }

        return abrokerandrelationships;
    }

    private static LegalDocsForCountry[] translateLegalDocsForCountries(com.google.wallet.proto.api.NanoWalletSetup.GetSetupConfigurationResponse getsetupconfigurationresponse)
    {
        int j = 0;
        LegalDocsForCountry alegaldocsforcountry[];
        int i;
        boolean flag;
        int k;
        if (getsetupconfigurationresponse.legalDocsForCountries == null)
        {
            i = 0;
        } else
        {
            i = getsetupconfigurationresponse.legalDocsForCountries.length;
        }
        alegaldocsforcountry = new LegalDocsForCountry[i];
        flag = false;
        getsetupconfigurationresponse = getsetupconfigurationresponse.legalDocsForCountries;
        k = getsetupconfigurationresponse.length;
        i = j;
        j = ((flag) ? 1 : 0);
        for (; i < k; i++)
        {
            Object obj = getsetupconfigurationresponse[i];
            alegaldocsforcountry[j] = new LegalDocsForCountry(((com.google.wallet.proto.NanoWalletEntities.LegalDocsForCountry) (obj)).countryCode, ((com.google.wallet.proto.NanoWalletEntities.LegalDocsForCountry) (obj)).legalDocumentUrl, ((com.google.wallet.proto.NanoWalletEntities.LegalDocsForCountry) (obj)).legalDocumentId);
            j++;
        }

        return alegaldocsforcountry;
    }

    protected final void doOnCreate(Bundle bundle)
    {
        getSupportActionBar().hide();
        setContentView(com.google.android.apps.walletnfcrel.R.layout.generic_progress_activity);
        activityActionExecutor.initialize(getSupportFragmentManager(), bundle);
        getWindow().addFlags(128);
        fullScreenProgressSpinnerManager.showImmediately();
        OrientationController.disableOrientationChanges(this);
        bundle = connectivityManager.getActiveNetworkInfo();
        if (bundle != null && bundle.isConnectedOrConnecting())
        {
            startSetupAuthRequest();
            return;
        } else
        {
            AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.presetup_dialog_presetup_fail_title).setMessage(com.google.android.apps.walletnfcrel.R.string.setup_failed_no_internet).setFinishActivityOnClick().setCancelable(false).build().show(getSupportFragmentManager(), "dialog_presetup_failed");
            return;
        }
    }

    protected final boolean isWidthLimited()
    {
        return true;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1)
        {
            if (j == 0)
            {
                leaveToSelectAccount();
            } else
            if (j == -1)
            {
                finishSetup();
            } else
            if (j == 1)
            {
                WLog.e(TAG, "Received error from Bender, finishing activity");
                slog.log(TAG, "Received error from Bender, unable to complete setup");
                finish();
            } else
            {
                WLog.efmt(TAG, "Received unexpected resultCode from Bender: %d, finishing activity", new Object[] {
                    Integer.valueOf(j)
                });
                slog.log(TAG, String.format("Unexpected resultCode from Bender: %d, unable to complete setup", new Object[] {
                    Integer.valueOf(j)
                }));
                finish();
            }
        } else
        {
            finish();
        }
        if (i == 2 && j == -1)
        {
            startSetupAuthRequest();
        }
    }

    public void onBackPressed()
    {
        leaveToSelectAccount();
    }

    protected void onPause()
    {
        super.onPause();
        actionExecutor.cancelAll();
    }

    protected final void onUpPressed()
    {
        finish();
    }



/*
    static BrokerAndRelationships[] access$002(SetupProfileActivity setupprofileactivity, BrokerAndRelationships abrokerandrelationships[])
    {
        setupprofileactivity.brokerAndRelationships = abrokerandrelationships;
        return abrokerandrelationships;
    }

*/



/*
    static LegalDocsForCountry[] access$202(SetupProfileActivity setupprofileactivity, LegalDocsForCountry alegaldocsforcountry[])
    {
        setupprofileactivity.legalDocsForCountries = alegaldocsforcountry;
        return alegaldocsforcountry;
    }

*/




}
