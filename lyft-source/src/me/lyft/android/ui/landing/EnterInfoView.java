// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.studies.OnBoardingAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.landing.InvalidField;
import me.lyft.android.application.landing.LandingService;
import me.lyft.android.application.landing.exceptions.LandingValidationException;
import me.lyft.android.application.landing.exceptions.TermsNotAcceptedException;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.EmailAutoFillEditText;
import me.lyft.android.domain.User;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.persistence.landing.SignupUser;
import me.lyft.android.providers.ProfileProvider;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.utils.Keyboard;
import rx.Observable;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.landing:
//            TermsOfServiceView, LandingFlow

public class EnterInfoView extends ScrollView
{

    private Binder binder;
    IDevice device;
    EmailAutoFillEditText emailEdit;
    TextView errorEmailTextView;
    TextView errorFistNameTextView;
    TextView errorLastNameTextView;
    AdvancedEditText firstNameEdit;
    LandingFlow landingFlow;
    LandingService landingService;
    AdvancedEditText lastNameEdit;
    Button nextButton;
    ProfileProvider profileProvider;
    IProgressController progressController;
    final PublishSubject submitProfileInfoSubject = PublishSubject.create();
    TermsOfServiceView tosCheckBox;
    IUserProvider userProvider;
    IViewErrorHandler viewErrorHandler;

    public EnterInfoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        context.a(getContext()).inflate(0x7f03008e, this, true);
        setFillViewport(true);
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }

    private void autoFillProfile(me.lyft.android.providers.ProfileProvider.PhoneProfile phoneprofile)
    {
        User user = userProvider.getUser();
        String s1 = user.getEmail();
        String s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            s = device.getGoogleAccountEmail();
        }
        if (!Strings.isNullOrEmpty(s))
        {
            emailEdit.setTextAndMoveCursor(s);
        }
        s1 = user.getLastName();
        s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            s = phoneprofile.getLastName();
        }
        if (!Strings.isNullOrEmpty(s))
        {
            lastNameEdit.setTextAndMoveCursor(s);
        }
        s1 = user.getFirstName();
        s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            s = phoneprofile.getFirstName();
        }
        if (!Strings.isNullOrEmpty(s))
        {
            firstNameEdit.setTextAndMoveCursor(s);
        }
    }

    private void initEditText(AdvancedEditText advancededittext, final TextView textView)
    {
        advancededittext.setValidationMessageView(textView);
        advancededittext.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final EnterInfoView this$0;
            final TextView val$textView;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                textView.setVisibility(4);
                return false;
            }

            
            {
                this$0 = EnterInfoView.this;
                textView = textview;
                super();
            }
        });
    }

    public Observable observeSubmitProfile()
    {
        return submitProfileInfoSubject.asObservable();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            binder = Binder.attach(this);
            initEditText(firstNameEdit, errorFistNameTextView);
            initEditText(lastNameEdit, errorLastNameTextView);
            initEditText(emailEdit, errorEmailTextView);
            Keyboard.showKeyboard(firstNameEdit);
            binder.bind(profileProvider.observePhoneProfile(), new AsyncCall() {

                final EnterInfoView this$0;

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((me.lyft.android.providers.ProfileProvider.PhoneProfile)obj);
                }

                public void onSuccess(me.lyft.android.providers.ProfileProvider.PhoneProfile phoneprofile)
                {
                    autoFillProfile(phoneprofile);
                }

            
            {
                this$0 = EnterInfoView.this;
                super();
            }
            });
            nextButton.setOnClickListener(new android.view.View.OnClickListener() {

                final EnterInfoView this$0;

                public void onClick(View view)
                {
                    submitProfileInfo();
                }

            
            {
                this$0 = EnterInfoView.this;
                super();
            }
            });
            emailEdit.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

                final EnterInfoView this$0;

                public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
                {
                    if (i == 6)
                    {
                        submitProfileInfo();
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = EnterInfoView.this;
                super();
            }
            });
            return;
        }
    }

    public void submitProfileInfo()
    {
        final ActionAnalytics analytics = OnBoardingAnalytics.trackAddProfileInfo();
        final SignupUser signupUser = SignupUser.create(firstNameEdit.getText().toString(), lastNameEdit.getText().toString(), emailEdit.getText().toString(), tosCheckBox.isChecked());
        progressController.showProgress();
        binder.bind(landingService.updateExistingUser(signupUser), new AsyncCall() {

            final EnterInfoView this$0;
            final ActionAnalytics val$analytics;
            final SignupUser val$signupUser;

            public void onFail(Throwable throwable)
            {
label0:
                {
                    super.onFail(throwable);
                    analytics.trackFailure(throwable);
                    if (throwable instanceof LandingValidationException)
                    {
                        throwable = ((LandingValidationException)throwable).getFields().iterator();
                        do
                        {
                            if (!throwable.hasNext())
                            {
                                break;
                            }
                            InvalidField invalidfield = (InvalidField)throwable.next();
                            if (invalidfield.getName().equals("first_name"))
                            {
                                firstNameEdit.setValidationErrorId(Integer.valueOf(0x7f0701a9));
                                firstNameEdit.showValidationMessage();
                            }
                            if (invalidfield.getName().equals("last_name"))
                            {
                                lastNameEdit.setValidationErrorId(Integer.valueOf(0x7f0701aa));
                                lastNameEdit.showValidationMessage();
                            }
                            if (invalidfield.getName().equals("email"))
                            {
                                emailEdit.setValidationErrorId(Integer.valueOf(0x7f0701a7));
                                emailEdit.showValidationMessage();
                            }
                        } while (true);
                    } else
                    {
                        if (!(throwable instanceof TermsNotAcceptedException))
                        {
                            break label0;
                        }
                        tosCheckBox.showTermsOfServiceError(true);
                    }
                    return;
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
                submitProfileInfoSubject.onNext(signupUser);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = EnterInfoView.this;
                analytics = actionanalytics;
                signupUser = signupuser;
                super();
            }
        });
    }

}
