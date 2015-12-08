// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.studies.OnBoardingAnalytics;
import me.lyft.android.application.ILogoutService;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.application.landing.exceptions.InvalidPhoneExeception;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.NumericKeyboard;
import me.lyft.android.controls.PhoneInputView;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.persistence.landing.ISignUpUserRepository;
import me.lyft.android.persistence.landing.SignupUser;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.landing:
//            LandingFlow

public class LoginView extends LinearLayout
{

    private Binder binder;
    IDevice device;
    TextView inlinePhoneTextView;
    NumericKeyboard keyboard;
    LandingFlow landingFlow;
    ILandingService landingService;
    ILogoutService logoutService;
    PhoneInputView phoneInputView;
    IProgressController progressController;
    ISignUpUserRepository signUpUserRepository;
    Toolbar toolbar;
    IViewErrorHandler viewErrorHandler;

    public LoginView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private void cachePhoneNumber(String s)
    {
        SignupUser signupuser = signUpUserRepository.get();
        signupuser.setPhoneString(s);
        signUpUserRepository.update(signupuser);
    }

    private void requestPhoneAuth()
    {
        final ActionAnalytics analytics = OnBoardingAnalytics.trackAddPhone();
        final String phoneNumberStr = phoneInputView.getText();
        progressController.showProgress();
        binder.bind(landingService.requestVerificationCode(phoneNumberStr, null), new AsyncCall() {

            final LoginView this$0;
            final ActionAnalytics val$analytics;
            final String val$phoneNumberStr;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                analytics.trackFailure(throwable);
                if (throwable instanceof InvalidPhoneExeception)
                {
                    showInvalidPhoneNumber();
                    return;
                } else
                {
                    viewErrorHandler.handle(throwable);
                    return;
                }
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                cachePhoneNumber(phoneNumberStr);
                analytics.trackSuccess();
                landingFlow.openLoginVerifyPhoneScreen(phoneNumberStr);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = LoginView.this;
                phoneNumberStr = s;
                analytics = actionanalytics;
                super();
            }
        });
    }

    private void showInvalidPhoneNumber()
    {
        phoneInputView.setValidationErrorId(Integer.valueOf(0x7f0701ad));
        phoneInputView.showValidationMessage();
    }

    void loginWithFacebook()
    {
        progressController.showProgress();
        final ActionAnalytics analytics = OnBoardingAnalytics.trackAddFacebook();
        binder.bind(landingService.createFacebookUser(), new AsyncCall() {

            final LoginView this$0;
            final ActionAnalytics val$analytics;

            public void onFail(Throwable throwable)
            {
                analytics.trackFailure(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                analytics.trackSuccess();
                landingFlow.goToNextScreenInLoginFlow();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = LoginView.this;
                analytics = actionanalytics;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!isInEditMode())
        {
            logoutService.resetSignUp();
            binder = Binder.attach(this);
            phoneInputView.setValidationMessageView(inlinePhoneTextView);
            keyboard.setKeyPressListener(phoneInputView);
            phoneInputView.requestEditTextFocus();
            String s = device.getPhoneNumber();
            String s1 = signUpUserRepository.get().getPhoneString();
            if (!Strings.isNullOrEmpty(s1))
            {
                phoneInputView.setTextAndMoveCursor(s1);
                return;
            }
            if (!Strings.isNullOrEmpty(s))
            {
                phoneInputView.setTextAndMoveCursor(s);
                return;
            }
        }
    }

    void onClickNext()
    {
        requestPhoneAuth();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            toolbar.showTitle().setTitle(getResources().getString(0x7f0701d3));
            return;
        }
    }


}
