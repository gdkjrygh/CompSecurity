// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.l;
import android.text.TextUtils;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeIntentHandler;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.analytics.EcsControllableEvent;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.app.InfoDialogFragment;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.ProgressSpinnerDialogFragment;
import com.skype.android.app.main.HubSection;
import com.skype.android.app.mnv.MnvManager;
import com.skype.android.app.shortcircuit.AutoBuddyManager;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.res.Sounds;
import com.skype.android.skylib.SkyLibInitializer;
import com.skype.android.util.AccountUtil;
import com.skype.android.util.PerformanceLog;
import com.skype.android.util.StartupTimeReporter;
import com.skype.android.util.ViewStateManager;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.signin:
//            AccountStatusNotifier, SignInTelemetryEvent, AlreadyMergedDialog, NoConnectionDialog, 
//            AccountBlockedDialogFragment, UpdateMandatoryDialog, PotentiallyMSACredentialsDialog

public abstract class AbstractSignInActivity extends SkypeActivity
{

    protected Account account;
    AccountProvider accountProvider;
    AccountStatusNotifier accountStatusNotifier;
    Analytics analytics;
    AnalyticsPersistentStorage analyticsPersistentStorage;
    AutoBuddyManager autoBuddyManager;
    EcsConfiguration configuration;
    SkypeIntentHandler intentHandler;
    LayoutExperience layoutExperience;
    SkyLib lib;
    protected String loginAccessToken;
    MnvManager mnvManager;
    Navigation navigation;
    NavigationUrl navigationUrl;
    protected String refreshToken;
    protected String skypeAccessToken;
    Sounds sounds;
    ViewStateManager stateManager;

    public AbstractSignInActivity()
    {
        loginAccessToken = null;
        skypeAccessToken = null;
        refreshToken = null;
    }

    private Intent getPostLoginIntent()
    {
        Intent intent1 = getSavedLoginIntent();
        Intent intent = intent1;
        if (intent1 == null)
        {
            intent = getIntent();
        }
        return intent;
    }

    private int mapLogoutReasonToErrorMessage(com.skype.Account.LOGOUTREASON logoutreason)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$Account$LOGOUTREASON[];
            static final int $SwitchMap$com$skype$Account$STATUS[];
            static final int $SwitchMap$com$skype$SkyLib$AUTH_RESULT[];

