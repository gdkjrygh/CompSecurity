// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.ads.AdManager;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.Navigation;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.PerformanceLog;
import com.skype.android.util.StartupTimeReporter;
import com.skype.android.util.ViewUtil;

// Referenced classes of package com.skype.android.app.signin:
//            SignInLandingPageActivity, SignInConstants, SignInTelemetryEvent, SignInNavigation

public class SimpleLandingPageActivity extends SignInLandingPageActivity
    implements android.view.View.OnClickListener, SignInConstants
{

    AccountProvider accountProvider;
    AdManager adManager;
    Analytics analytics;
    AnalyticsPersistentStorage analyticsPersistentStorage;
    AsyncService asyncService;
    EcsConfiguration configuration;
    View createAccountBtn;
    Navigation navigation;
    View signInContent;
    Button signInMsAccountBtn;
    SignInNavigation signInNavigation;
    Button signInSkypeAccountBtn;

    public SimpleLandingPageActivity()
    {
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

    public boolean onAcceptEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.ACCOUNT_STATUS;
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131755946: 
            view = new SignInTelemetryEvent(LogEvent.j, SignInConstants.FlowType.SIMPLIFIED, configuration.isMsaSdkUsedForLogin());
            analytics.a(view);
            navigation.signup();
            return;

        case 2131755951: 
            reportTelemetryEvent(LogEvent.h, String.valueOf(SignInConstants.AccountType.SKYPE));
            signInNavigation.toSkypeLogin();
            PerformanceLog.e.a("navigate to skype sign in screen");
            return;

        case 2131755952: 
            reportTelemetryEvent(LogEvent.h, String.valueOf(SignInConstants.AccountType.MSA));
            break;
        }
        signInNavigation.toMsaLogin();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        bundle = new SignInTelemetryEvent(LogEvent.k, SignInConstants.FlowType.SIMPLIFIED, configuration.isMsaSdkUsedForLogin());
        analytics.a(bundle);
        analytics.a(LogEvent.x);
        reportPromptManualSignInTelemetryEvent(com/skype/android/app/signin/SimpleLandingPageActivity.getSimpleName());
        bundle = AnimationUtils.loadAnimation(this, 0x10a0000);
        signInContent.startAnimation(bundle);
        ViewUtil.a(this, new View[] {
            createAccountBtn, signInMsAccountBtn, signInSkypeAccountBtn
        });
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
        PerformanceLog.e.a("landing page screen displayed");
        StartupTimeReporter.a().a(com.skype.android.util.StartupTimeReporter.CheckPoint.a);
    }

    protected void reportTelemetryEvent(LogEvent logevent, String s)
    {
        logevent = new SkypeTelemetryEvent(logevent);
        logevent.put(LogAttributeName.q, s);
        analytics.a(logevent);
    }
}
