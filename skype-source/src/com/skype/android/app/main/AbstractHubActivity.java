// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.common.e;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.SkypeApplication;
import com.skype.android.SkypeIntentHandler;
import com.skype.android.ads.AdParent;
import com.skype.android.ads.AdPlacer;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.Navigation;
import com.skype.android.app.chat.AddParticipantsAccessibilityFragment;
import com.skype.android.app.chat.AddParticipantsActivity;
import com.skype.android.app.contacts.PickerActivity;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.signin.AbstractSignInActivity;
import com.skype.android.app.signin.AccountStatusNotifier;
import com.skype.android.app.signin.SignoutHelper;
import com.skype.android.app.signin.UpdateMandatoryDialog;
import com.skype.android.app.signin.UpdateOptionalDialog;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.ConfigUpdater;
import com.skype.android.config.OnApplicationConfigUpdated;
import com.skype.android.config.UpdateConfig;
import com.skype.android.telemetry.TelemetryHelper;
import com.skype.android.update.UpdateManager;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.DeviceFeatures;
import com.skype.android.util.ImageCache;
import com.skype.android.util.PerformanceLog;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.StartupTimeReporter;
import com.skype.android.util.UpdateScheduler;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.cache.ContactMoodCache;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import com.skype.android.util.permission.PermissionRequest;

// Referenced classes of package com.skype.android.app.main:
//            HubSection

