// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.List;
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.studies.OnBoardingAnalytics;
import me.lyft.android.application.settings.ISettingsService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.KeyboardlessEditText;
import me.lyft.android.controls.NumericKeyboard;
import me.lyft.android.infrastructure.lyft.LyftApiException;
import me.lyft.android.infrastructure.sms.IVerificationAutoFillService;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.SecureObserver;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.ui.landing.LandingDialogs;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.subjects.PublishSubject;

public class PhoneVerifyView extends LinearLayout
{

    private static final int MIN_CODE_LENGTH = 4;
    private static final String REASON_DUPLICATE_PHONE = "duplicatePhoneNumber";
    private static final String REASON_INVALID_PHONE = "invalidPhone";
    private static final String REASON_SUSPENDED = "suspended";
    private Binder binder;
    KeyboardlessEditText codeEditText;
    DialogFlow dialogFlow;
    NumericKeyboard keyboard;
    private Action1 onVerificationCodeReceived;
    private String phoneNumber;
    TextView phoneTextView;
    ISettingsService phoneVerificationService;
    IProgressController progressController;
    View resendCodeView;
    IVerificationAutoFillService verificationAutoFillService;
    final PublishSubject verificationCompletedSubject = PublishSubject.create();
    Button verifyButton;
    TextView verifyCodeNote;
    IViewErrorHandler viewErrorHandler;

    public PhoneVerifyView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onVerificationCodeReceived = new Action1() {

            final PhoneVerifyView this$0;

            public volatile void call(Object obj)
            {
                call((String)obj);
            }

            public void call(String s)
            {
                codeEditText.setTextAndMoveCursor(s);
            }

            
            {
                this$0 = PhoneVerifyView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void requestResendVerificationCode()
    {
        showResendConfirmation(phoneNumber);
        codeEditText.setText("");
        phoneVerificationService.requestVerificationCode(phoneNumber).observeOn(AndroidSchedulers.mainThread()).subscribe(new SecureObserver() {

            final PhoneVerifyView this$0;

            public volatile void onSafeNext(Object obj)
            {
                onSafeNext((Unit)obj);
            }

            public void onSafeNext(Unit unit)
            {
                super.onSafeNext(unit);
            }

            
            {
                this$0 = PhoneVerifyView.this;
                super();
            }
        });
    }

    private void showResendConfirmation(String s)
    {
        dialogFlow.show(new Toast(getContext().getString(0x7f070303, new Object[] {
            s
        })));
    }

    private void verifyPhoneNumber()
    {
        final ActionAnalytics analytics = OnBoardingAnalytics.trackVerifyPhone();
        if (codeEditText.getText().length() != 4)
        {
            codeEditText.setValidationErrorId(Integer.valueOf(0x7f0701af));
            analytics.setValue(codeEditText.getText().length());
            analytics.trackFailure("code_is_wrong_length");
            return;
        } else
        {
            progressController.disableUI();
            binder.bind(phoneVerificationService.verifyPhone(phoneNumber, codeEditText.getText().toString()), new AsyncCall() {

                final PhoneVerifyView this$0;
                final ActionAnalytics val$analytics;

                public void onFail(Throwable throwable)
                {
label0:
                    {
                        String s;
                        Object obj1;
label1:
                        {
                            super.onFail(throwable);
                            analytics.trackFailure(throwable);
                            if (!(throwable instanceof LyftApiException))
                            {
                                break label0;
                            }
                            Object obj = (LyftApiException)throwable;
                            if (((LyftApiException) (obj)).getStatusCode() != 422)
                            {
                                break label0;
                            }
                            if (((LyftApiException) (obj)).getValidationErrors().size() > 0)
                            {
                                obj1 = (me.lyft.android.infrastructure.lyft.LyftError.ValidationError)((LyftApiException) (obj)).getValidationErrors().get(0);
                                obj = ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj1)).getField();
                                s = ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj1)).getReason();
                                obj1 = ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError) (obj1)).getMessage();
                                if (!((String) (obj)).equalsIgnoreCase("verificationCode") && !s.equalsIgnoreCase("invalidPhone"))
                                {
                                    break label1;
                                }
                                codeEditText.setValidationErrorId(Integer.valueOf(0x7f0701af));
                            }
                            return;
                        }
                        if (s.equalsIgnoreCase("duplicatePhoneNumber"))
                        {
                            dialogFlow.show(LandingDialogs.createDuplicatePhoneNumberErrorDialog(getResources(), ((String) (obj1))));
                            return;
                        }
                        if (s.equalsIgnoreCase("suspended"))
                        {
                            dialogFlow.show(LandingDialogs.createSuspendedErrorDialog(getResources(), ((String) (obj1))));
                            return;
                        } else
                        {
                            viewErrorHandler.handle(throwable);
                            return;
                        }
                    }
                    viewErrorHandler.handle(throwable);
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((Unit)obj);
                }

                public void onSuccess(Unit unit)
                {
                    super.onSuccess(unit);
                    analytics.trackSuccess();
                    verificationCompletedSubject.onNext(unit);
                }

                public void onUnsubscribe()
                {
                    super.onUnsubscribe();
                    progressController.enableUI();
                }

            
            {
                this$0 = PhoneVerifyView.this;
                analytics = actionanalytics;
                super();
            }
            });
            return;
        }
    }

    public Observable observeVerificationCompleted()
    {
        return verificationCompletedSubject.asObservable();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        codeEditText.requestFocus();
        binder = Binder.attach(this);
        binder.bind(verificationAutoFillService.observeCode(getContext()), onVerificationCodeReceived);
        verifyButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PhoneVerifyView this$0;

            public void onClick(View view)
            {
                verifyPhoneNumber();
            }

            
            {
                this$0 = PhoneVerifyView.this;
                super();
            }
        });
        keyboard.setKeyPressListener(codeEditText);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        codeEditText.setValidationMessageView(verifyCodeNote);
        resendCodeView.setOnClickListener(new android.view.View.OnClickListener() {

            final PhoneVerifyView this$0;

            public void onClick(View view)
            {
                requestResendVerificationCode();
            }

            
            {
                this$0 = PhoneVerifyView.this;
                super();
            }
        });
    }

    public void setPhoneNumberForVerification(String s)
    {
        phoneNumber = s;
        phoneTextView.setText(getResources().getString(0x7f070305, new Object[] {
            s
        }));
    }


}
