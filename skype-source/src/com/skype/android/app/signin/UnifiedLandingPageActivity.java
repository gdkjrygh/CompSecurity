// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.text.TextUtils;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.dialer.SelectCountryActivity;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.CountryCode;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.PerformanceLog;
import com.skype.android.util.StartupTimeReporter;
import com.skype.android.util.ViewStateManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.signin:
//            SignInLandingPageActivity, SignInConstants, UnifiedSignInFlow, AccountsList, 
//            UnifiedSignInManager, UnifiedSignInPickAccountFragment, SignInNavigation, SignInTelemetryEvent, 
//            AccountInfo

public class UnifiedLandingPageActivity extends SignInLandingPageActivity
    implements SignInConstants, UnifiedSignInFlow
{
    public static interface UnifiedSignInCallbacks
    {

        public abstract void onAccountSearchResult(AccountsList.OutcomeResult outcomeresult);

        public abstract void updateUsername(String s);
    }

    private static final class a extends Handler
    {

        private final Analytics analytics;

        public final void handleMessage(Message message)
        {
            if (message.what == 1)
            {
                message = (Map)message.obj;
                if (((Future)message.get("future")).cancel(true))
                {
                    analytics.a(LogEvent.E);
                    message = new UnifiedSignInManager.OnApiIfExistsResult((String)message.get("userId"), null);
                    EventBusInstance.a().a(message);
                }
            }
        }

        public a(Analytics analytics1)
        {
            analytics = analytics1;
        }
    }


    private static final String EXTRA_GUESS_STATE = "EXTRA_GUESS_STATE";
    public static final String EXTRA_JSON_ACCOUNTS = "EXTRA_JSON_ACCOUNTS";
    public static final String EXTRA_SEARCH_USERNAME = "EXTRA_SEARCH_USERNAME";
    private static final int GET_COUNTRY_CODE = 1;
    private static final int MESSAGE_CANCEL_SEARCH_ACCOUNTS = 1;
    public static final String MESSAGE_PARAM_FUTURE = "future";
    public static final String MESSAGE_PARAM_USER_ID = "userId";
    AccountProvider accountProvider;
    private AccountsList accounts;
    Analytics analytics;
    AnalyticsPersistentStorage analyticsPersistentStorage;
    AsyncService asyncService;
    EcsConfiguration configuration;
    ContactUtil contactUtil;
    EventBus eventBus;
    private boolean haveTriedToGuessCountryCode;
    HttpUtil httpUtil;
    private String jsonAccounts;
    SkyLib lib;
    private Handler searchAccountsCancelHandler;
    private String searchUsername;
    ViewStateManager viewStateManager;

    public UnifiedLandingPageActivity()
    {
        jsonAccounts = null;
        accounts = null;
        searchUsername = null;
        haveTriedToGuessCountryCode = false;
    }

    private AccountsList generateAccountsList(String s)
    {
        try
        {
            s = AccountsList.fromJson(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return AccountsList.emptyList();
        }
        return s;
    }

    private UnifiedSignInCallbacks getUnifiedSignInCallbacks()
    {
        return (UnifiedSignInCallbacks)getSupportFragmentManager().a("UnifiedSignInFragment");
    }

    private boolean isAccountLoggedIn(Account account)
    {
        if (account != null)
        {
            com.skype.Account.STATUS status = account.getStatusProp();
            account = status;
            if (status == null)
            {
                account = com.skype.Account.STATUS.LOGGED_OUT;
            }
            if (account == com.skype.Account.STATUS.LOGGED_IN)
            {
                return true;
            }
        }
        return false;
    }

    private void makeSearchRequest(String s)
    {
        String s1 = s;
        if (getUnifiedSignInManager().isPhoneNumberLike(s))
        {
            s1 = lib.normalizePSTNWithCountry(s).m_normalized;
        }
        s = getUnifiedSignInManager().searchAccountsAsync(s1);
        Message message = searchAccountsCancelHandler.obtainMessage(1);
        HashMap hashmap = new HashMap();
        hashmap.put("userId", s1);
        hashmap.put("future", s);
        message.obj = hashmap;
        searchAccountsCancelHandler.sendMessageDelayed(message, configuration.getSearchAccountsTimeout());
    }

    private void navigateToAccountPicker()
    {
        getSupportFragmentManager().a().b(0x1020002, new UnifiedSignInPickAccountFragment(), "UnifiedSignInFragment").a(null).a();
        analytics.a(LogEvent.B);
    }

    private void navigateToMSASignIn(String s)
    {
        (new SignInNavigation(this, configuration, analytics, analyticsPersistentStorage)).toMsaLogin(s);
    }

    private void navigateToSkypeSignIn(String s)
    {
        (new SignInNavigation(this, configuration, analytics, analyticsPersistentStorage)).toSkypeLogin(s);
    }

    private void updateRequestWithCountryCode(CountryCode countrycode)
    {
        com.skype.SkyLib.NormalizePSTNWithCountry_Result normalizepstnwithcountry_result = lib.normalizePSTNWithCountry(searchUsername, countrycode.c());
        if (normalizepstnwithcountry_result.m_return == com.skype.SkyLib.NORMALIZERESULT.IDENTITY_OK)
        {
            countrycode = normalizepstnwithcountry_result.m_normalized;
        } else
        {
            countrycode = (new StringBuilder()).append(countrycode.d()).append(searchUsername).toString();
        }
        searchUsername = countrycode;
        getUnifiedSignInCallbacks().updateUsername(searchUsername);
        makeSearchRequest(countrycode);
    }

    public AccountsList getAccountsList()
    {
        return accounts;
    }

    public UnifiedSignInManager getUnifiedSignInManager()
    {
        UnifiedSignInManager unifiedsigninmanager1 = (UnifiedSignInManager)viewStateManager.a(com/skype/android/app/signin/UnifiedSignInManager.getName());
        UnifiedSignInManager unifiedsigninmanager = unifiedsigninmanager1;
        if (unifiedsigninmanager1 == null)
        {
            unifiedsigninmanager = new UnifiedSignInManager(httpUtil, asyncService, lib, analytics, analyticsPersistentStorage, eventBus, configuration);
            viewStateManager.a(com/skype/android/app/signin/UnifiedSignInManager.getName(), unifiedsigninmanager);
        }
        return unifiedsigninmanager;
    }

    public boolean navigateToSignInBasedOnGuess(String s, boolean flag)
    {
        boolean flag1 = false;
        UnifiedSignInManager unifiedsigninmanager = getUnifiedSignInManager();
        boolean flag2 = unifiedsigninmanager.isPhoneNumberLike(s);
        boolean flag3 = unifiedsigninmanager.isEmailLike(s);
        if (flag && (flag3 || flag2))
        {
            if (flag2)
            {
                reportTelemetryEvent(LogEvent.G, String.valueOf(SignInConstants.FlowType.UNIFIED), Boolean.valueOf(false), "unknown account", String.valueOf(SignInConstants.UnifiedLoginId.PHONE_NUMBER));
            }
            navigateToMSASignIn(s);
            flag = true;
        } else
        {
            flag = flag1;
            if (!flag3)
            {
                flag = flag1;
                if (!flag2)
                {
                    navigateToSkypeSignIn(s);
                    return true;
                }
            }
        }
        return flag;
    }

    public boolean navigateToSignInBasedOnType(String s, SignInConstants.AccountType accounttype)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$SkyLib$NORMALIZERESULT[];
            static final int $SwitchMap$com$skype$android$app$signin$AccountsList$OutcomeResult[];
            static final int $SwitchMap$com$skype$android$app$signin$SignInConstants$AccountType[];

            static 
            {
                $SwitchMap$com$skype$SkyLib$NORMALIZERESULT = new int[com.skype.SkyLib.NORMALIZERESULT.values().length];
                try
                {
                    $SwitchMap$com$skype$SkyLib$NORMALIZERESULT[com.skype.SkyLib.NORMALIZERESULT.PSTN_NUMBER_TOO_SHORT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$NORMALIZERESULT[com.skype.SkyLib.NORMALIZERESULT.PSTN_NUMBER_HAS_INVALID_PREFIX.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                $SwitchMap$com$skype$android$app$signin$SignInConstants$AccountType = new int[SignInConstants.AccountType.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$signin$SignInConstants$AccountType[SignInConstants.AccountType.SKYPE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$android$app$signin$SignInConstants$AccountType[SignInConstants.AccountType.MSA.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                $SwitchMap$com$skype$android$app$signin$AccountsList$OutcomeResult = new int[AccountsList.OutcomeResult.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$signin$AccountsList$OutcomeResult[AccountsList.OutcomeResult.SKYPE_EXISTS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$signin$AccountsList$OutcomeResult[AccountsList.OutcomeResult.MSA_EXISTS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$signin$AccountsList$OutcomeResult[AccountsList.OutcomeResult.SUGGESTIONS_FOUND.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$signin$AccountsList$OutcomeResult[AccountsList.OutcomeResult.NO_RESPONSE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$signin$AccountsList$OutcomeResult[AccountsList.OutcomeResult.NO_ACCOUNT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.android.app.signin.SignInConstants.AccountType[accounttype.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
            navigateToSkypeSignIn(s);
            return true;

        case 2: // '\002'
            navigateToMSASignIn(s);
            break;
        }
        return true;
    }

    public boolean onAcceptEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.ACCOUNT_STATUS;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
label0:
        {
            if (i == 1)
            {
                if (intent != null)
                {
                    i = intent.getIntExtra("country_list_item", -1);
                } else
                {
                    i = -1;
                }
                if (j != -1 || i == -1)
                {
                    break label0;
                }
                updateRequestWithCountryCode(contactUtil.a(i));
            }
            return;
        }
        getUnifiedSignInCallbacks().onAccountSearchResult(AccountsList.OutcomeResult.CANCELED);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        SignInTelemetryEvent signintelemetryevent = new SignInTelemetryEvent(LogEvent.k, SignInConstants.FlowType.UNIFIED, configuration.isMsaSdkUsedForLogin());
        analytics.a(signintelemetryevent);
        analytics.a(LogEvent.A);
        reportPromptManualSignInTelemetryEvent(com/skype/android/app/signin/UnifiedLandingPageActivity.getSimpleName());
        if (bundle != null)
        {
            searchUsername = bundle.getString("EXTRA_SEARCH_USERNAME", null);
            jsonAccounts = bundle.getString("EXTRA_JSON_ACCOUNTS", null);
            if (jsonAccounts != null)
            {
                accounts = generateAccountsList(jsonAccounts);
            }
            haveTriedToGuessCountryCode = bundle.getBoolean("EXTRA_GUESS_STATE");
        }
        searchAccountsCancelHandler = new a(analytics);
    }

    public void onEvent(UnifiedSignInManager.OnApiIfExistsResult onapiifexistsresult)
    {
        searchAccountsCancelHandler.removeCallbacksAndMessages(null);
        if (accounts == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        getUnifiedSignInManager().clearSearchCache();
        jsonAccounts = onapiifexistsresult.getJsonResult();
        accounts = generateAccountsList(jsonAccounts);
        log.info((new StringBuilder("Accounts Retrieved Callback | Result: ")).append(accounts.getOutcome()).append(" | Accounts Found: ").append(accounts.size()).toString());
        getUnifiedSignInCallbacks().onAccountSearchResult(accounts.getOutcome());
        onapiifexistsresult = null;
        if (accounts.size() > 0)
        {
            onapiifexistsresult = ((AccountInfo)accounts.getAccounts().get(0)).getUsername();
        }
        switch (_cls1..SwitchMap.com.skype.android.app.signin.AccountsList.OutcomeResult[accounts.getOutcome().ordinal()])
        {
        default:
            if (haveTriedToGuessCountryCode)
            {
                searchAccountsAsync(searchUsername);
                return;
            }
            break;

        case 1: // '\001'
            if (TextUtils.equals(searchUsername, onapiifexistsresult) || accounts.size() == 1)
            {
                navigateToSkypeSignIn(onapiifexistsresult);
                reportTelemetryEvent(LogEvent.G, String.valueOf(SignInConstants.FlowType.UNIFIED), Boolean.valueOf(true), String.valueOf(SignInConstants.AccountType.SKYPE), String.valueOf(SignInConstants.UnifiedLoginId.SKYPE_ID));
                return;
            } else
            {
                navigateToAccountPicker();
                return;
            }

        case 2: // '\002'
            if (TextUtils.equals(searchUsername, onapiifexistsresult) || accounts.size() == 1)
            {
                navigateToMSASignIn(onapiifexistsresult);
                String s = String.valueOf(SignInConstants.UnifiedLoginId.PHONE_NUMBER);
                if (lib.getIdentityType(onapiifexistsresult) != com.skype.SkyLib.IDENTITYTYPE.PSTN)
                {
                    s = String.valueOf(SignInConstants.UnifiedLoginId.MSA_EMAIL);
                }
                reportTelemetryEvent(LogEvent.G, String.valueOf(SignInConstants.FlowType.UNIFIED), Boolean.valueOf(true), String.valueOf(SignInConstants.AccountType.MSA), s);
                return;
            } else
            {
                navigateToAccountPicker();
                return;
            }

        case 3: // '\003'
            if (accounts.size() == 1)
            {
                navigateToSignInBasedOnType(onapiifexistsresult, ((AccountInfo)accounts.getAccounts().get(0)).getType());
            } else
            {
                navigateToAccountPicker();
            }
            reportTelemetryEvent(LogEvent.G, String.valueOf(SignInConstants.FlowType.UNIFIED), Boolean.valueOf(false), "unknown account", String.valueOf(SignInConstants.UnifiedLoginId.NON_MSA_EMAIL));
            return;

        case 4: // '\004'
            navigateToSignInBasedOnGuess(searchUsername, true);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        if (isAccountLoggedIn((Account)onpropertychange.getSender()) && !isFinishing())
        {
            finish();
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (isAccountLoggedIn(accountProvider.get()) && !isFinishing())
        {
            finish();
        }
        if (searchUsername != null && accounts == null)
        {
            getUnifiedSignInManager().fireSearchEventIfMissed(searchUsername);
        }
        PerformanceLog.e.a("APP ACTION: landing page screen displayed");
        StartupTimeReporter.a().a(com.skype.android.util.StartupTimeReporter.CheckPoint.a);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("EXTRA_SEARCH_USERNAME", searchUsername);
        bundle.putString("EXTRA_JSON_ACCOUNTS", jsonAccounts);
        bundle.putBoolean("EXTRA_GUESS_STATE", haveTriedToGuessCountryCode);
    }

    protected void reportTelemetryEvent(LogEvent logevent, String s, Boolean boolean1, String s1, String s2)
    {
        logevent = new SkypeTelemetryEvent(logevent);
        logevent.put(LogAttributeName.v, s);
        logevent.put(LogAttributeName.r, boolean1);
        logevent.put(LogAttributeName.q, s1);
        logevent.put(LogAttributeName.y, s2);
        analytics.a(logevent);
    }

    public boolean requiresCountryCode(String s)
    {
        boolean flag = true;
        if (getUnifiedSignInManager().isPhoneNumberLike(s))
        {
            s = lib.normalizePSTNWithCountry(s);
            switch (_cls1..SwitchMap.com.skype.SkyLib.NORMALIZERESULT[((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (s)).m_return.ordinal()])
            {
            default:
                flag = false;
                // fall through

            case 1: // '\001'
            case 2: // '\002'
                return flag;
            }
        } else
        {
            return false;
        }
    }

    public void searchAccountsAsync(String s)
    {
        searchUsername = s;
        jsonAccounts = null;
        accounts = null;
        if (requiresCountryCode(s))
        {
            Object obj = contactUtil.b();
            if (haveTriedToGuessCountryCode)
            {
                haveTriedToGuessCountryCode = false;
                s = new Intent(this, com/skype/android/app/dialer/SelectCountryActivity);
                s.putExtra("selection", contactUtil.a(((CountryCode) (obj))));
                s.putExtra("style", 0x7f090121);
                startActivityForResult(s, 1);
                overridePendingTransition(0, 0);
                return;
            }
            haveTriedToGuessCountryCode = true;
            obj = lib.normalizePSTNWithCountry(s, ((CountryCode) (obj)).c());
            if (((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj)).m_return == com.skype.SkyLib.NORMALIZERESULT.IDENTITY_OK)
            {
                makeSearchRequest(((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj)).m_normalized);
                return;
            } else
            {
                searchAccountsAsync(s);
                return;
            }
        } else
        {
            makeSearchRequest(s);
            return;
        }
    }

    public void selectAccount(int i)
    {
        if (getAccountsList().size() <= i)
        {
            return;
        }
        AccountInfo accountinfo = (AccountInfo)getAccountsList().getAccounts().get(i);
        switch (_cls1..SwitchMap.com.skype.android.app.signin.SignInConstants.AccountType[accountinfo.getType().ordinal()])
        {
        default:
            throw new IllegalStateException(String.format("Account type %s is not supported.", new Object[] {
                accountinfo.getType()
            }));

        case 2: // '\002'
            navigateToMSASignIn(accountinfo.getUsername());
            return;

        case 1: // '\001'
            navigateToSkypeSignIn(accountinfo.getUsername());
            return;
        }
    }
}