            static 
            {
                $SwitchMap$com$skype$SkyLib$AUTH_RESULT = new int[com.skype.SkyLib.AUTH_RESULT.values().length];
                try
                {
                    $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.SkyLib.AUTH_RESULT.AUTH_INTERNAL_ERROR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.SkyLib.AUTH_RESULT.AUTH_PARTNER_INTERNAL_ERROR.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.SkyLib.AUTH_RESULT.AUTH_PARTNER_TIMEOUT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.SkyLib.AUTH_RESULT.AUTH_ANOTHER_MAPPING_EXISTS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                $SwitchMap$com$skype$Account$STATUS = new int[com.skype.Account.STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_IN_PARTIALLY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_IN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_OUT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                $SwitchMap$com$skype$Account$LOGOUTREASON = new int[com.skype.Account.LOGOUTREASON.values().length];
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.LOGOUT_CALLED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.P2P_CONNECT_FAILED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.SERVER_CONNECT_FAILED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.SERVER_OVERLOADED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.HTTPS_PROXY_AUTH_FAILED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.SOCKS_PROXY_AUTH_FAILED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.NO_SUCH_IDENTITY.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.INCORRECT_PASSWORD.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.PASSWORD_HAS_CHANGED.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.UNACCEPTABLE_PASSWORD.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.TOO_MANY_LOGIN_ATTEMPTS.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.ATO_BLOCKED.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.INVALID_SKYPENAME.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.Account.LOGOUTREASON[logoutreason.ordinal()])
        {
        default:
            return 0x7f08038b;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return 0x7f0803fd;

        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
            return 0x7f0803e4;

        case 11: // '\013'
            return 0x7f0803e6;

        case 12: // '\f'
            return 0x7f0803e5;
        }
    }

    protected void accountStatusLoggedIn()
    {
        autoBuddyManager.queryAutoBuddy();
        completeLogIn();
    }

    protected void completeLogIn()
    {
        if (!isFinishing() && !handleLoggedIn())
        {
            sounds.b();
            if (getIntent().hasExtra("com.skype.nextIntent"))
            {
                sendBroadcast((Intent)getIntent().getParcelableExtra("com.skype.nextIntent"));
            } else
            {
                Intent intent = getPostLoginIntent();
                if (SkypeIntentHandler.a(intent.getAction()))
                {
                    intentHandler.a(intent);
                } else
                {
                    SignInTelemetryEvent signintelemetryevent = createSignInTelemetryEvent(LogEvent.n, account);
                    analytics.a(signintelemetryevent);
                    if (shouldCheckAccount())
                    {
                        navigation.toMnvCheckingAccount(com.skype.android.app.mnv.MnvCases.REFERRER.SIGN_IN);
                    } else
                    {
                        navigation.home(HubSection.RECENTS.getIndex());
                    }
                }
            }
            accountStatusNotifier.sendLoggedIn(account.getSkypenameProp());
            dismissDialogAndFinish();
        }
    }

    protected SignInTelemetryEvent createSignInTelemetryEvent(EcsControllableEvent ecscontrollableevent, Account account1)
    {
        SignInConstants.AccountType accounttype;
        boolean flag;
        if (AccountUtil.b(account1))
        {
            accounttype = SignInConstants.AccountType.SKYPE;
        } else
        {
            accounttype = SignInConstants.AccountType.MSA;
        }
        if (AccountUtil.a(account1) && configuration.isMsaSdkUsedForLogin())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return createSignInTelemetryEvent(ecscontrollableevent, accounttype, flag);
    }

    protected SignInTelemetryEvent createSignInTelemetryEvent(EcsControllableEvent ecscontrollableevent, SignInConstants.AccountType accounttype, boolean flag)
    {
        SignInConstants.FlowType flowtype;
        if (configuration.isAccountDisambiguationSupported())
        {
            flowtype = SignInConstants.FlowType.UNIFIED;
        } else
        {
            flowtype = SignInConstants.FlowType.SIMPLIFIED;
        }
        return new SignInTelemetryEvent(ecscontrollableevent, flowtype, flag, accounttype, analyticsPersistentStorage.b());
    }

    protected void dismissDialogAndFinish()
    {
        l l1 = getSupportFragmentManager();
        android.support.v4.app.Fragment fragment = getSupportFragmentManager().a("skypeDialog");
        if (fragment instanceof ProgressSpinnerDialogFragment)
        {
            ((ProgressSpinnerDialogFragment)fragment).stopAnimation();
        }
        SkypeDialogFragment.dismiss(l1);
        finish();
    }

    protected SkypeIntentHandler getIntentHandler()
    {
        return intentHandler;
    }

    protected com.skype.android.app.mnv.MnvCases.REFERRER getReferrerType()
    {
        return com.skype.android.app.mnv.MnvCases.REFERRER.SIGN_IN;
    }

    protected Intent getSavedLoginIntent()
    {
        return stateManager.a();
    }

    protected void handleAccountStatus(Account account1)
    {
        if (account1 == null) goto _L2; else goto _L1
_L1:
        com.skype.Account.STATUS status;
        com.skype.Account.STATUS status1 = account1.getStatusProp();
        status = status1;
        if (status1 == null)
        {
            status = com.skype.Account.STATUS.LOGGED_OUT;
        }
        log.info((new StringBuilder("handleAccountStatus: ")).append(status).toString());
        _cls1..SwitchMap.com.skype.Account.STATUS[status.ordinal()];
        JVM INSTR tableswitch 1 4: default 84
    //                   1 85
    //                   2 91
    //                   3 101
    //                   4 101;
           goto _L2 _L3 _L4 _L5 _L5
_L2:
        return;
_L3:
        account1.finishLogin();
_L4:
        account = account1;
        accountStatusLoggedIn();
        return;
_L5:
        com.skype.Account.LOGOUTREASON logoutreason = account1.getLogoutReasonProp();
        sendLogoutTelemetry(account1);
        if (logoutreason != null)
        {
            switch (_cls1..SwitchMap.com.skype.Account.LOGOUTREASON[logoutreason.ordinal()])
            {
            default:
                SkypeDialogFragment.dismiss(getSupportFragmentManager());
                showError(logoutreason);
                return;

            case 1: // '\001'
                break;
            }
        }
        SkypeDialogFragment.dismiss(getSupportFragmentManager());
        return;
    }

    protected boolean handleLoggedIn()
    {
        return false;
    }

    protected boolean isSignedOut()
    {
        com.skype.Account.STATUS status;
        if (account == null)
        {
            status = null;
        } else
        {
            status = account.getStatusProp();
        }
        return status == null || status == com.skype.Account.STATUS.LOGGED_OUT || status == com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED;
    }

    protected void obtainAccount(String s)
    {
        PerformanceLog.b.a("obtaining account");
        account = accountProvider.get(s);
    }

    public boolean onAcceptEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.ACCOUNT_STATUS;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        SkyLibInitializer.a().b();
    }

