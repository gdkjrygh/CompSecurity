// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.text.TextUtils;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.AccountUtil;
import java.util.ArrayList;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.signin:
//            AbstractSignInActivity, SignInConstants, LinkingErrorAccountBlockedActivity, LinkingErrorConnectionDroppedActivity, 
//            LinkingAccountsAnimationActivity, LinkingErrorSignInActivity, AccountStatusNotifier, LinkingSkypeSignInActivity, 
//            AuthenticateWithMsaActivity, SignInLiveIdActivity

public abstract class LinkingAbstractActivity extends AbstractSignInActivity
    implements SignInConstants
{

    protected boolean interruptNavigatingHome;

    public LinkingAbstractActivity()
    {
        interruptNavigatingHome = true;
    }

    public void accountBlocked()
    {
        showErrorScreen(com/skype/android/app/signin/LinkingErrorAccountBlockedActivity);
    }

    public void accountsAlreadyMerged()
    {
    }

    protected void cancelAndStartAgain()
    {
        navigation.toLandingPage(account);
    }

    public void connectionDropped()
    {
        showErrorScreen(com/skype/android/app/signin/LinkingErrorConnectionDroppedActivity);
    }

    protected void dismissDialog()
    {
        SkypeDialogFragment.dismiss(getSupportFragmentManager());
    }

    protected void forgotPassword()
    {
        navigationUrl.goToUrl(this, com.skype.android.res.Urls.Type.n);
    }

    public void goToAnimationView(String s, String s1, String s2, ArrayList arraylist, ArrayList arraylist1)
    {
        Intent intent = new Intent(this, com/skype/android/app/signin/LinkingAccountsAnimationActivity);
        intent.putParcelableArrayListExtra("suggestedAccounts", arraylist);
        intent.putParcelableArrayListExtra("microsoftAccounts", arraylist1);
        intent.putExtra("accessToken", s);
        intent.putExtra("refreshToken", s1);
        intent.putExtra("loginAccessToken", s2);
        startActivity(intent);
    }

    protected boolean handleLoggedIn()
    {
        return interruptNavigatingHome;
    }

    public void incorrectCredentials()
    {
        showErrorScreen(com/skype/android/app/signin/LinkingErrorSignInActivity);
    }

    protected void mergeMsaWithSkypeAccount(String s, String s1, String s2, boolean flag)
    {
        analytics.a(new SkypeTelemetryEvent(LogEvent.s));
        lib.linkAccountWithPartner(com.skype.SkyLib.PARTNER_ID.PARTNER_MICROSOFT.toInt(), s2, s, s1, "", flag, false);
    }

    protected void mergeMsaWithTechAccount(String s, boolean flag)
    {
        analytics.a(new SkypeTelemetryEvent(LogEvent.s));
        lib.linkAccountWithPartner(com.skype.SkyLib.PARTNER_ID.PARTNER_MICROSOFT.toInt(), s, "", "", "", flag, false);
    }

    protected abstract void nextIntent();

    public boolean onAcceptEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.ACCOUNT_STATUS;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (j != -1) goto _L2; else goto _L1
_L1:
        i = intent.getIntExtra("clickedAction", -1);
        log.info((new StringBuilder("msasdk: clickedAction")).append(i).toString());
        i;
        JVM INSTR tableswitch 0 6: default 84
    //                   0 85
    //                   1 85
    //                   2 90
    //                   3 100
    //                   4 105
    //                   5 110
    //                   6 115;
           goto _L2 _L3 _L3 _L4 _L5 _L6 _L7 _L8
_L2:
        return;
_L3:
        resetFields();
        return;
_L4:
        interruptNavigatingHome = false;
        skipLinking();
        return;
_L5:
        forgotPassword();
        return;
_L6:
        signInDifferentMicrosoftAccount();
        return;
_L7:
        visitSkypeSupport();
        return;
_L8:
        cancelAndStartAgain();
        return;
    }

    public void onEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        com.skype.Account.STATUS status1 = ((Account)onpropertychange.getSender()).getStatusProp();
        com.skype.Account.STATUS status = status1;
        if (status1 == null)
        {
            status = com.skype.Account.STATUS.LOGGED_OUT;
        }
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$Account$LOGOUTREASON[];
            static final int $SwitchMap$com$skype$Account$STATUS[];
            static final int $SwitchMap$com$skype$SkyLib$AUTH_RESULT[];

            static 
            {
                $SwitchMap$com$skype$Account$LOGOUTREASON = new int[com.skype.Account.LOGOUTREASON.values().length];
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.P2P_CONNECT_FAILED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.SERVER_CONNECT_FAILED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.SERVER_OVERLOADED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.HTTPS_PROXY_AUTH_FAILED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.SOCKS_PROXY_AUTH_FAILED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.NO_SUCH_IDENTITY.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.INCORRECT_PASSWORD.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.INVALID_SKYPENAME.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.TOO_MANY_LOGIN_ATTEMPTS.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.ATO_BLOCKED.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                $SwitchMap$com$skype$Account$STATUS = new int[com.skype.Account.STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_OUT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGING_OUT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_IN.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                $SwitchMap$com$skype$SkyLib$AUTH_RESULT = new int[com.skype.SkyLib.AUTH_RESULT.values().length];
                try
                {
                    $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.SkyLib.AUTH_RESULT.AUTH_OK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.SkyLib.AUTH_RESULT.AUTH_INTERNAL_ERROR.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.SkyLib.AUTH_RESULT.AUTH_PARTNER_INTERNAL_ERROR.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.SkyLib.AUTH_RESULT.AUTH_PARTNER_TIMEOUT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.SkyLib.AUTH_RESULT.AUTH_ANOTHER_MAPPING_EXISTS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.Account.STATUS[status.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            finish();
            return;

        case 4: // '\004'
            super.onEvent(onpropertychange);
            break;
        }
        onLoggedIn();
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnAccountPartnerLinkResult onaccountpartnerlinkresult)
    {
        onaccountpartnerlinkresult = onaccountpartnerlinkresult.getCode();
        switch (_cls1..SwitchMap.com.skype.SkyLib.AUTH_RESULT[onaccountpartnerlinkresult.ordinal()])
        {
        default:
            showError(onaccountpartnerlinkresult);
            return;

        case 1: // '\001'
            nextIntent();
            break;
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnPartnerLinkInfoResult onpartnerlinkinforesult)
    {
        if (onpartnerlinkinforesult.getCode() == com.skype.SkyLib.AUTH_RESULT.AUTH_OK)
        {
            TextUtils.isEmpty(onpartnerlinkinforesult.getUid());
        }
    }

    protected void onLoggedIn()
    {
        if (interruptNavigatingHome)
        {
            if (AccountUtil.a(account))
            {
                SignInTelemetryEvent signintelemetryevent = createSignInTelemetryEvent(LogEvent.n, account);
                analytics.a(signintelemetryevent);
            }
            accountStatusNotifier.sendLoggedIn(accountProvider.get().getSkypenameProp());
            finish();
        }
    }

    protected void resetFields()
    {
    }

    protected void showError(com.skype.Account.LOGOUTREASON logoutreason)
    {
        switch (_cls1..SwitchMap.com.skype.Account.LOGOUTREASON[logoutreason.ordinal()])
        {
        default:
            showErrorDialog(logoutreason);
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            connectionDropped();
            return;

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            incorrectCredentials();
            break;
        }
    }

    protected void showError(com.skype.SkyLib.AUTH_RESULT auth_result)
    {
        switch (_cls1..SwitchMap.com.skype.SkyLib.AUTH_RESULT[auth_result.ordinal()])
        {
        default:
            incorrectCredentials();
            return;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            connectionDropped();
            return;

        case 5: // '\005'
            accountsAlreadyMerged();
            break;
        }
    }

    protected void showErrorDialog(com.skype.Account.LOGOUTREASON logoutreason)
    {
        if (logoutreason == com.skype.Account.LOGOUTREASON.ATO_BLOCKED)
        {
            accountBlocked();
            return;
        } else
        {
            super.showErrorDialog(logoutreason);
            return;
        }
    }

    protected void showErrorScreen(Class class1)
    {
        dismissDialog();
        startActivityForResult(new Intent(this, class1), 0);
    }

    protected void signInDiffSkypeAccount(String s, String s1, String s2, boolean flag, ArrayList arraylist)
    {
        Intent intent = new Intent(this, com/skype/android/app/signin/LinkingSkypeSignInActivity);
        intent.putExtra("accessToken", s);
        intent.putExtra("refreshToken", s1);
        intent.putExtra("loginAccessToken", s2);
        intent.putExtra("marketing", flag);
        intent.putParcelableArrayListExtra("microsoftAccounts", arraylist);
        startActivity(intent);
    }

    protected void signInDifferentMicrosoftAccount()
    {
        Object obj;
        if (configuration.isMsaSdkUsedForLogin())
        {
            obj = com/skype/android/app/signin/AuthenticateWithMsaActivity;
        } else
        {
            obj = com/skype/android/app/signin/SignInLiveIdActivity;
        }
        obj = new Intent(this, ((Class) (obj)));
        ((Intent) (obj)).addFlags(0x4000000);
        ((Intent) (obj)).addFlags(32768);
        ((Intent) (obj)).putExtra("msasignin", true);
        startActivity(((Intent) (obj)));
        finish();
    }

    public void skipLinking()
    {
    }

    protected void visitSkypeSupport()
    {
        navigationUrl.goToUrl(this, com.skype.android.res.Urls.Type.p);
    }
}
