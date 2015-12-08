// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.studies.OnBoardingAnalytics;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.application.landing.exceptions.DuplicatePhoneException;
import me.lyft.android.application.landing.exceptions.InvalidPhoneExeception;
import me.lyft.android.application.landing.exceptions.InvalidVerificationCodeException;
import me.lyft.android.application.landing.exceptions.LandingServiceException;
import me.lyft.android.application.landing.exceptions.SuspendedPhoneException;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.KeyboardlessEditText;
import me.lyft.android.controls.NumericKeyboard;
import me.lyft.android.infrastructure.sms.IVerificationAutoFillService;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.Toast;
import rx.Observable;
import rx.functions.Action1;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.landing:
//            LandingDialogs

public class VerifyPhoneNumberView extends LinearLayout
{

    private Binder binder;
    KeyboardlessEditText codeEditText;
    DialogFlow dialogFlow;
    TextView inlinePhoneTextView;
    NumericKeyboard keyboard;
    ILandingService landingService;
    private Action1 onVerificationCodeReceived;
    private String phoneNumber;
    IProgressController progressController;
    View resendCodeView;
    IVerificationAutoFillService verificationAutoFillService;
    private final PublishSubject verificationCompletedSubject = PublishSubject.create();
    Button verifyButton;
    IViewErrorHandler viewErrorHandler;

    public VerifyPhoneNumberView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onVerificationCodeReceived = new Action1() {

            final VerifyPhoneNumberView this$0;

            public volatile void call(Object obj)
            {
                call((String)obj);
            }

            public void call(String s)
            {
                codeEditText.setTextAndMoveCursor(s);
            }

            
            {
                this$0 = VerifyPhoneNumberView.this;
                super();
            }
        };
        if (!isInEditMode())
        {
            context = Scoop.a(this);
            context.b(this);
            setOrientation(1);
            context.a(getContext()).inflate(0x7f030099, this, true);
            if (!isInEditMode())
            {
                ButterKnife.a(this);
                return;
            }
        }
    }

    private void requestResendVerificationCode()
    {
        final ActionAnalytics analytics = OnBoardingAnalytics.trackResendPhoneCode();
        showResendConfirmation(phoneNumber);
        codeEditText.setText("");
        binder.bind(landingService.requestVerificationCode(phoneNumber, null), new AsyncCall() {

            final VerifyPhoneNumberView this$0;
            final ActionAnalytics val$analytics;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                analytics.trackFailure(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                analytics.trackSuccess();
            }

            
            {
                this$0 = VerifyPhoneNumberView.this;
                analytics = actionanalytics;
                super();
            }
        });
    }

    private void showInvalidCodeError()
    {
        codeEditText.setValidationMessageView(inlinePhoneTextView);
        codeEditText.setValidationErrorId(Integer.valueOf(0x7f0701af));
        codeEditText.showValidationMessage();
    }

    private void showResendConfirmation(String s)
    {
        dialogFlow.show(new Toast(getContext().getString(0x7f070303, new Object[] {
            s
        })));
    }

    public Observable observeVerificationCompleted()
    {
        return verificationCompletedSubject.asObservable();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            resendCodeView.setOnClickListener(new android.view.View.OnClickListener() {

                final VerifyPhoneNumberView this$0;

                public void onClick(View view)
                {
                    requestResendVerificationCode();
                }

            
            {
                this$0 = VerifyPhoneNumberView.this;
                super();
            }
            });
            codeEditText.requestFocus();
            binder = Binder.attach(this);
            binder.bind(verificationAutoFillService.observeCode(getContext()), onVerificationCodeReceived);
            verifyButton.setOnClickListener(new android.view.View.OnClickListener() {

                final VerifyPhoneNumberView this$0;

                public void onClick(View view)
                {
                    verifyPhoneNumber();
                }

            
            {
                this$0 = VerifyPhoneNumberView.this;
                super();
            }
            });
            keyboard.setKeyPressListener(codeEditText);
            return;
        }
    }

    public void setPhoneNumberForVerification(String s)
    {
        phoneNumber = s;
        inlinePhoneTextView.setText(getResources().getString(0x7f070306, new Object[] {
            s
        }));
    }

    public void verifyPhoneNumber()
    {
        final ActionAnalytics analytics = OnBoardingAnalytics.trackVerifyPhone();
        progressController.showProgress();
        binder.bind(landingService.verifyPhone(phoneNumber, codeEditText.getText().toString()), new AsyncCall() {

            final VerifyPhoneNumberView this$0;
            final ActionAnalytics val$analytics;

            public void onFail(Throwable throwable)
            {
                analytics.trackFailure(throwable);
                if (throwable instanceof LandingServiceException)
                {
                    if ((throwable instanceof InvalidVerificationCodeException) || (throwable instanceof InvalidPhoneExeception))
                    {
                        showInvalidCodeError();
                        return;
                    }
                    if (throwable instanceof DuplicatePhoneException)
                    {
                        dialogFlow.show(LandingDialogs.createDuplicatePhoneNumberErrorDialog(getResources(), throwable.getMessage()));
                        return;
                    }
                    if (throwable instanceof SuspendedPhoneException)
                    {
                        dialogFlow.show(LandingDialogs.createSuspendedErrorDialog(getResources(), throwable.getMessage()));
                        return;
                    } else
                    {
                        viewErrorHandler.handle(throwable);
                        return;
                    }
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
                analytics.trackSuccess();
                verificationCompletedSubject.onNext(Unit.create());
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = VerifyPhoneNumberView.this;
                analytics = actionanalytics;
                super();
            }
        });
    }



}