    public void onEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        handleAccountStatus((Account)onpropertychange.getSender());
    }

    protected void onPostResume()
    {
        super.onPostResume();
        handleAccountStatus(account);
    }

    protected void sendLogoutTelemetry(Account account1)
    {
        com.skype.Account.LOGOUTREASON logoutreason = account1.getLogoutReasonProp();
        String s = getClass().getSimpleName();
        account1 = createSignInTelemetryEvent(LogEvent.o, account1);
        account1.put(LogAttributeName.z, logoutreason.toString());
        account1.put(LogAttributeName.s, s);
        analytics.a(account1);
    }

    protected boolean shouldCheckAccount()
    {
        return mnvManager.shouldRetry(getReferrerType(), layoutExperience.isMultipane());
    }

    protected void showAlreadyMergedDialog()
    {
        (new AlreadyMergedDialog()).show(getSupportFragmentManager());
    }

    protected void showConnectionErrorDialog()
    {
        SkypeDialogFragment.dismiss(getSupportFragmentManager());
        if (!(getSupportFragmentManager().a(com/skype/android/app/signin/NoConnectionDialog.getName()) instanceof NoConnectionDialog))
        {
            NoConnectionDialog.create(getString(0x7f080388), getString(0x7f0803fd), getString(0x7f08015c), getString(0x7f0802f6)).show(getSupportFragmentManager(), com/skype/android/app/signin/NoConnectionDialog.getName());
        }
        getSupportFragmentManager().b();
    }

    protected void showError(com.skype.Account.LOGOUTREASON logoutreason)
    {
        switch (_cls1..SwitchMap.com.skype.Account.LOGOUTREASON[logoutreason.ordinal()])
        {
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        default:
            showErrorDialog(logoutreason);
            return;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            showConnectionErrorDialog();
            return;

        case 7: // '\007'
        case 8: // '\b'
        case 13: // '\r'
            showErrorView(logoutreason);
            break;
        }
    }

    protected void showError(com.skype.SkyLib.AUTH_RESULT auth_result)
    {
        switch (_cls1..SwitchMap.com.skype.SkyLib.AUTH_RESULT[auth_result.ordinal()])
        {
        default:
            showErrorDialog(0x7f08038b);
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            showConnectionErrorDialog();
            return;

        case 4: // '\004'
            showAlreadyMergedDialog();
            break;
        }
    }

    protected void showErrorDialog(int i)
    {
        InfoDialogFragment.create(getString(0x7f08038b), getString(i), getString(0x7f0802f6)).show(getSupportFragmentManager());
    }

    protected void showErrorDialog(com.skype.Account.LOGOUTREASON logoutreason)
    {
        int i = mapLogoutReasonToErrorMessage(logoutreason);
        if (logoutreason == com.skype.Account.LOGOUTREASON.ATO_BLOCKED)
        {
            logoutreason = new StringBuilder(getString(i));
            logoutreason.append("\n\n");
            logoutreason.append(getString(0x7f08049d));
            logoutreason = InfoDialogFragment.create(getString(0x7f08038b), logoutreason.toString(), getString(0x7f08025c), com/skype/android/app/signin/AccountBlockedDialogFragment);
        } else
        if (logoutreason == com.skype.Account.LOGOUTREASON.UNSUPPORTED_VERSION || logoutreason == com.skype.Account.LOGOUTREASON.INVALID_APP_ID)
        {
            logoutreason = new UpdateMandatoryDialog();
        } else
        {
            logoutreason = InfoDialogFragment.create(getString(0x7f08038b), getString(i), getString(0x7f0802f6));
        }
        logoutreason.show(getSupportFragmentManager());
    }

    protected void showErrorView(com.skype.Account.LOGOUTREASON logoutreason)
    {
        showErrorDialog(logoutreason);
    }

    protected void showPotentiallyMSACredentialsDialog()
    {
        (new PotentiallyMSACredentialsDialog()).show(getSupportFragmentManager());
    }

    protected void showProgress()
    {
        showProgress(getString(0x7f080429));
    }

    protected void showProgress(String s)
    {
        if (getSupportFragmentManager().a("skypeDialog") instanceof ProgressSpinnerDialogFragment)
        {
            return;
        } else
        {
            s = ProgressSpinnerDialogFragment.create(0x7f0300eb, true, new String[] {
                s, ""
            });
            s.setCancelable(false);
            s.show(getSupportFragmentManager());
            return;
        }
    }

    protected void signInLastAccount()
    {
        if (!TextUtils.isEmpty(lib.getDefaultAccountName()))
        {
            account = accountProvider.get();
            if (account.getStatusProp() == com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED)
            {
                showProgress();
                PerformanceLog.b.a("account.beginLogin");
                account.beginLogin();
            }
            return;
        } else
        {
            throw new IllegalStateException("No existing account to sign in to");
        }
    }

    protected void signInWithMsa()
    {
        if (isSignedOut())
        {
            obtainAccount("");
            PerformanceLog.b.a("loginWithOAuth");
            StartupTimeReporter.a().a(com.skype.android.util.StartupTimeReporter.CheckPoint.b);
            boolean flag = configuration.isMsaSdkUsedForLogin();
            Object obj;
            Account account1;
            String s;
            long l1;
            if (flag)
            {
                account1 = account;
                l1 = com.skype.SkyLib.PARTNER_ID.PARTNER_MICROSOFT.toInt();
                String s1;
                if (loginAccessToken == null)
                {
                    obj = "";
                } else
                {
                    obj = loginAccessToken;
                }
                s1 = "";
                s = ((String) (obj));
                obj = s1;
            } else
            {
                account1 = account;
                l1 = com.skype.SkyLib.PARTNER_ID.PARTNER_MICROSOFT.toInt();
                s = "";
                if (refreshToken == null)
                {
                    obj = "";
                } else
                {
                    obj = refreshToken;
                }
            }
            account1.loginWithOAuth(l1, s, ((String) (obj)), true, true);
            obj = createSignInTelemetryEvent(LogEvent.l, SignInConstants.AccountType.MSA, flag);
            analytics.a(((com.skype.android.analytics.SkypeTelemetryEvent) (obj)));
            return;
        } else
        {
            showErrorDialog(0x7f0803fd);
            return;
        }
    }

    protected void signInWithSkype(String s, String s1)
    {
        if (isSignedOut())
        {
            obtainAccount(s);
            showProgress();
            PerformanceLog.b.a("loginWithPassword");
            account.loginWithPassword(s1, true, true);
            s = createSignInTelemetryEvent(LogEvent.m, account);
            analytics.a(s);
            return;
        } else
        {
            showErrorDialog(0x7f0803fd);
            return;
        }
    }
}
