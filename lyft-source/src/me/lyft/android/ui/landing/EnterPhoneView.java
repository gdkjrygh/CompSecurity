// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.studies.OnBoardingAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.application.landing.exceptions.InvalidPhoneExeception;
import me.lyft.android.application.landing.exceptions.TermsNotAcceptedException;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.NumericKeyboard;
import me.lyft.android.controls.PhoneInputView;
import me.lyft.android.domain.Phone;
import me.lyft.android.domain.User;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import rx.Observable;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.landing:
//            TermsOfServiceView

public class EnterPhoneView extends ScrollView
{

    private Binder binder;
    IDevice device;
    NumericKeyboard keyboard;
    ILandingService landingService;
    Button nextButton;
    TextView phoneHintTextView;
    PhoneInputView phoneInputView;
    IProgressController progressController;
    TermsOfServiceView termsOfServiceView;
    IUserProvider userProvider;
    final PublishSubject verificationRequestedSubject = PublishSubject.create();
    IViewErrorHandler viewErrorHandler;

    public EnterPhoneView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        context.a(getContext()).inflate(0x7f03008f, this, true);
        if (isInEditMode())
        {
            return;
        } else
        {
            setFillViewport(true);
            ButterKnife.a(this);
            return;
        }
    }

    private String getPhoneString()
    {
        return phoneInputView.getText();
    }

    private void showInvalidPhoneNumber()
    {
        phoneInputView.setValidationErrorId(Integer.valueOf(0x7f0701ad));
        phoneInputView.showValidationMessage();
    }

    public Observable observeVerificationRequested()
    {
        return verificationRequestedSubject.asObservable();
    }

    protected void onAttachedToWindow()
    {
        String s;
        String s1;
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        binder = Binder.attach(this);
        phoneInputView.setValidationMessageView(phoneHintTextView);
        phoneInputView.requestFocus();
        keyboard.setKeyPressListener(phoneInputView);
        s = userProvider.getUser().getPhone().getNumber();
        s1 = device.getPhoneNumber();
        if (Strings.isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        phoneInputView.setTextAndMoveCursor(s);
_L4:
        nextButton.setOnClickListener(new android.view.View.OnClickListener() {

            final EnterPhoneView this$0;

            public void onClick(View view)
            {
                requestPhoneAuth();
            }

            
            {
                this$0 = EnterPhoneView.this;
                super();
            }
        });
        return;
_L2:
        if (!Strings.isNullOrEmpty(s1))
        {
            phoneInputView.setTextAndMoveCursor(s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    public void requestPhoneAuth()
    {
        final ActionAnalytics analytics = OnBoardingAnalytics.trackAddPhone();
        final String phoneNumberStr = getPhoneString();
        progressController.showProgress();
        boolean flag = termsOfServiceView.isChecked();
        binder.bind(landingService.requestVerificationCode(phoneNumberStr, Boolean.valueOf(flag)), new AsyncCall() {

            final EnterPhoneView this$0;
            final ActionAnalytics val$analytics;
            final String val$phoneNumberStr;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                analytics.trackFailure(throwable);
                if (throwable instanceof TermsNotAcceptedException)
                {
                    termsOfServiceView.showTermsOfServiceError(true);
                    return;
                }
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
                analytics.trackSuccess();
                verificationRequestedSubject.onNext(phoneNumberStr);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = EnterPhoneView.this;
                analytics = actionanalytics;
                phoneNumberStr = s;
                super();
            }
        });
    }

}