public abstract class AbstractHubActivity extends AbstractSignInActivity
    implements android.os.Handler.Callback, com.skype.android.app.recents.RecentListFragment.RecentFragmentListener
{

    private static final String EXTRA_SAVED_IS_INTENT_HANDLED = "EXTRA_SAVED_IS_INTENT_HANDLED";
    private static final String EXTRA_SAVED_IS_LOG_IN_NOTIFIED = "EXTRA_SAVED_IS_LOG_IN_NOTIFIED";
    private static final int RECENT_CHATS_ACCESSIBILITY_UPDATE_INTERVAL = 5000;
    protected static final int WHAT_UNREAD_CHATS_ACCESSIBILITY_UPDATE = 3;
    protected static final int WHAT_UNREAD_MESSAGE_UPDATE = 1;
    protected static final int WHAT_UPDATE_AVATAR = 2;
    AccessibilityUtil accessibility;
    AccountStatusNotifier accountStatusNotifier;
    AdPlacer adPlacer;
    Analytics analytics;
    ApplicationConfig appConfig;
    ContactUtil contactUtil;
    private int currentViewPosition;
    ImageCache imageCache;
    private boolean isIntentHandled;
    private boolean isLogInNotified;
    SkyLib lib;
    Navigation navigation;
    PermissionRequest permissionRequest;
    SignInDurationReporter signInDurationReporter;
    ContactMoodCache spanned;
    TelemetryHelper telemetryHelper;
    UpdateManager updateManager;
    private UpdateScheduler updateScheduler;
    UserPreferences userPrefs;

    public AbstractHubActivity()
    {
        currentViewPosition = -2;
        isIntentHandled = false;
        isLogInNotified = false;
    }

    private void checkForUpdates()
    {
        Object obj = appConfig.getUpdateConfig();
        if (((UpdateConfig) (obj)).isUpdateConfigurationRefreshed())
        {
            getApplication();
            String s = SkypeApplication.b();
            if (((UpdateConfig) (obj)).isUpgradeRequired(s))
            {
                obj = new UpdateMandatoryDialog();
                ((UpdateMandatoryDialog) (obj)).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                    final AbstractHubActivity this$0;

                    public final void onDismiss(DialogInterface dialoginterface)
                    {
                        signout(false);
                    }

            
            {
                this$0 = AbstractHubActivity.this;
                super();
            }
                });
                ((UpdateMandatoryDialog) (obj)).show(getSupportFragmentManager());
                return;
            }
            if (((UpdateConfig) (obj)).isUpgradeRecommended(s))
            {
                UpdateOptionalDialog updateoptionaldialog = new UpdateOptionalDialog();
                Bundle bundle = new Bundle();
                bundle.putString("android.intent.extra.TEXT", getString(0x7f080434));
                updateoptionaldialog.setArguments(bundle);
                updateoptionaldialog.show(getSupportFragmentManager());
                return;
            }
        }
    }

    private void checkPlayServices()
    {
        if (!userPrefs.getPlayMarketRecoverableErrorShowed() && DeviceFeatures.b(getBaseContext()))
        {
            int i = e.a(getBaseContext());
            if (i != 0 && e.b(i))
            {
                e.a(i, this).show();
            }
            userPrefs.setPlayMarketRecoverableErrorShowed(true);
        }
    }

    private boolean isAutoSignIn(Intent intent)
    {
        return intent.hasExtra("autoSignIn") && intent.getExtras().getBoolean("autoSignIn");
    }

    private boolean isColdSignIn(Intent intent)
    {
        return !"android.intent.action.MAIN".equals(intent.getAction()) && intent.hasExtra("coldSignIn") && intent.getExtras().getBoolean("coldSignIn");
    }

    private boolean isSoftSignIn()
    {
        Intent intent = getIntent();
        return isAutoSignIn(intent) || isColdSignIn(intent);
    }

    protected void completeLogIn()
    {
    }

    protected com.skype.android.app.mnv.MnvCases.REFERRER getReferrerType()
    {
        return com.skype.android.app.mnv.MnvCases.REFERRER.HUB;
    }

    protected void handleAccountStatus(Account account)
    {
        if (!isFinishing() && account != null)
        {
            com.skype.Account.STATUS status = account.getStatusProp();
            if (status == null || status == com.skype.Account.STATUS.LOGGED_OUT)
            {
                sendLogoutTelemetry(account);
                finish();
            } else
            {
                if (status == com.skype.Account.STATUS.LOGGED_IN_PARTIALLY)
                {
                    account.finishLogin();
                    return;
                }
                if (status == com.skype.Account.STATUS.LOGGED_IN)
                {
                    PerformanceLog.b.c();
                    updateMood();
                    updateAvailability();
                    updateScheduler.a(2);
                    String s = getIntent().getAction();
                    if (!isIntentHandled)
                    {
                        getIntentHandler();
                        if (SkypeIntentHandler.a(s))
                        {
                            getIntentHandler().a(getIntent());
                            getIntent().setAction(null);
                            isIntentHandled = true;
                        }
                    }
                    if (!isLogInNotified && getIntent().getBooleanExtra("autoSignIn", false))
                    {
                        accountStatusNotifier.sendLoggedIn(account.getSkypenameProp());
                        isLogInNotified = true;
                        return;
                    }
                }
            }
        }
    }

    protected void handlePageAnalytics(int i)
    {
        if (currentViewPosition != i)
        {
            if (currentViewPosition != -2)
            {
                analytics.b(HubSection.forIndex(currentViewPosition).getAnalyticsEvent());
            }
            if (i != -2)
            {
                analytics.a(HubSection.forIndex(i).getAnalyticsEvent());
            }
            currentViewPosition = i;
        }
    }

    public boolean onAcceptEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        static final class _cls3
        {

            static final int $SwitchMap$com$skype$PROPKEY[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.ACCOUNT_STATUS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVATAR_IMAGE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_MOOD_TEXT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_MOOD_TIMESTAMP.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVAILABILITY.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return true;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        boolean flag = false;
        super.onCreate(bundle);
        getComponent().inject(this);
        PermissionRequest permissionrequest = permissionRequest;
        PermissionHandlerAdapter permissionhandleradapter = new PermissionHandlerAdapter() {

            final AbstractHubActivity this$0;

            public final void onGranted()
            {
                (new ConfigUpdater(getApplication())).configureLogging();
            }

            
            {
                this$0 = AbstractHubActivity.this;
                super();
            }
        };
        permissionrequest.a(Permission.j, false, permissionhandleradapter);
        if (bundle != null)
        {
            isIntentHandled = bundle.getBoolean("EXTRA_SAVED_IS_INTENT_HANDLED", true);
            isLogInNotified = bundle.getBoolean("EXTRA_SAVED_IS_LOG_IN_NOTIFIED", false);
        }
        setVolumeControlStream(5);
        bundle = getSavedLoginIntent();
        if (bundle != null)
        {
            getIntentHandler();
            if (SkypeIntentHandler.a(bundle.getAction()))
            {
                getIntentHandler().a(bundle);
                finish();
                return;
            }
        }
        if (account == null || account.getStatusProp() == com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED)
        {
            if (account != null || !TextUtils.isEmpty(lib.getDefaultAccountName()))
            {
                flag = true;
            }
            if (flag)
            {
                signInLastAccount();
            }
        }
        updateScheduler = new UpdateScheduler(new Handler(this));
    }

    void onEvent(OnApplicationConfigUpdated onapplicationconfigupdated)
    {
        checkForUpdates();
    }

    public void onEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        if (account == null) goto _L2; else goto _L1
_L1:
        _cls3..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()];
        JVM INSTR tableswitch 1 5: default 52
    //                   1 72
    //                   2 53
    //                   3 58
    //                   4 58
    //                   5 63;
           goto _L2 _L3 _L4 _L5 _L5 _L6
_L2:
        return;
_L4:
        updateAvatar();
        return;
_L5:
        updateMood();
        return;
_L6:
        updateMood();
        updateAvailability();
        return;
_L3:
        handleAccountStatus((Account)onpropertychange.getSender());
        return;
    }

    public void onPause()
    {
        adPlacer.b(AdParent.a);
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        PerformanceLog.e.a("APP ACTION: hub displayed");
        StartupTimeReporter.a().a(com.skype.android.util.StartupTimeReporter.CheckPoint.e, telemetryHelper);
        signInDurationReporter.a(com.skype.android.util.SignInDurationReporter.CheckPoint.f);
        if (account != null && !isFinishing())
        {
            if (isSoftSignIn() && shouldCheckAccount())
            {
                navigation.toMnvCheckingAccount(getReferrerType());
                finish();
            }
            if (account.getStatusProp() == com.skype.Account.STATUS.LOGGED_IN)
            {
                updateAvatar();
                updateAvailability();
                updateMood();
            }
        }
        adPlacer.a(AdParent.a);
        checkForUpdates();
        checkPlayServices();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("EXTRA_SAVED_IS_INTENT_HANDLED", isIntentHandled);
        bundle.putBoolean("EXTRA_SAVED_IS_LOG_IN_NOTIFIED", isLogInNotified);
    }

    public void recentCountUpdated(int i)
    {
        updateScheduler.a(1, 0L, Integer.valueOf(i));
        if (accessibility.a())
        {
            updateScheduler.a(3, 5000L, Integer.valueOf(i));
        }
    }

    protected void showAddParticipantActivity()
    {
        if (accessibility.a())
        {
            Intent intent = new Intent(this, com/skype/android/app/contacts/PickerActivity);
            intent.putExtra("fragmentClass", com/skype/android/app/chat/AddParticipantsAccessibilityFragment);
            intent.putExtra("CHECKBOX_MODE", true);
            startActivity(intent);
            return;
        } else
        {
            startActivity(new Intent(this, com/skype/android/app/chat/AddParticipantsActivity));
            return;
        }
    }

    protected void showProgress()
    {
    }

    protected void signout(boolean flag)
    {
        analytics.c(AnalyticsEvent.aW);
        (new SignoutHelper(analytics, userPrefs)).performSignout(this, getSupportFragmentManager(), flag);
    }

    abstract void updateAvailability();

    abstract void updateAvatar();

    abstract void updateMood();
}
